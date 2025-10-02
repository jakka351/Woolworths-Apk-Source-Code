package com.otaliastudios.zoom.internal.movement;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.OverPanRangeProvider;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLogger;
import com.otaliastudios.zoom.internal.matrix.MatrixController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/zoom/internal/movement/PanManager;", "Lcom/otaliastudios/zoom/internal/movement/MovementManager;", "Companion", "Status", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class PanManager extends MovementManager {
    public static final ZoomLogger j = new ZoomLogger("PanManager");
    public final ZoomEngine b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public OverPanRangeProvider h;
    public final ScaledPoint i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/otaliastudios/zoom/internal/movement/PanManager$Companion;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/internal/movement/PanManager$Status;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Status {

        /* renamed from: a, reason: collision with root package name */
        public int f16823a;
        public int b;
        public int c;
        public boolean d;
    }

    public PanManager(ZoomEngine zoomEngine, Function0 function0) {
        super(function0);
        this.b = zoomEngine;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = 51;
        this.h = OverPanRangeProvider.f16809a;
        this.i = new ScaledPoint();
    }

    public static float b(boolean z, float f, int i) {
        int i2 = z ? i & 7 : i & 112;
        if (i2 != 1) {
            if (i2 == 3) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (i2 != 5) {
                if (i2 != 16) {
                    if (i2 == 48 || i2 != 80) {
                        return BitmapDescriptorFactory.HUE_RED;
                    }
                }
            }
            return f;
        }
        return f * 0.5f;
    }

    public final float c(boolean z, boolean z2) {
        float f;
        MatrixController matrixControllerA = a();
        float f2 = z ? matrixControllerA.e.left : matrixControllerA.e.top;
        MatrixController matrixControllerA2 = a();
        float f3 = z ? matrixControllerA2.j : matrixControllerA2.k;
        MatrixController matrixControllerA3 = a();
        float fWidth = z ? matrixControllerA3.e.width() : matrixControllerA3.e.height();
        boolean z3 = z ? this.c : this.d;
        float fB = BitmapDescriptorFactory.HUE_RED;
        float f4 = (z3 && z2) ? z ? f() : g() : 0.0f;
        int i = 3;
        if (z) {
            int i2 = this.g & 240;
            if (i2 != 16) {
                i = i2 != 32 ? i2 != 48 ? 0 : 1 : 5;
            }
        } else {
            int i3 = this.g & (-241);
            i = i3 != 1 ? i3 != 2 ? i3 != 3 ? 0 : 16 : 80 : 48;
        }
        if (fWidth <= f3) {
            f = f3 - fWidth;
            if (i != 0) {
                fB = b(z, f, i);
                f = fB;
            }
        } else {
            fB = f3 - fWidth;
            f = 0.0f;
        }
        return RangesKt.b(f2, fB - f4, f + f4) - f2;
    }

    public final void d(boolean z, Status output) {
        Intrinsics.h(output, "output");
        MatrixController matrixControllerA = a();
        int i = (int) (z ? matrixControllerA.e.left : matrixControllerA.e.top);
        MatrixController matrixControllerA2 = a();
        int i2 = (int) (z ? matrixControllerA2.j : matrixControllerA2.k);
        MatrixController matrixControllerA3 = a();
        int iWidth = (int) (z ? matrixControllerA3.e.width() : matrixControllerA3.e.height());
        int iC = (int) c(z, false);
        int i3 = z ? this.g & 240 : this.g & (-241);
        if (iWidth > i2) {
            output.f16823a = -(iWidth - i2);
            output.c = 0;
        } else if (i3 == 68 || i3 == 0 || i3 == 64 || i3 == 4) {
            output.f16823a = 0;
            output.c = i2 - iWidth;
        } else {
            int i4 = i + iC;
            output.f16823a = i4;
            output.c = i4;
        }
        output.b = i;
        output.d = iC != 0;
    }

    public final ScaledPoint e() {
        Float fValueOf = Float.valueOf(c(true, false));
        Float fValueOf2 = Float.valueOf(c(false, false));
        ScaledPoint scaledPoint = this.i;
        scaledPoint.a(fValueOf, fValueOf2);
        return scaledPoint;
    }

    public final float f() {
        float fA = this.h.a(this.b, true);
        if (fA < BitmapDescriptorFactory.HUE_RED) {
            j.getClass();
            if (fA < BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return fA;
    }

    public final float g() {
        float fA = this.h.a(this.b, false);
        if (fA < BitmapDescriptorFactory.HUE_RED) {
            j.getClass();
            if (fA < BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return fA;
    }
}
