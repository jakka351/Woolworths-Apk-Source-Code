package au.com.woolworths.android.onesite.config;

import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.appdata.AppEnvironment;
import au.com.woolworths.android.onesite.appdata.ShopAppAuBuildConfig;
import au.com.woolworths.android.onesite.appdata.ShopAppNzBuildConfig;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/config/ShopAppBuildConfigManager;", "Lau/com/woolworths/android/onesite/appdata/AppBuildConfig;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShopAppBuildConfigManager implements AppBuildConfig {
    public final ShopAppRegionInteractor d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
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

    public ShopAppBuildConfigManager(ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, ShopAppRegionInteractor shopRegionInteractor) {
        Intrinsics.h(shopRegionInteractor, "shopRegionInteractor");
        this.d = shopRegionInteractor;
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
    public final String a() {
        return c().a();
    }

    @Override // au.com.woolworths.android.onesite.appdata.AppBuildConfig
    public final String b() {
        return c().b();
    }

    public final AppBuildConfig c() {
        int iOrdinal = this.d.b().ordinal();
        if (iOrdinal == 0) {
            if (AppEnvironment.Production.INSTANCE != null) {
                return ShopAppAuBuildConfig.h;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        if (AppEnvironment.Production.INSTANCE != null) {
            return ShopAppNzBuildConfig.h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
