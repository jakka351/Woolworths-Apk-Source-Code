package au.com.woolworths.foundation.advertising.data.google.model;

import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/model/UniversalInventoryContainerData;", "", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "googleAdBannerCard", "universalInventoryFallback", "<init>", "(Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;Ljava/lang/Object;)V", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "a", "()Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UniversalInventoryContainerData {

    @SerializedName("googleAdBannerCard")
    @MappedName
    @Nullable
    private final GoogleAdBannerCard googleAdBannerCard;

    @SerializedName("nextBestAction")
    @MappedName
    @Nullable
    private final Object universalInventoryFallback;

    public UniversalInventoryContainerData(@Nullable GoogleAdBannerCard googleAdBannerCard, @Nullable Object obj) {
        this.googleAdBannerCard = googleAdBannerCard;
        this.universalInventoryFallback = obj;
    }

    /* renamed from: a, reason: from getter */
    public final GoogleAdBannerCard getGoogleAdBannerCard() {
        return this.googleAdBannerCard;
    }

    /* renamed from: b, reason: from getter */
    public final Object getUniversalInventoryFallback() {
        return this.universalInventoryFallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalInventoryContainerData)) {
            return false;
        }
        UniversalInventoryContainerData universalInventoryContainerData = (UniversalInventoryContainerData) obj;
        return Intrinsics.c(this.googleAdBannerCard, universalInventoryContainerData.googleAdBannerCard) && Intrinsics.c(this.universalInventoryFallback, universalInventoryContainerData.universalInventoryFallback);
    }

    public final int hashCode() {
        GoogleAdBannerCard googleAdBannerCard = this.googleAdBannerCard;
        int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
        Object obj = this.universalInventoryFallback;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalInventoryContainerData(googleAdBannerCard=" + this.googleAdBannerCard + ", universalInventoryFallback=" + this.universalInventoryFallback + ")";
    }
}
