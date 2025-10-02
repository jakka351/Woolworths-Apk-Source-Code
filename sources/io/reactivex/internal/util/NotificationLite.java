package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NotificationLite {
    public static final NotificationLite d;
    public static final /* synthetic */ NotificationLite[] e;

    /* loaded from: classes7.dex */
    public static final class DisposableNotification implements Serializable {
        public final Disposable d;

        public DisposableNotification(Disposable disposable) {
            this.d = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.d + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        public final Throwable d;

        public ErrorNotification(Throwable th) {
            this.d = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.a(this.d, ((ErrorNotification) obj).d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.d + "]";
        }
    }

    /* loaded from: classes7.dex */
    public static final class SubscriptionNotification implements Serializable {
        public final Subscription d;

        public SubscriptionNotification(Subscription subscription) {
            this.d = subscription;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.d + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        d = notificationLite;
        e = new NotificationLite[]{notificationLite};
    }

    public static boolean a(Observer observer, Object obj) {
        if (obj == d) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).d);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static boolean b(Object obj, Subscriber subscriber) {
        if (obj == d) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            subscriber.onError(((ErrorNotification) obj).d);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static boolean c(Observer observer, Object obj) {
        if (obj == d) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).d);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.d(((DisposableNotification) obj).d);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    public static Object d(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object e(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Throwable f(Object obj) {
        return ((ErrorNotification) obj).d;
    }

    public static boolean l(Object obj) {
        return obj == d;
    }

    public static boolean m(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static Object n(Subscription subscription) {
        return new SubscriptionNotification(subscription);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
