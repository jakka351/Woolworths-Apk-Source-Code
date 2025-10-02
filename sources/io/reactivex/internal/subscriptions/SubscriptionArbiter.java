package io.reactivex.internal.subscriptions;

import androidx.camera.core.impl.b;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes7.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {
    public Subscription d;
    public long e;
    public final AtomicReference f = new AtomicReference();
    public final AtomicLong g = new AtomicLong();
    public final AtomicLong h = new AtomicLong();
    public final boolean i;
    public volatile boolean j;
    public boolean k;

    public SubscriptionArbiter(boolean z) {
        this.i = z;
    }

    public final void b() {
        int iAddAndGet = 1;
        long jC = 0;
        Subscription subscription = null;
        do {
            Subscription subscription2 = (Subscription) this.f.get();
            if (subscription2 != null) {
                subscription2 = (Subscription) this.f.getAndSet(null);
            }
            long andSet = this.g.get();
            if (andSet != 0) {
                andSet = this.g.getAndSet(0L);
            }
            long andSet2 = this.h.get();
            if (andSet2 != 0) {
                andSet2 = this.h.getAndSet(0L);
            }
            Subscription subscription3 = this.d;
            if (this.j) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.d = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long jC2 = this.e;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = BackpressureHelper.c(jC2, andSet);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet2;
                        if (jC2 < 0) {
                            RxJavaPlugins.b(new ProtocolViolationException(b.k(jC2, "More produced than requested: ")));
                            jC2 = 0;
                        }
                    }
                    this.e = jC2;
                }
                if (subscription2 != null) {
                    if (subscription3 != null && this.i) {
                        subscription3.cancel();
                    }
                    this.d = subscription2;
                    if (jC2 != 0) {
                        jC = BackpressureHelper.c(jC, jC2);
                        subscription = subscription2;
                    }
                } else if (subscription3 != null && andSet != 0) {
                    jC = BackpressureHelper.c(jC, andSet);
                    subscription = subscription3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            subscription.request(jC);
        }
    }

    public void cancel() {
        if (this.j) {
            return;
        }
        this.j = true;
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final void d(long j) {
        if (this.k) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.a(this.h, j);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.b(new ProtocolViolationException(b.k(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.e = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    public final void e(Subscription subscription) {
        if (this.j) {
            subscription.cancel();
            return;
        }
        ObjectHelper.b(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription subscription2 = (Subscription) this.f.getAndSet(subscription);
            if (subscription2 != null && this.i) {
                subscription2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        Subscription subscription3 = this.d;
        if (subscription3 != null && this.i) {
            subscription3.cancel();
        }
        this.d = subscription;
        long j = this.e;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j != 0) {
            subscription.request(j);
        }
    }

    public void m(Subscription subscription) {
        e(subscription);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (!SubscriptionHelper.f(j) || this.k) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.a(this.g, j);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            long jC = BackpressureHelper.c(j2, j);
            this.e = jC;
            if (jC == Long.MAX_VALUE) {
                this.k = true;
            }
        }
        Subscription subscription = this.d;
        if (decrementAndGet() != 0) {
            b();
        }
        if (subscription != null) {
            subscription.request(j);
        }
    }
}
