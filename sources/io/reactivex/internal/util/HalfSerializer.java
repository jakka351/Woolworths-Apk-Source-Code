package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public final class HalfSerializer {
    public static void a(Observer observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            if (thB != null) {
                observer.onError(thB);
            } else {
                observer.onComplete();
            }
        }
    }

    public static void b(Subscriber subscriber, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            if (thB != null) {
                subscriber.onError(thB);
            } else {
                subscriber.onComplete();
            }
        }
    }

    public static void c(Observer observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        atomicThrowable.getClass();
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            RxJavaPlugins.b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(ExceptionHelper.b(atomicThrowable));
        }
    }

    public static void d(Subscriber subscriber, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        atomicThrowable.getClass();
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            RxJavaPlugins.b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(ExceptionHelper.b(atomicThrowable));
        }
    }

    public static void e(Observer observer, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != null) {
                    observer.onError(thB);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    public static void f(Subscriber subscriber, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != null) {
                    subscriber.onError(thB);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }
}
