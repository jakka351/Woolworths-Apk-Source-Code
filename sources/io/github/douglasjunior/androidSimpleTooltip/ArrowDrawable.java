package io.github.douglasjunior.androidSimpleTooltip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes7.dex */
public class ArrowDrawable extends ColorDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f23914a;
    public Path b;
    public final int c;

    public ArrowDrawable(int i, int i2) {
        Paint paint = new Paint(1);
        this.f23914a = paint;
        paint.setColor(i);
        this.c = i2;
    }

    public final synchronized void a(Rect rect) {
        try {
            Path path = new Path();
            this.b = path;
            int i = this.c;
            if (i == 0) {
                path.moveTo(rect.width(), rect.height());
                this.b.lineTo(BitmapDescriptorFactory.HUE_RED, rect.height() / 2);
                this.b.lineTo(rect.width(), BitmapDescriptorFactory.HUE_RED);
                this.b.lineTo(rect.width(), rect.height());
            } else if (i == 1) {
                path.moveTo(BitmapDescriptorFactory.HUE_RED, rect.height());
                this.b.lineTo(rect.width() / 2, BitmapDescriptorFactory.HUE_RED);
                this.b.lineTo(rect.width(), rect.height());
                this.b.lineTo(BitmapDescriptorFactory.HUE_RED, rect.height());
            } else if (i == 2) {
                path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.b.lineTo(rect.width(), rect.height() / 2);
                this.b.lineTo(BitmapDescriptorFactory.HUE_RED, rect.height());
                this.b.lineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else if (i == 3) {
                path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                this.b.lineTo(rect.width() / 2, rect.height());
                this.b.lineTo(rect.width(), BitmapDescriptorFactory.HUE_RED);
                this.b.lineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.b.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawColor(0);
        if (this.b == null) {
            a(getBounds());
        }
        canvas.drawPath(this.b, this.f23914a);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.f23914a;
        if (paint.getColorFilter() != null) {
            return -3;
        }
        int color = paint.getColor() >>> 24;
        if (color != 0) {
            return color != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f23914a.setAlpha(i);
    }

    @Override // android.graphics.drawable.ColorDrawable
    public final void setColor(int i) {
        this.f23914a.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23914a.setColorFilter(colorFilter);
    }
}
