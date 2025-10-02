package me.oriient.internal.infra.locationManager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes7.dex */
public final class M extends N {

    /* renamed from: a, reason: collision with root package name */
    public final long f24940a = 0;
    public final float b = BitmapDescriptorFactory.HUE_RED;

    @Override // me.oriient.internal.infra.locationManager.N
    public final float a() {
        return this.b;
    }

    @Override // me.oriient.internal.infra.locationManager.N
    public final long b() {
        return this.f24940a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return this.f24940a == m.f24940a && Float.compare(this.b, m.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.f24940a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerSaving(updatesIntervalMillis=");
        sb.append(this.f24940a);
        sb.append(", minDistanceMeters=");
        return android.support.v4.media.session.a.r(sb, this.b, ')');
    }
}
