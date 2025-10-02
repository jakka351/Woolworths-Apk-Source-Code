package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final /* synthetic */ int p = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.d).j;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.d).i;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.d).h;
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.d).j = i;
        invalidate();
    }

    public void setIndicatorInset(@Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).i != i) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).h != iMax) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).h = iMax;
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.d).a();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, 2132084101);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.d;
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate(circularProgressIndicatorSpec);
        Context context2 = getContext();
        IndeterminateDrawable indeterminateDrawable = new IndeterminateDrawable(context2, circularProgressIndicatorSpec, circularDrawingDelegate, new CircularIndeterminateAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.q = VectorDrawableCompat.a(R.drawable.indeterminate_static, null, context2.getResources());
        setIndeterminateDrawable(indeterminateDrawable);
        setProgressDrawable(new DeterminateDrawable(getContext(), circularProgressIndicatorSpec, circularDrawingDelegate));
    }
}
