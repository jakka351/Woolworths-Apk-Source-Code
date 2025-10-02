package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialDynamicColors {
    public static DynamicColor c() {
        return new DynamicColor("inverse_surface", new c(20), new c(22), false, null, null, null);
    }

    public final DynamicColor a() {
        return new DynamicColor("error", new c(12), new c(13), true, new d(this), new ContrastCurve(), new a(this, 13));
    }

    public final DynamicColor b() {
        return new DynamicColor("error_container", new c(27), new c(28), true, new d(this), new ContrastCurve(), new a(this, 15));
    }

    public final DynamicColor d() {
        return new DynamicColor("primary", new c(29), new au.com.woolworths.android.onesite.network.a(3), true, new d(this), new ContrastCurve(), new a(this, 0));
    }

    public final DynamicColor e() {
        return new DynamicColor("primary_container", new au.com.woolworths.android.onesite.network.a(20), new au.com.woolworths.android.onesite.network.a(21), true, new d(this), new ContrastCurve(), new a(this, 3));
    }

    public final DynamicColor f() {
        return new DynamicColor("secondary", new b(28), new b(29), true, new d(this), new ContrastCurve(), new a(this, 9));
    }

    public final DynamicColor g() {
        return new DynamicColor("secondary_container", new au.com.woolworths.android.onesite.network.a(14), new au.com.woolworths.android.onesite.network.a(15), true, new d(this), new ContrastCurve(), new a(this, 2));
    }

    public final DynamicColor h() {
        return new DynamicColor("tertiary", new au.com.woolworths.android.onesite.network.a(4), new au.com.woolworths.android.onesite.network.a(5), true, new d(this), new ContrastCurve(), new a(this, 1));
    }

    public final DynamicColor i() {
        return new DynamicColor("tertiary_container", new b(23), new b(24), true, new d(this), new ContrastCurve(), new a(this, 7));
    }
}
