package me.oriient.internal.services.sensorsManager.support;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes7.dex */
public final class g implements SupportSensorsManager.SensorIssuesReport {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25595a;
    public final int b;

    public g(LinkedHashMap sensorIssues, int i) {
        Intrinsics.h(sensorIssues, "sensorIssues");
        this.f25595a = sensorIssues;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.c(this.f25595a, gVar.f25595a) && this.b == gVar.b;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesReport
    public final Map getSensorIssues() {
        return this.f25595a;
    }

    @Override // me.oriient.internal.services.sensorsManager.support.SupportSensorsManager.SensorIssuesReport
    public final int getSensorsRestartCount() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f25595a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SensorIssuesReportImpl(sensorIssues=");
        sb.append(this.f25595a);
        sb.append(", sensorsRestartCount=");
        return YU.a.l(sb, this.b, ')');
    }
}
