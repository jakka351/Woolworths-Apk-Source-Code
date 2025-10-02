package au.com.woolworths.scanandgo;

import android.app.Application;
import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.extensions.SharedPreferenceExtKt;
import au.com.woolworths.scanandgo.network.ScanAndGoApi;
import com.woolworths.scanlibrary.util.device.DeviceInfoProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/scanandgo/ScanAndGoRepository;", "", "Companion", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScanAndGoRepository {
    public static final /* synthetic */ KProperty[] d = {Reflection.f24268a.e(new MutablePropertyReference1Impl(ScanAndGoRepository.class, "isSngCoachMarkShown", "isSngCoachMarkShown()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final Application f9982a;
    public final ScanAndGoApi b;
    public final DeviceInfoProvider c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/scanandgo/ScanAndGoRepository$Companion;", "", "", "PREF_SNG_COACHMARK_SHOWN", "Ljava/lang/String;", "shop-scan-and-go_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ScanAndGoRepository(Application application, ScanAndGoApi scanAndGoApi, DeviceInfoProvider deviceInfoProvider, SharedPreferences sharedPreferences) {
        Intrinsics.h(deviceInfoProvider, "deviceInfoProvider");
        this.f9982a = application;
        this.b = scanAndGoApi;
        this.c = deviceInfoProvider;
        SharedPreferenceExtKt.b(sharedPreferences, "sng_coachmark", 1);
    }
}
