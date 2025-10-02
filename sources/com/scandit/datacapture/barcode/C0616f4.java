package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0616f4 implements InterfaceC0600e4 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0600e4 f17637a;
    private final InterfaceC0600e4 b;

    public C0616f4(BarcodePickHighlightStyleIconsHolder overrides, InterfaceC0600e4 defaultsProvider) {
        Intrinsics.h(overrides, "overrides");
        Intrinsics.h(defaultsProvider, "defaultsProvider");
        this.f17637a = overrides;
        this.b = defaultsProvider;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.h(state, "state");
        BarcodePickIcon barcodePickIconA = this.f17637a.a(state);
        return Intrinsics.c(barcodePickIconA, G8.b) ? this.b.a(state) : barcodePickIconA;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.h(state, "state");
        BarcodePickIcon barcodePickIconB = this.f17637a.b(state);
        return Intrinsics.c(barcodePickIconB, G8.b) ? this.b.b(state) : barcodePickIconB;
    }
}
