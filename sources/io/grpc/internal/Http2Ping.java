package io.grpc.internal;

import com.google.common.base.Stopwatch;
import io.grpc.StatusException;
import io.grpc.internal.ClientTransport;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public class Http2Ping {
    public static final Logger g = Logger.getLogger(Http2Ping.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final long f24020a;
    public final Stopwatch b;
    public LinkedHashMap c = new LinkedHashMap();
    public boolean d;
    public StatusException e;
    public long f;

    /* renamed from: io.grpc.internal.Http2Ping$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ClientTransport.PingCallback d;

        public AnonymousClass1(ClientTransport.PingCallback pingCallback, long j) {
            this.d = pingCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.getClass();
        }
    }

    /* renamed from: io.grpc.internal.Http2Ping$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ClientTransport.PingCallback d;

        public AnonymousClass2(ClientTransport.PingCallback pingCallback, StatusException statusException) {
            this.d = pingCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.c();
        }
    }

    public Http2Ping(long j, Stopwatch stopwatch) {
        this.f24020a = j;
        this.b = stopwatch;
    }

    public static void c(ClientTransport.PingCallback pingCallback, Executor executor, StatusException statusException) {
        try {
            executor.execute(new AnonymousClass2(pingCallback, statusException));
        } catch (Throwable th) {
            g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public final void a(ClientTransport.PingCallback pingCallback, Executor executor) {
        synchronized (this) {
            try {
                if (!this.d) {
                    this.c.put(pingCallback, executor);
                    return;
                }
                StatusException statusException = this.e;
                Runnable anonymousClass2 = statusException != null ? new AnonymousClass2(pingCallback, statusException) : new AnonymousClass1(pingCallback, this.f);
                try {
                    executor.execute(anonymousClass2);
                } catch (Throwable th) {
                    g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                Stopwatch stopwatch = this.b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = stopwatch.a();
                this.f = jA;
                LinkedHashMap linkedHashMap = this.c;
                this.c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new AnonymousClass1((ClientTransport.PingCallback) entry.getKey(), jA));
                    } catch (Throwable th) {
                        g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
