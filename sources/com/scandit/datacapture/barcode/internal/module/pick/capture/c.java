package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionCallback;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class c implements BarcodePickActionListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17752a;

    public c(BarcodePickInternal owner) {
        Intrinsics.h(owner, "owner");
        this.f17752a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener
    public final void onPick(String itemData, BarcodePickActionCallback callback) {
        CopyOnWriteArraySet copyOnWriteArraySetG;
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(callback, "callback");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17752a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySetG = barcodePickInternal.g()) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySetG.iterator();
        while (it.hasNext()) {
            ((BarcodePickActionListener) it.next()).onPick(itemData, callback);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener
    public final void onUnpick(String itemData, BarcodePickActionCallback callback) {
        CopyOnWriteArraySet copyOnWriteArraySetG;
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(callback, "callback");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17752a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySetG = barcodePickInternal.g()) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySetG.iterator();
        while (it.hasNext()) {
            ((BarcodePickActionListener) it.next()).onUnpick(itemData, callback);
        }
    }
}
