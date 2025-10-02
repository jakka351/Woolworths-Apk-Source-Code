package au.com.woolworths.shop.lists.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsProductSection;", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", "products", "", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductCard;", "sectionHeader", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsProductsHeaderSection;", "<init>", "(Ljava/util/List;Lau/com/woolworths/shop/lists/data/model/AlternativeProductsProductsHeaderSection;)V", "getProducts", "()Ljava/util/List;", "getSectionHeader", "()Lau/com/woolworths/shop/lists/data/model/AlternativeProductsProductsHeaderSection;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsProductSection implements AlternativeProductsSection {

    @NotNull
    private final List<AlternativeProductCard> products;

    @Nullable
    private final AlternativeProductsProductsHeaderSection sectionHeader;

    public AlternativeProductsProductSection(@NotNull List<AlternativeProductCard> products, @Nullable AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection) {
        Intrinsics.h(products, "products");
        this.products = products;
        this.sectionHeader = alternativeProductsProductsHeaderSection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlternativeProductsProductSection copy$default(AlternativeProductsProductSection alternativeProductsProductSection, List list, AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection, int i, Object obj) {
        if ((i & 1) != 0) {
            list = alternativeProductsProductSection.products;
        }
        if ((i & 2) != 0) {
            alternativeProductsProductsHeaderSection = alternativeProductsProductSection.sectionHeader;
        }
        return alternativeProductsProductSection.copy(list, alternativeProductsProductsHeaderSection);
    }

    @NotNull
    public final List<AlternativeProductCard> component1() {
        return this.products;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AlternativeProductsProductsHeaderSection getSectionHeader() {
        return this.sectionHeader;
    }

    @NotNull
    public final AlternativeProductsProductSection copy(@NotNull List<AlternativeProductCard> products, @Nullable AlternativeProductsProductsHeaderSection sectionHeader) {
        Intrinsics.h(products, "products");
        return new AlternativeProductsProductSection(products, sectionHeader);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProductsProductSection)) {
            return false;
        }
        AlternativeProductsProductSection alternativeProductsProductSection = (AlternativeProductsProductSection) other;
        return Intrinsics.c(this.products, alternativeProductsProductSection.products) && Intrinsics.c(this.sectionHeader, alternativeProductsProductSection.sectionHeader);
    }

    @NotNull
    public final List<AlternativeProductCard> getProducts() {
        return this.products;
    }

    @Nullable
    public final AlternativeProductsProductsHeaderSection getSectionHeader() {
        return this.sectionHeader;
    }

    public int hashCode() {
        int iHashCode = this.products.hashCode() * 31;
        AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection = this.sectionHeader;
        return iHashCode + (alternativeProductsProductsHeaderSection == null ? 0 : alternativeProductsProductsHeaderSection.hashCode());
    }

    @NotNull
    public String toString() {
        return "AlternativeProductsProductSection(products=" + this.products + ", sectionHeader=" + this.sectionHeader + ")";
    }

    public /* synthetic */ AlternativeProductsProductSection(List list, AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : alternativeProductsProductsHeaderSection);
    }
}
