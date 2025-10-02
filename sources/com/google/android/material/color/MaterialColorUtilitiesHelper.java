package com.google.android.material.color;

import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.ContrastCurve;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.a;
import com.google.android.material.color.utilities.b;
import com.google.android.material.color.utilities.c;
import com.google.android.material.color.utilities.d;
import com.woolworths.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialColorUtilitiesHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f14553a;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        HashMap map = new HashMap();
        map.put(Integer.valueOf(R.color.material_personalized_color_primary), materialDynamicColors.d());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary), new DynamicColor("on_primary", new b(4), new b(5), false, new a(materialDynamicColors, 4), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), new DynamicColor("inverse_primary", new b(7), new b(8), false, new b(materialDynamicColors, 9), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_container), materialDynamicColors.e());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), new DynamicColor("on_primary_container", new b(14), new b(materialDynamicColors, 16), false, new a(materialDynamicColors, 6), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary), materialDynamicColors.f());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), new DynamicColor("on_secondary", new b(26), new b(27), false, new a(materialDynamicColors, 8), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), materialDynamicColors.g());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), new DynamicColor("on_secondary_container", new c(9), new c(materialDynamicColors, 10), false, new a(materialDynamicColors, 12), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary), materialDynamicColors.h());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), new DynamicColor("on_tertiary", new b(15), new b(25), false, new a(materialDynamicColors, 10), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), materialDynamicColors.i());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), new DynamicColor("on_tertiary_container", new c(7), new c(materialDynamicColors, 8), false, new a(materialDynamicColors, 11), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_background), new DynamicColor("background", new au.com.woolworths.android.onesite.network.a(22), new au.com.woolworths.android.onesite.network.a(23), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_background), new DynamicColor("on_background", new au.com.woolworths.android.onesite.network.a(27), new au.com.woolworths.android.onesite.network.a(28), false, new au.com.woolworths.android.onesite.network.a(materialDynamicColors), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface), new DynamicColor("surface", new au.com.woolworths.android.onesite.network.a(2), new au.com.woolworths.android.onesite.network.a(16), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface), new DynamicColor("on_surface", new c(11), new c(21), false, new d(materialDynamicColors), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), new DynamicColor("surface_variant", new b(17), new b(18), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), new DynamicColor("on_surface_variant", new c(18), new c(19), false, new d(materialDynamicColors), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), MaterialDynamicColors.c());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), new DynamicColor("inverse_on_surface", new c(4), new c(5), false, new c(materialDynamicColors, 6), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), new DynamicColor("surface_bright", new b(2), new b(3), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), new DynamicColor("surface_dim", new au.com.woolworths.android.onesite.network.a(6), new au.com.woolworths.android.onesite.network.a(7), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container), new DynamicColor("surface_container", new c(16), new c(17), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), new DynamicColor("surface_container_low", new au.com.woolworths.android.onesite.network.a(12), new au.com.woolworths.android.onesite.network.a(13), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), new DynamicColor("surface_container_high", new au.com.woolworths.android.onesite.network.a(24), new au.com.woolworths.android.onesite.network.a(26), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), new DynamicColor("surface_container_lowest", new c(0), new c(1), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), new DynamicColor("surface_container_highest", new b(21), new b(22), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline), new DynamicColor("outline", new c(2), new c(3), false, new d(materialDynamicColors), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), new DynamicColor("outline_variant", new b(0), new b(1), false, new d(materialDynamicColors), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error), materialDynamicColors.a());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error), new DynamicColor("on_error", new b(10), new b(11), false, new a(materialDynamicColors, 5), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error_container), materialDynamicColors.b());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), new DynamicColor("on_error_container", new c(23), new c(24), false, new a(materialDynamicColors, 14), new ContrastCurve(), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_activated), DynamicColor.a("control_activated", new au.com.woolworths.android.onesite.network.a(10), new au.com.woolworths.android.onesite.network.a(11)));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_normal), DynamicColor.a("control_normal", new au.com.woolworths.android.onesite.network.a(8), new au.com.woolworths.android.onesite.network.a(9)));
        Integer numValueOf = Integer.valueOf(R.color.material_personalized_color_control_highlight);
        new au.com.woolworths.android.onesite.network.a(17);
        new au.com.woolworths.android.onesite.network.a(18);
        new au.com.woolworths.android.onesite.network.a(19);
        DynamicColor dynamicColor = new DynamicColor();
        new HashMap();
        map.put(numValueOf, dynamicColor);
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), DynamicColor.a("text_primary_inverse", new c(14), new c(15)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), DynamicColor.a("text_secondary_and_tertiary_inverse", new c(25), new c(26)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), DynamicColor.a("text_secondary_and_tertiary_inverse_disabled", new au.com.woolworths.android.onesite.network.a(25), new b(6)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), DynamicColor.a("text_primary_inverse_disable_only", new b(12), new b(13)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), DynamicColor.a("text_hint_inverse", new b(19), new b(20)));
        f14553a = Collections.unmodifiableMap(map);
    }
}
