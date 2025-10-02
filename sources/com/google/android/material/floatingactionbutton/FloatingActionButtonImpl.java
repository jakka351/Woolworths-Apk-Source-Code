package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
class FloatingActionButtonImpl {
    public static final FastOutLinearInInterpolator D = AnimationUtils.c;
    public static final int E = R.attr.motionDurationLong2;
    public static final int F = R.attr.motionEasingEmphasizedInterpolator;
    public static final int G = R.attr.motionDurationMedium1;
    public static final int H = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] I = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] L = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] M = {android.R.attr.state_enabled};
    public static final int[] N = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;

    /* renamed from: a, reason: collision with root package name */
    public ShapeAppearanceModel f14588a;
    public MaterialShapeDrawable b;
    public Drawable c;
    public BorderDrawable d;
    public LayerDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public final StateListAnimator l;
    public Animator m;
    public MotionSpec n;
    public MotionSpec o;
    public float p;
    public int r;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    public final FloatingActionButton w;
    public final ShadowViewDelegate x;
    public boolean g = true;
    public float q = 1.0f;
    public int s = 0;
    public final Rect y = new Rect();
    public final RectF z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$5, reason: invalid class name */
    class AnonymousClass5 implements TypeEvaluator<Float> {
        @Override // android.animation.TypeEvaluator
        public final Float evaluate(float f, Float f2, Float f3) {
            throw null;
        }
    }

    public class DisabledElevationAnimation extends ShadowAnimatorImpl {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImplLollipop h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ElevateToHoveredFocusedTranslationZAnimation(FloatingActionButtonImplLollipop floatingActionButtonImplLollipop) {
            super(floatingActionButtonImplLollipop);
            this.h = floatingActionButtonImplLollipop;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            FloatingActionButtonImplLollipop floatingActionButtonImplLollipop = this.h;
            return floatingActionButtonImplLollipop.h + floatingActionButtonImplLollipop.i;
        }
    }

    public class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImplLollipop h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ElevateToPressedTranslationZAnimation(FloatingActionButtonImplLollipop floatingActionButtonImplLollipop) {
            super(floatingActionButtonImplLollipop);
            this.h = floatingActionButtonImplLollipop;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            FloatingActionButtonImplLollipop floatingActionButtonImplLollipop = this.h;
            return floatingActionButtonImplLollipop.h + floatingActionButtonImplLollipop.j;
        }
    }

    public interface InternalTransformationCallback {
        void a();

        void b();
    }

    public interface InternalVisibilityChangedListener {
        void a();

        void b();
    }

    public class ResetElevationAnimation extends ShadowAnimatorImpl {
        public final /* synthetic */ FloatingActionButtonImplLollipop h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetElevationAnimation(FloatingActionButtonImplLollipop floatingActionButtonImplLollipop) {
            super(floatingActionButtonImplLollipop);
            this.h = floatingActionButtonImplLollipop;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        public final float a() {
            return this.h.h;
        }
    }

    public abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean d;
        public float e;
        public float f;
        public final /* synthetic */ FloatingActionButtonImplLollipop g;

        public ShadowAnimatorImpl(FloatingActionButtonImplLollipop floatingActionButtonImplLollipop) {
            this.g = floatingActionButtonImplLollipop;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = (int) this.f;
            MaterialShapeDrawable materialShapeDrawable = this.g.b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.l(f);
            }
            this.d = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z = this.d;
            FloatingActionButtonImplLollipop floatingActionButtonImplLollipop = this.g;
            if (!z) {
                MaterialShapeDrawable materialShapeDrawable = floatingActionButtonImplLollipop.b;
                this.e = materialShapeDrawable == null ? BitmapDescriptorFactory.HUE_RED : materialShapeDrawable.d.m;
                this.f = a();
                this.d = true;
            }
            float f = this.e;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f - f)) + f);
            MaterialShapeDrawable materialShapeDrawable2 = floatingActionButtonImplLollipop.b;
            if (materialShapeDrawable2 != null) {
                materialShapeDrawable2.l(animatedFraction);
            }
        }
    }

    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.w = floatingActionButton;
        this.x = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.l = stateListAnimator;
        FloatingActionButtonImplLollipop floatingActionButtonImplLollipop = (FloatingActionButtonImplLollipop) this;
        stateListAnimator.a(I, d(new ElevateToPressedTranslationZAnimation(floatingActionButtonImplLollipop)));
        stateListAnimator.a(J, d(new ElevateToHoveredFocusedTranslationZAnimation(floatingActionButtonImplLollipop)));
        stateListAnimator.a(K, d(new ElevateToHoveredFocusedTranslationZAnimation(floatingActionButtonImplLollipop)));
        stateListAnimator.a(L, d(new ElevateToHoveredFocusedTranslationZAnimation(floatingActionButtonImplLollipop)));
        stateListAnimator.a(M, d(new ResetElevationAnimation(floatingActionButtonImplLollipop)));
        stateListAnimator.a(N, d(new DisabledElevationAnimation(floatingActionButtonImplLollipop)));
        this.p = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        return valueAnimator;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.w.getDrawable();
        if (drawable == null || this.r == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.z;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, intrinsicWidth, intrinsicHeight);
        float f2 = this.r;
        RectF rectF2 = this.A;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.r / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(MotionSpec motionSpec, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.w;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        motionSpec.f("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        motionSpec.f("scale").a(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        motionSpec.f("scale").a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.B;
        a(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            /* renamed from: a */
            public final Matrix evaluate(float f4, Matrix matrix2, Matrix matrix3) {
                FloatingActionButtonImpl.this.q = f4;
                return super.evaluate(f4, matrix2, matrix3);
            }
        }, new Matrix(matrix));
        motionSpec.f("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        FloatingActionButton floatingActionButton = this.w;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.q;
        final Matrix matrix = new Matrix(this.B);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
                floatingActionButtonImpl.w.setAlpha(AnimationUtils.b(alpha, f, BitmapDescriptorFactory.HUE_RED, 0.2f, fFloatValue));
                FloatingActionButton floatingActionButton2 = floatingActionButtonImpl.w;
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(AnimationUtils.a(f5, f6, fFloatValue));
                floatingActionButtonImpl.w.setScaleY(AnimationUtils.a(scaleY, f6, fFloatValue));
                float f7 = f4;
                float f8 = f3;
                floatingActionButtonImpl.q = AnimationUtils.a(f7, f8, fFloatValue);
                float fA = AnimationUtils.a(f7, f8, fFloatValue);
                Matrix matrix2 = matrix;
                floatingActionButtonImpl.a(fA, matrix2);
                floatingActionButtonImpl.w.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSetCompat.a(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.c(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.d(floatingActionButton.getContext(), i2, AnimationUtils.b));
        return animatorSet;
    }

    public MaterialShapeDrawable e() {
        ShapeAppearanceModel shapeAppearanceModel = this.f14588a;
        shapeAppearanceModel.getClass();
        return new MaterialShapeDrawable(shapeAppearanceModel);
    }

    public float f() {
        return this.h;
    }

    public void g(Rect rect) {
        int iMax = this.f ? Math.max((this.k - this.w.getSizeDimension()) / 2, 0) : 0;
        int iMax2 = Math.max(iMax, (int) Math.ceil(this.g ? f() + this.j : BitmapDescriptorFactory.HUE_RED));
        int iMax3 = Math.max(iMax, (int) Math.ceil(r0 * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public void h(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        MaterialShapeDrawable materialShapeDrawableE = e();
        this.b = materialShapeDrawableE;
        materialShapeDrawableE.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.p(-12303292);
        this.b.k(this.w.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.b.d.f14634a);
        rippleDrawableCompat.setTintList(RippleUtils.c(colorStateList2));
        this.c = rippleDrawableCompat;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        materialShapeDrawable.getClass();
        this.e = new LayerDrawable(new Drawable[]{materialShapeDrawable, rippleDrawableCompat});
    }

    public void i() {
        StateListAnimator stateListAnimator = this.l;
        ValueAnimator valueAnimator = stateListAnimator.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            stateListAnimator.c = null;
        }
    }

    public void j() {
    }

    public void k(int[] iArr) {
        this.l.b(iArr);
    }

    public void l(float f, float f2, float f3) {
        i();
        r();
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.l(f);
        }
    }

    public final void m() {
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InternalTransformationCallback) it.next()).b();
            }
        }
    }

    public void n(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintList(RippleUtils.c(colorStateList));
        }
    }

    public final void o(ShapeAppearanceModel shapeAppearanceModel) {
        this.f14588a = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.c;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.d;
        if (borderDrawable != null) {
            borderDrawable.o = shapeAppearanceModel;
            borderDrawable.invalidateSelf();
        }
    }

    public boolean p() {
        return true;
    }

    public void q() {
        MaterialShapeDrawable materialShapeDrawable = this.b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.q((int) this.p);
        }
    }

    public final void r() {
        Rect rect = this.y;
        g(rect);
        Preconditions.e(this.e, "Didn't initialize content background");
        boolean zP = p();
        ShadowViewDelegate shadowViewDelegate = this.x;
        if (zP) {
            ((FloatingActionButton.ShadowDelegateImpl) shadowViewDelegate).a(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            ((FloatingActionButton.ShadowDelegateImpl) shadowViewDelegate).a(this.e);
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.o.set(i, i2, i3, i4);
        int i5 = floatingActionButton.l;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
