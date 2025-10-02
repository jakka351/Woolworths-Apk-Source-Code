package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/util/widget/CartCountDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartCountDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f21377a;
    public final Paint b;
    public final Rect c;
    public String d;
    public boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public CartCountDrawable(@NotNull Context context) throws Resources.NotFoundException {
        Intrinsics.h(context, "context");
        this.c = new Rect();
        this.d = "";
        this.f = context.getResources().getDimensionPixelSize(R.dimen.sng_count_drawable_offset_x);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.sng_count_drawable_offset_y);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.sng_count_drawable_offset_radius);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.sng_count_drawable_offset_radius_large);
        float dimension = context.getResources().getDimension(R.dimen.sng_cart_count_text_size);
        Paint paint = new Paint();
        this.f21377a = paint;
        paint.setColor(context.getApplicationContext().getColor(R.color.sng_color_primary));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        paint2.setTypeface(Typeface.DEFAULT);
        paint2.setTextSize(dimension);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        if (this.e) {
            Rect bounds = getBounds();
            Intrinsics.g(bounds, "getBounds(...)");
            float f = bounds.right - bounds.left;
            float f2 = 2;
            float fMax = (Math.max(f, bounds.bottom - bounds.top) / f2) / f2;
            float f3 = ((f - fMax) - 1.0f) + this.f;
            float f4 = fMax - this.g;
            int length = this.d.length();
            Paint paint = this.f21377a;
            if (length <= 2) {
                canvas.drawCircle(f3, f4, (int) (fMax + this.h), paint);
            } else {
                canvas.drawCircle(f3, f4, (int) (fMax + this.i), paint);
            }
            String str = this.d;
            int length2 = str.length();
            Paint paint2 = this.b;
            paint2.getTextBounds(str, 0, length2, this.c);
            float f5 = ((r6.bottom - r6.top) / 2.0f) + f4;
            if (this.d.length() > 3) {
                canvas.drawText("999+", f3, f5, paint2);
            } else {
                canvas.drawText(this.d, f3, f5, paint2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
