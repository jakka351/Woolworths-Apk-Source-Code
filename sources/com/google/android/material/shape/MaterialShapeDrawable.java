package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.ShapePath;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes6.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    public static final Paint A;
    public MaterialShapeDrawableState d;
    public final ShapePath.ShadowCompatOperation[] e;
    public final ShapePath.ShadowCompatOperation[] f;
    public final BitSet g;
    public boolean h;
    public final Matrix i;
    public final Path j;
    public final Path k;
    public final RectF l;
    public final RectF m;
    public final Region n;
    public final Region o;
    public ShapeAppearanceModel p;
    public final Paint q;
    public final Paint r;
    public final ShadowRenderer s;
    public final ShapeAppearancePathProvider.PathListener t;
    public final ShapeAppearancePathProvider u;
    public PorterDuffColorFilter v;
    public PorterDuffColorFilter w;
    public int x;
    public final RectF y;
    public boolean z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    static {
        Paint paint = new Paint(1);
        A = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(Path path, RectF rectF) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        this.u.a(materialShapeDrawableState.f14634a, materialShapeDrawableState.i, rectF, this.t, path);
        if (this.d.h != 1.0f) {
            Matrix matrix = this.i;
            matrix.reset();
            float f = this.d.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.y, true);
    }

    public final int c(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        float f = materialShapeDrawableState.m + BitmapDescriptorFactory.HUE_RED + materialShapeDrawableState.l;
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawableState.b;
        return elevationOverlayProvider != null ? elevationOverlayProvider.a(f, i) : i;
    }

    public final void d(Canvas canvas) {
        if (this.g.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.d.p;
        Path path = this.j;
        ShadowRenderer shadowRenderer = this.s;
        if (i != 0) {
            canvas.drawPath(path, shadowRenderer.f14629a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ShapePath.ShadowCompatOperation shadowCompatOperation = this.e[i2];
            int i3 = this.d.o;
            Matrix matrix = ShapePath.ShadowCompatOperation.b;
            shadowCompatOperation.a(matrix, shadowRenderer, i3, canvas);
            this.f[i2].a(matrix, shadowRenderer, this.d.o, canvas);
        }
        if (this.z) {
            MaterialShapeDrawableState materialShapeDrawableState = this.d;
            int iSin = (int) (Math.sin(Math.toRadians(materialShapeDrawableState.q)) * materialShapeDrawableState.p);
            int iH = h();
            canvas.translate(-iSin, -iH);
            canvas.drawPath(path, A);
            canvas.translate(iSin, iH);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.MaterialShapeDrawable.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        if (!shapeAppearanceModel.f(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = shapeAppearanceModel.f.a(rectF) * this.d.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        ShapeAppearanceModel shapeAppearanceModel = this.p;
        RectF rectFG = g();
        RectF rectF = this.m;
        rectF.set(rectFG);
        boolean zJ = j();
        Paint paint = this.r;
        float strokeWidth = zJ ? paint.getStrokeWidth() / 2.0f : BitmapDescriptorFactory.HUE_RED;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.k, shapeAppearanceModel, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.l;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.n == 2) {
            return;
        }
        if (materialShapeDrawableState.f14634a.f(g())) {
            outline.setRoundRect(getBounds(), i() * this.d.i);
        } else {
            RectF rectFG = g();
            Path path = this.j;
            b(path, rectFG);
            DrawableUtils.e(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.d.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.google.android.material.shape.Shapeable
    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.d.f14634a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.n;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.j;
        b(path, rectFG);
        Region region2 = this.o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final int h() {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        return (int) (Math.cos(Math.toRadians(materialShapeDrawableState.q)) * materialShapeDrawableState.p);
    }

    public final float i() {
        return this.d.f14634a.e.a(g());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.d.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.d.getClass();
        ColorStateList colorStateList2 = this.d.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.d.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final boolean j() {
        Paint.Style style = this.d.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED;
    }

    public final void k(Context context) {
        this.d.b = new ElevationOverlayProvider(context);
        w();
    }

    public final void l(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.m != f) {
            materialShapeDrawableState.m = f;
            w();
        }
    }

    public final void m(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.c != colorStateList) {
            materialShapeDrawableState.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.d = new MaterialShapeDrawableState(this.d);
        return this;
    }

    public final void n(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.i != f) {
            materialShapeDrawableState.i = f;
            this.h = true;
            invalidateSelf();
        }
    }

    public final void o() {
        this.d.r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        boolean z = u(iArr) || v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(int i) {
        this.s.c(i);
        this.d.getClass();
        super.invalidateSelf();
    }

    public final void q(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.q != i) {
            materialShapeDrawableState.q = i;
            super.invalidateSelf();
        }
    }

    public final void r(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.n != i) {
            materialShapeDrawableState.n = i;
            super.invalidateSelf();
        }
    }

    public final void s(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.d != colorStateList) {
            materialShapeDrawableState.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.k != i) {
            materialShapeDrawableState.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.getClass();
        super.invalidateSelf();
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.d.f14634a = shapeAppearanceModel;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.d.e = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        if (materialShapeDrawableState.f != mode) {
            materialShapeDrawableState.f = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final void t(float f) {
        this.d.j = f;
        invalidateSelf();
    }

    public final boolean u(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.d.c == null || color2 == (colorForState2 = this.d.c.getColorForState(iArr, (color2 = (paint2 = this.q).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.d.d == null || color == (colorForState = this.d.d.getColorForState(iArr, (color = (paint = this.r).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        PorterDuffColorFilter porterDuffColorFilter3 = this.w;
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        ColorStateList colorStateList = materialShapeDrawableState.e;
        PorterDuff.Mode mode = materialShapeDrawableState.f;
        if (colorStateList == null || mode == null) {
            int color = this.q.getColor();
            int iC = c(color);
            this.x = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.x = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.v = porterDuffColorFilter;
        this.d.getClass();
        this.w = null;
        this.d.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.v) && Objects.equals(porterDuffColorFilter3, this.w)) ? false : true;
    }

    public final void w() {
        MaterialShapeDrawableState materialShapeDrawableState = this.d;
        float f = materialShapeDrawableState.m + BitmapDescriptorFactory.HUE_RED;
        materialShapeDrawableState.o = (int) Math.ceil(0.75f * f);
        this.d.p = (int) Math.ceil(f * 0.25f);
        v();
        super.invalidateSelf();
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel));
    }

    public MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.e = new ShapePath.ShadowCompatOperation[4];
        this.f = new ShapePath.ShadowCompatOperation[4];
        this.g = new BitSet(8);
        this.i = new Matrix();
        this.j = new Path();
        this.k = new Path();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Region();
        this.o = new Region();
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.Lazy.f14639a;
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.u = shapeAppearancePathProvider;
        this.y = new RectF();
        this.z = true;
        this.d = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        u(getState());
        this.t = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public final void a(ShapePath shapePath, Matrix matrix, int i) {
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                BitSet bitSet = materialShapeDrawable.g;
                shapePath.getClass();
                bitSet.set(i, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = materialShapeDrawable.e;
                shapePath.b(shapePath.f);
                shadowCompatOperationArr[i] = new ShapePath.AnonymousClass1(new ArrayList(shapePath.h), new Matrix(matrix));
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public final void b(ShapePath shapePath, Matrix matrix, int i) {
                MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.this;
                shapePath.getClass();
                materialShapeDrawable.g.set(i + 4, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = materialShapeDrawable.f;
                shapePath.b(shapePath.f);
                shadowCompatOperationArr[i] = new ShapePath.AnonymousClass1(new ArrayList(shapePath.h), new Matrix(matrix));
            }
        };
    }

    @RestrictTo
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public ShapeAppearanceModel f14634a;
        public ElevationOverlayProvider b;
        public ColorStateList c;
        public ColorStateList d;
        public ColorStateList e;
        public PorterDuff.Mode f;
        public Rect g;
        public final float h;
        public float i;
        public float j;
        public int k;
        public float l;
        public float m;
        public int n;
        public int o;
        public int p;
        public int q;
        public Paint.Style r;

        public MaterialShapeDrawableState(ShapeAppearanceModel shapeAppearanceModel) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = BitmapDescriptorFactory.HUE_RED;
            this.m = BitmapDescriptorFactory.HUE_RED;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.r = Paint.Style.FILL_AND_STROKE;
            this.f14634a = shapeAppearanceModel;
            this.b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.h = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(MaterialShapeDrawableState materialShapeDrawableState) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = PorterDuff.Mode.SRC_IN;
            this.g = null;
            this.h = 1.0f;
            this.i = 1.0f;
            this.k = 255;
            this.l = BitmapDescriptorFactory.HUE_RED;
            this.m = BitmapDescriptorFactory.HUE_RED;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.r = Paint.Style.FILL_AND_STROKE;
            this.f14634a = materialShapeDrawableState.f14634a;
            this.b = materialShapeDrawableState.b;
            this.j = materialShapeDrawableState.j;
            this.c = materialShapeDrawableState.c;
            this.d = materialShapeDrawableState.d;
            this.f = materialShapeDrawableState.f;
            this.e = materialShapeDrawableState.e;
            this.k = materialShapeDrawableState.k;
            this.h = materialShapeDrawableState.h;
            this.p = materialShapeDrawableState.p;
            this.n = materialShapeDrawableState.n;
            this.i = materialShapeDrawableState.i;
            this.l = materialShapeDrawableState.l;
            this.m = materialShapeDrawableState.m;
            this.o = materialShapeDrawableState.o;
            this.q = materialShapeDrawableState.q;
            this.r = materialShapeDrawableState.r;
            if (materialShapeDrawableState.g != null) {
                this.g = new Rect(materialShapeDrawableState.g);
            }
        }
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ShapeAppearanceModel.d(context, attributeSet, i, i2).a());
    }
}
