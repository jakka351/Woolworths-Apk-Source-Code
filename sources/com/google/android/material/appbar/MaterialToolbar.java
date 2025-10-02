package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] f0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer a0;
    public boolean b0;
    public boolean c0;
    public ImageView.ScaleType d0;
    public Boolean e0;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.d0;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.a0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuBuilder;
        if (z) {
            ((MenuBuilder) menu).B();
        }
        super.n(i);
        if (z) {
            ((MenuBuilder) menu).A();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.b0 || this.c0) {
            ArrayList arrayListC = ToolbarUtils.c(this, getTitle());
            boolean zIsEmpty = arrayListC.isEmpty();
            Comparator comparator = ToolbarUtils.f14607a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListC, comparator);
            ArrayList arrayListC2 = ToolbarUtils.c(this, getSubtitle());
            TextView textView2 = arrayListC2.isEmpty() ? null : (TextView) Collections.max(arrayListC2, comparator);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.b0 && textView != null) {
                    y(textView, pair);
                }
                if (this.c0 && textView2 != null) {
                    y(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.e0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.d0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.e0;
        if (bool == null || bool.booleanValue() != z) {
            this.e0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.d0 != scaleType) {
            this.d0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.a0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.a0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.a0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            requestLayout();
        }
    }

    public final void y(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ColorStateList colorStateListD;
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084182), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.N, i, 2132084182, new int[0]);
        if (typedArrayD.hasValue(2)) {
            setNavigationIconTint(typedArrayD.getColor(2, -1));
        }
        this.b0 = typedArrayD.getBoolean(4, false);
        this.c0 = typedArrayD.getBoolean(3, false);
        int i2 = typedArrayD.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f0;
            if (i2 < scaleTypeArr.length) {
                this.d0 = scaleTypeArr[i2];
            }
        }
        if (typedArrayD.hasValue(0)) {
            this.e0 = Boolean.valueOf(typedArrayD.getBoolean(0, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListD = ColorStateList.valueOf(0);
        } else {
            colorStateListD = DrawableUtils.d(background);
        }
        if (colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.m(colorStateListD);
            materialShapeDrawable.k(context2);
            materialShapeDrawable.l(ViewCompat.k(this));
            setBackground(materialShapeDrawable);
        }
    }
}
