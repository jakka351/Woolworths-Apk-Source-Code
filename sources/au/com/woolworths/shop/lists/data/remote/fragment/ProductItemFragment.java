package au.com.woolworths.shop.lists.data.remote.fragment;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "timestamp", "", "id", "", "productId", "quantity", "checked", "", "<init>", "(DLjava/lang/String;Ljava/lang/String;DZ)V", "getTimestamp", "()D", "getId", "()Ljava/lang/String;", "getProductId", "getQuantity", "getChecked", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductItemFragment implements Fragment.Data {
    private final boolean checked;

    @NotNull
    private final String id;

    @NotNull
    private final String productId;
    private final double quantity;
    private final double timestamp;

    public ProductItemFragment(double d, @NotNull String id, @NotNull String productId, double d2, boolean z) {
        Intrinsics.h(id, "id");
        Intrinsics.h(productId, "productId");
        this.timestamp = d;
        this.id = id;
        this.productId = productId;
        this.quantity = d2;
        this.checked = z;
    }

    public static /* synthetic */ ProductItemFragment copy$default(ProductItemFragment productItemFragment, double d, String str, String str2, double d2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = productItemFragment.timestamp;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            str = productItemFragment.id;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = productItemFragment.productId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            d2 = productItemFragment.quantity;
        }
        double d4 = d2;
        if ((i & 16) != 0) {
            z = productItemFragment.checked;
        }
        return productItemFragment.copy(d3, str3, str4, d4, z);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component4, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final ProductItemFragment copy(double timestamp, @NotNull String id, @NotNull String productId, double quantity, boolean checked) {
        Intrinsics.h(id, "id");
        Intrinsics.h(productId, "productId");
        return new ProductItemFragment(timestamp, id, productId, quantity, checked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductItemFragment)) {
            return false;
        }
        ProductItemFragment productItemFragment = (ProductItemFragment) other;
        return Double.compare(this.timestamp, productItemFragment.timestamp) == 0 && Intrinsics.c(this.id, productItemFragment.id) && Intrinsics.c(this.productId, productItemFragment.productId) && Double.compare(this.quantity, productItemFragment.quantity) == 0 && this.checked == productItemFragment.checked;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Boolean.hashCode(this.checked) + a.a(this.quantity, b.c(b.c(Double.hashCode(this.timestamp) * 31, 31, this.id), 31, this.productId), 31);
    }

    @NotNull
    public String toString() {
        double d = this.timestamp;
        String str = this.id;
        String str2 = this.productId;
        double d2 = this.quantity;
        boolean z = this.checked;
        StringBuilder sb = new StringBuilder("ProductItemFragment(timestamp=");
        sb.append(d);
        sb.append(", id=");
        sb.append(str);
        androidx.compose.ui.input.pointer.a.w(sb, ", productId=", str2, ", quantity=");
        sb.append(d2);
        sb.append(", checked=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
