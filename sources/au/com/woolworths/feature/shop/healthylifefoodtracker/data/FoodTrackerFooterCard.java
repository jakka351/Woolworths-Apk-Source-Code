package au.com.woolworths.feature.shop.healthylifefoodtracker.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerFooterCard;", "", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FoodTrackerFooterCard {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadableAsset f7166a;
    public final String b;
    public final FoodTrackerAction c;
    public final FoodTrackerFooterActionType d;
    public final String e;

    public FoodTrackerFooterCard(DownloadableAsset downloadableAsset, String str, FoodTrackerConsent foodTrackerConsent, FoodTrackerFooterActionType foodTrackerFooterActionType, String str2) {
        this.f7166a = downloadableAsset;
        this.b = str;
        this.c = foodTrackerConsent;
        this.d = foodTrackerFooterActionType;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodTrackerFooterCard)) {
            return false;
        }
        FoodTrackerFooterCard foodTrackerFooterCard = (FoodTrackerFooterCard) obj;
        return Intrinsics.c(this.f7166a, foodTrackerFooterCard.f7166a) && Intrinsics.c(this.b, foodTrackerFooterCard.b) && Intrinsics.c(this.c, foodTrackerFooterCard.c) && this.d == foodTrackerFooterCard.d && Intrinsics.c(this.e, foodTrackerFooterCard.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f7166a.hashCode() * 31, 31, this.b);
        FoodTrackerAction foodTrackerAction = this.c;
        int iHashCode = (iC + (foodTrackerAction == null ? 0 : foodTrackerAction.hashCode())) * 31;
        FoodTrackerFooterActionType foodTrackerFooterActionType = this.d;
        int iHashCode2 = (iHashCode + (foodTrackerFooterActionType == null ? 0 : foodTrackerFooterActionType.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FoodTrackerFooterCard(icon=");
        sb.append(this.f7166a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", consentAction=");
        sb.append(this.c);
        sb.append(", actionType=");
        sb.append(this.d);
        sb.append(", primaryCtaLabel=");
        return a.o(sb, this.e, ")");
    }
}
