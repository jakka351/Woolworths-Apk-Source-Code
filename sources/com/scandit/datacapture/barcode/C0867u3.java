package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewSizeListener;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.u3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0867u3 implements BarcodePickDataCaptureViewWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0792q3 f18218a;
    private final BarcodePickViewSettings b;
    private final Lazy c;
    private final InterfaceC0663i3 d;

    public C0867u3(Context context, InterfaceC0792q3 factory, BarcodePickViewSettings settings) {
        Intrinsics.h(context, "context");
        Intrinsics.h(factory, "factory");
        Intrinsics.h(settings, "settings");
        this.f18218a = factory;
        this.b = settings;
        this.c = LazyKt.b(new C0844t3(this));
        this.d = C0647h3.a(context);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(DataCaptureContext dataCaptureContext) {
        c().setDataCaptureContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void b(DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        c().addOverlay(overlay);
    }

    public final DataCaptureView c() {
        return (DataCaptureView) this.c.getD();
    }

    public final InterfaceC0792q3 d() {
        return this.f18218a;
    }

    public final BarcodePickViewSettings e() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral) {
        Intrinsics.h(quadrilateral, "quadrilateral");
        return c().mapFrameQuadrilateralToView(quadrilateral);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(float f) {
        ViewParent parent = c().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        if (height > width) {
            height = (int) (width * f);
        } else {
            width = (int) (height * f);
        }
        DataCaptureView dataCaptureViewC = c();
        ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
        layoutParams.height = height;
        layoutParams.width = width;
        dataCaptureViewC.setLayoutParams(layoutParams);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void b() {
        InterfaceC0663i3 interfaceC0663i3 = this.d;
        BarcodePickViewSettings barcodePickViewSettings = this.b;
        Context context = c().getContext();
        Intrinsics.g(context, "dataCaptureView.context");
        Iterator it = ((C0759o3) interfaceC0663i3).a(barcodePickViewSettings, AbstractC0682j6.a(context)).iterator();
        while (it.hasNext()) {
            C0553c9 c0553c9 = (C0553c9) it.next();
            c().addControl(c0553c9.b(), c0553c9.a(), c0553c9.c());
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(ViewGroup container, RelativeLayout.LayoutParams params) {
        Intrinsics.h(container, "container");
        Intrinsics.h(params, "params");
        container.addView(c(), params);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(DataCaptureOverlay overlay) {
        Intrinsics.h(overlay, "overlay");
        c().removeOverlay(overlay);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a() {
        List listA = ((C0759o3) this.d).a();
        DataCaptureView dataCaptureViewC = c();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            dataCaptureViewC.removeControl((Control) it.next());
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper
    public final void a(DataCaptureViewSizeListener listener) {
        Intrinsics.h(listener, "listener");
        c().addListener(listener);
    }
}
