package androidx.work;

import android.app.Notification;

/* loaded from: classes2.dex */
public final class ForegroundInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f3900a;
    public final int b;
    public final Notification c;

    public ForegroundInfo(int i, int i2, Notification notification) {
        this.f3900a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f3900a == foregroundInfo.f3900a && this.b == foregroundInfo.b) {
            return this.c.equals(foregroundInfo.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f3900a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3900a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
