package au.com.woolworths.product.models;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lau/com/woolworths/product/models/PromotionCard;", "Lau/com/woolworths/shop/aem/components/model/horizontalList/HorizontalListItem;", "productCard", "Lau/com/woolworths/product/models/ProductCard;", "offerId", "", "analytics", "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalytics", "impressionAnalyticsData", "<init>", "(Lau/com/woolworths/product/models/ProductCard;Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "getProductCard", "()Lau/com/woolworths/product/models/ProductCard;", "getOfferId", "()Ljava/lang/String;", "getAnalytics", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "getImpressionAnalytics", "getImpressionAnalyticsData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionCard implements HorizontalListItem {
    public static final int $stable = 8;

    @Nullable
    private final AnalyticsData analytics;

    @Nullable
    private final AnalyticsData impressionAnalytics;

    @Nullable
    private final AnalyticsData impressionAnalyticsData;

    @MappedName
    @Nullable
    private final String offerId;

    @MappedName
    @NotNull
    private final ProductCard productCard;

    public PromotionCard(@NotNull ProductCard productCard, @Nullable String str, @Nullable AnalyticsData analyticsData, @Nullable AnalyticsData analyticsData2, @Nullable AnalyticsData analyticsData3) {
        Intrinsics.h(productCard, "productCard");
        this.productCard = productCard;
        this.offerId = str;
        this.analytics = analyticsData;
        this.impressionAnalytics = analyticsData2;
        this.impressionAnalyticsData = analyticsData3;
    }

    public static /* synthetic */ PromotionCard copy$default(PromotionCard promotionCard, ProductCard productCard, String str, AnalyticsData analyticsData, AnalyticsData analyticsData2, AnalyticsData analyticsData3, int i, Object obj) {
        if ((i & 1) != 0) {
            productCard = promotionCard.productCard;
        }
        if ((i & 2) != 0) {
            str = promotionCard.offerId;
        }
        if ((i & 4) != 0) {
            analyticsData = promotionCard.analytics;
        }
        if ((i & 8) != 0) {
            analyticsData2 = promotionCard.impressionAnalytics;
        }
        if ((i & 16) != 0) {
            analyticsData3 = promotionCard.impressionAnalyticsData;
        }
        AnalyticsData analyticsData4 = analyticsData3;
        AnalyticsData analyticsData5 = analyticsData;
        return promotionCard.copy(productCard, str, analyticsData5, analyticsData2, analyticsData4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductCard getProductCard() {
        return this.productCard;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final AnalyticsData getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final AnalyticsData getImpressionAnalyticsData() {
        return this.impressionAnalyticsData;
    }

    @NotNull
    public final PromotionCard copy(@NotNull ProductCard productCard, @Nullable String offerId, @Nullable AnalyticsData analytics, @Nullable AnalyticsData impressionAnalytics, @Nullable AnalyticsData impressionAnalyticsData) {
        Intrinsics.h(productCard, "productCard");
        return new PromotionCard(productCard, offerId, analytics, impressionAnalytics, impressionAnalyticsData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionCard)) {
            return false;
        }
        PromotionCard promotionCard = (PromotionCard) other;
        return Intrinsics.c(this.productCard, promotionCard.productCard) && Intrinsics.c(this.offerId, promotionCard.offerId) && Intrinsics.c(this.analytics, promotionCard.analytics) && Intrinsics.c(this.impressionAnalytics, promotionCard.impressionAnalytics) && Intrinsics.c(this.impressionAnalyticsData, promotionCard.impressionAnalyticsData);
    }

    @Nullable
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final AnalyticsData getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    @Override // au.com.woolworths.shop.aem.components.model.horizontalList.HorizontalListItem
    @Nullable
    public AnalyticsData getImpressionAnalyticsData() {
        return this.impressionAnalyticsData;
    }

    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final ProductCard getProductCard() {
        return this.productCard;
    }

    public int hashCode() {
        int iHashCode = this.productCard.hashCode() * 31;
        String str = this.offerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsData analyticsData = this.analytics;
        int iHashCode3 = (iHashCode2 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.impressionAnalytics;
        int iHashCode4 = (iHashCode3 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        AnalyticsData analyticsData3 = this.impressionAnalyticsData;
        return iHashCode4 + (analyticsData3 != null ? analyticsData3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ProductCard productCard = this.productCard;
        String str = this.offerId;
        AnalyticsData analyticsData = this.analytics;
        AnalyticsData analyticsData2 = this.impressionAnalytics;
        AnalyticsData analyticsData3 = this.impressionAnalyticsData;
        StringBuilder sb = new StringBuilder("PromotionCard(productCard=");
        sb.append(productCard);
        sb.append(", offerId=");
        sb.append(str);
        sb.append(", analytics=");
        sb.append(analyticsData);
        sb.append(", impressionAnalytics=");
        sb.append(analyticsData2);
        sb.append(", impressionAnalyticsData=");
        return a.n(sb, analyticsData3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PromotionCard(ProductCard productCard, String str, AnalyticsData analyticsData, AnalyticsData analyticsData2, AnalyticsData analyticsData3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AnalyticsData analyticsData4;
        AnalyticsData analyticsData5;
        analyticsData = (i & 4) != 0 ? null : analyticsData;
        analyticsData2 = (i & 8) != 0 ? null : analyticsData2;
        if ((i & 16) != 0) {
            analyticsData5 = analyticsData2;
            analyticsData4 = analyticsData5;
        } else {
            analyticsData4 = analyticsData3;
            analyticsData5 = analyticsData2;
        }
        this(productCard, str, analyticsData, analyticsData5, analyticsData4);
    }
}
