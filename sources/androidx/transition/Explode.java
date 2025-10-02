package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class Explode extends Visibility {
    public static final DecelerateInterpolator L = new DecelerateInterpolator();
    public static final AccelerateInterpolator M = new AccelerateInterpolator();
    public final int[] K;

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K = new int[2];
        this.y = new CircularPropagation();
    }

    @Override // androidx.transition.Visibility
    public final Animator T(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues2.f3796a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        W(viewGroup, rect, this.K);
        return TranslationAnimationCreator.a(view, transitionValues2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, L, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator U(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        float f2;
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.f3796a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.b.getTag(com.woolworths.R.id.transition_position);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        W(viewGroup, rect, this.K);
        return TranslationAnimationCreator.a(view, transitionValues, i, i2, translationX, translationY, f + r0[0], f2 + r0[1], M, this);
    }

    public final void W(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.K;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        Transition.EpicenterCallback epicenterCallback = this.z;
        Rect rectA = epicenterCallback == null ? null : epicenterCallback.a();
        if (rectA == null) {
            iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
            iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        } else {
            iCenterX = rectA.centerX();
            iCenterY = rectA.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == BitmapDescriptorFactory.HUE_RED && fCenterY == BitmapDescriptorFactory.HUE_RED) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i3 = iCenterX - i;
        int i4 = iCenterY - i2;
        float fMax = Math.max(i3, viewGroup.getWidth() - i3);
        float fMax2 = Math.max(i4, viewGroup.getHeight() - i4);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void X(TransitionValues transitionValues) {
        View view = transitionValues.b;
        int[] iArr = this.K;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        transitionValues.f3796a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        Visibility.R(transitionValues);
        X(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        Visibility.R(transitionValues);
        X(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
