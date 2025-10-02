package au.com.woolworths.product;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/product/ProductFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "Landroid/os/Parcelable;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProductFeature implements Feature, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductFeature> CREATOR;
    public static final ProductFeature d;
    public static final ProductFeature e;
    public static final ProductFeature f;
    public static final ProductFeature g;
    public static final /* synthetic */ ProductFeature[] h;
    public static final /* synthetic */ EnumEntries i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductFeature> {
        @Override // android.os.Parcelable.Creator
        public final ProductFeature createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return ProductFeature.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductFeature[] newArray(int i) {
            return new ProductFeature[i];
        }
    }

    static {
        ProductFeature productFeature = new ProductFeature() { // from class: au.com.woolworths.product.ProductFeature.ASK_OLIVE_ZERO_SEARCH_RESULTS
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_ask_olive_zero_search_results";
            }

            @Override // au.com.woolworths.product.ProductFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        d = productFeature;
        ProductFeature productFeature2 = new ProductFeature() { // from class: au.com.woolworths.product.ProductFeature.PRODUCT_CARD_INDEX_AS_UNIQUE_ID
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean b() {
                return true;
            }

            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_card_index_as_unique_id";
            }

            @Override // au.com.woolworths.product.ProductFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        e = productFeature2;
        ProductFeature productFeature3 = new ProductFeature() { // from class: au.com.woolworths.product.ProductFeature.PRODUCT_CATEGORY_PAGE_CHAT_CARD
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_category_page_chat_card";
            }

            @Override // au.com.woolworths.product.ProductFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        f = productFeature3;
        ProductFeature productFeature4 = new ProductFeature() { // from class: au.com.woolworths.product.ProductFeature.PRODUCT_DETAILS_BASKET_BUILDER
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_product_details_basket_builder";
            }

            @Override // au.com.woolworths.product.ProductFeature, au.com.woolworths.android.onesite.featuretoggles.Feature
            public final boolean getDefaultValue() {
                return true;
            }
        };
        g = productFeature4;
        ProductFeature[] productFeatureArr = {productFeature, productFeature2, productFeature3, productFeature4};
        h = productFeatureArr;
        i = EnumEntriesKt.a(productFeatureArr);
        CREATOR = new Creator();
    }

    public static ProductFeature valueOf(String str) {
        return (ProductFeature) Enum.valueOf(ProductFeature.class, str);
    }

    public static ProductFeature[] values() {
        return (ProductFeature[]) h.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public boolean getDefaultValue() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
