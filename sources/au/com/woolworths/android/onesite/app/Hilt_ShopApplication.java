package au.com.woolworths.android.onesite.app;

import au.com.woolworths.android.onesite.app.DaggerShopApplication_HiltComponents_SingletonC;
import au.com.woolworths.android.onesite.app.di.AppConfigModule;
import au.com.woolworths.android.onesite.app.di.AppModule;
import au.com.woolworths.android.onesite.app.di.LegacyDigipayModule;
import au.com.woolworths.android.onesite.app.di.NavigationModule;
import au.com.woolworths.android.onesite.app.di.NetworkModule;
import au.com.woolworths.android.onesite.app.di.NotificationModule;
import au.com.woolworths.android.onesite.app.di.SduiModule;
import au.com.woolworths.android.onesite.app.di.ShopAppRegionModule;
import au.com.woolworths.android.onesite.di.AppBuildConfigModule;
import au.com.woolworths.android.onesite.di.BaseDataModule;
import au.com.woolworths.android.onesite.di.BaseNetworkModule;
import au.com.woolworths.android.onesite.di.ReleaseModule;
import au.com.woolworths.android.onesite.di.modules.HttpInterceptorModule;
import au.com.woolworths.android.onesite.di.modules.LegacyAppModule;
import au.com.woolworths.android.onesite.di.modules.LegacyDataModule;
import au.com.woolworths.android.onesite.modules.checkout.di.CheckoutAppModule;
import au.com.woolworths.base.rewards.account.di.RewardsAccountAppModule;
import au.com.woolworths.base.shopapp.di.BaseShopAppModule;
import au.com.woolworths.devicefingerprint.di.DeviceFingerprintAppModule;
import au.com.woolworths.feature.product.list.di.ProductListAppModule;
import au.com.woolworths.feature.rewards.account.di.RewardsPreferencesAppModule;
import au.com.woolworths.feature.rewards.card.di.RewardsCardAppModule;
import au.com.woolworths.feature.rewards.offers.di.RewardsOffersAppModule;
import au.com.woolworths.feature.rewards.offers.tigernew.TigerNewOffersModule;
import au.com.woolworths.feature.rewards.permissions.PushNotificationPermissionModule;
import au.com.woolworths.feature.shared.instore.wifi.di.InStoreWifiAppModule;
import au.com.woolworths.feature.shop.ask.olive.di.ShopAskOliveAppModule;
import au.com.woolworths.feature.shop.catalogue.di.CatalogueAppModule;
import au.com.woolworths.feature.shop.delivery.address.di.DeliveryAddressAppModule;
import au.com.woolworths.feature.shop.homepage.di.HomepageAppModule;
import au.com.woolworths.feature.shop.instore.cart.di.InstoreCartAppModule;
import au.com.woolworths.feature.shop.instore.navigation.di.InstoreNavigationAppModule;
import au.com.woolworths.feature.shop.instore.presence.di.InstorePresenceAppModule;
import au.com.woolworths.feature.shop.login.di.ShopLoginAppModule;
import au.com.woolworths.feature.shop.marketplace.di.ShopMarketplaceAppModule;
import au.com.woolworths.feature.shop.more.di.MoreFeatureAppModule;
import au.com.woolworths.feature.shop.myorders.di.ShopMyOrdersAppModule;
import au.com.woolworths.feature.shop.onboarding.sdui.di.OnboardingSduiAppModule;
import au.com.woolworths.feature.shop.product.availability.di.ProductAvailabilityModule;
import au.com.woolworths.feature.shop.recipes.details.di.RecipeDetailsAppModule;
import au.com.woolworths.feature.shop.recipes.recipes.di.RecipesAppModule;
import au.com.woolworths.feature.shop.shippingcalculator.di.ShippingCalculatorAppModule;
import au.com.woolworths.feature.shop.storelocator.di.ShopStoreLocatorAppModule;
import au.com.woolworths.feature.shop.voc.di.VocAppModule;
import au.com.woolworths.feature.shop.wpay.di.ShopWPayAppModule;
import au.com.woolworths.foundation.advertising.data.di.AdvertisingAppModule;
import au.com.woolworths.foundation.force.upgrade.impl.di.ForceUpgradeAppModule;
import au.com.woolworths.foundation.rewards.banner.dismiss.di.RemoteDismissibleBannerModule;
import au.com.woolworths.foundation.rewards.cart.info.di.CartInfoModule;
import au.com.woolworths.foundation.rewards.cart.update.di.CartUpdateModule;
import au.com.woolworths.foundation.rewards.onboarding.di.RewardsOnboardingAppModule;
import au.com.woolworths.foundation.rewards.servicemessages.di.RewardsServiceMessageModule;
import au.com.woolworths.foundation.shop.collectionmode.di.CollectionModeModule;
import au.com.woolworths.foundation.shop.editorder.di.EditOrderModule;
import au.com.woolworths.foundation.shop.olive.voice.di.OliveVoiceAppModule;
import au.com.woolworths.foundation.wxid.impl.di.WxidAppModule;
import au.com.woolworths.foundation.wxid.shop.di.ShopWxidAppModule;
import au.com.woolworths.geolocation.di.FusedLocationModule;
import au.com.woolworths.geolocation.di.GeolocationAppModule;
import au.com.woolworths.marketing.di.MarketingAppModule;
import au.com.woolworths.product.details.di.ProductDetailsAppModule;
import au.com.woolworths.product.di.ProductAppModule;
import au.com.woolworths.promotion.banner.di.PromotionBannerAppModule;
import au.com.woolworths.rewards.base.di.BaseRewardsAppModule;
import au.com.woolworths.scanandgo.di.ShopScanAndGoAppModule;
import au.com.woolworths.shop.auth.di.ShopAuthAppModule;
import au.com.woolworths.shop.buyagain.di.BuyAgainAppModule;
import au.com.woolworths.shop.checkout.di.ShopCheckoutAppModule;
import au.com.woolworths.shop.digipay.di.DigipaySdkAppModule;
import au.com.woolworths.shop.lists.data.di.ShopListsDataAppModule;
import au.com.woolworths.shop.lists.di.ShopListsAppModule;
import au.com.woolworths.shop.receipt.details.di.ShopReceiptDetailsAppModule;
import com.dynatrace.android.callback.Callback;
import com.woolworths.scanlibrary.di.module.BffScanNGoModule;
import com.woolworths.scanlibrary.di.module.ScanNGoModule;
import com.woolworths.scanlibrary.di.module.ScanNGoNotificationModule;
import com.woolworths.scanlibrary.di.module.ViewModelModule;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes.dex */
public abstract class Hilt_ShopApplication extends BaseShopApplication implements GeneratedComponentManagerHolder {
    public boolean j = false;
    public final ApplicationComponentManager k = new ApplicationComponentManager(new ComponentSupplier() { // from class: au.com.woolworths.android.onesite.app.Hilt_ShopApplication.1
        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public final Object get() {
            DaggerShopApplication_HiltComponents_SingletonC.Builder builder = new DaggerShopApplication_HiltComponents_SingletonC.Builder();
            builder.f = new ApplicationContextModule(Hilt_ShopApplication.this);
            if (builder.f4096a == null) {
                builder.f4096a = new AdvertisingAppModule();
            }
            if (builder.b == null) {
                builder.b = new AppBuildConfigModule();
            }
            if (builder.c == null) {
                builder.c = new AppConfigModule();
            }
            if (builder.d == null) {
                builder.d = new AppModule();
            }
            if (builder.e == null) {
                builder.e = new BaseShopAppModule();
            }
            if (builder.g == null) {
                builder.g = new BaseDataModule();
            }
            if (builder.h == null) {
                builder.h = new BaseNetworkModule();
            }
            if (builder.i == null) {
                builder.i = new BaseRewardsAppModule();
            }
            if (builder.j == null) {
                builder.j = new BuyAgainAppModule();
            }
            if (builder.k == null) {
                builder.k = new CartInfoModule();
            }
            if (builder.l == null) {
                builder.l = new CartUpdateModule();
            }
            if (builder.m == null) {
                builder.m = new CatalogueAppModule();
            }
            if (builder.n == null) {
                builder.n = new CheckoutAppModule();
            }
            if (builder.o == null) {
                builder.o = new CollectionModeModule();
            }
            if (builder.p == null) {
                builder.p = new DeliveryAddressAppModule();
            }
            if (builder.q == null) {
                builder.q = new DeviceFingerprintAppModule();
            }
            if (builder.r == null) {
                builder.r = new DigipaySdkAppModule();
            }
            if (builder.s == null) {
                builder.s = new EditOrderModule();
            }
            if (builder.t == null) {
                builder.t = new ForceUpgradeAppModule();
            }
            if (builder.u == null) {
                builder.u = new FusedLocationModule();
            }
            if (builder.v == null) {
                builder.v = new GeolocationAppModule();
            }
            if (builder.w == null) {
                builder.w = new HomepageAppModule();
            }
            if (builder.x == null) {
                builder.x = new HttpInterceptorModule();
            }
            if (builder.y == null) {
                builder.y = new InStoreWifiAppModule();
            }
            if (builder.z == null) {
                builder.z = new InstoreCartAppModule();
            }
            if (builder.A == null) {
                builder.A = new InstoreNavigationAppModule();
            }
            if (builder.B == null) {
                builder.B = new InstorePresenceAppModule();
            }
            if (builder.C == null) {
                builder.C = new LegacyAppModule();
            }
            if (builder.D == null) {
                builder.D = new LegacyDataModule();
            }
            if (builder.E == null) {
                builder.E = new LegacyDigipayModule();
            }
            if (builder.F == null) {
                builder.F = new MarketingAppModule();
            }
            if (builder.G == null) {
                builder.G = new MoreFeatureAppModule();
            }
            if (builder.H == null) {
                builder.H = new NavigationModule();
            }
            if (builder.I == null) {
                builder.I = new NetworkModule();
            }
            if (builder.J == null) {
                builder.J = new au.com.woolworths.android.onesite.di.modules.NetworkModule();
            }
            if (builder.K == null) {
                builder.K = new NotificationModule();
            }
            if (builder.L == null) {
                builder.L = new OliveVoiceAppModule();
            }
            if (builder.M == null) {
                builder.M = new OnboardingSduiAppModule();
            }
            if (builder.N == null) {
                builder.N = new ProductAppModule();
            }
            if (builder.O == null) {
                builder.O = new ProductAvailabilityModule();
            }
            if (builder.P == null) {
                builder.P = new ProductDetailsAppModule();
            }
            if (builder.Q == null) {
                builder.Q = new au.com.woolworths.shop.product.details.di.ProductDetailsAppModule();
            }
            if (builder.R == null) {
                builder.R = new ProductListAppModule();
            }
            if (builder.S == null) {
                builder.S = new au.com.woolworths.feature.product.list.legacy.di.ProductListAppModule();
            }
            if (builder.T == null) {
                builder.T = new au.com.woolworths.feature.product.list.v2.di.ProductListAppModule();
            }
            if (builder.U == null) {
                builder.U = new PromotionBannerAppModule();
            }
            if (builder.V == null) {
                builder.V = new PushNotificationPermissionModule();
            }
            if (builder.W == null) {
                builder.W = new RecipeDetailsAppModule();
            }
            if (builder.X == null) {
                builder.X = new RecipesAppModule();
            }
            if (builder.Y == null) {
                builder.Y = new ReleaseModule();
            }
            if (builder.Z == null) {
                builder.Z = new au.com.woolworths.feature.shop.instore.navigation.di.ReleaseModule();
            }
            if (builder.a0 == null) {
                builder.a0 = new RemoteDismissibleBannerModule();
            }
            if (builder.b0 == null) {
                builder.b0 = new RewardsAccountAppModule();
            }
            if (builder.c0 == null) {
                builder.c0 = new RewardsCardAppModule();
            }
            if (builder.d0 == null) {
                builder.d0 = new RewardsOffersAppModule();
            }
            if (builder.e0 == null) {
                builder.e0 = new RewardsOnboardingAppModule();
            }
            if (builder.f0 == null) {
                builder.f0 = new RewardsPreferencesAppModule();
            }
            if (builder.g0 == null) {
                builder.g0 = new RewardsServiceMessageModule();
            }
            if (builder.h0 == null) {
                builder.h0 = new ScanNGoModule();
            }
            if (builder.i0 == null) {
                builder.i0 = new ViewModelModule();
            }
            if (builder.j0 == null) {
                builder.j0 = new BffScanNGoModule();
            }
            if (builder.k0 == null) {
                builder.k0 = new ScanNGoNotificationModule();
            }
            if (builder.l0 == null) {
                builder.l0 = new SduiModule();
            }
            if (builder.m0 == null) {
                builder.m0 = new ShippingCalculatorAppModule();
            }
            if (builder.n0 == null) {
                builder.n0 = new ShopAppRegionModule();
            }
            if (builder.o0 == null) {
                builder.o0 = new ShopAskOliveAppModule();
            }
            if (builder.p0 == null) {
                builder.p0 = new ShopAuthAppModule();
            }
            if (builder.q0 == null) {
                builder.q0 = new ShopCheckoutAppModule();
            }
            if (builder.r0 == null) {
                builder.r0 = new ShopListsAppModule();
            }
            if (builder.s0 == null) {
                builder.s0 = new ShopListsDataAppModule();
            }
            if (builder.t0 == null) {
                builder.t0 = new ShopLoginAppModule();
            }
            if (builder.u0 == null) {
                builder.u0 = new ShopMarketplaceAppModule();
            }
            if (builder.v0 == null) {
                builder.v0 = new ShopMyOrdersAppModule();
            }
            if (builder.w0 == null) {
                builder.w0 = new ShopReceiptDetailsAppModule();
            }
            if (builder.x0 == null) {
                builder.x0 = new ShopScanAndGoAppModule();
            }
            if (builder.y0 == null) {
                builder.y0 = new ShopStoreLocatorAppModule();
            }
            if (builder.z0 == null) {
                builder.z0 = new au.com.woolworths.feature.shop.storelocator.legacy.di.ShopStoreLocatorAppModule();
            }
            if (builder.A0 == null) {
                builder.A0 = new ShopWPayAppModule();
            }
            if (builder.B0 == null) {
                builder.B0 = new ShopWxidAppModule();
            }
            if (builder.C0 == null) {
                builder.C0 = new TigerNewOffersModule();
            }
            if (builder.D0 == null) {
                builder.D0 = new VocAppModule();
            }
            if (builder.E0 == null) {
                builder.E0 = new WxidAppModule();
            }
            return new DaggerShopApplication_HiltComponents_SingletonC.SingletonCImpl(builder.f4096a, builder.b, builder.c, builder.d, builder.e, builder.f, builder.g, builder.h, builder.i, builder.j, builder.k, builder.l, builder.m, builder.n, builder.o, builder.p, builder.q, builder.r, builder.s, builder.t, builder.u, builder.v, builder.w, builder.x, builder.y, builder.z, builder.A, builder.B, builder.C, builder.D, builder.E, builder.F, builder.G, builder.H, builder.I, builder.J, builder.K, builder.L, builder.M, builder.N, builder.O, builder.P, builder.Q, builder.R, builder.S, builder.T, builder.U, builder.V, builder.W, builder.X, builder.Y, builder.Z, builder.a0, builder.b0, builder.c0, builder.d0, builder.e0, builder.f0, builder.g0, builder.h0, builder.i0, builder.j0, builder.k0, builder.l0, builder.m0, builder.n0, builder.o0, builder.p0, builder.q0, builder.r0, builder.s0, builder.t0, builder.u0, builder.v0, builder.w0, builder.x0, builder.y0, builder.z0, builder.A0, builder.B0, builder.C0, builder.D0, builder.E0);
        }
    });

    @Override // au.com.woolworths.android.onesite.app.BaseShopApplication, android.app.Application
    public void onCreate() {
        Callback.i(this);
        if (!this.j) {
            this.j = true;
            ((ShopApplication_GeneratedInjector) this.k.t3()).getClass();
        }
        super.onCreate();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        return this.k.t3();
    }
}
