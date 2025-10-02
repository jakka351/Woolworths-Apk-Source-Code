package com.otaliastudios.zoom.internal.gestures;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import com.otaliastudios.zoom.internal.StateController;
import com.otaliastudios.zoom.internal.matrix.MatrixController;
import com.otaliastudios.zoom.internal.matrix.MatrixUpdate;
import com.otaliastudios.zoom.internal.movement.PanManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/zoom/internal/gestures/ScrollFlingDetector;", "Landroid/view/GestureDetector$OnGestureListener;", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollFlingDetector implements GestureDetector.OnGestureListener {
    public static final ZoomLogger q = new ZoomLogger("ScrollFlingDetector");
    public final PanManager d;
    public final StateController e;
    public final MatrixController f;
    public final GestureDetector g;
    public final OverScroller h;
    public final PanManager.Status i;
    public final PanManager.Status j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/otaliastudios/zoom/internal/gestures/ScrollFlingDetector$Companion;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public ScrollFlingDetector(Context context, PanManager panManager, StateController stateController, MatrixController matrixController) {
        this.d = panManager;
        this.e = stateController;
        this.f = matrixController;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(null);
        this.g = gestureDetector;
        this.h = new OverScroller(context);
        this.i = new PanManager.Status();
        this.j = new PanManager.Status();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
    }

    public final void a() {
        PanManager panManager = this.d;
        if (panManager.c || panManager.d) {
            final ScaledPoint scaledPointE = panManager.e();
            if (scaledPointE.f16812a != BitmapDescriptorFactory.HUE_RED || scaledPointE.b != BitmapDescriptorFactory.HUE_RED) {
                this.f.a(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector$correctOverpan$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MatrixUpdate.Builder animateUpdate = (MatrixUpdate.Builder) obj;
                        Intrinsics.h(animateUpdate, "$this$animateUpdate");
                        animateUpdate.d = scaledPointE;
                        animateUpdate.c = null;
                        animateUpdate.e = true;
                        animateUpdate.f = true;
                        return Unit.f24250a;
                    }
                }));
                return;
            }
        }
        this.e.b(0);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.h(e, "e");
        this.h.forceFinished(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector$onFling$1] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        PanManager panManager;
        boolean z;
        if (!this.k || (!(z = (panManager = this.d).e) && !panManager.f)) {
            return false;
        }
        float fG = BitmapDescriptorFactory.HUE_RED;
        int i = (int) (z ? f : 0.0f);
        int i2 = (int) (panManager.f ? f2 : 0.0f);
        PanManager.Status status = this.i;
        panManager.d(true, status);
        PanManager.Status status2 = this.j;
        panManager.d(false, status2);
        int i3 = status.f16823a;
        int i4 = status.b;
        int i5 = status.c;
        int i6 = status2.f16823a;
        int i7 = status2.b;
        int i8 = status2.c;
        if ((this.p || (!status.d && !status2.d)) && ((i3 < i5 || i6 < i8 || panManager.c || panManager.d) && this.e.b(4))) {
            this.g.setIsLongpressEnabled(false);
            float f3 = panManager.c ? panManager.f() : 0.0f;
            if (panManager.d) {
                fG = panManager.g();
            }
            Object[] objArr = {"startFling", "velocityX:", Integer.valueOf(i), "velocityY:", Integer.valueOf(i2)};
            ZoomLogger zoomLogger = q;
            zoomLogger.b(objArr);
            zoomLogger.b("startFling", "flingX:", "min:", Integer.valueOf(i3), "max:", Integer.valueOf(i5), "start:", Integer.valueOf(i4), "overScroll:", Float.valueOf(fG));
            zoomLogger.b("startFling", "flingY:", "min:", Integer.valueOf(i6), "max:", Integer.valueOf(i8), "start:", Integer.valueOf(i7), "overScroll:", Float.valueOf(f3));
            this.h.fling(i4, i7, i, i2, i3, i5, i6, i8, (int) f3, (int) fG);
            this.f.d.e(new Runnable() { // from class: com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector.onFling.1
                @Override // java.lang.Runnable
                public final void run() {
                    ScrollFlingDetector scrollFlingDetector = ScrollFlingDetector.this;
                    MatrixController matrixController = scrollFlingDetector.f;
                    OverScroller overScroller = scrollFlingDetector.h;
                    if (overScroller.isFinished()) {
                        scrollFlingDetector.e.b(0);
                        scrollFlingDetector.g.setIsLongpressEnabled(true);
                    } else if (overScroller.computeScrollOffset()) {
                        final ScaledPoint scaledPoint = new ScaledPoint(overScroller.getCurrX(), overScroller.getCurrY());
                        matrixController.b(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector$onFling$1$run$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                                Intrinsics.h(applyUpdate, "$this$applyUpdate");
                                applyUpdate.d = scaledPoint;
                                applyUpdate.c = null;
                                applyUpdate.e = false;
                                applyUpdate.f = true;
                                return Unit.f24250a;
                            }
                        }));
                        matrixController.d.d(this);
                    }
                }
            });
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.l) {
            boolean z = motionEvent2 != null && motionEvent2.getPointerCount() == 1;
            boolean z2 = motionEvent2 != null && motionEvent2.getPointerCount() == 2;
            boolean z3 = motionEvent2 != null && motionEvent2.getPointerCount() == 3;
            if ((this.m || !z) && ((this.n || !z2) && (this.o || !z3))) {
                PanManager panManager = this.d;
                if ((panManager.e || panManager.f) && this.e.b(1)) {
                    final ScaledPoint scaledPoint = new ScaledPoint(-f, -f2);
                    ScaledPoint scaledPointE = panManager.e();
                    float f3 = scaledPointE.f16812a;
                    ZoomLogger zoomLogger = q;
                    if ((f3 < BitmapDescriptorFactory.HUE_RED && scaledPoint.f16812a > BitmapDescriptorFactory.HUE_RED) || (f3 > BitmapDescriptorFactory.HUE_RED && scaledPoint.f16812a < BitmapDescriptorFactory.HUE_RED)) {
                        float fPow = (1.0f - ((float) Math.pow(Math.abs(f3) / panManager.f(), 0.4d))) * 0.6f;
                        zoomLogger.b("onScroll", "applying friction X:", Float.valueOf(fPow));
                        scaledPoint.f16812a *= fPow;
                    }
                    float f4 = scaledPointE.b;
                    if ((f4 < BitmapDescriptorFactory.HUE_RED && scaledPoint.b > BitmapDescriptorFactory.HUE_RED) || (f4 > BitmapDescriptorFactory.HUE_RED && scaledPoint.b < BitmapDescriptorFactory.HUE_RED)) {
                        float fPow2 = (1.0f - ((float) Math.pow(Math.abs(f4) / panManager.g(), 0.4d))) * 0.6f;
                        zoomLogger.b("onScroll", "applying friction Y:", Float.valueOf(fPow2));
                        scaledPoint.b *= fPow2;
                    }
                    if (!panManager.e) {
                        scaledPoint.f16812a = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (!panManager.f) {
                        scaledPoint.b = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (scaledPoint.f16812a == BitmapDescriptorFactory.HUE_RED && scaledPoint.b == BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    this.f.b(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector.onScroll.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                            Intrinsics.h(applyUpdate, "$this$applyUpdate");
                            applyUpdate.d = scaledPoint;
                            applyUpdate.c = null;
                            applyUpdate.e = true;
                            applyUpdate.f = true;
                            return Unit.f24250a;
                        }
                    }));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
