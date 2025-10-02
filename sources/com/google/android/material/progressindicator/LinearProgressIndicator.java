package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.woolworths.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final /* synthetic */ int p = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void b(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (baseProgressIndicatorSpec != null && ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.d).h;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.d).i;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.d).k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).i != 1) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).i != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).i != 3)) {
                z2 = false;
            }
        }
        linearProgressIndicatorSpec.j = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).h = i;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).a();
        if (i == 0) {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) baseProgressIndicatorSpec);
            indeterminateDrawable.p = linearIndeterminateContiguousAnimatorDelegate;
            linearIndeterminateContiguousAnimatorDelegate.f14621a = indeterminateDrawable;
        } else {
            IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) baseProgressIndicatorSpec);
            indeterminateDrawable2.p = linearIndeterminateDisjointAnimatorDelegate;
            linearIndeterminateDisjointAnimatorDelegate.f14621a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.d).a();
    }

    public void setIndicatorDirection(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).i = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        linearProgressIndicatorSpec.j = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.d).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.d;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).k != i) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).k = Math.min(i, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).f14618a);
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).a();
            invalidate();
        }
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        IndeterminateAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate;
        super(context, attributeSet, i, 2132084113);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.d;
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate(linearProgressIndicatorSpec);
        linearDrawingDelegate.b = 300.0f;
        Context context2 = getContext();
        if (linearProgressIndicatorSpec.h == 0) {
            linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec);
        } else {
            linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new IndeterminateDrawable(context2, linearProgressIndicatorSpec, linearDrawingDelegate, linearIndeterminateDisjointAnimatorDelegate));
        setProgressDrawable(new DeterminateDrawable(getContext(), linearProgressIndicatorSpec, linearDrawingDelegate));
    }
}
