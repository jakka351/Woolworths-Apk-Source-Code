package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    public static final int[] J0 = {R.attr.state_enabled};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public ColorStateList B;
    public PorterDuff.Mode B0;
    public ColorStateList C;
    public int[] C0;
    public float D;
    public ColorStateList D0;
    public float E;
    public WeakReference E0;
    public ColorStateList F;
    public TextUtils.TruncateAt F0;
    public float G;
    public boolean G0;
    public ColorStateList H;
    public int H0;
    public CharSequence I;
    public boolean I0;
    public boolean J;
    public Drawable K;
    public ColorStateList L;
    public float M;
    public boolean N;
    public boolean O;
    public Drawable P;
    public RippleDrawable Q;
    public ColorStateList R;
    public float S;
    public SpannableStringBuilder T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public ColorStateList X;
    public MotionSpec Y;
    public MotionSpec Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public final Context i0;
    public final Paint j0;
    public final Paint.FontMetrics k0;
    public final RectF l0;
    public final PointF m0;
    public final Path n0;
    public final TextDrawableHelper o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public int w0;
    public int x0;
    public ColorFilter y0;
    public PorterDuffColorFilter z0;

    public interface Delegate {
        void a();
    }

    public ChipDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132084096);
        this.E = -1.0f;
        this.j0 = new Paint(1);
        this.k0 = new Paint.FontMetrics();
        this.l0 = new RectF();
        this.m0 = new PointF();
        this.n0 = new Path();
        this.x0 = 255;
        this.B0 = PorterDuff.Mode.SRC_IN;
        this.E0 = new WeakReference(null);
        k(context);
        this.i0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.o0 = textDrawableHelper;
        this.I = "";
        textDrawableHelper.f14604a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J0;
        setState(iArr);
        if (!Arrays.equals(this.C0, iArr)) {
            this.C0 = iArr;
            if (c0()) {
                F(getState(), iArr);
            }
        }
        this.G0 = true;
        K0.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean D(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void d0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        return c0() ? this.f0 + this.S + this.g0 : BitmapDescriptorFactory.HUE_RED;
    }

    public final float B() {
        return this.I0 ? i() : this.E;
    }

    public final void E() {
        Delegate delegate = (Delegate) this.E0.get();
        if (delegate != null) {
            delegate.a();
        }
    }

    public final boolean F(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.B;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.p0) : 0);
        boolean state = true;
        if (this.p0 != iC) {
            this.p0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.C;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.q0) : 0);
        if (this.q0 != iC2) {
            this.q0 = iC2;
            zOnStateChange = true;
        }
        int iC3 = ColorUtils.c(iC2, iC);
        if ((this.r0 != iC3) | (this.d.c == null)) {
            this.r0 = iC3;
            m(ColorStateList.valueOf(iC3));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.F;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.s0) : 0;
        if (this.s0 != colorForState) {
            this.s0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.D0 == null || !RippleUtils.d(iArr)) ? 0 : this.D0.getColorForState(iArr, this.t0);
        if (this.t0 != colorForState2) {
            this.t0 = colorForState2;
        }
        TextAppearance textAppearance = this.o0.g;
        int colorForState3 = (textAppearance == null || (colorStateList = textAppearance.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.u0);
        if (this.u0 != colorForState3) {
            this.u0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.U) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.v0 == z || this.W == null) {
            z2 = false;
        } else {
            float fZ = z();
            this.v0 = z;
            if (fZ != z()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.A0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.w0) : 0;
        if (this.w0 != colorForState4) {
            this.w0 = colorForState4;
            ColorStateList colorStateList6 = this.A0;
            PorterDuff.Mode mode = this.B0;
            this.z0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (D(this.K)) {
            state |= this.K.setState(iArr);
        }
        if (D(this.W)) {
            state |= this.W.setState(iArr);
        }
        if (D(this.P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.P.setState(iArr3);
        }
        if (D(this.Q)) {
            state |= this.Q.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            E();
        }
        return state;
    }

    public final void G(boolean z) {
        if (this.U != z) {
            this.U = z;
            float fZ = z();
            if (!z && this.v0) {
                this.v0 = false;
            }
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.W != drawable) {
            float fZ = z();
            this.W = drawable;
            float fZ2 = z();
            d0(this.W);
            x(this.W);
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (this.V && (drawable = this.W) != null && this.U) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z) {
        if (this.V != z) {
            boolean zA0 = a0();
            this.V = z;
            boolean zA02 = a0();
            if (zA0 != zA02) {
                if (zA02) {
                    x(this.W);
                } else {
                    d0(this.W);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void K(float f) {
        if (this.E != f) {
            this.E = f;
            ShapeAppearanceModel.Builder builderG = this.d.f14634a.g();
            builderG.b(f);
            setShapeAppearanceModel(builderG.a());
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.K;
        Drawable drawableO = drawable2 != null ? DrawableCompat.o(drawable2) : null;
        if (drawableO != drawable) {
            float fZ = z();
            this.K = drawable != null ? drawable.mutate() : null;
            float fZ2 = z();
            d0(drawableO);
            if (b0()) {
                x(this.K);
            }
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void M(float f) {
        if (this.M != f) {
            float fZ = z();
            this.M = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (b0()) {
                this.K.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.J != z) {
            boolean zB0 = b0();
            this.J = z;
            boolean zB02 = b0();
            if (zB0 != zB02) {
                if (zB02) {
                    x(this.K);
                } else {
                    d0(this.K);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.I0) {
                s(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f) {
        if (this.G != f) {
            this.G = f;
            this.j0.setStrokeWidth(f);
            if (this.I0) {
                t(f);
            }
            invalidateSelf();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2 = this.P;
        Drawable drawableO = drawable2 != null ? DrawableCompat.o(drawable2) : null;
        if (drawableO != drawable) {
            float fA = A();
            this.P = drawable != null ? drawable.mutate() : null;
            this.Q = new RippleDrawable(RippleUtils.c(this.H), this.P, K0);
            float fA2 = A();
            d0(drawableO);
            if (c0()) {
                x(this.P);
            }
            invalidateSelf();
            if (fA != fA2) {
                E();
            }
        }
    }

    public final void S(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void T(float f) {
        if (this.S != f) {
            this.S = f;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void U(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            if (c0()) {
                E();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (c0()) {
                this.P.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z) {
        if (this.O != z) {
            boolean zC0 = c0();
            this.O = z;
            boolean zC02 = c0();
            if (zC0 != zC02) {
                if (zC02) {
                    x(this.P);
                } else {
                    d0(this.P);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void X(float f) {
        if (this.c0 != f) {
            float fZ = z();
            this.c0 = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void Y(float f) {
        if (this.b0 != f) {
            float fZ = z();
            this.b0 = f;
            float fZ2 = z();
            invalidateSelf();
            if (fZ != fZ2) {
                E();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            this.D0 = null;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void a() {
        E();
        invalidateSelf();
    }

    public final boolean a0() {
        return this.V && this.W != null && this.v0;
    }

    public final boolean b0() {
        return this.J && this.K != null;
    }

    public final boolean c0() {
        return this.O && this.P != null;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.x0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.I0;
        Paint paint = this.j0;
        RectF rectF = this.l0;
        if (!z) {
            paint.setColor(this.p0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (!this.I0) {
            paint.setColor(this.q0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.y0;
            if (colorFilter == null) {
                colorFilter = this.z0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (this.I0) {
            super.draw(canvas);
        }
        if (this.G > BitmapDescriptorFactory.HUE_RED && !this.I0) {
            paint.setColor(this.s0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.I0) {
                ColorFilter colorFilter2 = this.y0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.z0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.G / 2.0f;
            rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.E - (this.G / 2.0f);
            canvas2.drawRoundRect(rectF, f3, f3, paint);
        }
        paint.setColor(this.t0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.I0) {
            RectF rectF2 = new RectF(bounds);
            MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = this.d;
            ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawableState.f14634a;
            float f4 = materialShapeDrawableState.i;
            ShapeAppearancePathProvider.PathListener pathListener = this.t;
            ShapeAppearancePathProvider shapeAppearancePathProvider = this.u;
            Path path = this.n0;
            shapeAppearancePathProvider.a(shapeAppearanceModel, f4, rectF2, pathListener, path);
            e(canvas2, paint, path, this.d.f14634a, g());
        } else {
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (b0()) {
            y(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas2.translate(f5, f6);
            this.K.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.K.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (a0()) {
            y(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (this.G0 && this.I != null) {
            PointF pointF = this.m0;
            pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.I;
            TextDrawableHelper textDrawableHelper = this.o0;
            if (charSequence != null) {
                float fZ = z() + this.a0 + this.d0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fZ;
                } else {
                    pointF.x = bounds.right - fZ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = textDrawableHelper.f14604a;
                Paint.FontMetrics fontMetrics = this.k0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.I != null) {
                float fZ2 = z() + this.a0 + this.d0;
                float fA = A() + this.h0 + this.e0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fZ2;
                    rectF.right = bounds.right - fA;
                } else {
                    rectF.left = bounds.left + fA;
                    rectF.right = bounds.right - fZ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            TextAppearance textAppearance = textDrawableHelper.g;
            TextPaint textPaint2 = textDrawableHelper.f14604a;
            if (textAppearance != null) {
                textPaint2.drawableState = getState();
                textDrawableHelper.g.e(this.i0, textPaint2, textDrawableHelper.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(textDrawableHelper.a(this.I.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.I;
            if (z2 && this.F0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.F0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (c0()) {
            rectF.setEmpty();
            if (c0()) {
                float f9 = this.h0 + this.g0;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.S;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.S;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.S;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.P.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Q.setBounds(this.P.getBounds());
            this.Q.jumpToCurrentState();
            this.Q.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.x0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.y0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(A() + this.o0.a(this.I.toString()) + z() + this.a0 + this.d0 + this.e0 + this.h0), this.H0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.D, this.E);
        } else {
            outline.setRoundRect(bounds, this.E);
            outline2 = outline;
        }
        outline2.setAlpha(this.x0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (C(this.B) || C(this.C) || C(this.F)) {
            return true;
        }
        TextAppearance textAppearance = this.o0.g;
        if (textAppearance == null || (colorStateList = textAppearance.j) == null || !colorStateList.isStateful()) {
            return (this.V && this.W != null && this.U) || D(this.K) || D(this.W) || C(this.A0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (b0()) {
            zOnLayoutDirectionChanged |= this.K.setLayoutDirection(i);
        }
        if (a0()) {
            zOnLayoutDirectionChanged |= this.W.setLayoutDirection(i);
        }
        if (c0()) {
            zOnLayoutDirectionChanged |= this.P.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (b0()) {
            zOnLevelChange |= this.K.setLevel(i);
        }
        if (a0()) {
            zOnLevelChange |= this.W.setLevel(i);
        }
        if (c0()) {
            zOnLevelChange |= this.P.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.C0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.y0 != colorFilter) {
            this.y0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.B0 != mode) {
            this.B0 = mode;
            ColorStateList colorStateList = this.A0;
            this.z0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (b0()) {
            visible |= this.K.setVisible(z, z2);
        }
        if (a0()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (c0()) {
            visible |= this.P.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(this.C0);
            }
            drawable.setTintList(this.R);
            return;
        }
        Drawable drawable2 = this.K;
        if (drawable == drawable2 && this.N) {
            drawable2.setTintList(this.L);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b0() || a0()) {
            float f = this.a0 + this.b0;
            Drawable drawable = this.v0 ? this.W : this.K;
            float intrinsicWidth = this.M;
            if (intrinsicWidth <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.v0 ? this.W : this.K;
            float fCeil = this.M;
            if (fCeil <= BitmapDescriptorFactory.HUE_RED && drawable2 != null) {
                fCeil = (float) Math.ceil(ViewUtils.d(24, this.i0));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float z() {
        if (!b0() && !a0()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.b0;
        Drawable drawable = this.v0 ? this.W : this.K;
        float intrinsicWidth = this.M;
        if (intrinsicWidth <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.c0;
    }
}
