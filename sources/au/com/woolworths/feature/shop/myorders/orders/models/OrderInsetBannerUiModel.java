package au.com.woolworths.feature.shop.myorders.orders.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/orders/models/OrderInsetBannerUiModel;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBanner;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderInsetBannerUiModel implements InsetBanner {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OrderInsetBannerUiModel);
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final InlineErrorType getErrorType() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner, au.com.woolworths.android.onesite.modules.common.InlineErrorCause
    public final Text getMessageText() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "OrderInsetBannerUiModel(messageText=null, errorType=null)";
    }
}
