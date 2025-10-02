package au.com.woolworths.feature.shop.modeselector.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelectorErrorResponse;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeSelectorErrorResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f7539a;
    public final String b;

    public ShoppingModeSelectorErrorResponse(String str, String str2) {
        this.f7539a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeSelectorErrorResponse)) {
            return false;
        }
        ShoppingModeSelectorErrorResponse shoppingModeSelectorErrorResponse = (ShoppingModeSelectorErrorResponse) obj;
        return Intrinsics.c(this.f7539a, shoppingModeSelectorErrorResponse.f7539a) && Intrinsics.c(this.b, shoppingModeSelectorErrorResponse.b);
    }

    public final int hashCode() {
        String str = this.f7539a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.j("ShoppingModeSelectorErrorResponse(deep=", this.f7539a, ", message=", this.b, ")");
    }
}
