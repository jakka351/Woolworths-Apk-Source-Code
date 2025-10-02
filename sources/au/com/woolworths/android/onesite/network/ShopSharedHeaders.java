package au.com.woolworths.android.onesite.network;

import android.app.Application;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.adobe.AdobeAnalyticsInteractor;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.tealium.core.Tealium;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/ShopSharedHeaders;", "Lau/com/woolworths/android/onesite/network/SharedHeaders;", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopSharedHeaders implements SharedHeaders {

    /* renamed from: a, reason: collision with root package name */
    public final Application f4578a;
    public final ShopAccountInteractor b;
    public final AdobeAnalyticsInteractor c;
    public final Tealium d;
    public final ShopAppRegionInteractor e;
    public final FeatureToggleManager f;
    public final String g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/ShopSharedHeaders$Companion;", "", "", "TEALIUM_SESSION_KEY", "Ljava/lang/String;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShopSharedHeaders(Application application, ShopAccountInteractor accountInteractor, AdobeAnalyticsInteractor adobeAnalyticsInteractor, Tealium tealium, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, ShopAppRegionInteractor shopAppRegionInteractor, FeatureToggleManager featureToggleManager, AppEnvironment environment) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(adobeAnalyticsInteractor, "adobeAnalyticsInteractor");
        Intrinsics.h(tealium, "tealium");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(environment, "environment");
        this.f4578a = application;
        this.b = accountInteractor;
        this.c = adobeAnalyticsInteractor;
        this.d = tealium;
        this.e = shopAppRegionInteractor;
        this.f = featureToggleManager;
        if (!(environment instanceof AppEnvironment.Mock) && !(environment instanceof AppEnvironment.Test) && !(environment instanceof AppEnvironment.Uat) && !(environment instanceof AppEnvironment.Dev) && !environment.equals(AppEnvironment.Production.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.g = "ziFxVAagz3kO2H2s3uhLGhhCfPeg0mwQ";
    }

    @Override // au.com.woolworths.android.onesite.network.SharedHeaders
    public final String a() {
        Application application = this.f4578a;
        return YU.a.m(YU.a.v("Supers/", ContextExtKt.c(application), " (", (application.getResources().getConfiguration().screenLayout & 15) >= 3 ? "AndroidTablet" : "AndroidPhone", "; "), Build.VERSION.SDK_INT, ")");
    }

    @Override // au.com.woolworths.android.onesite.network.SharedHeaders
    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("X-Api-Key", this.g), new Pair("X-Correlation-Id", UUID.randomUUID().toString()), new Pair("wx-user-timezone", TimeZone.getDefault().getID()));
        Member memberN = this.b.n();
        if (memberN != null) {
        }
        String strG = this.d.w.G("tealium_session_id");
        if (strG != null) {
        }
        linkedHashMapL.put("X-Adobe-Ecid", this.c.c.a());
        linkedHashMapL.put("x-woolies-aem-preview", String.valueOf(false));
        linkedHashMapL.put("x-woolies-region", this.e.b().d);
        if (this.f.c(BaseShopAppFeature.v0)) {
            linkedHashMapL.put("wx-sdui-data-source", "fdc");
        }
        return linkedHashMapL;
    }
}
