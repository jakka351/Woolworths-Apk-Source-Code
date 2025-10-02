package au.com.woolworths.product.details;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProductDetailsFeature implements Feature {
    public static final ProductDetailsFeature d;
    public static final ProductDetailsFeature e;
    public static final /* synthetic */ ProductDetailsFeature[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ProductDetailsFeature productDetailsFeature = new ProductDetailsFeature() { // from class: au.com.woolworths.product.details.ProductDetailsFeature.HEALTHIER_OPTIONS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_healthier_options";
            }

            @Override // au.com.woolworths.product.details.ProductDetailsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = productDetailsFeature;
        ProductDetailsFeature productDetailsFeature2 = new ProductDetailsFeature() { // from class: au.com.woolworths.product.details.ProductDetailsFeature.MARKDOWN_HEALTHIER_OPTIONS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_markdown_healthier_options";
            }

            @Override // au.com.woolworths.product.details.ProductDetailsFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = productDetailsFeature2;
        ProductDetailsFeature[] productDetailsFeatureArr = {productDetailsFeature, productDetailsFeature2};
        f = productDetailsFeatureArr;
        g = EnumEntriesKt.a(productDetailsFeatureArr);
    }

    public static ProductDetailsFeature valueOf(String str) {
        return (ProductDetailsFeature) Enum.valueOf(ProductDetailsFeature.class, str);
    }

    public static ProductDetailsFeature[] values() {
        return (ProductDetailsFeature[]) f.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }
}
