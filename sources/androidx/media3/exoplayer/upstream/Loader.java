package androidx.media3.exoplayer.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.e;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import java.io.IOException;
import java.util.concurrent.Executors;

@UnstableApi
/* loaded from: classes2.dex */
public final class Loader implements LoaderErrorThrower {
    public static final LoadErrorAction d = new LoadErrorAction(2, -9223372036854775807L);
    public static final LoadErrorAction e = new LoadErrorAction(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    public final ReleasableExecutor f3182a;
    public LoadTask b;
    public IOException c;

    public interface Callback<T extends Loadable> {
        LoadErrorAction a(Loadable loadable, long j, long j2, IOException iOException, int i);

        default void g(Loadable loadable, long j, long j2, int i) {
        }

        void m(Loadable loadable, long j, long j2, boolean z);

        void t(Loadable loadable, long j, long j2);
    }

    public static final class LoadErrorAction {

        /* renamed from: a, reason: collision with root package name */
        public final int f3183a;
        public final long b;

        public LoadErrorAction(int i, long j) {
            this.f3183a = i;
            this.b = j;
        }
    }

    @SuppressLint
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        public final int d;
        public final Loadable e;
        public final long f;
        public Object g;
        public IOException h;
        public int i;
        public Thread j;
        public boolean k;
        public volatile boolean l;

        public LoadTask(Looper looper, Loadable loadable, Callback callback, int i, long j) {
            super(looper);
            this.e = loadable;
            this.g = callback;
            this.d = i;
            this.f = j;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        public final void a(boolean z) {
            this.l = z;
            this.h = null;
            if (hasMessages(1)) {
                this.k = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.k = true;
                        this.e.b();
                        Thread thread = this.j;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                Loader.this.b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ?? r1 = this.g;
                r1.getClass();
                r1.m(this.e, jElapsedRealtime, jElapsedRealtime - this.f, true);
                this.g = null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f;
            ?? r0 = this.g;
            r0.getClass();
            r0.g(this.e, jElapsedRealtime, j, this.i);
            this.h = null;
            Loader loader = Loader.this;
            ReleasableExecutor releasableExecutor = loader.f3182a;
            LoadTask loadTask = loader.b;
            loadTask.getClass();
            releasableExecutor.execute(loadTask);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.media3.exoplayer.upstream.Loader$Callback, java.lang.Object] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.l) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            Loader.this.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f;
            ?? r3 = this.g;
            r3.getClass();
            if (this.k) {
                r3.m(this.e, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    r3.t(this.e, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    Log.d("LoadTask", "Unexpected exception handling load completed", e);
                    Loader.this.c = new UnexpectedLoaderException(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.h = iOException;
            int i3 = this.i + 1;
            this.i = i3;
            LoadErrorAction loadErrorActionA = r3.a(this.e, jElapsedRealtime, j, iOException, i3);
            int i4 = loadErrorActionA.f3183a;
            if (i4 == 3) {
                Loader.this.c = this.h;
                return;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    this.i = 1;
                }
                long jMin = loadErrorActionA.b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.i - 1) * 1000, 5000);
                }
                Loader loader = Loader.this;
                Assertions.f(loader.b == null);
                loader.b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.k;
                    this.j = Thread.currentThread();
                }
                if (!z) {
                    Trace.beginSection("load:".concat(this.e.getClass().getSimpleName()));
                    try {
                        this.e.a();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.j = null;
                    Thread.interrupted();
                }
                if (this.l) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.l) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.l) {
                    return;
                }
                Log.d("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new UnexpectedLoaderException(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.l) {
                    return;
                }
                Log.d("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.l) {
                    Log.d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    public interface Loadable {
        void a();

        void b();
    }

    public interface ReleaseCallback {
        void f();
    }

    public static final class ReleaseTask implements Runnable {
        public final ReleaseCallback d;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.d = releaseCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.d.f();
        }
    }

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Loader(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = Util.f2928a;
        this(ReleasableExecutor.a1(Executors.newSingleThreadExecutor(new e(strConcat)), new c()));
    }

    public final void a() {
        LoadTask loadTask = this.b;
        Assertions.g(loadTask);
        loadTask.a(false);
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void c(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask loadTask = this.b;
        if (loadTask != null) {
            if (i == Integer.MIN_VALUE) {
                i = loadTask.d;
            }
            IOException iOException2 = loadTask.h;
            if (iOException2 != null && loadTask.i > i) {
                throw iOException2;
            }
        }
    }

    public final void d(ReleaseCallback releaseCallback) {
        LoadTask loadTask = this.b;
        if (loadTask != null) {
            loadTask.a(true);
        }
        ReleasableExecutor releasableExecutor = this.f3182a;
        if (releaseCallback != null) {
            releasableExecutor.execute(new ReleaseTask(releaseCallback));
        }
        releasableExecutor.release();
    }

    public final void e(Loadable loadable, Callback callback, int i) {
        Looper looperMyLooper = Looper.myLooper();
        Assertions.g(looperMyLooper);
        this.c = null;
        LoadTask loadTask = new LoadTask(looperMyLooper, loadable, callback, i, SystemClock.elapsedRealtime());
        Assertions.f(this.b == null);
        this.b = loadTask;
        loadTask.b();
    }

    public Loader(ReleasableExecutor releasableExecutor) {
        this.f3182a = releasableExecutor;
    }
}
