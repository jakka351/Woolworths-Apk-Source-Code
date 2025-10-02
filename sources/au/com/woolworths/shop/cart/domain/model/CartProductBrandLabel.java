package au.com.woolworths.shop.cart.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.product.tile.ProductPromotionType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/CartProductBrandLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "Save", "Lau/com/woolworths/shop/cart/domain/model/CartProductBrandLabel$Save;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CartProductBrandLabel implements BrandLabel {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/CartProductBrandLabel$Save;", "Lau/com/woolworths/shop/cart/domain/model/CartProductBrandLabel;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Save extends CartProductBrandLabel {
        public final String d;
        public final ProductPromotionType e;
        public final PlainText f;

        public Save(String plainText) {
            Intrinsics.h(plainText, "plainText");
            this.d = plainText;
            this.e = ProductPromotionType.k;
            this.f = new PlainText(plainText);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Save) && Intrinsics.c(this.d, ((Save) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        public final Text getText() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
        public final BrandLabelType getType() {
            return this.e;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("Save(plainText=", this.d, ")");
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Overline_Fresh_Medium;
    }
}
