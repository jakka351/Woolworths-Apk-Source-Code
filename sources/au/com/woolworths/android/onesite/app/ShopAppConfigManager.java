package au.com.woolworths.android.onesite.app;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.tealium.TealiumConfigData;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.braintree.MagnesEnvironment;
import au.com.woolworths.android.onesite.devicefingerprint.DeviceFingerprintConfigData;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.mandy.MagicLinkConfigData;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.notification.SwrveConfigData;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/app/ShopAppConfigManager;", "Lau/com/woolworths/android/onesite/appdata/AppConfig;", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShopAppConfigManager implements AppConfig {
    public final ShopAppRegionInteractor d;
    public final FeatureToggleManager e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Region.Companion companion = Region.h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ShopAppConfigManager(ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, ShopAppRegionInteractor shopRegionInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.d = shopRegionInteractor;
        this.e = featureToggleManager;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final String a() {
        return h().a();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: b */
    public final String getN() {
        return h().getN();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final TealiumConfigData c() {
        return h().c();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: e */
    public final SwrveConfigData getP() {
        return h().getP();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: f */
    public final String getV() {
        return h().getV();
    }

    public final ShopAppAuConfig g() {
        if (AppEnvironment.Production.INSTANCE != null) {
            return ShopAppAuConfig.i;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AppConfig h() {
        AppConfig appConfigG;
        int iOrdinal = this.d.b().ordinal();
        if (iOrdinal == 0) {
            appConfigG = g();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if (AppEnvironment.Production.INSTANCE == null) {
                throw new NoWhenBranchMatchedException();
            }
            appConfigG = ShopAppNzConfig.i;
        }
        if (!this.e.c(BaseShopAppFeature.c0)) {
            appConfigG = null;
        }
        return appConfigG == null ? g() : appConfigG;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: l */
    public final String getT() {
        return h().getT();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: m */
    public final DeviceFingerprintConfigData getU() {
        return h().getU();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: n */
    public final MagicLinkConfigData getD() {
        return h().getD();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: o */
    public final String getO() {
        return h().getO();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: p */
    public final String getM() {
        return h().getM();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: q */
    public final String getR() {
        return h().getR();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: r */
    public final String getL() {
        return h().getL();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: s */
    public final String getQ() {
        return h().getQ();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: t */
    public final MagnesEnvironment getW() {
        return h().getW();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: u */
    public final String getY() {
        return h().getY();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final String w() {
        return h().w();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: x */
    public final String getX() {
        return h().getX();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    /* renamed from: y */
    public final String getS() {
        return h().getS();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppConfig
    public final String z() {
        return h().z();
    }
}
