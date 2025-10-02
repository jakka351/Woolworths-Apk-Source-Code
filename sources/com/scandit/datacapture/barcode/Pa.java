package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreviewDimension;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class Pa {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewMiniPreviewDimension f17271a;
    private Ra b;
    private final WeakReference c;
    private final WeakReference d;
    private final La e;

    public Pa(SparkScanViewMiniPreview container, View parentContainer, SparkScanViewMiniPreviewDimension dimension) {
        Intrinsics.h(container, "container");
        Intrinsics.h(parentContainer, "parentContainer");
        Intrinsics.h(dimension, "dimension");
        this.f17271a = dimension;
        this.c = new WeakReference(container);
        this.d = new WeakReference(parentContainer);
        Context context = container.getContext();
        Intrinsics.g(context, "container.context");
        La la = new La(context);
        la.setOnClickListener(new df(this, 6));
        this.e = la;
    }

    private static final void a(Pa this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Ra ra = this$0.b;
        if (ra != null) {
            ((SparkScanViewPresenter) ra).x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-minipreview-SparkScanViewMiniPreview-Landroid-view-View-Lcom-scandit-datacapture-barcode-internal-module-spark-ui-minipreview-SparkScanViewMiniPreviewDimension--V, reason: not valid java name */
    public static /* synthetic */ void m284x4d4c25ee(Pa pa, View view) {
        Callback.g(view);
        try {
            a(pa, view);
        } finally {
            Callback.h();
        }
    }

    public final void a(Ra ra) {
        this.b = ra;
    }

    public final void a(boolean z) {
        ViewGroup viewGroup;
        if (!z) {
            if (z || (viewGroup = (ViewGroup) this.c.get()) == null) {
                return;
            }
            viewGroup.removeView(this.e);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.c.get();
        if (viewGroup2 != null) {
            if (viewGroup2.indexOfChild(this.e) > 0) {
                this.e.bringToFront();
                return;
            }
            La la = this.e;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Gc.i(), Gc.i());
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            viewGroup2.addView(la, layoutParams);
        }
    }

    public final void a(ViewGroup.MarginLayoutParams layoutParams, boolean z, boolean z2) {
        View view;
        int iT;
        Pair pair;
        Pair pairA;
        Intrinsics.h(layoutParams, "layoutParams");
        La la = this.e;
        la.b(z);
        la.a(z);
        if (z) {
            View view2 = (View) this.d.get();
            if (view2 == null) {
                return;
            }
            Pair pairA2 = a(view2, z2);
            int iIntValue = ((Number) pairA2.d).intValue();
            int iIntValue2 = ((Number) pairA2.e).intValue();
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            layoutParams.setMarginStart(Gc.j());
            layoutParams.topMargin = Gc.l();
            layoutParams.bottomMargin = Gc.f();
            layoutParams.setMarginEnd(Gc.j());
            return;
        }
        if (z || (view = (View) this.d.get()) == null) {
            return;
        }
        if (this.f17271a == SparkScanViewMiniPreviewDimension.LARGE) {
            pairA = a(view, z2);
        } else {
            int iMin = Integer.min(view.getWidth(), view.getHeight());
            int iMax = Math.max(view.getWidth(), view.getHeight());
            SparkScanViewMiniPreviewDimension sparkScanViewMiniPreviewDimension = this.f17271a;
            int[] iArr = Oa.f17259a;
            int i = iArr[sparkScanViewMiniPreviewDimension.ordinal()] == 1 ? iMin / 2 : (int) (iMin / 1.5d);
            if (iArr[this.f17271a.ordinal()] == 1) {
                iT = Gc.u();
            } else {
                iT = Gc.t();
            }
            int iW = Gc.w();
            if (i <= 0) {
                pair = new Pair(Integer.valueOf(iT), Integer.valueOf(iT));
            } else if (z2) {
                pair = new Pair(Integer.valueOf(RangesKt.c(i - Gc.j(), iW, iT)), Integer.valueOf(RangesKt.c(i - Gc.l(), iW, iT)));
            } else {
                int iMin2 = Integer.min((iMax / 2) - Gc.l(), iT);
                if (iMin2 < iW) {
                    iMin2 = iW;
                }
                int iC = RangesKt.c(i, iW, iMin2);
                pair = new Pair(Integer.valueOf(iC), Integer.valueOf(iC));
            }
            pairA = pair;
        }
        int iIntValue3 = ((Number) pairA.d).intValue();
        int iIntValue4 = ((Number) pairA.e).intValue();
        layoutParams.width = iIntValue3;
        layoutParams.height = iIntValue4;
        layoutParams.topMargin = Gc.l();
        layoutParams.bottomMargin = Gc.f();
        layoutParams.setMarginEnd(Gc.j());
        layoutParams.setMarginStart(Gc.j());
    }

    private static Pair a(View view, boolean z) {
        if (z) {
            int height = ((view.getHeight() / 2) - Gc.l()) - Gc.q();
            int width = view.getWidth() - (Gc.j() * 2);
            int iS = Gc.s();
            if (width > iS) {
                width = iS;
            }
            Integer numValueOf = Integer.valueOf(width);
            int iS2 = Gc.s();
            if (height > iS2) {
                height = iS2;
            }
            return new Pair(numValueOf, Integer.valueOf(height));
        }
        return new Pair(Integer.valueOf(Integer.min(view.getWidth() / 2, Gc.s()) - (Gc.j() * 2)), Integer.valueOf(Integer.min(view.getHeight(), Gc.s()) - (Gc.j() * 2)));
    }
}
