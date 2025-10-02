package com.scandit.datacapture.barcode;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class R4 implements BarcodePickDrawer {
    private final FrameLayout b;
    private final InterfaceC0826s7 c;
    private final InterfaceC0601e5 d;
    private BarcodePickViewHighlightStyle e;
    private final L4 f;
    private final Map g;
    private boolean h;
    private final List i;
    private boolean j;

    public R4(BarcodePickBasicOverlay container, InterfaceC0826s7 styleBehaviour, BarcodePickElementsCache cache, BarcodePickViewHighlightStyle highlightStyle, L4 drawDataFactory, Map statusIconsMap, boolean z, List viewCachePool) {
        Intrinsics.h(container, "container");
        Intrinsics.h(styleBehaviour, "styleBehaviour");
        Intrinsics.h(cache, "cache");
        Intrinsics.h(highlightStyle, "highlightStyle");
        Intrinsics.h(drawDataFactory, "drawDataFactory");
        Intrinsics.h(statusIconsMap, "statusIconsMap");
        Intrinsics.h(viewCachePool, "viewCachePool");
        this.b = container;
        this.c = styleBehaviour;
        this.d = cache;
        this.e = highlightStyle;
        this.f = drawDataFactory;
        this.g = statusIconsMap;
        this.h = z;
        this.i = viewCachePool;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.h(tracks, "tracks");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        BarcodePickStatusIconStyle barcodePickStatusIconStyleA;
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        if (this.g.containsKey(Integer.valueOf(track.c()))) {
            a(track, pickState);
            return;
        }
        X4 x4 = (X4) this.g.get(Integer.valueOf(track.c()));
        BarcodePickState barcodePickStateF = x4 != null ? x4.f() : null;
        InterfaceC0585d5 interfaceC0585d5A = this.d.a(track.b(), pickState, barcodePickStateF);
        if (interfaceC0585d5A == null || (barcodePickStatusIconStyleA = interfaceC0585d5A.a()) == null) {
            return;
        }
        J4 j4A = this.f.a(track, pickState, barcodePickStateF);
        X4 x4A = (X4) CollectionsKt.i0(this.i);
        if (x4A == null) {
            x4A = U4.a(this.b, j4A, new O4(this));
        }
        x4A.a(barcodePickStatusIconStyleA);
        this.b.addView(x4A.getView(), new ViewGroup.LayoutParams(-2, -2));
        a(x4A, j4A);
        this.g.put(Integer.valueOf(track.c()), x4A);
        x4A.a(new N4(this, track));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.j = false;
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((Z4) ((X4) it.next())).a(W4.f17332a);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        Iterator it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            this.b.removeView(((X4) ((Map.Entry) it.next()).getValue()).getView());
        }
        this.i.clear();
        this.g.clear();
    }

    public static final boolean a(R4 r4, View view) {
        r4.getClass();
        return view.getY() >= BitmapDescriptorFactory.HUE_RED && r4.j;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        X4 x4 = (X4) this.g.get(Integer.valueOf(track.c()));
        BarcodePickState barcodePickStateF = x4 != null ? x4.f() : null;
        J4 j4A = this.f.a(track, pickState, barcodePickStateF);
        InterfaceC0585d5 interfaceC0585d5A = this.d.a(track.b(), pickState, barcodePickStateF);
        if (interfaceC0585d5A == null) {
            X4 x42 = (X4) this.g.get(Integer.valueOf(track.c()));
            if (x42 != null) {
                a(x42, j4A);
                return;
            }
            return;
        }
        BarcodePickStatusIconStyle barcodePickStatusIconStyleA = interfaceC0585d5A.a();
        if (barcodePickStatusIconStyleA == null && this.g.get(Integer.valueOf(track.c())) != null) {
            X4 x43 = (X4) this.g.remove(Integer.valueOf(track.c()));
            if (x43 != null) {
                this.b.removeView(x43.getView());
                x43.c();
                this.i.add(x43);
                return;
            }
            return;
        }
        if (barcodePickStatusIconStyleA != null && this.g.get(Integer.valueOf(track.c())) == null) {
            X4 x4A = (X4) CollectionsKt.i0(this.i);
            if (x4A == null) {
                x4A = U4.a(this.b, j4A, new O4(this));
            }
            x4A.a(barcodePickStatusIconStyleA);
            this.b.addView(x4A.getView(), new ViewGroup.LayoutParams(-2, -2));
            a(x4A, j4A);
            this.g.put(Integer.valueOf(track.c()), x4A);
            x4A.a(new N4(this, track));
            return;
        }
        X4 x44 = (X4) this.g.get(Integer.valueOf(track.c()));
        if (x44 != null) {
            a(x44, j4A);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean b() {
        return !this.g.isEmpty();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a() {
        this.j = true;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(highlightStyle, "highlightStyle");
        this.e = highlightStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(X4 x4, J4 j4) {
        x4.a(j4);
        M4 m4A = this.c.a(x4, j4);
        x4.a(m4A.c(), m4A.d());
        x4.a(m4A.a(), m4A.b());
        x4.a(this.c.b(x4, j4));
    }

    public static final void a(R4 r4, TrackedObject trackedObject) {
        if (r4.h) {
            return;
        }
        r4.h = true;
        for (Map.Entry entry : r4.g.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            X4 x4 = (X4) entry.getValue();
            if (iIntValue == trackedObject.c()) {
                int iOrdinal = x4.d().ordinal();
                if (iOrdinal == 0) {
                    x4.b(new P4(r4));
                } else if (iOrdinal == 1) {
                    x4.a(new Q4(r4));
                }
            } else {
                ((Z4) x4).a(W4.f17332a);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i) {
        X4 x4 = (X4) this.g.remove(Integer.valueOf(i));
        if (x4 != null) {
            this.b.removeView(x4.getView());
            x4.c();
            this.i.add(x4);
        }
    }
}
