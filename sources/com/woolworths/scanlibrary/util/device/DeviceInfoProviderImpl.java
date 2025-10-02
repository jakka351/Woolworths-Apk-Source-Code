package com.woolworths.scanlibrary.util.device;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt$string$$inlined$delegate$1;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.woolworths.scanlibrary.configuration.ScanAndGoFeatureConfig;
import com.woolworths.scanlibrary.models.device.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/device/DeviceInfoProviderImpl;", "Lcom/woolworths/scanlibrary/util/device/DeviceInfoProvider;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceInfoProviderImpl implements DeviceInfoProvider {
    public static final /* synthetic */ KProperty[] d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21366a;
    public final ScanAndGoFeatureConfig b;
    public final SharedPreferenceExtKt$string$$inlined$delegate$1 c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/util/device/DeviceInfoProviderImpl$Companion;", "", "", "KEY_CLOUD_MESSAGE_TOKEN_KEY", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DeviceInfoProviderImpl.class, "cloudMessagingToken", "getCloudMessagingToken()Ljava/lang/String;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        d = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(DeviceInfoProviderImpl.class, "isTokenSynced", "isTokenSynced()Z", 0, reflectionFactory)};
    }

    public DeviceInfoProviderImpl(Context context, SharedPreferences prefs, ScanAndGoFeatureConfig config) {
        Intrinsics.h(context, "context");
        Intrinsics.h(prefs, "prefs");
        Intrinsics.h(config, "config");
        this.f21366a = context;
        this.b = config;
        this.c = SharedPreferenceExtKt.c(prefs, "", "cloudMessagingToken");
        SharedPreferenceExtKt.b(prefs, "isTokenSynced", 1);
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final String a() {
        return (String) this.c.getValue(this, d[0]);
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final void b(String str) {
        this.c.setValue(this, d[0], str);
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final DeviceInfo c() {
        String deviceId = getDeviceId();
        d();
        String str = Build.MANUFACTURER;
        getDeviceModel();
        return new DeviceInfo(deviceId, "android", b.o(str, " ", Build.MODEL), String.valueOf(Build.VERSION.SDK_INT), getAppVersionName());
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final void d() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.g(MANUFACTURER, "MANUFACTURER");
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final String getAppId() {
        this.b.getClass();
        return "shopapp_android_sng";
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final String getAppVersion() {
        return getAppVersionName();
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final int getAppVersionCode() {
        Context context = this.f21366a;
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final String getAppVersionName() {
        Context context = this.f21366a;
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        return str == null ? "" : str;
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final String getDeviceId() {
        this.b.getClass();
        return a.A("ShopApp", Settings.Secure.getString(this.f21366a.getContentResolver(), nnlllnn.nnlllln.w007700770077www));
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final void getDeviceModel() {
        String MODEL = Build.MODEL;
        Intrinsics.g(MODEL, "MODEL");
    }

    @Override // com.woolworths.scanlibrary.util.device.DeviceInfoProvider
    public final String getOsVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }
}
