package au.com.woolworths.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/views/LoadingPlaceholderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LoadingPlaceholderView extends View {
    public static final /* synthetic */ int i = 0;
    public final float d;
    public final Paint e;
    public final Paint f;
    public float g;
    public int h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/views/LoadingPlaceholderView$Companion;", "", "", "ANIMATION_DURATION", "J", "shared-ui-views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingPlaceholderView(@NotNull Context context, @NotNull AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        Intrinsics.h(attributeSet, "attributeSet");
        float dimension = context.getResources().getDimension(R.dimen.loading_item_placeholder_radius);
        final int i2 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, au.com.woolworths.android.onesite.base.R.styleable.c, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getDimension(0, dimension);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.animated_loading_view_background));
        this.e = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.animated_loading_view_loader));
        this.f = paint2;
        this.g = -1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-0.5f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        final int i3 = 1;
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: au.com.woolworths.views.a
            public final /* synthetic */ LoadingPlaceholderView e;

            {
                this.e = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i4 = i2;
                LoadingPlaceholderView loadingPlaceholderView = this.e;
                switch (i4) {
                    case 0:
                        int i5 = LoadingPlaceholderView.i;
                        Intrinsics.h(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        loadingPlaceholderView.g = ((Float) animatedValue).floatValue();
                        loadingPlaceholderView.invalidate();
                        break;
                    default:
                        int i6 = LoadingPlaceholderView.i;
                        Intrinsics.h(it, "it");
                        Object animatedValue2 = it.getAnimatedValue();
                        Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        loadingPlaceholderView.h = ((Integer) animatedValue2).intValue();
                        loadingPlaceholderView.invalidate();
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, paint2.getAlpha(), 0);
        valueAnimatorOfInt.setDuration(1500L);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: au.com.woolworths.views.a
            public final /* synthetic */ LoadingPlaceholderView e;

            {
                this.e = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                int i4 = i3;
                LoadingPlaceholderView loadingPlaceholderView = this.e;
                switch (i4) {
                    case 0:
                        int i5 = LoadingPlaceholderView.i;
                        Intrinsics.h(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        loadingPlaceholderView.g = ((Float) animatedValue).floatValue();
                        loadingPlaceholderView.invalidate();
                        break;
                    default:
                        int i6 = LoadingPlaceholderView.i;
                        Intrinsics.h(it, "it");
                        Object animatedValue2 = it.getAnimatedValue();
                        Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        loadingPlaceholderView.h = ((Integer) animatedValue2).intValue();
                        loadingPlaceholderView.invalidate();
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.g * measuredWidth;
        float f2 = this.d;
        canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, measuredWidth, measuredHeight, f2, f2, this.e);
        float f3 = f + BitmapDescriptorFactory.HUE_RED;
        float f4 = f + (measuredWidth / 2);
        float f5 = f3 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f3;
        float f6 = f4 > measuredWidth ? measuredWidth : f4;
        int i2 = this.h;
        Paint paint = this.f;
        paint.setAlpha(i2);
        float f7 = this.d;
        canvas.drawRoundRect(f5, BitmapDescriptorFactory.HUE_RED, f6, measuredHeight, f7, f7, paint);
    }
}
