package com.woolworths.scanlibrary.configuration;

import android.content.SharedPreferences;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/configuration/AppConfigurations;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppConfigurations {
    public static final /* synthetic */ KProperty[] b;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 f21147a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(AppConfigurations.class, "showToolTip", "getShowToolTip()Z", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        b = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(AppConfigurations.class, "autoLocateStore", "getAutoLocateStore()Z", 0, reflectionFactory)};
    }

    public AppConfigurations(SharedPreferences prefs) {
        Intrinsics.h(prefs, "prefs");
        SharedPreferenceExtKt.a(prefs, "showToolTip", true);
        this.f21147a = SharedPreferenceExtKt.b(prefs, "autoLocateStore", 1);
    }
}
