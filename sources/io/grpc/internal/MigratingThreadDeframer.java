package io.grpc.internal;

import io.grpc.Decompressor;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes7.dex */
final class MigratingThreadDeframer implements ThreadOptimizedDeframer {

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1CloseOp, reason: invalid class name */
    class C1CloseOp implements Op {
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1CloseWhenCompleteOp, reason: invalid class name */
    class C1CloseWhenCompleteOp implements Op {
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1DeframeOp, reason: invalid class name */
    class C1DeframeOp implements Op, Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1RequestAgainOp, reason: invalid class name */
    class C1RequestAgainOp implements Op {
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1RequestOp, reason: invalid class name */
    class C1RequestOp implements Op {

        /* renamed from: io.grpc.internal.MigratingThreadDeframer$1RequestOp$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
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
    }

    public class DeframeMessageProducer implements StreamListener.MessageProducer, Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // io.grpc.internal.StreamListener.MessageProducer
        public final InputStream next() {
            throw null;
        }
    }

    public static class MigratingDeframerListener extends ForwardingDeframerListener {
        @Override // io.grpc.internal.ForwardingDeframerListener
        public final MessageDeframer.Listener d() {
            throw null;
        }
    }

    public interface Op {
    }

    @Override // io.grpc.internal.Deframer
    public final void b(int i) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    public final void c(int i) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    public final void close() {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    public final void d(Decompressor decompressor) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    public final void e(ReadableBuffer readableBuffer) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    public final void f() {
        throw null;
    }
}
