package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

@RestrictTo
/* loaded from: classes6.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final /* synthetic */ int S = 0;
    public CharSequence B;
    public final Context C;
    public final Paint.FontMetrics D;
    public final TextDrawableHelper E;
    public final View.OnLayoutChangeListener F;
    public final Rect G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public float Q;
    public float R;

    public TooltipDrawable(Context context, int i) {
        super(context, null, 0, i);
        this.D = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.E = textDrawableHelper;
        this.F = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = TooltipDrawable.S;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                TooltipDrawable tooltipDrawable = TooltipDrawable.this;
                tooltipDrawable.N = i11;
                view.getWindowVisibleDisplayFrame(tooltipDrawable.G);
            }
        };
        this.G = new Rect();
        this.O = 1.0f;
        this.P = 1.0f;
        this.Q = 0.5f;
        this.R = 1.0f;
        this.C = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = textDrawableHelper.f14604a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fX = x();
        float f = (float) (-((Math.sqrt(2.0d) * this.M) - this.M));
        canvas.scale(this.O, this.P, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.Q) + getBounds().top);
        canvas.translate(fX, f);
        super.draw(canvas);
        if (this.B == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            TextDrawableHelper textDrawableHelper = this.E;
            TextPaint textPaint = textDrawableHelper.f14604a;
            Paint.FontMetrics fontMetrics = this.D;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (textDrawableHelper.g != null) {
                textPaint.drawableState = getState();
                textDrawableHelper.g.e(this.C, textDrawableHelper.f14604a, textDrawableHelper.b);
                textPaint.setAlpha((int) (this.R * 255.0f));
            }
            CharSequence charSequence = this.B;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.E.f14604a.getTextSize(), this.J);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.H * 2;
        CharSequence charSequence = this.B;
        return (int) Math.max(f + (charSequence == null ? BitmapDescriptorFactory.HUE_RED : this.E.a(charSequence.toString())), this.I);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.L) {
            ShapeAppearanceModel.Builder builderG = this.d.f14634a.g();
            builderG.k = y();
            setShapeAppearanceModel(builderG.a());
        }
    }

    public final float x() {
        int i;
        Rect rect = this.G;
        if (((rect.right - getBounds().right) - this.N) - this.K < 0) {
            i = ((rect.right - getBounds().right) - this.N) - this.K;
        } else {
            if (((rect.left - getBounds().left) - this.N) + this.K <= 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            i = ((rect.left - getBounds().left) - this.N) + this.K;
        }
        return i;
    }

    public final OffsetEdgeTreatment y() {
        float f = -x();
        float fWidth = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.M))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.M), Math.min(Math.max(f, -fWidth), fWidth));
    }
}
