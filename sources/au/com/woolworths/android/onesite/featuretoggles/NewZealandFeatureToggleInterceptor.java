package au.com.woolworths.android.onesite.featuretoggles;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.remoteconfig.RemoteConfig;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures;
import au.com.woolworths.feature.shop.catalogue.CatalogueFeature;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.product.ProductFeature;
import au.com.woolworths.rewards.base.featuretoggles.RewardsRemoteConfig;
import au.com.woolworths.shop.buyagain.ShopBuyAgainFeature;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.specials.SpecialsHomeFeature;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/NewZealandFeatureToggleInterceptor;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NewZealandFeatureToggleInterceptor implements FeatureToggleManager {
    public static final Set c = ArraysKt.r0(new Feature[]{ShopBuyAgainFeature.e, BaseShopAppFeature.v, HomeFeature.i, SpecialsHomeFeature.h, BaseShopAppFeature.H, CatalogueFeature.g, ShoppingListsFeature.j, BaseShopAppFeature.a0, AskOliveFeatures.g, HomeFeature.j, ProductFeature.d, ProductFeature.f, ShoppingListsFeature.e});

    /* renamed from: a, reason: collision with root package name */
    public final FeatureToggleManager f4258a;
    public final ShopAppRegionInteractor b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/NewZealandFeatureToggleInterceptor$Companion;", "", "", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "FeaturesToDisableForNz", "Ljava/util/Set;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public NewZealandFeatureToggleInterceptor(FeatureToggleManagerImpl wrappedFeatureToggleManager, ShopAppRegionInteractor regionInteractor) {
        Intrinsics.h(wrappedFeatureToggleManager, "wrappedFeatureToggleManager");
        Intrinsics.h(regionInteractor, "regionInteractor");
        this.f4258a = wrappedFeatureToggleManager;
        this.b = regionInteractor;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final StateFlow a(Feature feature) {
        return (this.b.b() == Region.j && c.contains(feature)) ? StateFlowKt.a(Boolean.FALSE) : this.f4258a.a(feature);
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final void activate() {
        this.f4258a.activate();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final StateFlow b() {
        RewardsRemoteConfig rewardsRemoteConfig = RewardsRemoteConfig.e;
        return this.f4258a.b();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final boolean c(Feature feature) {
        Intrinsics.h(feature, "feature");
        return !(this.b.b() == Region.j && c.contains(feature)) && this.f4258a.c(feature);
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final void d() {
        this.f4258a.d();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager
    public final String e(RemoteConfig config, boolean z) {
        Intrinsics.h(config, "config");
        return this.f4258a.e(config, z);
    }
}
