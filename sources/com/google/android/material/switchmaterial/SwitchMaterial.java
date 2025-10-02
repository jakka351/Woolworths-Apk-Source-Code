package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes6.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] d0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final ElevationOverlayProvider W;
    public ColorStateList a0;
    public ColorStateList b0;
    public boolean c0;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.a0 == null) {
            int iB = MaterialColors.b(com.woolworths.R.attr.colorSurface, this);
            int iB2 = MaterialColors.b(com.woolworths.R.attr.colorControlActivated, this);
            float dimension = getResources().getDimension(com.woolworths.R.dimen.mtrl_switch_thumb_elevation);
            ElevationOverlayProvider elevationOverlayProvider = this.W;
            if (elevationOverlayProvider.f14574a) {
                float fK = BitmapDescriptorFactory.HUE_RED;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    fK += ViewCompat.k((View) parent);
                }
                dimension += fK;
            }
            int iA = elevationOverlayProvider.a(dimension, iB);
            this.a0 = new ColorStateList(d0, new int[]{MaterialColors.g(1.0f, iB, iB2), iA, MaterialColors.g(0.38f, iB, iB2), iA});
        }
        return this.a0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.b0 == null) {
            int iB = MaterialColors.b(com.woolworths.R.attr.colorSurface, this);
            int iB2 = MaterialColors.b(com.woolworths.R.attr.colorControlActivated, this);
            int iB3 = MaterialColors.b(com.woolworths.R.attr.colorOnSurface, this);
            this.b0 = new ColorStateList(d0, new int[]{MaterialColors.g(0.54f, iB, iB2), MaterialColors.g(0.32f, iB, iB3), MaterialColors.g(0.12f, iB, iB2), MaterialColors.g(0.12f, iB, iB3)});
        }
        return this.b0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.c0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.c0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.switchStyle);
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084108), attributeSet, i);
        Context context2 = getContext();
        this.W = new ElevationOverlayProvider(context2);
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.d0, i, 2132084108, new int[0]);
        this.c0 = typedArrayD.getBoolean(0, false);
        typedArrayD.recycle();
    }
}
