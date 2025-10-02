package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* loaded from: classes6.dex */
class CutoutDrawable extends MaterialShapeDrawable {
    public static final /* synthetic */ int C = 0;
    public CutoutDrawableState B;

    public static class ImplApi14 extends CutoutDrawable {
        public Paint D;
        public int E;

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Canvas canvas2;
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                View view = (View) callback;
                if (view.getLayerType() != 2) {
                    view.setLayerType(2, null);
                }
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                this.E = canvas2.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight(), null);
            }
            super.draw(canvas2);
            if (getCallback() instanceof View) {
                return;
            }
            canvas2.restoreToCount(this.E);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void f(Canvas canvas) {
            super.f(canvas);
            RectF rectF = this.B.s;
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.D.setColor(-1);
                this.D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            canvas.drawRect(rectF, this.D);
        }
    }

    @TargetApi
    public static class ImplApi18 extends CutoutDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void f(Canvas canvas) {
            if (this.B.s.isEmpty()) {
                super.f(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.B.s);
            super.f(canvas);
            canvas.restore();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.B = new CutoutDrawableState(this.B);
        return this;
    }

    public final void x(float f, float f2, float f3, float f4) {
        RectF rectF = this.B.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public static final class CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {
        public final RectF s;

        public CutoutDrawableState(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
            super(shapeAppearanceModel);
            this.s = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            int i = CutoutDrawable.C;
            ImplApi18 implApi18 = new ImplApi18(this);
            implApi18.B = this;
            implApi18.invalidateSelf();
            return implApi18;
        }

        public CutoutDrawableState(CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.s = cutoutDrawableState.s;
        }
    }
}
