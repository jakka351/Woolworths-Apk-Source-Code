package au.com.woolworths.product.ui;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/ui/ProductMultiBuyLabel;", "Lau/com/woolworths/product/ui/ProductMultiBuyLabelStyle;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductMultiBuyLabel implements ProductMultiBuyLabelStyle {
    public static final ProductMultiBuyLabel d;
    public static final ProductMultiBuyLabel e;
    public static final ProductMultiBuyLabel f;
    public static final ProductMultiBuyLabel g;
    public static final ProductMultiBuyLabel h;
    public static final ProductMultiBuyLabel i;
    public static final /* synthetic */ ProductMultiBuyLabel[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        ProductMultiBuyLabel productMultiBuyLabel = new ProductMultiBuyLabel() { // from class: au.com.woolworths.product.ui.ProductMultiBuyLabel.BUY_AGAIN
            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int a() {
                return R.style.TextAppearance_Price_Label;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int c() {
                return R.style.TextAppearance_Caption_Medium;
            }
        };
        d = productMultiBuyLabel;
        ProductMultiBuyLabel productMultiBuyLabel2 = new ProductMultiBuyLabel() { // from class: au.com.woolworths.product.ui.ProductMultiBuyLabel.PRODUCT_LIST
            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int a() {
                return R.style.TextAppearance_UnitPrice_Label;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final boolean b() {
                return false;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int c() {
                return R.style.TextAppearance_Caption_Medium;
            }
        };
        e = productMultiBuyLabel2;
        ProductMultiBuyLabel productMultiBuyLabel3 = new ProductMultiBuyLabel() { // from class: au.com.woolworths.product.ui.ProductMultiBuyLabel.PRODUCT_LIST_NZ
            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int a() {
                return R.style.TextAppearance_UnitPrice_Label;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int c() {
                return R.style.TextAppearance_Caption_Medium;
            }
        };
        f = productMultiBuyLabel3;
        ProductMultiBuyLabel productMultiBuyLabel4 = new ProductMultiBuyLabel() { // from class: au.com.woolworths.product.ui.ProductMultiBuyLabel.PRODUCT_BOTTOM_SHEET
            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int a() {
                return R.style.TextAppearance_Price_Label;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int c() {
                return R.style.TextAppearance_Caption_Medium;
            }
        };
        g = productMultiBuyLabel4;
        ProductMultiBuyLabel productMultiBuyLabel5 = new ProductMultiBuyLabel() { // from class: au.com.woolworths.product.ui.ProductMultiBuyLabel.PRODUCT_DETAILS
            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int a() {
                return R.style.TextAppearance_Multibuy;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int c() {
                return R.style.TextAppearance_Body_Medium;
            }
        };
        h = productMultiBuyLabel5;
        ProductMultiBuyLabel productMultiBuyLabel6 = new ProductMultiBuyLabel() { // from class: au.com.woolworths.product.ui.ProductMultiBuyLabel.SHOPPING_LIST
            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int a() {
                return R.style.TextAppearance_Price_Label;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.product.ui.ProductMultiBuyLabelStyle
            public final int c() {
                return R.style.TextAppearance_Caption_Medium;
            }
        };
        i = productMultiBuyLabel6;
        ProductMultiBuyLabel[] productMultiBuyLabelArr = {productMultiBuyLabel, productMultiBuyLabel2, productMultiBuyLabel3, productMultiBuyLabel4, productMultiBuyLabel5, productMultiBuyLabel6};
        j = productMultiBuyLabelArr;
        k = EnumEntriesKt.a(productMultiBuyLabelArr);
    }

    public static ProductMultiBuyLabel valueOf(String str) {
        return (ProductMultiBuyLabel) Enum.valueOf(ProductMultiBuyLabel.class, str);
    }

    public static ProductMultiBuyLabel[] values() {
        return (ProductMultiBuyLabel[]) j.clone();
    }
}
