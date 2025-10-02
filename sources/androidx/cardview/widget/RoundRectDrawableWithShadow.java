package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
class RoundRectDrawableWithShadow extends Drawable {
    public static final double b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    public boolean f668a;

    public interface RoundRectHelper {
    }

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - b) * f2) + f);
    }

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - b) * f2) + (f * 1.5f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f668a) {
            int i = getBounds().left;
            throw null;
        }
        canvas.translate(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED / 2.0f);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false));
        int iCeil2 = (int) Math.ceil(a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f668a = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }
}
