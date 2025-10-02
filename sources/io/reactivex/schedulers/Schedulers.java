package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Schedulers {

    /* renamed from: a, reason: collision with root package name */
    public static final Scheduler f24242a = RxJavaPlugins.a(new SingleTask());
    public static final Scheduler b = RxJavaPlugins.a(new ComputationTask());
    public static final Scheduler c = RxJavaPlugins.a(new IOTask());
    public static final TrampolineScheduler d = TrampolineScheduler.f;

    public static final class ComputationHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final ComputationScheduler f24243a = new ComputationScheduler();
    }

    public static final class ComputationTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return ComputationHolder.f24243a;
        }
    }

    public static final class IOTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return IoHolder.f24244a;
        }
    }

    public static final class IoHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final IoScheduler f24244a = new IoScheduler();
    }

    public static final class NewThreadHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final NewThreadScheduler f24245a = new NewThreadScheduler();
    }

    public static final class NewThreadTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return NewThreadHolder.f24245a;
        }
    }

    public static final class SingleHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final SingleScheduler f24246a = new SingleScheduler();
    }

    public static final class SingleTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() {
            return SingleHolder.f24246a;
        }
    }

    static {
        RxJavaPlugins.a(new NewThreadTask());
    }
}
