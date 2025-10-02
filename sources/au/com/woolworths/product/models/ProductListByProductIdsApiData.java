package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/product/models/ProductListByProductIdsApiData;", "Landroid/os/Parcelable;", "products", "", "Lau/com/woolworths/product/models/ProductCard;", "<init>", "(Ljava/util/List;)V", "getProducts", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductListByProductIdsApiData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductListByProductIdsApiData> CREATOR = new Creator();

    @SerializedName("products")
    @NotNull
    private final List<ProductCard> products;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductListByProductIdsApiData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListByProductIdsApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(ProductCard.CREATOR, parcel, arrayList, iE, 1);
            }
            return new ProductListByProductIdsApiData(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListByProductIdsApiData[] newArray(int i) {
            return new ProductListByProductIdsApiData[i];
        }
    }

    public ProductListByProductIdsApiData(@NotNull List<ProductCard> products) {
        Intrinsics.h(products, "products");
        this.products = products;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductListByProductIdsApiData copy$default(ProductListByProductIdsApiData productListByProductIdsApiData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productListByProductIdsApiData.products;
        }
        return productListByProductIdsApiData.copy(list);
    }

    @NotNull
    public final List<ProductCard> component1() {
        return this.products;
    }

    @NotNull
    public final ProductListByProductIdsApiData copy(@NotNull List<ProductCard> products) {
        Intrinsics.h(products, "products");
        return new ProductListByProductIdsApiData(products);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductListByProductIdsApiData) && Intrinsics.c(this.products, ((ProductListByProductIdsApiData) other).products);
    }

    @NotNull
    public final List<ProductCard> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return this.products.hashCode();
    }

    @NotNull
    public String toString() {
        return au.com.woolworths.android.onesite.a.l("ProductListByProductIdsApiData(products=", ")", this.products);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.products, dest);
        while (itU.hasNext()) {
            ((ProductCard) itU.next()).writeToParcel(dest, flags);
        }
    }
}
