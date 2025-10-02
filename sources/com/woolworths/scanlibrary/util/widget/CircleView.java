package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/CircleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "circleColor", "", "setColor", "(I)V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CircleView extends View {
    public int d;
    public final float e;
    public final Paint f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.h(context, "context");
        Intrinsics.h(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.b, 0, 0);
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.d = typedArrayObtainStyledAttributes.getColor(0, context.getColor(com.woolworths.R.color.sng_color_primary));
            this.e = typedArrayObtainStyledAttributes.getDimension(1, getResources().getDimension(com.woolworths.R.dimen.sng_default_circle_view_size));
            this.f = new Paint();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        Paint paint = this.f;
        Intrinsics.e(paint);
        paint.setColor(this.d);
        int width = getWidth();
        float height = getHeight() / 2;
        Intrinsics.e(paint);
        canvas.drawCircle(width / 2, height, this.e, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.e;
        setMeasuredDimension(((int) f) * 2, ((int) f) * 2);
    }

    public final void setColor(int circleColor) {
        this.d = getContext().getColor(circleColor);
        requestLayout();
    }
}
