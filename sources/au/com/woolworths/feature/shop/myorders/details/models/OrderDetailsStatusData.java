package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/OrderDetailsStatusData;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrderDetailsStatusData implements BrandLabel {
    public final OrderStatusTypeData d;
    public final String e;
    public final PlainText f;

    public OrderDetailsStatusData(OrderStatusTypeData orderStatusTypeData, String str) {
        this.d = orderStatusTypeData;
        this.e = str;
        this.f = new PlainText(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailsStatusData)) {
            return false;
        }
        OrderDetailsStatusData orderDetailsStatusData = (OrderDetailsStatusData) obj;
        return this.d == orderDetailsStatusData.d && Intrinsics.c(this.e, orderDetailsStatusData.e);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getPaddingHorizontal() {
        return R.dimen.three_quarter_default_padding;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getPaddingVertical() {
        return R.dimen.quarter_default_padding;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Caption_Fresh_Medium;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "OrderDetailsStatusData(type=" + this.d + ", label=" + this.e + ")";
    }
}
