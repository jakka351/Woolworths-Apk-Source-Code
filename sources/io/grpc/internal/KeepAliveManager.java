package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.Status;
import io.grpc.internal.ClientTransport;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class KeepAliveManager {
    public static final long k = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f24035a;
    public final Stopwatch b;
    public final ClientKeepAlivePinger c;
    public State d;
    public ScheduledFuture e;
    public ScheduledFuture f;
    public final LogExceptionRunnable g;
    public final LogExceptionRunnable h;
    public final long i;
    public final long j;

    public static final class ClientKeepAlivePinger implements KeepAlivePinger {

        /* renamed from: a, reason: collision with root package name */
        public final ConnectionClientTransport f24036a;

        public ClientKeepAlivePinger(ConnectionClientTransport connectionClientTransport) {
            this.f24036a = connectionClientTransport;
        }
    }

    public interface KeepAlivePinger {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final /* synthetic */ State[] j;

        static {
            State state = new State("IDLE", 0);
            d = state;
            State state2 = new State("PING_SCHEDULED", 1);
            e = state2;
            State state3 = new State("PING_DELAYED", 2);
            f = state3;
            State state4 = new State("PING_SENT", 3);
            g = state4;
            State state5 = new State("IDLE_AND_PING_SENT", 4);
            h = state5;
            State state6 = new State("DISCONNECTED", 5);
            i = state6;
            j = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) j.clone();
        }
    }

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public KeepAliveManager(ClientKeepAlivePinger clientKeepAlivePinger, ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        Stopwatch stopwatch = new Stopwatch();
        this.d = State.d;
        this.g = new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.KeepAliveManager.1
            @Override // java.lang.Runnable
            public final void run() {
                KeepAliveManager keepAliveManager;
                boolean z;
                synchronized (KeepAliveManager.this) {
                    try {
                        keepAliveManager = KeepAliveManager.this;
                        State state = keepAliveManager.d;
                        State state2 = State.i;
                        if (state != state2) {
                            keepAliveManager.d = state2;
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    keepAliveManager.c.f24036a.f(Status.n.i("Keepalive failed. The connection is likely gone"));
                }
            }
        });
        this.h = new LogExceptionRunnable(new Runnable() { // from class: io.grpc.internal.KeepAliveManager.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                synchronized (KeepAliveManager.this) {
                    try {
                        KeepAliveManager keepAliveManager = KeepAliveManager.this;
                        keepAliveManager.f = null;
                        State state = keepAliveManager.d;
                        State state2 = State.e;
                        if (state == state2) {
                            keepAliveManager.d = State.g;
                            keepAliveManager.e = keepAliveManager.f24035a.schedule(keepAliveManager.g, keepAliveManager.j, TimeUnit.NANOSECONDS);
                            z = true;
                        } else {
                            if (state == State.f) {
                                ScheduledExecutorService scheduledExecutorService2 = keepAliveManager.f24035a;
                                LogExceptionRunnable logExceptionRunnable = keepAliveManager.h;
                                long j3 = keepAliveManager.i;
                                Stopwatch stopwatch2 = keepAliveManager.b;
                                keepAliveManager.f = scheduledExecutorService2.schedule(logExceptionRunnable, j3 - stopwatch2.a(), TimeUnit.NANOSECONDS);
                                KeepAliveManager.this.d = state2;
                            }
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    final ClientKeepAlivePinger clientKeepAlivePinger2 = KeepAliveManager.this.c;
                    clientKeepAlivePinger2.f24036a.c(new ClientTransport.PingCallback() { // from class: io.grpc.internal.KeepAliveManager.ClientKeepAlivePinger.1
                        @Override // io.grpc.internal.ClientTransport.PingCallback
                        public final void c() {
                            ClientKeepAlivePinger.this.f24036a.f(Status.n.i("Keepalive failed. The connection is likely gone"));
                        }
                    }, MoreExecutors.a());
                }
            }
        });
        this.c = clientKeepAlivePinger;
        Preconditions.j(scheduledExecutorService, "scheduler");
        this.f24035a = scheduledExecutorService;
        this.b = stopwatch;
        this.i = j;
        this.j = j2;
        stopwatch.b = 0L;
        stopwatch.f14868a = false;
        stopwatch.b();
    }

    public final synchronized void a() {
        try {
            Stopwatch stopwatch = this.b;
            stopwatch.b = 0L;
            stopwatch.f14868a = false;
            stopwatch.b();
            State state = this.d;
            State state2 = State.e;
            if (state == state2) {
                this.d = State.f;
            } else if (state == State.g || state == State.h) {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.d == State.h) {
                    this.d = State.d;
                } else {
                    this.d = state2;
                    Preconditions.q("There should be no outstanding pingFuture", this.f == null);
                    this.f = this.f24035a.schedule(this.h, this.i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            State state = this.d;
            if (state == State.d) {
                this.d = State.e;
                if (this.f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f24035a;
                    LogExceptionRunnable logExceptionRunnable = this.h;
                    long j = this.i;
                    Stopwatch stopwatch = this.b;
                    this.f = scheduledExecutorService.schedule(logExceptionRunnable, j - stopwatch.a(), TimeUnit.NANOSECONDS);
                }
            } else if (state == State.h) {
                this.d = State.g;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            State state = this.d;
            if (state == State.e || state == State.f) {
                this.d = State.d;
            }
            if (this.d == State.g) {
                this.d = State.h;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            State state = this.d;
            State state2 = State.i;
            if (state != state2) {
                this.d = state2;
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
