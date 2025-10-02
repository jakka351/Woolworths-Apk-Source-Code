package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class Y2 extends FrameLayout implements BarcodePickDrawer {
    private final ViewGroup b;
    private final boolean c;
    private final InterfaceC0626fe d;
    private final BarcodePickViewHighlightStyle e;
    private final C0583d3 f;
    private final W2 g;
    private final BarcodePickElementsCache h;
    private final Paint i;
    private final Map j;
    private final boolean k;
    private boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(BarcodePickBasicOverlay container, boolean z, InterfaceC0626fe touchEventHandler, BarcodePickViewHighlightStyle.CustomView highlightStyle, C0583d3 drawSettings, W2 drawDataFactory, BarcodePickElementsCache cache, Paint tapPaint, Map drawingData, boolean z2) {
        super(container.getContext());
        Intrinsics.h(container, "container");
        Intrinsics.h(touchEventHandler, "touchEventHandler");
        Intrinsics.h(highlightStyle, "highlightStyle");
        Intrinsics.h(drawSettings, "drawSettings");
        Intrinsics.h(drawDataFactory, "drawDataFactory");
        Intrinsics.h(cache, "cache");
        Intrinsics.h(tapPaint, "tapPaint");
        Intrinsics.h(drawingData, "drawingData");
        this.b = container;
        this.c = z;
        this.d = touchEventHandler;
        this.e = highlightStyle;
        this.f = drawSettings;
        this.g = drawDataFactory;
        this.h = cache;
        this.i = tapPaint;
        this.j = drawingData;
        this.k = z2;
        container.addView(this, new FrameLayout.LayoutParams(-1, -1));
        setElevation(PixelExtensionsKt.pxFromDp$default(4.0f, (Context) null, 1, (Object) null));
        setWillNotDraw(false);
        setClickable(true);
    }

    private final void c(TrackedObject trackedObject, BarcodePickState barcodePickState) {
        View viewB;
        View viewE;
        Pair pair;
        String strB = trackedObject.b();
        if (strB == null) {
            return;
        }
        U2 u2 = (U2) this.j.get(Integer.valueOf(trackedObject.c()));
        C0549c5 c0549c5 = (C0549c5) this.h.a(strB, barcodePickState, u2 != null ? u2.a() : null);
        if (u2 == null) {
            viewB = c0549c5 != null ? c0549c5.b() : null;
        } else if (c0549c5 == null) {
            viewB = u2.e();
        } else if (Intrinsics.c(u2.e(), c0549c5.b())) {
            viewB = c0549c5.b();
        } else {
            U2 u22 = (U2) this.j.remove(Integer.valueOf(trackedObject.c()));
            if (u22 != null && (viewE = u22.e()) != null) {
                viewE.setOnClickListener(null);
                ViewParent parent = viewE.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(viewE);
                }
            }
            viewB = c0549c5.b();
        }
        if (viewB != null) {
            U2 u2A = ((X2) this.g).a(viewB, trackedObject, barcodePickState, this.e);
            this.j.put(Integer.valueOf(trackedObject.c()), u2A);
            View viewE2 = u2A.e();
            ViewParent parent2 = viewE2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (!Intrinsics.c(viewGroup2, this.b) && viewGroup2 != null) {
                viewGroup2.removeView(viewE2);
            }
            View viewE3 = u2A.e();
            viewE3.setX(u2A.b().getOrigin().getX());
            viewE3.setY(u2A.b().getOrigin().getY());
            Size2 size = u2A.b().getSize();
            boolean z = this.c;
            if (z) {
                pair = new Pair(Integer.valueOf((int) size.getWidth()), Integer.valueOf((int) size.getHeight()));
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(-2, -2);
            }
            int iIntValue = ((Number) pair.d).intValue();
            int iIntValue2 = ((Number) pair.e).intValue();
            ViewGroup.LayoutParams layoutParams = viewE3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue2;
                layoutParams.width = iIntValue;
            } else {
                layoutParams = new ViewGroup.LayoutParams(iIntValue, iIntValue2);
            }
            viewE3.setLayoutParams(layoutParams);
            if (viewE2.getParent() == null) {
                this.b.addView(viewE2);
            }
            if (this.k) {
                ViewExtensionsKt.hideImages(viewB);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(List tracks) {
        Intrinsics.h(tracks, "tracks");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        if (this.l && this.f.a()) {
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                canvas.drawPath(((U2) it.next()).c().b(), this.i);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.h(event, "event");
        return ((C0642ge) this.d).a(event);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.l = true;
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        this.l = false;
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            View viewE = ((U2) it.next()).e();
            viewE.setOnClickListener(null);
            ViewParent parent = viewE.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewE);
            }
        }
        this.j.clear();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(highlightStyle, "highlightStyle");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        if (this.l) {
            c(track, pickState);
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        if (this.l) {
            c(track, pickState);
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i) {
        View viewE;
        if (this.l) {
            U2 u2 = (U2) this.j.remove(Integer.valueOf(i));
            if (u2 != null && (viewE = u2.e()) != null) {
                viewE.setOnClickListener(null);
                ViewParent parent = viewE.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(viewE);
                }
            }
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a() {
        this.l = true;
        invalidate();
    }
}
