package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements InternalBarcodeFindListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17665a;

    public b(BarcodeFind owner) {
        Intrinsics.h(owner, "owner");
        this.f17665a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(BarcodeFind mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void onSearchStarted() {
        BarcodeFind barcodeFind = (BarcodeFind) this.f17665a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.f.iterator();
            while (it.hasNext()) {
                ((BarcodeFindListener) it.next()).onSearchStarted();
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode, NativeBarcodeFindSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17665a.get();
        if (barcodeFind == null || barcodeFind.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = barcodes.iterator();
        while (it.hasNext()) {
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) BarcodeFind.access$getSearchedItems(barcodeFind).get(((NativeBarcodeFindItem) it.next()).getFindableData());
            if (barcodeFindItem != null) {
                arrayList.add(barcodeFindItem);
            }
        }
        Set<BarcodeFindItem> setL0 = CollectionsKt.L0(arrayList);
        Iterator it2 = barcodeFind.f.iterator();
        while (it2.hasNext()) {
            ((BarcodeFindListener) it2.next()).onSearchStopped(setL0);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17665a.get();
        if (barcodeFind == null || barcodeFind.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = barcodes.iterator();
        while (it.hasNext()) {
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) BarcodeFind.access$getSearchedItems(barcodeFind).get(((NativeBarcodeFindItem) it.next()).getFindableData());
            if (barcodeFindItem != null) {
                arrayList.add(barcodeFindItem);
            }
        }
        Set<BarcodeFindItem> setL0 = CollectionsKt.L0(arrayList);
        Iterator it2 = barcodeFind.f.iterator();
        while (it2.hasNext()) {
            ((BarcodeFindListener) it2.next()).onSearchPaused(setL0);
        }
    }
}
