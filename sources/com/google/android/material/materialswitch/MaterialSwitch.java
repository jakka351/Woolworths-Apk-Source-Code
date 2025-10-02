package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] m0 = {R.attr.state_with_icon};
    public Drawable W;
    public Drawable a0;
    public int b0;
    public Drawable c0;
    public Drawable d0;
    public ColorStateList e0;
    public ColorStateList f0;
    public PorterDuff.Mode g0;
    public ColorStateList h0;
    public ColorStateList i0;
    public PorterDuff.Mode j0;
    public int[] k0;
    public int[] l0;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ColorUtils.b(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.W = DrawableUtils.b(this.W, this.e0, getThumbTintMode());
        this.a0 = DrawableUtils.b(this.a0, this.f0, this.g0);
        h();
        Drawable drawable = this.W;
        Drawable drawable2 = this.a0;
        int i = this.b0;
        super.setThumbDrawable(DrawableUtils.a(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void f() {
        this.c0 = DrawableUtils.b(this.c0, this.h0, getTrackTintMode());
        this.d0 = DrawableUtils.b(this.d0, this.i0, this.j0);
        h();
        Drawable layerDrawable = this.c0;
        if (layerDrawable != null && this.d0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.c0, this.d0});
        } else if (layerDrawable == null) {
            layerDrawable = this.d0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.W;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.a0;
    }

    @Px
    public int getThumbIconSize() {
        return this.b0;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.g0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.e0;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.d0;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.i0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.j0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.c0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.h0;
    }

    public final void h() {
        if (this.e0 == null && this.f0 == null && this.h0 == null && this.i0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.e0;
        if (colorStateList != null) {
            g(this.W, colorStateList, this.k0, this.l0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f0;
        if (colorStateList2 != null) {
            g(this.a0, colorStateList2, this.k0, this.l0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.h0;
        if (colorStateList3 != null) {
            g(this.c0, colorStateList3, this.k0, this.l0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.i0;
        if (colorStateList4 != null) {
            g(this.d0, colorStateList4, this.k0, this.l0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, m0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.k0 = iArr;
        this.l0 = DrawableUtils.c(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.W = drawable;
        e();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.a0 = drawable;
        e();
    }

    public void setThumbIconResource(@DrawableRes int i) {
        setThumbIconDrawable(AppCompatResources.b(i, getContext()));
    }

    public void setThumbIconSize(@Px int i) {
        if (this.b0 != i) {
            this.b0 = i;
            e();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.g0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.e0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.d0 = drawable;
        f();
    }

    public void setTrackDecorationResource(@DrawableRes int i) {
        setTrackDecorationDrawable(AppCompatResources.b(i, getContext()));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.i0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.j0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.c0 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.h0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.b0 = -1;
        Context context2 = getContext();
        this.W = super.getThumbDrawable();
        this.e0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.c0 = super.getTrackDrawable();
        this.h0 = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayE = ThemeEnforcement.e(context2, attributeSet, com.google.android.material.R.styleable.J, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.a0 = tintTypedArrayE.b(0);
        TypedArray typedArray = tintTypedArrayE.b;
        this.b0 = typedArray.getDimensionPixelSize(1, -1);
        this.f0 = tintTypedArrayE.a(2);
        int i2 = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g0 = ViewUtils.i(i2, mode);
        this.d0 = tintTypedArrayE.b(4);
        this.i0 = tintTypedArrayE.a(5);
        this.j0 = ViewUtils.i(typedArray.getInt(6, -1), mode);
        tintTypedArrayE.g();
        setEnforceSwitchWidth(false);
        e();
        f();
    }
}
