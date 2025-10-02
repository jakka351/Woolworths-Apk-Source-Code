package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.transition.TransitionUtils;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class MaterialContainerTransform extends Transition {
    public static final String[] I = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final ProgressThresholdsGroup J = new ProgressThresholdsGroup(new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 0.25f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 1.0f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 1.0f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 0.75f));
    public static final ProgressThresholdsGroup K = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 1.0f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    public static final ProgressThresholdsGroup L = new ProgressThresholdsGroup(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    public static final ProgressThresholdsGroup M = new ProgressThresholdsGroup(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 0.9f), new ProgressThresholds(BitmapDescriptorFactory.HUE_RED, 0.9f), new ProgressThresholds(0.2f, 0.9f));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FitMode {
    }

    public static class ProgressThresholds {

        /* renamed from: a, reason: collision with root package name */
        public final float f14682a;
        public final float b;

        public ProgressThresholds(float f, float f2) {
            this.f14682a = f;
            this.b = f2;
        }
    }

    public static class ProgressThresholdsGroup {

        /* renamed from: a, reason: collision with root package name */
        public final ProgressThresholds f14683a;
        public final ProgressThresholds b;
        public final ProgressThresholds c;
        public final ProgressThresholds d;

        public ProgressThresholdsGroup(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f14683a = progressThresholds;
            this.b = progressThresholds2;
            this.c = progressThresholds3;
            this.d = progressThresholds4;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface TransitionDirection {
    }

    public static final class TransitionDrawable extends Drawable {
        public final FitModeEvaluator A;
        public FadeModeResult B;
        public FitModeResult C;
        public RectF D;
        public float E;
        public float F;

        /* renamed from: a, reason: collision with root package name */
        public final View f14684a;
        public final RectF b;
        public final ShapeAppearanceModel c;
        public final float d;
        public final View e;
        public final RectF f;
        public final ShapeAppearanceModel g;
        public final float h;
        public final Paint i;
        public final Paint j;
        public final Paint k;
        public final Paint l;
        public final Paint m;
        public final MaskEvaluator n;
        public final PathMeasure o;
        public final float p;
        public final float[] q;
        public final boolean r;
        public final float s;
        public final float t;
        public final RectF u;
        public final RectF v;
        public final RectF w;
        public final RectF x;
        public final ProgressThresholdsGroup y;
        public final FadeModeEvaluator z;

        public TransitionDrawable(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f2, boolean z, FadeModeEvaluator fadeModeEvaluator, FitModeEvaluator fitModeEvaluator, ProgressThresholdsGroup progressThresholdsGroup) {
            Paint paint = new Paint();
            this.i = paint;
            Paint paint2 = new Paint();
            this.j = paint2;
            Paint paint3 = new Paint();
            this.k = paint3;
            this.l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.n = new MaskEvaluator();
            this.q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            Paint paint5 = new Paint();
            new Path();
            this.f14684a = view;
            this.b = rectF;
            this.c = shapeAppearanceModel;
            this.d = f;
            this.e = view2;
            this.f = rectF2;
            this.g = shapeAppearanceModel2;
            this.h = f2;
            this.r = z;
            this.z = fadeModeEvaluator;
            this.A = fitModeEvaluator;
            this.y = progressThresholdsGroup;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.s = r9.widthPixels;
            this.t = r9.heightPixels;
            paint.setColor(0);
            paint2.setColor(0);
            paint3.setColor(0);
            materialShapeDrawable.m(ColorStateList.valueOf(0));
            materialShapeDrawable.r(2);
            materialShapeDrawable.z = false;
            materialShapeDrawable.p(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.u = rectF3;
            this.v = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.w = rectF4;
            this.x = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.a(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.o = pathMeasure;
            this.p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = TransitionUtils.f14687a;
            paint4.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(BitmapDescriptorFactory.HUE_RED);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.k);
            Rect bounds = getBounds();
            RectF rectF = this.w;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.C.b, this.B.b, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.2
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.e.draw(canvas2);
                }
            });
        }

        public final void b(Canvas canvas) {
            c(canvas, this.j);
            Rect bounds = getBounds();
            RectF rectF = this.u;
            TransitionUtils.f(canvas, bounds, rectF.left, rectF.top, this.C.f14680a, this.B.f14678a, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.transition.MaterialContainerTransform.TransitionDrawable.1
                @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
                public final void a(Canvas canvas2) {
                    TransitionDrawable.this.f14684a.draw(canvas2);
                }
            });
        }

        public final void c(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        public final void d(float f) {
            float f2;
            float f3;
            RectF rectF;
            float f4;
            float f5;
            ShapeAppearanceModel shapeAppearanceModelA;
            this.F = f;
            this.m.setAlpha((int) (this.r ? TransitionUtils.c(BitmapDescriptorFactory.HUE_RED, 255.0f, f) : TransitionUtils.c(255.0f, BitmapDescriptorFactory.HUE_RED, f)));
            float f6 = this.p;
            PathMeasure pathMeasure = this.o;
            float[] fArr = this.q;
            pathMeasure.getPosTan(f6 * f, fArr, null);
            float fA = fArr[0];
            float fA2 = fArr[1];
            if (f > 1.0f || f < BitmapDescriptorFactory.HUE_RED) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                pathMeasure.getPosTan(f6 * f2, fArr, null);
                float f7 = fArr[0];
                float f8 = fArr[1];
                fA = YU.a.a(fA, f7, f3, fA);
                fA2 = YU.a.a(fA2, f8, f3, fA2);
            }
            float f9 = fA2;
            float f10 = fA;
            ProgressThresholdsGroup progressThresholdsGroup = this.y;
            ProgressThresholds progressThresholds = progressThresholdsGroup.b;
            ProgressThresholds progressThresholds2 = progressThresholdsGroup.f14683a;
            ProgressThresholds progressThresholds3 = progressThresholdsGroup.c;
            float f11 = progressThresholds.f14682a;
            float f12 = progressThresholdsGroup.b.b;
            RectF rectF2 = this.b;
            float fWidth = rectF2.width();
            float fHeight = rectF2.height();
            RectF rectF3 = this.f;
            FitModeResult fitModeResultA = this.A.a(f, f11, f12, fWidth, fHeight, rectF3.width(), rectF3.height());
            this.C = fitModeResultA;
            float f13 = fitModeResultA.c / 2.0f;
            float f14 = fitModeResultA.d + f9;
            RectF rectF4 = this.u;
            rectF4.set(f10 - f13, f9, f13 + f10, f14);
            FitModeResult fitModeResult = this.C;
            float f15 = fitModeResult.e / 2.0f;
            float f16 = fitModeResult.f + f9;
            RectF rectF5 = this.w;
            rectF5.set(f10 - f15, f9, f15 + f10, f16);
            RectF rectF6 = this.v;
            rectF6.set(rectF4);
            RectF rectF7 = this.x;
            rectF7.set(rectF5);
            float f17 = progressThresholds3.f14682a;
            float f18 = progressThresholds3.b;
            FitModeResult fitModeResult2 = this.C;
            FitModeEvaluator fitModeEvaluator = this.A;
            boolean zB = fitModeEvaluator.b(fitModeResult2);
            RectF rectF8 = zB ? rectF6 : rectF7;
            float fD = TransitionUtils.d(BitmapDescriptorFactory.HUE_RED, 1.0f, f17, f18, f, false);
            if (!zB) {
                fD = 1.0f - fD;
            }
            fitModeEvaluator.c(rectF8, fD, this.C);
            this.D = new RectF(Math.min(rectF6.left, rectF7.left), Math.min(rectF6.top, rectF7.top), Math.max(rectF6.right, rectF7.right), Math.max(rectF6.bottom, rectF7.bottom));
            ProgressThresholds progressThresholds4 = progressThresholdsGroup.d;
            MaskEvaluator maskEvaluator = this.n;
            Path path = maskEvaluator.c;
            Path path2 = maskEvaluator.b;
            float f19 = progressThresholds4.f14682a;
            float f20 = progressThresholds4.b;
            ShapeAppearanceModel shapeAppearanceModel = this.c;
            if (f < f19) {
                shapeAppearanceModelA = shapeAppearanceModel;
                f5 = 1.0f;
                rectF = rectF7;
                f4 = f;
            } else {
                ShapeAppearanceModel shapeAppearanceModel2 = this.g;
                if (f > f20) {
                    f4 = f;
                    shapeAppearanceModelA = shapeAppearanceModel2;
                    f5 = 1.0f;
                    rectF = rectF7;
                } else {
                    TransitionUtils.AnonymousClass1 anonymousClass1 = new TransitionUtils.CornerSizeBinaryOperator() { // from class: com.google.android.material.transition.TransitionUtils.1

                        /* renamed from: a */
                        public final /* synthetic */ RectF f14688a;
                        public final /* synthetic */ RectF b;
                        public final /* synthetic */ float c;
                        public final /* synthetic */ float d;
                        public final /* synthetic */ float e;

                        public AnonymousClass1(RectF rectF42, RectF rectF72, float f192, float f202, float f21) {
                            rectF = rectF42;
                            rectF = rectF72;
                            f = f192;
                            f = f202;
                            f = f21;
                        }

                        public final AbsoluteCornerSize a(CornerSize cornerSize, CornerSize cornerSize2) {
                            return new AbsoluteCornerSize(TransitionUtils.d(cornerSize.a(rectF), cornerSize2.a(rectF), f, f, f, false));
                        }
                    };
                    rectF = rectF72;
                    f4 = f21;
                    CornerSize cornerSize = shapeAppearanceModel.e;
                    CornerSize cornerSize2 = shapeAppearanceModel.h;
                    CornerSize cornerSize3 = shapeAppearanceModel.g;
                    f5 = 1.0f;
                    CornerSize cornerSize4 = shapeAppearanceModel.f;
                    ShapeAppearanceModel.Builder builderG = ((cornerSize.a(rectF42) == BitmapDescriptorFactory.HUE_RED && cornerSize4.a(rectF42) == BitmapDescriptorFactory.HUE_RED && cornerSize3.a(rectF42) == BitmapDescriptorFactory.HUE_RED && cornerSize2.a(rectF42) == BitmapDescriptorFactory.HUE_RED) ? shapeAppearanceModel2 : shapeAppearanceModel).g();
                    builderG.e = anonymousClass1.a(shapeAppearanceModel.e, shapeAppearanceModel2.e);
                    builderG.f = anonymousClass1.a(cornerSize4, shapeAppearanceModel2.f);
                    builderG.h = anonymousClass1.a(cornerSize2, shapeAppearanceModel2.h);
                    builderG.g = anonymousClass1.a(cornerSize3, shapeAppearanceModel2.g);
                    shapeAppearanceModelA = builderG.a();
                }
            }
            maskEvaluator.e = shapeAppearanceModelA;
            maskEvaluator.d.a(shapeAppearanceModelA, 1.0f, rectF6, null, path2);
            maskEvaluator.d.a(maskEvaluator.e, 1.0f, rectF, null, path);
            maskEvaluator.f14681a.op(path2, path, Path.Op.UNION);
            this.E = TransitionUtils.c(this.d, this.h, f4);
            float fCenterX = ((this.D.centerX() / (this.s / 2.0f)) - f5) * 0.3f;
            float fCenterY = (this.D.centerY() / this.t) * 1.5f;
            this.l.setShadowLayer(this.E, (int) (fCenterX * r4), (int) (fCenterY * r4), 754974720);
            this.B = this.z.a(f4, progressThresholds2.f14682a, progressThresholds2.b);
            Paint paint = this.j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.B.f14678a);
            }
            Paint paint2 = this.k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.B.b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            canvas.clipPath(this.n.f14681a);
            c(canvas, this.i);
            if (this.B.c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void R(TransitionValues transitionValues) throws Resources.NotFoundException {
        ShapeAppearanceModel shapeAppearanceModelA;
        View view = transitionValues.b;
        RectF rectF = TransitionUtils.f14687a;
        View viewFindViewById = view.findViewById(0);
        View viewA = viewFindViewById;
        if (viewFindViewById == null) {
            viewA = TransitionUtils.a(view);
        }
        transitionValues.b = viewA;
        HashMap map = transitionValues.f3796a;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!viewA.isLaidOut() && viewA.getWidth() == 0 && viewA.getHeight() == 0) {
            return;
        }
        final RectF rectF2 = viewA.getParent() == null ? new RectF(viewA.getLeft(), viewA.getTop(), viewA.getRight(), viewA.getBottom()) : TransitionUtils.b(viewA);
        map.put("materialContainerTransition:bounds", rectF2);
        if (viewA.getTag(R.id.mtrl_motion_snapshot_view) instanceof ShapeAppearanceModel) {
            shapeAppearanceModelA = (ShapeAppearanceModel) viewA.getTag(R.id.mtrl_motion_snapshot_view);
        } else {
            Context context = viewA.getContext();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
            typedArrayObtainStyledAttributes.recycle();
            shapeAppearanceModelA = resourceId != -1 ? ShapeAppearanceModel.a(context, resourceId, 0).a() : viewA instanceof Shapeable ? ((Shapeable) viewA).getShapeAppearanceModel() : new ShapeAppearanceModel.Builder().a();
        }
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModelA.h(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.a
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize c(CornerSize cornerSize) {
                RectF rectF3 = TransitionUtils.f14687a;
                if (cornerSize instanceof RelativeCornerSize) {
                    return (RelativeCornerSize) cornerSize;
                }
                RectF rectF4 = rectF2;
                return new RelativeCornerSize(cornerSize.a(rectF4) / Math.min(rectF4.width(), rectF4.height()));
            }
        }));
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) throws Resources.NotFoundException {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) throws Resources.NotFoundException {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) throws Resources.NotFoundException {
        final View viewA;
        RectF rectF;
        ProgressThresholdsGroup progressThresholdsGroup;
        int iC;
        View view = null;
        if (transitionValues != null) {
            HashMap map = transitionValues.f3796a;
            if (transitionValues2 != null) {
                HashMap map2 = transitionValues2.f3796a;
                RectF rectF2 = (RectF) map.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) map.get("materialContainerTransition:shapeAppearance");
                if (rectF2 != null && shapeAppearanceModel != null) {
                    RectF rectF3 = (RectF) map2.get("materialContainerTransition:bounds");
                    ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) map2.get("materialContainerTransition:shapeAppearance");
                    if (rectF3 == null || shapeAppearanceModel2 == null) {
                        Log.w("MaterialContainerTransform", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                        return null;
                    }
                    final View view2 = transitionValues.b;
                    final View view3 = transitionValues2.b;
                    View view4 = view3.getParent() != null ? view3 : view2;
                    if (view4.getId() == 0) {
                        viewA = (View) view4.getParent();
                        view = view4;
                    } else {
                        viewA = TransitionUtils.a(view4);
                    }
                    RectF rectFB = TransitionUtils.b(viewA);
                    float f = -rectFB.left;
                    float f2 = -rectFB.top;
                    if (view != null) {
                        rectF = TransitionUtils.b(view);
                        rectF.offset(f, f2);
                    } else {
                        rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, viewA.getWidth(), viewA.getHeight());
                    }
                    rectF2.offset(f, f2);
                    rectF3.offset(f, f2);
                    boolean z = rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width();
                    Context context = view4.getContext();
                    FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.b;
                    if (this.g == null) {
                        this.g = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, fastOutSlowInInterpolator);
                    }
                    int i = z ? R.attr.motionDurationLong2 : R.attr.motionDurationMedium4;
                    if (this.f == -1 && (iC = MotionUtils.c(context, i, -1)) != -1) {
                        this.f = iC;
                    }
                    PathMotion pathMotion = this.A;
                    FadeModeEvaluator fadeModeEvaluator = z ? FadeModeEvaluators.f14677a : FadeModeEvaluators.b;
                    float fWidth = rectF2.width();
                    float fHeight = rectF2.height();
                    float fWidth2 = rectF3.width();
                    float fHeight2 = rectF3.height();
                    FitModeEvaluator fitModeEvaluator = (!z ? (fWidth2 * fHeight) / fWidth >= fHeight2 : (fHeight2 * fWidth) / fWidth2 >= fHeight) ? FitModeEvaluators.b : FitModeEvaluators.f14679a;
                    PathMotion pathMotion2 = this.A;
                    if ((pathMotion2 instanceof ArcMotion) || (pathMotion2 instanceof MaterialArcMotion)) {
                        ProgressThresholdsGroup progressThresholdsGroup2 = z ? L : M;
                        progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup2.f14683a, progressThresholdsGroup2.b, progressThresholdsGroup2.c, progressThresholdsGroup2.d);
                    } else {
                        ProgressThresholdsGroup progressThresholdsGroup3 = z ? J : K;
                        progressThresholdsGroup = new ProgressThresholdsGroup(progressThresholdsGroup3.f14683a, progressThresholdsGroup3.b, progressThresholdsGroup3.c, progressThresholdsGroup3.d);
                    }
                    final TransitionDrawable transitionDrawable = new TransitionDrawable(pathMotion, view2, rectF2, shapeAppearanceModel, BitmapDescriptorFactory.HUE_RED, view3, rectF3, shapeAppearanceModel2, BitmapDescriptorFactory.HUE_RED, z, fadeModeEvaluator, fitModeEvaluator, progressThresholdsGroup);
                    transitionDrawable.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.MaterialContainerTransform.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            TransitionDrawable transitionDrawable2 = transitionDrawable;
                            if (transitionDrawable2.F != animatedFraction) {
                                transitionDrawable2.d(animatedFraction);
                            }
                        }
                    });
                    a(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.MaterialContainerTransform.2
                        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                        public final void g(Transition transition) {
                            ViewUtils.f(viewA).b(transitionDrawable);
                            view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                            view3.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        }

                        @Override // com.google.android.material.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                        public final void i(Transition transition) {
                            MaterialContainerTransform materialContainerTransform = MaterialContainerTransform.this;
                            materialContainerTransform.D(this);
                            materialContainerTransform.getClass();
                            view2.setAlpha(1.0f);
                            view3.setAlpha(1.0f);
                            ViewUtils.f(viewA).a(transitionDrawable);
                        }
                    });
                    return valueAnimatorOfFloat;
                }
                Log.w("MaterialContainerTransform", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return I;
    }
}
