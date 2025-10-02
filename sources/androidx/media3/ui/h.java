package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = playerControlViewLayoutManager.b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = playerControlViewLayoutManager.c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                    break;
                }
                break;
            case 1:
                PlayerControlViewLayoutManager playerControlViewLayoutManager2 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = playerControlViewLayoutManager2.b;
                if (view2 != null) {
                    view2.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager2.c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup4 = playerControlViewLayoutManager2.e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue2);
                    break;
                }
                break;
            case 2:
                PlayerControlViewLayoutManager playerControlViewLayoutManager3 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager3.getClass();
                playerControlViewLayoutManager3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                PlayerControlViewLayoutManager playerControlViewLayoutManager4 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager4.getClass();
                playerControlViewLayoutManager4.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i2 = DefaultTimeBar.S;
                defaultTimeBar.getClass();
                defaultTimeBar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.d);
                break;
        }
    }
}
