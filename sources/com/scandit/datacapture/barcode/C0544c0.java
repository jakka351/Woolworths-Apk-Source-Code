package com.scandit.datacapture.barcode;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountScreenRatioForUi;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewInternalUiListener;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewLayerManager;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarViewHolder;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0544c0 implements BarcodeCountUiHandler {

    /* renamed from: a, reason: collision with root package name */
    private final N9 f17395a;
    private final W7 b;
    private final M6 c;
    private final Y5 d;
    private final InterfaceC0538ba e;
    private final InterfaceC0952zd f;
    private final Zd g;
    private final Sd h;
    private final xe i;
    private final InterfaceC0872u8 j;
    private final InterfaceC0588d8 k;
    private final BarcodeCountViewUiLayoutHelper l;
    private final BarcodeCountBasicOverlay m;
    private final String n;
    private O o;
    private BarcodeCountViewInternalUiListener p;
    private boolean q;
    private int r;
    private boolean s;
    private final Handler t;
    private BarcodeCountViewSettings u;
    private boolean v;
    private boolean w;
    private final Q x;

    public C0544c0(Z9 shutterButtonsWrapper, C0536b8 listButtonWrapper, S6 exitButtonWrapper, C0602e6 clearButtonWrapper, C0622fa singleScanButtonWrapper, Gd statusButtonWrapper, C0610ee torchButtonWrapper, Yd toolbarWrapper, De guidanceViewWrapper, C8 loadingViewWrapper, C0652h8 listProgressBarWrapper, C0692k0 layoutHelper, BarcodeCountBasicOverlay overlay, String loadingText) {
        Intrinsics.h(shutterButtonsWrapper, "shutterButtonsWrapper");
        Intrinsics.h(listButtonWrapper, "listButtonWrapper");
        Intrinsics.h(exitButtonWrapper, "exitButtonWrapper");
        Intrinsics.h(clearButtonWrapper, "clearButtonWrapper");
        Intrinsics.h(singleScanButtonWrapper, "singleScanButtonWrapper");
        Intrinsics.h(statusButtonWrapper, "statusButtonWrapper");
        Intrinsics.h(torchButtonWrapper, "torchButtonWrapper");
        Intrinsics.h(toolbarWrapper, "toolbarWrapper");
        Intrinsics.h(guidanceViewWrapper, "guidanceViewWrapper");
        Intrinsics.h(loadingViewWrapper, "loadingViewWrapper");
        Intrinsics.h(listProgressBarWrapper, "listProgressBarWrapper");
        Intrinsics.h(layoutHelper, "layoutHelper");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(loadingText, "loadingText");
        this.f17395a = shutterButtonsWrapper;
        this.b = listButtonWrapper;
        this.c = exitButtonWrapper;
        this.d = clearButtonWrapper;
        this.e = singleScanButtonWrapper;
        this.f = statusButtonWrapper;
        this.g = torchButtonWrapper;
        this.h = toolbarWrapper;
        this.i = guidanceViewWrapper;
        this.j = loadingViewWrapper;
        this.k = listProgressBarWrapper;
        this.l = layoutHelper;
        this.m = overlay;
        this.n = loadingText;
        this.t = new Handler(Looper.getMainLooper());
        this.u = new BarcodeCountViewSettings();
        this.x = new Q(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(C0544c0 this$0) {
        Intrinsics.h(this$0, "this$0");
        O o = this$0.o;
        if (o != null) {
            o.a(new C0528b0(this$0));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(O o) {
        this.o = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        this.v = true;
        this.w = true;
        O o = this.o;
        if (o != null) {
            o.a(false);
        }
        int i = this.r;
        if (i != 0) {
            this.t.postDelayed(new kf(this, 3), i);
            return;
        }
        O o2 = this.o;
        if (o2 != null) {
            o2.a(new C0528b0(this));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(BarcodeCountViewInternalUiListener barcodeCountViewInternalUiListener) {
        this.p = barcodeCountViewInternalUiListener;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final BarcodeCountViewInternalUiListener b() {
        return this.p;
    }

    public final void c(boolean z) {
        ((C0652h8) this.k).a(z);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void d() {
        ((Gd) this.f).a(false, (Function0) C0937yd.f18277a);
        ((Gd) this.f).a(C0922xd.f18266a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final boolean e() {
        return ((Yd) this.h).f();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final BarcodeCountToolbarViewHolder f() {
        return ((Yd) this.h).c();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void g() {
        ((Z9) this.f17395a).b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final int h() {
        return this.r;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void i() {
        this.l.c();
        ((Z9) this.f17395a).i();
        ((C0536b8) this.b).d();
        ((S6) this.c).d();
        ((C0602e6) this.d).d();
        ((C0622fa) this.e).c();
        ((Gd) this.f).e();
        ((C0610ee) this.g).b();
        ((Yd) this.h).h();
    }

    public final O j() {
        return this.o;
    }

    public final boolean k() {
        return this.q;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final boolean a() {
        return this.s;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void b(boolean z) {
        this.q = z;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void c() {
        De de = (De) this.i;
        de.getClass();
        de.c(false, "", we.f18254a);
        de.b(false, "", ve.f18242a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(boolean z) {
        this.s = z;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void b(int i) {
        this.r = i;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(BarcodeCountViewLayerManager layerManager, BarcodeCount mode, boolean z) {
        Intrinsics.h(layerManager, "layerManager");
        Intrinsics.h(mode, "mode");
        mode.getInternalListeners$scandit_barcode_capture().add(0, this.x);
        mode._setStatusListener$scandit_barcode_capture(new T(this));
        this.m.setGuidanceHandler$scandit_barcode_capture(new S(this));
        this.m.setViewHandler$scandit_barcode_capture(new P(this));
        this.m.setColorScheme$scandit_barcode_capture(((Yd) this.h).a());
        ((Z9) this.f17395a).a(new V(this));
        ((C0536b8) this.b).b(new W(this));
        ((S6) this.c).a(new X(this));
        ((C0602e6) this.d).a(new Y(this));
        ((C0622fa) this.e).a(new Z(this));
        ((Gd) this.f).a(z);
        ((Gd) this.f).a(new C0512a0(this));
        ((Yd) this.h).a(new U(this));
        this.l.c();
        ((Z9) this.f17395a).e();
        ((C0536b8) this.b).b();
        ((S6) this.c).b();
        ((C0602e6) this.d).b();
        ((C0622fa) this.e).a();
        ((Gd) this.f).c();
        ((Yd) this.h).e();
        ((C0652h8) this.k).b();
        ((De) this.i).c();
        ((C8) this.j).c();
        ((De) this.i).b();
        ((C8) this.j).b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void b(BarcodeCountViewSettings viewSettings) {
        Intrinsics.h(viewSettings, "viewSettings");
        this.u = viewSettings;
        this.m.setShouldShowScanAreaGuides(viewSettings.q());
        this.m.setRecognizedBrush(this.u.i());
        this.m.setUnrecognizedBrush(this.u.J());
        this.m.setNotInListBrush(this.u.h());
        this.m.setShouldShowHints(this.u.n());
        this.m.setFilterSettings(this.u.e());
        this.m.setTextForUnscannedBarcodesDetectedHint(this.u.G());
        this.m.setTextForBarcodesNotInListDetectedHint(this.u.A());
        this.m.setTextForTapShutterToScanHint(this.u.E());
        this.m.setTextForScanningHint(this.u.D());
        this.m.setTextForMoveCloserAndRescanHint(this.u.B());
        this.m.setTextForMoveFurtherAndRescanHint(this.u.C());
        this.m.setTextForTapToUncountHint(this.u.F());
        ((Z9) this.f17395a).b(this.u.r());
        ((Z9) this.f17395a).a(this.u.m());
        ((Z9) this.f17395a).b(this.u.x());
        ((Z9) this.f17395a).a(this.u.f());
        ((C0536b8) this.b).a(this.u.o());
        ((C0536b8) this.b).a(this.u.g());
        ((S6) this.c).a(this.u.l());
        ((S6) this.c).b(this.u.d());
        ((S6) this.c).a(this.u.c());
        ((C0602e6) this.d).a(this.u.k());
        ((C0602e6) this.d).b(this.u.b());
        ((C0602e6) this.d).a(this.u.a());
        ((C0622fa) this.e).a(this.u.s());
        ((C0622fa) this.e).a(this.u.y());
        ((Gd) this.f).b(this.u.t());
        ((Gd) this.f).a(this.u.z());
        Zd zd = this.g;
        SetBuilder setBuilder = new SetBuilder();
        if (this.u.s()) {
            setBuilder.add(Anchor.BOTTOM_LEFT);
        }
        if (this.u.t()) {
            setBuilder.add(Anchor.BOTTOM_RIGHT);
        }
        ((C0610ee) zd).a(SetsKt.a(setBuilder));
        ((C0610ee) this.g).a(this.u.v());
        ((C0610ee) this.g).a(this.u.I());
        ((Yd) this.h).c(this.u.u());
        ((Yd) this.h).a(this.u.H());
        ((Yd) this.h).b(this.u.m());
        ((De) this.i).a(this.u.w());
        ((C8) this.j).a(this.u.w());
        ((C0652h8) this.k).b(this.u.p());
    }

    public static final void a(C0544c0 c0544c0) {
        ((De) c0544c0.i).a(false, "", ue.f18225a);
        De de = (De) c0544c0.i;
        de.getClass();
        de.c(false, "", we.f18254a);
        de.b(false, "", ve.f18242a);
        ((C8) c0544c0.j).b(false, "", (Function0) C0849t8.f18140a);
        ((C8) c0544c0.j).a(false, "", (Function0) C0827s8.f18002a);
        ((C8) c0544c0.j).a(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(int i) {
        ((C0652h8) this.k).c();
        ((C0652h8) this.k).a(0, i);
    }

    public static final void a(C0544c0 c0544c0, boolean z) {
        ((Z9) c0544c0.f17395a).h();
        ((Z9) c0544c0.f17395a).a(z);
        ((Z9) c0544c0.f17395a).i();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(Size screenSize, Size previewSize) {
        Intrinsics.h(screenSize, "screenSize");
        Intrinsics.h(previewSize, "previewSize");
        this.l.a(previewSize);
        ((Z9) this.f17395a).g();
        i();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(boolean z, boolean z2) {
        ((Yd) this.h).a(z && (z2 || this.l.g() == BarcodeCountScreenRatioForUi.SMALL || this.s));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(BarcodeCountFeedback feedback) {
        Intrinsics.h(feedback, "feedback");
        ((Yd) this.h).a(feedback);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(BarcodeCount mode) {
        Intrinsics.h(mode, "mode");
        ((Yd) this.h).a(mode);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountUiHandler
    public final void a(BarcodeCountViewSettings viewSettings) {
        Intrinsics.h(viewSettings, "viewSettings");
        viewSettings.d(((Yd) this.h).f());
    }
}
