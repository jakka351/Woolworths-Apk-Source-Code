package au.com.woolworths.shop.lists.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.room.ColumnInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003Je\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00067"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/ProductListItem;", "Lau/com/woolworths/shop/lists/data/model/ShoppingListItem;", "id", "", "listId", "createdAt", "", "updatedAt", "isChecked", "", "productId", "Lau/com/woolworths/product/models/ProductId;", "quantity", "", "product", "Lau/com/woolworths/product/models/ProductCard;", "productFoundInResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJZLau/com/woolworths/product/models/ProductId;FLau/com/woolworths/product/models/ProductCard;Z)V", "getId", "()Ljava/lang/String;", "getListId", "getCreatedAt", "()J", "getUpdatedAt", "()Z", "getProductId", "()Lau/com/woolworths/product/models/ProductId;", "getQuantity", "()F", "getProduct", "()Lau/com/woolworths/product/models/ProductCard;", "getProductFoundInResponse", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductListItem implements ShoppingListItem {

    @NotNull
    public static final Parcelable.Creator<ProductListItem> CREATOR = new Creator();
    private final long createdAt;

    @NotNull
    private final String id;
    private final boolean isChecked;

    @NotNull
    private final String listId;

    @Nullable
    private final ProductCard product;

    @ColumnInfo
    private final boolean productFoundInResponse;

    @NotNull
    private final ProductId productId;
    private final float quantity;
    private final long updatedAt;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductListItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListItem createFromParcel(Parcel parcel) {
            boolean z;
            ProductId productId;
            ProductCard productCard;
            boolean z2;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            ProductId productId2 = (ProductId) parcel.readParcelable(ProductListItem.class.getClassLoader());
            float f = parcel.readFloat();
            ProductCard productCard2 = (ProductCard) parcel.readParcelable(ProductListItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = true;
                productId = productId2;
                productCard = productCard2;
            } else {
                productId = productId2;
                productCard = productCard2;
                z2 = z;
            }
            return new ProductListItem(string, string2, j, j2, z3, productId, f, productCard, z2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductListItem[] newArray(int i) {
            return new ProductListItem[i];
        }
    }

    public ProductListItem(@NotNull String id, @NotNull String listId, long j, long j2, boolean z, @NotNull ProductId productId, float f, @Nullable ProductCard productCard, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        this.id = id;
        this.listId = listId;
        this.createdAt = j;
        this.updatedAt = j2;
        this.isChecked = z;
        this.productId = productId;
        this.quantity = f;
        this.product = productCard;
        this.productFoundInResponse = z2;
    }

    public static /* synthetic */ ProductListItem copy$default(ProductListItem productListItem, String str, String str2, long j, long j2, boolean z, ProductId productId, float f, ProductCard productCard, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productListItem.id;
        }
        if ((i & 2) != 0) {
            str2 = productListItem.listId;
        }
        if ((i & 4) != 0) {
            j = productListItem.createdAt;
        }
        if ((i & 8) != 0) {
            j2 = productListItem.updatedAt;
        }
        if ((i & 16) != 0) {
            z = productListItem.isChecked;
        }
        if ((i & 32) != 0) {
            productId = productListItem.productId;
        }
        if ((i & 64) != 0) {
            f = productListItem.quantity;
        }
        if ((i & 128) != 0) {
            productCard = productListItem.product;
        }
        if ((i & 256) != 0) {
            z2 = productListItem.productFoundInResponse;
        }
        boolean z3 = z2;
        float f2 = f;
        boolean z4 = z;
        long j3 = j2;
        long j4 = j;
        return productListItem.copy(str, str2, j4, j3, z4, productId, f2, productCard, z3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getListId() {
        return this.listId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ProductId getProductId() {
        return this.productId;
    }

    /* renamed from: component7, reason: from getter */
    public final float getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ProductCard getProduct() {
        return this.product;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getProductFoundInResponse() {
        return this.productFoundInResponse;
    }

    @NotNull
    public final ProductListItem copy(@NotNull String id, @NotNull String listId, long createdAt, long updatedAt, boolean isChecked, @NotNull ProductId productId, float quantity, @Nullable ProductCard product, boolean productFoundInResponse) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        return new ProductListItem(id, listId, createdAt, updatedAt, isChecked, productId, quantity, product, productFoundInResponse);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListItem)) {
            return false;
        }
        ProductListItem productListItem = (ProductListItem) other;
        return Intrinsics.c(this.id, productListItem.id) && Intrinsics.c(this.listId, productListItem.listId) && this.createdAt == productListItem.createdAt && this.updatedAt == productListItem.updatedAt && this.isChecked == productListItem.isChecked && Intrinsics.c(this.productId, productListItem.productId) && Float.compare(this.quantity, productListItem.quantity) == 0 && Intrinsics.c(this.product, productListItem.product) && this.productFoundInResponse == productListItem.productFoundInResponse;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    @NotNull
    public String getListId() {
        return this.listId;
    }

    @Nullable
    public final ProductCard getProduct() {
        return this.product;
    }

    public final boolean getProductFoundInResponse() {
        return this.productFoundInResponse;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    public final float getQuantity() {
        return this.quantity;
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iB = a.b(this.quantity, (this.productId.hashCode() + b.e(b.b(b.b(b.c(this.id.hashCode() * 31, 31, this.listId), 31, this.createdAt), 31, this.updatedAt), 31, this.isChecked)) * 31, 31);
        ProductCard productCard = this.product;
        return Boolean.hashCode(this.productFoundInResponse) + ((iB + (productCard == null ? 0 : productCard.hashCode())) * 31);
    }

    @Override // au.com.woolworths.shop.lists.data.model.ShoppingListItem
    public boolean isChecked() {
        return this.isChecked;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.listId;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        boolean z = this.isChecked;
        ProductId productId = this.productId;
        float f = this.quantity;
        ProductCard productCard = this.product;
        boolean z2 = this.productFoundInResponse;
        StringBuilder sbV = YU.a.v("ProductListItem(id=", str, ", listId=", str2, ", createdAt=");
        sbV.append(j);
        androidx.constraintlayout.core.state.a.A(sbV, ", updatedAt=", j2, ", isChecked=");
        sbV.append(z);
        sbV.append(", productId=");
        sbV.append(productId);
        sbV.append(", quantity=");
        sbV.append(f);
        sbV.append(", product=");
        sbV.append(productCard);
        sbV.append(", productFoundInResponse=");
        return YU.a.k(")", sbV, z2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.listId);
        dest.writeLong(this.createdAt);
        dest.writeLong(this.updatedAt);
        dest.writeInt(this.isChecked ? 1 : 0);
        dest.writeParcelable(this.productId, flags);
        dest.writeFloat(this.quantity);
        dest.writeParcelable(this.product, flags);
        dest.writeInt(this.productFoundInResponse ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductListItem(String str, String str2, long j, long j2, boolean z, ProductId productId, float f, ProductCard productCard, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        ProductCard productCard2;
        ProductId productId2;
        float f2;
        boolean z4;
        str = (i & 1) != 0 ? "" : str;
        j = (i & 4) != 0 ? 0L : j;
        j2 = (i & 8) != 0 ? 0L : j2;
        z = (i & 16) != 0 ? false : z;
        productCard = (i & 128) != 0 ? null : productCard;
        if ((i & 256) != 0) {
            z3 = false;
            f2 = f;
            productCard2 = productCard;
            z4 = z;
            productId2 = productId;
        } else {
            z3 = z2;
            productCard2 = productCard;
            productId2 = productId;
            f2 = f;
            z4 = z;
        }
        this(str, str2, j, j2, z4, productId2, f2, productCard2, z3);
    }
}
