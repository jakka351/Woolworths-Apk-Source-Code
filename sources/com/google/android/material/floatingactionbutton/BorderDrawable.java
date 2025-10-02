package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

@RestrictTo
/* loaded from: classes6.dex */
class BorderDrawable extends Drawable {
    public final Paint b;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public ShapeAppearanceModel o;
    public ColorStateList p;

    /* renamed from: a, reason: collision with root package name */
    public final ShapeAppearancePathProvider f14579a = ShapeAppearancePathProvider.b();
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final BorderState g = new BorderState();
    public boolean n = true;

    public class BorderState extends Drawable.ConstantState {
        public BorderState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.n;
        Rect rect = this.d;
        Paint paint = this.b;
        if (z) {
            copyBounds(rect);
            float fHeight = this.h / rect.height();
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, rect.top, BitmapDescriptorFactory.HUE_RED, rect.bottom, new int[]{ColorUtils.c(this.i, this.m), ColorUtils.c(this.j, this.m), ColorUtils.c(ColorUtils.e(this.j, 0), this.m), ColorUtils.c(ColorUtils.e(this.l, 0), this.m), ColorUtils.c(this.l, this.m), ColorUtils.c(this.k, this.m)}, new float[]{BitmapDescriptorFactory.HUE_RED, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        CornerSize cornerSize = this.o.e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f;
        rectF2.set(bounds);
        float fMin = Math.min(cornerSize.a(rectF2), rectF.width() / 2.0f);
        ShapeAppearanceModel shapeAppearanceModel = this.o;
        rectF2.set(getBounds());
        if (shapeAppearanceModel.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > BitmapDescriptorFactory.HUE_RED ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ShapeAppearanceModel shapeAppearanceModel = this.o;
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        if (shapeAppearanceModel.f(rectF)) {
            CornerSize cornerSize = this.o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cornerSize.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.e;
        rectF2.set(rect);
        ShapeAppearanceModel shapeAppearanceModel2 = this.o;
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.f14579a;
        Path path = this.c;
        shapeAppearancePathProvider.a(shapeAppearanceModel2, 1.0f, rectF2, null, path);
        DrawableUtils.e(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        ShapeAppearanceModel shapeAppearanceModel = this.o;
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        if (!shapeAppearanceModel.f(rectF)) {
            return true;
        }
        int iRound = Math.round(this.h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
