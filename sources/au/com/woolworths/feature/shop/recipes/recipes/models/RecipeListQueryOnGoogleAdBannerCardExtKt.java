package au.com.woolworths.feature.shop.recipes.recipes.models;

import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import com.woolworths.shop.recipes.RecipeListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "Lcom/woolworths/shop/recipes/RecipeListQuery$OnGoogleAdBannerCard;", "recipes_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecipeListQueryOnGoogleAdBannerCardExtKt {
    @NotNull
    public static final GoogleAdBannerCard toUiModel(@NotNull RecipeListQuery.OnGoogleAdBannerCard onGoogleAdBannerCard) {
        Intrinsics.h(onGoogleAdBannerCard, "<this>");
        String adUnit = onGoogleAdBannerCard.getAdUnit();
        String nativeCustomTemplateId = onGoogleAdBannerCard.getNativeCustomTemplateId();
        DefaultCardHeight uiModel = AdBannerNativeSizeExtKt.toUiModel(onGoogleAdBannerCard.getHeight());
        GoogleAdCustomTargeting targeting = onGoogleAdBannerCard.getTargeting();
        String correlator = onGoogleAdBannerCard.getCorrelator();
        String iabSize = onGoogleAdBannerCard.getIabSize();
        return new GoogleAdBannerCard(adUnit, nativeCustomTemplateId, uiModel, targeting, correlator, null, null, null, null, null, null, null, null, Intrinsics.c(iabSize, "320x50") ? InteractiveAdvertisingBureauAdHeight.STANDARD : Intrinsics.c(iabSize, "320x100") ? InteractiveAdvertisingBureauAdHeight.LARGE : InteractiveAdvertisingBureauAdHeight.LARGE);
    }
}
