package au.com.woolworths.shop.lists.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsProductsHeaderSection;", "", "title", "", "disclaimer", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;", "typeTag", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsTypeTag;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;Lau/com/woolworths/shop/lists/data/model/AlternativeProductsTypeTag;)V", "getTitle", "()Ljava/lang/String;", "getDisclaimer", "()Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;", "getTypeTag", "()Lau/com/woolworths/shop/lists/data/model/AlternativeProductsTypeTag;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsProductsHeaderSection {

    @Nullable
    private final AlternativeProductsDisclaimer disclaimer;

    @Nullable
    private final String title;

    @Nullable
    private final AlternativeProductsTypeTag typeTag;

    public AlternativeProductsProductsHeaderSection() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AlternativeProductsProductsHeaderSection copy$default(AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection, String str, AlternativeProductsDisclaimer alternativeProductsDisclaimer, AlternativeProductsTypeTag alternativeProductsTypeTag, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alternativeProductsProductsHeaderSection.title;
        }
        if ((i & 2) != 0) {
            alternativeProductsDisclaimer = alternativeProductsProductsHeaderSection.disclaimer;
        }
        if ((i & 4) != 0) {
            alternativeProductsTypeTag = alternativeProductsProductsHeaderSection.typeTag;
        }
        return alternativeProductsProductsHeaderSection.copy(str, alternativeProductsDisclaimer, alternativeProductsTypeTag);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final AlternativeProductsDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AlternativeProductsTypeTag getTypeTag() {
        return this.typeTag;
    }

    @NotNull
    public final AlternativeProductsProductsHeaderSection copy(@Nullable String title, @Nullable AlternativeProductsDisclaimer disclaimer, @Nullable AlternativeProductsTypeTag typeTag) {
        return new AlternativeProductsProductsHeaderSection(title, disclaimer, typeTag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlternativeProductsProductsHeaderSection)) {
            return false;
        }
        AlternativeProductsProductsHeaderSection alternativeProductsProductsHeaderSection = (AlternativeProductsProductsHeaderSection) other;
        return Intrinsics.c(this.title, alternativeProductsProductsHeaderSection.title) && Intrinsics.c(this.disclaimer, alternativeProductsProductsHeaderSection.disclaimer) && Intrinsics.c(this.typeTag, alternativeProductsProductsHeaderSection.typeTag);
    }

    @Nullable
    public final AlternativeProductsDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final AlternativeProductsTypeTag getTypeTag() {
        return this.typeTag;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AlternativeProductsDisclaimer alternativeProductsDisclaimer = this.disclaimer;
        int iHashCode2 = (iHashCode + (alternativeProductsDisclaimer == null ? 0 : alternativeProductsDisclaimer.hashCode())) * 31;
        AlternativeProductsTypeTag alternativeProductsTypeTag = this.typeTag;
        return iHashCode2 + (alternativeProductsTypeTag != null ? alternativeProductsTypeTag.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlternativeProductsProductsHeaderSection(title=" + this.title + ", disclaimer=" + this.disclaimer + ", typeTag=" + this.typeTag + ")";
    }

    public AlternativeProductsProductsHeaderSection(@Nullable String str, @Nullable AlternativeProductsDisclaimer alternativeProductsDisclaimer, @Nullable AlternativeProductsTypeTag alternativeProductsTypeTag) {
        this.title = str;
        this.disclaimer = alternativeProductsDisclaimer;
        this.typeTag = alternativeProductsTypeTag;
    }

    public /* synthetic */ AlternativeProductsProductsHeaderSection(String str, AlternativeProductsDisclaimer alternativeProductsDisclaimer, AlternativeProductsTypeTag alternativeProductsTypeTag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : alternativeProductsDisclaimer, (i & 4) != 0 ? null : alternativeProductsTypeTag);
    }
}
