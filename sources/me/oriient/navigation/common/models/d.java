package me.oriient.navigation.common.models;

import me.oriient.internal.services.dataModel.navigation.NavigationMetrics;

/* loaded from: classes8.dex */
public final class d implements NavigationMetrics {

    /* renamed from: a, reason: collision with root package name */
    public int f26255a;
    public int b;
    public int c;
    public long d;
    public long e;

    public d(int i, int i2, int i3, long j, long j2) {
        this.f26255a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f26255a == dVar.f26255a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetrics
    public final long getAvgRouteCalcTimeMillis() {
        return this.d;
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetrics
    public final long getMaxRouteCalcTimeMillis() {
        return this.e;
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetrics
    public final int getRouteMaxNumWaypoints() {
        return this.f26255a;
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetrics
    public final int getRouteRecalculationCount() {
        return this.b;
    }

    @Override // me.oriient.internal.services.dataModel.navigation.NavigationMetrics
    public final int getRouteWaypointUpdateCount() {
        return this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + androidx.camera.core.impl.b.b(androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f26255a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationMetricsImpl(routeMaxNumWaypoints=");
        sb.append(this.f26255a);
        sb.append(", routeRecalculationCount=");
        sb.append(this.b);
        sb.append(", routeWaypointUpdateCount=");
        sb.append(this.c);
        sb.append(", avgRouteCalcTimeMillis=");
        sb.append(this.d);
        sb.append(", maxRouteCalcTimeMillis=");
        return androidx.camera.core.impl.b.q(sb, this.e, ')');
    }
}
