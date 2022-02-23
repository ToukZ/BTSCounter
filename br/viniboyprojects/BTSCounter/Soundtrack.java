package br.viniboyprojects.BTSCounter;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;

public class Soundtrack {

	private static int currentTrack;
	private static File soundFile;
	private static Line line;
	private static Line.Info info;
	private static Clip clip;
	private static int level;
	private static boolean paused;
	private static boolean repeat;

	public Soundtrack() {
		try {
			Soundtrack.level = -7;
			Soundtrack.soundFile = new File("src/music/musicbts1.wav");
			Soundtrack.currentTrack = 1;
			Soundtrack.info = new Line.Info(Clip.class);
			Soundtrack.line = AudioSystem.getLine(Soundtrack.info);
			Soundtrack.clip = (Clip) line;
			Soundtrack.clip.open(AudioSystem.getAudioInputStream(Soundtrack.soundFile));
			Soundtrack.clip.loop(0);
			Soundtrack.paused = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean getRepeat() {
		return Soundtrack.repeat;
	}

	public static void setRepeat(boolean repeat) {
		Soundtrack.repeat = repeat;
	}

	public static int getCurrentTrack() {
		return Soundtrack.currentTrack;
	}

	public static void setCurrentTrack(int i) {
		Soundtrack.currentTrack = i;
	}

	public static void changeTrack(String track, int i) {
		try {
			Soundtrack.play();
			Soundtrack.clip.stop();
			Soundtrack.clip.close();
			Soundtrack.soundFile = new File("src/music/" + track + ".wav");
			Soundtrack.setCurrentTrack(i);
			Soundtrack.line = AudioSystem.getLine(Soundtrack.info);
			Soundtrack.info = new Line.Info(Clip.class);
			Soundtrack.clip = (Clip) line;
			Soundtrack.clip.open(AudioSystem.getAudioInputStream(Soundtrack.soundFile));
			Soundtrack.clip.loop(0);
			Soundtrack.setLevel('=');

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void stop() {
		Soundtrack.clip.stop();
		Soundtrack.clip.close();
	}

	public static void pause() {
		if (!Soundtrack.paused) {
			Soundtrack.clip.stop();
			Soundtrack.paused = true;
		} else {
			Soundtrack.play();
		}
	}

	public static void play() {
		if (!Soundtrack.clip.isOpen()) {
			try {
				Soundtrack.clip.open(AudioSystem.getAudioInputStream(Soundtrack.soundFile));
				Soundtrack.clip.loop(0);
				Soundtrack.paused = false;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (!Soundtrack.clip.isRunning() && Soundtrack.paused) {
			Soundtrack.clip.start();
			Soundtrack.paused = false;
		}
	}

	public static void altern() {
		if (Soundtrack.clip.isRunning() && Soundtrack.clip.isOpen())
			Soundtrack.stop();
		else
			Soundtrack.play();
	}

	public static void setLevel(char c) {
		FloatControl level = (FloatControl) Soundtrack.clip.getControl(FloatControl.Type.MASTER_GAIN);
		int volume;
		if (c == '+' && Soundtrack.level < level.getMaximum() - 7) {
			volume = 7;
		} else if (c == '-' && Soundtrack.level > level.getMinimum() + 7) {
			volume = -7;
		} else {
			volume = 0;
		}
		Soundtrack.level += volume;
		float def = Soundtrack.level;
		level.setValue(def);
	}

	public static boolean isPlaying() {
		if (paused || clip.isRunning()) {
			return true;
		} else {
			return false;
		}
	}
}