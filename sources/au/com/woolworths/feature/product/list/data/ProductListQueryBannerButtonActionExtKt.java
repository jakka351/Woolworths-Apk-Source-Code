package au.com.woolworths.feature.product.list.data;

import au.com.woolworths.product.models.ActionTypeExtKt;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import com.woolworths.product.list.ProductListQuery;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/sdui/model/action/ActionData;", "Lcom/woolworths/product/list/ProductListQuery$BannerButtonAction;", "product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQueryBannerButtonActionExtKt {
    @NotNull
    public static final ActionData toUiModel(@NotNull ProductListQuery.BannerButtonAction bannerButtonAction) {
        Intrinsics.h(bannerButtonAction, "<this>");
        String action = bannerButtonAction.getAction();
        ActionType uiModel = ActionTypeExtKt.toUiModel(bannerButtonAction.getType());
        String id = bannerButtonAction.getId();
        ProductListQuery.Analytics analytics = bannerButtonAction.getAnalytics();
        return new ActionData(action, uiModel, id, analytics != null ? ProductListQueryAnalyticsExtKt.toUiModel(analytics) : null);
    }
}
