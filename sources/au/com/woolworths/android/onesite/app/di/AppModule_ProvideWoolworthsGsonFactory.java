package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.android.onesite.home.models.RegistrationTileData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.orders.models.OrderInsetBanner;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkCallbackResultData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsLinkSuccessData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsUnlinkSuccessData;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.network.ComponentTypeAdapter;
import au.com.woolworths.android.onesite.network.DefaultEnumTypeAdapterFactory;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowTileData;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeMoreCard;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class AppModule_ProvideWoolworthsGsonFactory implements Factory<Gson> {
    public static Gson a(AppModule appModule) {
        appModule.getClass();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        Map mapJ = MapsKt.j(new Pair("DeliveryNowCard", reflectionFactory.b(DeliveryNowTileData.class)), new Pair("GoogleAdBannerCard", reflectionFactory.b(GoogleAdBannerCard.class)), new Pair("InsetBanner", reflectionFactory.b(OrderInsetBanner.class)), new Pair("InsetBannerCard", reflectionFactory.b(InsetBannerApiData.class)), new Pair("ProductTrolley", reflectionFactory.b(ProductTrolleyData.class)), new Pair("RecipeMoreCard", reflectionFactory.b(RecipeMoreCard.class)), new Pair("RecipeSummaryCard", reflectionFactory.b(RecipeCardSummaryData.class)), new Pair("RegistrationCard", reflectionFactory.b(RegistrationTileData.class)), new Pair("RewardsLinkCallbackResult", reflectionFactory.b(RewardsLinkCallbackResultData.class)), new Pair("RewardsLinkSuccess", reflectionFactory.b(RewardsLinkSuccessData.class)), new Pair("RewardsUnlinkSuccess", reflectionFactory.b(RewardsUnlinkSuccessData.class)));
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.b(new ComponentTypeAdapter(mapJ), Component.class);
        gsonBuilder.e.add(new DefaultEnumTypeAdapterFactory());
        return gsonBuilder.a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
