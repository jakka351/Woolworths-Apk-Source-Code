package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.g6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0634g6 implements BarcodePickDrawer {
    private final List b;

    public C0634g6(List drawers) {
        Intrinsics.h(drawers, "drawers");
        this.b = drawers;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(track, pickState);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).b(track, pickState);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).start();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(i);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean b() {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((BarcodePickDrawer) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.h(tracks, "tracks");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(tracks);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(highlightStyle, "highlightStyle");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((BarcodePickDrawer) it.next()).a(highlightStyle);
        }
    }
}
