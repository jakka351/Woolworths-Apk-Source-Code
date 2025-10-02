package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public final ImageFilterView.ImageMatrix g;
    public float h;
    public float i;
    public float j;
    public Path k;
    public ViewOutlineProvider l;
    public RectF m;
    public final Drawable[] n;
    public LayerDrawable o;
    public boolean p;
    public Drawable q;
    public Drawable r;
    public float s;
    public float t;
    public float u;
    public float v;

    public ImageFilterButton(Context context) {
        super(context);
        this.g = new ImageFilterView.ImageMatrix();
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.NaN;
        this.n = new Drawable[2];
        this.p = true;
        this.q = null;
        this.r = null;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        a(context, null);
    }

    private void setOverlay(boolean z) {
        this.p = z;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.q = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 4) {
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.p));
                } else if (index == 5) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.s));
                } else if (index == 6) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.t));
                } else if (index == 7) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.v));
                } else if (index == 8) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.u));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.r = drawable;
            Drawable drawable2 = this.q;
            Drawable[] drawableArr = this.n;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.r = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.r = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.r = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.q.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.o = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.h * 255.0f));
            if (!this.p) {
                this.o.getDrawable(0).setAlpha((int) ((1.0f - this.h) * 255.0f));
            }
            super.setImageDrawable(this.o);
        }
    }

    public final void b() {
        if (Float.isNaN(this.s) && Float.isNaN(this.t) && Float.isNaN(this.u) && Float.isNaN(this.v)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.s);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zIsNaN ? 0.0f : this.s;
        float f3 = Float.isNaN(this.t) ? 0.0f : this.t;
        float f4 = Float.isNaN(this.u) ? 1.0f : this.u;
        if (!Float.isNaN(this.v)) {
            f = this.v;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f2) + width) - f6) * 0.5f, ((((height - f7) * f3) + height) - f7) * 0.5f);
        matrix.postRotate(f, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.s) && Float.isNaN(this.t) && Float.isNaN(this.u) && Float.isNaN(this.v)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    public float getContrast() {
        return this.g.f;
    }

    public float getCrossfade() {
        return this.h;
    }

    public float getImagePanX() {
        return this.s;
    }

    public float getImagePanY() {
        return this.t;
    }

    public float getImageRotate() {
        return this.v;
    }

    public float getImageZoom() {
        return this.u;
    }

    public float getRound() {
        return this.j;
    }

    public float getRoundPercent() {
        return this.i;
    }

    public float getSaturation() {
        return this.g.e;
    }

    public float getWarmth() {
        return this.g.g;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        b();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = AppCompatResources.b(i, getContext()).mutate();
        this.q = drawableMutate;
        Drawable drawable = this.r;
        Drawable[] drawableArr = this.n;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.h);
    }

    public void setBrightness(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.g;
        imageMatrix.d = f;
        imageMatrix.a(this);
    }

    public void setContrast(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.g;
        imageMatrix.f = f;
        imageMatrix.a(this);
    }

    public void setCrossfade(float f) {
        this.h = f;
        if (this.n != null) {
            if (!this.p) {
                this.o.getDrawable(0).setAlpha((int) ((1.0f - this.h) * 255.0f));
            }
            this.o.getDrawable(1).setAlpha((int) (this.h * 255.0f));
            super.setImageDrawable(this.o);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.q == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.r = drawableMutate;
        Drawable[] drawableArr = this.n;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.q;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.h);
    }

    public void setImagePanX(float f) {
        this.s = f;
        c();
    }

    public void setImagePanY(float f) {
        this.t = f;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.q == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = AppCompatResources.b(i, getContext()).mutate();
        this.r = drawableMutate;
        Drawable[] drawableArr = this.n;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.q;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.h);
    }

    public void setImageRotate(float f) {
        this.v = f;
        c();
    }

    public void setImageZoom(float f) {
        this.u = f;
        c();
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.j = f;
            float f2 = this.i;
            this.i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.j != f;
        this.j = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.l == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        ImageFilterButton imageFilterButton = ImageFilterButton.this;
                        outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.j);
                    }
                };
                this.l = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.m.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.k.reset();
            Path path = this.k;
            RectF rectF = this.m;
            float f3 = this.j;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z = this.i != f;
        this.i = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.l == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        ImageFilterButton imageFilterButton = ImageFilterButton.this;
                        outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), (Math.min(r3, r4) * imageFilterButton.i) / 2.0f);
                    }
                };
                this.l = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.i) / 2.0f;
            this.m.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.k.reset();
            this.k.addRoundRect(this.m, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.g;
        imageMatrix.e = f;
        imageMatrix.a(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.ImageMatrix imageMatrix = this.g;
        imageMatrix.g = f;
        imageMatrix.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ImageFilterView.ImageMatrix();
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.NaN;
        this.n = new Drawable[2];
        this.p = true;
        this.q = null;
        this.r = null;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new ImageFilterView.ImageMatrix();
        this.h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.j = Float.NaN;
        this.n = new Drawable[2];
        this.p = true;
        this.q = null;
        this.r = null;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        a(context, attributeSet);
    }
}
