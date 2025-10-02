package au.com.woolworths.feature.product.list.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/feature/product/list/data/ProductListChip;", "", "id", "", "isSelected", "", TextBundle.TEXT_ENTRY, "Lau/com/woolworths/feature/product/list/data/ChipText;", "persistentId", "<init>", "(Ljava/lang/String;ZLau/com/woolworths/feature/product/list/data/ChipText;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getText", "()Lau/com/woolworths/feature/product/list/data/ChipText;", "getPersistentId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListChip {
    public static final int $stable = 0;

    @NotNull
    private final String id;
    private final boolean isSelected;

    @Nullable
    private final String persistentId;

    @NotNull
    private final ChipText text;

    public ProductListChip(@NotNull String id, boolean z, @NotNull ChipText text, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        this.id = id;
        this.isSelected = z;
        this.text = text;
        this.persistentId = str;
    }

    public static /* synthetic */ ProductListChip copy$default(ProductListChip productListChip, String str, boolean z, ChipText chipText, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productListChip.id;
        }
        if ((i & 2) != 0) {
            z = productListChip.isSelected;
        }
        if ((i & 4) != 0) {
            chipText = productListChip.text;
        }
        if ((i & 8) != 0) {
            str2 = productListChip.persistentId;
        }
        return productListChip.copy(str, z, chipText, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ChipText getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPersistentId() {
        return this.persistentId;
    }

    @NotNull
    public final ProductListChip copy(@NotNull String id, boolean isSelected, @NotNull ChipText text, @Nullable String persistentId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        return new ProductListChip(id, isSelected, text, persistentId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListChip)) {
            return false;
        }
        ProductListChip productListChip = (ProductListChip) other;
        return Intrinsics.c(this.id, productListChip.id) && this.isSelected == productListChip.isSelected && Intrinsics.c(this.text, productListChip.text) && Intrinsics.c(this.persistentId, productListChip.persistentId);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPersistentId() {
        return this.persistentId;
    }

    @NotNull
    public final ChipText getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (this.text.hashCode() + b.e(this.id.hashCode() * 31, 31, this.isSelected)) * 31;
        String str = this.persistentId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        boolean z = this.isSelected;
        ChipText chipText = this.text;
        String str2 = this.persistentId;
        StringBuilder sbQ = a.q("ProductListChip(id=", str, ", isSelected=", ", text=", z);
        sbQ.append(chipText);
        sbQ.append(", persistentId=");
        sbQ.append(str2);
        sbQ.append(")");
        return sbQ.toString();
    }
}
