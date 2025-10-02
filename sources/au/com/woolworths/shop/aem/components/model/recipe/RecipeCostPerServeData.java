package au.com.woolworths.shop.aem.components.model.recipe;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/recipe/RecipeCostPerServeData;", "", "", "price", "Lau/com/woolworths/sdui/shop/broadcastbanner/model/BasicCoreBroadcastBannerModel;", "faqBanner", "<init>", "(DLau/com/woolworths/sdui/shop/broadcastbanner/model/BasicCoreBroadcastBannerModel;)V", "D", "b", "()D", "Lau/com/woolworths/sdui/shop/broadcastbanner/model/BasicCoreBroadcastBannerModel;", "a", "()Lau/com/woolworths/sdui/shop/broadcastbanner/model/BasicCoreBroadcastBannerModel;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RecipeCostPerServeData {

    @SerializedName("recipeCostPerServeBanner")
    @MappedName
    @Nullable
    private final BasicCoreBroadcastBannerModel faqBanner;

    @SerializedName("recipeCostPerServePrice")
    @MappedName
    private final double price;

    public RecipeCostPerServeData(double d, @Nullable BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel) {
        this.price = d;
        this.faqBanner = basicCoreBroadcastBannerModel;
    }

    /* renamed from: a, reason: from getter */
    public final BasicCoreBroadcastBannerModel getFaqBanner() {
        return this.faqBanner;
    }

    /* renamed from: b, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeCostPerServeData)) {
            return false;
        }
        RecipeCostPerServeData recipeCostPerServeData = (RecipeCostPerServeData) obj;
        return Double.compare(this.price, recipeCostPerServeData.price) == 0 && Intrinsics.c(this.faqBanner, recipeCostPerServeData.faqBanner);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.price) * 31;
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = this.faqBanner;
        return iHashCode + (basicCoreBroadcastBannerModel == null ? 0 : basicCoreBroadcastBannerModel.hashCode());
    }

    public final String toString() {
        return "RecipeCostPerServeData(price=" + this.price + ", faqBanner=" + this.faqBanner + ")";
    }
}
