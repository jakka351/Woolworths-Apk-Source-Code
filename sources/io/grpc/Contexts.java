package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class Contexts {

    public static class ContextualizedServerCallListener<ReqT> extends ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT> {
    }

    public static Status a(Context context) {
        Preconditions.j(context, "context must not be null");
        if (!context.g()) {
            return null;
        }
        Throwable thC = context.c();
        if (thC == null) {
            return Status.f.i("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return Status.h.i(thC.getMessage()).h(thC);
        }
        Status statusE = Status.e(thC);
        return (Status.Code.UNKNOWN.equals(statusE.f23971a) && statusE.c == thC) ? Status.f.i("Context cancelled").h(thC) : statusE.h(thC);
    }
}
