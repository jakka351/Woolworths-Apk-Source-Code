package com.scandit.datacapture.barcode;

import android.graphics.PointF;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewUiListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S1 implements BarcodeFindViewPresenter {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFindProxy f17295a;
    private final BarcodeFindViewLayout b;
    private final BarcodeFindCameraManager c;
    private int d;
    private int e;
    private Set f;
    private Set g;
    private List h;
    private Map i;
    private boolean j;
    private final Object k;
    private BarcodeFindViewUiListener l;
    private boolean m;

    public S1(BarcodeFindProxy barcodeFind, P1 barcodeFindViewLayout, C0789q0 cameraManager) {
        Intrinsics.h(barcodeFind, "barcodeFind");
        Intrinsics.h(barcodeFindViewLayout, "barcodeFindViewLayout");
        Intrinsics.h(cameraManager, "cameraManager");
        this.f17295a = barcodeFind;
        this.b = barcodeFindViewLayout;
        this.c = cameraManager;
        this.d = 3;
        this.e = 3;
        EmptySet emptySet = EmptySet.d;
        this.f = emptySet;
        this.g = emptySet;
        this.h = EmptyList.d;
        this.i = EmptyMap.d;
        this.k = new Object();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(BarcodeFindViewUiListener barcodeFindViewUiListener) {
        synchronized (this.k) {
            this.l = barcodeFindViewUiListener;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void b() {
        int iA = Q1.a(this.e);
        if (iA == 0) {
            a();
        } else if (iA == 1) {
            h();
        } else {
            if (iA != 2) {
                return;
            }
            h();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void c() {
        this.e = 2;
        this.b.m();
        this.b.g(false);
        this.b.f(false);
        this.b.a(this.f);
        this.b.f();
        this.b.n();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void d() {
        this.j = false;
        this.c.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final boolean e() {
        return this.m;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void f() {
        this.j = true;
        int i = this.d;
        int i2 = this.e;
        if (i == i2) {
            if (i2 == 1) {
                this.c.d();
                return;
            }
            return;
        }
        int iA = Q1.a(i);
        if (iA == 0) {
            this.f17295a.start();
        } else if (iA == 1) {
            this.f17295a.pause();
        } else {
            if (iA != 2) {
                return;
            }
            this.f17295a.stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void g() {
        this.d = 3;
        if (this.j) {
            this.f17295a.stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void h() {
        this.d = 1;
        if (this.j) {
            this.f17295a.start();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void i() {
        g();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void onSearchStarted() {
        this.e = 1;
        this.b.d();
        this.b.g(false);
        this.b.f(true);
        this.b.a();
        this.b.g();
        if (this.e != 1 || !this.m) {
            this.b.n();
            return;
        }
        Float fC = this.c.c();
        if (fC != null) {
            this.b.a(CollectionsKt.R(fC, Float.valueOf(1.0f)));
        } else {
            this.b.n();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(boolean z) {
        this.m = z;
        if (!z) {
            this.b.n();
            return;
        }
        if (this.e != 1 || !z) {
            this.b.n();
            return;
        }
        Float fC = this.c.c();
        if (fC != null) {
            this.b.a(CollectionsKt.R(fC, Float.valueOf(1.0f)));
        } else {
            this.b.n();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a() {
        this.d = 2;
        if (this.j) {
            this.f17295a.pause();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(Collection foundTrackedBarcode, Collection trackedBarcodes, Function1 getTransformedData) {
        Intrinsics.h(foundTrackedBarcode, "foundTrackedBarcode");
        Intrinsics.h(trackedBarcodes, "trackedBarcodes");
        Intrinsics.h(getTransformedData, "getTransformedData");
        Map map = this.i;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(trackedBarcodes, 10));
        Iterator it = trackedBarcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(((NativeTrackedBarcode) it.next()).getBarcode().getUtf8String());
        }
        Set setL0 = CollectionsKt.L0(arrayList);
        Set set = this.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = setL0.iterator();
        while (it2.hasNext()) {
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) map.get((String) it2.next());
            if (barcodeFindItem != null) {
                arrayList2.add(barcodeFindItem);
            }
        }
        LinkedHashSet linkedHashSetG = SetsKt.g(set, arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(trackedBarcodes, 10));
        Iterator it3 = trackedBarcodes.iterator();
        while (it3.hasNext()) {
            NativeTrackedBarcode nativeTrackedBarcode = (NativeTrackedBarcode) it3.next();
            String it4 = nativeTrackedBarcode.getBarcode().getUtf8String();
            Intrinsics.g(it4, "it");
            String barcodeData = (String) getTransformedData.invoke(it4);
            if (barcodeData == null) {
                barcodeData = nativeTrackedBarcode.getBarcode().getUtf8String();
            }
            BarcodeFindItem barcodeFindItem2 = foundTrackedBarcode.contains(nativeTrackedBarcode) ? (BarcodeFindItem) map.get(barcodeData) : null;
            BarcodeFindViewLayout barcodeFindViewLayout = this.b;
            Point anchorPosition = nativeTrackedBarcode.getAnchorPosition(Anchor.CENTER);
            Intrinsics.g(anchorPosition, "trackedBarcode.getAnchorPosition(Anchor.CENTER)");
            PointF pointFMapFramePointToView = barcodeFindViewLayout.mapFramePointToView(anchorPosition);
            Intrinsics.g(barcodeData, "barcodeData");
            arrayList3.add(new C0847t6(pointFMapFramePointToView, barcodeFindItem2, barcodeData));
        }
        this.b.a(arrayList3);
        this.b.a(linkedHashSetG.size(), map.size());
        if (!foundTrackedBarcode.isEmpty()) {
            this.b.g(true);
        }
        this.f = linkedHashSetG;
        this.h = arrayList3;
        this.g = setL0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(Collection barcodes) {
        BarcodeFindViewUiListener barcodeFindViewUiListener;
        Intrinsics.h(barcodes, "barcodes");
        this.e = 3;
        this.b.m();
        this.b.g(false);
        this.b.f(false);
        this.b.n();
        synchronized (this.k) {
            barcodeFindViewUiListener = this.l;
        }
        if (barcodeFindViewUiListener != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = barcodes.iterator();
            while (it.hasNext()) {
                BarcodeFindItem barcodeFindItem = (BarcodeFindItem) this.i.get(((NativeBarcodeFindItem) it.next()).getFindableData());
                if (barcodeFindItem != null) {
                    arrayList.add(barcodeFindItem);
                }
            }
            this.b.a(new R1(barcodeFindViewUiListener, CollectionsKt.L0(arrayList)));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(float f) {
        this.c.a(f);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(BarcodeFindItem barcodeFindItem) {
        if (this.e == 1 || barcodeFindItem == null) {
            return;
        }
        this.b.b(barcodeFindItem);
        this.b.a(barcodeFindItem);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.listener.SearchedItemsUpdateListener
    public final void a(Map searchedItems) {
        Object next;
        Intrinsics.h(searchedItems, "searchedItems");
        this.i = searchedItems;
        if (this.e == 1) {
            return;
        }
        Set set = this.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (searchedItems.containsKey(((BarcodeFindItem) obj).getSearchOptions().getBarcodeData())) {
                arrayList.add(obj);
            }
        }
        Set setL0 = CollectionsKt.L0(arrayList);
        Set set2 = this.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) searchedItems.get((String) it.next());
            if (barcodeFindItem != null) {
                arrayList2.add(barcodeFindItem);
            }
        }
        LinkedHashSet linkedHashSetG = SetsKt.g(setL0, arrayList2);
        List<C0847t6> list = this.h;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list, 10));
        for (C0847t6 c0847t6 : list) {
            Iterator it2 = linkedHashSetG.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.c(((BarcodeFindItem) next).getSearchOptions().getBarcodeData(), c0847t6.a())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            arrayList3.add(C0847t6.a(c0847t6, (BarcodeFindItem) next));
        }
        this.b.a(searchedItems, linkedHashSetG);
        this.b.a(arrayList3);
        this.b.a(linkedHashSetG.size(), searchedItems.size());
        this.f = linkedHashSetG;
        this.h = arrayList3;
    }
}
