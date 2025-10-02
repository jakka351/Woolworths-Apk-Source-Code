package com.woolworths.scanlibrary.util.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class OverlayWithHoleImageView extends AppCompatImageView {
    public RectF g;
    public Rect h;
    public final Paint i;
    public final PorterDuffXfermode j;

    public OverlayWithHoleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Paint(1);
        this.j = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) throws Resources.NotFoundException {
        super.onDraw(canvas);
        if (this.g == null && this.h == null) {
            return;
        }
        int color = getResources().getColor(R.color.background_semi_transparent);
        Paint paint = this.i;
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPaint(paint);
        paint.setXfermode(this.j);
        RectF rectF = this.g;
        if (rectF != null) {
            canvas.drawRect(rectF, paint);
        } else {
            canvas.drawRect(this.h, paint);
        }
    }

    public void setRect(Rect rect) {
        this.h = rect;
        postInvalidate();
    }

    public void setRectF(RectF rectF) {
        this.g = rectF;
        postInvalidate();
    }
}
