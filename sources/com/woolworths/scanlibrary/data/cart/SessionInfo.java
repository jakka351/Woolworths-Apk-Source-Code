package com.woolworths.scanlibrary.data.cart;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$int$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import au.com.woolworths.shop.securedpreference.preference.SecuredSharedPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/cart/SessionInfo;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionInfo {
    public static final /* synthetic */ KProperty[] k;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferenceExtKt$int$$inlined$delegate$1 f21155a;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 b;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 c;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 d;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 e;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 f;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 g;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 h;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 i;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 j;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SessionInfo.class, "userStoreId", "getUserStoreId()I", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        k = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(SessionInfo.class, "userStoreName", "getUserStoreName()Ljava/lang/String;", 0, reflectionFactory), b.y(SessionInfo.class, "lastTappedDevice", "getLastTappedDevice()Ljava/lang/String;", 0, reflectionFactory), b.y(SessionInfo.class, "isCheckOutComplete", "isCheckOutComplete()Z", 0, reflectionFactory), b.y(SessionInfo.class, "isThresholdAlertViewed", "isThresholdAlertViewed()Z", 0, reflectionFactory), b.y(SessionInfo.class, "isMaxCartAmountAlertViewed", "isMaxCartAmountAlertViewed()Z", 0, reflectionFactory), b.y(SessionInfo.class, "fireStoreDocumentPath", "getFireStoreDocumentPath()Ljava/lang/String;", 0, reflectionFactory), b.y(SessionInfo.class, "metrogoScanCompleted", "getMetrogoScanCompleted()Z", 0, reflectionFactory), b.y(SessionInfo.class, "isScanGoEnabled", "isScanGoEnabled()Z", 0, reflectionFactory), b.y(SessionInfo.class, "storeWelcomeViewed", "getStoreWelcomeViewed()Z", 0, reflectionFactory)};
    }

    public SessionInfo(SecuredSharedPreference securedSharedPreference) {
        this.f21155a = new SharedPreferenceExtKt$int$$inlined$delegate$1(securedSharedPreference, "userStoreId", -1);
        this.b = SharedPreferenceExtKt.c(securedSharedPreference, "", "userStoreName");
        this.c = SharedPreferenceExtKt.c(securedSharedPreference, "", "lastTappedDevice");
        this.d = SharedPreferenceExtKt.b(securedSharedPreference, "isCheckOutComplete", 1);
        this.e = SharedPreferenceExtKt.b(securedSharedPreference, "isThresholdAlertViewed", 1);
        this.f = SharedPreferenceExtKt.b(securedSharedPreference, "isMaxCartAmountAlertViewed", 1);
        this.g = SharedPreferenceExtKt.c(securedSharedPreference, "", "fireStoreDocumentPath");
        this.h = SharedPreferenceExtKt.b(securedSharedPreference, "metrogoScanCompleted", 1);
        this.i = SharedPreferenceExtKt.b(securedSharedPreference, "isScanGoEnabled", 1);
        this.j = SharedPreferenceExtKt.b(securedSharedPreference, "storeWelcomeViewed", 1);
    }

    public final void a() {
        KProperty[] kPropertyArr = k;
        this.f21155a.setValue(this, kPropertyArr[0], -1);
        c("");
        this.c.setValue(this, kPropertyArr[2], "");
        KProperty kProperty = kPropertyArr[3];
        Boolean bool = Boolean.FALSE;
        this.d.setValue(this, kProperty, bool);
        this.e.setValue(this, kPropertyArr[4], bool);
        this.f.setValue(this, kPropertyArr[5], bool);
        this.g.setValue(this, kPropertyArr[6], "");
        this.h.setValue(this, kPropertyArr[7], bool);
        this.i.setValue(this, kPropertyArr[8], bool);
        this.j.setValue(this, kPropertyArr[9], bool);
    }

    public final int b() {
        return ((Number) this.f21155a.getValue(this, k[0])).intValue();
    }

    public final void c(String str) {
        Intrinsics.h(str, "<set-?>");
        this.b.setValue(this, k[1], str);
    }
}
