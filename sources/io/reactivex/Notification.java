package io.reactivex;

import androidx.camera.core.impl.b;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;

/* loaded from: classes7.dex */
public final class Notification<T> {
    public static final Notification b = new Notification(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f24218a;

    public Notification(Object obj) {
        this.f24218a = obj;
    }

    public static Notification a(Throwable th) {
        ObjectHelper.b(th, "error is null");
        return new Notification(NotificationLite.e(th));
    }

    public final Throwable b() {
        Object obj = this.f24218a;
        if (NotificationLite.m(obj)) {
            return NotificationLite.f(obj);
        }
        return null;
    }

    public final Object c() {
        Object obj = this.f24218a;
        if (obj == null || NotificationLite.m(obj)) {
            return null;
        }
        return obj;
    }

    public final boolean d() {
        Object obj = this.f24218a;
        return (obj == null || NotificationLite.m(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return ObjectHelper.a(this.f24218a, ((Notification) obj).f24218a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24218a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f24218a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.m(obj)) {
            return b.n(obj, "OnNextNotification[", "]");
        }
        return "OnErrorNotification[" + NotificationLite.f(obj) + "]";
    }
}
