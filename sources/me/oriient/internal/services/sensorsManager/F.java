package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;

/* loaded from: classes7.dex */
public final class F implements SensorInformation {

    /* renamed from: a, reason: collision with root package name */
    public final String f25553a;
    public final SystemSensor b;
    public final String c;
    public final int d;
    public final boolean e;

    public F(String name, SystemSensor type, String vendor, int i, boolean z) {
        Intrinsics.h(name, "name");
        Intrinsics.h(type, "type");
        Intrinsics.h(vendor, "vendor");
        this.f25553a = name;
        this.b = type;
        this.c = vendor;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        return Intrinsics.c(this.f25553a, f.f25553a) && this.b == f.b && Intrinsics.c(this.c, f.c) && this.d == f.d && this.e == f.e;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorInformation
    public final boolean getBatchingSupported() {
        return this.e;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorInformation
    public final String getName() {
        return this.f25553a;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorInformation
    public final SystemSensor getType() {
        return this.b;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorInformation
    public final String getVendor() {
        return this.c;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorInformation
    public final int getVersion() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + me.oriient.internal.services.config.a.a(this.d, me.oriient.internal.infra.rest.a.a(this.c, (this.b.hashCode() + (this.f25553a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorInformationImpl(name=");
        sb.append(this.f25553a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", vendor=");
        sb.append(this.c);
        sb.append(", version=");
        sb.append(this.d);
        sb.append(", batchingSupported=");
        return androidx.camera.core.impl.b.s(sb, this.e, ')');
    }
}
