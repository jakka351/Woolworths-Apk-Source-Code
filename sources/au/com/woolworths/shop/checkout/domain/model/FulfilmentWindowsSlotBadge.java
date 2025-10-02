package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsSlotBadge;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsSlotBadge implements BrandLabel {
    public final BadgeStyle d;
    public final String e;
    public final PlainText f;

    public FulfilmentWindowsSlotBadge(BadgeStyle badgeStyle, String str) {
        this.d = badgeStyle;
        this.e = str;
        this.f = new PlainText(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsSlotBadge)) {
            return false;
        }
        FulfilmentWindowsSlotBadge fulfilmentWindowsSlotBadge = (FulfilmentWindowsSlotBadge) obj;
        return this.d == fulfilmentWindowsSlotBadge.d && Intrinsics.c(this.e, fulfilmentWindowsSlotBadge.e);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Caption_Medium;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "FulfilmentWindowsSlotBadge(type=" + this.d + ", title=" + this.e + ")";
    }
}
