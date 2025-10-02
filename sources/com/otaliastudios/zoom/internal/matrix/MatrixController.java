package com.otaliastudios.zoom.internal.matrix;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import com.otaliastudios.zoom.internal.StateController;
import com.otaliastudios.zoom.internal.gestures.ScrollFlingDetector;
import com.otaliastudios.zoom.internal.matrix.MatrixUpdate;
import com.otaliastudios.zoom.internal.movement.PanManager;
import com.otaliastudios.zoom.internal.movement.ZoomManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/zoom/internal/matrix/MatrixController;", "", "Callback", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class MatrixController {
    public static final ZoomLogger q = new ZoomLogger("MatrixController");
    public static final AccelerateDecelerateInterpolator r = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public final ZoomManager f16819a;
    public final PanManager b;
    public final StateController c;
    public final Callback d;
    public boolean h;
    public float j;
    public float k;
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final Matrix g = new Matrix();
    public final Matrix i = new Matrix();
    public final ScaledPoint l = new ScaledPoint();
    public final AbsolutePoint m = new AbsolutePoint();
    public long n = 280;
    public final LinkedHashSet o = new LinkedHashSet();
    public final MatrixController$cancelAnimationListener$1 p = new AnimatorListenerAdapter() { // from class: com.otaliastudios.zoom.internal.matrix.MatrixController$cancelAnimationListener$1
        public final void a(Animator animator) {
            animator.removeListener(this);
            MatrixController matrixController = this.d;
            LinkedHashSet linkedHashSet = matrixController.o;
            if (linkedHashSet == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            TypeIntrinsics.a(linkedHashSet).remove(animator);
            if (linkedHashSet.isEmpty()) {
                matrixController.c.b(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            Intrinsics.h(animator, "animator");
            a(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Intrinsics.h(animator, "animator");
            a(animator);
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/internal/matrix/MatrixController$Callback;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void d(ScrollFlingDetector.AnonymousClass1 anonymousClass1);

        boolean e(ScrollFlingDetector.AnonymousClass1 anonymousClass1);

        void f();

        void i(float f, boolean z);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/otaliastudios/zoom/internal/matrix/MatrixController$Companion;", "", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "ANIMATION_INTERPOLATOR", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.otaliastudios.zoom.internal.matrix.MatrixController$cancelAnimationListener$1] */
    public MatrixController(ZoomManager zoomManager, PanManager panManager, StateController stateController, Callback callback) {
        this.f16819a = zoomManager;
        this.b = panManager;
        this.c = stateController;
        this.d = callback;
    }

    public final void a(final MatrixUpdate matrixUpdate) {
        float f = matrixUpdate.f16820a;
        ScaledPoint scaledPoint = matrixUpdate.d;
        boolean z = matrixUpdate.e;
        AbsolutePoint absolutePointA = matrixUpdate.c;
        if (this.h && this.c.b(3)) {
            ArrayList arrayList = new ArrayList();
            if (absolutePointA != null) {
                if (z) {
                    absolutePointA = c().a(absolutePointA);
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("panX", d(), absolutePointA.f16808a);
                Intrinsics.g(propertyValuesHolderOfFloat, "ofFloat(\"panX\", panX, target.x)");
                arrayList.add(propertyValuesHolderOfFloat);
                PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("panY", e(), absolutePointA.b);
                Intrinsics.g(propertyValuesHolderOfFloat2, "ofFloat(\"panY\", panY, target.y)");
                arrayList.add(propertyValuesHolderOfFloat2);
            } else if (scaledPoint != null) {
                if (z) {
                    ScaledPoint scaledPointF = f();
                    scaledPoint = new ScaledPoint(scaledPointF.f16812a + scaledPoint.f16812a, scaledPointF.b + scaledPoint.b);
                }
                RectF rectF = this.e;
                PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("panX", rectF.left, scaledPoint.f16812a);
                Intrinsics.g(propertyValuesHolderOfFloat3, "ofFloat(\"panX\", scaledPanX, target.x)");
                arrayList.add(propertyValuesHolderOfFloat3);
                PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat("panY", rectF.top, scaledPoint.b);
                Intrinsics.g(propertyValuesHolderOfFloat4, "ofFloat(\"panY\", scaledPanY, target.y)");
                arrayList.add(propertyValuesHolderOfFloat4);
            }
            if (!Float.isNaN(f)) {
                PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat("zoom", g(), this.f16819a.b(f, matrixUpdate.b));
                Intrinsics.g(propertyValuesHolderOfFloat5, "ofFloat(\"zoom\", zoom, newZoom)");
                arrayList.add(propertyValuesHolderOfFloat5);
            }
            Object[] array = arrayList.toArray(new PropertyValuesHolder[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) array;
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder((PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, propertyValuesHolderArr.length));
            valueAnimatorOfPropertyValuesHolder.setDuration(this.n);
            valueAnimatorOfPropertyValuesHolder.setInterpolator(r);
            valueAnimatorOfPropertyValuesHolder.addListener(this.p);
            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.otaliastudios.zoom.internal.matrix.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    ZoomLogger zoomLogger = MatrixController.q;
                    final MatrixUpdate matrixUpdate2 = matrixUpdate;
                    this.d.b(MatrixUpdate.Companion.a(new Function1<MatrixUpdate.Builder, Unit>() { // from class: com.otaliastudios.zoom.internal.matrix.MatrixController$animateUpdate$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MatrixUpdate.Builder applyUpdate = (MatrixUpdate.Builder) obj;
                            Intrinsics.h(applyUpdate, "$this$applyUpdate");
                            MatrixUpdate matrixUpdate3 = matrixUpdate2;
                            boolean zIsNaN = Float.isNaN(matrixUpdate3.f16820a);
                            boolean z2 = matrixUpdate3.f;
                            ValueAnimator valueAnimator2 = valueAnimator;
                            if (!zIsNaN) {
                                Object animatedValue = valueAnimator2.getAnimatedValue("zoom");
                                if (animatedValue == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                float fFloatValue = ((Float) animatedValue).floatValue();
                                boolean z3 = matrixUpdate3.b;
                                applyUpdate.f16821a = fFloatValue;
                                applyUpdate.b = z3;
                            }
                            if (matrixUpdate3.c != null) {
                                Object animatedValue2 = valueAnimator2.getAnimatedValue("panX");
                                if (animatedValue2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                                Object animatedValue3 = valueAnimator2.getAnimatedValue("panY");
                                if (animatedValue3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                AbsolutePoint absolutePoint = new AbsolutePoint(fFloatValue2, ((Float) animatedValue3).floatValue());
                                applyUpdate.d = null;
                                applyUpdate.c = absolutePoint;
                                applyUpdate.e = false;
                                applyUpdate.f = z2;
                            } else if (matrixUpdate3.d != null) {
                                Object animatedValue4 = valueAnimator2.getAnimatedValue("panX");
                                if (animatedValue4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                float fFloatValue3 = ((Float) animatedValue4).floatValue();
                                Object animatedValue5 = valueAnimator2.getAnimatedValue("panY");
                                if (animatedValue5 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                                }
                                applyUpdate.d = new ScaledPoint(fFloatValue3, ((Float) animatedValue5).floatValue());
                                applyUpdate.c = null;
                                applyUpdate.e = false;
                                applyUpdate.f = z2;
                            }
                            Float f2 = matrixUpdate3.g;
                            Float f3 = matrixUpdate3.h;
                            applyUpdate.g = f2;
                            applyUpdate.h = f3;
                            applyUpdate.i = matrixUpdate3.i;
                            return Unit.f24250a;
                        }
                    }));
                }
            });
            valueAnimatorOfPropertyValuesHolder.start();
            this.o.add(valueAnimatorOfPropertyValuesHolder);
        }
    }

    public final void b(MatrixUpdate matrixUpdate) {
        boolean z = matrixUpdate.j;
        float f = matrixUpdate.f16820a;
        boolean z2 = matrixUpdate.e;
        if (this.h) {
            AbsolutePoint absolutePoint = matrixUpdate.c;
            RectF rectF = this.f;
            RectF rectF2 = this.e;
            Matrix matrix = this.g;
            if (absolutePoint != null) {
                if (!z2) {
                    AbsolutePoint absolutePointC = c();
                    absolutePoint = new AbsolutePoint(absolutePoint.f16808a - absolutePointC.f16808a, absolutePoint.b - absolutePointC.b);
                }
                matrix.preTranslate(absolutePoint.f16808a, absolutePoint.b);
                matrix.mapRect(rectF2, rectF);
            } else {
                ScaledPoint scaledPoint = matrixUpdate.d;
                if (scaledPoint != null) {
                    if (!z2) {
                        ScaledPoint scaledPointF = f();
                        scaledPoint = new ScaledPoint(scaledPoint.f16812a - scaledPointF.f16812a, scaledPoint.b - scaledPointF.b);
                    }
                    matrix.postTranslate(scaledPoint.f16812a, scaledPoint.b);
                    matrix.mapRect(rectF2, rectF);
                }
            }
            if (!Float.isNaN(f)) {
                float fB = this.f16819a.b(f, matrixUpdate.b) / g();
                Float f2 = matrixUpdate.g;
                float fFloatValue = f2 != null ? f2.floatValue() : z ? 0.0f : this.j / 2.0f;
                Float f3 = matrixUpdate.h;
                matrix.postScale(fB, fB, fFloatValue, f3 != null ? f3.floatValue() : z ? 0.0f : this.k / 2.0f);
                matrix.mapRect(rectF2, rectF);
            }
            boolean z3 = matrixUpdate.f;
            PanManager panManager = this.b;
            float fC = panManager.c(true, z3);
            float fC2 = panManager.c(false, z3);
            if (fC != BitmapDescriptorFactory.HUE_RED || fC2 != BitmapDescriptorFactory.HUE_RED) {
                matrix.postTranslate(fC, fC2);
                matrix.mapRect(rectF2, rectF);
            }
            if (matrixUpdate.i) {
                this.d.f();
            }
        }
    }

    public final AbsolutePoint c() {
        Float fValueOf = Float.valueOf(d());
        Float fValueOf2 = Float.valueOf(e());
        AbsolutePoint absolutePoint = this.m;
        absolutePoint.c(fValueOf, fValueOf2);
        return absolutePoint;
    }

    public final float d() {
        return this.e.left / g();
    }

    public final float e() {
        return this.e.top / g();
    }

    public final ScaledPoint f() {
        RectF rectF = this.e;
        Float fValueOf = Float.valueOf(rectF.left);
        Float fValueOf2 = Float.valueOf(rectF.top);
        ScaledPoint scaledPoint = this.l;
        scaledPoint.a(fValueOf, fValueOf2);
        return scaledPoint;
    }

    public final float g() {
        return this.e.width() / this.f.width();
    }

    public final void h(float f, boolean z) {
        Matrix matrix = this.g;
        RectF rectF = this.e;
        RectF rectF2 = this.f;
        matrix.mapRect(rectF, rectF2);
        if (rectF2.width() <= BitmapDescriptorFactory.HUE_RED || rectF2.height() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f2 = this.j;
        if (f2 <= BitmapDescriptorFactory.HUE_RED || this.k <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Object[] objArr = {"onSizeChanged:", "containerWidth:", Float.valueOf(f2), "containerHeight:", Float.valueOf(this.k), "contentWidth:", Float.valueOf(rectF2.width()), "contentHeight:", Float.valueOf(rectF2.height())};
        ZoomLogger zoomLogger = q;
        zoomLogger.getClass();
        zoomLogger.e(ZoomLogger.c(2, Arrays.copyOf(objArr, 9)));
        boolean z2 = !this.h || z;
        this.h = true;
        this.d.i(f, z2);
    }
}
