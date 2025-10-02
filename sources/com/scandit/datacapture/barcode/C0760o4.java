package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.ui.DataCaptureView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0760o4 implements InterfaceC0680j4 {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePick f17869a;
    private final Function1 b;
    private final Function1 c;
    private final InterfaceC0617f5 d;
    private final BarcodePickDrawer e;

    public C0760o4(BarcodePick mode, Function1 runOnMain, Function1 onDrawerDataUpdatedWithStatusIconsShown, InterfaceC0617f5 elementsRequestor, BarcodePickDrawer highlightDrawer) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(runOnMain, "runOnMain");
        Intrinsics.h(onDrawerDataUpdatedWithStatusIconsShown, "onDrawerDataUpdatedWithStatusIconsShown");
        Intrinsics.h(elementsRequestor, "elementsRequestor");
        Intrinsics.h(highlightDrawer, "highlightDrawer");
        this.f17869a = mode;
        this.b = runOnMain;
        this.c = onDrawerDataUpdatedWithStatusIconsShown;
        this.d = elementsRequestor;
        this.e = highlightDrawer;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode) {
        Intrinsics.h(mode, "mode");
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewSizeListener
    public final void onSizeChanged(DataCaptureView view, int i, int i2, int i3) {
        Intrinsics.h(view, "view");
        NativeBarcodePickSession session = this.f17869a._impl$scandit_barcode_capture().getSession();
        if (session == null) {
            return;
        }
        a(new BarcodePickSession(new C0696k4(session)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void b(BarcodePickInternal mode, BarcodePickSession session, FrameData data) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        Intrinsics.h(data, "data");
        a(session);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0680j4
    public final void a() {
        NativeBarcodePickSession session = this.f17869a._impl$scandit_barcode_capture().getSession();
        if (session == null) {
            return;
        }
        a(new BarcodePickSession(new C0728m4(session)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, BarcodePickSession session, FrameData frameData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(session, "session");
        a(session);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, Map requestedData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(requestedData, "requestedData");
        BarcodePickSession barcodePickSessionD = mode.d();
        for (Map.Entry entry : requestedData.entrySet()) {
            String str = (String) entry.getKey();
            this.d.a(str, (String) entry.getValue(), a(str, barcodePickSessionD.e(), barcodePickSessionD.g(), barcodePickSessionD.i()), new C0712l4(this, barcodePickSessionD));
        }
        a(barcodePickSessionD);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(BarcodePickInternal mode, String id, boolean z) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(id, "id");
        this.d.a(id);
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener
    public final void a(TrackedObject trackedObject) {
        this.d.b(trackedObject != null ? trackedObject.b() : null);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(BarcodePickSession barcodePickSession) {
        Set setL0 = CollectionsKt.L0(barcodePickSession.g());
        Set setL02 = CollectionsKt.L0(barcodePickSession.e());
        Set setL03 = CollectionsKt.L0(barcodePickSession.i());
        List listB = barcodePickSession.b();
        int iH = MapsKt.h(CollectionsKt.s(listB, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Object obj : listB) {
            linkedHashMap.put(obj, a(((TrackedObject) obj).b(), setL02, setL0, setL03));
        }
        List listJ = barcodePickSession.j();
        int iH2 = MapsKt.h(CollectionsKt.s(listJ, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
        for (Object obj2 : listJ) {
            linkedHashMap2.put(obj2, a(((TrackedObject) obj2).b(), setL02, setL0, setL03));
        }
        List listG0 = CollectionsKt.G0(barcodePickSession.f());
        List listG02 = CollectionsKt.G0(barcodePickSession.d().values());
        if (linkedHashMap.isEmpty() && linkedHashMap2.isEmpty() && listG0.isEmpty() && listG02.isEmpty()) {
            return;
        }
        this.b.invoke(new C0744n4(linkedHashMap, linkedHashMap2, listG0, this, listG02));
    }

    private static BarcodePickState a(String str, Set set, Set set2, Set set3) {
        if (str == null) {
            return BarcodePickState.UNKNOWN;
        }
        return set2.contains(str) ? BarcodePickState.TO_PICK : set.contains(str) ? BarcodePickState.PICKED : set3.contains(str) ? BarcodePickState.UNKNOWN : BarcodePickState.IGNORE;
    }
}
