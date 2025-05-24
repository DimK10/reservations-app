package com.uniwa.client;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

import java.io.PrintStream;

public final class Output extends PrintStream implements Out {

    private static Output INSTANCE;

    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String YELLOW = "\\033[33m";
    private static final String BLUE = "\033[34m";
    private static final String DEFAULT = "\033[0m";

    public static Output getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Output();
        }

        return INSTANCE;
    }

    private Output() {
        super(System.out);

        boolean isEnvWindows = enableAnsiWindows();

        if (!isEnvWindows) {
            // todo add implementation for *nix systems
        }

        clearScreen();
    }

    public interface Kernel32 extends Library {
        Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);
        long GetStdHandle(int nStdHandle);
        boolean GetConsoleMode(long hConsoleHandle, int[] lpMode);
        boolean SetConsoleMode(long hConsoleHandle, int dwMode);
    }

    private static boolean enableAnsiWindows() {
        if (!Platform.isWindows()) return false;

        Kernel32 k32 = Kernel32.INSTANCE;
        long hOut = k32.GetStdHandle(-11); // STD_OUTPUT_HANDLE
        int[] mode = new int[1];

        if (!k32.GetConsoleMode(hOut, mode)) return false;

        int ENABLE_VIRTUAL_TERMINAL_PROCESSING = 0x0004;
        return k32.SetConsoleMode(hOut, mode[0] | ENABLE_VIRTUAL_TERMINAL_PROCESSING);
    }

    @Override
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void writeRedText(String output) {
        this.println(RED + output + DEFAULT);
    }

    @Override
    public void writeGreenText(String output) {
        this.println(GREEN + output + DEFAULT);
    }

    @Override
    public void writeYellowText(String output) {
        this.println(YELLOW + output + DEFAULT);
    }

    @Override
    public void writeBlueText(String output) {
        this.println(BLUE + output + DEFAULT);
    }

    @Override
    public void writeNormalText(String output) {
        this.println(DEFAULT + output + DEFAULT);
    }
}
