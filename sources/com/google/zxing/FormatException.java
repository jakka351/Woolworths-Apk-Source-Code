package com.google.zxing;

/* loaded from: classes6.dex */
public final class FormatException extends ReaderException {
    public static final FormatException f;

    static {
        FormatException formatException = new FormatException();
        f = formatException;
        formatException.setStackTrace(ReaderException.e);
    }

    public static FormatException a() {
        return ReaderException.d ? new FormatException() : f;
    }
}
