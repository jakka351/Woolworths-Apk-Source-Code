package au.com.woolworths.product.details.ui;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.product.tile.ProductPromotionType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/details/ui/ProductDetailsPromotionLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductDetailsPromotionLabel implements BrandLabel {
    public static final ProductDetailsPromotionLabel e;
    public static final ProductDetailsPromotionLabel f;
    public static final ProductDetailsPromotionLabel g;
    public static final ProductDetailsPromotionLabel h;
    public static final ProductDetailsPromotionLabel i;
    public static final ProductDetailsPromotionLabel j;
    public static final /* synthetic */ ProductDetailsPromotionLabel[] k;
    public static final /* synthetic */ EnumEntries l;
    public PlainText d;

    static {
        ProductDetailsPromotionLabel productDetailsPromotionLabel = new ProductDetailsPromotionLabel() { // from class: au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel.PRICE_DROPPED
            public final ProductPromotionType m = ProductPromotionType.g;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.m;
            }
        };
        e = productDetailsPromotionLabel;
        ProductDetailsPromotionLabel productDetailsPromotionLabel2 = new ProductDetailsPromotionLabel() { // from class: au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel.LOWER_SHELF_PRICE
            public final ProductPromotionType m = ProductPromotionType.h;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.m;
            }
        };
        f = productDetailsPromotionLabel2;
        ProductDetailsPromotionLabel productDetailsPromotionLabel3 = new ProductDetailsPromotionLabel() { // from class: au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel.LOW_PRICE_ALWAYS
            public final ProductPromotionType m = ProductPromotionType.i;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.m;
            }
        };
        g = productDetailsPromotionLabel3;
        ProductDetailsPromotionLabel productDetailsPromotionLabel4 = new ProductDetailsPromotionLabel() { // from class: au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel.SAVE
            public final ProductPromotionType m = ProductPromotionType.k;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.m;
            }
        };
        h = productDetailsPromotionLabel4;
        ProductDetailsPromotionLabel productDetailsPromotionLabel5 = new ProductDetailsPromotionLabel() { // from class: au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel.LOWER_PRICE
            public final ProductPromotionType m = ProductPromotionType.j;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.m;
            }
        };
        i = productDetailsPromotionLabel5;
        ProductDetailsPromotionLabel productDetailsPromotionLabel6 = new ProductDetailsPromotionLabel() { // from class: au.com.woolworths.product.details.ui.ProductDetailsPromotionLabel.CONTAINER
            public final ProductPromotionType m = ProductPromotionType.l;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.m;
            }
        };
        j = productDetailsPromotionLabel6;
        ProductDetailsPromotionLabel[] productDetailsPromotionLabelArr = {productDetailsPromotionLabel, productDetailsPromotionLabel2, productDetailsPromotionLabel3, productDetailsPromotionLabel4, productDetailsPromotionLabel5, productDetailsPromotionLabel6};
        k = productDetailsPromotionLabelArr;
        l = EnumEntriesKt.a(productDetailsPromotionLabelArr);
    }

    public static ProductDetailsPromotionLabel valueOf(String str) {
        return (ProductDetailsPromotionLabel) Enum.valueOf(ProductDetailsPromotionLabel.class, str);
    }

    public static ProductDetailsPromotionLabel[] values() {
        return (ProductDetailsPromotionLabel[]) k.clone();
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Body_Fresh_Medium;
    }
}
