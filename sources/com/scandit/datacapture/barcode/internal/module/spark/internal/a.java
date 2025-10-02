package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.InterfaceC0874ua;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class a implements InterfaceC0874ua {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17776a;

    public a(SparkScanInternal owner) {
        Intrinsics.h(owner, "owner");
        this.f17776a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
    public final void onBarcodeScanned(SparkScanInternal sparkScan, SparkScanSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f17776a.get();
        if (sparkScanInternal == null || (copyOnWriteArraySet = sparkScanInternal.c) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0874ua) it.next()).onBarcodeScanned(sparkScan, session, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
    public final void onObservationStarted(SparkScanInternal sparkScan) {
        Intrinsics.h(sparkScan, "sparkScan");
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
    public final void onObservationStopped(SparkScanInternal sparkScan) {
        Intrinsics.h(sparkScan, "sparkScan");
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0874ua
    public final void onSessionUpdated(SparkScanInternal sparkScan, SparkScanSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(sparkScan, "sparkScan");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        SparkScanInternal sparkScanInternal = (SparkScanInternal) this.f17776a.get();
        if (sparkScanInternal == null || (copyOnWriteArraySet = sparkScanInternal.c) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0874ua) it.next()).onSessionUpdated(sparkScan, session, data);
        }
    }
}
