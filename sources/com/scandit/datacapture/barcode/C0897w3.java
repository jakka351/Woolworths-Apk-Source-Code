package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.w3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0897w3 implements InterfaceC0600e4 {
    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.h(state, "state");
        int i = AbstractC0882v3.f18233a[state.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return new C0798q9(R.drawable.sc_ic_barcode_pick_to_pick);
            }
            if (i == 4) {
                return new C0798q9(R.drawable.sc_ic_barcode_pick_picked);
            }
            throw new NoWhenBranchMatchedException();
        }
        return F8.b;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.h(state, "state");
        return G8.b;
    }
}
