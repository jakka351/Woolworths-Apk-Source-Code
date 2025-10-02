package au.com.woolworths.product.ui;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/ui/ProductListPromotionLabel;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabel;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductListPromotionLabel implements BrandLabel {
    public static final ProductListPromotionLabel e;
    public static final ProductListPromotionLabel f;
    public static final ProductListPromotionLabel g;
    public static final ProductListPromotionLabel h;
    public static final ProductListPromotionLabel i;
    public static final ProductListPromotionLabel j;
    public static final ProductListPromotionLabel k;
    public static final /* synthetic */ ProductListPromotionLabel[] l;
    public static final /* synthetic */ EnumEntries m;
    public PlainText d;

    static {
        ProductListPromotionLabel productListPromotionLabel = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.PRICE_DROPPED
            public final ProductPromotionType n = ProductPromotionType.g;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        e = productListPromotionLabel;
        ProductListPromotionLabel productListPromotionLabel2 = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.LOWER_SHELF_PRICE
            public final ProductPromotionType n = ProductPromotionType.h;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        f = productListPromotionLabel2;
        ProductListPromotionLabel productListPromotionLabel3 = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.LOWER_PRICE
            public final ProductPromotionType n = ProductPromotionType.j;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        g = productListPromotionLabel3;
        ProductListPromotionLabel productListPromotionLabel4 = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.LOW_PRICE_ALWAYS
            public final ProductPromotionType n = ProductPromotionType.i;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        h = productListPromotionLabel4;
        ProductListPromotionLabel productListPromotionLabel5 = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.SAVE
            public final ProductPromotionType n = ProductPromotionType.k;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        i = productListPromotionLabel5;
        ProductListPromotionLabel productListPromotionLabel6 = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.CONTAINER
            public final ProductPromotionType n = ProductPromotionType.l;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        j = productListPromotionLabel6;
        ProductListPromotionLabel productListPromotionLabel7 = new ProductListPromotionLabel() { // from class: au.com.woolworths.product.ui.ProductListPromotionLabel.NONE
            public final ProductPromotionType n = ProductPromotionType.m;

            @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
            public final BrandLabelType getType() {
                return this.n;
            }
        };
        k = productListPromotionLabel7;
        ProductListPromotionLabel[] productListPromotionLabelArr = {productListPromotionLabel, productListPromotionLabel2, productListPromotionLabel3, productListPromotionLabel4, productListPromotionLabel5, productListPromotionLabel6, productListPromotionLabel7};
        l = productListPromotionLabelArr;
        m = EnumEntriesKt.a(productListPromotionLabelArr);
    }

    public static ProductListPromotionLabel valueOf(String str) {
        return (ProductListPromotionLabel) Enum.valueOf(ProductListPromotionLabel.class, str);
    }

    public static ProductListPromotionLabel[] values() {
        return (ProductListPromotionLabel[]) l.clone();
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final Text getText() {
        return this.d;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
    public final int getTextAppearance() {
        return R.style.TextAppearance_Overline_Fresh_Medium;
    }
}
