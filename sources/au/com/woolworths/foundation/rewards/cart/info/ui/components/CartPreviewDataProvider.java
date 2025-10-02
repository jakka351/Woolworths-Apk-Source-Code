package au.com.woolworths.foundation.rewards.cart.info.ui.components;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import au.com.woolworths.foundation.rewards.cart.info.domain.model.CartInfoResponse;
import au.com.woolworths.rewards.base.data.IconAsset;
import au.com.woolworths.rewards.base.data.LocalAssetIconName;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/ui/components/CartPreviewDataProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lau/com/woolworths/foundation/rewards/cart/info/ui/components/SampleCartData;", "Companion", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartPreviewDataProvider implements PreviewParameterProvider<SampleCartData> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/ui/components/CartPreviewDataProvider$Companion;", "", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CartInfoResponse cartInfoResponse = new CartInfoResponse(2, "");
        LocalAssetIconName localAssetIconName = LocalAssetIconName.CART;
        new SampleCartData("ShowCartWithItems", cartInfoResponse, new IconAsset.LocalAsset(localAssetIconName));
        new SampleCartData("EmptyCart", new CartInfoResponse(0, ""), new IconAsset.LocalAsset(localAssetIconName));
        new SampleCartData("ManyItemsCart", new CartInfoResponse(100, ""), new IconAsset.LocalAsset(localAssetIconName));
        new SampleCartData("CartIconByUrl", new CartInfoResponse(2, ""), new IconAsset.HostedIcon(""));
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public final Sequence getValues() {
        return null;
    }
}
