package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes6.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int[][] j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList h;
    public boolean i;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.h == null) {
            int iB = MaterialColors.b(com.woolworths.R.attr.colorControlActivated, this);
            int iB2 = MaterialColors.b(com.woolworths.R.attr.colorOnSurface, this);
            int iB3 = MaterialColors.b(com.woolworths.R.attr.colorSurface, this);
            this.h = new ColorStateList(j, new int[]{MaterialColors.g(1.0f, iB3, iB), MaterialColors.g(0.54f, iB3, iB2), MaterialColors.g(0.38f, iB3, iB2), MaterialColors.g(0.38f, iB3, iB2)});
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.i = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084107), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.H, i, 2132084107, new int[0]);
        if (typedArrayD.hasValue(0)) {
            setButtonTintList(MaterialResources.a(context2, typedArrayD, 0));
        }
        this.i = typedArrayD.getBoolean(1, false);
        typedArrayD.recycle();
    }
}
