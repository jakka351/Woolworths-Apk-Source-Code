package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0632g4 implements InterfaceC0600e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0632g4 f17678a = new C0632g4();

    private C0632g4() {
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.h(state, "state");
        return F8.b;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.h(state, "state");
        return F8.b;
    }
}
