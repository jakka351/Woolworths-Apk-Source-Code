package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.android.onesite.data.DownloadableAsset;
import com.woolworths.product.list.ProductsByRewardsOffersQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/feature/product/list/data/FullScreenMessage;", "Lcom/woolworths/product/list/ProductsByRewardsOffersQuery$OnFullScreenMessage;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductsByRewardsOffersQueryOnFullScreenMessageExtKt {
    @NotNull
    public static final FullScreenMessage toUiModel(@NotNull ProductsByRewardsOffersQuery.OnFullScreenMessage onFullScreenMessage) {
        Intrinsics.h(onFullScreenMessage, "<this>");
        String messageTitle = onFullScreenMessage.getMessageTitle();
        String messageDescription = onFullScreenMessage.getMessageDescription();
        ProductsByRewardsOffersQuery.MessageAsset messageAsset = onFullScreenMessage.getMessageAsset();
        DownloadableAsset uiModel = messageAsset != null ? ProductsByRewardsOffersQueryMessageAssetExtKt.toUiModel(messageAsset) : null;
        List<ProductsByRewardsOffersQuery.MessageButton> messageButtons = onFullScreenMessage.getMessageButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(messageButtons, 10));
        Iterator<T> it = messageButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductsByRewardsOffersQueryMessageButtonExtKt.toUiModel((ProductsByRewardsOffersQuery.MessageButton) it.next()));
        }
        return new FullScreenMessage(messageTitle, messageDescription, uiModel, arrayList);
    }
}
