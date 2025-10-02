package au.com.woolworths.devicefingerprint;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.akamai.botman.CYFMonitor;
import com.cyberfend.cyfsecurity.CYFManager;
import com.google.gson.Gson;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/devicefingerprint/BotmanagerInteractor;", "", "Companion", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BotmanagerInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f5167a;
    public final AppConfig b;
    public final FirebasePerfMonitor c;
    public final Gson d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/devicefingerprint/BotmanagerInteractor$Companion;", "", "", "AKAMAI_BOTMANAGER_INITIALIZE_SDK", "Ljava/lang/String;", "AKAMAI_BOTMANAGER_GET_SENSOR_DATA", "AKAMAI_INVALID_CONFIG_MESSAGE", "device-fingerprint_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BotmanagerInteractor(FeatureToggleManager featureToggleManager, AppConfig appConfig, FirebasePerfMonitor firebasePerfMonitor, Gson gson) {
        ShopRemoteConfig shopRemoteConfig = ShopRemoteConfig.e;
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(appConfig, "appConfig");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(gson, "gson");
        this.f5167a = featureToggleManager;
        this.b = appConfig;
        this.c = firebasePerfMonitor;
        this.d = gson;
    }

    public final String a() {
        String strI;
        this.c.c("akamai_botmanager_get_sensor_data");
        synchronized (CYFMonitor.class) {
            CYFManager cYFManager = com.cyberfend.cyfsecurity.CYFMonitor.f14058a;
            synchronized (com.cyberfend.cyfsecurity.CYFMonitor.class) {
                strI = com.cyberfend.cyfsecurity.CYFMonitor.f14058a.i();
            }
        }
        this.c.d("akamai_botmanager_get_sensor_data");
        Intrinsics.e(strI);
        return strI;
    }

    public final AkamaiBotmanagerConfig b() {
        String strE = this.f5167a.e(ShopRemoteConfig.e, false);
        if (strE.length() == 0) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(ReportOwner.Squad.d.a(), new IllegalStateException("Not a valid AkamaiBMP config"), null, 12);
        }
        Object objD = this.d.d(AkamaiBotmanagerConfig.class, strE);
        Intrinsics.g(objD, "fromJson(...)");
        return (AkamaiBotmanagerConfig) objD;
    }

    public final boolean c(String str) {
        List listB = b().getProtectedPaths();
        if (!(listB instanceof Collection) || !listB.isEmpty()) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (StringsKt.W(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
