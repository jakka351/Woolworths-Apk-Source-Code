package au.com.woolworths.shop.lists.data.model;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/AlternativeProductsInsetBannerSection;", "Lau/com/woolworths/shop/lists/data/model/AlternativeProductsSection;", "insetBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "<init>", "(Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;)V", "getInsetBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlternativeProductsInsetBannerSection implements AlternativeProductsSection {

    @Nullable
    private final InsetBannerApiData insetBanner;

    public AlternativeProductsInsetBannerSection(@Nullable InsetBannerApiData insetBannerApiData) {
        this.insetBanner = insetBannerApiData;
    }

    public static /* synthetic */ AlternativeProductsInsetBannerSection copy$default(AlternativeProductsInsetBannerSection alternativeProductsInsetBannerSection, InsetBannerApiData insetBannerApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            insetBannerApiData = alternativeProductsInsetBannerSection.insetBanner;
        }
        return alternativeProductsInsetBannerSection.copy(insetBannerApiData);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    @NotNull
    public final AlternativeProductsInsetBannerSection copy(@Nullable InsetBannerApiData insetBanner) {
        return new AlternativeProductsInsetBannerSection(insetBanner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlternativeProductsInsetBannerSection) && Intrinsics.c(this.insetBanner, ((AlternativeProductsInsetBannerSection) other).insetBanner);
    }

    @Nullable
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    public int hashCode() {
        InsetBannerApiData insetBannerApiData = this.insetBanner;
        if (insetBannerApiData == null) {
            return 0;
        }
        return insetBannerApiData.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlternativeProductsInsetBannerSection(insetBanner=" + this.insetBanner + ")";
    }
}
