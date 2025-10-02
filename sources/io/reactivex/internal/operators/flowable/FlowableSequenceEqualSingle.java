package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqual;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class FlowableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable, FlowableSequenceEqual.EqualCoordinatorHelper {
        public final SingleObserver d;
        public final FlowableSequenceEqual.EqualSubscriber e = new FlowableSequenceEqual.EqualSubscriber(this);
        public final FlowableSequenceEqual.EqualSubscriber f = new FlowableSequenceEqual.EqualSubscriber(this);
        public final AtomicThrowable g = new AtomicThrowable();
        public Object h;
        public Object i;

        public EqualCoordinator(SingleObserver singleObserver) {
            this.d = singleObserver;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void a(Throwable th) {
            AtomicThrowable atomicThrowable = this.g;
            atomicThrowable.getClass();
            if (ExceptionHelper.a(atomicThrowable, th)) {
                c();
            } else {
                RxJavaPlugins.b(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e.get() == SubscriptionHelper.d;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue simpleQueue = this.e.e;
                SimpleQueue simpleQueue2 = this.f.e;
                if (simpleQueue == null || simpleQueue2 == null) {
                    if (b()) {
                        this.e.a();
                        this.f.a();
                        return;
                    } else if (this.g.get() != null) {
                        d();
                        SingleObserver singleObserver = this.d;
                        AtomicThrowable atomicThrowable = this.g;
                        atomicThrowable.getClass();
                        singleObserver.onError(ExceptionHelper.b(atomicThrowable));
                        return;
                    }
                } else {
                    if (b()) {
                        this.e.a();
                        this.f.a();
                        return;
                    }
                    if (this.g.get() != null) {
                        d();
                        SingleObserver singleObserver2 = this.d;
                        AtomicThrowable atomicThrowable2 = this.g;
                        atomicThrowable2.getClass();
                        singleObserver2.onError(ExceptionHelper.b(atomicThrowable2));
                        return;
                    }
                    boolean z = this.e.f;
                    Object objPoll = this.h;
                    if (objPoll == null) {
                        try {
                            objPoll = simpleQueue.poll();
                            this.h = objPoll;
                        } catch (Throwable th) {
                            Exceptions.b(th);
                            d();
                            AtomicThrowable atomicThrowable3 = this.g;
                            atomicThrowable3.getClass();
                            ExceptionHelper.a(atomicThrowable3, th);
                            SingleObserver singleObserver3 = this.d;
                            AtomicThrowable atomicThrowable4 = this.g;
                            atomicThrowable4.getClass();
                            singleObserver3.onError(ExceptionHelper.b(atomicThrowable4));
                            return;
                        }
                    }
                    boolean z2 = objPoll == null;
                    boolean z3 = this.f.f;
                    Object objPoll2 = this.i;
                    if (objPoll2 == null) {
                        try {
                            objPoll2 = simpleQueue2.poll();
                            this.i = objPoll2;
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            d();
                            AtomicThrowable atomicThrowable5 = this.g;
                            atomicThrowable5.getClass();
                            ExceptionHelper.a(atomicThrowable5, th2);
                            SingleObserver singleObserver4 = this.d;
                            AtomicThrowable atomicThrowable6 = this.g;
                            atomicThrowable6.getClass();
                            singleObserver4.onError(ExceptionHelper.b(atomicThrowable6));
                            return;
                        }
                    }
                    boolean z4 = objPoll2 == null;
                    if (z && z3 && z2 && z4) {
                        this.d.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z && z3 && z2 != z4) {
                        d();
                        this.d.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (!z2 && !z4) {
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            Exceptions.b(th3);
                            d();
                            AtomicThrowable atomicThrowable7 = this.g;
                            atomicThrowable7.getClass();
                            ExceptionHelper.a(atomicThrowable7, th3);
                            SingleObserver singleObserver5 = this.d;
                            AtomicThrowable atomicThrowable8 = this.g;
                            atomicThrowable8.getClass();
                            singleObserver5.onError(ExceptionHelper.b(atomicThrowable8));
                            return;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final void d() {
            FlowableSequenceEqual.EqualSubscriber equalSubscriber = this.e;
            equalSubscriber.getClass();
            SubscriptionHelper.a(equalSubscriber);
            equalSubscriber.a();
            FlowableSequenceEqual.EqualSubscriber equalSubscriber2 = this.f;
            equalSubscriber2.getClass();
            SubscriptionHelper.a(equalSubscriber2);
            equalSubscriber2.a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            FlowableSequenceEqual.EqualSubscriber equalSubscriber = this.e;
            equalSubscriber.getClass();
            SubscriptionHelper.a(equalSubscriber);
            FlowableSequenceEqual.EqualSubscriber equalSubscriber2 = this.f;
            equalSubscriber2.getClass();
            SubscriptionHelper.a(equalSubscriber2);
            if (getAndIncrement() == 0) {
                equalSubscriber.a();
                equalSubscriber2.a();
            }
        }
    }

    @Override // io.reactivex.Single
    public final void g(SingleObserver singleObserver) {
        singleObserver.d(new EqualCoordinator(singleObserver));
        throw null;
    }
}
