package au.com.woolworths.feature.shop.instore.navigation.map.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/Credentials;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Credentials {

    /* renamed from: a, reason: collision with root package name */
    public final String f7333a;

    public Credentials(String apiKey) {
        Intrinsics.h(apiKey, "apiKey");
        this.f7333a = apiKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Credentials) && Intrinsics.c(this.f7333a, ((Credentials) obj).f7333a);
    }

    public final int hashCode() {
        return ((this.f7333a.hashCode() + 1958258639) * 31) + 1219321508;
    }

    public final String toString() {
        return a.h("Credentials(userId=App User ID, apiKey=", this.f7333a, ", domain=api.au.oriient.me)");
    }
}
