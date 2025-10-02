package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.config.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {
    public static final PorterDuff.Mode m = PorterDuff.Mode.SRC_IN;
    public VectorDrawableCompatState e;
    public PorterDuffColorFilter f;
    public ColorFilter g;
    public boolean h;
    public boolean i;
    public final float[] j;
    public final Matrix k;
    public final Rect l;

    /* loaded from: classes2.dex */
    public static class VClipPath extends VPath {
        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                TypedArray typedArrayG = TypedArrayUtils.g(resources, theme, attributeSet, AndroidResources.d);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArrayG.getString(1);
                if (string2 != null) {
                    this.f3812a = PathParser.c(string2);
                }
                this.c = TypedArrayUtils.f(xmlPullParser, "fillType") ? typedArrayG.getInt(2, 0) : 0;
                typedArrayG.recycle();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class VFullPath extends VPath {
        public ComplexColorCompat d;
        public ComplexColorCompat f;
        public float e = BitmapDescriptorFactory.HUE_RED;
        public float g = 1.0f;
        public float h = 1.0f;
        public float i = BitmapDescriptorFactory.HUE_RED;
        public float j = 1.0f;
        public float k = BitmapDescriptorFactory.HUE_RED;
        public Paint.Cap l = Paint.Cap.BUTT;
        public Paint.Join m = Paint.Join.MITER;
        public float n = 4.0f;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            return this.f.b() || this.d.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r6.f
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.c
                if (r1 == r4) goto L1c
                r0.c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                androidx.core.content.res.ComplexColorCompat r1 = r6.d
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.c
                if (r7 == r4) goto L36
                r1.c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r0 | r2
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath.b(int[]):boolean");
        }

        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray typedArrayG = TypedArrayUtils.g(resources, theme, attributeSet, AndroidResources.c);
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = typedArrayG.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArrayG.getString(2);
                if (string2 != null) {
                    this.f3812a = PathParser.c(string2);
                }
                this.f = TypedArrayUtils.c(typedArrayG, xmlPullParser, theme, "fillColor", 1);
                float f = this.h;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                    f = typedArrayG.getFloat(12, f);
                }
                this.h = f;
                int i = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG.getInt(8, -1) : -1;
                Paint.Cap cap = this.l;
                if (i == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.l = cap;
                int i2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG.getInt(9, -1) : -1;
                Paint.Join join = this.m;
                if (i2 == 0) {
                    join = Paint.Join.MITER;
                } else if (i2 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i2 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.m = join;
                float f2 = this.n;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                    f2 = typedArrayG.getFloat(10, f2);
                }
                this.n = f2;
                this.d = TypedArrayUtils.c(typedArrayG, xmlPullParser, theme, "strokeColor", 3);
                float f3 = this.g;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                    f3 = typedArrayG.getFloat(11, f3);
                }
                this.g = f3;
                float f4 = this.e;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                    f4 = typedArrayG.getFloat(4, f4);
                }
                this.e = f4;
                float f5 = this.j;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                    f5 = typedArrayG.getFloat(6, f5);
                }
                this.j = f5;
                float f6 = this.k;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                    f6 = typedArrayG.getFloat(7, f6);
                }
                this.k = f6;
                float f7 = this.i;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                    f7 = typedArrayG.getFloat(5, f7);
                }
                this.i = f7;
                int i3 = this.c;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                    i3 = typedArrayG.getInt(13, i3);
                }
                this.c = i3;
            }
            typedArrayG.recycle();
        }

        public float getFillAlpha() {
            return this.h;
        }

        @ColorInt
        public int getFillColor() {
            return this.f.c;
        }

        public float getStrokeAlpha() {
            return this.g;
        }

        @ColorInt
        public int getStrokeColor() {
            return this.d.c;
        }

        public float getStrokeWidth() {
            return this.e;
        }

        public float getTrimPathEnd() {
            return this.j;
        }

        public float getTrimPathOffset() {
            return this.k;
        }

        public float getTrimPathStart() {
            return this.i;
        }

        public void setFillAlpha(float f) {
            this.h = f;
        }

        public void setFillColor(int i) {
            this.f.c = i;
        }

        public void setStrokeAlpha(float f) {
            this.g = f;
        }

        public void setStrokeColor(int i) {
            this.d.c = i;
        }

        public void setStrokeWidth(float f) {
            this.e = f;
        }

        public void setTrimPathEnd(float f) {
            this.j = f;
        }

        public void setTrimPathOffset(float f) {
            this.k = f;
        }

        public void setTrimPathStart(float f) {
            this.i = f;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class VObject {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class VectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f3814a;
        public VPathRenderer b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.c = null;
            this.d = VectorDrawableCompat.m;
            if (vectorDrawableCompatState != null) {
                this.f3814a = vectorDrawableCompatState.f3814a;
                VPathRenderer vPathRenderer = new VPathRenderer(vectorDrawableCompatState.b);
                this.b = vPathRenderer;
                if (vectorDrawableCompatState.b.e != null) {
                    vPathRenderer.e = new Paint(vectorDrawableCompatState.b.e);
                }
                if (vectorDrawableCompatState.b.d != null) {
                    this.b.d = new Paint(vectorDrawableCompatState.b.d);
                }
                this.c = vectorDrawableCompatState.c;
                this.d = vectorDrawableCompatState.d;
                this.e = vectorDrawableCompatState.e;
            }
        }

        public final boolean a() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public final void b(int i, int i2) {
            Bitmap bitmap = this.f;
            if (bitmap != null && i == bitmap.getWidth() && i2 == this.f.getHeight()) {
                return;
            }
            this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.k = true;
        }

        public final void c(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            Paint paint;
            if (this.b.getRootAlpha() >= 255 && colorFilter == null) {
                paint = null;
            } else {
                if (this.l == null) {
                    Paint paint2 = new Paint();
                    this.l = paint2;
                    paint2.setFilterBitmap(true);
                }
                this.l.setAlpha(this.b.getRootAlpha());
                this.l.setColorFilter(colorFilter);
                paint = this.l;
            }
            canvas.drawBitmap(this.f, (Rect) null, rect, paint);
        }

        public final boolean d() {
            VPathRenderer vPathRenderer = this.b;
            if (vPathRenderer.n == null) {
                vPathRenderer.n = Boolean.valueOf(vPathRenderer.g.a());
            }
            return vPathRenderer.n.booleanValue();
        }

        public final boolean e(int[] iArr) {
            boolean zB = this.b.g.b(iArr);
            this.k |= zB;
            return zB;
        }

        public final void f() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public final void g(int i, int i2) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            VPathRenderer vPathRenderer = this.b;
            vPathRenderer.a(vPathRenderer.g, VPathRenderer.p, canvas, i, i2);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3814a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public VectorDrawableCompatState() {
            this.c = null;
            this.d = VectorDrawableCompat.m;
            this.b = new VPathRenderer();
        }
    }

    public VectorDrawableCompat() {
        this.i = true;
        this.j = new float[9];
        this.k = new Matrix();
        this.l = new Rect();
        this.e = new VectorDrawableCompatState();
    }

    public static VectorDrawableCompat a(int i, Resources.Theme theme, Resources resources) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.d = ResourcesCompat.c(i, theme, resources);
        return vectorDrawableCompat;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.d;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.l;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.g;
        if (colorFilter == null) {
            colorFilter = this.f;
        }
        Matrix matrix = this.k;
        canvas.getMatrix(matrix);
        float[] fArr = this.j;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != BitmapDescriptorFactory.HUE_RED || fAbs4 != BitmapDescriptorFactory.HUE_RED) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && DrawableCompat.e(this) == 1) {
            canvas.translate(rect.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.e.b(iMin, iMin2);
        if (!this.i) {
            this.e.g(iMin, iMin2);
        } else if (!this.e.a()) {
            this.e.g(iMin, iMin2);
            this.e.f();
        }
        this.e.c(canvas, colorFilter, rect);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.d;
        return drawable != null ? DrawableCompat.c(drawable) : this.e.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.d;
        return drawable != null ? DrawableCompat.d(drawable) : this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.d != null) {
            return new VectorDrawableDelegateState(this.d.getConstantState());
        }
        this.e.f3814a = getChangingConfigurations();
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.e.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.d;
        return drawable != null ? DrawableCompat.g(drawable) : this.e.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.e;
        if (vectorDrawableCompatState == null) {
            return false;
        }
        if (vectorDrawableCompatState.d()) {
            return true;
        }
        ColorStateList colorStateList = this.e.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.h && super.mutate() == this) {
            this.e = new VectorDrawableCompatState(this.e);
            this.h = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.e;
        ColorStateList colorStateList = vectorDrawableCompatState.c;
        if (colorStateList == null || (mode = vectorDrawableCompatState.d) == null) {
            z = false;
        } else {
            this.f = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!vectorDrawableCompatState.d() || !vectorDrawableCompatState.e(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.e.b.getRootAlpha() != i) {
            this.e.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.i(drawable, z);
        } else {
            this.e.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.l(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.m(drawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.e;
        if (vectorDrawableCompatState.c != colorStateList) {
            vectorDrawableCompatState.c = colorStateList;
            this.f = b(colorStateList, vectorDrawableCompatState.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.n(drawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.e;
        if (vectorDrawableCompatState.d != mode) {
            vectorDrawableCompatState.d = mode;
            this.f = b(vectorDrawableCompatState.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.d;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class VectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f3815a;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f3815a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f3815a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3815a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.d = (VectorDrawable) this.f3815a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.d = (VectorDrawable) this.f3815a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.d = (VectorDrawable) this.f3815a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class VPath extends VObject {

        /* renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f3812a;
        public String b;
        public int c;

        public VPath() {
            this.f3812a = null;
            this.c = 0;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f3812a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.a(this.f3812a, pathDataNodeArr)) {
                this.f3812a = PathParser.e(pathDataNodeArr);
                return;
            }
            PathParser.PathDataNode[] pathDataNodeArr2 = this.f3812a;
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                pathDataNodeArr2[i].f2432a = pathDataNodeArr[i].f2432a;
                int i2 = 0;
                while (true) {
                    float[] fArr = pathDataNodeArr[i].b;
                    if (i2 < fArr.length) {
                        pathDataNodeArr2[i].b[i2] = fArr[i2];
                        i2++;
                    }
                }
            }
        }

        public VPath(VPath vPath) {
            this.f3812a = null;
            this.c = 0;
            this.b = vPath.b;
            this.f3812a = PathParser.e(vPath.f3812a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.e;
        vectorDrawableCompatState.b = new VPathRenderer();
        TypedArray typedArrayG = TypedArrayUtils.g(resources, theme, attributeSet, AndroidResources.f3805a);
        VectorDrawableCompatState vectorDrawableCompatState2 = this.e;
        VPathRenderer vPathRenderer = vectorDrawableCompatState2.b;
        int iD = TypedArrayUtils.d(typedArrayG, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iD == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iD != 5) {
            if (iD != 9) {
                switch (iD) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        vectorDrawableCompatState2.d = mode;
        ColorStateList colorStateListB = TypedArrayUtils.b(typedArrayG, xmlPullParser, theme);
        if (colorStateListB != null) {
            vectorDrawableCompatState2.c = colorStateListB;
        }
        boolean z = vectorDrawableCompatState2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayG.getBoolean(5, z);
        }
        vectorDrawableCompatState2.e = z;
        float f = vPathRenderer.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayG.getFloat(7, f);
        }
        vPathRenderer.j = f;
        float f2 = vPathRenderer.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayG.getFloat(8, f2);
        }
        vPathRenderer.k = f2;
        if (vPathRenderer.j <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            vPathRenderer.h = typedArrayG.getDimension(3, vPathRenderer.h);
            int i = 2;
            float dimension = typedArrayG.getDimension(2, vPathRenderer.i);
            vPathRenderer.i = dimension;
            if (vPathRenderer.h <= BitmapDescriptorFactory.HUE_RED) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > BitmapDescriptorFactory.HUE_RED) {
                float alpha = vPathRenderer.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                vPathRenderer.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    vPathRenderer.m = string;
                    vPathRenderer.o.put(string, vPathRenderer);
                }
                typedArrayG.recycle();
                vectorDrawableCompatState.f3814a = getChangingConfigurations();
                int i2 = 1;
                vectorDrawableCompatState.k = true;
                VectorDrawableCompatState vectorDrawableCompatState3 = this.e;
                VPathRenderer vPathRenderer2 = vectorDrawableCompatState3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                VGroup vGroup = vPathRenderer2.g;
                ArrayMap arrayMap = vPathRenderer2.o;
                arrayDeque.push(vGroup);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i2 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == i) {
                        String name = xmlPullParser.getName();
                        VGroup vGroup2 = (VGroup) arrayDeque.peek();
                        if (vGroup2 != null) {
                            ArrayList arrayList = vGroup2.b;
                            if (a.j.equals(name)) {
                                VFullPath vFullPath = new VFullPath();
                                vFullPath.c(resources, xmlPullParser, attributeSet, theme);
                                arrayList.add(vFullPath);
                                if (vFullPath.getPathName() != null) {
                                    arrayMap.put(vFullPath.getPathName(), vFullPath);
                                }
                                vectorDrawableCompatState3.f3814a = vectorDrawableCompatState3.f3814a;
                                z2 = false;
                            } else if ("clip-path".equals(name)) {
                                VClipPath vClipPath = new VClipPath();
                                vClipPath.c(resources, xmlPullParser, attributeSet, theme);
                                arrayList.add(vClipPath);
                                if (vClipPath.getPathName() != null) {
                                    arrayMap.put(vClipPath.getPathName(), vClipPath);
                                }
                                vectorDrawableCompatState3.f3814a = vectorDrawableCompatState3.f3814a;
                            } else if ("group".equals(name)) {
                                VGroup vGroup3 = new VGroup();
                                vGroup3.c(resources, xmlPullParser, attributeSet, theme);
                                arrayList.add(vGroup3);
                                arrayDeque.push(vGroup3);
                                if (vGroup3.getGroupName() != null) {
                                    arrayMap.put(vGroup3.getGroupName(), vGroup3);
                                }
                                vectorDrawableCompatState3.f3814a = vectorDrawableCompatState3.f3814a;
                            }
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser.next();
                    i2 = 1;
                    i = 2;
                }
                if (!z2) {
                    this.f = b(vectorDrawableCompatState.c, vectorDrawableCompatState.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public VectorDrawableCompat(VectorDrawableCompatState vectorDrawableCompatState) {
        this.i = true;
        this.j = new float[9];
        this.k = new Matrix();
        this.l = new Rect();
        this.e = vectorDrawableCompatState;
        this.f = b(vectorDrawableCompatState.c, vectorDrawableCompatState.d);
    }

    /* loaded from: classes2.dex */
    public static class VGroup extends VObject {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f3811a;
        public final ArrayList b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public String k;

        public VGroup() {
            this.f3811a = new Matrix();
            this.b = new ArrayList();
            this.c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = BitmapDescriptorFactory.HUE_RED;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = new Matrix();
            this.k = null;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean a() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((VObject) arrayList.get(i)).a()) {
                    return true;
                }
                i++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public final boolean b(int[] iArr) {
            int i = 0;
            boolean zB = false;
            while (true) {
                ArrayList arrayList = this.b;
                if (i >= arrayList.size()) {
                    return zB;
                }
                zB |= ((VObject) arrayList.get(i)).b(iArr);
                i++;
            }
        }

        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray typedArrayG = TypedArrayUtils.g(resources, theme, attributeSet, AndroidResources.b);
            float f = this.c;
            if (TypedArrayUtils.f(xmlPullParser, "rotation")) {
                f = typedArrayG.getFloat(5, f);
            }
            this.c = f;
            this.d = typedArrayG.getFloat(1, this.d);
            this.e = typedArrayG.getFloat(2, this.e);
            float f2 = this.f;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                f2 = typedArrayG.getFloat(3, f2);
            }
            this.f = f2;
            float f3 = this.g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                f3 = typedArrayG.getFloat(4, f3);
            }
            this.g = f3;
            float f4 = this.h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                f4 = typedArrayG.getFloat(6, f4);
            }
            this.h = f4;
            float f5 = this.i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                f5 = typedArrayG.getFloat(7, f5);
            }
            this.i = f5;
            String string = typedArrayG.getString(0);
            if (string != null) {
                this.k = string;
            }
            d();
            typedArrayG.recycle();
        }

        public final void d() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.d, -this.e);
            matrix.postScale(this.f, this.g);
            matrix.postRotate(this.c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            matrix.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.k;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VGroup(VGroup vGroup, ArrayMap arrayMap) {
            VClipPath vClipPath;
            this.f3811a = new Matrix();
            this.b = new ArrayList();
            this.c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = BitmapDescriptorFactory.HUE_RED;
            this.i = BitmapDescriptorFactory.HUE_RED;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.k = null;
            this.c = vGroup.c;
            this.d = vGroup.d;
            this.e = vGroup.e;
            this.f = vGroup.f;
            this.g = vGroup.g;
            this.h = vGroup.h;
            this.i = vGroup.i;
            String str = vGroup.k;
            this.k = str;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.j);
            ArrayList arrayList = vGroup.b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof VGroup) {
                    this.b.add(new VGroup((VGroup) obj, arrayMap));
                } else {
                    if (obj instanceof VFullPath) {
                        VFullPath vFullPath = (VFullPath) obj;
                        VFullPath vFullPath2 = new VFullPath(vFullPath);
                        vFullPath2.e = BitmapDescriptorFactory.HUE_RED;
                        vFullPath2.g = 1.0f;
                        vFullPath2.h = 1.0f;
                        vFullPath2.i = BitmapDescriptorFactory.HUE_RED;
                        vFullPath2.j = 1.0f;
                        vFullPath2.k = BitmapDescriptorFactory.HUE_RED;
                        vFullPath2.l = Paint.Cap.BUTT;
                        vFullPath2.m = Paint.Join.MITER;
                        vFullPath2.n = 4.0f;
                        vFullPath2.d = vFullPath.d;
                        vFullPath2.e = vFullPath.e;
                        vFullPath2.g = vFullPath.g;
                        vFullPath2.f = vFullPath.f;
                        vFullPath2.c = vFullPath.c;
                        vFullPath2.h = vFullPath.h;
                        vFullPath2.i = vFullPath.i;
                        vFullPath2.j = vFullPath.j;
                        vFullPath2.k = vFullPath.k;
                        vFullPath2.l = vFullPath.l;
                        vFullPath2.m = vFullPath.m;
                        vFullPath2.n = vFullPath.n;
                        vClipPath = vFullPath2;
                    } else if (obj instanceof VClipPath) {
                        vClipPath = new VClipPath((VClipPath) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(vClipPath);
                    String str2 = vClipPath.b;
                    if (str2 != null) {
                        arrayMap.put(str2, vClipPath);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class VPathRenderer {
        public static final Matrix p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f3813a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public final VGroup g;
        public float h;
        public float i;
        public float j;
        public float k;
        public int l;
        public String m;
        public Boolean n;
        public final ArrayMap o;

        public VPathRenderer() {
            this.c = new Matrix();
            this.h = BitmapDescriptorFactory.HUE_RED;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.k = BitmapDescriptorFactory.HUE_RED;
            this.l = 255;
            this.m = null;
            this.n = null;
            this.o = new ArrayMap(0);
            this.g = new VGroup();
            this.f3813a = new Path();
            this.b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(VGroup vGroup, Matrix matrix, Canvas canvas, int i, int i2) {
            int i3;
            float f;
            int i4;
            float f2;
            Matrix matrix2 = vGroup.f3811a;
            ArrayList arrayList = vGroup.b;
            matrix2.set(matrix);
            Matrix matrix3 = vGroup.f3811a;
            matrix3.preConcat(vGroup.j);
            canvas.save();
            char c = 0;
            int i5 = 0;
            while (i5 < arrayList.size()) {
                VObject vObject = (VObject) arrayList.get(i5);
                if (vObject instanceof VGroup) {
                    a((VGroup) vObject, matrix3, canvas, i, i2);
                } else if (vObject instanceof VPath) {
                    VPath vPath = (VPath) vObject;
                    float f3 = i / this.j;
                    float f4 = i2 / this.k;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > BitmapDescriptorFactory.HUE_RED ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs != BitmapDescriptorFactory.HUE_RED) {
                        Path path = this.f3813a;
                        path.reset();
                        PathParser.PathDataNode[] pathDataNodeArr = vPath.f3812a;
                        if (pathDataNodeArr != null) {
                            PathParser.f(pathDataNodeArr, path);
                        }
                        Path path2 = this.b;
                        path2.reset();
                        if (vPath instanceof VClipPath) {
                            path2.setFillType(vPath.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            VFullPath vFullPath = (VFullPath) vPath;
                            float f6 = vFullPath.i;
                            if (f6 != BitmapDescriptorFactory.HUE_RED || vFullPath.j != 1.0f) {
                                float f7 = vFullPath.k;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (vFullPath.j + f7) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, z);
                                float length = this.f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f.getSegment(f10, length, path, true);
                                    PathMeasure pathMeasure = this.f;
                                    f = BitmapDescriptorFactory.HUE_RED;
                                    pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, f11, path, true);
                                } else {
                                    f = 0.0f;
                                    this.f.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            ComplexColorCompat complexColorCompat = vFullPath.f;
                            if (complexColorCompat.f2418a == null && complexColorCompat.c == 0) {
                                f2 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.e;
                                Shader shader = complexColorCompat.f2418a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(vFullPath.h * 255.0f));
                                    f2 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = complexColorCompat.c;
                                    float f12 = vFullPath.h;
                                    PorterDuff.Mode mode = VectorDrawableCompat.m;
                                    f2 = 255.0f;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(vFullPath.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            ComplexColorCompat complexColorCompat2 = vFullPath.d;
                            if (complexColorCompat2.f2418a != null || complexColorCompat2.c != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = vFullPath.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = vFullPath.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(vFullPath.n);
                                Shader shader2 = complexColorCompat2.f2418a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(vFullPath.g * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = complexColorCompat2.c;
                                    float f13 = vFullPath.g;
                                    PorterDuff.Mode mode2 = VectorDrawableCompat.m;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(vFullPath.e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i5 = i3 + 1;
                    c = 0;
                }
                i3 = i5;
                i5 = i3 + 1;
                c = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.l = i;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.c = new Matrix();
            this.h = BitmapDescriptorFactory.HUE_RED;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.j = BitmapDescriptorFactory.HUE_RED;
            this.k = BitmapDescriptorFactory.HUE_RED;
            this.l = 255;
            this.m = null;
            this.n = null;
            ArrayMap arrayMap = new ArrayMap(0);
            this.o = arrayMap;
            this.g = new VGroup(vPathRenderer.g, arrayMap);
            this.f3813a = new Path(vPathRenderer.f3813a);
            this.b = new Path(vPathRenderer.b);
            this.h = vPathRenderer.h;
            this.i = vPathRenderer.i;
            this.j = vPathRenderer.j;
            this.k = vPathRenderer.k;
            this.l = vPathRenderer.l;
            this.m = vPathRenderer.m;
            String str = vPathRenderer.m;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.n = vPathRenderer.n;
        }
    }
}
