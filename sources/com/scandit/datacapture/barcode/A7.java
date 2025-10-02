package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A7 extends FrameLayout {
    private final C0598e2 b;
    private final FrameLayout c;
    private final Ld d;
    private EnumC0813r9 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A7(Context context, NativeBarcodeCountBasicOverlayStyle style) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(style, "style");
        this.b = new C0598e2();
        FrameLayout frameLayoutA = C0598e2.a(context, style);
        this.c = frameLayoutA;
        Ld ldA = C0598e2.a(context);
        this.d = ldA;
        ldA.setAlpha(BitmapDescriptorFactory.HUE_RED);
        addView(frameLayoutA, new FrameLayout.LayoutParams(-1, -1));
        addView(ldA, new FrameLayout.LayoutParams(-1, -1));
    }

    public final EnumC0813r9 a() {
        return this.e;
    }

    public final void b(boolean z) {
        if (z) {
            animate().setDuration(500L).alpha(1.0f).start();
        } else {
            setAlpha(1.0f);
        }
    }

    public final void c(boolean z) {
        FrameLayout frameLayout = this.c;
        if (z) {
            frameLayout.animate().setDuration(500L).alpha(1.0f).start();
        } else {
            frameLayout.setAlpha(1.0f);
        }
        this.d.a(z);
    }

    public final void d(boolean z) {
        FrameLayout frameLayout = this.c;
        if (z) {
            frameLayout.animate().setDuration(500L).alpha(BitmapDescriptorFactory.HUE_RED).start();
        } else {
            frameLayout.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.d.b(z);
    }

    public final void a(EnumC0813r9 scanStatus, EnumC0668i8 listStatus, NativeBarcodeCountBasicOverlayColorScheme colorScheme, TrackedBarcode barcode, Function3 dotBrushProvider) {
        Intrinsics.h(scanStatus, "scanStatus");
        Intrinsics.h(listStatus, "listStatus");
        Intrinsics.h(colorScheme, "colorScheme");
        Intrinsics.h(barcode, "barcode");
        Intrinsics.h(dotBrushProvider, "dotBrushProvider");
        this.e = scanStatus;
        C0598e2 c0598e2 = this.b;
        ViewParent normalView = this.c;
        c0598e2.getClass();
        Intrinsics.h(normalView, "normalView");
        G g = normalView instanceof G ? (G) normalView : null;
        if (g != null) {
            g.a(new C0582d2(dotBrushProvider, barcode));
        }
        InterfaceC0530b2 interfaceC0530b2 = normalView instanceof InterfaceC0530b2 ? (InterfaceC0530b2) normalView : null;
        if (interfaceC0530b2 != null) {
            interfaceC0530b2.a(scanStatus);
            interfaceC0530b2.a(listStatus);
            interfaceC0530b2.a(barcode);
            interfaceC0530b2.a(colorScheme);
        }
    }

    public final void b() {
        ViewParent viewParent = this.c;
        InterfaceC0530b2 interfaceC0530b2 = viewParent instanceof InterfaceC0530b2 ? (InterfaceC0530b2) viewParent : null;
        if (interfaceC0530b2 != null) {
            interfaceC0530b2.a();
        }
    }

    public final void a(BarcodeCountStatus status) {
        Intrinsics.h(status, "status");
        C0598e2 c0598e2 = this.b;
        Ld statusView = this.d;
        c0598e2.getClass();
        Intrinsics.h(statusView, "statusView");
        statusView.a(status);
    }

    public static void a(A7 a7) {
        a7.d.c(true);
    }

    public final void a(boolean z) {
        if (z) {
            animate().setDuration(500L).alpha(BitmapDescriptorFactory.HUE_RED).start();
        } else {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void a(NativeBarcodeCountBasicOverlayColorScheme colorScheme) {
        Intrinsics.h(colorScheme, "colorScheme");
        ViewParent viewParent = this.c;
        InterfaceC0530b2 interfaceC0530b2 = viewParent instanceof InterfaceC0530b2 ? (InterfaceC0530b2) viewParent : null;
        if (interfaceC0530b2 == null) {
            return;
        }
        interfaceC0530b2.a(colorScheme);
    }
}
