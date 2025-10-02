package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.BounceInterpolator;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.AbstractC0525ad;
import com.scandit.datacapture.barcode.AbstractC0784pd;
import com.scandit.datacapture.barcode.C0656hc;
import com.scandit.datacapture.barcode.Gc;
import com.scandit.datacapture.barcode.Pc;
import com.scandit.datacapture.barcode.Zc;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewUISettings;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewState;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewHandMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.source.CameraPosition;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SparkScanViewScanButtonView extends RelativeLayout {
    private final SparkScanViewScanButtonTouchListener b;
    private final SparkScanViewSettings c;
    private final SparkScanViewCameraManager d;
    private final SparkScanStateManager e;
    private final SparkScanViewUISettings f;
    private C0656hc g;
    private Pc h;
    private Zc i;
    private ViewGroup j;
    private boolean k;
    private boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkScanViewScanButtonView(Context context, SparkScanViewScanButtonTouchListener scanButtonTouchListener, SparkScanViewSettings settings, SparkScanViewCameraManager cameraManager, SparkScanStateManager stateManager, SparkScanViewUISettings uiSettings) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(cameraManager, "cameraManager");
        Intrinsics.h(stateManager, "stateManager");
        Intrinsics.h(uiSettings, "uiSettings");
        this.b = scanButtonTouchListener;
        this.c = settings;
        this.d = cameraManager;
        this.e = stateManager;
        this.f = uiSettings;
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Pc pc = this.h;
        ViewGroup.LayoutParams layoutParams = pc != null ? pc.getLayoutParams() : null;
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int i = AbstractC0525ad.f17379a[this.e.c().ordinal()];
            if (i == 1) {
                layoutParams2.removeRule(9);
                layoutParams2.addRule(11);
            } else if (i == 2) {
                layoutParams2.removeRule(11);
                layoutParams2.addRule(9);
            }
            ViewParent parent = getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            layoutParams2.width = b((ViewGroup) parent);
        }
    }

    public final void d() {
        Pc pc = this.h;
        if (pc != null) {
            pc.a((this.e.a() != CameraPosition.USER_FACING && this.f.t() && (this.d.isTorchAvailable() || this.d.a() == null)) ? 0 : 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = null;
        this.f.l().clear();
        Pc pc = this.h;
        if (pc != null) {
            pc.a();
        }
        Pc pc2 = this.h;
        if (pc2 != null) {
            pc2.removeAllViews();
        }
        this.h = null;
        C0656hc c0656hc = this.g;
        if (c0656hc != null) {
            c0656hc.a();
        }
        C0656hc c0656hc2 = this.g;
        if (c0656hc2 != null) {
            c0656hc2.removeAllViews();
        }
        this.g = null;
        this.b.a(false);
        this.l = true;
        removeAllViews();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2 / 2;
        if (f <= BitmapDescriptorFactory.HUE_RED || this.e.l() >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.b.a(f);
        a((RelativeLayout) this.g, f, false);
    }

    public static final /* synthetic */ void a(SparkScanViewScanButtonView sparkScanViewScanButtonView, Pc pc, float f) {
        sparkScanViewScanButtonView.getClass();
        a((RelativeLayout) pc, f, true);
    }

    public final void c() {
        this.k = true;
    }

    public final Pc a() {
        return this.h;
    }

    public final void b() {
        Pc pc = this.h;
        if (pc != null) {
            pc.c();
        }
    }

    public final void a(boolean z) {
        this.l = z;
    }

    public final void b(NativeSparkScanViewState state) {
        Intrinsics.h(state, "state");
        Pc pc = this.h;
        if (pc != null) {
            pc.b(state);
        }
        e();
    }

    public final void a(ViewGroup container) {
        Intrinsics.h(container, "container");
        this.j = container;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.width = -1;
        layoutParams.height = -1;
        container.addView(this, layoutParams);
        this.f.l().add(new a(this));
    }

    public final void b(boolean z) {
        float fA;
        Pc pc = this.h;
        if (pc != null) {
            pc.a();
        }
        Pc pc2 = this.h;
        if (pc2 != null) {
            pc2.removeAllViews();
        }
        this.h = null;
        removeAllViews();
        SparkScanViewHandMode sparkScanViewHandModeC = this.e.c();
        this.b.a(false);
        Context context = getContext();
        Intrinsics.g(context, "context");
        C0656hc c0656hc = new C0656hc(context);
        c0656hc.a(this.b, sparkScanViewHandModeC, this.f, this.i);
        this.g = c0656hc;
        int iC = Gc.c();
        int iB = Gc.b();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iC, iB);
        layoutParams.width = iC;
        layoutParams.height = iB;
        layoutParams.height = Gc.b();
        if (sparkScanViewHandModeC == SparkScanViewHandMode.LEFT) {
            layoutParams.addRule(9);
            layoutParams.removeRule(11);
        } else {
            layoutParams.addRule(11);
            layoutParams.removeRule(9);
        }
        addView(c0656hc, layoutParams);
        if (z) {
            C0656hc c0656hc2 = this.g;
            View view = this.j;
            if (view != null) {
                int height = a(view).getHeight();
                if (this.l) {
                    this.l = false;
                    fA = this.e.l();
                } else if (height <= 0) {
                    fA = this.e.l();
                } else {
                    fA = this.b.a(height);
                }
                a((RelativeLayout) c0656hc2, fA, false);
                return;
            }
            Intrinsics.p("container");
            throw null;
        }
    }

    public final void a(SparkScanViewPresenter sparkScanViewPresenter) {
        this.i = sparkScanViewPresenter;
    }

    public final void a(NativeSparkScanViewState viewState) {
        Intrinsics.h(viewState, "viewState");
        C0656hc c0656hc = this.g;
        if (c0656hc != null) {
            c0656hc.a();
        }
        C0656hc c0656hc2 = this.g;
        if (c0656hc2 != null) {
            c0656hc2.removeAllViews();
        }
        this.g = null;
        this.b.a(true);
        Pc pc = this.h;
        if (pc == null) {
            removeAllViews();
            Context context = getContext();
            Intrinsics.g(context, "context");
            Pc pc2 = new Pc(context);
            pc2.a(viewState, this.i, this.b, this.c, this.f, this.e);
            this.h = pc2;
            d();
            View view = this.h;
            ViewParent parent = getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int iB = b((ViewGroup) parent);
            int iM = Gc.m();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iB, iM);
            layoutParams.width = iB;
            layoutParams.height = iM;
            int i = AbstractC0525ad.f17379a[this.e.c().ordinal()];
            if (i == 1) {
                layoutParams.removeRule(9);
                layoutParams.addRule(11);
            } else if (i == 2) {
                layoutParams.removeRule(11);
                layoutParams.addRule(9);
            }
            addView(view, layoutParams);
            View view2 = this.j;
            if (view2 != null) {
                a((RelativeLayout) this.h, this.b.b(a(view2).getHeight()), false);
            } else {
                Intrinsics.p("container");
                throw null;
            }
        } else {
            pc.b(viewState);
            e();
        }
        b bVar = new b(this);
        if (this.k) {
            post(new androidx.compose.ui.viewinterop.a(5, bVar));
            this.k = false;
        } else {
            bVar.invoke();
        }
    }

    private final int b(ViewGroup viewGroup) {
        SparkScanViewUISettings sparkScanViewUISettings = this.f;
        Intrinsics.h(sparkScanViewUISettings, "<this>");
        int iP = AbstractC0784pd.a(sparkScanViewUISettings) > 0 ? 0 : Gc.p();
        Size sizeA = a((View) viewGroup);
        boolean zV = this.e.v();
        if (zV) {
            int width = ((int) (sizeA.getWidth() * 0.8f)) - iP;
            int iV = Gc.v();
            return width > iV ? iV : width;
        }
        if (!zV) {
            return Integer.min(Gc.v(), sizeA.getWidth() / 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final Size a(View view) {
        if (this.e.v()) {
            return new Size(Integer.min(view.getWidth(), view.getHeight()), Math.max(view.getWidth(), view.getHeight()));
        }
        return new Size(Math.max(view.getWidth(), view.getHeight()), Integer.min(view.getWidth(), view.getHeight()));
    }

    private static void a(RelativeLayout relativeLayout, float f, boolean z) {
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.animate().y(f).setInterpolator(new BounceInterpolator()).setDuration(z ? 600L : 0L).start();
    }
}
