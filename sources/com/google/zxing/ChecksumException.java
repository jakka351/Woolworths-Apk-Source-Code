package com.google.zxing;

/* loaded from: classes6.dex */
public final class ChecksumException extends ReaderException {
    public static final ChecksumException f;

    static {
        ChecksumException checksumException = new ChecksumException();
        f = checksumException;
        checksumException.setStackTrace(ReaderException.e);
    }

    public static ChecksumException a() {
        return ReaderException.d ? new ChecksumException() : f;
    }
}
