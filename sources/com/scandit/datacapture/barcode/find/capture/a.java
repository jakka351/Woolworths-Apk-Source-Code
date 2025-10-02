package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements InternalBarcodeFindListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17664a;

    public a(BarcodeFind owner) {
        Intrinsics.h(owner, "owner");
        this.f17664a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode) {
        Intrinsics.h(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17664a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.g.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeFindListener) it.next()).a(barcodeFind);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(BarcodeFind mode) {
        Intrinsics.h(mode, "mode");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17664a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.g.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeFindListener) it.next()).b(barcodeFind);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void onSearchStarted() {
        BarcodeFind barcodeFind = (BarcodeFind) this.f17664a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.g.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeFindListener) it.next()).onSearchStarted();
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode, NativeBarcodeFindSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17664a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.g.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeFindListener) it.next()).a(mode, session, data);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17664a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.g.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeFindListener) it.next()).b(barcodes);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(HashSet barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        BarcodeFind barcodeFind = (BarcodeFind) this.f17664a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.g.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeFindListener) it.next()).a(barcodes);
            }
        }
    }
}
