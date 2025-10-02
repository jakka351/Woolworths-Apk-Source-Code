package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class U implements K {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17310a;

    public U(C0544c0 owner) {
        Intrinsics.h(owner, "owner");
        this.f17310a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void a(boolean z) {
        O oJ;
        C0544c0 c0544c0 = (C0544c0) this.f17310a.get();
        if (c0544c0 == null || (oJ = c0544c0.j()) == null) {
            return;
        }
        oJ.c();
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void b(boolean z) {
        O oJ;
        C0544c0 c0544c0 = (C0544c0) this.f17310a.get();
        if (c0544c0 != null) {
            NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme = z ? NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE : NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
            c0544c0.m.setColorScheme$scandit_barcode_capture(nativeBarcodeCountBasicOverlayColorScheme);
            C0544c0 c0544c02 = (C0544c0) this.f17310a.get();
            if (c0544c02 == null || (oJ = c0544c02.j()) == null) {
                return;
            }
            oJ.a(nativeBarcodeCountBasicOverlayColorScheme);
        }
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void c(boolean z) {
        C0544c0 c0544c0 = (C0544c0) this.f17310a.get();
        if (c0544c0 != null) {
            C0544c0.a(c0544c0, z);
        }
    }

    @Override // com.scandit.datacapture.barcode.K
    public final void d(boolean z) {
        O oJ;
        C0544c0 c0544c0 = (C0544c0) this.f17310a.get();
        if (c0544c0 == null || (oJ = c0544c0.j()) == null) {
            return;
        }
        oJ.c();
    }
}
