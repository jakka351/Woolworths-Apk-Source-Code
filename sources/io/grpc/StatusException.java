package io.grpc;

/* loaded from: classes7.dex */
public class StatusException extends Exception {
    public final Status d;
    public final boolean e;

    public StatusException(Status status) {
        super(Status.c(status), status.c);
        this.d = status;
        this.e = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.e ? super.fillInStackTrace() : this;
    }
}
