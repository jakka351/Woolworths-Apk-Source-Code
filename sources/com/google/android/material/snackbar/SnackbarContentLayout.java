package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.woolworths.R;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    public TextView d;
    public Button e;
    public final TimeInterpolator f;
    public int g;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void a(int i, int i2) {
        this.d.setAlpha(BitmapDescriptorFactory.HUE_RED);
        long j = i2;
        ViewPropertyAnimator duration = this.d.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.f;
        long j2 = i;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.e.getVisibility() == 0) {
            this.e.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.e.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public final void b(int i) {
        this.d.setAlpha(1.0f);
        long j = i;
        ViewPropertyAnimator duration = this.d.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j);
        TimeInterpolator timeInterpolator = this.f;
        long j2 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.e.getVisibility() == 0) {
            this.e.setAlpha(1.0f);
            this.e.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    public final boolean c(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.d.getPaddingTop() == i2 && this.d.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.d;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.e;
    }

    public TextView getMessageView() {
        return this.d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (TextView) findViewById(R.id.snackbar_text);
        this.e = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.d.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.g <= 0 || this.e.getMeasuredWidth() <= this.g) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.g = i;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = MotionUtils.d(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.b);
    }
}
