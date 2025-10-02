package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewDefaults;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintPresenterV2;
import com.scandit.datacapture.core.internal.sdk.ui.hint.ToastHint;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P1 implements BarcodeFindViewLayout {
    private static final C0661i1 v = new C0661i1(0);
    private static final Lazy w = LazyKt.b(C0629g1.f17675a);
    private static final Lazy x = LazyKt.b(C0597e1.f17624a);
    private static final Lazy y = LazyKt.b(C0613f1.f17634a);
    private static final Lazy z = LazyKt.b(C0645h1.f17693a);

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureView f17264a;
    private final X0 b;
    private final F0 c;
    private final re d;
    private final ShutterButtonWrapper e;
    private final ExitButtonWrapper f;
    private final C0552c8 g;
    private final S5 h;
    private final HintHolderV2 i;
    private final HintPresenterV2 j;
    private final Ie k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;

    /* JADX WARN: Multi-variable type inference failed */
    public P1(Context context, BarcodeFindViewSettings settings, DataCaptureView dataCaptureView, X0 torchController) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        RelativeLayout.LayoutParams layoutParams3;
        Intrinsics.h(context, "context");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(dataCaptureView, "dataCaptureView");
        Intrinsics.h(torchController, "torchController");
        this.f17264a = dataCaptureView;
        this.b = torchController;
        dataCaptureView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        F0 f0 = new F0(context);
        f0.setId(R.id.sc_dots_view);
        f0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        f0.a(settings.getInListItemColor());
        f0.b(settings.getNotInListItemColor());
        this.c = f0;
        re reVar = new re(context);
        reVar.setId(R.id.sc_guidance_view);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 17;
        reVar.setLayoutParams(layoutParams4);
        reVar.setVisibility(8);
        this.d = reVar;
        InterfaceC0933y9 interfaceC0933y9A = C0918x9.a(context);
        Fe fe = Ge.f17176a;
        this.e = F9.a(interfaceC0933y9A, W0.a(fe));
        this.f = K6.a(G6.a(context), AbstractC0780p9.a(fe));
        C0552c8 c0552c8 = new C0552c8(context);
        C0661i1 c0661i1 = v;
        c0552c8.setId(C0661i1.d(c0661i1));
        if (ViewExtensionsKt.getOrientation(c0552c8) == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(10);
            layoutParams.setMargins(C0661i1.c(c0661i1), C0661i1.c(c0661i1), C0661i1.c(c0661i1), 0);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(C0661i1.b(c0661i1), -2);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
            layoutParams.setMargins(C0661i1.c(c0661i1), C0661i1.c(c0661i1), C0661i1.c(c0661i1), 0);
        }
        c0552c8.setLayoutParams(layoutParams);
        c0552c8.b(0);
        c0552c8.a(0);
        c0552c8.setVisibility(8);
        this.g = c0552c8;
        S5 s5 = new S5(context);
        s5.setId(R.id.sc_carousel_view);
        if (ViewExtensionsKt.getOrientation(s5) == 1) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(2, B9.a());
            layoutParams2.addRule(3, C0661i1.d(c0661i1));
            layoutParams2.setMargins(C0661i1.a(c0661i1), C0661i1.c(c0661i1), C0661i1.a(c0661i1), C0661i1.c(c0661i1));
        } else {
            layoutParams2 = new RelativeLayout.LayoutParams(C0661i1.b(c0661i1), -1);
            layoutParams2.addRule(3, C0661i1.d(c0661i1));
            layoutParams2.addRule(14);
            layoutParams2.setMargins(0, C0661i1.c(c0661i1), 0, C0661i1.c(c0661i1));
        }
        s5.setLayoutParams(layoutParams2);
        s5.setVisibility(4);
        this.h = s5;
        HintHolderV2 hintHolderV2Implementation = HintHolderV2.INSTANCE.implementation(context);
        Intrinsics.f(hintHolderV2Implementation, "null cannot be cast to non-null type android.view.View");
        View view = (View) hintHolderV2Implementation;
        if (ViewExtensionsKt.getOrientation(view) == 1) {
            layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.addRule(3, C0661i1.d(c0661i1));
        } else {
            layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        }
        view.setLayoutParams(layoutParams3);
        this.i = hintHolderV2Implementation;
        this.j = new HintPresenterV2(hintHolderV2Implementation);
        this.k = new Ie(new C0514a2(), O1.f17253a);
        this.l = true;
        this.m = true;
        this.p = true;
        this.q = BarcodeFindViewDefaults.getDefaultTextForCollapseCardsButton();
        this.r = true;
        this.s = true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void g() {
        this.u = true;
        if (this.t) {
            ViewExtensionsKt.runOnMainThread(this.f17264a, new J1(this));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean getShouldShowHints() {
        return this.r;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean h() {
        return this.p;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final Anchor i() {
        return ((C0581d1) this.b).e();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean j() {
        return this.s;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void k() {
        ViewExtensionsKt.runOnMainThread(this.d, new C0693k1(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void l() {
        this.f.a();
        this.e.a();
        this.k.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void m() {
        this.e.a(C0820s1.f17998a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final PointF mapFramePointToView(Point point) {
        Intrinsics.h(point, "point");
        Point pointMapFramePointToView = this.f17264a.mapFramePointToView(point);
        return new PointF(pointMapFramePointToView.getX(), pointMapFramePointToView.getY());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void n() {
        ViewExtensionsKt.runOnMainThread(this.f17264a, new C0725m1(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean o() {
        return this.n;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final String p() {
        return this.q;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void setShouldShowHints(boolean z2) {
        this.r = z2;
        if (z2) {
            return;
        }
        this.j.hideAllToasts();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(boolean z2) {
        this.l = z2;
        this.e.a(new B1(z2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean b() {
        return this.l;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean c() {
        return this.t;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void d(boolean z2) {
        if (this.p == z2) {
            return;
        }
        this.p = z2;
        if (!z2) {
            ViewExtensionsKt.runOnMainThread(this.h, new C0925y1(this));
        } else if (this.o) {
            ViewExtensionsKt.runOnMainThread(this.h, new C0940z1(this));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final boolean e() {
        return this.m;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void f(boolean z2) {
        ViewExtensionsKt.runOnMainThread(this.c, new C0772p1(this, z2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void h(boolean z2) {
        this.s = z2;
        ViewExtensionsKt.runOnMainThread(this.d, new F1(this, z2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void b(boolean z2) {
        this.n = z2;
        ViewExtensionsKt.runOnMainThread(this.g, new C1(this, z2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void c(boolean z2) {
        this.t = z2;
        if (z2 && this.u) {
            ViewExtensionsKt.runOnMainThread(this.f17264a, new D1(this));
        } else {
            ViewExtensionsKt.runOnMainThread(this.f17264a, new E1(this));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void e(boolean z2) {
        this.m = z2;
        this.f.a(new A1(z2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void f() {
        this.u = false;
        ViewExtensionsKt.runOnMainThread(this.f17264a, new C0709l1(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(String text) {
        Intrinsics.h(text, "text");
        if (this.s) {
            ViewExtensionsKt.runOnMainThread(this.d, new I1(this, text));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void b(String text) {
        Intrinsics.h(text, "text");
        if (this.s) {
            ViewExtensionsKt.runOnMainThread(this.d, new H1(this, text));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void g(boolean z2) {
        this.e.a(new C0805r1(z2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(Anchor anchor) {
        Intrinsics.h(anchor, "<set-?>");
        ((C0581d1) this.b).b(anchor);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(RelativeLayout parent, InterfaceC0708l0 overlay) {
        Intrinsics.h(parent, "parent");
        Intrinsics.h(overlay, "overlay");
        overlay.a(this.c);
        overlay.a(this.d);
        parent.addView(this.f17264a);
        this.e.a(parent, new G9(this.l));
        this.f.a(parent, new L6(this.m));
        this.k.a(parent);
        parent.addView(this.g);
        parent.addView(this.h);
        Object obj = this.i;
        Intrinsics.f(obj, "null cannot be cast to non-null type android.view.View");
        parent.addView((View) obj);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void b(BarcodeFindItem item) {
        Intrinsics.h(item, "item");
        ViewExtensionsKt.runOnMainThread(this.h, new C0741n1(this, item));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void d(String str) {
        this.q = str;
        ViewExtensionsKt.runOnMainThread(this.h, new L1(this, str));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void c(String tag) {
        Intrinsics.h(tag, "tag");
        this.j.hideToast(tag);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void d() {
        this.e.a(C0842t1.f18135a);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = this.f17264a.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(-i, -i2, -i3, -i4);
        }
        this.f17264a.setLogoOffset(PointWithUnitUtilsKt.PointWithUnit(-i3, -i4, MeasureUnit.PIXEL));
        ((C0581d1) this.b).a(i, i2, i3, i4);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(ArrayList dotsInfo) {
        Intrinsics.h(dotsInfo, "dotsInfo");
        ViewExtensionsKt.runOnMainThread(this.c, new M1(this, dotsInfo));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(BarcodeFindItem item) {
        Intrinsics.h(item, "item");
        ViewExtensionsKt.runOnMainThread(this.c, new C0757o1(this, item));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(Map searchedItems, Set foundItems) {
        Intrinsics.h(searchedItems, "searchedItems");
        Intrinsics.h(foundItems, "foundItems");
        ViewExtensionsKt.runOnMainThread(this.h, new N1(this, searchedItems, foundItems));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(Set foundItems) {
        Intrinsics.h(foundItems, "foundItems");
        this.o = true;
        ViewExtensionsKt.runOnMainThread(this.h, new G1(this, foundItems));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a() {
        this.o = true;
        ViewExtensionsKt.runOnMainThread(this.h, new C0677j1(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(int i, int i2) {
        ViewExtensionsKt.runOnMainThread(this.g, new C0790q1(this, i, i2));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(BarcodeFindViewPresenter presenter) {
        Intrinsics.h(presenter, "presenter");
        this.e.a(new C0865u1(presenter));
        this.f.a(new C0880v1(presenter));
        this.c.a(new C0895w1(presenter));
        ((W1) this.k.a()).a(new C0910x1(presenter));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(String hint, NativeToastHintStyle style, String tag) {
        Intrinsics.h(hint, "hint");
        Intrinsics.h(style, "style");
        Intrinsics.h(tag, "tag");
        this.j.m326showToastsNLnd7M(ToastHint.m330constructorimpl(style, hint, tag));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(Function0 block) {
        Intrinsics.h(block, "block");
        ViewExtensionsKt.runOnMainThread(this.f17264a, block);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout
    public final void a(List zoomLevels) {
        Intrinsics.h(zoomLevels, "zoomLevels");
        ViewExtensionsKt.runOnMainThread(this.f17264a, new K1(this, zoomLevels));
    }
}
