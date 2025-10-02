package androidx.appcompat.graphics.drawable;

import YU.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final float m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f122a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;
    public final float k;
    public final int l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f122a = paint;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R.styleable.o, com.woolworths.R.attr.drawerArrowStyle, 2132082924);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, BitmapDescriptorFactory.HUE_RED);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.k = (float) (Math.cos(m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, BitmapDescriptorFactory.HUE_RED));
        if (fRound != this.e) {
            this.e = fRound;
            invalidateSelf();
        }
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, BitmapDescriptorFactory.HUE_RED));
        this.b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED));
        this.d = typedArrayObtainStyledAttributes.getDimension(1, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = false;
        int i = this.l;
        if (i != 0 && (i == 1 || (i == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z = true;
        }
        float f = this.b;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.j;
        float f3 = this.c;
        float fA = a(f3, fSqrt, f2);
        float fA2 = a(f3, this.d, this.j);
        float fRound = Math.round(a(BitmapDescriptorFactory.HUE_RED, this.k, this.j));
        float fA3 = a(BitmapDescriptorFactory.HUE_RED, m, this.j);
        float fA4 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d = fA;
        double d2 = fA3;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.g;
        path.rewind();
        float f4 = this.e;
        Paint paint = this.f122a;
        float fA5 = a(f4 + paint.getStrokeWidth(), -this.k, this.j);
        float f5 = (-fA2) / 2.0f;
        path.moveTo(f5 + fRound, BitmapDescriptorFactory.HUE_RED);
        path.rLineTo(fA2 - (fRound * 2.0f), BitmapDescriptorFactory.HUE_RED);
        path.moveTo(f5, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.e + ((((int) (fHeight - (r7 * 2.0f))) / 4) * 2));
        if (this.f) {
            canvas.rotate(fA4 * (this.i ^ z ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f122a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f122a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }
}
