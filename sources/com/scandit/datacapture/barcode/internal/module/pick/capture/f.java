package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class f implements BarcodePickListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17755a;

    public f(BarcodePickInternal owner) {
        Intrinsics.h(owner, "owner");
        this.f17755a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, Map requestedData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(requestedData, "requestedData");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17755a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(mode, requestedData);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode, BarcodePickSession session, FrameData data) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17755a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).b(mode, session, data);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, String id, boolean z) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(id, "id");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17755a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(mode, id, z);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(TrackedObject trackedObject) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17755a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(trackedObject);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, BarcodePickSession session, FrameData frameData) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f17755a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySet = barcodePickInternal.e) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(mode, session, frameData);
        }
    }
}
