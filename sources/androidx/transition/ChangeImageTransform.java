package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] I = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator J = new AnonymousClass1();
    public static final Property K = new AnonymousClass2(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$1, reason: invalid class name */
    public class AnonymousClass1 implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageViewUtils.a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3780a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f3780a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3780a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final ImageView d;
        public final Matrix e;
        public final Matrix f;
        public boolean g = true;

        public Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.d = imageView;
            this.e = matrix;
            this.f = matrix2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            if (this.g) {
                ImageView imageView = this.d;
                imageView.setTag(com.woolworths.R.id.transition_image_transform, this.e);
                ImageViewUtils.a(imageView, this.f);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            ImageView imageView = this.d;
            Matrix matrix = (Matrix) imageView.getTag(com.woolworths.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(imageView, matrix);
                imageView.setTag(com.woolworths.R.id.transition_image_transform, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            this.g = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.d;
            imageView.setTag(com.woolworths.R.id.transition_image_transform, matrix);
            ImageViewUtils.a(imageView, this.f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.d;
            Matrix matrix = (Matrix) imageView.getTag(com.woolworths.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(imageView, matrix);
                imageView.setTag(com.woolworths.R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            this.g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.g = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.g = false;
        }
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void R(TransitionValues transitionValues, boolean z) {
        Matrix matrix;
        View view = transitionValues.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = transitionValues.f3796a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(com.woolworths.R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = AnonymousClass3.f3780a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float fMax = Math.max(width / f, height / f2);
                        int iRound = Math.round((width - (f * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        R(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        R(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap map = transitionValues.f3796a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap map2 = transitionValues2.f3796a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Property property = K;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            Matrix matrix3 = MatrixUtils.f3787a;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, J, matrix3, matrix3);
        }
        if (matrix == null) {
            matrix = MatrixUtils.f3787a;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.f3787a;
        }
        ((AnonymousClass2) property).getClass();
        ImageViewUtils.a(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, new TransitionUtils.MatrixEvaluator(), matrix, matrix2);
        Listener listener = new Listener(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(listener);
        objectAnimatorOfObject.addPauseListener(listener);
        a(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return I;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
