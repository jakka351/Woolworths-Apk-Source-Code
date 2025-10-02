package com.scandit.datacapture.barcode;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.a4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0516a4 implements BarcodePickHighlightStyleIconsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f17373a = new LinkedHashMap();
    private final LinkedHashMap b = new LinkedHashMap();

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void a(Bitmap bitmap, BarcodePickState state) {
        Intrinsics.h(state, "state");
        this.b.put(state, AbstractC0548c4.a(bitmap, G8.b));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void b(Bitmap bitmap, BarcodePickState state) {
        Intrinsics.h(state, "state");
        this.f17373a.put(state, AbstractC0548c4.a(bitmap, F8.b));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void b(int i, BarcodePickState state) {
        Intrinsics.h(state, "state");
        this.f17373a.put(state, AbstractC0548c4.a(i, F8.b));
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.h(state, "state");
        BarcodePickIcon barcodePickIcon = (BarcodePickIcon) this.b.get(state);
        return barcodePickIcon == null ? G8.b : barcodePickIcon;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void a(int i, BarcodePickState state) {
        Intrinsics.h(state, "state");
        this.b.put(state, AbstractC0548c4.a(i, G8.b));
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0600e4
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.h(state, "state");
        BarcodePickIcon barcodePickIcon = (BarcodePickIcon) this.f17373a.get(state);
        return barcodePickIcon == null ? G8.b : barcodePickIcon;
    }
}
