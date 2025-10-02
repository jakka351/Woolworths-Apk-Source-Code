package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.C0684j8;
import com.scandit.datacapture.barcode.C0946z7;
import com.scandit.datacapture.barcode.Gc;
import com.scandit.datacapture.barcode.InterfaceC0769od;
import com.scandit.datacapture.barcode.Na;
import com.scandit.datacapture.barcode.Pa;
import com.scandit.datacapture.barcode.Qa;
import com.scandit.datacapture.barcode.Ra;
import com.scandit.datacapture.barcode.Sc;
import com.scandit.datacapture.barcode.Ua;
import com.scandit.datacapture.barcode.Va;
import com.scandit.datacapture.barcode.Wa;
import com.scandit.datacapture.barcode.Za;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.LogoStyle;
import com.scandit.datacapture.core.ui.gesture.FocusGesture;
import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SparkScanViewMiniPreview extends RelativeLayout implements InterfaceC0769od, Za {
    private final DataCaptureContext b;
    private final SparkScanStateManager c;
    private Pa d;
    private Na e;
    private Ua f;
    private Qa g;
    private DataCaptureView h;
    private final Wa i;
    private final C0684j8 j;
    private ViewPropertyAnimator k;
    private final C0946z7 l;
    private boolean m;
    private Brush n;
    private boolean o;
    private boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkScanViewMiniPreview(Context context, DataCaptureContext dataCaptureContext, SparkScan sparkScan, SparkScanStateManager stateManager) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(stateManager, "stateManager");
        this.b = dataCaptureContext;
        this.c = stateManager;
        this.j = new C0684j8(context);
        C0946z7 c0946z7 = new C0946z7(context);
        c0946z7.setVisibility(8);
        this.l = c0946z7;
        this.n = Sc.a();
        this.o = SparkScanViewDefaults.getDefaultZoomSwitchControlVisible();
        this.p = SparkScanViewDefaults.getDefaultPreviewSizeControlVisible();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Gc.k());
        gradientDrawable.setShape(0);
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setDescendantFocusability(393216);
        setVisibility(4);
        this.i = Va.a(sparkScan.get_sparkScanInternal());
        a(stateManager.m());
        a(this.n);
    }

    public final void a(Ra ra) {
        Ua ua = this.f;
        if (ua == null) {
            Intrinsics.p("zoomer");
            throw null;
        }
        ua.a(ra);
        Pa pa = this.d;
        if (pa != null) {
            pa.a(ra);
        } else {
            Intrinsics.p("sizer");
            throw null;
        }
    }

    public final void b(boolean z) {
        this.i.setShouldShowScanAreaGuides(z);
    }

    public final boolean c() {
        return this.i.getShouldShowScanAreaGuides();
    }

    public final void g() {
        if (getVisibility() == 4) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.k = animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(this.m ? 500L : 0L).setStartDelay(this.m ? 500L : 0L).withStartAction(new a(this, 0)).withEndAction(new a(this, 1));
    }

    public final void h() {
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            setAlpha(1.0f);
            this.m = true;
            g();
        }
    }

    public final void i() {
        this.m = true;
    }

    public final void j() {
        this.l.bringToFront();
        this.l.setVisibility(0);
    }

    public final void k() {
        this.j.setAlpha(0.95f);
        this.j.setVisibility(0);
    }

    public final void l() {
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.k = null;
        setAlpha(1.0f);
        if (getVisibility() != 0) {
            DataCaptureView dataCaptureView = this.h;
            if (dataCaptureView != null) {
                dataCaptureView.removeOverlay(this.i);
                removeView(dataCaptureView);
            }
            DataCaptureView.Companion companion = DataCaptureView.INSTANCE;
            Context context = getContext();
            Intrinsics.g(context, "context");
            DataCaptureView dataCaptureViewNewInstance = companion.newInstance(context, this.b);
            dataCaptureViewNewInstance.setZoomGesture(null);
            dataCaptureViewNewInstance.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            dataCaptureViewNewInstance.setLogoStyle(LogoStyle.MINIMAL);
            dataCaptureViewNewInstance.setLogoAnchor(Anchor.TOP_LEFT);
            this.h = dataCaptureViewNewInstance;
            addView(dataCaptureViewNewInstance, new RelativeLayout.LayoutParams(-1, -1));
            DataCaptureView dataCaptureView2 = this.h;
            if (dataCaptureView2 != null) {
                dataCaptureView2.addOverlay(this.i);
            }
            setVisibility(0);
        }
        n();
        Na na = this.e;
        if (na == null) {
            Intrinsics.p("positioner");
            throw null;
        }
        DeviceOrientation deviceOrientationK = this.c.k();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        na.a(deviceOrientationK, (RelativeLayout.LayoutParams) layoutParams);
        Ua ua = this.f;
        if (ua != null) {
            ua.a(this.o);
        }
        Pa pa = this.d;
        if (pa != null) {
            pa.a(this.p);
        }
        a(this.c.m());
    }

    public final void m() {
        FocusGesture focusGesture;
        DataCaptureView dataCaptureView = this.h;
        if (dataCaptureView == null || (focusGesture = dataCaptureView.getFocusGesture()) == null) {
            return;
        }
        focusGesture.triggerFocus(PointWithUnitUtilsKt.PointWithUnit(0.5f, 0.5f, MeasureUnit.FRACTION));
    }

    public final void n() {
        Pa pa = this.d;
        if (pa == null) {
            Intrinsics.p("sizer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        pa.a((ViewGroup.MarginLayoutParams) layoutParams, this.c.e(), this.c.v());
        e(this.c.u());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Ua ua = this.f;
        if (ua == null) {
            Intrinsics.p("zoomer");
            throw null;
        }
        ua.a((Ra) null);
        Pa pa = this.d;
        if (pa == null) {
            Intrinsics.p("sizer");
            throw null;
        }
        pa.a((Ra) null);
        this.c.b(this);
        removeAllViews();
    }

    public final boolean b() {
        return this.p;
    }

    public final void c(boolean z) {
        this.i.c(z);
    }

    public final boolean d() {
        return this.o;
    }

    public final void e() {
        this.l.setVisibility(8);
    }

    public final void f() {
        this.j.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SparkScanViewMiniPreview this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SparkScanViewMiniPreview this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.setVisibility(4);
        this$0.removeView(this$0.h);
        this$0.i.a();
        this$0.k = null;
    }

    public final void d(boolean z) {
        this.o = z;
        Ua ua = this.f;
        if (ua == null) {
            return;
        }
        ua.a(z);
    }

    public final void e(boolean z) {
        Ua ua = this.f;
        if (ua != null) {
            ua.a(z, this.c.e());
        } else {
            Intrinsics.p("zoomer");
            throw null;
        }
    }

    public final void a(boolean z) {
        this.p = z;
        Pa pa = this.d;
        if (pa == null) {
            return;
        }
        pa.a(z);
    }

    public final void b(Brush value) {
        Intrinsics.h(value, "value");
        this.i.setBrush(value);
        this.n = value;
    }

    public final void a(ViewGroup container, SparkScanViewSettings settings) {
        Intrinsics.h(container, "container");
        Intrinsics.h(settings, "settings");
        SparkScanViewMiniPreviewDimension dimension = settings.getPreviewDimension();
        Intrinsics.h(dimension, "dimension");
        this.d = new Pa(this, container, dimension);
        this.e = new Na();
        this.f = new Ua(this);
        this.g = new Qa(this);
        container.addView(this);
        this.c.a(this);
        addView(this.j, new RelativeLayout.LayoutParams(-1, -1));
        addView(this.l, new RelativeLayout.LayoutParams(-1, -1));
        post(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(SparkScanViewMiniPreview this$0) {
        Intrinsics.h(this$0, "this$0");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        this$0.setId(Gc.r());
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        this$0.setLayoutParams(layoutParams);
        this$0.n();
        Na na = this$0.e;
        if (na != null) {
            DeviceOrientation deviceOrientationK = this$0.c.k();
            ViewGroup.LayoutParams layoutParams2 = this$0.getLayoutParams();
            Intrinsics.f(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            na.a(deviceOrientationK, (RelativeLayout.LayoutParams) layoutParams2);
            Ua ua = this$0.f;
            if (ua != null) {
                ua.a(this$0.o);
            }
            Pa pa = this$0.d;
            if (pa != null) {
                pa.a(this$0.p);
            }
            this$0.e(this$0.c.u());
            this$0.requestLayout();
            return;
        }
        Intrinsics.p("positioner");
        throw null;
    }

    public final void a(Brush brush, boolean z) {
        Intrinsics.h(brush, "brush");
        this.i.a(brush);
        this.i.a(z);
    }

    private final void a(Brush brush) {
        this.i.setBrush(brush);
    }

    @Override // com.scandit.datacapture.barcode.Za
    public final void a(SparkScanScanningMode previousMode, SparkScanScanningMode newMode) {
        Intrinsics.h(previousMode, "previousMode");
        Intrinsics.h(newMode, "newMode");
        a(newMode);
    }

    private final void a(SparkScanScanningMode sparkScanScanningMode) {
        this.i.b(sparkScanScanningMode instanceof SparkScanScanningMode.Target);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0769od
    public final void a(int i, int i2, String text) {
        Intrinsics.h(text, "text");
        h();
        Qa qa = this.g;
        if (qa != null) {
            qa.a(i, i2, text);
        } else {
            Intrinsics.p("toastViewHolder");
            throw null;
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0769od
    public final void a() {
        Qa qa = this.g;
        if (qa != null) {
            qa.a();
        } else {
            Intrinsics.p("toastViewHolder");
            throw null;
        }
    }
}
