package io.grpc.okhttp;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.common.base.Preconditions;
import io.grpc.internal.SerializingExecutor;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.FrameWriter;
import io.grpc.okhttp.internal.framed.Settings;
import io.perfmark.PerfMark;
import io.perfmark.TaskCloseable;
import java.io.IOException;
import java.net.Socket;
import okio.AsyncTimeout$sink$1;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* loaded from: classes7.dex */
final class AsyncSink implements Sink {
    public final SerializingExecutor f;
    public final OkHttpClientTransport g;
    public final int h;
    public AsyncTimeout$sink$1 l;
    public Socket m;
    public boolean n;
    public int o;
    public int p;
    public final Object d = new Object();
    public final Buffer e = new Buffer();
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    public class LimitControlFramesWriter extends ForwardingFrameWriter {
        public LimitControlFramesWriter(FrameWriter frameWriter) {
            super(frameWriter);
        }

        @Override // io.grpc.okhttp.ForwardingFrameWriter, io.grpc.okhttp.internal.framed.FrameWriter
        public final void J(int i, int i2, boolean z) {
            if (z) {
                AsyncSink.this.o++;
            }
            super.J(i, i2, z);
        }

        @Override // io.grpc.okhttp.ForwardingFrameWriter, io.grpc.okhttp.internal.framed.FrameWriter
        public final void M(int i, ErrorCode errorCode) {
            AsyncSink.this.o++;
            super.M(i, errorCode);
        }

        @Override // io.grpc.okhttp.ForwardingFrameWriter, io.grpc.okhttp.internal.framed.FrameWriter
        public final void u1(Settings settings) {
            AsyncSink.this.o++;
            super.u1(settings);
        }
    }

    public abstract class WriteRunnable implements Runnable {
        public WriteRunnable() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            AsyncSink asyncSink = AsyncSink.this;
            try {
                if (asyncSink.l == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e) {
                asyncSink.g.p(e);
            }
        }
    }

    public AsyncSink(SerializingExecutor serializingExecutor, OkHttpClientTransport okHttpClientTransport) {
        Preconditions.j(serializingExecutor, "executor");
        this.f = serializingExecutor;
        this.g = okHttpClientTransport;
        this.h = ModuleDescriptor.MODULE_VERSION;
    }

    public final void a(AsyncTimeout$sink$1 asyncTimeout$sink$1, Socket socket) {
        Preconditions.q("AsyncSink's becomeConnected should only be called once.", this.l == null);
        this.l = asyncTimeout$sink$1;
        this.m = socket;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f.execute(new Runnable() { // from class: io.grpc.okhttp.AsyncSink.3
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                AsyncSink asyncSink = AsyncSink.this;
                OkHttpClientTransport okHttpClientTransport = asyncSink.g;
                try {
                    AsyncTimeout$sink$1 asyncTimeout$sink$1 = asyncSink.l;
                    if (asyncTimeout$sink$1 != null) {
                        Buffer buffer = asyncSink.e;
                        long j = buffer.e;
                        if (j > 0) {
                            asyncTimeout$sink$1.w1(buffer, j);
                        }
                    }
                } catch (IOException e) {
                    okHttpClientTransport.p(e);
                }
                try {
                    AsyncTimeout$sink$1 asyncTimeout$sink$12 = asyncSink.l;
                    if (asyncTimeout$sink$12 != null) {
                        asyncTimeout$sink$12.close();
                    }
                } catch (IOException e2) {
                    okHttpClientTransport.p(e2);
                }
                try {
                    Socket socket = asyncSink.m;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException e3) {
                    okHttpClientTransport.p(e3);
                }
            }
        });
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            synchronized (this.d) {
                if (this.j) {
                    taskCloseable.close();
                    return;
                }
                this.j = true;
                this.f.execute(new WriteRunnable() { // from class: io.grpc.okhttp.AsyncSink.2
                    {
                        PerfMark.d();
                    }

                    @Override // io.grpc.okhttp.AsyncSink.WriteRunnable
                    public final void a() {
                        AsyncSink asyncSink;
                        Buffer buffer = new Buffer();
                        PerfMark.e();
                        TaskCloseable taskCloseable2 = TaskCloseable.d;
                        try {
                            PerfMark.c();
                            synchronized (AsyncSink.this.d) {
                                Buffer buffer2 = AsyncSink.this.e;
                                buffer.w1(buffer2, buffer2.e);
                                asyncSink = AsyncSink.this;
                                asyncSink.j = false;
                            }
                            asyncSink.l.w1(buffer, buffer.e);
                            AsyncSink.this.l.flush();
                            taskCloseable2.close();
                        } catch (Throwable th) {
                            try {
                                taskCloseable2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
                taskCloseable.close();
            }
        } catch (Throwable th) {
            try {
                taskCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // okio.Sink
    /* renamed from: n */
    public final Timeout getE() {
        return Timeout.e;
    }

    @Override // okio.Sink
    public final void w1(Buffer buffer, long j) throws IOException {
        Preconditions.j(buffer, "source");
        if (this.k) {
            throw new IOException("closed");
        }
        PerfMark.e();
        TaskCloseable taskCloseable = TaskCloseable.d;
        try {
            synchronized (this.d) {
                try {
                    this.e.w1(buffer, j);
                    int i = this.p + this.o;
                    this.p = i;
                    boolean z = false;
                    this.o = 0;
                    if (this.n || i <= this.h) {
                        if (!this.i && !this.j && this.e.c() > 0) {
                            this.i = true;
                        }
                        taskCloseable.close();
                        return;
                    }
                    this.n = true;
                    z = true;
                    if (!z) {
                        this.f.execute(new WriteRunnable() { // from class: io.grpc.okhttp.AsyncSink.1
                            {
                                PerfMark.d();
                            }

                            @Override // io.grpc.okhttp.AsyncSink.WriteRunnable
                            public final void a() {
                                AsyncSink asyncSink;
                                int i2;
                                Buffer buffer2 = new Buffer();
                                PerfMark.e();
                                TaskCloseable taskCloseable2 = TaskCloseable.d;
                                try {
                                    PerfMark.c();
                                    synchronized (AsyncSink.this.d) {
                                        Buffer buffer3 = AsyncSink.this.e;
                                        buffer2.w1(buffer3, buffer3.c());
                                        asyncSink = AsyncSink.this;
                                        asyncSink.i = false;
                                        i2 = asyncSink.p;
                                    }
                                    asyncSink.l.w1(buffer2, buffer2.e);
                                    synchronized (AsyncSink.this.d) {
                                        AsyncSink.this.p -= i2;
                                    }
                                    taskCloseable2.close();
                                } catch (Throwable th) {
                                    try {
                                        taskCloseable2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        });
                        taskCloseable.close();
                    } else {
                        try {
                            this.m.close();
                        } catch (IOException e) {
                            this.g.p(e);
                        }
                        taskCloseable.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                taskCloseable.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
