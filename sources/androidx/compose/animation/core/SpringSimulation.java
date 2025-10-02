package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SpringSimulation {

    /* renamed from: a, reason: collision with root package name */
    public float f771a;
    public double b;
    public float c;

    public final long a(long j, float f, float f2) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.f771a;
        double d = j / 1000.0d;
        float f4 = this.c;
        double d2 = f4 * f4;
        double d3 = this.b;
        double d4 = (-f4) * d3;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d2 - 1) * d3;
            double d5 = d4 + dSqrt;
            double d6 = d4 - dSqrt;
            double d7 = f3;
            double d8 = ((d6 * d7) - f2) / (d6 - d5);
            double d9 = d7 - d8;
            double d10 = d6 * d;
            double d11 = d * d5;
            dSin = (Math.exp(d11) * d8) + (Math.exp(d10) * d9);
            dExp = Math.exp(d10) * d9 * d6;
            dExp2 = Math.exp(d11) * d8 * d5;
        } else {
            if (f4 != 1.0f) {
                double d12 = 1;
                double dSqrt2 = Math.sqrt(d12 - d2) * d3;
                double d13 = f3;
                double d14 = (((-d4) * d13) + f2) * (d12 / dSqrt2);
                double d15 = dSqrt2 * d;
                double d16 = d * d4;
                dSin = ((Math.sin(d15) * d14) + (Math.cos(d15) * d13)) * Math.exp(d16);
                dCos = (((Math.cos(d15) * dSqrt2 * d14) + (Math.sin(d15) * (-dSqrt2) * d13)) * Math.exp(d16)) + (d4 * dSin);
                float f5 = (float) dCos;
                return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.f771a)) << 32);
            }
            double d17 = f3;
            double d18 = (d3 * d17) + f2;
            double d19 = (-d3) * d;
            double d20 = (d * d18) + d17;
            dSin = Math.exp(d19) * d20;
            dExp = Math.exp(d19) * d20 * (-this.b);
            dExp2 = Math.exp(d19) * d18;
        }
        dCos = dExp2 + dExp;
        float f52 = (float) dCos;
        return (Float.floatToRawIntBits(f52) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.f771a)) << 32);
    }
}
