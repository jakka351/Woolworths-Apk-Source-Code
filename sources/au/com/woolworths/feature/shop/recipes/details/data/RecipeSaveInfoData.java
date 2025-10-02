package au.com.woolworths.feature.shop.recipes.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/details/data/RecipeSaveInfoData;", "", "recipe-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecipeSaveInfoData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8021a;
    public final String b;

    public RecipeSaveInfoData(boolean z, String str) {
        this.f8021a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipeSaveInfoData)) {
            return false;
        }
        RecipeSaveInfoData recipeSaveInfoData = (RecipeSaveInfoData) obj;
        return this.f8021a == recipeSaveInfoData.f8021a && Intrinsics.c(this.b, recipeSaveInfoData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f8021a) * 31);
    }

    public final String toString() {
        return a.m("RecipeSaveInfoData(isSaved=", this.f8021a, ", message=", this.b, ")");
    }
}
