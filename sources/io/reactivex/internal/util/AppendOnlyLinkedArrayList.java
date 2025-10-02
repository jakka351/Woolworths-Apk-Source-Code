package io.reactivex.internal.util;

import io.reactivex.functions.Predicate;
import io.reactivex.internal.util.NotificationLite;
import org.reactivestreams.Subscriber;

/* loaded from: classes7.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f24239a;
    public Object[] b;
    public int c;

    /* loaded from: classes.dex */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.f24239a = objArr;
        this.b = objArr;
    }

    public final boolean a(Subscriber subscriber) {
        Object obj;
        Object[] objArr = this.f24239a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == NotificationLite.d) {
                    subscriber.onComplete();
                    return true;
                }
                if (obj instanceof NotificationLite.ErrorNotification) {
                    subscriber.onError(((NotificationLite.ErrorNotification) obj).d);
                    return true;
                }
                if (obj instanceof NotificationLite.SubscriptionNotification) {
                    subscriber.m(((NotificationLite.SubscriptionNotification) obj).d);
                } else {
                    subscriber.onNext(obj);
                }
            }
            objArr = objArr[4];
        }
    }

    public final void b(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }

    public final void c(NonThrowingPredicate nonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = this.f24239a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (nonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }
}
