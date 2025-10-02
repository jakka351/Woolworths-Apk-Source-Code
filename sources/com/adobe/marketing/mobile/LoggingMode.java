package com.adobe.marketing.mobile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LoggingMode {
    public static final LoggingMode d;
    public static final LoggingMode e;
    public static final /* synthetic */ LoggingMode[] f;

    static {
        LoggingMode loggingMode = new LoggingMode("ERROR", 0);
        d = loggingMode;
        LoggingMode loggingMode2 = new LoggingMode("WARNING", 1);
        LoggingMode loggingMode3 = new LoggingMode("DEBUG", 2);
        e = loggingMode3;
        f = new LoggingMode[]{loggingMode, loggingMode2, loggingMode3, new LoggingMode("VERBOSE", 3)};
    }

    public static LoggingMode valueOf(String str) {
        return (LoggingMode) Enum.valueOf(LoggingMode.class, str);
    }

    public static LoggingMode[] values() {
        return (LoggingMode[]) f.clone();
    }
}
