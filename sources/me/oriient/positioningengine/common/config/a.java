package me.oriient.positioningengine.common.config;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.engine.MainOrientationCalculatorConfig;
import me.oriient.internal.services.dataModel.engine.MainOrientationCalculatorConfigResponse;
import me.oriient.positioningengine.common.v;
import me.oriient.positioningengine.common.w;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f26373a;
    public final int b;
    public final int c;
    public final long d;
    public final double e;
    public final MainOrientationCalculatorConfig f;
    public final boolean g;

    public a(double d, int i, int i2, long j, double d2, MainOrientationCalculatorConfig mainOrientationCalculator, boolean z) {
        Intrinsics.h(mainOrientationCalculator, "mainOrientationCalculator");
        this.f26373a = d;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = d2;
        this.f = mainOrientationCalculator;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f26373a, aVar.f26373a) == 0 && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && Double.compare(this.e, aVar.e) == 0 && Intrinsics.c(this.f, aVar.f) && this.g == aVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + v.a(this.e, w.a(this.d, androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Double.hashCode(this.f26373a) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PositioningEngineConfig(calibrationExpirationTimeInMillis=");
        sb.append(this.f26373a);
        sb.append(", modelFetchRetryCount=");
        sb.append(this.b);
        sb.append(", engineSessionFetchRetryCount=");
        sb.append(this.c);
        sb.append(", engineSessionFetchRetryIntervalMillis=");
        sb.append(this.d);
        sb.append(", engineSessionRefreshIntervalBeforeExpirationSeconds=");
        sb.append(this.e);
        sb.append(", mainOrientationCalculator=");
        sb.append(this.f);
        sb.append(", isSmartCartMode=");
        return androidx.camera.core.impl.b.s(sb, this.g, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        this(timeUnit.toMillis(1L), 3, 2, TimeUnit.SECONDS.toMillis(1L), timeUnit.toSeconds(12L), new MainOrientationCalculatorConfigResponse((Double) null, (Double) null, (Double) null, (Integer) null, (Double) null, 31, (DefaultConstructorMarker) null).toConfig(), false);
    }
}
