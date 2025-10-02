package io.grpc.internal;

import io.grpc.Decompressor;
import io.grpc.internal.ApplicationThreadDeframerListener;
import io.grpc.internal.StreamListener;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class ApplicationThreadDeframer implements Deframer {

    /* renamed from: io.grpc.internal.ApplicationThreadDeframer$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class CloseableInitializingMessageProducer extends InitializingMessageProducer implements Closeable {
        public final Closeable g;

        public CloseableInitializingMessageProducer(ApplicationThreadDeframer applicationThreadDeframer, Runnable runnable, Closeable closeable) {
            super(runnable);
            this.g = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.g.close();
        }
    }

    public class InitializingMessageProducer implements StreamListener.MessageProducer {
        public final Runnable d;
        public boolean e = false;

        public InitializingMessageProducer(Runnable runnable) {
            this.d = runnable;
        }

        @Override // io.grpc.internal.StreamListener.MessageProducer
        public final InputStream next() {
            if (!this.e) {
                this.d.run();
                this.e = true;
            }
            throw null;
        }
    }

    public interface TransportExecutor extends ApplicationThreadDeframerListener.TransportExecutor {
    }

    @Override // io.grpc.internal.Deframer
    public final void b(final int i) {
        new InitializingMessageProducer(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.1
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        });
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
    public final void e(final ReadableBuffer readableBuffer) {
        new CloseableInitializingMessageProducer(this, new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.2
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }, new Closeable() { // from class: io.grpc.internal.ApplicationThreadDeframer.3
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                readableBuffer.close();
            }
        });
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    public final void f() {
        new InitializingMessageProducer(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.4
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        });
        throw null;
    }
}
