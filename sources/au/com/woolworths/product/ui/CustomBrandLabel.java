package au.com.woolworths.product.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.product.tile.LowerPriceYellowType;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/ui/CustomBrandLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CustomBrandLabel implements BrandLabel {
    public final LowerPriceYellowType d;
    public final PlainText e;

    public CustomBrandLabel(LowerPriceYellowType lowerPriceYellowType, PlainText plainText) {
        this.d = lowerPriceYellowType;
        this.e = plainText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomBrandLabel)) {
            return false;
        }
        CustomBrandLabel customBrandLabel = (CustomBrandLabel) obj;
        return this.d.equals(customBrandLabel.d) && this.e.equals(customBrandLabel.e);
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final BrandLabelType getType() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "CustomBrandLabel(type=" + this.d + ", text=" + this.e + ")";
    }
}
