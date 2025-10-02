package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSession;
import com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountSessionCallback;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class f implements InternalBarcodeCountListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17483a;

    public f(BarcodeCount owner) {
        Intrinsics.h(owner, "owner");
        this.f17483a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(InternalBarcodeCountSession session, TrackedBarcode trackedBarcode) {
        Intrinsics.h(session, "session");
        Intrinsics.h(trackedBarcode, "trackedBarcode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void b(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17483a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).b(mode, session, data);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f17483a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        BarcodeCountSession barcodeCountSessionA = a(session);
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onScan(mode, barcodeCountSessionA, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStarted(BarcodeCount mode) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17483a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).onObservationStarted(mode);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f17483a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onObservationStarted(mode);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void onObservationStopped(BarcodeCount mode) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.h(mode, "mode");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17483a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).onObservationStopped(mode);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f17483a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onObservationStopped(mode);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.capture.InternalBarcodeCountListener
    public final void a(BarcodeCount mode, InternalBarcodeCountSession session, FrameData data) {
        CopyOnWriteArrayList<BarcodeCountListener> listeners$scandit_barcode_capture;
        CopyOnWriteArrayList<InternalBarcodeCountListener> internalListeners$scandit_barcode_capture;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodeCount barcodeCount = (BarcodeCount) this.f17483a.get();
        if (barcodeCount != null && (internalListeners$scandit_barcode_capture = barcodeCount.getInternalListeners$scandit_barcode_capture()) != null) {
            Iterator<T> it = internalListeners$scandit_barcode_capture.iterator();
            while (it.hasNext()) {
                ((InternalBarcodeCountListener) it.next()).a(mode, session, data);
            }
        }
        BarcodeCount barcodeCount2 = (BarcodeCount) this.f17483a.get();
        if (barcodeCount2 == null || (listeners$scandit_barcode_capture = barcodeCount2.getListeners$scandit_barcode_capture()) == null) {
            return;
        }
        BarcodeCountSession barcodeCountSessionA = a(session);
        Iterator<T> it2 = listeners$scandit_barcode_capture.iterator();
        while (it2.hasNext()) {
            ((BarcodeCountListener) it2.next()).onSessionUpdated(mode, barcodeCountSessionA, data);
        }
    }

    private static BarcodeCountSession a(InternalBarcodeCountSession internalBarcodeCountSession) {
        Map mapE = internalBarcodeCountSession.e();
        HashMap<Integer, NativeTrackedBarcode> clearedBarcodes = internalBarcodeCountSession.a().getClearedBarcodes();
        Intrinsics.g(clearedBarcodes, "_impl().clearedBarcodes");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(clearedBarcodes.size()));
        Iterator<T> it = clearedBarcodes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.g(value, "it.value");
            linkedHashMap.put(key, new TrackedBarcode((NativeTrackedBarcode) value));
        }
        LinkedHashMap linkedHashMapM = MapsKt.m(mapE, linkedHashMap);
        ArrayList<NativeBarcode> additionalBarcodes = internalBarcodeCountSession.a().getAdditionalBarcodes();
        Intrinsics.g(additionalBarcodes, "_impl().additionalBarcodes");
        ArrayList arrayList = new ArrayList(CollectionsKt.s(additionalBarcodes, 10));
        for (NativeBarcode it2 : additionalBarcodes) {
            Intrinsics.g(it2, "it");
            arrayList.add(new Barcode(it2));
        }
        long jC = internalBarcodeCountSession.c();
        ArrayList<Integer> removedTrackedBarcodes = internalBarcodeCountSession.a().getRemovedTrackedBarcodes();
        Intrinsics.g(removedTrackedBarcodes, "_impl().removedTrackedBarcodes");
        return new BarcodeCountSession(linkedHashMapM, arrayList, jC, removedTrackedBarcodes, new InternalBarcodeCountSessionCallback(new c(internalBarcodeCountSession), new d(internalBarcodeCountSession), new e(internalBarcodeCountSession)));
    }
}
