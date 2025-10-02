package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductCard;", "", "product", "Lau/com/woolworths/product/models/ProductCard;", "substitutionSource", "", "<init>", "(Lau/com/woolworths/product/models/ProductCard;Ljava/lang/String;)V", "getProduct", "()Lau/com/woolworths/product/models/ProductCard;", "getSubstitutionSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductCard {

    @NotNull
    private final ProductCard product;

    @NotNull
    private final String substitutionSource;

    public AlternativeProductCard(@NotNull ProductCard product, @NotNull String substitutionSource) {
        Intrinsics.h(product, "product");
        Intrinsics.h(substitutionSource, "substitutionSource");
        this.product = product;
        this.substitutionSource = substitutionSource;
    }

    public static /* synthetic */ AlternativeProductCard copy$default(AlternativeProductCard alternativeProductCard, ProductCard productCard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productCard = alternativeProductCard.product;
        }
        if ((i & 2) != 0) {
            str = alternativeProductCard.substitutionSource;
        }
        return alternativeProductCard.copy(productCard, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductCard getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubstitutionSource() {
        return this.substitutionSource;
    }

    @NotNull
    public final AlternativeProductCard copy(@NotNull ProductCard product, @NotNull String substitutionSource) {
        Intrinsics.h(product, "product");
        Intrinsics.h(substitutionSource, "substitutionSource");
        return new AlternativeProductCard(product, substitutionSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProductCard)) {
            return false;
        }
        AlternativeProductCard alternativeProductCard = (AlternativeProductCard) other;
        return Intrinsics.c(this.product, alternativeProductCard.product) && Intrinsics.c(this.substitutionSource, alternativeProductCard.substitutionSource);
    }

    @NotNull
    public final ProductCard getProduct() {
        return this.product;
    }

    @NotNull
    public final String getSubstitutionSource() {
        return this.substitutionSource;
    }

    public int hashCode() {
        return this.substitutionSource.hashCode() + (this.product.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AlternativeProductCard(product=" + this.product + ", substitutionSource=" + this.substitutionSource + ")";
    }
}
