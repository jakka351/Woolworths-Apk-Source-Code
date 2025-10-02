package io.grpc.stub;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.AbstractFuture;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class ClientCalls {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f24159a;
    public static final CallOptions.Key b;

    public static final class BlockingResponseStream<T> implements Iterator<T> {

        public final class QueuingListener extends StartableListener<T> {
            @Override // io.grpc.ClientCall.Listener
            public final void a(Status status, Metadata metadata) {
                throw null;
            }

            @Override // io.grpc.ClientCall.Listener
            public final void b(Metadata metadata) {
            }

            @Override // io.grpc.ClientCall.Listener
            public final void c(Object obj) {
                throw null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class CallToStreamObserverAdapter<ReqT> extends ClientCallStreamObserver<ReqT> {
    }

    public static final class GrpcFuture<RespT> extends AbstractFuture<RespT> {
        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void i() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String k() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(null, "clientCall");
            return toStringHelperB.toString();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final boolean m(Object obj) {
            throw null;
        }
    }

    public static abstract class StartableListener<T> extends ClientCall.Listener<T> {
    }

    public static final class StreamObserverToCallListenerAdapter<ReqT, RespT> extends StartableListener<RespT> {
        @Override // io.grpc.ClientCall.Listener
        public final void a(Status status, Metadata metadata) {
            if (status.f()) {
                throw null;
            }
            new StatusRuntimeException(metadata, status, true);
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        public final void b(Metadata metadata) {
        }

        @Override // io.grpc.ClientCall.Listener
        public final void c(Object obj) {
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        public final void d() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StubType {
        public static final StubType d;
        public static final /* synthetic */ StubType[] e;

        /* JADX INFO: Fake field, exist only in values array */
        StubType EF0;

        static {
            StubType stubType = new StubType("BLOCKING", 0);
            StubType stubType2 = new StubType("FUTURE", 1);
            StubType stubType3 = new StubType("ASYNC", 2);
            d = stubType3;
            e = new StubType[]{stubType, stubType2, stubType3};
        }

        public static StubType valueOf(String str) {
            return (StubType) Enum.valueOf(StubType.class, str);
        }

        public static StubType[] values() {
            return (StubType[]) e.clone();
        }
    }

    public static final class ThreadlessExecutor extends ConcurrentLinkedQueue<Runnable> implements Executor {
        public static final Object d;

        static {
            Logger.getLogger(ThreadlessExecutor.class.getName());
            d = new Object();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            add(runnable);
            if (d != null) {
                LockSupport.unpark(null);
            } else if (remove(runnable) && ClientCalls.f24159a) {
                throw new RejectedExecutionException();
            }
        }
    }

    public static final class UnaryStreamToFuture<RespT> extends StartableListener<RespT> {
        @Override // io.grpc.ClientCall.Listener
        public final void a(Status status, Metadata metadata) {
            if (status.f()) {
                throw null;
            }
            new StatusRuntimeException(metadata, status, true);
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        public final void b(Metadata metadata) {
        }

        @Override // io.grpc.ClientCall.Listener
        public final void c(Object obj) {
            throw Status.m.i("More than one value received for unary call").a();
        }
    }

    static {
        Logger.getLogger(ClientCalls.class.getName());
        f24159a = !Strings.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        b = new CallOptions.Key("internal-stub-type");
    }
}
