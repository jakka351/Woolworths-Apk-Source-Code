package androidx.constraintlayout.motion.widget;

import YU.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.futures.e;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.motion.widget.TouchResponse;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.utils.widget.MotionTelltales;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static boolean s0;
    public final StopLogic A;
    public final DecelerateInterpolator B;
    public DesignTool C;
    public int D;
    public int E;
    public boolean F;
    public float G;
    public float H;
    public long I;
    public float J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public CopyOnWriteArrayList O;
    public int P;
    public long Q;
    public float R;
    public int S;
    public float T;
    public boolean U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public MotionScene d;
    public int d0;
    public MotionInterpolator e;
    public float e0;
    public Interpolator f;
    public final KeyCache f0;
    public float g;
    public boolean g0;
    public int h;
    public StateCache h0;
    public int i;
    public e i0;
    public int j;
    public final Rect j0;
    public int k;
    public boolean k0;
    public int l;
    public TransitionState l0;
    public boolean m;
    public final Model m0;
    public final HashMap n;
    public boolean n0;
    public long o;
    public final RectF o0;
    public float p;
    public View p0;
    public float q;
    public Matrix q0;
    public float r;
    public final ArrayList r0;
    public long s;
    public float t;
    public boolean u;
    public boolean v;
    public TransitionListener w;
    public int x;
    public DevModeDraw y;
    public boolean z;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class DecelerateInterpolator extends MotionInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public float f2338a = BitmapDescriptorFactory.HUE_RED;
        public float b = BitmapDescriptorFactory.HUE_RED;
        public float c;

        public DecelerateInterpolator() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public final float a() {
            return MotionLayout.this.g;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.f2338a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                float f3 = this.c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                motionLayout.g = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.b;
            }
            float f4 = this.c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            motionLayout.g = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.b;
        }
    }

    public class DevModeDraw {

        /* renamed from: a, reason: collision with root package name */
        public float[] f2339a;
        public final int[] b;
        public final float[] c;
        public Path d;
        public final Paint e;
        public final Paint f;
        public final Paint g;
        public final Paint h;
        public final Paint i;
        public final float[] j;
        public int k;
        public final Rect l = new Rect();
        public final int m = 1;

        public DevModeDraw() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, BitmapDescriptorFactory.HUE_RED));
            this.c = new float[100];
            this.b = new int[50];
        }

        public final void a(Canvas canvas, int i, int i2, MotionController motionController) {
            Canvas canvas2;
            int width;
            int height;
            boolean z;
            float f;
            Paint paint = this.g;
            int[] iArr = this.b;
            boolean z2 = false;
            int i3 = 4;
            if (i == 4) {
                int i4 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (i4 < this.k) {
                    int i5 = iArr[i4];
                    boolean z5 = z3;
                    if (i5 == 1) {
                        z5 = true;
                    }
                    if (i5 == 0) {
                        z4 = true;
                    }
                    i4++;
                    z3 = z5;
                    z4 = z4;
                }
                if (z3) {
                    float[] fArr = this.f2339a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                }
                if (z4) {
                    b(canvas);
                }
            }
            if (i == 2) {
                float[] fArr2 = this.f2339a;
                float f2 = fArr2[0];
                float f3 = fArr2[1];
                float f4 = fArr2[fArr2.length - 2];
                float f5 = fArr2[fArr2.length - 1];
                canvas2 = canvas;
                canvas2.drawLine(f2, f3, f4, f5, paint);
            } else {
                canvas2 = canvas;
            }
            if (i == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.f2339a, this.e);
            View view = motionController.b;
            if (view != null) {
                width = view.getWidth();
                height = motionController.b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i6 = 1;
            while (i6 < i2 - 1) {
                if (i == i3 && iArr[i6 - 1] == 0) {
                    z = z2;
                } else {
                    int i7 = i6 * 2;
                    float[] fArr3 = this.c;
                    float f6 = fArr3[i7];
                    float f7 = fArr3[i7 + 1];
                    this.d.reset();
                    z = z2;
                    this.d.moveTo(f6, f7 + 10.0f);
                    this.d.lineTo(f6 + 10.0f, f7);
                    this.d.lineTo(f6, f7 - 10.0f);
                    this.d.lineTo(f6 - 10.0f, f7);
                    this.d.close();
                    int i8 = i6 - 1;
                    Paint paint2 = this.i;
                    if (i == i3) {
                        int i9 = iArr[i8];
                        if (i9 == 1) {
                            d(canvas2, f6 - BitmapDescriptorFactory.HUE_RED, f7 - BitmapDescriptorFactory.HUE_RED);
                        } else if (i9 == 0) {
                            c(canvas2, f6 - BitmapDescriptorFactory.HUE_RED, f7 - BitmapDescriptorFactory.HUE_RED);
                        } else {
                            if (i9 == 2) {
                                f = f7;
                                e(canvas2, f6 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED, width, height);
                            }
                            canvas2.drawPath(this.d, paint2);
                        }
                        f = f7;
                        canvas2.drawPath(this.d, paint2);
                    } else {
                        f = f7;
                    }
                    if (i == 2) {
                        d(canvas2, f6 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i == 3) {
                        c(canvas2, f6 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED);
                    }
                    if (i == 6) {
                        e(canvas2, f6 - BitmapDescriptorFactory.HUE_RED, f - BitmapDescriptorFactory.HUE_RED, width, height);
                    }
                    canvas2.drawPath(this.d, paint2);
                }
                i6++;
                z2 = z;
                i3 = 4;
            }
            boolean z6 = z2;
            float[] fArr4 = this.f2339a;
            if (fArr4.length > 1) {
                float f8 = fArr4[z6 ? 1 : 0];
                float f9 = fArr4[1];
                Paint paint3 = this.f;
                canvas2.drawCircle(f8, f9, 8.0f, paint3);
                float[] fArr5 = this.f2339a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f2339a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float fMin = Math.min(f, f3);
            float fMax = Math.max(f2, f4);
            float fMax2 = Math.max(f, f3);
            float fMax3 = Math.max(f2, f4);
            Paint paint = this.g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
        }

        public final void c(Canvas canvas, float f, float f2) {
            float[] fArr = this.f2339a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            int length = str.length();
            Paint paint = this.h;
            Rect rect = this.l;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
            float fMin3 = Math.min(f3, f5);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, fMin3, f2, paint2);
            String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), rect);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
        }

        public final void d(Canvas canvas, float f, float f2) {
            float[] fArr = this.f2339a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
            float f10 = (f7 * f9) + f3;
            float f11 = (f9 * f8) + f4;
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            int length = str.length();
            Paint paint = this.h;
            paint.getTextBounds(str, 0, length, this.l);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (r6.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        public final void e(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb.append(((int) ((((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i)) + 0.5d)) / 100.0f);
            String string = sb.toString();
            int length = string.length();
            Paint paint = this.h;
            Rect rect = this.l;
            paint.getTextBounds(string, 0, length, rect);
            canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + BitmapDescriptorFactory.HUE_RED, f2 - 20.0f, paint);
            float fMin = Math.min(BitmapDescriptorFactory.HUE_RED, 1.0f);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, fMin, f2, paint2);
            String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, f + 5.0f, BitmapDescriptorFactory.HUE_RED - ((f2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f), paint2);
        }
    }

    public class Model {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidgetContainer f2340a = new ConstraintWidgetContainer();
        public ConstraintWidgetContainer b = new ConstraintWidgetContainer();
        public ConstraintSet c = null;
        public ConstraintSet d = null;
        public int e;
        public int f;

        public Model() {
        }

        public static void c(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ArrayList arrayList = constraintWidgetContainer.v0;
            HashMap map = new HashMap();
            map.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.v0.clear();
            constraintWidgetContainer2.k(constraintWidgetContainer, map);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                ConstraintWidget barrier = constraintWidget instanceof Barrier ? new Barrier() : constraintWidget instanceof Guideline ? new Guideline() : constraintWidget instanceof Flow ? new Flow() : constraintWidget instanceof Placeholder ? new Placeholder() : constraintWidget instanceof Helper ? new HelperWidget() : new ConstraintWidget();
                constraintWidgetContainer2.a(barrier);
                map.put(constraintWidget, barrier);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
                ((ConstraintWidget) map.get(constraintWidget2)).k(constraintWidget2, map);
            }
        }

        public static ConstraintWidget d(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.i0 == view) {
                return constraintWidgetContainer;
            }
            ArrayList arrayList = constraintWidgetContainer.v0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i);
                if (constraintWidget.i0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void a() throws Resources.NotFoundException {
            HashMap map;
            int i;
            SparseArray sparseArray;
            int[] iArr;
            int i2;
            View view;
            Rect rect;
            Rect rect2;
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap map2 = motionLayout.n;
            map2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                MotionController motionController = new MotionController(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, motionController);
                map2.put(childAt, motionController);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = motionLayout.getChildAt(i4);
                MotionController motionController2 = (MotionController) map2.get(childAt2);
                if (motionController2 == null) {
                    i = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                } else {
                    Rect rect3 = motionController2.f2336a;
                    MotionConstrainedPoint motionConstrainedPoint = motionController2.h;
                    MotionPaths motionPaths = motionController2.f;
                    map = map2;
                    if (this.c != null) {
                        ConstraintWidget constraintWidgetD = d(this.f2340a, childAt2);
                        if (constraintWidgetD != null) {
                            Rect rectD = MotionLayout.d(motionLayout, constraintWidgetD);
                            iArr = iArr2;
                            ConstraintSet constraintSet = this.c;
                            i2 = i4;
                            int width = motionLayout.getWidth();
                            sparseArray = sparseArray2;
                            int height = motionLayout.getHeight();
                            i = childCount;
                            int i5 = constraintSet.d;
                            if (i5 != 0) {
                                MotionController.k(rectD, rect3, i5, width, height);
                            }
                            motionPaths.f = BitmapDescriptorFactory.HUE_RED;
                            motionPaths.g = BitmapDescriptorFactory.HUE_RED;
                            motionController2.j(motionPaths);
                            rect = rect3;
                            view = childAt2;
                            motionPaths.d(rectD.left, rectD.top, rectD.width(), rectD.height());
                            ConstraintSet.Constraint constraintK = constraintSet.k(motionController2.c);
                            motionPaths.a(constraintK);
                            ConstraintSet.Motion motion = constraintK.d;
                            motionController2.l = motion.g;
                            motionConstrainedPoint.d(rectD, constraintSet, i5, motionController2.c);
                            motionController2.C = constraintK.f.i;
                            motionController2.E = motion.j;
                            motionController2.F = motion.i;
                            Context context = motionController2.b.getContext();
                            int i6 = motion.l;
                            String str = motion.k;
                            int i7 = motion.m;
                            if (i6 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                            } else if (i6 != -1) {
                                interpolatorLoadInterpolator = i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new android.view.animation.DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator();
                            } else {
                                final Easing easingC = Easing.c(str);
                                interpolatorLoadInterpolator = new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                                    public AnonymousClass1() {
                                    }

                                    @Override // android.animation.TimeInterpolator
                                    public final float getInterpolation(float f) {
                                        return (float) easing.a(f);
                                    }
                                };
                            }
                            motionController2.G = interpolatorLoadInterpolator;
                        } else {
                            i = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i2 = i4;
                            view = childAt2;
                            rect = rect3;
                            if (motionLayout.x != 0) {
                                Log.e("MotionLayout", Debug.b() + "no widget for  " + Debug.d(view) + " (" + view.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        view = childAt2;
                        rect = rect3;
                    }
                    if (this.d != null) {
                        View view2 = view;
                        ConstraintWidget constraintWidgetD2 = d(this.b, view2);
                        if (constraintWidgetD2 != null) {
                            Rect rectD2 = MotionLayout.d(motionLayout, constraintWidgetD2);
                            ConstraintSet constraintSet2 = this.d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            MotionPaths motionPaths2 = motionController2.g;
                            int i8 = constraintSet2.d;
                            if (i8 != 0) {
                                Rect rect4 = rect;
                                MotionController.k(rectD2, rect4, i8, width2, height2);
                                rect2 = rect4;
                            } else {
                                rect2 = rectD2;
                            }
                            motionPaths2.f = 1.0f;
                            motionPaths2.g = 1.0f;
                            motionController2.j(motionPaths2);
                            motionPaths2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                            motionPaths2.a(constraintSet2.k(motionController2.c));
                            motionController2.i.d(rect2, constraintSet2, i8, motionController2.c);
                        } else if (motionLayout.x != 0) {
                            Log.e("MotionLayout", Debug.b() + "no widget for  " + Debug.d(view2) + " (" + view2.getClass().getName() + ")");
                        }
                    }
                }
                i4 = i2 + 1;
                map2 = map;
                iArr2 = iArr;
                sparseArray2 = sparseArray;
                childCount = i;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i9 = childCount;
            int i10 = 0;
            while (i10 < i9) {
                SparseArray sparseArray4 = sparseArray3;
                MotionController motionController3 = (MotionController) sparseArray4.get(iArr3[i10]);
                int i11 = motionController3.f.n;
                if (i11 != -1) {
                    MotionController motionController4 = (MotionController) sparseArray4.get(i11);
                    motionController3.f.f(motionController4, motionController4.f);
                    motionController3.g.f(motionController4, motionController4.g);
                }
                i10++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void b(int i, int i2) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.i == motionLayout.getStartState()) {
                ConstraintWidgetContainer constraintWidgetContainer = this.b;
                ConstraintSet constraintSet = this.d;
                motionLayout.resolveSystem(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.d == 0) ? i : i2, (constraintSet == null || constraintSet.d == 0) ? i2 : i);
                ConstraintSet constraintSet2 = this.c;
                if (constraintSet2 != null) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f2340a;
                    int i3 = constraintSet2.d;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout.resolveSystem(constraintWidgetContainer2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.c;
            if (constraintSet3 != null) {
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f2340a;
                int i5 = constraintSet3.d;
                motionLayout.resolveSystem(constraintWidgetContainer3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            ConstraintWidgetContainer constraintWidgetContainer4 = this.b;
            ConstraintSet constraintSet4 = this.d;
            int i6 = (constraintSet4 == null || constraintSet4.d == 0) ? i : i2;
            if (constraintSet4 == null || constraintSet4.d == 0) {
                i = i2;
            }
            motionLayout.resolveSystem(constraintWidgetContainer4, optimizationLevel, i6, i);
        }

        public final void e(ConstraintSet constraintSet, ConstraintSet constraintSet2) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
            this.c = constraintSet;
            this.d = constraintSet2;
            this.f2340a = new ConstraintWidgetContainer();
            this.b = new ConstraintWidgetContainer();
            ConstraintWidgetContainer constraintWidgetContainer = this.f2340a;
            MotionLayout motionLayout = MotionLayout.this;
            BasicMeasure.Measurer measurer = ((ConstraintLayout) motionLayout).mLayoutWidget.z0;
            constraintWidgetContainer.z0 = measurer;
            constraintWidgetContainer.x0.f = measurer;
            ConstraintWidgetContainer constraintWidgetContainer2 = this.b;
            BasicMeasure.Measurer measurer2 = ((ConstraintLayout) motionLayout).mLayoutWidget.z0;
            constraintWidgetContainer2.z0 = measurer2;
            constraintWidgetContainer2.x0.f = measurer2;
            this.f2340a.v0.clear();
            this.b.v0.clear();
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f2340a);
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.b);
            if (motionLayout.r > 0.5d) {
                if (constraintSet != null) {
                    g(this.f2340a, constraintSet);
                }
                g(this.b, constraintSet2);
            } else {
                g(this.b, constraintSet2);
                if (constraintSet != null) {
                    g(this.f2340a, constraintSet);
                }
            }
            this.f2340a.A0 = motionLayout.isRtl();
            ConstraintWidgetContainer constraintWidgetContainer3 = this.f2340a;
            constraintWidgetContainer3.w0.c(constraintWidgetContainer3);
            this.b.A0 = motionLayout.isRtl();
            ConstraintWidgetContainer constraintWidgetContainer4 = this.b;
            constraintWidgetContainer4.w0.c(constraintWidgetContainer4);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                int i = layoutParams.width;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e;
                if (i == -2) {
                    this.f2340a.S(dimensionBehaviour);
                    this.b.S(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    this.f2340a.U(dimensionBehaviour);
                    this.b.U(dimensionBehaviour);
                }
            }
        }

        public final void f() throws Resources.NotFoundException {
            ConstraintWidgetContainer constraintWidgetContainer;
            boolean z;
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.k;
            int i2 = motionLayout.l;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            motionLayout.c0 = mode;
            motionLayout.d0 = mode2;
            b(i, i2);
            int i3 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                motionLayout.V = this.f2340a.v();
                motionLayout.W = this.f2340a.p();
                motionLayout.a0 = this.b.v();
                int iP = this.b.p();
                motionLayout.b0 = iP;
                motionLayout.U = (motionLayout.V == motionLayout.a0 && motionLayout.W == iP) ? false : true;
            }
            int i4 = motionLayout.V;
            int i5 = motionLayout.W;
            int i6 = motionLayout.c0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout.e0 * (motionLayout.a0 - i4)) + i4);
            }
            int i7 = motionLayout.d0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout.e0 * (motionLayout.b0 - i5)) + i5);
            }
            ConstraintWidgetContainer constraintWidgetContainer2 = this.f2340a;
            if (constraintWidgetContainer2.K0 || this.b.K0) {
                constraintWidgetContainer = constraintWidgetContainer2;
                z = true;
            } else {
                constraintWidgetContainer = constraintWidgetContainer2;
                z = false;
            }
            motionLayout.resolveMeasuredDimension(i, i2, i4, i5, z, constraintWidgetContainer.L0 || this.b.L0);
            HashMap map = motionLayout.n;
            int childCount = motionLayout.getChildCount();
            motionLayout.m0.a();
            motionLayout.v = true;
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = motionLayout.getChildAt(i8);
                sparseArray.put(childAt.getId(), (MotionController) map.get(childAt));
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            MotionScene.Transition transition = motionLayout.d.c;
            int i9 = transition != null ? transition.p : -1;
            if (i9 != -1) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    MotionController motionController = (MotionController) map.get(motionLayout.getChildAt(i10));
                    if (motionController != null) {
                        motionController.B = i9;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                MotionController motionController2 = (MotionController) map.get(motionLayout.getChildAt(i12));
                int i13 = motionController2.f.n;
                if (i13 != -1) {
                    sparseBooleanArray.put(i13, true);
                    iArr[i11] = motionController2.f.n;
                    i11++;
                }
            }
            if (motionLayout.N != null) {
                for (int i14 = 0; i14 < i11; i14++) {
                    MotionController motionController3 = (MotionController) map.get(motionLayout.findViewById(iArr[i14]));
                    if (motionController3 != null) {
                        motionLayout.d.f(motionController3);
                    }
                }
                Iterator it = motionLayout.N.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).r(motionLayout, map);
                }
                for (int i15 = 0; i15 < i11; i15++) {
                    MotionController motionController4 = (MotionController) map.get(motionLayout.findViewById(iArr[i15]));
                    if (motionController4 != null) {
                        motionController4.l(width, height, motionLayout.getNanoTime());
                    }
                }
            } else {
                for (int i16 = 0; i16 < i11; i16++) {
                    MotionController motionController5 = (MotionController) map.get(motionLayout.findViewById(iArr[i16]));
                    if (motionController5 != null) {
                        motionLayout.d.f(motionController5);
                        motionController5.l(width, height, motionLayout.getNanoTime());
                    }
                }
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt2 = motionLayout.getChildAt(i17);
                MotionController motionController6 = (MotionController) map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                    motionLayout.d.f(motionController6);
                    motionController6.l(width, height, motionLayout.getNanoTime());
                }
            }
            MotionScene.Transition transition2 = motionLayout.d.c;
            float f = transition2 != null ? transition2.i : 0.0f;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                boolean z2 = ((double) f) < 0.0d;
                float fAbs = Math.abs(f);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i18 = 0; i18 < childCount; i18++) {
                    MotionController motionController7 = (MotionController) map.get(motionLayout.getChildAt(i18));
                    if (!Float.isNaN(motionController7.l)) {
                        for (int i19 = 0; i19 < childCount; i19++) {
                            MotionController motionController8 = (MotionController) map.get(motionLayout.getChildAt(i19));
                            if (!Float.isNaN(motionController8.l)) {
                                fMin = Math.min(fMin, motionController8.l);
                                fMax = Math.max(fMax, motionController8.l);
                            }
                        }
                        while (i3 < childCount) {
                            MotionController motionController9 = (MotionController) map.get(motionLayout.getChildAt(i3));
                            if (!Float.isNaN(motionController9.l)) {
                                motionController9.n = 1.0f / (1.0f - fAbs);
                                if (z2) {
                                    motionController9.m = fAbs - (((fMax - motionController9.l) / (fMax - fMin)) * fAbs);
                                } else {
                                    motionController9.m = fAbs - (((motionController9.l - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i3++;
                        }
                        return;
                    }
                    MotionPaths motionPaths = motionController7.g;
                    float f2 = motionPaths.h;
                    float f3 = motionPaths.i;
                    float f4 = z2 ? f3 - f2 : f3 + f2;
                    fMin2 = Math.min(fMin2, f4);
                    fMax2 = Math.max(fMax2, f4);
                }
                while (i3 < childCount) {
                    MotionController motionController10 = (MotionController) map.get(motionLayout.getChildAt(i3));
                    MotionPaths motionPaths2 = motionController10.g;
                    float f5 = motionPaths2.h;
                    float f6 = motionPaths2.i;
                    float f7 = z2 ? f6 - f5 : f6 + f5;
                    motionController10.n = 1.0f / (1.0f - fAbs);
                    motionController10.m = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i3++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
            ConstraintSet.Constraint constraint;
            ConstraintSet.Constraint constraint2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.d != 0) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z = MotionLayout.s0;
                motionLayout.resolveSystem(constraintWidgetContainer2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            Iterator it = constraintWidgetContainer.v0.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
                constraintWidget.k0 = true;
                sparseArray.put(((View) constraintWidget.i0).getId(), constraintWidget);
            }
            Iterator it2 = constraintWidgetContainer.v0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) it2.next();
                View view = (View) constraintWidget2.i0;
                int id = view.getId();
                HashMap map = constraintSet.g;
                if (map.containsKey(Integer.valueOf(id)) && (constraint2 = (ConstraintSet.Constraint) map.get(Integer.valueOf(id))) != null) {
                    constraint2.b(layoutParams);
                }
                constraintWidget2.W(constraintSet.k(view.getId()).e.c);
                constraintWidget2.R(constraintSet.k(view.getId()).e.d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    HashMap map2 = constraintSet.g;
                    if (map2.containsKey(Integer.valueOf(id2)) && (constraint = (ConstraintSet.Constraint) map2.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof HelperWidget)) {
                        constraintHelper.l(constraint, (HelperWidget) constraintWidget2, layoutParams, sparseArray);
                    }
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).q();
                    }
                }
                layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
                boolean z2 = MotionLayout.s0;
                motionLayout.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (constraintSet.k(view.getId()).c.c == 1) {
                    constraintWidget2.j0 = view.getVisibility();
                } else {
                    constraintWidget2.j0 = constraintSet.k(view.getId()).c.b;
                }
            }
            Iterator it3 = constraintWidgetContainer.v0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget) it3.next();
                if (constraintWidget3 instanceof VirtualLayout) {
                    ConstraintHelper constraintHelper2 = (ConstraintHelper) constraintWidget3.i0;
                    Helper helper = (Helper) constraintWidget3;
                    constraintHelper2.p(helper, sparseArray);
                    VirtualLayout virtualLayout = (VirtualLayout) helper;
                    for (int i = 0; i < virtualLayout.w0; i++) {
                        ConstraintWidget constraintWidget4 = virtualLayout.v0[i];
                        if (constraintWidget4 != null) {
                            constraintWidget4.H = true;
                        }
                    }
                }
            }
        }
    }

    public interface MotionTracker {
    }

    public static class MyTracker implements MotionTracker {
        public static final MyTracker b = new MyTracker();

        /* renamed from: a, reason: collision with root package name */
        public VelocityTracker f2341a;
    }

    public class StateCache {

        /* renamed from: a, reason: collision with root package name */
        public float f2342a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public StateCache() {
        }

        public final void a() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
            int i = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    int i2 = this.d;
                    if (motionLayout.isAttachedToWindow()) {
                        motionLayout.F(i2, -1);
                    } else {
                        if (motionLayout.h0 == null) {
                            motionLayout.h0 = motionLayout.new StateCache();
                        }
                        motionLayout.h0.d = i2;
                    }
                } else {
                    int i3 = this.d;
                    if (i3 == -1) {
                        motionLayout.setState(i, -1, -1);
                    } else {
                        motionLayout.B(i, i3);
                    }
                }
                motionLayout.setState(TransitionState.e);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.f2342a)) {
                    return;
                }
                motionLayout.setProgress(this.f2342a);
                return;
            }
            float f = this.f2342a;
            float f2 = this.b;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f);
                motionLayout.setState(TransitionState.f);
                motionLayout.g = f2;
                float f3 = BitmapDescriptorFactory.HUE_RED;
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    if (f2 > BitmapDescriptorFactory.HUE_RED) {
                        f3 = 1.0f;
                    }
                    motionLayout.m(f3);
                } else if (f != BitmapDescriptorFactory.HUE_RED && f != 1.0f) {
                    if (f > 0.5f) {
                        f3 = 1.0f;
                    }
                    motionLayout.m(f3);
                }
            } else {
                if (motionLayout.h0 == null) {
                    motionLayout.h0 = motionLayout.new StateCache();
                }
                StateCache stateCache = motionLayout.h0;
                stateCache.f2342a = f;
                stateCache.b = f2;
            }
            this.f2342a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }
    }

    public interface TransitionListener {
        void a(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        public static final TransitionState d;
        public static final TransitionState e;
        public static final TransitionState f;
        public static final TransitionState g;
        public static final /* synthetic */ TransitionState[] h;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            d = transitionState;
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            e = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            f = transitionState3;
            TransitionState transitionState4 = new TransitionState("FINISHED", 3);
            g = transitionState4;
            h = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) h.clone();
        }
    }

    public MotionLayout(@NonNull Context context) throws Resources.NotFoundException {
        super(context);
        this.f = null;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = 0;
        this.l = 0;
        this.m = true;
        this.n = new HashMap();
        this.o = 0L;
        this.p = 1.0f;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.t = BitmapDescriptorFactory.HUE_RED;
        this.v = false;
        this.x = 0;
        this.z = false;
        this.A = new StopLogic();
        this.B = new DecelerateInterpolator();
        this.F = false;
        this.K = false;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 0;
        this.Q = -1L;
        this.R = BitmapDescriptorFactory.HUE_RED;
        this.S = 0;
        this.T = BitmapDescriptorFactory.HUE_RED;
        this.U = false;
        this.f0 = new KeyCache();
        this.g0 = false;
        this.i0 = null;
        new HashMap();
        this.j0 = new Rect();
        this.k0 = false;
        this.l0 = TransitionState.d;
        this.m0 = new Model();
        this.n0 = false;
        this.o0 = new RectF();
        this.p0 = null;
        this.q0 = null;
        this.r0 = new ArrayList();
        x(null);
    }

    public static Rect d(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        Rect rect = motionLayout.j0;
        rect.top = constraintWidget.x();
        rect.left = constraintWidget.w();
        rect.right = constraintWidget.v() + rect.left;
        rect.bottom = constraintWidget.p() + rect.top;
        return rect;
    }

    public final void A() throws Resources.NotFoundException {
        this.m0.f();
        invalidate();
    }

    public final void B(int i, int i2) throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        if (!isAttachedToWindow()) {
            if (this.h0 == null) {
                this.h0 = new StateCache();
            }
            StateCache stateCache = this.h0;
            stateCache.c = i;
            stateCache.d = i2;
            return;
        }
        MotionScene motionScene = this.d;
        if (motionScene != null) {
            this.h = i;
            this.j = i2;
            motionScene.o(i, i2);
            this.m0.e(this.d.b(i), this.d.b(i2));
            A();
            this.r = BitmapDescriptorFactory.HUE_RED;
            m(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(float r22, float r23, int r24) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C(float, float, int):void");
    }

    public final void D() throws ExecutionException, InterruptedException {
        m(1.0f);
        this.i0 = null;
    }

    public final void E(int i, int i2) {
        if (isAttachedToWindow()) {
            F(i, i2);
            return;
        }
        if (this.h0 == null) {
            this.h0 = new StateCache();
        }
        this.h0.d = i;
    }

    public final void F(int i, int i2) throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        StateSet stateSet;
        float f;
        int iA;
        MotionScene motionScene = this.d;
        if (motionScene != null && (stateSet = motionScene.b) != null && (iA = stateSet.a(this.i, -1, f, i)) != -1) {
            i = iA;
        }
        int i3 = this.i;
        if (i3 == i) {
            return;
        }
        if (this.h == i) {
            m(BitmapDescriptorFactory.HUE_RED);
            if (i2 > 0) {
                this.p = i2 / 1000.0f;
                return;
            }
            return;
        }
        if (this.j == i) {
            m(1.0f);
            if (i2 > 0) {
                this.p = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.j = i;
        if (i3 != -1) {
            B(i3, i);
            m(1.0f);
            this.r = BitmapDescriptorFactory.HUE_RED;
            D();
            if (i2 > 0) {
                this.p = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.z = false;
        this.t = 1.0f;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.s = getNanoTime();
        this.o = getNanoTime();
        this.u = false;
        this.e = null;
        if (i2 == -1) {
            this.p = this.d.c() / 1000.0f;
        }
        this.h = -1;
        this.d.o(-1, this.j);
        SparseArray sparseArray = new SparseArray();
        if (i2 == 0) {
            this.p = this.d.c() / 1000.0f;
        } else if (i2 > 0) {
            this.p = i2 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap map = this.n;
        map.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            map.put(childAt, new MotionController(childAt));
            sparseArray.put(childAt.getId(), (MotionController) map.get(childAt));
        }
        this.v = true;
        ConstraintSet constraintSetB = this.d.b(i);
        Model model = this.m0;
        model.e(null, constraintSetB);
        A();
        model.a();
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt2 = getChildAt(i5);
            MotionController motionController = (MotionController) map.get(childAt2);
            if (motionController != null) {
                MotionPaths motionPaths = motionController.f;
                motionPaths.f = BitmapDescriptorFactory.HUE_RED;
                motionPaths.g = BitmapDescriptorFactory.HUE_RED;
                motionPaths.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                MotionConstrainedPoint motionConstrainedPoint = motionController.h;
                motionConstrainedPoint.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                motionConstrainedPoint.b(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.N != null) {
            for (int i6 = 0; i6 < childCount; i6++) {
                MotionController motionController2 = (MotionController) map.get(getChildAt(i6));
                if (motionController2 != null) {
                    this.d.f(motionController2);
                }
            }
            Iterator it = this.N.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).r(this, map);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                MotionController motionController3 = (MotionController) map.get(getChildAt(i7));
                if (motionController3 != null) {
                    motionController3.l(width, height, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < childCount; i8++) {
                MotionController motionController4 = (MotionController) map.get(getChildAt(i8));
                if (motionController4 != null) {
                    this.d.f(motionController4);
                    motionController4.l(width, height, getNanoTime());
                }
            }
        }
        MotionScene.Transition transition = this.d.c;
        float f2 = transition != null ? transition.i : 0.0f;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i9 = 0; i9 < childCount; i9++) {
                MotionPaths motionPaths2 = ((MotionController) map.get(getChildAt(i9))).g;
                float f3 = motionPaths2.i + motionPaths2.h;
                fMin = Math.min(fMin, f3);
                fMax = Math.max(fMax, f3);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                MotionController motionController5 = (MotionController) map.get(getChildAt(i10));
                MotionPaths motionPaths3 = motionController5.g;
                float f4 = motionPaths3.h;
                float f5 = motionPaths3.i;
                motionController5.n = 1.0f / (1.0f - f2);
                motionController5.m = f2 - ((((f4 + f5) - fMin) * f2) / (fMax - fMin));
            }
        }
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.v = true;
        invalidate();
    }

    public final void G(int i, View... viewArr) {
        MotionScene motionScene = this.d;
        if (motionScene == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        ViewTransitionController viewTransitionController = motionScene.q;
        String str = viewTransitionController.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = viewTransitionController.b.iterator();
        ViewTransition viewTransition = null;
        while (it.hasNext()) {
            ViewTransition viewTransition2 = (ViewTransition) it.next();
            if (viewTransition2.f2347a == i) {
                for (View view : viewArr) {
                    if (viewTransition2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    viewTransition = viewTransition2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = viewTransitionController.f2350a;
                    int currentState = motionLayout.getCurrentState();
                    if (viewTransition2.e != 2) {
                        if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                        } else {
                            MotionScene motionScene2 = motionLayout.d;
                            ConstraintSet constraintSetB = motionScene2 == null ? null : motionScene2.b(currentState);
                            if (constraintSetB != null) {
                                viewTransition = viewTransition2;
                                viewTransition.a(viewTransitionController, viewTransitionController.f2350a, currentState, constraintSetB, viewArr2);
                            }
                        }
                        viewTransition = viewTransition2;
                    } else {
                        viewTransition = viewTransition2;
                        viewTransition.a(viewTransitionController, viewTransitionController.f2350a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (viewTransition == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws ExecutionException, IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList;
        int i;
        int i2;
        DevModeDraw devModeDraw;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        int i5;
        MotionController motionController;
        DevModeDraw devModeDraw2;
        int i6;
        Paint paint3;
        double dA;
        Paint paint4;
        String resourceEntryName;
        ViewTransitionController viewTransitionController;
        ArrayList arrayList2 = this.N;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).getClass();
            }
        }
        q(false);
        MotionScene motionScene = this.d;
        if (motionScene != null && (viewTransitionController = motionScene.q) != null) {
            ArrayList arrayList3 = viewTransitionController.f;
            ArrayList arrayList4 = viewTransitionController.e;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((ViewTransition.Animate) it2.next()).a();
                }
                viewTransitionController.e.removeAll(arrayList3);
                arrayList3.clear();
                if (viewTransitionController.e.isEmpty()) {
                    viewTransitionController.e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.d == null) {
            return;
        }
        if ((this.x & 1) == 1 && !isInEditMode()) {
            this.P++;
            long nanoTime = getNanoTime();
            long j = this.Q;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.R = ((int) ((this.P / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.P = 0;
                    this.Q = nanoTime;
                }
            } else {
                this.Q = nanoTime;
            }
            Paint paint5 = new Paint();
            paint5.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.R);
            sb.append(" fps ");
            int i7 = this.h;
            StringBuilder sbS = a.s(a.o(sb, i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7), " -> "));
            int i8 = this.j;
            sbS.append(i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8));
            sbS.append(" (progress: ");
            sbS.append(progress);
            sbS.append(" ) state=");
            int i9 = this.i;
            if (i9 == -1) {
                resourceEntryName = AdError.UNDEFINED_DOMAIN;
            } else {
                resourceEntryName = i9 != -1 ? getContext().getResources().getResourceEntryName(i9) : "UNDEFINED";
            }
            sbS.append(resourceEntryName);
            String string = sbS.toString();
            paint5.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint5);
            paint5.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint5);
        }
        if (this.x > 1) {
            if (this.y == null) {
                this.y = new DevModeDraw();
            }
            DevModeDraw devModeDraw3 = this.y;
            int iC = this.d.c();
            int i10 = this.x;
            Paint paint6 = devModeDraw3.g;
            Paint paint7 = devModeDraw3.f;
            Paint paint8 = devModeDraw3.i;
            int i11 = devModeDraw3.m;
            Paint paint9 = devModeDraw3.e;
            MotionLayout motionLayout = MotionLayout.this;
            HashMap map = this.n;
            if (map != null && map.size() != 0) {
                canvas.save();
                if (!motionLayout.isInEditMode() && (i10 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.j) + ":" + motionLayout.getProgress();
                    canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, devModeDraw3.h);
                    canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint9);
                }
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    MotionController motionController2 = (MotionController) it3.next();
                    MotionPaths motionPaths = motionController2.f;
                    ArrayList arrayList5 = motionController2.u;
                    int iMax = motionPaths.e;
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        iMax = Math.max(iMax, ((MotionPaths) it4.next()).e);
                        it3 = it3;
                    }
                    Iterator it5 = it3;
                    int iMax2 = Math.max(iMax, motionController2.g.e);
                    if (i10 > 0 && iMax2 == 0) {
                        iMax2 = 1;
                    }
                    if (iMax2 == 0) {
                        it3 = it5;
                    } else {
                        float[] fArr = devModeDraw3.c;
                        int[] iArr = devModeDraw3.b;
                        if (fArr != null) {
                            arrayList = arrayList5;
                            double[] dArrG = motionController2.j[0].g();
                            if (iArr != null) {
                                Iterator it6 = arrayList.iterator();
                                int i12 = 0;
                                while (it6.hasNext()) {
                                    iArr[i12] = ((MotionPaths) it6.next()).r;
                                    i12++;
                                    fArr = fArr;
                                }
                            }
                            float[] fArr2 = fArr;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < dArrG.length) {
                                double[] dArr = dArrG;
                                int i15 = i13;
                                motionController2.j[0].d(motionController2.p, dArr[i15]);
                                motionController2.f.c(dArr[i15], motionController2.o, motionController2.p, fArr2, i14);
                                i14 += 2;
                                i13 = i15 + 1;
                                dArrG = dArr;
                                iC = iC;
                            }
                            i = iC;
                            i2 = i14 / 2;
                        } else {
                            arrayList = arrayList5;
                            i = iC;
                            i2 = 0;
                        }
                        devModeDraw3.k = i2;
                        if (iMax2 >= 1) {
                            int i16 = i / 16;
                            float[] fArr3 = devModeDraw3.f2339a;
                            if (fArr3 == null || fArr3.length != i16 * 2) {
                                devModeDraw3.f2339a = new float[i16 * 2];
                                devModeDraw3.d = new Path();
                            }
                            float f = i11;
                            canvas.translate(f, f);
                            paint9.setColor(1996488704);
                            paint8.setColor(1996488704);
                            paint7.setColor(1996488704);
                            paint6.setColor(1996488704);
                            float[] fArr4 = devModeDraw3.f2339a;
                            float f2 = 1.0f / (i16 - 1);
                            float f3 = 1.0f;
                            HashMap map2 = motionController2.y;
                            SplineSet splineSet = map2 == null ? null : (SplineSet) map2.get("translationX");
                            HashMap map3 = motionController2.y;
                            i3 = i10;
                            SplineSet splineSet2 = map3 == null ? null : (SplineSet) map3.get("translationY");
                            HashMap map4 = motionController2.z;
                            ViewOscillator viewOscillator = map4 == null ? null : (ViewOscillator) map4.get("translationX");
                            HashMap map5 = motionController2.z;
                            ViewOscillator viewOscillator2 = map5 == null ? null : (ViewOscillator) map5.get("translationY");
                            int i17 = 0;
                            while (true) {
                                float f4 = Float.NaN;
                                i5 = i11;
                                if (i17 >= i16) {
                                    break;
                                }
                                float fMin = i17 * f2;
                                int i18 = i16;
                                float f5 = motionController2.n;
                                if (f5 != f3) {
                                    float f6 = motionController2.m;
                                    if (fMin < f6) {
                                        fMin = BitmapDescriptorFactory.HUE_RED;
                                    }
                                    if (fMin > f6) {
                                        i6 = i17;
                                        if (fMin < 1.0d) {
                                            fMin = Math.min((fMin - f6) * f5, f3);
                                        }
                                    } else {
                                        i6 = i17;
                                    }
                                } else {
                                    i6 = i17;
                                }
                                double d = fMin;
                                Easing easing = motionPaths.d;
                                Iterator it7 = arrayList.iterator();
                                float f7 = BitmapDescriptorFactory.HUE_RED;
                                while (it7.hasNext()) {
                                    Iterator it8 = it7;
                                    MotionPaths motionPaths2 = (MotionPaths) it7.next();
                                    MotionPaths motionPaths3 = motionPaths;
                                    Easing easing2 = motionPaths2.d;
                                    if (easing2 != null) {
                                        float f8 = motionPaths2.f;
                                        if (f8 < fMin) {
                                            f7 = f8;
                                            easing = easing2;
                                        } else if (Float.isNaN(f4)) {
                                            f4 = motionPaths2.f;
                                        }
                                    }
                                    it7 = it8;
                                    motionPaths = motionPaths3;
                                }
                                MotionPaths motionPaths4 = motionPaths;
                                if (easing != null) {
                                    if (Float.isNaN(f4)) {
                                        f4 = 1.0f;
                                    }
                                    paint3 = paint6;
                                    dA = (((float) easing.a((fMin - f7) / r22)) * (f4 - f7)) + f7;
                                } else {
                                    paint3 = paint6;
                                    dA = d;
                                }
                                motionController2.j[0].d(motionController2.p, dA);
                                ArcCurveFit arcCurveFit = motionController2.k;
                                if (arcCurveFit != null) {
                                    double[] dArr2 = motionController2.p;
                                    paint4 = paint8;
                                    if (dArr2.length > 0) {
                                        arcCurveFit.d(dArr2, dA);
                                    }
                                } else {
                                    paint4 = paint8;
                                }
                                int i19 = i6 * 2;
                                motionController2.f.c(dA, motionController2.o, motionController2.p, fArr4, i19);
                                if (viewOscillator != null) {
                                    fArr4[i19] = viewOscillator.a(fMin) + fArr4[i19];
                                } else if (splineSet != null) {
                                    fArr4[i19] = splineSet.a(fMin) + fArr4[i19];
                                }
                                if (viewOscillator2 != null) {
                                    int i20 = i19 + 1;
                                    fArr4[i20] = viewOscillator2.a(fMin) + fArr4[i20];
                                } else if (splineSet2 != null) {
                                    int i21 = i19 + 1;
                                    fArr4[i21] = splineSet2.a(fMin) + fArr4[i21];
                                }
                                i17 = i6 + 1;
                                i11 = i5;
                                i16 = i18;
                                motionPaths = motionPaths4;
                                paint6 = paint3;
                                paint8 = paint4;
                                f3 = 1.0f;
                            }
                            MotionPaths motionPaths5 = motionPaths;
                            devModeDraw3.a(canvas, iMax2, devModeDraw3.k, motionController2);
                            paint9.setColor(-21965);
                            paint7.setColor(-2067046);
                            Paint paint10 = paint8;
                            paint10.setColor(-2067046);
                            paint = paint6;
                            paint.setColor(-13391360);
                            int i22 = i5;
                            float f9 = -i22;
                            canvas.translate(f9, f9);
                            devModeDraw3.a(canvas, iMax2, devModeDraw3.k, motionController2);
                            char c = 5;
                            if (iMax2 == 5) {
                                float[] fArr5 = devModeDraw3.j;
                                devModeDraw3.d.reset();
                                int i23 = 0;
                                while (i23 <= 50) {
                                    char c2 = c;
                                    int i24 = i23;
                                    motionController2.j[0].d(motionController2.p, motionController2.b(null, i23 / 50));
                                    int[] iArr2 = motionController2.o;
                                    double[] dArr3 = motionController2.p;
                                    MotionPaths motionPaths6 = motionPaths5;
                                    float fSin = motionPaths6.h;
                                    float fCos = motionPaths6.i;
                                    float f10 = motionPaths6.j;
                                    float f11 = motionPaths6.k;
                                    int i25 = i22;
                                    float[] fArr6 = fArr5;
                                    int i26 = 0;
                                    while (true) {
                                        motionController = motionController2;
                                        if (i26 >= iArr2.length) {
                                            break;
                                        }
                                        Paint paint11 = paint10;
                                        float f12 = (float) dArr3[i26];
                                        int i27 = iArr2[i26];
                                        if (i27 == 1) {
                                            fSin = f12;
                                        } else if (i27 == 2) {
                                            fCos = f12;
                                        } else if (i27 == 3) {
                                            f10 = f12;
                                        } else if (i27 == 4) {
                                            f11 = f12;
                                        }
                                        i26++;
                                        motionController2 = motionController;
                                        paint10 = paint11;
                                    }
                                    Paint paint12 = paint10;
                                    if (motionPaths6.p != null) {
                                        double d2 = BitmapDescriptorFactory.HUE_RED;
                                        double d3 = fSin;
                                        devModeDraw2 = devModeDraw3;
                                        double d4 = fCos;
                                        fSin = (float) (((Math.sin(d4) * d3) + d2) - (f10 / 2.0f));
                                        fCos = (float) ((d2 - (Math.cos(d4) * d3)) - (f11 / 2.0f));
                                    } else {
                                        devModeDraw2 = devModeDraw3;
                                    }
                                    float f13 = f10 + fSin;
                                    float f14 = f11 + fCos;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f15 = fSin + BitmapDescriptorFactory.HUE_RED;
                                    float f16 = fCos + BitmapDescriptorFactory.HUE_RED;
                                    float f17 = f13 + BitmapDescriptorFactory.HUE_RED;
                                    float f18 = f14 + BitmapDescriptorFactory.HUE_RED;
                                    fArr6[0] = f15;
                                    fArr6[1] = f16;
                                    fArr6[2] = f17;
                                    fArr6[3] = f16;
                                    fArr6[4] = f17;
                                    fArr6[c2] = f18;
                                    fArr6[6] = f15;
                                    fArr6[7] = f18;
                                    devModeDraw2.d.moveTo(f15, f16);
                                    devModeDraw2.d.lineTo(fArr6[2], fArr6[3]);
                                    devModeDraw2.d.lineTo(fArr6[4], fArr6[c2]);
                                    devModeDraw2.d.lineTo(fArr6[6], fArr6[7]);
                                    devModeDraw2.d.close();
                                    i23 = i24 + 1;
                                    devModeDraw3 = devModeDraw2;
                                    motionPaths5 = motionPaths6;
                                    c = c2;
                                    fArr5 = fArr6;
                                    motionController2 = motionController;
                                    i22 = i25;
                                    paint10 = paint12;
                                }
                                i4 = i22;
                                devModeDraw = devModeDraw3;
                                paint2 = paint10;
                                paint9.setColor(1140850688);
                                canvas.translate(2.0f, 2.0f);
                                canvas.drawPath(devModeDraw.d, paint9);
                                canvas.translate(-2.0f, -2.0f);
                                paint9.setColor(-65536);
                                canvas.drawPath(devModeDraw.d, paint9);
                                devModeDraw3 = devModeDraw;
                                paint6 = paint;
                                it3 = it5;
                                iC = i;
                                i10 = i3;
                                i11 = i4;
                                paint8 = paint2;
                            } else {
                                i4 = i22;
                                devModeDraw = devModeDraw3;
                                paint2 = paint10;
                            }
                        } else {
                            devModeDraw = devModeDraw3;
                            i3 = i10;
                            paint = paint6;
                            paint2 = paint8;
                            i4 = i11;
                        }
                        devModeDraw3 = devModeDraw;
                        paint6 = paint;
                        it3 = it5;
                        iC = i;
                        i10 = i3;
                        i11 = i4;
                        paint8 = paint2;
                    }
                }
                canvas.restore();
            }
        }
        ArrayList arrayList6 = this.N;
        if (arrayList6 != null) {
            Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                ((MotionHelper) it9.next()).getClass();
            }
        }
    }

    @IdRes
    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.d;
        if (motionScene == null) {
            return null;
        }
        SparseArray sparseArray = motionScene.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.i;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.d;
        if (motionScene == null) {
            return null;
        }
        return motionScene.d;
    }

    public DesignTool getDesignTool() {
        if (this.C == null) {
            this.C = new DesignTool();
        }
        return this.C;
    }

    public int getEndState() {
        return this.j;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.r;
    }

    public MotionScene getScene() {
        return this.d;
    }

    public int getStartState() {
        return this.h;
    }

    public float getTargetPosition() {
        return this.t;
    }

    public Bundle getTransitionState() {
        if (this.h0 == null) {
            this.h0 = new StateCache();
        }
        StateCache stateCache = this.h0;
        MotionLayout motionLayout = MotionLayout.this;
        stateCache.d = motionLayout.j;
        stateCache.c = motionLayout.h;
        stateCache.b = motionLayout.getVelocity();
        stateCache.f2342a = motionLayout.getProgress();
        StateCache stateCache2 = this.h0;
        stateCache2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", stateCache2.f2342a);
        bundle.putFloat("motion.velocity", stateCache2.b);
        bundle.putInt("motion.StartState", stateCache2.c);
        bundle.putInt("motion.EndState", stateCache2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.d != null) {
            this.p = r0.c() / 1000.0f;
        }
        return (long) (this.p * 1000.0f);
    }

    public float getVelocity() {
        return this.g;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
        TouchResponse touchResponse;
        int i2;
        MotionScene motionScene = this.d;
        if (motionScene != null) {
            float f = this.J;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            float f3 = this.G / f;
            float f4 = this.H / f;
            MotionScene.Transition transition = motionScene.c;
            if (transition == null || (touchResponse = transition.l) == null) {
                return;
            }
            float[] fArr = touchResponse.n;
            touchResponse.m = false;
            MotionLayout motionLayout = touchResponse.r;
            float progress = motionLayout.getProgress();
            touchResponse.r.t(touchResponse.d, progress, touchResponse.h, touchResponse.g, fArr);
            float f5 = touchResponse.k;
            float f6 = f5 != BitmapDescriptorFactory.HUE_RED ? (f3 * f5) / fArr[0] : (f4 * touchResponse.l) / fArr[1];
            if (!Float.isNaN(f6)) {
                progress += f6 / 3.0f;
            }
            if (progress == BitmapDescriptorFactory.HUE_RED || progress == 1.0f || (i2 = touchResponse.c) == 3) {
                return;
            }
            if (progress >= 0.5d) {
                f2 = 1.0f;
            }
            motionLayout.C(f2, f6, i2);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        this.I = getNanoTime();
        this.J = BitmapDescriptorFactory.HUE_RED;
        this.G = BitmapDescriptorFactory.HUE_RED;
        this.H = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) throws ExecutionException, IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        MotionScene.Transition transition;
        boolean z;
        float f;
        TouchResponse touchResponse;
        float f2;
        TouchResponse touchResponse2;
        TouchResponse touchResponse3;
        TouchResponse touchResponse4;
        int i4;
        MotionScene motionScene = this.d;
        if (motionScene == null || (transition = motionScene.c) == null || (z = transition.o)) {
            return;
        }
        int i5 = -1;
        if (z || (touchResponse4 = transition.l) == null || (i4 = touchResponse4.e) == -1 || view.getId() == i4) {
            MotionScene.Transition transition2 = motionScene.c;
            if ((transition2 == null || (touchResponse3 = transition2.l) == null) ? false : touchResponse3.u) {
                TouchResponse touchResponse5 = transition.l;
                if (touchResponse5 != null && (touchResponse5.w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.q;
                if ((f3 == 1.0f || f3 == BitmapDescriptorFactory.HUE_RED) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            TouchResponse touchResponse6 = transition.l;
            if (touchResponse6 == null || (touchResponse6.w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                MotionScene.Transition transition3 = motionScene.c;
                if (transition3 == null || (touchResponse2 = transition3.l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = touchResponse2.n;
                    f = 0.0f;
                    touchResponse2.r.t(touchResponse2.d, touchResponse2.r.getProgress(), touchResponse2.h, touchResponse2.g, fArr);
                    float f6 = touchResponse2.k;
                    if (f6 != BitmapDescriptorFactory.HUE_RED) {
                        if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == BitmapDescriptorFactory.HUE_RED) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * touchResponse2.l) / fArr[1];
                    }
                }
                float f7 = this.r;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    final ViewGroup viewGroup = (ViewGroup) view;
                    view.post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            viewGroup.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f8 = this.q;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.G = f9;
            float f10 = i2;
            this.H = f10;
            this.J = (float) ((nanoTime - this.I) * 1.0E-9d);
            this.I = nanoTime;
            MotionScene.Transition transition4 = motionScene.c;
            if (transition4 != null && (touchResponse = transition4.l) != null) {
                float[] fArr2 = touchResponse.n;
                MotionLayout motionLayout = touchResponse.r;
                float progress = motionLayout.getProgress();
                if (!touchResponse.m) {
                    touchResponse.m = true;
                    motionLayout.setProgress(progress);
                }
                touchResponse.r.t(touchResponse.d, progress, touchResponse.h, touchResponse.g, fArr2);
                if (Math.abs((touchResponse.l * fArr2[1]) + (touchResponse.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = touchResponse.k;
                float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * touchResponse.l) / fArr2[1]), 1.0f), f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f8 != this.q) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            q(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.F = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        MotionScene.Transition transition;
        if (i == 0) {
            this.d = null;
            return;
        }
        try {
            MotionScene motionScene = new MotionScene(getContext(), this, i);
            this.d = motionScene;
            int i2 = -1;
            if (this.i == -1) {
                this.i = motionScene.h();
                this.h = this.d.h();
                MotionScene.Transition transition2 = this.d.c;
                if (transition2 != null) {
                    i2 = transition2.c;
                }
                this.j = i2;
            }
            if (!isAttachedToWindow()) {
                this.d = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                MotionScene motionScene2 = this.d;
                if (motionScene2 != null) {
                    ConstraintSet constraintSetB = motionScene2.b(this.i);
                    this.d.n(this);
                    ArrayList arrayList = this.N;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((MotionHelper) it.next()).getClass();
                        }
                    }
                    if (constraintSetB != null) {
                        constraintSetB.c(this);
                    }
                    this.h = this.i;
                }
                y();
                StateCache stateCache = this.h0;
                if (stateCache != null) {
                    if (this.k0) {
                        post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                            @Override // java.lang.Runnable
                            public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
                                MotionLayout.this.h0.a();
                            }
                        });
                        return;
                    } else {
                        stateCache.a();
                        return;
                    }
                }
                MotionScene motionScene3 = this.d;
                if (motionScene3 == null || (transition = motionScene3.c) == null || transition.n != 4) {
                    return;
                }
                D();
                setState(TransitionState.e);
                setState(TransitionState.f);
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e2);
        }
    }

    public final void m(float f) throws ExecutionException, InterruptedException {
        if (this.d == null) {
            return;
        }
        float f2 = this.r;
        float f3 = this.q;
        if (f2 != f3 && this.u) {
            this.r = f3;
        }
        float f4 = this.r;
        if (f4 == f) {
            return;
        }
        this.z = false;
        this.t = f;
        this.p = r0.c() / 1000.0f;
        setProgress(this.t);
        this.e = null;
        this.f = this.d.e();
        this.u = false;
        this.o = getNanoTime();
        this.v = true;
        this.q = f4;
        this.r = f4;
        invalidate();
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.F || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.F = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        MotionScene motionScene = this.d;
        return (motionScene == null || (transition = motionScene.c) == null || (touchResponse = transition.l) == null || (touchResponse.w & 2) != 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        MotionScene.Transition transition;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        MotionScene motionScene = this.d;
        if (motionScene != null && (i = this.i) != -1) {
            ConstraintSet constraintSetB = motionScene.b(i);
            this.d.n(this);
            ArrayList arrayList = this.N;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((MotionHelper) it.next()).getClass();
                }
            }
            if (constraintSetB != null) {
                constraintSetB.c(this);
            }
            this.h = this.i;
        }
        y();
        StateCache stateCache = this.h0;
        if (stateCache != null) {
            if (this.k0) {
                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public final void run() throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
                        MotionLayout.this.h0.a();
                    }
                });
                return;
            } else {
                stateCache.a();
                return;
            }
        }
        MotionScene motionScene2 = this.d;
        if (motionScene2 == null || (transition = motionScene2.c) == null || transition.n != 4) {
            return;
        }
        D();
        setState(TransitionState.e);
        setState(TransitionState.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        MotionLayout motionLayout;
        this.g0 = true;
        try {
            if (this.d == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.g0 = false;
                return;
            }
            motionLayout = this;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            try {
                if (motionLayout.D != i5 || motionLayout.E != i6) {
                    A();
                    q(true);
                }
                motionLayout.D = i5;
                motionLayout.E = i6;
                motionLayout.g0 = false;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                motionLayout.g0 = false;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            motionLayout = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        boolean z;
        if (this.d == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.k == i && this.l == i2) ? false : true;
        if (this.n0) {
            this.n0 = false;
            y();
            z();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.k = i;
        this.l = i2;
        int iH = this.d.h();
        MotionScene.Transition transition = this.d.c;
        int i3 = transition == null ? -1 : transition.c;
        Model model = this.m0;
        if ((!z3 && iH == model.e && i3 == model.f) || this.h == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            model.e(this.d.b(iH), this.d.b(i3));
            model.f();
            model.e = iH;
            model.f = i3;
            z = false;
        }
        if (this.U || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iV = this.mLayoutWidget.v() + getPaddingRight() + getPaddingLeft();
            int iP = this.mLayoutWidget.p() + paddingBottom;
            int i4 = this.c0;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                iV = (int) ((this.e0 * (this.a0 - r1)) + this.V);
                requestLayout();
            }
            int i5 = this.d0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                iP = (int) ((this.e0 * (this.b0 - r2)) + this.W);
                requestLayout();
            }
            setMeasuredDimension(iV, iP);
        }
        float fSignum = Math.signum(this.t - this.r);
        long nanoTime = getNanoTime();
        MotionInterpolator motionInterpolator = this.e;
        float interpolation = this.r + (!(motionInterpolator instanceof StopLogic) ? (((nanoTime - this.s) * fSignum) * 1.0E-9f) / this.p : 0.0f);
        if (this.u) {
            interpolation = this.t;
        }
        if ((fSignum <= BitmapDescriptorFactory.HUE_RED || interpolation < this.t) && (fSignum > BitmapDescriptorFactory.HUE_RED || interpolation > this.t)) {
            z2 = false;
        } else {
            interpolation = this.t;
        }
        if (motionInterpolator != null && !z2) {
            interpolation = this.z ? motionInterpolator.getInterpolation((nanoTime - this.o) * 1.0E-9f) : motionInterpolator.getInterpolation(interpolation);
        }
        if ((fSignum > BitmapDescriptorFactory.HUE_RED && interpolation >= this.t) || (fSignum <= BitmapDescriptorFactory.HUE_RED && interpolation <= this.t)) {
            interpolation = this.t;
        }
        this.e0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f = interpolation;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            MotionController motionController = (MotionController) this.n.get(childAt);
            if (motionController != null) {
                motionController.i(f, nanoTime2, childAt, this.f0);
            }
        }
        if (this.U) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        TouchResponse touchResponse;
        MotionScene motionScene = this.d;
        if (motionScene != null) {
            boolean zIsRtl = isRtl();
            motionScene.p = zIsRtl;
            MotionScene.Transition transition = motionScene.c;
            if (transition == null || (touchResponse = transition.l) == null) {
                return;
            }
            touchResponse.c(zIsRtl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0580  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r35) throws java.util.concurrent.ExecutionException, java.lang.IllegalAccessException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 2036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.O == null) {
                this.O = new CopyOnWriteArrayList();
            }
            this.O.add(motionHelper);
            if (motionHelper.m) {
                if (this.L == null) {
                    this.L = new ArrayList();
                }
                this.L.add(motionHelper);
            }
            if (motionHelper.n) {
                if (this.M == null) {
                    this.M = new ArrayList();
                }
                this.M.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.N == null) {
                    this.N = new ArrayList();
                }
                this.N.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.M;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            MotionController motionController = (MotionController) this.n.get(getChildAt(i));
            if (motionController != null && "button".equals(Debug.d(motionController.b)) && motionController.A != null) {
                int i2 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = motionController.A;
                    if (i2 < keyTriggerArr.length) {
                        keyTriggerArr[i2].h(motionController.b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0 A[PHI: r3
  0x00e0: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:49:0x00ae, B:60:0x00d4, B:62:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(boolean r22) throws java.util.concurrent.ExecutionException, java.lang.IllegalAccessException, java.lang.InterruptedException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.q(boolean):void");
    }

    public final void r() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.w == null && ((copyOnWriteArrayList2 = this.O) == null || copyOnWriteArrayList2.isEmpty())) || this.T == this.q) {
            return;
        }
        if (this.S != -1 && (copyOnWriteArrayList = this.O) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).getClass();
            }
        }
        this.S = -1;
        this.T = this.q;
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.O;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((TransitionListener) it2.next()).getClass();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.U && this.i == -1 && (motionScene = this.d) != null && (transition = motionScene.c) != null) {
            int i = transition.q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((MotionController) this.n.get(getChildAt(i2))).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s() throws ExecutionException, InterruptedException {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.w != null || ((copyOnWriteArrayList = this.O) != null && !copyOnWriteArrayList.isEmpty())) && this.S == -1) {
            this.S = this.i;
            ArrayList arrayList = this.r0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) a.c(1, arrayList)).intValue() : -1;
            int i = this.i;
            if (iIntValue != i && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        z();
        e eVar = this.i0;
        if (eVar != null) {
            eVar.run();
            this.i0 = null;
        }
    }

    public void setDebugMode(int i) {
        this.x = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.k0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.m = z;
    }

    public void setInterpolatedProgress(float f) throws ExecutionException, InterruptedException {
        if (this.d != null) {
            setState(TransitionState.f);
            Interpolator interpolatorE = this.d.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.M.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.L.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) throws ExecutionException, InterruptedException {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.h0 == null) {
                this.h0 = new StateCache();
            }
            this.h0.f2342a = f;
            return;
        }
        TransitionState transitionState = TransitionState.g;
        TransitionState transitionState2 = TransitionState.f;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            if (this.r == 1.0f && this.i == this.j) {
                setState(transitionState2);
            }
            this.i = this.h;
            if (this.r == BitmapDescriptorFactory.HUE_RED) {
                setState(transitionState);
            }
        } else if (f >= 1.0f) {
            if (this.r == BitmapDescriptorFactory.HUE_RED && this.i == this.h) {
                setState(transitionState2);
            }
            this.i = this.j;
            if (this.r == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.i = -1;
            setState(transitionState2);
        }
        if (this.d == null) {
            return;
        }
        this.u = true;
        this.t = f;
        this.q = f;
        this.s = -1L;
        this.o = -1L;
        this.e = null;
        this.v = true;
        invalidate();
    }

    public void setScene(MotionScene motionScene) throws Resources.NotFoundException {
        TouchResponse touchResponse;
        this.d = motionScene;
        boolean zIsRtl = isRtl();
        motionScene.p = zIsRtl;
        MotionScene.Transition transition = motionScene.c;
        if (transition != null && (touchResponse = transition.l) != null) {
            touchResponse.c(zIsRtl);
        }
        A();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.i = i;
            return;
        }
        if (this.h0 == null) {
            this.h0 = new StateCache();
        }
        StateCache stateCache = this.h0;
        stateCache.c = i;
        stateCache.d = i;
    }

    public void setState(TransitionState transitionState) throws ExecutionException, InterruptedException {
        TransitionState transitionState2 = TransitionState.g;
        if (transitionState == transitionState2 && this.i == -1) {
            return;
        }
        TransitionState transitionState3 = this.l0;
        this.l0 = transitionState;
        TransitionState transitionState4 = TransitionState.f;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            r();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                s();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            r();
        }
        if (transitionState == transitionState2) {
            s();
        }
    }

    public void setTransition(int i) throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        if (this.d != null) {
            MotionScene.Transition transitionU = u(i);
            this.h = transitionU.d;
            this.j = transitionU.c;
            if (!isAttachedToWindow()) {
                if (this.h0 == null) {
                    this.h0 = new StateCache();
                }
                StateCache stateCache = this.h0;
                stateCache.c = this.h;
                stateCache.d = this.j;
                return;
            }
            int i2 = this.i;
            float f = i2 == this.h ? 0.0f : i2 == this.j ? 1.0f : Float.NaN;
            MotionScene motionScene = this.d;
            motionScene.c = transitionU;
            TouchResponse touchResponse = transitionU.l;
            if (touchResponse != null) {
                touchResponse.c(motionScene.p);
            }
            this.m0.e(this.d.b(this.h), this.d.b(this.j));
            A();
            if (this.r != f) {
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    p(true);
                    this.d.b(this.h).c(this);
                } else if (f == 1.0f) {
                    p(false);
                    this.d.b(this.j).c(this);
                }
            }
            this.r = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
                return;
            }
            Log.v("MotionLayout", Debug.b() + " transitionToStart ");
            m(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public void setTransitionDuration(int i) {
        MotionScene motionScene = this.d;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        MotionScene.Transition transition = motionScene.c;
        if (transition != null) {
            transition.h = Math.max(i, 8);
        } else {
            motionScene.j = i;
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.w = transitionListener;
    }

    public void setTransitionState(Bundle bundle) throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        if (this.h0 == null) {
            this.h0 = new StateCache();
        }
        StateCache stateCache = this.h0;
        stateCache.getClass();
        stateCache.f2342a = bundle.getFloat("motion.progress");
        stateCache.b = bundle.getFloat("motion.velocity");
        stateCache.c = bundle.getInt("motion.StartState");
        stateCache.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.h0.a();
        }
    }

    public final void t(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        MotionController motionController = (MotionController) this.n.get(viewById);
        if (motionController != null) {
            motionController.d(f, f2, f3, fArr);
            viewById.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? a.d(i, "") : viewById.getContext().getResources().getResourceName(i)));
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return Debug.c(this.h, context) + "->" + Debug.c(this.j, context) + " (pos:" + this.r + " Dpos/Dt:" + this.g;
    }

    public final MotionScene.Transition u(int i) {
        Iterator it = this.d.d.iterator();
        while (it.hasNext()) {
            MotionScene.Transition transition = (MotionScene.Transition) it.next();
            if (transition.f2345a == i) {
                return transition;
            }
        }
        return null;
    }

    public final void v(MotionTelltales motionTelltales, float f, float f2, float[] fArr, int i) {
        float[] fArr2;
        float f3;
        char c;
        char c2;
        float[] fArr3;
        MotionPaths motionPaths;
        SplineSet splineSet;
        double[] dArr;
        float fA = this.g;
        float f4 = this.r;
        if (this.e != null) {
            float fSignum = Math.signum(this.t - f4);
            float interpolation = this.e.getInterpolation(this.r + 1.0E-5f);
            float interpolation2 = this.e.getInterpolation(this.r);
            fA = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / this.p;
            f4 = interpolation2;
        }
        MotionInterpolator motionInterpolator = this.e;
        if (motionInterpolator != null) {
            fA = motionInterpolator.a();
        }
        float f5 = fA;
        MotionController motionController = (MotionController) this.n.get(motionTelltales);
        if ((i & 1) == 0) {
            int width = motionTelltales.getWidth();
            int height = motionTelltales.getHeight();
            float[] fArr4 = motionController.v;
            MotionPaths motionPaths2 = motionController.f;
            float fB = motionController.b(fArr4, f4);
            HashMap map = motionController.y;
            SplineSet splineSet2 = map == null ? null : (SplineSet) map.get("translationX");
            HashMap map2 = motionController.y;
            SplineSet splineSet3 = map2 == null ? null : (SplineSet) map2.get("translationY");
            c = 0;
            HashMap map3 = motionController.y;
            c2 = 1;
            SplineSet splineSet4 = map3 == null ? null : (SplineSet) map3.get("rotation");
            HashMap map4 = motionController.y;
            SplineSet splineSet5 = map4 == null ? null : (SplineSet) map4.get("scaleX");
            f3 = f5;
            HashMap map5 = motionController.y;
            SplineSet splineSet6 = map5 == null ? null : (SplineSet) map5.get("scaleY");
            HashMap map6 = motionController.z;
            ViewOscillator viewOscillator = map6 == null ? null : (ViewOscillator) map6.get("translationX");
            HashMap map7 = motionController.z;
            ViewOscillator viewOscillator2 = map7 == null ? null : (ViewOscillator) map7.get("translationY");
            HashMap map8 = motionController.z;
            ViewOscillator viewOscillator3 = map8 == null ? null : (ViewOscillator) map8.get("rotation");
            HashMap map9 = motionController.z;
            ViewOscillator viewOscillator4 = map9 == null ? null : (ViewOscillator) map9.get("scaleX");
            HashMap map10 = motionController.z;
            ViewOscillator viewOscillator5 = map10 == null ? null : (ViewOscillator) map10.get("scaleY");
            VelocityMatrix velocityMatrix = new VelocityMatrix();
            velocityMatrix.e = BitmapDescriptorFactory.HUE_RED;
            velocityMatrix.d = BitmapDescriptorFactory.HUE_RED;
            velocityMatrix.c = BitmapDescriptorFactory.HUE_RED;
            velocityMatrix.b = BitmapDescriptorFactory.HUE_RED;
            velocityMatrix.f2293a = BitmapDescriptorFactory.HUE_RED;
            if (splineSet4 != null) {
                fArr3 = fArr4;
                motionPaths = motionPaths2;
                velocityMatrix.e = (float) splineSet4.f2287a.e(fB);
                velocityMatrix.f = splineSet4.a(fB);
            } else {
                fArr3 = fArr4;
                motionPaths = motionPaths2;
            }
            if (splineSet2 != null) {
                splineSet = splineSet2;
                velocityMatrix.c = (float) splineSet2.f2287a.e(fB);
            } else {
                splineSet = splineSet2;
            }
            if (splineSet3 != null) {
                velocityMatrix.d = (float) splineSet3.f2287a.e(fB);
            }
            if (splineSet5 != null) {
                velocityMatrix.f2293a = (float) splineSet5.f2287a.e(fB);
            }
            if (splineSet6 != null) {
                velocityMatrix.b = (float) splineSet6.f2287a.e(fB);
            }
            if (viewOscillator3 != null) {
                velocityMatrix.e = viewOscillator3.b(fB);
            }
            if (viewOscillator != null) {
                velocityMatrix.c = viewOscillator.b(fB);
            }
            if (viewOscillator2 != null) {
                velocityMatrix.d = viewOscillator2.b(fB);
            }
            if (viewOscillator4 != null) {
                velocityMatrix.f2293a = viewOscillator4.b(fB);
            }
            if (viewOscillator5 != null) {
                velocityMatrix.b = viewOscillator5.b(fB);
            }
            ArcCurveFit arcCurveFit = motionController.k;
            if (arcCurveFit != null) {
                double[] dArr2 = motionController.p;
                if (dArr2.length > 0) {
                    double d = fB;
                    arcCurveFit.d(dArr2, d);
                    motionController.k.f(motionController.q, d);
                    int[] iArr = motionController.o;
                    double[] dArr3 = motionController.q;
                    double[] dArr4 = motionController.p;
                    motionPaths.getClass();
                    MotionPaths.e(f, f2, fArr, iArr, dArr3, dArr4);
                }
                velocityMatrix.a(f, f2, width, height, fArr);
            } else if (motionController.j != null) {
                float[] fArr5 = fArr3;
                double dB = motionController.b(fArr5, fB);
                motionController.j[0].f(motionController.q, dB);
                motionController.j[0].d(motionController.p, dB);
                float f6 = fArr5[0];
                int i2 = 0;
                while (true) {
                    dArr = motionController.q;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    dArr[i2] = dArr[i2] * f6;
                    i2++;
                }
                int[] iArr2 = motionController.o;
                double[] dArr5 = motionController.p;
                motionPaths.getClass();
                MotionPaths.e(f, f2, fArr, iArr2, dArr, dArr5);
                velocityMatrix.a(f, f2, width, height, fArr);
            } else {
                MotionPaths motionPaths3 = motionController.g;
                MotionPaths motionPaths4 = motionPaths;
                float f7 = motionPaths3.h - motionPaths4.h;
                float f8 = motionPaths3.i - motionPaths4.i;
                float f9 = motionPaths3.j - motionPaths4.j;
                float f10 = f8 + (motionPaths3.k - motionPaths4.k);
                fArr[0] = ((f7 + f9) * f) + ((1.0f - f) * f7);
                fArr[1] = (f10 * f2) + ((1.0f - f2) * f8);
                velocityMatrix.e = BitmapDescriptorFactory.HUE_RED;
                velocityMatrix.d = BitmapDescriptorFactory.HUE_RED;
                velocityMatrix.c = BitmapDescriptorFactory.HUE_RED;
                velocityMatrix.b = BitmapDescriptorFactory.HUE_RED;
                velocityMatrix.f2293a = BitmapDescriptorFactory.HUE_RED;
                if (splineSet4 != null) {
                    velocityMatrix.e = (float) splineSet4.f2287a.e(fB);
                    velocityMatrix.f = splineSet4.a(fB);
                }
                if (splineSet != null) {
                    velocityMatrix.c = (float) splineSet.f2287a.e(fB);
                }
                if (splineSet3 != null) {
                    velocityMatrix.d = (float) splineSet3.f2287a.e(fB);
                }
                if (splineSet5 != null) {
                    velocityMatrix.f2293a = (float) splineSet5.f2287a.e(fB);
                }
                if (splineSet6 != null) {
                    velocityMatrix.b = (float) splineSet6.f2287a.e(fB);
                }
                if (viewOscillator3 != null) {
                    velocityMatrix.e = viewOscillator3.b(fB);
                }
                if (viewOscillator != null) {
                    velocityMatrix.c = viewOscillator.b(fB);
                }
                if (viewOscillator2 != null) {
                    velocityMatrix.d = viewOscillator2.b(fB);
                }
                if (viewOscillator4 != null) {
                    velocityMatrix.f2293a = viewOscillator4.b(fB);
                }
                if (viewOscillator5 != null) {
                    velocityMatrix.b = viewOscillator5.b(fB);
                }
                fArr2 = fArr;
                velocityMatrix.a(f, f2, width, height, fArr2);
            }
            fArr2 = fArr;
        } else {
            fArr2 = fArr;
            f3 = f5;
            c = 0;
            c2 = 1;
            motionController.d(f4, f, f2, fArr2);
        }
        if (i < 2) {
            fArr2[c] = fArr2[c] * f3;
            fArr2[c2] = fArr2[c2] * f3;
        }
    }

    public final boolean w(View view, MotionEvent motionEvent, float f, float f2) {
        boolean z;
        boolean zOnTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (w(viewGroup.getChildAt(childCount), motionEvent, (r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF = this.o0;
            rectF.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    if (this.q0 == null) {
                        this.q0 = new Matrix();
                    }
                    matrix.invert(this.q0);
                    motionEventObtain.transform(this.q0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void x(AttributeSet attributeSet) throws Resources.NotFoundException {
        MotionScene motionScene;
        s0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.d = new MotionScene(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                    this.v = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.x == 0) {
                        this.x = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.x = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.d == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.d = null;
            }
        }
        if (this.x != 0) {
            MotionScene motionScene2 = this.d;
            if (motionScene2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iH = motionScene2.h();
                MotionScene motionScene3 = this.d;
                ConstraintSet constraintSetB = motionScene3.b(motionScene3.h());
                String strC = Debug.c(iH, getContext());
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbU = a.u("CHECK: ", strC, " ALL VIEWS SHOULD HAVE ID's ");
                        sbU.append(childAt.getClass().getName());
                        sbU.append(" does not!");
                        Log.w("MotionLayout", sbU.toString());
                    }
                    if (constraintSetB.l(id) == null) {
                        StringBuilder sbU2 = a.u("CHECK: ", strC, " NO CONSTRAINTS for ");
                        sbU2.append(Debug.d(childAt));
                        Log.w("MotionLayout", sbU2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) constraintSetB.g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String strC2 = Debug.c(i5, getContext());
                    if (findViewById(iArr[i4]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strC + " NO View matches id " + strC2);
                    }
                    if (constraintSetB.k(i5).e.d == -1) {
                        Log.w("MotionLayout", a.j("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                    if (constraintSetB.k(i5).e.c == -1) {
                        Log.w("MotionLayout", a.j("CHECK: ", strC, "(", strC2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator it = this.d.d.iterator();
                while (it.hasNext()) {
                    MotionScene.Transition transition = (MotionScene.Transition) it.next();
                    if (transition == this.d.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (transition.d == transition.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = transition.d;
                    int i7 = transition.c;
                    String strC3 = Debug.c(i6, getContext());
                    String strC4 = Debug.c(i7, getContext());
                    if (sparseIntArray.get(i6) == i7) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strC3 + "->" + strC4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strC3 + "->" + strC4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.d.b(i6) == null) {
                        androidx.compose.ui.input.pointer.a.v(" no such constraintSetStart ", strC3, "MotionLayout");
                    }
                    if (this.d.b(i7) == null) {
                        androidx.compose.ui.input.pointer.a.v(" no such constraintSetEnd ", strC3, "MotionLayout");
                    }
                }
            }
        }
        if (this.i != -1 || (motionScene = this.d) == null) {
            return;
        }
        this.i = motionScene.h();
        this.h = this.d.h();
        MotionScene.Transition transition2 = this.d.c;
        this.j = transition2 != null ? transition2.c : -1;
    }

    public final void y() {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        View viewFindViewById;
        MotionScene motionScene = this.d;
        if (motionScene == null) {
            return;
        }
        if (motionScene.a(this.i, this)) {
            requestLayout();
            return;
        }
        int i = this.i;
        if (i != -1) {
            MotionScene motionScene2 = this.d;
            ArrayList arrayList = motionScene2.f;
            ArrayList arrayList2 = motionScene2.d;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                MotionScene.Transition transition2 = (MotionScene.Transition) it.next();
                if (transition2.m.size() > 0) {
                    Iterator it2 = transition2.m.iterator();
                    while (it2.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it2.next()).b(this);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                MotionScene.Transition transition3 = (MotionScene.Transition) it3.next();
                if (transition3.m.size() > 0) {
                    Iterator it4 = transition3.m.iterator();
                    while (it4.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it4.next()).b(this);
                    }
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                MotionScene.Transition transition4 = (MotionScene.Transition) it5.next();
                if (transition4.m.size() > 0) {
                    Iterator it6 = transition4.m.iterator();
                    while (it6.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it6.next()).a(this, i, transition4);
                    }
                }
            }
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                MotionScene.Transition transition5 = (MotionScene.Transition) it7.next();
                if (transition5.m.size() > 0) {
                    Iterator it8 = transition5.m.iterator();
                    while (it8.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it8.next()).a(this, i, transition5);
                    }
                }
            }
        }
        if (!this.d.p() || (transition = this.d.c) == null || (touchResponse = transition.l) == null) {
            return;
        }
        MotionLayout motionLayout = touchResponse.r;
        int i2 = touchResponse.d;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.c(touchResponse.d, motionLayout.getContext()));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new TouchResponse.AnonymousClass1());
            nestedScrollView.setOnScrollChangeListener(new TouchResponse.AnonymousClass2());
        }
    }

    public final void z() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.w == null && ((copyOnWriteArrayList = this.O) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList = this.r0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            TransitionListener transitionListener = this.w;
            if (transitionListener != null) {
                transitionListener.a(num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.O;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((TransitionListener) it2.next()).a(num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) throws ExecutionException, InterruptedException {
        setState(TransitionState.e);
        this.i = i;
        this.h = -1;
        this.j = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.b(i2, i3, i);
            return;
        }
        MotionScene motionScene = this.d;
        if (motionScene != null) {
            motionScene.b(i).c(this);
        }
    }

    public void setTransition(MotionScene.Transition transition) throws ExecutionException, IllegalAccessException, InterruptedException, Resources.NotFoundException, IllegalArgumentException {
        TouchResponse touchResponse;
        MotionScene motionScene = this.d;
        motionScene.c = transition;
        if (transition != null && (touchResponse = transition.l) != null) {
            touchResponse.c(motionScene.p);
        }
        setState(TransitionState.e);
        int i = this.i;
        MotionScene.Transition transition2 = this.d.c;
        if (i == (transition2 == null ? -1 : transition2.c)) {
            this.r = 1.0f;
            this.q = 1.0f;
            this.t = 1.0f;
        } else {
            this.r = BitmapDescriptorFactory.HUE_RED;
            this.q = BitmapDescriptorFactory.HUE_RED;
            this.t = BitmapDescriptorFactory.HUE_RED;
        }
        this.s = (transition.r & 1) != 0 ? -1L : getNanoTime();
        int iH = this.d.h();
        MotionScene motionScene2 = this.d;
        MotionScene.Transition transition3 = motionScene2.c;
        int i2 = transition3 != null ? transition3.c : -1;
        if (iH == this.h && i2 == this.j) {
            return;
        }
        this.h = iH;
        this.j = i2;
        motionScene2.o(iH, i2);
        ConstraintSet constraintSetB = this.d.b(this.h);
        ConstraintSet constraintSetB2 = this.d.b(this.j);
        Model model = this.m0;
        model.e(constraintSetB, constraintSetB2);
        int i3 = this.h;
        int i4 = this.j;
        model.e = i3;
        model.f = i4;
        model.f();
        A();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f = null;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = 0;
        this.l = 0;
        this.m = true;
        this.n = new HashMap();
        this.o = 0L;
        this.p = 1.0f;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.t = BitmapDescriptorFactory.HUE_RED;
        this.v = false;
        this.x = 0;
        this.z = false;
        this.A = new StopLogic();
        this.B = new DecelerateInterpolator();
        this.F = false;
        this.K = false;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 0;
        this.Q = -1L;
        this.R = BitmapDescriptorFactory.HUE_RED;
        this.S = 0;
        this.T = BitmapDescriptorFactory.HUE_RED;
        this.U = false;
        this.f0 = new KeyCache();
        this.g0 = false;
        this.i0 = null;
        new HashMap();
        this.j0 = new Rect();
        this.k0 = false;
        this.l0 = TransitionState.d;
        this.m0 = new Model();
        this.n0 = false;
        this.o0 = new RectF();
        this.p0 = null;
        this.q0 = null;
        this.r0 = new ArrayList();
        x(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.f = null;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = 0;
        this.l = 0;
        this.m = true;
        this.n = new HashMap();
        this.o = 0L;
        this.p = 1.0f;
        this.q = BitmapDescriptorFactory.HUE_RED;
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.t = BitmapDescriptorFactory.HUE_RED;
        this.v = false;
        this.x = 0;
        this.z = false;
        this.A = new StopLogic();
        this.B = new DecelerateInterpolator();
        this.F = false;
        this.K = false;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = 0;
        this.Q = -1L;
        this.R = BitmapDescriptorFactory.HUE_RED;
        this.S = 0;
        this.T = BitmapDescriptorFactory.HUE_RED;
        this.U = false;
        this.f0 = new KeyCache();
        this.g0 = false;
        this.i0 = null;
        new HashMap();
        this.j0 = new Rect();
        this.k0 = false;
        this.l0 = TransitionState.d;
        this.m0 = new Model();
        this.n0 = false;
        this.o0 = new RectF();
        this.p0 = null;
        this.q0 = null;
        this.r0 = new ArrayList();
        x(attributeSet);
    }
}
