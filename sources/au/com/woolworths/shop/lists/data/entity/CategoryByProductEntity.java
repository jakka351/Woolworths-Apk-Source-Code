package au.com.woolworths.shop.lists.data.entity;

import androidx.camera.core.impl.b;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import au.com.woolworths.product.models.ProductId;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Entity
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/CategoryByProductEntity;", "", "id", "", "productId", "Lau/com/woolworths/product/models/ProductId;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "categoryLevel", "", "<init>", "(JLau/com/woolworths/product/models/ProductId;Ljava/lang/String;I)V", "getId", "()J", "getProductId", "()Lau/com/woolworths/product/models/ProductId;", "getName", "()Ljava/lang/String;", "getCategoryLevel", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CategoryByProductEntity {

    @ColumnInfo
    private final int categoryLevel;

    @PrimaryKey
    @ColumnInfo
    private final long id;

    @ColumnInfo
    @NotNull
    private final String name;

    @ColumnInfo
    @NotNull
    private final ProductId productId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CategoryByProductEntity(@NotNull ProductId productId, @NotNull String name, int i) {
        this(0L, productId, name, i, 1, null);
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
    }

    public static /* synthetic */ CategoryByProductEntity copy$default(CategoryByProductEntity categoryByProductEntity, long j, ProductId productId, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = categoryByProductEntity.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            productId = categoryByProductEntity.productId;
        }
        ProductId productId2 = productId;
        if ((i2 & 4) != 0) {
            str = categoryByProductEntity.name;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = categoryByProductEntity.categoryLevel;
        }
        return categoryByProductEntity.copy(j2, productId2, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ProductId getProductId() {
        return this.productId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCategoryLevel() {
        return this.categoryLevel;
    }

    @NotNull
    public final CategoryByProductEntity copy(long id, @NotNull ProductId productId, @NotNull String name, int categoryLevel) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        return new CategoryByProductEntity(id, productId, name, categoryLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryByProductEntity)) {
            return false;
        }
        CategoryByProductEntity categoryByProductEntity = (CategoryByProductEntity) other;
        return this.id == categoryByProductEntity.id && Intrinsics.c(this.productId, categoryByProductEntity.productId) && Intrinsics.c(this.name, categoryByProductEntity.name) && this.categoryLevel == categoryByProductEntity.categoryLevel;
    }

    public final int getCategoryLevel() {
        return this.categoryLevel;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ProductId getProductId() {
        return this.productId;
    }

    public int hashCode() {
        return Integer.hashCode(this.categoryLevel) + b.c((this.productId.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        return "CategoryByProductEntity(id=" + this.id + ", productId=" + this.productId + ", name=" + this.name + ", categoryLevel=" + this.categoryLevel + ")";
    }

    @JvmOverloads
    public CategoryByProductEntity(long j, @NotNull ProductId productId, @NotNull String name, int i) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(name, "name");
        this.id = j;
        this.productId = productId;
        this.name = name;
        this.categoryLevel = i;
    }

    public /* synthetic */ CategoryByProductEntity(long j, ProductId productId, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, productId, str, i);
    }
}
