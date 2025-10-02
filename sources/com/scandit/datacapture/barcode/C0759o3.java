package com.scandit.datacapture.barcode;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroupBuilder;
import com.scandit.datacapture.core.ui.control.LinearControlGroupOrientation;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.o3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0759o3 implements InterfaceC0663i3 {
    private static final PointWithUnit e;
    private static final PointWithUnit f;
    private static final PointWithUnit g;
    private static final PointWithUnit h;
    private static final List i;
    private static final List j;
    private static final Map k;
    private static final Anchor l;
    private static final Anchor m;
    private static final Anchor n;

    /* renamed from: a, reason: collision with root package name */
    private List f17868a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;

    static {
        MeasureUnit measureUnit = MeasureUnit.DIP;
        e = PointWithUnitUtilsKt.PointWithUnit(16.0f, 16.0f, measureUnit);
        f = PointWithUnitUtilsKt.PointWithUnit(BitmapDescriptorFactory.HUE_RED, 16.0f, measureUnit);
        g = PointWithUnitUtilsKt.PointWithUnit(16.0f, BitmapDescriptorFactory.HUE_RED, measureUnit);
        h = PointWithUnitUtilsKt.PointWithUnit(40.0f, 32.0f, measureUnit);
        Anchor anchor = Anchor.TOP_LEFT;
        Anchor anchor2 = Anchor.TOP_CENTER;
        Anchor anchor3 = Anchor.TOP_RIGHT;
        Anchor anchor4 = Anchor.BOTTOM_LEFT;
        i = CollectionsKt.R(anchor, anchor2, anchor3, anchor4);
        j = CollectionsKt.R(anchor, anchor2, anchor3, anchor4);
        Pair pair = new Pair(anchor, anchor4);
        Anchor anchor5 = Anchor.CENTER_LEFT;
        Pair pair2 = new Pair(anchor2, anchor5);
        Pair pair3 = new Pair(anchor3, anchor);
        Anchor anchor6 = Anchor.BOTTOM_CENTER;
        Pair pair4 = new Pair(anchor5, anchor6);
        Anchor anchor7 = Anchor.CENTER;
        Pair pair5 = new Pair(anchor7, anchor7);
        Anchor anchor8 = Anchor.CENTER_RIGHT;
        Pair pair6 = new Pair(anchor8, anchor2);
        Anchor anchor9 = Anchor.BOTTOM_RIGHT;
        k = MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, new Pair(anchor4, anchor9), new Pair(anchor6, anchor8), new Pair(anchor9, anchor3));
        l = anchor4;
        m = anchor;
        n = anchor;
    }

    public C0759o3(Context context) {
        Intrinsics.h(context, "context");
        this.f17868a = EmptyList.d;
        this.b = LazyKt.b(new C0743n3(context));
        this.c = LazyKt.b(new C0727m3(context));
        this.d = LazyKt.b(new C0711l3(context));
    }

    public final List a() {
        return this.f17868a;
    }

    public final ArrayList a(BarcodePickViewSettings settings, boolean z) {
        Control controlB;
        PointWithUnit pointWithUnit;
        Intrinsics.h(settings, "settings");
        TorchSwitchControl torchSwitchControl = (TorchSwitchControl) this.c.getD();
        boolean showTorchButton = settings.getShowTorchButton();
        Anchor torchButtonPosition = settings.getTorchButtonPosition();
        if (!j.contains(torchButtonPosition)) {
            torchButtonPosition = null;
        }
        if (torchButtonPosition == null) {
            torchButtonPosition = m;
        }
        if (z && (torchButtonPosition = (Anchor) k.get(torchButtonPosition)) == null) {
            torchButtonPosition = n;
        }
        C0679j3 c0679j3 = new C0679j3(torchSwitchControl, showTorchButton, torchButtonPosition);
        ZoomSwitchControl zoomSwitchControl = (ZoomSwitchControl) this.b.getD();
        boolean showZoomButton = settings.getShowZoomButton();
        Anchor zoomButtonPosition = settings.getZoomButtonPosition();
        Anchor anchor = i.contains(zoomButtonPosition) ? zoomButtonPosition : null;
        if (anchor == null) {
            anchor = l;
        }
        if (z && (anchor = (Anchor) k.get(anchor)) == null) {
            anchor = n;
        }
        List listR = CollectionsKt.R(c0679j3, new C0679j3(zoomSwitchControl, showZoomButton, anchor));
        ViewExtensionsKt.removeFromSuperview(((ZoomSwitchControl) this.b.getD()).get_view());
        ViewExtensionsKt.removeFromSuperview(((TorchSwitchControl) this.c.getD()).get_view());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((C0679j3) obj).c()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Anchor anchorA = ((C0679j3) next).a();
            Object arrayList2 = linkedHashMap.get(anchorA);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(anchorA, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Anchor anchor2 = (Anchor) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() > 1) {
                LinearControlGroupBuilder orientation = ((LinearControlGroupBuilder) this.d.getD()).setOrientation(z ? LinearControlGroupOrientation.HORIZONTAL : LinearControlGroupOrientation.VERTICAL);
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((C0679j3) it2.next()).b());
                }
                controlB = orientation.setControls(arrayList4).build();
            } else {
                controlB = ((C0679j3) CollectionsKt.D(list)).b();
            }
            if (anchor2 == Anchor.TOP_CENTER) {
                pointWithUnit = f;
            } else if (anchor2 == Anchor.CENTER_LEFT) {
                pointWithUnit = g;
            } else {
                int i2 = AbstractC0695k3.f17829a[anchor2.ordinal()];
                pointWithUnit = (i2 == 1 || i2 == 2) ? h : e;
            }
            arrayList3.add(new C0553c9(controlB, anchor2, pointWithUnit));
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C0553c9) it3.next()).b());
        }
        this.f17868a = arrayList5;
        return arrayList3;
    }
}
