package com.otaliastudios.zoom.internal.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import com.otaliastudios.zoom.internal.StateController;
import com.otaliastudios.zoom.internal.matrix.MatrixController;
import com.otaliastudios.zoom.internal.matrix.MatrixUpdate;
import com.otaliastudios.zoom.internal.movement.PanManager;
import com.otaliastudios.zoom.internal.movement.ZoomManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/zoom/internal/gestures/PinchDetector;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class PinchDetector implements ScaleGestureDetector.OnScaleGestureListener {
    public static final ZoomLogger h = new ZoomLogger("PinchDetector");

    /* renamed from: a, reason: collision with root package name */
    public final ZoomManager f16818a;
    public final PanManager b;
    public final StateController c;
    public final MatrixController d;
    public final ScaleGestureDetector e;
    public final AbsolutePoint f;
    public final AbsolutePoint g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/otaliastudios/zoom/internal/gestures/PinchDetector$Companion;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public PinchDetector(Context context, ZoomManager zoomManager, PanManager panManager, StateController stateController, MatrixController matrixController) {
        this.f16818a = zoomManager;
        this.b = panManager;
        this.c = stateController;
        this.d = matrixController;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.e = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f = new AbsolutePoint(Float.NaN, Float.NaN);
        this.g = new AbsolutePoint(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(final ScaleGestureDetector detector) {
        Intrinsics.h(detector, "detector");
        if (!this.f16818a.i || !this.c.b(2)) {
            return false;
        }
        PointF pointF = new PointF(-detector.getFocusX(), -detector.getFocusY());
        MatrixController matrixController = this.d;
        RectF rectF = matrixController.e;
        AbsolutePoint absolutePointB = ScaledPoint.b(new ScaledPoint(rectF.left + pointF.x, rectF.top + pointF.y), matrixController.g());
        AbsolutePoint absolutePoint = this.f;
        boolean zIsNaN = Float.isNaN(absolutePoint.f16808a);
        ZoomLogger zoomLogger = h;
        if (zIsNaN) {
            absolutePoint.b(absolutePointB);
            zoomLogger.b("onScale:", "Setting initial focus:", absolutePoint);
        } else {
            AbsolutePoint absolutePoint2 = new AbsolutePoint(absolutePoint.f16808a - absolutePointB.f16808a, absolutePoint.b - absolutePointB.b);
            AbsolutePoint absolutePoint3 = this.g;
            absolutePoint3.b(absolutePoint2);
            zoomLogger.b("onScale:", "Got focus offset:", absolutePoint3);
        }
        final float scaleFactor = detector.getScaleFactor() * matrixController.g();
        matrixController.b(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.PinchDetector.onScale.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                Intrinsics.h(applyUpdate, "$this$applyUpdate");
                applyUpdate.f16821a = scaleFactor;
                applyUpdate.b = true;
                AbsolutePoint absolutePoint4 = this.g;
                applyUpdate.d = null;
                applyUpdate.c = absolutePoint4;
                applyUpdate.e = true;
                applyUpdate.f = true;
                ScaleGestureDetector scaleGestureDetector = detector;
                Float fValueOf = Float.valueOf(scaleGestureDetector.getFocusX());
                Float fValueOf2 = Float.valueOf(scaleGestureDetector.getFocusY());
                applyUpdate.g = fValueOf;
                applyUpdate.h = fValueOf2;
                return Unit.f24250a;
            }
        }));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.h(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        final PointF pointF;
        Float fValueOf = Float.valueOf(Float.NaN);
        Intrinsics.h(detector, "detector");
        AbsolutePoint absolutePoint = this.f;
        Float fValueOf2 = Float.valueOf(absolutePoint.f16808a);
        Float fValueOf3 = Float.valueOf(absolutePoint.b);
        ZoomManager zoomManager = this.f16818a;
        Object[] objArr = {"onScaleEnd:", "mInitialAbsFocusPoint.x:", fValueOf2, "mInitialAbsFocusPoint.y:", fValueOf3, "mOverZoomEnabled;", Boolean.valueOf(zoomManager.j)};
        ZoomLogger zoomLogger = h;
        zoomLogger.b(objArr);
        Float fValueOf4 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        boolean z = zoomManager.j;
        StateController stateController = this.c;
        PanManager panManager = this.b;
        if (z || panManager.c || panManager.d) {
            float fC = zoomManager.c();
            float fD = zoomManager.d();
            MatrixController matrixController = this.d;
            final float fB = zoomManager.b(matrixController.g(), false);
            zoomLogger.b("onScaleEnd:", "zoom:", Float.valueOf(matrixController.g()), "newZoom:", Float.valueOf(fB), "max:", Float.valueOf(fC), "min:", Float.valueOf(fD));
            AbsolutePoint absolutePointB = ScaledPoint.b(panManager.e(), matrixController.g());
            if (absolutePointB.f16808a == BitmapDescriptorFactory.HUE_RED && absolutePointB.b == BitmapDescriptorFactory.HUE_RED && Float.compare(fB, matrixController.g()) == 0) {
                stateController.b(0);
            } else {
                float fG = matrixController.g();
                RectF rectF = matrixController.f;
                if (fG <= 1.0f) {
                    AbsolutePoint absolutePoint2 = new AbsolutePoint((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f);
                    float fG2 = matrixController.g();
                    ScaledPoint scaledPoint = new ScaledPoint();
                    scaledPoint.a(Float.valueOf(absolutePoint2.f16808a * fG2), Float.valueOf(absolutePoint2.b * fG2));
                    ScaledPoint scaledPointF = matrixController.f();
                    ScaledPoint scaledPoint2 = new ScaledPoint(scaledPoint.f16812a - scaledPointF.f16812a, scaledPoint.b - scaledPointF.b);
                    pointF = new PointF(scaledPoint2.f16812a, scaledPoint2.b);
                    pointF.set(-pointF.x, -pointF.y);
                } else {
                    float f = absolutePointB.f16808a;
                    float f2 = f > BitmapDescriptorFactory.HUE_RED ? matrixController.j : f < BitmapDescriptorFactory.HUE_RED ? 0.0f : matrixController.j / 2.0f;
                    float f3 = absolutePointB.b;
                    pointF = new PointF(f2, f3 > BitmapDescriptorFactory.HUE_RED ? matrixController.k : f3 < BitmapDescriptorFactory.HUE_RED ? 0.0f : matrixController.k / 2.0f);
                }
                final AbsolutePoint absolutePointA = matrixController.c().a(absolutePointB);
                if (Float.compare(fB, matrixController.g()) != 0) {
                    AbsolutePoint absolutePointC = matrixController.c();
                    final AbsolutePoint absolutePoint3 = new AbsolutePoint(absolutePointC.f16808a, absolutePointC.b);
                    final float fG3 = matrixController.g();
                    matrixController.b(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.PinchDetector$handleOnScaleEnd$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                            Intrinsics.h(applyUpdate, "$this$applyUpdate");
                            applyUpdate.f16821a = fB;
                            applyUpdate.b = true;
                            PointF pointF2 = pointF;
                            Float fValueOf5 = Float.valueOf(pointF2.x);
                            Float fValueOf6 = Float.valueOf(pointF2.y);
                            applyUpdate.g = fValueOf5;
                            applyUpdate.h = fValueOf6;
                            applyUpdate.f = true;
                            applyUpdate.i = false;
                            return Unit.f24250a;
                        }
                    }));
                    AbsolutePoint absolutePointB2 = ScaledPoint.b(panManager.e(), matrixController.g());
                    absolutePointA.b(matrixController.c().a(absolutePointB2));
                    matrixController.b(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.PinchDetector$handleOnScaleEnd$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                            Intrinsics.h(applyUpdate, "$this$applyUpdate");
                            applyUpdate.f16821a = fG3;
                            applyUpdate.b = true;
                            applyUpdate.d = null;
                            applyUpdate.c = absolutePoint3;
                            applyUpdate.e = false;
                            applyUpdate.f = true;
                            applyUpdate.i = false;
                            return Unit.f24250a;
                        }
                    }));
                    absolutePointB = absolutePointB2;
                }
                if (absolutePointB.f16808a == BitmapDescriptorFactory.HUE_RED && absolutePointB.b == BitmapDescriptorFactory.HUE_RED) {
                    matrixController.a(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.PinchDetector$handleOnScaleEnd$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MatrixUpdate.Builder animateUpdate = (MatrixUpdate.Builder) obj;
                            Intrinsics.h(animateUpdate, "$this$animateUpdate");
                            animateUpdate.f16821a = fB;
                            animateUpdate.b = true;
                            return Unit.f24250a;
                        }
                    }));
                } else {
                    matrixController.a(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.PinchDetector$handleOnScaleEnd$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MatrixUpdate.Builder animateUpdate = (MatrixUpdate.Builder) obj;
                            Intrinsics.h(animateUpdate, "$this$animateUpdate");
                            animateUpdate.f16821a = fB;
                            animateUpdate.b = true;
                            animateUpdate.d = null;
                            animateUpdate.c = absolutePointA;
                            animateUpdate.e = false;
                            animateUpdate.f = true;
                            PointF pointF2 = pointF;
                            Float fValueOf5 = Float.valueOf(pointF2.x);
                            Float fValueOf6 = Float.valueOf(pointF2.y);
                            animateUpdate.g = fValueOf5;
                            animateUpdate.h = fValueOf6;
                            return Unit.f24250a;
                        }
                    }));
                }
            }
        } else {
            stateController.b(0);
        }
        absolutePoint.c(fValueOf, fValueOf);
        this.g.c(fValueOf4, fValueOf4);
    }
}
