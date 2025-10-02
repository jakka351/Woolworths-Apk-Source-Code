package au.com.woolworths.product.tile;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/tile/ProductPromotionType;", "Lau/com/woolworths/android/onesite/modules/customviews/BrandLabelType;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductPromotionType implements BrandLabelType {

    @NotNull
    public static final Parcelable.Creator<ProductPromotionType> CREATOR;
    public static final ProductPromotionType g;
    public static final ProductPromotionType h;
    public static final ProductPromotionType i;
    public static final ProductPromotionType j;
    public static final ProductPromotionType k;
    public static final ProductPromotionType l;
    public static final ProductPromotionType m;
    public static final /* synthetic */ ProductPromotionType[] n;
    public static final /* synthetic */ EnumEntries o;
    public final int d;
    public final int e;
    public final int f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductPromotionType> {
        @Override // android.os.Parcelable.Creator
        public final ProductPromotionType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return ProductPromotionType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPromotionType[] newArray(int i) {
            return new ProductPromotionType[i];
        }
    }

    static {
        ProductPromotionType productPromotionType = new ProductPromotionType("PRICE_DROPPED", 0, R.color.color_brand_always, R.color.white, R.color.color_brand_always);
        g = productPromotionType;
        ProductPromotionType productPromotionType2 = new ProductPromotionType("LOWER_SHELF_PRICE", 1, R.color.color_brand_always, R.color.white, R.color.color_brand_always);
        h = productPromotionType2;
        ProductPromotionType productPromotionType3 = new ProductPromotionType("LOW_PRICE_ALWAYS", 2, R.color.white, R.color.color_brand_always, R.color.color_brand_always);
        i = productPromotionType3;
        ProductPromotionType productPromotionType4 = new ProductPromotionType("LOWER_PRICE", 3, R.color.color_brand_always, R.color.white, R.color.color_brand_always);
        j = productPromotionType4;
        ProductPromotionType productPromotionType5 = new ProductPromotionType("SAVE", 4, R.color.color_black_900, R.color.color_brand_specials, R.color.color_brand_specials);
        k = productPromotionType5;
        ProductPromotionType productPromotionType6 = new ProductPromotionType("CONTAINER", 5, R.color.white, R.color.color_fill_rewards, R.color.color_fill_rewards);
        l = productPromotionType6;
        ProductPromotionType productPromotionType7 = new ProductPromotionType("NONE", 6, android.R.color.transparent, android.R.color.transparent, android.R.color.transparent);
        m = productPromotionType7;
        ProductPromotionType[] productPromotionTypeArr = {productPromotionType, productPromotionType2, productPromotionType3, productPromotionType4, productPromotionType5, productPromotionType6, productPromotionType7};
        n = productPromotionTypeArr;
        o = EnumEntriesKt.a(productPromotionTypeArr);
        CREATOR = new Creator();
    }

    public ProductPromotionType(String str, int i2, int i3, int i4, int i5) {
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public static ProductPromotionType valueOf(String str) {
        return (ProductPromotionType) Enum.valueOf(ProductPromotionType.class, str);
    }

    public static ProductPromotionType[] values() {
        return (ProductPromotionType[]) n.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    /* renamed from: getBackgroundColour, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    /* renamed from: getBorderColour, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabelType
    /* renamed from: getTextColour, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
