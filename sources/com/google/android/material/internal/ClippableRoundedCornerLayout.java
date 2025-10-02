package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    public Path d;
    public float e;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    public final void a(float f, float f2, float f3, float f4, float f5) {
        RectF rectF = new RectF(f, f2, f3, f4);
        if (this.d == null) {
            this.d = new Path();
        }
        this.e = f5;
        this.d.reset();
        this.d.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        this.d.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.d);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.e;
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
