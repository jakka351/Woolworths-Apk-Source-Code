package io.github.douglasjunior.androidSimpleTooltip;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@SuppressLint
/* loaded from: classes7.dex */
public class OverlayView extends View {
    public View d;
    public Bitmap e;
    public boolean f;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f || (bitmap = this.e) == null || bitmap.isRecycled()) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Bitmap bitmap2 = this.e;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.e.recycle();
                }
                this.e = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.e);
                RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, measuredWidth, measuredHeight);
                Paint paint = new Paint(1);
                paint.setColor(0);
                paint.setAntiAlias(true);
                paint.setAlpha(getResources().getInteger(com.woolworths.R.integer.simpletooltip_overlay_alpha));
                canvas2.drawRect(rectF, paint);
                paint.setColor(0);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                RectF rectFA = SimpleTooltipUtils.a(this.d);
                RectF rectFA2 = SimpleTooltipUtils.a(this);
                float f = rectFA.left - rectFA2.left;
                float f2 = rectFA.top - rectFA2.top;
                canvas2.drawOval(new RectF(f - BitmapDescriptorFactory.HUE_RED, f2 - BitmapDescriptorFactory.HUE_RED, f + this.d.getMeasuredWidth() + BitmapDescriptorFactory.HUE_RED, f2 + this.d.getMeasuredHeight() + BitmapDescriptorFactory.HUE_RED), paint);
                this.f = false;
            }
        }
        Bitmap bitmap3 = this.e;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    public View getAnchorView() {
        return this.d;
    }

    @Override // android.view.View
    public final boolean isInEditMode() {
        return true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f = true;
    }

    public void setAnchorView(View view) {
        this.d = view;
        invalidate();
    }
}
