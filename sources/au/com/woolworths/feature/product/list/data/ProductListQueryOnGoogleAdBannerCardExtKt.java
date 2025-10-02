package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "Lcom/woolworths/product/list/ProductListQuery$OnGoogleAdBannerCard;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryOnGoogleAdBannerCardExtKt {
    @NotNull
    public static final GoogleAdBannerCard toUiModel(@NotNull ProductListQuery.OnGoogleAdBannerCard onGoogleAdBannerCard) {
        Intrinsics.h(onGoogleAdBannerCard, "<this>");
        String adUnit = onGoogleAdBannerCard.getAdUnit();
        String nativeCustomTemplateId = onGoogleAdBannerCard.getNativeCustomTemplateId();
        GoogleAdCustomTargeting targeting = onGoogleAdBannerCard.getTargeting();
        String correlator = onGoogleAdBannerCard.getCorrelator();
        String iabSize = onGoogleAdBannerCard.getIabSize();
        return new GoogleAdBannerCard(adUnit, nativeCustomTemplateId, null, targeting, correlator, null, null, null, null, null, null, null, null, Intrinsics.c(iabSize, "320x50") ? InteractiveAdvertisingBureauAdHeight.STANDARD : Intrinsics.c(iabSize, "320x100") ? InteractiveAdvertisingBureauAdHeight.LARGE : InteractiveAdvertisingBureauAdHeight.LARGE);
    }
}
