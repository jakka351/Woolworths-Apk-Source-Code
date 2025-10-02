package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class Slide extends Visibility {
    public static final DecelerateInterpolator L = new DecelerateInterpolator();
    public static final AccelerateInterpolator M = new AccelerateInterpolator();
    public static final AnonymousClass1 N = new AnonymousClass1();
    public static final AnonymousClass2 O = new AnonymousClass2();
    public static final AnonymousClass3 P = new AnonymousClass3();
    public static final AnonymousClass4 Q = new AnonymousClass4();
    public static final AnonymousClass5 R = new AnonymousClass5();
    public static final AnonymousClass6 S = new AnonymousClass6();
    public CalculateSlide K;

    /* renamed from: androidx.transition.Slide$1, reason: invalid class name */
    public class AnonymousClass1 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$2, reason: invalid class name */
    public class AnonymousClass2 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$3, reason: invalid class name */
    public class AnonymousClass3 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$4, reason: invalid class name */
    public class AnonymousClass4 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$5, reason: invalid class name */
    public class AnonymousClass5 extends CalculateSlideHorizontal {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$6, reason: invalid class name */
    public class AnonymousClass6 extends CalculateSlideVertical {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface CalculateSlide {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    public static abstract class CalculateSlideVertical implements CalculateSlide {
        @Override // androidx.transition.Slide.CalculateSlide
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = S;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f);
        int iD = TypedArrayUtils.d(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        W(iD);
    }

    @Override // androidx.transition.Visibility
    public final Animator T(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.f3796a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.a(view, transitionValues2, iArr[0], iArr[1], this.K.a(view, viewGroup), this.K.b(view, viewGroup), translationX, translationY, L, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator U(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.f3796a.get("android:slide:screenPosition");
        return TranslationAnimationCreator.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.K.a(view, viewGroup), this.K.b(view, viewGroup), M, this);
    }

    public final void W(int i) {
        if (i == 3) {
            this.K = N;
        } else if (i == 5) {
            this.K = Q;
        } else if (i == 48) {
            this.K = P;
        } else if (i == 80) {
            this.K = S;
        } else if (i == 8388611) {
            this.K = O;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.K = R;
        }
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.b = i;
        this.y = sidePropagation;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        Visibility.R(transitionValues);
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        transitionValues.f3796a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Visibility.R(transitionValues);
        int[] iArr = new int[2];
        transitionValues.b.getLocationOnScreen(iArr);
        transitionValues.f3796a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
