package io.grpc;

/* loaded from: classes7.dex */
public class StatusRuntimeException extends RuntimeException {
    public final Status d;
    public final Metadata e;
    public final boolean f;

    public StatusRuntimeException(Metadata metadata, Status status, boolean z) {
        super(Status.c(status), status.c);
        this.d = status;
        this.e = metadata;
        this.f = z;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f ? super.fillInStackTrace() : this;
    }
}
