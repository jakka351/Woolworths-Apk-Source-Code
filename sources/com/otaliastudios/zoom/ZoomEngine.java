package com.otaliastudios.zoom;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.internal.StateController;
import com.otaliastudios.zoom.internal.UpdatesDispatcher;
import com.otaliastudios.zoom.internal.gestures.PinchDetector;
import com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector;
import com.otaliastudios.zoom.internal.matrix.MatrixController;
import com.otaliastudios.zoom.internal.matrix.MatrixUpdate;
import com.otaliastudios.zoom.internal.movement.PanManager;
import com.otaliastudios.zoom.internal.movement.ZoomManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/ZoomApi;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Callbacks", "Companion", "Listener", "SimpleListener", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class ZoomEngine implements ZoomApi {
    public static final ZoomLogger o = new ZoomLogger("ZoomEngine");
    public int d;
    public int e;
    public View f;
    public final Callbacks g;
    public final UpdatesDispatcher h;
    public final StateController i;
    public final PanManager j;
    public final ZoomManager k;
    public final MatrixController l;
    public final ScrollFlingDetector m;
    public final PinchDetector n;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$Callbacks;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lcom/otaliastudios/zoom/internal/StateController$Callback;", "Lcom/otaliastudios/zoom/internal/matrix/MatrixController$Callback;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class Callbacks implements ViewTreeObserver.OnGlobalLayoutListener, StateController.Callback, MatrixController.Callback {
        public Callbacks() {
        }

        @Override // com.otaliastudios.zoom.internal.StateController.Callback
        public final void a() {
            UpdatesDispatcher updatesDispatcher = ZoomEngine.this.h;
            Iterator it = updatesDispatcher.b.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).b(updatesDispatcher.f16817a);
            }
        }

        @Override // com.otaliastudios.zoom.internal.StateController.Callback
        public final void b() {
            ZoomEngine.this.m.a();
        }

        @Override // com.otaliastudios.zoom.internal.StateController.Callback
        public final boolean c(MotionEvent motionEvent) {
            ScrollFlingDetector scrollFlingDetector = ZoomEngine.this.m;
            scrollFlingDetector.getClass();
            return scrollFlingDetector.g.onTouchEvent(motionEvent);
        }

        @Override // com.otaliastudios.zoom.internal.matrix.MatrixController.Callback
        public final void d(ScrollFlingDetector.AnonymousClass1 anonymousClass1) {
            View view = ZoomEngine.this.f;
            if (view != null) {
                view.postOnAnimation(anonymousClass1);
            } else {
                Intrinsics.p("container");
                throw null;
            }
        }

        @Override // com.otaliastudios.zoom.internal.matrix.MatrixController.Callback
        public final boolean e(ScrollFlingDetector.AnonymousClass1 anonymousClass1) {
            View view = ZoomEngine.this.f;
            if (view != null) {
                return view.post(anonymousClass1);
            }
            Intrinsics.p("container");
            throw null;
        }

        @Override // com.otaliastudios.zoom.internal.matrix.MatrixController.Callback
        public final void f() {
            UpdatesDispatcher updatesDispatcher = ZoomEngine.this.h;
            Iterator it = updatesDispatcher.b.iterator();
            while (it.hasNext()) {
                Listener listener = (Listener) it.next();
                ZoomEngine zoomEngine = updatesDispatcher.f16817a;
                MatrixController matrixController = zoomEngine.l;
                Matrix matrix = matrixController.i;
                matrix.set(matrixController.g);
                listener.a(zoomEngine, matrix);
            }
        }

        @Override // com.otaliastudios.zoom.internal.StateController.Callback
        public final void g(int i) {
            ZoomEngine zoomEngine = ZoomEngine.this;
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                zoomEngine.m.h.forceFinished(true);
            } else {
                LinkedHashSet linkedHashSet = zoomEngine.l.o;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((ValueAnimator) it.next()).cancel();
                }
                linkedHashSet.clear();
            }
        }

        @Override // com.otaliastudios.zoom.internal.StateController.Callback
        public final boolean h() {
            return ZoomEngine.this.l.h;
        }

        @Override // com.otaliastudios.zoom.internal.matrix.MatrixController.Callback
        public final void i(float f, boolean z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(f);
            final ZoomEngine zoomEngine = ZoomEngine.this;
            MatrixController matrixController = zoomEngine.l;
            Integer numValueOf = Integer.valueOf(zoomEngine.d);
            ZoomManager zoomManager = zoomEngine.k;
            Object[] objArr = {"onMatrixSizeChanged: firstTime:", boolValueOf, "oldZoom:", fValueOf, "transformation:", numValueOf, "transformationZoom:", Float.valueOf(zoomManager.c)};
            ZoomLogger zoomLogger = ZoomEngine.o;
            zoomLogger.getClass();
            zoomLogger.e(ZoomLogger.c(2, Arrays.copyOf(objArr, 8)));
            zoomEngine.i.b(0);
            if (z) {
                zoomManager.c = ZoomEngine.a(zoomEngine);
                Function1<MatrixUpdate.Builder, Unit> function1 = new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.ZoomEngine$Callbacks$onMatrixSizeChanged$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                        Intrinsics.h(applyUpdate, "$this$applyUpdate");
                        applyUpdate.f16821a = zoomEngine.k.c;
                        applyUpdate.b = false;
                        applyUpdate.i = false;
                        return Unit.f24250a;
                    }
                };
                matrixController.getClass();
                matrixController.b(MatrixUpdate.Companion.a(function1));
                float fG = (matrixController.g() * zoomEngine.d()) - matrixController.j;
                float fG2 = (matrixController.g() * zoomEngine.c()) - matrixController.k;
                int i = zoomEngine.e;
                PanManager panManager = zoomEngine.j;
                if (i == 0) {
                    int i2 = panManager.g;
                    int i3 = i2 & 240;
                    int i4 = 16;
                    int i5 = i3 != 16 ? i3 != 32 ? 1 : 5 : 3;
                    int i6 = i2 & (-241);
                    if (i6 == 1) {
                        i4 = 48;
                    } else if (i6 == 2) {
                        i4 = 80;
                    }
                    i = i5 | i4;
                }
                panManager.getClass();
                final ScaledPoint scaledPoint = new ScaledPoint(-PanManager.b(true, fG, i), -PanManager.b(false, fG2, i));
                Function1<MatrixUpdate.Builder, Unit> function12 = new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.ZoomEngine$Callbacks$onMatrixSizeChanged$2
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
                        applyUpdate.f = false;
                        return Unit.f24250a;
                    }
                };
                matrixController.getClass();
                matrixController.b(MatrixUpdate.Companion.a(function12));
            } else {
                zoomManager.c = ZoomEngine.a(zoomEngine);
                Function1<MatrixUpdate.Builder, Unit> function13 = new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.ZoomEngine$Callbacks$onMatrixSizeChanged$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                        Intrinsics.h(applyUpdate, "$this$applyUpdate");
                        applyUpdate.f16821a = zoomEngine.l.g();
                        applyUpdate.b = false;
                        return Unit.f24250a;
                    }
                };
                matrixController.getClass();
                matrixController.b(MatrixUpdate.Companion.a(function13));
            }
            zoomLogger.b("onMatrixSizeChanged: newTransformationZoom:", Float.valueOf(zoomManager.c), "newRealZoom:", Float.valueOf(matrixController.g()), "newZoom:", Float.valueOf(zoomEngine.g()));
        }

        @Override // com.otaliastudios.zoom.internal.StateController.Callback
        public final boolean j(MotionEvent motionEvent) {
            PinchDetector pinchDetector = ZoomEngine.this.n;
            pinchDetector.getClass();
            return pinchDetector.e.onTouchEvent(motionEvent);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ZoomEngine zoomEngine = ZoomEngine.this;
            View view = zoomEngine.f;
            if (view == null) {
                Intrinsics.p("container");
                throw null;
            }
            float width = view.getWidth();
            if (zoomEngine.f != null) {
                zoomEngine.k(width, r4.getHeight(), false);
            } else {
                Intrinsics.p("container");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$Companion;", "", "", "DEFAULT_ANIMATION_DURATION", "J", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$Listener;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Listener {
        void a(ZoomEngine zoomEngine, Matrix matrix);

        void b(ZoomEngine zoomEngine);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$SimpleListener;", "Lcom/otaliastudios/zoom/ZoomEngine$Listener;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class SimpleListener implements Listener {
        @Override // com.otaliastudios.zoom.ZoomEngine.Listener
        public final void a(ZoomEngine zoomEngine, Matrix matrix) {
            matrix.getValues(null);
            throw null;
        }
    }

    public ZoomEngine(@NotNull Context context) {
        Intrinsics.h(context, "context");
        Callbacks callbacks = new Callbacks();
        this.g = callbacks;
        this.h = new UpdatesDispatcher(this);
        StateController stateController = new StateController(callbacks);
        this.i = stateController;
        PanManager panManager = new PanManager(this, new Function0<MatrixController>() { // from class: com.otaliastudios.zoom.ZoomEngine$panManager$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.l;
            }
        });
        this.j = panManager;
        ZoomManager zoomManager = new ZoomManager(this, new Function0<MatrixController>() { // from class: com.otaliastudios.zoom.ZoomEngine$zoomManager$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.l;
            }
        });
        this.k = zoomManager;
        MatrixController matrixController = new MatrixController(zoomManager, panManager, stateController, callbacks);
        this.l = matrixController;
        this.m = new ScrollFlingDetector(context, panManager, stateController, matrixController);
        this.n = new PinchDetector(context, zoomManager, panManager, stateController, matrixController);
    }

    public static final float a(ZoomEngine zoomEngine) {
        MatrixController matrixController = zoomEngine.l;
        int i = zoomEngine.d;
        ZoomLogger zoomLogger = o;
        if (i == 0) {
            float fD = matrixController.j / zoomEngine.d();
            float fC = matrixController.k / zoomEngine.c();
            zoomLogger.d("computeTransformationZoom", "centerInside", "scaleX:", Float.valueOf(fD), "scaleY:", Float.valueOf(fC));
            return Math.min(fD, fC);
        }
        if (i != 1) {
            return 1.0f;
        }
        float fD2 = matrixController.j / zoomEngine.d();
        float fC2 = matrixController.k / zoomEngine.c();
        zoomLogger.d("computeTransformationZoom", "centerCrop", "scaleX:", Float.valueOf(fD2), "scaleY:", Float.valueOf(fC2));
        return Math.max(fD2, fC2);
    }

    public final void b(Listener listener) {
        if (this.f == null) {
            throw new IllegalStateException("container is not initialized.");
        }
        UpdatesDispatcher updatesDispatcher = this.h;
        updatesDispatcher.getClass();
        ArrayList arrayList = updatesDispatcher.b;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final float c() {
        return this.l.f.height();
    }

    public final float d() {
        return this.l.f.width();
    }

    public final AbsolutePoint e() {
        AbsolutePoint absolutePointC = this.l.c();
        return new AbsolutePoint(absolutePointC.f16808a, absolutePointC.b);
    }

    public final ScaledPoint f() {
        ScaledPoint scaledPointF = this.l.f();
        return new ScaledPoint(scaledPointF.f16812a, scaledPointF.b);
    }

    public final float g() {
        return this.l.g() / this.k.c;
    }

    public final boolean h(MotionEvent motionEvent) {
        StateController stateController = this.i;
        stateController.getClass();
        return stateController.a(motionEvent) > 0;
    }

    public final void i(final float f) {
        this.l.a(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.ZoomEngine$realZoomTo$update$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MatrixUpdate.Builder obtain = (MatrixUpdate.Builder) obj;
                Intrinsics.h(obtain, "$this$obtain");
                obtain.f16821a = f;
                obtain.b = false;
                return Unit.f24250a;
            }
        }));
    }

    public final void j(View view) {
        if (this.f != null) {
            throw new IllegalStateException("container already set");
        }
        this.f = view;
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.otaliastudios.zoom.ZoomEngine$setContainer$2
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                Intrinsics.h(view2, "view");
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this.d.g);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                Intrinsics.h(view2, "view");
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(this.d.g);
            }
        });
    }

    public final void k(float f, float f2, boolean z) {
        MatrixController matrixController = this.l;
        matrixController.getClass();
        if (f <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (f == matrixController.j && f2 == matrixController.k && !z) {
            return;
        }
        matrixController.j = f;
        matrixController.k = f2;
        matrixController.h(matrixController.g(), z);
    }

    public final void l(float f, float f2, boolean z) {
        MatrixController matrixController = this.l;
        RectF rectF = matrixController.f;
        if (f <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (rectF.width() == f && rectF.height() == f2 && !z) {
            return;
        }
        float fG = matrixController.g();
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2);
        matrixController.h(fG, z);
    }

    public final void m(float f, int i) {
        ZoomManager zoomManager = this.k;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            zoomManager.getClass();
            throw new IllegalArgumentException("Max zoom should be >= 0.");
        }
        zoomManager.f = f;
        zoomManager.g = i;
        if (g() > zoomManager.c()) {
            i(zoomManager.c());
        }
    }

    public final void n(float f, int i) {
        ZoomManager zoomManager = this.k;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            zoomManager.getClass();
            throw new IllegalArgumentException("Min zoom should be >= 0");
        }
        zoomManager.d = f;
        zoomManager.e = i;
        if (this.l.g() <= zoomManager.d()) {
            i(zoomManager.d());
        }
    }
}
