package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class LinearSmoothScroller extends RecyclerView.SmoothScroller {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    @SuppressLint
    public LinearSmoothScroller(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void c(int i, int i2, RecyclerView.SmoothScroller.Action action) {
        if (this.b.q.z() == 0) {
            f();
            return;
        }
        int i3 = this.o;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.o = i4;
        int i5 = this.p;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.p = i7;
        if (i4 == 0 && i7 == 0) {
            PointF pointFA = a(this.f3697a);
            if (pointFA != null) {
                if (pointFA.x != BitmapDescriptorFactory.HUE_RED || pointFA.y != BitmapDescriptorFactory.HUE_RED) {
                    float f = pointFA.y;
                    float fSqrt = (float) Math.sqrt((f * f) + (r4 * r4));
                    float f2 = pointFA.x / fSqrt;
                    pointFA.x = f2;
                    float f3 = pointFA.y / fSqrt;
                    pointFA.y = f3;
                    this.k = pointFA;
                    this.o = (int) (f2 * 10000.0f);
                    this.p = (int) (f3 * 10000.0f);
                    action.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (l(ModuleDescriptor.MODULE_VERSION) * 1.2f), this.i);
                    return;
                }
            }
            action.d = this.f3697a;
            f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void d() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.view.View r7, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.h(r0, r7)
            android.graphics.PointF r5 = r6.k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.i(r1, r7)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.k(r1)
            if (r1 <= 0) goto L46
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r2 = r6.j
            r8.b(r0, r7, r1, r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearSmoothScroller.e(android.view.View, androidx.recyclerview.widget.RecyclerView$SmoothScroller$Action):void");
    }

    public int h(int i, View view) {
        RecyclerView.LayoutManager layoutManager = this.c;
        if (layoutManager == null || !layoutManager.g()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return g(RecyclerView.LayoutManager.E(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, RecyclerView.LayoutManager.H(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.L(), layoutManager.n - layoutManager.M(), i);
    }

    public int i(int i, View view) {
        RecyclerView.LayoutManager layoutManager = this.c;
        if (layoutManager == null || !layoutManager.h()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return g(RecyclerView.LayoutManager.I(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, RecyclerView.LayoutManager.C(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.N(), layoutManager.o - layoutManager.K(), i);
    }

    public float j(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int k(int i) {
        return (int) Math.ceil(l(i) / 0.3356d);
    }

    public int l(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = j(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }
}
