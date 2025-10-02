package com.scandit.datacapture.barcode;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class J3 extends View implements BarcodePickDrawer {
    private final H3 b;
    private final Map c;
    private boolean d;
    private List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(BarcodePickBasicOverlay container, H3 drawDataFactory, Map drawingData) {
        super(container.getContext());
        Intrinsics.h(container, "container");
        Intrinsics.h(drawDataFactory, "drawDataFactory");
        Intrinsics.h(drawingData, "drawingData");
        this.b = drawDataFactory;
        this.c = drawingData;
        container.addView(this, new FrameLayout.LayoutParams(-1, -1));
        setClickable(false);
        this.e = EmptyList.d;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i) {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        if (this.d) {
            for (G3 g3 : this.c.values()) {
                K8 k8B = g3.b();
                if (k8B != null) {
                    canvas.drawPath(g3.a().a(), k8B.a());
                    canvas.drawPath(g3.a().a(), k8B.c());
                }
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.d = true;
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        this.d = false;
        this.c.clear();
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(highlightStyle, "highlightStyle");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.h(tracks, "tracks");
        if (this.d) {
            Iterator it = tracks.iterator();
            while (it.hasNext()) {
                TrackedObject trackedObject = (TrackedObject) it.next();
                this.c.put(Integer.valueOf(trackedObject.c()), ((I3) this.b).a(trackedObject));
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.s(tracks, 10));
            Iterator it2 = tracks.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((TrackedObject) it2.next()).c()));
            }
            List list = this.e;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!arrayList.contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList2.add(obj);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                this.c.remove(Integer.valueOf(((Number) it3.next()).intValue()));
            }
            this.e = arrayList;
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a() {
        this.d = true;
        invalidate();
    }
}
