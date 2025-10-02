package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes6.dex */
public class MaterialShapeUtils {
    public static CornerTreatment a(int i) {
        if (i != 0 && i == 1) {
            return new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    public static void b(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).l(f);
        }
    }

    public static void c(View view, MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.d.b;
        if (elevationOverlayProvider == null || !elevationOverlayProvider.f14574a) {
            return;
        }
        float fK = BitmapDescriptorFactory.HUE_RED;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fK += ViewCompat.k((View) parent);
        }
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.d;
        if (materialShapeDrawableState.l != fK) {
            materialShapeDrawableState.l = fK;
            materialShapeDrawable.w();
        }
    }

    public static void d(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            c(viewGroup, (MaterialShapeDrawable) background);
        }
    }
}
