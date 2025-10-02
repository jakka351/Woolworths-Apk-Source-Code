package au.com.woolworths.android.onesite.products.models;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/products/models/ProductPromotionTypes;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SPECIAL", "LOW_PRICE", "LOWER_SHELF_PRICE", "LOWER_PRICE", "PRICE_DROPPED", "CONTAINER_CREDITS", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductPromotionTypes implements Parcelable {

    @SerializedName("CONTAINER_CREDITS")
    public static final ProductPromotionTypes CONTAINER_CREDITS;

    @NotNull
    public static final Parcelable.Creator<ProductPromotionTypes> CREATOR;

    @SerializedName("LOWER_PRICE")
    public static final ProductPromotionTypes LOWER_PRICE;

    @SerializedName("LOWER_SHELF_PRICE")
    public static final ProductPromotionTypes LOWER_SHELF_PRICE;

    @SerializedName("LOW_PRICE")
    public static final ProductPromotionTypes LOW_PRICE;

    @DefaultValue
    @SerializedName("PRICE_DROPPED")
    public static final ProductPromotionTypes PRICE_DROPPED;

    @SerializedName("SPECIAL")
    public static final ProductPromotionTypes SPECIAL;
    public static final /* synthetic */ ProductPromotionTypes[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductPromotionTypes> {
        @Override // android.os.Parcelable.Creator
        public final ProductPromotionTypes createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return ProductPromotionTypes.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPromotionTypes[] newArray(int i) {
            return new ProductPromotionTypes[i];
        }
    }

    static {
        ProductPromotionTypes productPromotionTypes = new ProductPromotionTypes("SPECIAL", 0);
        SPECIAL = productPromotionTypes;
        ProductPromotionTypes productPromotionTypes2 = new ProductPromotionTypes("LOW_PRICE", 1);
        LOW_PRICE = productPromotionTypes2;
        ProductPromotionTypes productPromotionTypes3 = new ProductPromotionTypes("LOWER_SHELF_PRICE", 2);
        LOWER_SHELF_PRICE = productPromotionTypes3;
        ProductPromotionTypes productPromotionTypes4 = new ProductPromotionTypes("LOWER_PRICE", 3);
        LOWER_PRICE = productPromotionTypes4;
        ProductPromotionTypes productPromotionTypes5 = new ProductPromotionTypes("PRICE_DROPPED", 4);
        PRICE_DROPPED = productPromotionTypes5;
        ProductPromotionTypes productPromotionTypes6 = new ProductPromotionTypes("CONTAINER_CREDITS", 5);
        CONTAINER_CREDITS = productPromotionTypes6;
        ProductPromotionTypes[] productPromotionTypesArr = {productPromotionTypes, productPromotionTypes2, productPromotionTypes3, productPromotionTypes4, productPromotionTypes5, productPromotionTypes6};
        d = productPromotionTypesArr;
        e = EnumEntriesKt.a(productPromotionTypesArr);
        CREATOR = new Creator();
    }

    private ProductPromotionTypes(String str, int i) {
    }

    public static ProductPromotionTypes valueOf(String str) {
        return (ProductPromotionTypes) Enum.valueOf(ProductPromotionTypes.class, str);
    }

    public static ProductPromotionTypes[] values() {
        return (ProductPromotionTypes[]) d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
