package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
public class LottieTask<T> {
    public static final ExecutorService e = Executors.newCachedThreadPool(new LottieThreadFactory());

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f13348a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile LottieResult d = null;

    public static class LottieFutureTask<T> extends FutureTask<LottieResult<T>> {
        public LottieTask d;

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    LottieTask lottieTask = this.d;
                    LottieResult<T> lottieResult = get();
                    ExecutorService executorService = LottieTask.e;
                    lottieTask.d(lottieResult);
                } catch (InterruptedException | ExecutionException e) {
                    LottieTask lottieTask2 = this.d;
                    LottieResult lottieResult2 = new LottieResult(e);
                    ExecutorService executorService2 = LottieTask.e;
                    lottieTask2.d(lottieResult2);
                }
            } finally {
                this.d = null;
            }
        }
    }

    public LottieTask(LottieComposition lottieComposition) {
        d(new LottieResult(lottieComposition));
    }

    public final synchronized void a(LottieListener lottieListener) {
        Throwable th;
        try {
            LottieResult lottieResult = this.d;
            if (lottieResult != null && (th = lottieResult.b) != null) {
                lottieListener.onResult(th);
            }
            this.b.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(LottieListener lottieListener) {
        LottieComposition lottieComposition;
        try {
            LottieResult lottieResult = this.d;
            if (lottieResult != null && (lottieComposition = lottieResult.f13347a) != null) {
                lottieListener.onResult(lottieComposition);
            }
            this.f13348a.add(lottieListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        LottieResult lottieResult = this.d;
        if (lottieResult == null) {
            return;
        }
        LottieComposition lottieComposition = lottieResult.f13347a;
        if (lottieComposition != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f13348a).iterator();
                while (it.hasNext()) {
                    ((LottieListener) it.next()).onResult(lottieComposition);
                }
            }
            return;
        }
        Throwable th = lottieResult.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                Logger.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((LottieListener) it2.next()).onResult(th);
            }
        }
    }

    public final void d(LottieResult lottieResult) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = lottieResult;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new g(this, 2));
        }
    }

    public LottieTask(Callable callable, boolean z) {
        if (z) {
            try {
                d((LottieResult) callable.call());
                return;
            } catch (Throwable th) {
                d(new LottieResult(th));
                return;
            }
        }
        ExecutorService executorService = e;
        LottieFutureTask lottieFutureTask = new LottieFutureTask(callable);
        lottieFutureTask.d = this;
        executorService.execute(lottieFutureTask);
    }
}
