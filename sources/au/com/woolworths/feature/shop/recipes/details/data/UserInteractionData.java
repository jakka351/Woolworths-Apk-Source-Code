package au.com.woolworths.feature.shop.recipes.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/UserInteractionData;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserInteractionData {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f8024a;
    public final String b;

    public UserInteractionData(String str, Boolean bool) {
        this.f8024a = bool;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInteractionData)) {
            return false;
        }
        UserInteractionData userInteractionData = (UserInteractionData) obj;
        return Intrinsics.c(this.f8024a, userInteractionData.f8024a) && Intrinsics.c(this.b, userInteractionData.b);
    }

    public final int hashCode() {
        Boolean bool = this.f8024a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UserInteractionData(isSaved=" + this.f8024a + ", recipeUrl=" + this.b + ")";
    }
}
