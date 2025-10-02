package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class ImageFilterView extends AppCompatImageView {
    public final ImageMatrix g;
    public boolean h;
    public Drawable i;
    public Drawable j;
    public float k;
    public float l;
    public float m;
    public Path n;
    public ViewOutlineProvider o;
    public RectF p;
    public final Drawable[] q;
    public LayerDrawable r;
    public float s;
    public float t;
    public float u;
    public float v;

    public static class ImageMatrix {

        /* renamed from: a, reason: collision with root package name */
        public final float[] f2355a = new float[20];
        public final ColorMatrix b = new ColorMatrix();
        public final ColorMatrix c = new ColorMatrix();
        public float d = 1.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = 1.0f;

        public final void a(ImageView imageView) {
            boolean z;
            float f;
            char c;
            char c2;
            char c3;
            char c4;
            char c5;
            char c6;
            float f2;
            char c7;
            float fLog;
            float fPow;
            char c8;
            float f3;
            float fLog2;
            ColorMatrix colorMatrix = this.b;
            colorMatrix.reset();
            float f4 = this.e;
            float[] fArr = this.f2355a;
            boolean z2 = true;
            if (f4 != 1.0f) {
                float f5 = 1.0f - f4;
                float f6 = 0.2999f * f5;
                float f7 = 0.587f * f5;
                float f8 = f5 * 0.114f;
                fArr[0] = f6 + f4;
                fArr[1] = f7;
                fArr[2] = f8;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f6;
                fArr[6] = f7 + f4;
                fArr[7] = f8;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f6;
                fArr[11] = f7;
                fArr[12] = f8 + f4;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix.set(fArr);
                z = true;
            } else {
                z = false;
            }
            float f9 = this.f;
            ColorMatrix colorMatrix2 = this.c;
            if (f9 != 1.0f) {
                colorMatrix2.setScale(f9, f9, f9, 1.0f);
                colorMatrix.postConcat(colorMatrix2);
                z = true;
            }
            float f10 = this.g;
            if (f10 != 1.0f) {
                if (f10 <= BitmapDescriptorFactory.HUE_RED) {
                    f10 = 0.01f;
                }
                float f11 = (5000.0f / f10) / 100.0f;
                f = 1.0f;
                if (f11 > 66.0f) {
                    f2 = 66.0f;
                    c = 16;
                    c2 = 15;
                    double d = f11 - 60.0f;
                    c3 = 14;
                    c4 = '\r';
                    fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                    c7 = '\f';
                    c6 = 11;
                    fLog = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
                } else {
                    f2 = 66.0f;
                    c = 16;
                    c2 = 15;
                    c3 = 14;
                    c4 = '\r';
                    c7 = '\f';
                    c6 = 11;
                    fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                    fPow = 255.0f;
                }
                if (f11 >= f2) {
                    c8 = c7;
                    f3 = 305.0448f;
                    fLog2 = 255.0f;
                } else if (f11 > 19.0f) {
                    c8 = c7;
                    f3 = 305.0448f;
                    fLog2 = (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f;
                } else {
                    c8 = c7;
                    f3 = 305.0448f;
                    fLog2 = 0.0f;
                }
                float fMin = Math.min(255.0f, Math.max(fPow, BitmapDescriptorFactory.HUE_RED));
                float fMin2 = Math.min(255.0f, Math.max(fLog, BitmapDescriptorFactory.HUE_RED));
                float fMin3 = Math.min(255.0f, Math.max(fLog2, BitmapDescriptorFactory.HUE_RED));
                float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
                c5 = c8;
                float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - f3;
                float fMin4 = Math.min(255.0f, Math.max(255.0f, BitmapDescriptorFactory.HUE_RED));
                float fMin5 = Math.min(255.0f, Math.max(fLog3, BitmapDescriptorFactory.HUE_RED));
                float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, BitmapDescriptorFactory.HUE_RED));
                fArr[0] = fMin / fMin4;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = fMin2 / fMin5;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[c6] = 0.0f;
                fArr[c5] = fMin6;
                fArr[c4] = 0.0f;
                fArr[c3] = 0.0f;
                fArr[c2] = 0.0f;
                fArr[c] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
                z = true;
            } else {
                f = 1.0f;
                c = 16;
                c2 = 15;
                c3 = 14;
                c4 = '\r';
                c5 = '\f';
                c6 = 11;
            }
            float f12 = this.d;
            if (f12 != f) {
                fArr[0] = f12;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f12;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[c6] = 0.0f;
                fArr[c5] = f12;
                fArr[c4] = 0.0f;
                fArr[c3] = 0.0f;
                fArr[c2] = 0.0f;
                fArr[c] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.g = new ImageMatrix();
        this.h = true;
        this.i = null;
        this.j = null;
        this.k = BitmapDescriptorFactory.HUE_RED;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.m = Float.NaN;
        this.q = new Drawable[2];
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
    }

    private void setOverlay(boolean z) {
        this.h = z;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.i = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 4) {
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == 13) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 12) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 2) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == 9) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.h));
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
            this.j = drawable;
            Drawable drawable2 = this.i;
            Drawable[] drawableArr = this.q;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.j = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.j = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.j = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.i.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.r = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.k * 255.0f));
            if (!this.h) {
                this.r.getDrawable(0).setAlpha((int) ((1.0f - this.k) * 255.0f));
            }
            super.setImageDrawable(this.r);
        }
    }

    public final void d() {
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

    public final void e() {
        if (Float.isNaN(this.s) && Float.isNaN(this.t) && Float.isNaN(this.u) && Float.isNaN(this.v)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getBrightness() {
        return this.g.d;
    }

    public float getContrast() {
        return this.g.f;
    }

    public float getCrossfade() {
        return this.k;
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
        return this.m;
    }

    public float getRoundPercent() {
        return this.l;
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
        d();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.i = drawableMutate;
        Drawable drawable2 = this.j;
        Drawable[] drawableArr = this.q;
        drawableArr[0] = drawable2;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.k);
    }

    public void setAltImageResource(int i) {
        Drawable drawableB = AppCompatResources.b(i, getContext());
        this.i = drawableB;
        setAltImageDrawable(drawableB);
    }

    public void setBrightness(float f) {
        ImageMatrix imageMatrix = this.g;
        imageMatrix.d = f;
        imageMatrix.a(this);
    }

    public void setContrast(float f) {
        ImageMatrix imageMatrix = this.g;
        imageMatrix.f = f;
        imageMatrix.a(this);
    }

    public void setCrossfade(float f) {
        this.k = f;
        if (this.q != null) {
            if (!this.h) {
                this.r.getDrawable(0).setAlpha((int) ((1.0f - this.k) * 255.0f));
            }
            this.r.getDrawable(1).setAlpha((int) (this.k * 255.0f));
            super.setImageDrawable(this.r);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.i == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.j = drawableMutate;
        Drawable[] drawableArr = this.q;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.i;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.k);
    }

    public void setImagePanX(float f) {
        this.s = f;
        e();
    }

    public void setImagePanY(float f) {
        this.t = f;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.i == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = AppCompatResources.b(i, getContext()).mutate();
        this.j = drawableMutate;
        Drawable[] drawableArr = this.q;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.i;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.k);
    }

    public void setImageRotate(float f) {
        this.v = f;
        e();
    }

    public void setImageZoom(float f) {
        this.u = f;
        e();
    }

    @RequiresApi
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.m = f;
            float f2 = this.l;
            this.l = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.m != f;
        this.m = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.n == null) {
                this.n = new Path();
            }
            if (this.p == null) {
                this.p = new RectF();
            }
            if (this.o == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        ImageFilterView imageFilterView = ImageFilterView.this;
                        outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.m);
                    }
                };
                this.o = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.p.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.n.reset();
            Path path = this.n;
            RectF rectF = this.p;
            float f3 = this.m;
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
        boolean z = this.l != f;
        this.l = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.n == null) {
                this.n = new Path();
            }
            if (this.p == null) {
                this.p = new RectF();
            }
            if (this.o == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        ImageFilterView imageFilterView = ImageFilterView.this;
                        outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), (Math.min(r3, r4) * imageFilterView.l) / 2.0f);
                    }
                };
                this.o = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.l) / 2.0f;
            this.p.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.n.reset();
            this.n.addRoundRect(this.p, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageMatrix imageMatrix = this.g;
        imageMatrix.e = f;
        imageMatrix.a(this);
    }

    public void setWarmth(float f) {
        ImageMatrix imageMatrix = this.g;
        imageMatrix.g = f;
        imageMatrix.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ImageMatrix();
        this.h = true;
        this.i = null;
        this.j = null;
        this.k = BitmapDescriptorFactory.HUE_RED;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.m = Float.NaN;
        this.q = new Drawable[2];
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        c(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new ImageMatrix();
        this.h = true;
        this.i = null;
        this.j = null;
        this.k = BitmapDescriptorFactory.HUE_RED;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.m = Float.NaN;
        this.q = new Drawable[2];
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        c(context, attributeSet);
    }
}
