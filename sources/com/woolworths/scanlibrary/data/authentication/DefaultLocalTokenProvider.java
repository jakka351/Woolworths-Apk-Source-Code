package com.woolworths.scanlibrary.data.authentication;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/authentication/DefaultLocalTokenProvider;", "Lcom/woolworths/scanlibrary/data/authentication/LocalTokenProvider;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DefaultLocalTokenProvider implements LocalTokenProvider {
    public static final /* synthetic */ KProperty[] d;

    /* renamed from: a, reason: collision with root package name */
    public final SecuredSharedPreference f21152a;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 b;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DefaultLocalTokenProvider.class, "token", "getToken()Ljava/lang/String;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        d = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(DefaultLocalTokenProvider.class, "access", "getAccess()Ljava/lang/String;", 0, reflectionFactory)};
    }

    public DefaultLocalTokenProvider(SecuredSharedPreference securedSharedPreference) {
        this.f21152a = securedSharedPreference;
        this.b = SharedPreferenceExtKt.c(securedSharedPreference, "", "refreshToken");
        this.c = SharedPreferenceExtKt.c(securedSharedPreference, "", "accessToken");
    }

    public final String a() {
        return (String) this.c.getValue(this, d[1]);
    }

    public final String b() {
        return (String) this.b.getValue(this, d[0]);
    }

    public final void c(String value) {
        Intrinsics.h(value, "value");
        this.c.setValue(this, d[1], value);
        this.f21152a.edit().commit();
    }

    public final void d(String value) {
        Intrinsics.h(value, "value");
        this.b.setValue(this, d[0], value);
        this.f21152a.edit().commit();
    }
}
