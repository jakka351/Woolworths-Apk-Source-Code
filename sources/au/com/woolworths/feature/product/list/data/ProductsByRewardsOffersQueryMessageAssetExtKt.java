package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import com.woolworths.product.list.ProductsByRewardsOffersQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "Lcom/woolworths/product/list/ProductsByRewardsOffersQuery$MessageAsset;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsByRewardsOffersQueryMessageAssetExtKt {
    @NotNull
    public static final DownloadableAsset toUiModel(@NotNull ProductsByRewardsOffersQuery.MessageAsset messageAsset) {
        Intrinsics.h(messageAsset, "<this>");
        DownloadableAssetType uiModel = DownloadableAssetTypeExtKt.toUiModel(messageAsset.getAssetType());
        String assetUrl = messageAsset.getAssetUrl();
        int assetWidth = messageAsset.getAssetWidth();
        int assetHeight = messageAsset.getAssetHeight();
        DownloadableAssetFit fit = messageAsset.getFit();
        return new DownloadableAsset(uiModel, assetUrl, assetWidth, assetHeight, fit != null ? DownloadableAssetFitExtKt.toUiModel(fit) : null, messageAsset.getAltText());
    }
}
