package com.woolworths.scanlibrary.configuration;

import android.content.SharedPreferences;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$boolean$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$int$$inlined$delegate$1;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import com.woolworths.scanlibrary.models.authentication.Banner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/configuration/UserConfigurations;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserConfigurations {
    public static final /* synthetic */ KProperty[] k;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 f21148a;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 b;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 c;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 d;
    public final SharedPreferenceExtKt$int$$inlined$delegate$1 e;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 f;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 g;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 h;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 i;
    public final SharedPreferenceExtKt$boolean$$inlined$delegate$1 j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/configuration/UserConfigurations$Companion;", "", "", "CONSTANT_DEFAULT_TIME_OUT_DURATION_MS", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(UserConfigurations.class, "enableVibration", "getEnableVibration()Z", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        k = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(UserConfigurations.class, "playSoundOnScan", "getPlaySoundOnScan()Z", 0, reflectionFactory), b.y(UserConfigurations.class, "scannerTimeOutDuration", "getScannerTimeOutDuration()Ljava/lang/String;", 0, reflectionFactory), b.y(UserConfigurations.class, "listAutoCheckOff", "getListAutoCheckOff()Z", 0, reflectionFactory), b.y(UserConfigurations.class, "lastUsedCameraFace", "getLastUsedCameraFace()I", 0, reflectionFactory), b.y(UserConfigurations.class, "lastWhatNewVersion", "getLastWhatNewVersion()I", 0, reflectionFactory), b.y(UserConfigurations.class, "lastWhatNewVersionName", "getLastWhatNewVersionName()Ljava/lang/String;", 0, reflectionFactory), b.y(UserConfigurations.class, "doNotRemindMeScanAndBagPrompt", "getDoNotRemindMeScanAndBagPrompt()Z", 0, reflectionFactory), b.y(UserConfigurations.class, "doNotRemindMeScanAndWeightPrompt", "getDoNotRemindMeScanAndWeightPrompt()Z", 0, reflectionFactory), b.y(UserConfigurations.class, "viewedScanAndWeightPrompt", "getViewedScanAndWeightPrompt()Z", 0, reflectionFactory), b.y(UserConfigurations.class, "lastLoginId", "getLastLoginId()Ljava/lang/String;", 0, reflectionFactory), b.y(UserConfigurations.class, "lastLoginMode", "getLastLoginMode()Ljava/lang/String;", 0, reflectionFactory), b.y(UserConfigurations.class, "onBoardingCompleted", "getOnBoardingCompleted()Z", 0, reflectionFactory)};
    }

    public UserConfigurations(SharedPreferences prefs) {
        Intrinsics.h(prefs, "prefs");
        this.f21148a = SharedPreferenceExtKt.a(prefs, "preferenceKeyScanVibrate", true);
        this.b = SharedPreferenceExtKt.a(prefs, "preferenceKeyScanSound", true);
        this.c = SharedPreferenceExtKt.c(prefs, "20000", "preferenceKeyScannerTimer");
        this.d = SharedPreferenceExtKt.a(prefs, "preferenceKeyListAutoCheckOff", true);
        this.e = new SharedPreferenceExtKt$int$$inlined$delegate$1(prefs, "lastWhatNewVersion", 0);
        this.f = SharedPreferenceExtKt.c(prefs, "", "lastWhatNewVersionName");
        this.g = SharedPreferenceExtKt.a(prefs, "preferenceKeyDoNotRemindMeScanAndBagPrompt", false);
        this.h = SharedPreferenceExtKt.a(prefs, "preferenceKeyDoNotRemindMeScanAndWeightPrompt", false);
        this.i = SharedPreferenceExtKt.a(prefs, "preferenceKeyViewedScanAndWeightPrompt", false);
        SharedPreferenceExtKt.c(prefs, "", "lastLoginId");
        SharedPreferenceExtKt.c(prefs, Banner.REWARDS.getBannerName(), "lastLoginMode");
        this.j = SharedPreferenceExtKt.a(prefs, "onBoardingCompleted", false);
    }

    public final boolean a() {
        return ((Boolean) this.j.getValue(this, k[12])).booleanValue();
    }

    public final void b(String str) {
        Intrinsics.h(str, "<set-?>");
        this.f.setValue(this, k[6], str);
    }
}
