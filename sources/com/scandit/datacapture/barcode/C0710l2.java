package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.l2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0710l2 implements BarcodeIndicatorPresenter {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f17836a;
    private final InterfaceC0690je b;
    private final NativeBarcodeCountBasicOverlayStyle c;
    private final Function3 d;
    private final Function0 e;
    private final Function3 f;
    private long g;
    private boolean h;
    private final Object i;
    private List j;
    private NativeBarcodeCountBasicOverlayColorScheme k;
    private final Lazy l;
    private Map m;
    private Map n;
    private Map o;
    private Map p;
    private final C0642ge q;

    public C0710l2(BarcodeCountBasicOverlay backingView, C0706ke trackedBarcodeHelper, NativeBarcodeCountBasicOverlayStyle style, Function3 dotBrushProvider, Function0 filteredBrushProvider, Function3 onBarcodeViewClickedListener) {
        Intrinsics.h(backingView, "backingView");
        Intrinsics.h(trackedBarcodeHelper, "trackedBarcodeHelper");
        Intrinsics.h(style, "style");
        Intrinsics.h(dotBrushProvider, "dotBrushProvider");
        Intrinsics.h(filteredBrushProvider, "filteredBrushProvider");
        Intrinsics.h(onBarcodeViewClickedListener, "onBarcodeViewClickedListener");
        this.f17836a = backingView;
        this.b = trackedBarcodeHelper;
        this.c = style;
        this.d = dotBrushProvider;
        this.e = filteredBrushProvider;
        this.f = onBarcodeViewClickedListener;
        this.i = new Object();
        this.j = EmptyList.d;
        this.k = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        this.l = LazyKt.b(new C0630g2(this));
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.o = EmptyMap.d;
        this.p = EmptyMap.d;
        this.q = new C0642ge(new C0646h2(this), C0662i2.f17703a, new C0678j2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0710l2 this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.b();
        C0535b7 c0535b7 = (C0535b7) this$0.l.getD();
        if (c0535b7 != null) {
            c0535b7.a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void reset() {
        this.o = EmptyMap.d;
        this.f17836a.post(new kf(this, 4));
    }

    public static final void b(C0710l2 c0710l2, List list) {
        EnumC0668i8 enumC0668i8;
        Map map = c0710l2.n;
        c0710l2.n = c0710l2.m;
        c0710l2.m = map;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0722le c0722le = (C0722le) it.next();
            A7 a7 = (A7) c0710l2.n.remove(Integer.valueOf(c0722le.a()));
            if (a7 == null) {
                ViewGroup viewGroup = c0710l2.f17836a;
                TrackedBarcode trackedBarcode = (TrackedBarcode) c0710l2.o.get(Integer.valueOf(c0722le.a()));
                if (trackedBarcode == null) {
                    a7 = null;
                } else {
                    InterfaceC0690je.f17824a.getClass();
                    int iA = (int) C0674ie.a();
                    Context context = viewGroup.getContext();
                    Intrinsics.g(context, "backingView.context");
                    A7 a72 = new A7(context, c0710l2.c);
                    EnumC0813r9 enumC0813r9 = c0722le.d() ? EnumC0813r9.SCANNED : EnumC0813r9.UNSCANNED;
                    int identifier = trackedBarcode.getIdentifier();
                    if (!c0710l2.h) {
                        enumC0668i8 = EnumC0668i8.NOT_USING_LIST;
                    } else if (c0710l2.j.contains(Integer.valueOf(identifier))) {
                        enumC0668i8 = EnumC0668i8.IN_LIST;
                    } else {
                        enumC0668i8 = EnumC0668i8.NOT_IN_LIST;
                    }
                    a72.a(enumC0813r9, enumC0668i8, c0710l2.k, trackedBarcode, c0710l2.d);
                    a72.setLayoutParams(new FrameLayout.LayoutParams(iA, iA));
                    viewGroup.addView(a72);
                    a7 = a72;
                }
                if (a7 == null) {
                }
            }
            InterfaceC0690je.f17824a.getClass();
            float fA = C0674ie.a() / 2;
            a7.setX(c0722le.b().getX() - fA);
            a7.setY(c0722le.b().getY() - fA);
            a7.setScaleX(c0722le.c());
            a7.setScaleY(c0722le.c());
            c0710l2.m.put(Integer.valueOf(c0722le.a()), a7);
        }
        Iterator it2 = c0710l2.n.entrySet().iterator();
        while (it2.hasNext()) {
            c0710l2.f17836a.removeView((A7) ((Map.Entry) it2.next()).getValue());
        }
        c0710l2.n.clear();
    }

    public final ViewGroup a() {
        return this.f17836a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(boolean z) {
        this.h = z;
    }

    public static final void a(C0710l2 c0710l2, List list) {
        C0535b7 c0535b7 = (C0535b7) c0710l2.l.getD();
        if (c0535b7 != null) {
            c0535b7.a((Brush) c0710l2.e.invoke());
        }
        C0535b7 c0535b72 = (C0535b7) c0710l2.l.getD();
        if (c0535b72 != null) {
            c0535b72.a(list);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(BarcodeCountCaptureListSession session) {
        Intrinsics.h(session, "session");
        synchronized (this.i) {
            try {
                List<TrackedBarcode> correctBarcodes = session.getCorrectBarcodes();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(correctBarcodes, 10));
                Iterator<T> it = correctBarcodes.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((TrackedBarcode) it.next()).getIdentifier()));
                }
                this.j = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final TrackedBarcode a(C0710l2 c0710l2, Point point) {
        Object next;
        Collection<TrackedBarcode> collectionValues = c0710l2.o.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionValues, 10));
        for (TrackedBarcode trackedBarcode : collectionValues) {
            Boolean bool = (Boolean) c0710l2.p.get(Integer.valueOf(trackedBarcode.getIdentifier()));
            C0722le c0722leA = ((C0706ke) c0710l2.b).a(trackedBarcode, bool != null ? bool.booleanValue() : false);
            arrayList.add(new C0614f2(trackedBarcode, c0722leA, PointExtensionsKt.dotProductSquared(PointExtensionsKt.minus(c0722leA.b(), point))));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fB = ((C0614f2) next).b();
                do {
                    Object next2 = it.next();
                    float fB2 = ((C0614f2) next2).b();
                    if (Float.compare(fB, fB2) > 0) {
                        next = next2;
                        fB = fB2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C0614f2 c0614f2 = (C0614f2) next;
        if (c0614f2 != null) {
            InterfaceC0690je.f17824a.getClass();
            float fC = ((c0614f2.c().c() * C0674ie.a()) / 2) * 1.5f;
            if (PointExtensionsKt.dotProductSquared(PointExtensionsKt.minus(c0614f2.c().b(), point)) > fC * fC) {
                c0614f2 = null;
            }
            if (c0614f2 != null) {
                return c0614f2.a();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        Set setL0 = CollectionsKt.L0(this.m.keySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            A7 a7 = (A7) this.m.remove(Integer.valueOf(((Number) it.next()).intValue()));
            if (a7 != null) {
                arrayList.add(a7);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f17836a.removeView((A7) it2.next());
        }
        this.m.clear();
        this.n.clear();
    }

    public static final void a(C0710l2 c0710l2, TrackedBarcode trackedBarcode) {
        EnumC0668i8 enumC0668i8;
        Boolean bool = (Boolean) c0710l2.p.get(Integer.valueOf(trackedBarcode.getIdentifier()));
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Function3 function3 = c0710l2.f;
        EnumC0813r9 enumC0813r9 = zBooleanValue ? EnumC0813r9.SCANNED : EnumC0813r9.UNSCANNED;
        int identifier = trackedBarcode.getIdentifier();
        if (!c0710l2.h) {
            enumC0668i8 = EnumC0668i8.NOT_USING_LIST;
        } else if (c0710l2.j.contains(Integer.valueOf(identifier))) {
            enumC0668i8 = EnumC0668i8.IN_LIST;
        } else {
            enumC0668i8 = EnumC0668i8.NOT_IN_LIST;
        }
        function3.invoke(trackedBarcode, enumC0813r9, enumC0668i8);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void b(boolean z, boolean z2) {
        for (A7 a7 : this.m.values()) {
            if (a7.a() == EnumC0813r9.UNSCANNED) {
                if (z) {
                    a7.b(z2);
                } else {
                    a7.a(z2);
                }
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(FrameLayout captureView) {
        Intrinsics.h(captureView, "captureView");
        captureView.setOnTouchListener(new View.OnTouchListener() { // from class: com.scandit.datacapture.barcode.qf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C0710l2.a(this.d, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(C0710l2 this$0, View view, MotionEvent event) {
        Intrinsics.h(this$0, "this$0");
        C0642ge c0642ge = this$0.q;
        Intrinsics.g(event, "event");
        boolean zA = c0642ge.a(event);
        if (!zA) {
            view.performClick();
        }
        return zA;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(NativeBarcodeCountBasicOverlayColorScheme scheme) {
        Intrinsics.h(scheme, "scheme");
        this.k = scheme;
        Iterator it = this.m.values().iterator();
        while (it.hasNext()) {
            ((A7) it.next()).a(this.k);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(boolean z, boolean z2) {
        for (A7 a7 : this.m.values()) {
            if (a7.a() != EnumC0813r9.UNSCANNED) {
                if (z) {
                    a7.d(z2);
                } else {
                    a7.c(z2);
                }
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(List statusList) {
        Intrinsics.h(statusList, "statusList");
        Iterator it = statusList.iterator();
        while (it.hasNext()) {
            NativeBarcodeCountStatusItem nativeBarcodeCountStatusItem = (NativeBarcodeCountStatusItem) it.next();
            A7 a7 = (A7) this.m.get(Integer.valueOf(nativeBarcodeCountStatusItem.getTrackedBarcode().getIdentifier()));
            if (a7 != null) {
                BarcodeCountStatus status = nativeBarcodeCountStatusItem.getStatus();
                Intrinsics.g(status, "statusItem.status");
                a7.a(status);
                A7.a(a7);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(TrackedBarcode barcode) {
        Intrinsics.h(barcode, "barcode");
        A7 a7 = (A7) this.m.get(Integer.valueOf(barcode.getIdentifier()));
        if (a7 != null) {
            a7.b();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.BarcodeIndicatorPresenter
    public final void a(long j, ArrayList recognizedBarcodes, ArrayList unrecognizedBarcodes, ArrayList filteredBarcodes) {
        Intrinsics.h(recognizedBarcodes, "recognizedBarcodes");
        Intrinsics.h(unrecognizedBarcodes, "unrecognizedBarcodes");
        Intrinsics.h(filteredBarcodes, "filteredBarcodes");
        int iH = MapsKt.h(CollectionsKt.s(recognizedBarcodes, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        Iterator it = recognizedBarcodes.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Integer.valueOf(((TrackedBarcode) next).getIdentifier()), next);
        }
        int iH2 = MapsKt.h(CollectionsKt.s(unrecognizedBarcodes, 10));
        if (iH2 < 16) {
            iH2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2);
        Iterator it2 = unrecognizedBarcodes.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            linkedHashMap2.put(Integer.valueOf(((TrackedBarcode) next2).getIdentifier()), next2);
        }
        this.o = MapsKt.m(linkedHashMap, linkedHashMap2);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(recognizedBarcodes, 10));
        Iterator it3 = recognizedBarcodes.iterator();
        while (it3.hasNext()) {
            arrayList.add(((C0706ke) this.b).a((TrackedBarcode) it3.next(), true));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(unrecognizedBarcodes, 10));
        Iterator it4 = unrecognizedBarcodes.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((C0706ke) this.b).a((TrackedBarcode) it4.next(), false));
        }
        ArrayList arrayListC0 = CollectionsKt.c0(arrayList2, arrayList);
        int iH3 = MapsKt.h(CollectionsKt.s(arrayListC0, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH3 >= 16 ? iH3 : 16);
        Iterator it5 = arrayListC0.iterator();
        while (it5.hasNext()) {
            C0722le c0722le = (C0722le) it5.next();
            linkedHashMap3.put(Integer.valueOf(c0722le.a()), Boolean.valueOf(c0722le.d()));
        }
        this.p = linkedHashMap3;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(filteredBarcodes, 10));
        Iterator it6 = filteredBarcodes.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((C0706ke) this.b).a((TrackedBarcode) it6.next()));
        }
        ViewExtensionsKt.runOnMainThread(this.f17836a, new C0694k2(this, j, arrayListC0, arrayList3));
    }
}
