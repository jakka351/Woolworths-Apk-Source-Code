package com.google.zxing;

/* loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {
    public static final NotFoundException f;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f = notFoundException;
        notFoundException.setStackTrace(ReaderException.e);
    }
}
