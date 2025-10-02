package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.Context;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.Status;
import io.grpc.internal.StreamListener;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
final class ServerCallImpl<ReqT, RespT> extends ServerCall<ReqT, RespT> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24101a;

    @VisibleForTesting
    public static final class ServerStreamListenerImpl<ReqT> implements ServerStreamListener {

        /* renamed from: io.grpc.internal.ServerCallImpl$ServerStreamListenerImpl$1, reason: invalid class name */
        class AnonymousClass1 implements Context.CancellationListener {
            @Override // io.grpc.Context.CancellationListener
            public final void a(Context context) {
                if (context.c() != null) {
                    throw null;
                }
            }
        }

        @Override // io.grpc.internal.StreamListener
        public final void a(StreamListener.MessageProducer messageProducer) {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                throw null;
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // io.grpc.internal.StreamListener
        public final void onReady() {
            PerfMark.e();
            TaskCloseable taskCloseable = TaskCloseable.d;
            try {
                throw null;
            } catch (Throwable th) {
                try {
                    taskCloseable.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    static {
        Logger.getLogger(ServerCallImpl.class.getName());
    }

    @Override // io.grpc.ServerCall
    public final void a(Status status, Metadata metadata) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            Preconditions.q("call already closed", !this.f24101a);
            this.f24101a = true;
            if (!status.f()) {
                throw null;
            }
            throw null;
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.ServerCall
    public final Attributes b() {
        throw null;
    }

    @Override // io.grpc.ServerCall
    public final String c() {
        throw null;
    }

    @Override // io.grpc.ServerCall
    public final boolean d() {
        return false;
    }

    @Override // io.grpc.ServerCall
    public final boolean e() {
        if (this.f24101a) {
            return false;
        }
        throw null;
    }

    @Override // io.grpc.ServerCall
    public final void f(int i) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            throw null;
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.ServerCall
    public final void g(Metadata metadata) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            throw null;
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.ServerCall
    public final void h(Object obj) {
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            PerfMark.a();
            throw null;
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
