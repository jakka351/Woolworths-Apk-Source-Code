package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    public final AppCompatSeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public AppCompatSeekBarHelper(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        AppCompatSeekBar appCompatSeekBar = this.d;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = R.styleable.h;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        ViewCompat.z(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, tintTypedArrayF.b, i);
        Drawable drawableC = tintTypedArrayF.c(0);
        if (drawableC != null) {
            appCompatSeekBar.setThumb(drawableC);
        }
        Drawable drawableB = tintTypedArrayF.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(appCompatSeekBar);
            drawableB.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(appCompatSeekBar.getDrawableState());
            }
            c();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = DrawableUtils.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = tintTypedArrayF.a(2);
            this.h = true;
        }
        tintTypedArrayF.g();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.e = drawableMutate;
                if (this.h) {
                    drawableMutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
