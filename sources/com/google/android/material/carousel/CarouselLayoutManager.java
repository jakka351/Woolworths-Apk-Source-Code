package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.camera2.interop.d;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public int A;
    public int B;
    public final int C;
    public int p;
    public int q;
    public int r;
    public final DebugItemDecoration s;
    public final MultiBrowseCarouselStrategy t;
    public KeylineStateList u;
    public KeylineState v;
    public int w;
    public HashMap x;
    public CarouselOrientationHelper y;
    public final View.OnLayoutChangeListener z;

    public static final class ChildCalculations {

        /* renamed from: a, reason: collision with root package name */
        public final View f14532a;
        public final float b;
        public final float c;
        public final KeylineRange d;

        public ChildCalculations(View view, float f, float f2, KeylineRange keylineRange) {
            this.f14532a = view;
            this.b = f;
            this.c = f2;
            this.d = keylineRange;
        }
    }

    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f14533a;
        public List b;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.f14533a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) throws Resources.NotFoundException {
            Canvas canvas2;
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.f14533a;
            paint.setStrokeWidth(dimension);
            for (KeylineState.Keyline keyline : this.b) {
                paint.setColor(ColorUtils.b(keyline.c, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f1()) {
                    canvas2 = canvas;
                    canvas2.drawLine(keyline.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.i(), keyline.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.d(), paint);
                } else {
                    float f = ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.f();
                    float f2 = keyline.b;
                    float fG = ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.g();
                    float f3 = keyline.b;
                    canvas2 = canvas;
                    canvas2.drawLine(f, f2, fG, f3, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class KeylineRange {

        /* renamed from: a, reason: collision with root package name */
        public final KeylineState.Keyline f14534a;
        public final KeylineState.Keyline b;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            Preconditions.b(keyline.f14539a <= keyline2.f14539a);
            this.f14534a = keyline;
            this.b = keyline2;
        }
    }

    public static class LayoutDirection {
    }

    public CarouselLayoutManager() {
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = new MultiBrowseCarouselStrategy();
        this.s = new DebugItemDecoration();
        this.w = 0;
        this.z = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new d(this.f14541a, 26));
            }
        };
        this.B = -1;
        this.C = 0;
        this.t = multiBrowseCarouselStrategy;
        l1();
        n1(0);
    }

    public static KeylineRange e1(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list.get(i5);
            float f6 = z ? keyline.b : keyline.f14539a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new KeylineRange((KeylineState.Keyline) list.get(i), (KeylineState.Keyline) list.get(i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean B0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iD1;
        if (this.u == null || (iD1 = d1(RecyclerView.LayoutManager.O(view), a1(RecyclerView.LayoutManager.O(view)))) == 0) {
            return false;
        }
        int i = this.p;
        int i2 = this.q;
        int i3 = this.r;
        int i4 = i + iD1;
        if (i4 < i2) {
            iD1 = i2 - i;
        } else if (i4 > i3) {
            iD1 = i3 - i;
        }
        int iD12 = d1(RecyclerView.LayoutManager.O(view), this.u.b(i + iD1, i2, i3, false));
        if (f1()) {
            recyclerView.scrollBy(iD12, 0);
            return true;
        }
        recyclerView.scrollBy(0, iD12);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void D(Rect rect, View view) {
        RecyclerView.Q(rect, view);
        float fCenterY = rect.centerY();
        if (f1()) {
            fCenterY = rect.centerX();
        }
        KeylineRange keylineRangeE1 = e1(fCenterY, this.v.b, true);
        KeylineState.Keyline keyline = keylineRangeE1.f14534a;
        float f = keyline.d;
        KeylineState.Keyline keyline2 = keylineRangeE1.b;
        float fB = AnimationUtils.b(f, keyline2.d, keyline.b, keyline2.b, fCenterY);
        boolean zF1 = f1();
        float fHeight = BitmapDescriptorFactory.HUE_RED;
        float fWidth = zF1 ? (rect.width() - fB) / 2.0f : 0.0f;
        if (!f1()) {
            fHeight = (rect.height() - fB) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int D0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (f1()) {
            return m1(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void E0(int i) {
        this.B = i;
        if (this.u == null) {
            return;
        }
        this.p = c1(i, a1(i));
        this.w = MathUtils.b(i, 0, Math.max(0, J() - 1));
        p1(this.u);
        C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int F0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (h()) {
            return m1(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void O0(int i, RecyclerView recyclerView) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public final PointF a(int i2) {
                return CarouselLayoutManager.this.a(i2);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int h(int i2, View view) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (carouselLayoutManager.u == null || !carouselLayoutManager.f1()) {
                    return 0;
                }
                int iO = RecyclerView.LayoutManager.O(view);
                return (int) (carouselLayoutManager.p - carouselLayoutManager.c1(iO, carouselLayoutManager.a1(iO)));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final int i(int i2, View view) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (carouselLayoutManager.u == null || carouselLayoutManager.f1()) {
                    return 0;
                }
                int iO = RecyclerView.LayoutManager.O(view);
                return (int) (carouselLayoutManager.p - carouselLayoutManager.c1(iO, carouselLayoutManager.a1(iO)));
            }
        };
        linearSmoothScroller.f3697a = i;
        P0(linearSmoothScroller);
    }

    public final void R0(View view, int i, ChildCalculations childCalculations) {
        float f = this.v.f14537a / 2.0f;
        c(view, i, false);
        float f2 = childCalculations.c;
        this.y.j(view, (int) (f2 - f), (int) (f2 + f));
        o1(view, childCalculations.b, childCalculations.d);
    }

    public final float S0(float f, float f2) {
        return g1() ? f - f2 : f + f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean T() {
        return true;
    }

    public final void T0(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float fW0 = W0(i);
        while (i < state.b()) {
            ChildCalculations childCalculationsJ1 = j1(recycler, fW0, i);
            KeylineRange keylineRange = childCalculationsJ1.d;
            float f = childCalculationsJ1.c;
            if (h1(f, keylineRange)) {
                return;
            }
            fW0 = S0(fW0, this.v.f14537a);
            if (!i1(f, keylineRange)) {
                R0(childCalculationsJ1.f14532a, -1, childCalculationsJ1);
            }
            i++;
        }
    }

    public final void U0(int i, RecyclerView.Recycler recycler) {
        float fW0 = W0(i);
        while (i >= 0) {
            ChildCalculations childCalculationsJ1 = j1(recycler, fW0, i);
            KeylineRange keylineRange = childCalculationsJ1.d;
            float f = childCalculationsJ1.c;
            if (i1(f, keylineRange)) {
                return;
            }
            float f2 = this.v.f14537a;
            fW0 = g1() ? fW0 + f2 : fW0 - f2;
            if (!h1(f, keylineRange)) {
                R0(childCalculationsJ1.f14532a, 0, childCalculationsJ1);
            }
            i--;
        }
    }

    public final float V0(View view, float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f14534a;
        float f2 = keyline.b;
        KeylineState.Keyline keyline2 = keylineRange.b;
        float f3 = keyline2.b;
        float f4 = keyline.f14539a;
        float f5 = keyline2.f14539a;
        float fB = AnimationUtils.b(f2, f3, f4, f5, f);
        if (keyline2 != this.v.b() && keyline != this.v.d()) {
            return fB;
        }
        return (((1.0f - keyline2.c) + (this.y.b((RecyclerView.LayoutParams) view.getLayoutParams()) / this.v.f14537a)) * (f - f5)) + fB;
    }

    public final float W0(int i) {
        return S0(this.y.h() - this.p, this.v.f14537a * i);
    }

    public final void X0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        while (z() > 0) {
            View viewY = y(0);
            float fZ0 = Z0(viewY);
            if (!i1(fZ0, e1(fZ0, this.v.b, true))) {
                break;
            }
            z0(viewY);
            recycler.i(viewY);
        }
        while (z() - 1 >= 0) {
            View viewY2 = y(z() - 1);
            float fZ02 = Z0(viewY2);
            if (!h1(fZ02, e1(fZ02, this.v.b, true))) {
                break;
            }
            z0(viewY2);
            recycler.i(viewY2);
        }
        if (z() == 0) {
            U0(this.w - 1, recycler);
            T0(this.w, recycler, state);
        } else {
            int iO = RecyclerView.LayoutManager.O(y(0));
            int iO2 = RecyclerView.LayoutManager.O(y(z() - 1));
            U0(iO - 1, recycler);
            T0(iO2 + 1, recycler, state);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void Y(View view) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        f(rect, view);
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        KeylineStateList keylineStateList = this.u;
        view.measure(RecyclerView.LayoutManager.A(this.n, this.l, M() + L() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i, (int) ((keylineStateList == null || this.y.f14535a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : keylineStateList.f14540a.f14537a), f1()), RecyclerView.LayoutManager.A(this.o, this.m, K() + N() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i2, (int) ((keylineStateList == null || this.y.f14535a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : keylineStateList.f14540a.f14537a), h()));
    }

    public final int Y0() {
        return f1() ? this.n : this.o;
    }

    public final float Z0(View view) {
        RecyclerView.Q(new Rect(), view);
        return f1() ? r0.centerX() : r0.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF a(int i) {
        if (this.u == null) {
            return null;
        }
        int iC1 = c1(i, a1(i)) - this.p;
        return f1() ? new PointF(iC1, BitmapDescriptorFactory.HUE_RED) : new PointF(BitmapDescriptorFactory.HUE_RED, iC1);
    }

    public final KeylineState a1(int i) {
        KeylineState keylineState;
        HashMap map = this.x;
        return (map == null || (keylineState = (KeylineState) map.get(Integer.valueOf(MathUtils.b(i, 0, Math.max(0, J() + (-1)))))) == null) ? this.u.f14540a : keylineState;
    }

    public final int b1(int i, boolean z) {
        int iC1 = c1(i, this.u.b(this.p, this.q, this.r, true)) - this.p;
        int iC12 = this.x != null ? c1(i, a1(i)) - this.p : iC1;
        return (!z || Math.abs(iC12) >= Math.abs(iC1)) ? iC1 : iC12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void c0(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.t;
        float dimension = multiBrowseCarouselStrategy.f14536a;
        if (dimension <= BitmapDescriptorFactory.HUE_RED) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        multiBrowseCarouselStrategy.f14536a = dimension;
        float dimension2 = multiBrowseCarouselStrategy.b;
        if (dimension2 <= BitmapDescriptorFactory.HUE_RED) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        multiBrowseCarouselStrategy.b = dimension2;
        l1();
        recyclerView.addOnLayoutChangeListener(this.z);
    }

    public final int c1(int i, KeylineState keylineState) {
        if (!g1()) {
            return (int) ((keylineState.f14537a / 2.0f) + ((i * keylineState.f14537a) - keylineState.a().f14539a));
        }
        float fY0 = Y0() - keylineState.c().f14539a;
        float f = keylineState.f14537a;
        return (int) ((fY0 - (i * f)) - (f / 2.0f));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void d0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.z);
    }

    public final int d1(int i, KeylineState keylineState) {
        int i2 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.b.subList(keylineState.c, keylineState.d + 1)) {
            float f = keylineState.f14537a;
            float f2 = (f / 2.0f) + (i * f);
            int iY0 = (g1() ? (int) ((Y0() - keyline.f14539a) - f2) : (int) (f2 - keyline.f14539a)) - this.p;
            if (Math.abs(i2) > Math.abs(iY0)) {
                i2 = iY0;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View e0(android.view.View r5, int r6, androidx.recyclerview.widget.RecyclerView.Recycler r7, androidx.recyclerview.widget.RecyclerView.State r8) {
        /*
            r4 = this;
            int r8 = r4.z()
            if (r8 != 0) goto L8
            goto L9c
        L8:
            com.google.android.material.carousel.CarouselOrientationHelper r8 = r4.y
            int r8 = r8.f14535a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L46
            r3 = 2
            if (r6 == r3) goto L3c
            r3 = 17
            if (r6 == r3) goto L4b
            r3 = 33
            if (r6 == r3) goto L48
            r3 = 66
            if (r6 == r3) goto L3e
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L3a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown focus request:"
            r8.<init>(r3)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = "CarouselLayoutManager"
            android.util.Log.d(r8, r6)
        L38:
            r6 = r0
            goto L54
        L3a:
            if (r8 != r2) goto L38
        L3c:
            r6 = r2
            goto L54
        L3e:
            if (r8 != 0) goto L38
            boolean r6 = r4.g1()
            if (r6 == 0) goto L3c
        L46:
            r6 = r1
            goto L54
        L48:
            if (r8 != r2) goto L38
            goto L46
        L4b:
            if (r8 != 0) goto L38
            boolean r6 = r4.g1()
            if (r6 == 0) goto L46
            goto L3c
        L54:
            if (r6 != r0) goto L57
            goto L9c
        L57:
            r8 = 0
            if (r6 != r1) goto L91
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.O(r5)
            if (r5 != 0) goto L61
            goto L9c
        L61:
            android.view.View r5 = r4.y(r8)
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.O(r5)
            int r5 = r5 - r2
            if (r5 < 0) goto L80
            int r6 = r4.J()
            if (r5 < r6) goto L73
            goto L80
        L73:
            float r6 = r4.W0(r5)
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r5 = r4.j1(r7, r6, r5)
            android.view.View r6 = r5.f14532a
            r4.R0(r6, r8, r5)
        L80:
            boolean r5 = r4.g1()
            if (r5 == 0) goto L8c
            int r5 = r4.z()
            int r8 = r5 + (-1)
        L8c:
            android.view.View r5 = r4.y(r8)
            return r5
        L91:
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.O(r5)
            int r6 = r4.J()
            int r6 = r6 - r2
            if (r5 != r6) goto L9e
        L9c:
            r5 = 0
            return r5
        L9e:
            int r5 = r4.z()
            int r5 = r5 - r2
            android.view.View r5 = r4.y(r5)
            int r5 = androidx.recyclerview.widget.RecyclerView.LayoutManager.O(r5)
            int r5 = r5 + r2
            if (r5 < 0) goto Lc2
            int r6 = r4.J()
            if (r5 < r6) goto Lb5
            goto Lc2
        Lb5:
            float r6 = r4.W0(r5)
            com.google.android.material.carousel.CarouselLayoutManager$ChildCalculations r5 = r4.j1(r7, r6, r5)
            android.view.View r6 = r5.f14532a
            r4.R0(r6, r1, r5)
        Lc2:
            boolean r5 = r4.g1()
            if (r5 == 0) goto Lc9
            goto Lcf
        Lc9:
            int r5 = r4.z()
            int r8 = r5 + (-1)
        Lcf:
            android.view.View r5 = r4.y(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.e0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void f0(AccessibilityEvent accessibilityEvent) {
        super.f0(accessibilityEvent);
        if (z() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.LayoutManager.O(y(0)));
            accessibilityEvent.setToIndex(RecyclerView.LayoutManager.O(y(z() - 1)));
        }
    }

    public final boolean f1() {
        return this.y.f14535a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean g() {
        return f1();
    }

    public final boolean g1() {
        return f1() && this.b.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean h() {
        return !f1();
    }

    public final boolean h1(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f14534a;
        float f2 = keyline.d;
        KeylineState.Keyline keyline2 = keylineRange.b;
        float fB = AnimationUtils.b(f2, keyline2.d, keyline.b, keyline2.b, f) / 2.0f;
        float f3 = g1() ? f + fB : f - fB;
        return g1() ? f3 < BitmapDescriptorFactory.HUE_RED : f3 > ((float) Y0());
    }

    public final boolean i1(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.f14534a;
        float f2 = keyline.d;
        KeylineState.Keyline keyline2 = keylineRange.b;
        float fS0 = S0(f, AnimationUtils.b(f2, keyline2.d, keyline.b, keyline2.b, f) / 2.0f);
        return g1() ? fS0 > ((float) Y0()) : fS0 < BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void j0(int i, int i2) {
        int iJ = J();
        int i3 = this.A;
        if (iJ == i3 || this.u == null) {
            return;
        }
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.t;
        if ((i3 < multiBrowseCarouselStrategy.c && J() >= multiBrowseCarouselStrategy.c) || (i3 >= multiBrowseCarouselStrategy.c && J() < multiBrowseCarouselStrategy.c)) {
            l1();
        }
        this.A = iJ;
    }

    public final ChildCalculations j1(RecyclerView.Recycler recycler, float f, int i) {
        View view = recycler.m(i, Long.MAX_VALUE).itemView;
        Y(view);
        float fS0 = S0(f, this.v.f14537a / 2.0f);
        KeylineRange keylineRangeE1 = e1(fS0, this.v.b, false);
        return new ChildCalculations(view, fS0, V0(view, fS0, keylineRangeE1), keylineRangeE1);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k1(androidx.recyclerview.widget.RecyclerView.Recycler r31) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.k1(androidx.recyclerview.widget.RecyclerView$Recycler):void");
    }

    public final void l1() {
        this.u = null;
        C0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int m(RecyclerView.State state) {
        if (z() == 0 || this.u == null || J() <= 1) {
            return 0;
        }
        return (int) (this.n * (this.u.f14540a.f14537a / o(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void m0(int i, int i2) {
        int iJ = J();
        int i3 = this.A;
        if (iJ == i3 || this.u == null) {
            return;
        }
        MultiBrowseCarouselStrategy multiBrowseCarouselStrategy = this.t;
        if ((i3 < multiBrowseCarouselStrategy.c && J() >= multiBrowseCarouselStrategy.c) || (i3 >= multiBrowseCarouselStrategy.c && J() < multiBrowseCarouselStrategy.c)) {
            l1();
        }
        this.A = iJ;
    }

    public final int m1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (z() == 0 || i == 0) {
            return 0;
        }
        if (this.u == null) {
            k1(recycler);
        }
        int i2 = this.p;
        int i3 = this.q;
        int i4 = this.r;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.p = i2 + i;
        p1(this.u);
        float f = this.v.f14537a / 2.0f;
        float fW0 = W0(RecyclerView.LayoutManager.O(y(0)));
        Rect rect = new Rect();
        float f2 = g1() ? this.v.c().b : this.v.a().b;
        float f3 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < z(); i6++) {
            View viewY = y(i6);
            float fS0 = S0(fW0, f);
            KeylineRange keylineRangeE1 = e1(fS0, this.v.b, false);
            float fV0 = V0(viewY, fS0, keylineRangeE1);
            RecyclerView.Q(rect, viewY);
            o1(viewY, fS0, keylineRangeE1);
            this.y.l(viewY, rect, f, fV0);
            float fAbs = Math.abs(f2 - fV0);
            if (fAbs < f3) {
                this.B = RecyclerView.LayoutManager.O(viewY);
                f3 = fAbs;
            }
            fW0 = S0(fW0, this.v.f14537a);
        }
        X0(recycler, state);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int n(RecyclerView.State state) {
        return this.p;
    }

    public final void n1(int i) {
        CarouselOrientationHelper carouselOrientationHelper;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(YU.a.d(i, "invalid orientation:"));
        }
        d(null);
        CarouselOrientationHelper carouselOrientationHelper2 = this.y;
        if (carouselOrientationHelper2 == null || i != carouselOrientationHelper2.f14535a) {
            if (i == 0) {
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
                    {
                        super(0);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
                        float f = rectF2.left;
                        float f2 = rectF3.left;
                        if (f < f2 && rectF2.right > f2) {
                            float f3 = f2 - f;
                            rectF.left += f3;
                            rectF2.left += f3;
                        }
                        float f4 = rectF2.right;
                        float f5 = rectF3.right;
                        if (f4 <= f5 || rectF2.left >= f5) {
                            return;
                        }
                        float f6 = f4 - f5;
                        rectF.right = Math.max(rectF.right - f6, rectF.left);
                        rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final float b(RecyclerView.LayoutParams layoutParams) {
                        return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final RectF c(float f, float f2, float f3, float f4) {
                        return new RectF(f4, BitmapDescriptorFactory.HUE_RED, f2 - f4, f);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int d() {
                        CarouselLayoutManager carouselLayoutManager = this.b;
                        return carouselLayoutManager.o - carouselLayoutManager.K();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int e() {
                        CarouselLayoutManager carouselLayoutManager = this.b;
                        if (carouselLayoutManager.g1()) {
                            return 0;
                        }
                        return carouselLayoutManager.n;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int f() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int g() {
                        return this.b.n;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int h() {
                        CarouselLayoutManager carouselLayoutManager = this.b;
                        if (carouselLayoutManager.g1()) {
                            return carouselLayoutManager.n;
                        }
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int i() {
                        return this.b.N();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void j(View view, int i2, int i3) {
                        int iN = this.b.N();
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                        RecyclerView.LayoutManager.X(view, i2, iN, i3, RecyclerView.LayoutManager.F(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + iN);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
                        if (rectF2.right <= rectF3.left) {
                            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                            rectF.right = fFloor;
                            rectF.left = Math.min(rectF.left, fFloor);
                        }
                        if (rectF2.left >= rectF3.right) {
                            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                            rectF.left = fCeil;
                            rectF.right = Math.max(fCeil, rectF.right);
                        }
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void l(View view, Rect rect, float f, float f2) {
                        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
                    }
                };
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                carouselOrientationHelper = new CarouselOrientationHelper() { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
                    {
                        super(1);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
                        float f = rectF2.top;
                        float f2 = rectF3.top;
                        if (f < f2 && rectF2.bottom > f2) {
                            float f3 = f2 - f;
                            rectF.top += f3;
                            rectF3.top += f3;
                        }
                        float f4 = rectF2.bottom;
                        float f5 = rectF3.bottom;
                        if (f4 <= f5 || rectF2.top >= f5) {
                            return;
                        }
                        float f6 = f4 - f5;
                        rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
                        rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final float b(RecyclerView.LayoutParams layoutParams) {
                        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final RectF c(float f, float f2, float f3, float f4) {
                        return new RectF(BitmapDescriptorFactory.HUE_RED, f3, f2, f - f3);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int d() {
                        return this.b.o;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int e() {
                        return this.b.o;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int f() {
                        return this.b.L();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int g() {
                        CarouselLayoutManager carouselLayoutManager = this.b;
                        return carouselLayoutManager.n - carouselLayoutManager.M();
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int h() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final int i() {
                        return 0;
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void j(View view, int i2, int i3) {
                        int iL = this.b.L();
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                        RecyclerView.LayoutManager.X(view, iL, i2, RecyclerView.LayoutManager.G(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iL, i3);
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
                        if (rectF2.bottom <= rectF3.top) {
                            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                            rectF.bottom = fFloor;
                            rectF.top = Math.min(rectF.top, fFloor);
                        }
                        if (rectF2.top >= rectF3.bottom) {
                            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                            rectF.top = fCeil;
                            rectF.bottom = Math.max(fCeil, rectF.bottom);
                        }
                    }

                    @Override // com.google.android.material.carousel.CarouselOrientationHelper
                    public final void l(View view, Rect rect, float f, float f2) {
                        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
                    }
                };
            }
            this.y = carouselOrientationHelper;
            l1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int o(RecyclerView.State state) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void o0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.b() <= 0 || Y0() <= BitmapDescriptorFactory.HUE_RED) {
            w0(recycler);
            this.w = 0;
            return;
        }
        boolean zG1 = g1();
        int i = 1;
        boolean z = this.u == null;
        if (z) {
            k1(recycler);
        }
        KeylineStateList keylineStateList = this.u;
        boolean zG12 = g1();
        KeylineState keylineStateA = zG12 ? keylineStateList.a() : keylineStateList.c();
        float f = (zG12 ? keylineStateA.c() : keylineStateA.a()).f14539a;
        float f2 = keylineStateA.f14537a / 2.0f;
        int iH = (int) (this.y.h() - (g1() ? f + f2 : f - f2));
        KeylineStateList keylineStateList2 = this.u;
        boolean zG13 = g1();
        KeylineState keylineStateC = zG13 ? keylineStateList2.c() : keylineStateList2.a();
        KeylineState.Keyline keylineA = zG13 ? keylineStateC.a() : keylineStateC.c();
        int iB = (int) (((((state.b() - 1) * keylineStateC.f14537a) * (zG13 ? -1.0f : 1.0f)) - (keylineA.f14539a - this.y.h())) + (this.y.e() - keylineA.f14539a) + (zG13 ? -keylineA.g : keylineA.h));
        int iMin = zG13 ? Math.min(0, iB) : Math.max(0, iB);
        this.q = zG1 ? iMin : iH;
        if (zG1) {
            iMin = iH;
        }
        this.r = iMin;
        if (z) {
            this.p = iH;
            KeylineStateList keylineStateList3 = this.u;
            int iJ = J();
            int i2 = this.q;
            int i3 = this.r;
            boolean zG14 = g1();
            List list = keylineStateList3.b;
            List list2 = keylineStateList3.c;
            float f3 = keylineStateList3.f14540a.f14537a;
            HashMap map = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= iJ) {
                    break;
                }
                int i6 = zG14 ? (iJ - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (zG14 ? -1 : i7) > i3 - keylineStateList3.g || i4 >= iJ - list2.size()) {
                    map.put(Integer.valueOf(i6), (KeylineState) list2.get(MathUtils.b(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                int i11 = zG14 ? (iJ - i10) - 1 : i10;
                if (i11 * f3 * (zG14 ? -1 : i8) < i2 + keylineStateList3.f || i10 < list.size()) {
                    map.put(Integer.valueOf(i11), (KeylineState) list.get(MathUtils.b(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.x = map;
            int i12 = this.B;
            if (i12 != -1) {
                this.p = c1(i12, a1(i12));
            }
        }
        int i13 = this.p;
        int i14 = this.q;
        int i15 = this.r;
        this.p = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.w = MathUtils.b(this.w, 0, state.b());
        p1(this.u);
        s(recycler);
        X0(recycler, state);
        this.A = J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o1(View view, float f, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.f14534a;
            float f2 = keyline.c;
            KeylineState.Keyline keyline2 = keylineRange.b;
            float fB = AnimationUtils.b(f2, keyline2.c, keyline.f14539a, keyline2.f14539a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFC = this.y.c(height, width, AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, height / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, fB), AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, width / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, fB));
            float fV0 = V0(view, f, keylineRange);
            RectF rectF = new RectF(fV0 - (rectFC.width() / 2.0f), fV0 - (rectFC.height() / 2.0f), (rectFC.width() / 2.0f) + fV0, (rectFC.height() / 2.0f) + fV0);
            RectF rectF2 = new RectF(this.y.f(), this.y.i(), this.y.g(), this.y.d());
            this.t.getClass();
            this.y.a(rectFC, rectF, rectF2);
            this.y.k(rectFC, rectF, rectF2);
            ((Maskable) view).setMaskRectF(rectFC);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int p(RecyclerView.State state) {
        if (z() == 0 || this.u == null || J() <= 1) {
            return 0;
        }
        return (int) (this.o * (this.u.f14540a.f14537a / r(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void p0(RecyclerView.State state) {
        if (z() == 0) {
            this.w = 0;
        } else {
            this.w = RecyclerView.LayoutManager.O(y(0));
        }
    }

    public final void p1(KeylineStateList keylineStateList) {
        int i = this.r;
        int i2 = this.q;
        if (i <= i2) {
            this.v = g1() ? keylineStateList.a() : keylineStateList.c();
        } else {
            this.v = keylineStateList.b(this.p, i2, i, false);
        }
        List list = this.v.b;
        DebugItemDecoration debugItemDecoration = this.s;
        debugItemDecoration.getClass();
        debugItemDecoration.b = Collections.unmodifiableList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int q(RecyclerView.State state) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int r(RecyclerView.State state) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams v() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @SuppressLint
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = new DebugItemDecoration();
        this.w = 0;
        this.z = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new d(this.f14541a, 26));
            }
        };
        this.B = -1;
        this.C = 0;
        this.t = new MultiBrowseCarouselStrategy();
        l1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.i);
            this.C = typedArrayObtainStyledAttributes.getInt(0, 0);
            l1();
            n1(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
