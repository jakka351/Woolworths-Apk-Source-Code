package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class MaterialDivider extends View {
    public final MaterialShapeDrawable d;
    public int e;
    public int f;
    public int g;
    public int h;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.h;
    }

    @Px
    public int getDividerInsetStart() {
        return this.g;
    }

    public int getDividerThickness() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.h : this.g;
        if (z) {
            width = getWidth();
            i = this.g;
        } else {
            width = getWidth();
            i = this.h;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        MaterialShapeDrawable materialShapeDrawable = this.d;
        materialShapeDrawable.setBounds(i2, 0, i3, bottom);
        materialShapeDrawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.e;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        if (this.f != i) {
            this.f = i;
            this.d.m(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(@Px int i) {
        this.h = i;
    }

    public void setDividerInsetEndResource(@DimenRes int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@Px int i) {
        this.g = i;
    }

    public void setDividerInsetStartResource(@DimenRes int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@Px int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.d = new MaterialShapeDrawable();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.G, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.e = typedArrayD.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.g = typedArrayD.getDimensionPixelOffset(2, 0);
        this.h = typedArrayD.getDimensionPixelOffset(1, 0);
        setDividerColor(MaterialResources.a(context2, typedArrayD, 0).getDefaultColor());
        typedArrayD.recycle();
    }
}
