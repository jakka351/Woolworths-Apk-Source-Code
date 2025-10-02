package io.reactivex.exceptions;

/* loaded from: classes7.dex */
public final class ProtocolViolationException extends IllegalStateException {
    public ProtocolViolationException() {
        super("Disposable already set!");
    }
}
