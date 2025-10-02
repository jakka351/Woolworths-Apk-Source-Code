package au.com.woolworths.shop.addtolist.utils;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import au.com.woolworths.views.unlockslider.UnlockSlider;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.scandit.datacapture.core.U2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.d) {
            case 0:
                ImageView imageView = (ImageView) this.e;
                Intrinsics.h(animation, "animation");
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                imageView.setBackgroundTintList(ColorStateList.valueOf(((Integer) animatedValue).intValue()));
                break;
            case 1:
                EditText editText = (EditText) this.e;
                Intrinsics.h(animation, "animator");
                Object animatedValue2 = animation.getAnimatedValue();
                Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                editText.setTextColor(((Integer) animatedValue2).intValue());
                break;
            case 2:
                UnlockSlider.e((UnlockSlider) this.e, animation);
                break;
            case 3:
                ((ClippableRoundedCornerLayout) this.e).a(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom(), ((Float) animation.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((DrawerLayout) this.e).setScrimColor(ColorUtils.e(-1728053248, AnimationUtils.c(animation.getAnimatedFraction(), DrawerLayoutUtils.f14615a, 0)));
                break;
            case 5:
                U2.a((View) this.e, animation);
                break;
            default:
                me.oriient.ui.contentview.utils.a.a((me.oriient.ui.contentview.utils.a) this.e, animation);
                break;
        }
    }
}
