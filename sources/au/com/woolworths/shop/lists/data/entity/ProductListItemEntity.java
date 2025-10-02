package au.com.woolworths.shop.lists.data.entity;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Entity
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\u0083\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001J\u0013\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0016\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR \u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListItemEntity;", "id", "", "listId", "localCreatedAt", "", "localUpdatedAt", "remoteId", "remoteTimestamp", "isLocalEdited", "", "isLocalDeleted", "isChecked", "productId", "Lau/com/woolworths/product/models/ProductId;", "quantity", "", "productFoundInResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JZZZLau/com/woolworths/product/models/ProductId;FZ)V", "getId", "()Ljava/lang/String;", "getListId", "getLocalCreatedAt", "()J", "getLocalUpdatedAt", "getRemoteId", "getRemoteTimestamp", "()Z", "getProductId", "()Lau/com/woolworths/product/models/ProductId;", "getQuantity", "()F", "getProductFoundInResponse", "product", "Lau/com/woolworths/product/models/ProductCard;", "getProduct", "()Lau/com/woolworths/product/models/ProductCard;", "setProduct", "(Lau/com/woolworths/product/models/ProductCard;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductListItemEntity implements ShoppingListItemEntity {

    @PrimaryKey
    @ColumnInfo
    @NotNull
    private final String id;

    @ColumnInfo
    private final boolean isChecked;

    @ColumnInfo
    private final boolean isLocalDeleted;

    @ColumnInfo
    private final boolean isLocalEdited;

    @ColumnInfo
    @NotNull
    private final String listId;

    @ColumnInfo
    private final long localCreatedAt;

    @ColumnInfo
    private final long localUpdatedAt;

    @Ignore
    @Nullable
    private ProductCard product;

    @ColumnInfo
    private final boolean productFoundInResponse;

    @ColumnInfo
    @NotNull
    private final ProductId productId;

    @ColumnInfo
    private final float quantity;

    @ColumnInfo
    @Nullable
    private final String remoteId;

    @ColumnInfo
    private final long remoteTimestamp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String listId, @NotNull ProductId productId, float f) {
        this(null, listId, 0L, 0L, null, 0L, false, false, false, productId, f, false, 2557, null);
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ProductId getProductId() {
        return this.productId;
    }

    /* renamed from: component11, reason: from getter */
    public final float getQuantity() {
        return this.quantity;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getProductFoundInResponse() {
        return this.productFoundInResponse;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getListId() {
        return this.listId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLocalUpdatedAt() {
        return this.localUpdatedAt;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: component6, reason: from getter */
    public final long getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLocalEdited() {
        return this.isLocalEdited;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLocalDeleted() {
        return this.isLocalDeleted;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final ProductListItemEntity copy(@NotNull String id, @NotNull String listId, long localCreatedAt, long localUpdatedAt, @Nullable String remoteId, long remoteTimestamp, boolean isLocalEdited, boolean isLocalDeleted, boolean isChecked, @NotNull ProductId productId, float quantity, boolean productFoundInResponse) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        return new ProductListItemEntity(id, listId, localCreatedAt, localUpdatedAt, remoteId, remoteTimestamp, isLocalEdited, isLocalDeleted, isChecked, productId, quantity, productFoundInResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListItemEntity)) {
            return false;
        }
        ProductListItemEntity productListItemEntity = (ProductListItemEntity) other;
        return Intrinsics.c(this.id, productListItemEntity.id) && Intrinsics.c(this.listId, productListItemEntity.listId) && this.localCreatedAt == productListItemEntity.localCreatedAt && this.localUpdatedAt == productListItemEntity.localUpdatedAt && Intrinsics.c(this.remoteId, productListItemEntity.remoteId) && this.remoteTimestamp == productListItemEntity.remoteTimestamp && this.isLocalEdited == productListItemEntity.isLocalEdited && this.isLocalDeleted == productListItemEntity.isLocalDeleted && this.isChecked == productListItemEntity.isChecked && Intrinsics.c(this.productId, productListItemEntity.productId) && Float.compare(this.quantity, productListItemEntity.quantity) == 0 && this.productFoundInResponse == productListItemEntity.productFoundInResponse;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    @NotNull
    public String getListId() {
        return this.listId;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    public long getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    public long getLocalUpdatedAt() {
        return this.localUpdatedAt;
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

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    @Nullable
    public String getRemoteId() {
        return this.remoteId;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public long getRemoteTimestamp() {
        return this.remoteTimestamp;
    }

    public int hashCode() {
        int iB = b.b(b.b(b.c(this.id.hashCode() * 31, 31, this.listId), 31, this.localCreatedAt), 31, this.localUpdatedAt);
        String str = this.remoteId;
        return Boolean.hashCode(this.productFoundInResponse) + a.b(this.quantity, (this.productId.hashCode() + b.e(b.e(b.e(b.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.remoteTimestamp), 31, this.isLocalEdited), 31, this.isLocalDeleted), 31, this.isChecked)) * 31, 31);
    }

    @Override // au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity
    public boolean isChecked() {
        return this.isChecked;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public boolean isLocalDeleted() {
        return this.isLocalDeleted;
    }

    @Override // au.com.woolworths.shop.lists.data.entity.SyncableEntity
    public boolean isLocalEdited() {
        return this.isLocalEdited;
    }

    public final void setProduct(@Nullable ProductCard productCard) {
        this.product = productCard;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.listId;
        long j = this.localCreatedAt;
        long j2 = this.localUpdatedAt;
        String str3 = this.remoteId;
        long j3 = this.remoteTimestamp;
        boolean z = this.isLocalEdited;
        boolean z2 = this.isLocalDeleted;
        boolean z3 = this.isChecked;
        ProductId productId = this.productId;
        float f = this.quantity;
        boolean z4 = this.productFoundInResponse;
        StringBuilder sbV = YU.a.v("ProductListItemEntity(id=", str, ", listId=", str2, ", localCreatedAt=");
        sbV.append(j);
        androidx.constraintlayout.core.state.a.A(sbV, ", localUpdatedAt=", j2, ", remoteId=");
        sbV.append(str3);
        sbV.append(", remoteTimestamp=");
        sbV.append(j3);
        sbV.append(", isLocalEdited=");
        sbV.append(z);
        sbV.append(", isLocalDeleted=");
        sbV.append(z2);
        sbV.append(", isChecked=");
        sbV.append(z3);
        sbV.append(", productId=");
        sbV.append(productId);
        sbV.append(", quantity=");
        sbV.append(f);
        sbV.append(", productFoundInResponse=");
        sbV.append(z4);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @NotNull ProductId productId, float f) {
        this(id, listId, j, j2, null, 0L, false, false, false, productId, f, false, 2544, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, @NotNull ProductId productId, float f) {
        this(id, listId, j, j2, str, j3, false, false, false, productId, f, false, 2496, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, @NotNull ProductId productId, float f) {
        this(id, listId, j, j2, str, j3, z, false, false, productId, f, false, 2432, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, @NotNull ProductId productId, float f) {
        this(id, listId, j, j2, str, j3, z, z2, false, productId, f, false, 2304, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, @NotNull ProductId productId, float f) {
        this(id, listId, j, j2, str, j3, z, z2, z3, productId, f, false, 2048, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, @NotNull ProductId productId, float f) {
        this(id, listId, j, j2, str, 0L, false, false, false, productId, f, false, 2528, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, @NotNull ProductId productId, float f) {
        this(id, listId, j, 0L, null, 0L, false, false, false, productId, f, false, 2552, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, @NotNull ProductId productId, float f) {
        this(id, listId, 0L, 0L, null, 0L, false, false, false, productId, f, false, 2556, null);
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
    }

    @JvmOverloads
    public ProductListItemEntity(@NotNull String id, @NotNull String listId, long j, long j2, @Nullable String str, long j3, boolean z, boolean z2, boolean z3, @NotNull ProductId productId, float f, boolean z4) {
        Intrinsics.h(id, "id");
        Intrinsics.h(listId, "listId");
        Intrinsics.h(productId, "productId");
        this.id = id;
        this.listId = listId;
        this.localCreatedAt = j;
        this.localUpdatedAt = j2;
        this.remoteId = str;
        this.remoteTimestamp = j3;
        this.isLocalEdited = z;
        this.isLocalDeleted = z2;
        this.isChecked = z3;
        this.productId = productId;
        this.quantity = f;
        this.productFoundInResponse = z4;
    }

    public /* synthetic */ ProductListItemEntity(String str, String str2, long j, long j2, String str3, long j3, boolean z, boolean z2, boolean z3, ProductId productId, float f, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? 0L : j3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, productId, f, (i & 2048) != 0 ? false : z4);
    }
}
