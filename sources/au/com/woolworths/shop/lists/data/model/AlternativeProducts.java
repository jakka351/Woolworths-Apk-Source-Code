package au.com.woolworths.shop.lists.data.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProducts;", "", "sections", "", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", "disclaimer", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;", "<init>", "(Ljava/util/List;Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;)V", "getSections", "()Ljava/util/List;", "getDisclaimer", "()Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProducts {

    @Nullable
    private final AlternativeProductsDisclaimer disclaimer;

    @NotNull
    private final List<AlternativeProductsSection> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public AlternativeProducts(@NotNull List<? extends AlternativeProductsSection> sections, @Nullable AlternativeProductsDisclaimer alternativeProductsDisclaimer) {
        Intrinsics.h(sections, "sections");
        this.sections = sections;
        this.disclaimer = alternativeProductsDisclaimer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlternativeProducts copy$default(AlternativeProducts alternativeProducts, List list, AlternativeProductsDisclaimer alternativeProductsDisclaimer, int i, Object obj) {
        if ((i & 1) != 0) {
            list = alternativeProducts.sections;
        }
        if ((i & 2) != 0) {
            alternativeProductsDisclaimer = alternativeProducts.disclaimer;
        }
        return alternativeProducts.copy(list, alternativeProductsDisclaimer);
    }

    @NotNull
    public final List<AlternativeProductsSection> component1() {
        return this.sections;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AlternativeProductsDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final AlternativeProducts copy(@NotNull List<? extends AlternativeProductsSection> sections, @Nullable AlternativeProductsDisclaimer disclaimer) {
        Intrinsics.h(sections, "sections");
        return new AlternativeProducts(sections, disclaimer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProducts)) {
            return false;
        }
        AlternativeProducts alternativeProducts = (AlternativeProducts) other;
        return Intrinsics.c(this.sections, alternativeProducts.sections) && Intrinsics.c(this.disclaimer, alternativeProducts.disclaimer);
    }

    @Nullable
    public final AlternativeProductsDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<AlternativeProductsSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iHashCode = this.sections.hashCode() * 31;
        AlternativeProductsDisclaimer alternativeProductsDisclaimer = this.disclaimer;
        return iHashCode + (alternativeProductsDisclaimer == null ? 0 : alternativeProductsDisclaimer.hashCode());
    }

    @NotNull
    public String toString() {
        return "AlternativeProducts(sections=" + this.sections + ", disclaimer=" + this.disclaimer + ")";
    }

    public /* synthetic */ AlternativeProducts(List list, AlternativeProductsDisclaimer alternativeProductsDisclaimer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : alternativeProductsDisclaimer);
    }
}
