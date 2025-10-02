package com.scandit.datacapture.core;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class L6 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f18343a;
    private final float b;
    private final RectF c;
    private final Bitmap d;
    private final RectF e;
    private final Paint f;

    public L6(Bitmap bitmap, float f, int i) {
        Intrinsics.h(bitmap, "bitmap");
        this.f18343a = bitmap;
        this.b = f;
        this.c = new RectF(f, f, bitmap.getWidth(), bitmap.getHeight());
        this.d = a(bitmap, f, i);
        this.e = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r4.getWidth(), r4.getHeight());
        this.f = new Paint(3);
    }

    private static Bitmap a(Bitmap bitmap, float f, int i) {
        int i2 = (int) (2 * f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + i2, bitmap.getHeight() + i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setColor(i);
        paint.setMaskFilter(new BlurMaskFilter(f, BlurMaskFilter.Blur.OUTER));
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
        canvas.drawBitmap(bitmapExtractAlpha, f, f, paint);
        bitmapExtractAlpha.recycle();
        Intrinsics.g(bitmapCreateBitmap, "createBitmap(\n        bi…    alpha.recycle()\n    }");
        return bitmapCreateBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.h(canvas, "canvas");
        canvas.drawBitmap(this.d, (Rect) null, this.e, this.f);
        canvas.drawBitmap(this.f18343a, (Rect) null, this.c, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        float width = this.d.getWidth() / bounds.width();
        float height = this.d.getHeight() / bounds.height();
        this.e.set(bounds);
        RectF rectF = this.c;
        rectF.set(bounds);
        float f = this.b;
        rectF.inset(width * f, f * height);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f.getAlpha() != i) {
            this.f.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
