package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindowsUnavailableBadge;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfilmentWindowsUnavailableBadge implements BrandLabel {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FulfilmentWindowsUnavailableBadge);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getAccessibilityText() {
        return new PlainText(null);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return null;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Caption_Medium;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "FulfilmentWindowsUnavailableBadge(label=null, badgeType=null, altLabel=null)";
    }
}
