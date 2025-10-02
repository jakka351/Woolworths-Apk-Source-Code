package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes6.dex */
public final class S0 implements Q0 {
    private final E0 b;
    private final int c;
    private final Function0 d;
    private float e;
    private float f;
    private int g;
    private long h;
    private long i;
    private boolean j;
    private long k;

    public S0(F0 cameraInfo, int i, Function0 timeProvider) {
        Intrinsics.h(cameraInfo, "cameraInfo");
        Intrinsics.h(timeProvider, "timeProvider");
        this.b = cameraInfo;
        this.c = i;
        this.d = timeProvider;
        this.g = 1;
        int i2 = Duration.g;
        this.h = 0L;
        this.i = 0L;
        this.k = 0L;
    }

    public final boolean a(C1035j0 result, boolean z) {
        Intrinsics.h(result, "result");
        float fLongValue = (result.i() != null ? r0.longValue() : 0L) * 1.0E-9f;
        Integer numJ = result.j();
        float fIntValue = numJ != null ? numJ.intValue() : 0;
        Float fH = result.h();
        float fFloatValue = fH != null ? fH.floatValue() : 0.0f;
        float fL = ((F0) this.b).l();
        return a(1.0f - RangesKt.b((fFloatValue - fL) / (((F0) this.b).m() - fL), BitmapDescriptorFactory.HUE_RED, 1.0f), fLongValue, fIntValue, z);
    }

    private final boolean a(float f, float f2, float f3, boolean z) {
        long jB;
        boolean z2;
        float f4 = this.e;
        int i = this.c;
        float f5 = i - 1;
        float f6 = i;
        float f7 = ((f4 * f5) + f2) / f6;
        this.e = f7;
        float f8 = ((this.f * f5) + f3) / f6;
        this.f = f8;
        float f9 = 1.0f / (f7 * f8);
        int i2 = Duration.g;
        long jH = DurationKt.h(((Number) this.d.invoke()).longValue(), DurationUnit.g);
        if (f < 0.8f) {
            if (!this.j) {
                this.j = true;
                this.k = jH;
            }
        } else {
            this.j = false;
        }
        if (z) {
            Q0.f18361a.getClass();
            jB = P0.a();
        } else {
            Q0.f18361a.getClass();
            jB = P0.b();
        }
        int iA = P1.a(this.g);
        if (iA != 0) {
            if (iA != 1) {
                z2 = false;
                if (iA != 2) {
                    if (iA == 3) {
                        if (f9 > 0.12f) {
                            this.g = 1;
                            O3.a("CAM2_AT FD:" + f + ", EST:" + f9 + " DELAY_TO_ON -> OFF");
                            return false;
                        }
                        if (Duration.c(jH, this.i) > 0) {
                            this.g = 2;
                            O3.a("CAM2_AT FD:" + f + ", EST:" + f9 + " DELAY_TO_ON -> ON");
                            return true;
                        }
                    }
                } else {
                    if (f9 < 0.65f) {
                        this.g = 2;
                        O3.a("CAM2_AT FD:" + f + ", EST:" + f9 + " DELAY_TO_OFF -> ON");
                        return true;
                    }
                    if (f < 0.8f) {
                        long jL = Duration.l(jH, Duration.o(this.k));
                        Q0.f18361a.getClass();
                        if (Duration.c(jL, P0.d()) > 0) {
                            this.h = Duration.l(jH, jB);
                        }
                    }
                    if (Duration.c(jH, this.h) > 0) {
                        this.g = 1;
                        O3.a("CAM2_AT FD:" + f + ", EST:" + f9 + " DELAY_TO_OFF -> OFF");
                        return false;
                    }
                }
            } else if (f9 > 0.65f) {
                this.h = Duration.l(jH, jB);
                this.g = 3;
                O3.a("CAM2_AT FD:" + f + ", EST:" + f9 + " ON -> DELAY_TO_OFF");
            }
            return true;
        }
        z2 = false;
        if (f9 < 0.12f) {
            Q0.f18361a.getClass();
            this.i = Duration.l(jH, P0.c());
            this.g = 4;
            O3.a("CAM2_AT FD:" + f + ", EST:" + f9 + " OFF -> DELAY_TO_ON");
        }
        return z2;
    }

    public /* synthetic */ S0(F0 f0) {
        this(f0, 4, R0.f18365a);
    }
}
