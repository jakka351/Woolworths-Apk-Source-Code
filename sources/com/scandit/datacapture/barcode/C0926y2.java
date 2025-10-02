package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.y2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0926y2 extends FrameLayout implements BarcodePickDrawer {
    private BarcodePickViewHighlightStyle b;
    private final InterfaceC0773p2 c;
    private final D2 d;
    private final Map e;
    private final InterfaceC0626fe f;
    private final Paint g;
    private final Paint h;
    private boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0926y2(BarcodePickBasicOverlay container, BarcodePickViewHighlightStyle highlightStyle, InterfaceC0773p2 drawDataFactory, D2 drawSettings, Map drawingData, InterfaceC0626fe touchEventHandler, Paint tapPaint, Paint boundingBoxPaint) {
        super(container.getContext());
        Intrinsics.h(container, "container");
        Intrinsics.h(highlightStyle, "highlightStyle");
        Intrinsics.h(drawDataFactory, "drawDataFactory");
        Intrinsics.h(drawSettings, "drawSettings");
        Intrinsics.h(drawingData, "drawingData");
        Intrinsics.h(touchEventHandler, "touchEventHandler");
        Intrinsics.h(tapPaint, "tapPaint");
        Intrinsics.h(boundingBoxPaint, "boundingBoxPaint");
        this.b = highlightStyle;
        this.c = drawDataFactory;
        this.d = drawSettings;
        this.e = drawingData;
        this.f = touchEventHandler;
        this.g = tapPaint;
        this.h = boundingBoxPaint;
        container.addView(this, new FrameLayout.LayoutParams(-1, -1));
        setElevation(PixelExtensionsKt.pxFromDp$default(4.0f, (Context) null, 1, (Object) null));
        setWillNotDraw(false);
        setClickable(true);
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
        if (this.i) {
            for (C0758o2 c0758o2 : this.e.values()) {
                if (this.d.a()) {
                    AbstractC0945z6 abstractC0945z6E = c0758o2.e();
                    if (abstractC0945z6E != null) {
                        canvas.drawPath(abstractC0945z6E.b(), this.g);
                    }
                    canvas.drawPath(c0758o2.a().b(), this.h);
                }
                K8 k8D = c0758o2.d();
                if (k8D != null) {
                    if (k8D.b().isEmpty()) {
                        canvas.drawPath(c0758o2.b().b(), k8D.a());
                    } else {
                        for (A6 a6 : k8D.b()) {
                            Path pathB = c0758o2.b().b();
                            Paint paintA = k8D.a();
                            paintA.setShadowLayer(a6.d(), a6.b(), a6.c(), a6.a());
                            canvas.drawPath(pathB, paintA);
                            paintA.clearShadowLayer();
                        }
                    }
                    canvas.drawPath(c0758o2.b().b(), k8D.c());
                }
                if (c0758o2.c() != null) {
                    Quadrilateral quadrilateralA = c0758o2.b().a();
                    Drawable drawableC = c0758o2.c();
                    Point center = QuadrilateralUtilsKt.getCenter(c0758o2.a().a());
                    float fC = this.d.c();
                    float fD = this.d.d();
                    float fB = this.d.b();
                    float f = 2;
                    if (Math.min(QuadrilateralUtilsKt.getWidth(quadrilateralA), QuadrilateralUtilsKt.getHeight(quadrilateralA)) < (fB * f) + fC) {
                        float fFloor = (float) Math.floor((fC / r6) * r2);
                        if (fFloor >= fD) {
                            fD = fFloor;
                        }
                        if (fD <= fC) {
                            fC = fD;
                        }
                    }
                    float f2 = fC / f;
                    drawableC.setBounds((int) (center.getX() - f2), (int) (center.getY() - f2), (int) (center.getX() + f2), (int) (center.getY() + f2));
                    drawableC.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.h(event, "event");
        return ((C0642ge) this.f).a(event);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void start() {
        this.i = true;
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void stop() {
        this.i = false;
        this.e.clear();
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        if (this.i) {
            this.e.put(Integer.valueOf(track.c()), ((C0896w2) this.c).a(track, pickState, this.b));
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void b(TrackedObject track, BarcodePickState pickState) {
        Intrinsics.h(track, "track");
        Intrinsics.h(pickState, "pickState");
        if (this.i) {
            this.e.put(Integer.valueOf(track.c()), ((C0896w2) this.c).a(track, pickState, this.b));
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(int i) {
        if (this.i) {
            this.e.remove(Integer.valueOf(i));
            invalidate();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a() {
        this.i = true;
        invalidate();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer
    public final void a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.h(highlightStyle, "highlightStyle");
        this.b = highlightStyle;
    }
}
