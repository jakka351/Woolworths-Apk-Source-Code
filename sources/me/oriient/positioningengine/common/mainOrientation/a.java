package me.oriient.positioningengine.common.mainOrientation;

import androidx.collection.CircularArray;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.dataModel.engine.MainOrientationCalculatorConfig;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.config.c;
import me.oriient.positioningengine.common.config.d;
import me.oriient.positioningengine.common.util.UtilsKt;
import me.oriient.positioningengine.ondevice.models.Heading;
import me.oriient.positioningengine.ondevice.models.MainOrientation;

/* loaded from: classes8.dex */
public final class a implements MainOrientationCalculator {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26385a = DiKt.getDi().inject(Reflection.f24268a.b(c.class));
    public CircularArray b = new CircularArray(1);
    public int c = 1;
    public Double d;
    public double e;

    @Override // me.oriient.positioningengine.common.mainOrientation.MainOrientationCalculator
    public final MainOrientation mainOrientation(double d, double d2, Heading heading) {
        Intrinsics.h(heading, "heading");
        MainOrientationCalculatorConfig mainOrientationCalculatorConfig = ((me.oriient.positioningengine.common.config.a) ((d) ((c) this.f26385a.getD())).f26374a.getValue()).f;
        if (this.c != mainOrientationCalculatorConfig.getPositionsBufferSize()) {
            this.b = new CircularArray(mainOrientationCalculatorConfig.getPositionsBufferSize());
            this.c = mainOrientationCalculatorConfig.getPositionsBufferSize();
        }
        MainOrientation mainOrientation = new MainOrientation(heading.getX(), heading.getY());
        if (d2 < 1.0d) {
            CircularArray circularArray = this.b;
            int i = circularArray.c;
            int i2 = circularArray.b;
            int i3 = circularArray.d;
            int i4 = (i - i2) & i3;
            if (i4 > 0) {
                if (i4 > ((i - i2) & i3)) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int length = circularArray.f669a.length;
                if (i4 < length - i2) {
                    length = i2 + i4;
                }
                while (i2 < length) {
                    circularArray.f669a[i2] = null;
                    i2++;
                }
                int i5 = circularArray.b;
                int i6 = length - i5;
                int i7 = i4 - i6;
                circularArray.b = circularArray.d & (i5 + i6);
                if (i7 > 0) {
                    while (i < i7) {
                        circularArray.f669a[i] = null;
                        i++;
                    }
                    circularArray.b = i7;
                }
            }
            this.d = null;
            this.e = 0.0d;
            return mainOrientation;
        }
        Double d3 = this.d;
        double dAbs = d3 != null ? Math.abs(d - d3.doubleValue()) : 0.0d;
        this.d = Double.valueOf(d);
        this.e += dAbs;
        CircularArray circularArray2 = this.b;
        if ((circularArray2.d & (circularArray2.c - circularArray2.b)) == mainOrientationCalculatorConfig.getPositionsBufferSize()) {
            CircularArray circularArray3 = this.b;
            int i8 = circularArray3.b;
            if (i8 == circularArray3.c) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Object[] objArr = circularArray3.f669a;
            Object obj = objArr[i8];
            objArr[i8] = null;
            circularArray3.b = circularArray3.d & (i8 + 1);
            Double d4 = (Double) obj;
            double d5 = this.e;
            Intrinsics.e(d4);
            this.e = d5 - d4.doubleValue();
        }
        CircularArray circularArray4 = this.b;
        Double dValueOf = Double.valueOf(dAbs);
        Object[] objArr2 = circularArray4.f669a;
        int i9 = circularArray4.c;
        objArr2[i9] = dValueOf;
        int i10 = circularArray4.d & (i9 + 1);
        circularArray4.c = i10;
        int i11 = circularArray4.b;
        if (i10 == i11) {
            int length2 = objArr2.length;
            int i12 = length2 - i11;
            int i13 = length2 << 1;
            if (i13 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr3 = new Object[i13];
            ArraysKt.t(objArr2, 0, objArr3, i11, length2);
            ArraysKt.t(circularArray4.f669a, i12, objArr3, 0, circularArray4.b);
            circularArray4.f669a = objArr3;
            circularArray4.b = 0;
            circularArray4.c = length2;
            circularArray4.d = i13 - 1;
        }
        i = this.e >= mainOrientationCalculatorConfig.getMinimumWalkingDistance() ? 1 : 0;
        float fAtan2 = (float) Math.atan2(heading.getY(), heading.getX());
        double moGridIntervalRadians = mainOrientationCalculatorConfig.getMoGridIntervalRadians();
        if (moGridIntervalRadians == 0.0d) {
            UtilsKt.assertionFailure("Invalid grid internal value.");
            moGridIntervalRadians = 1.0d;
        }
        double d6 = fAtan2;
        double dFloor = Math.floor(d6 / moGridIntervalRadians) * moGridIntervalRadians;
        double d7 = moGridIntervalRadians + dFloor;
        double dAbs2 = Math.abs(d6 - dFloor);
        double dAbs3 = Math.abs(d6 - d7);
        return Math.min(dAbs2, dAbs3) <= (i != 0 ? mainOrientationCalculatorConfig.getMoGridAllowedDeviationRadiansWhenWalking() : mainOrientationCalculatorConfig.getMoGridAllowedDeviationRadiansWhenIdle()) ? dAbs2 < dAbs3 ? new MainOrientation(dFloor) : new MainOrientation(d7) : mainOrientation;
    }
}
