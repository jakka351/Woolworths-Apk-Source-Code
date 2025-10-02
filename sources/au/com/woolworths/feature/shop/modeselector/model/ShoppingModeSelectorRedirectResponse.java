package au.com.woolworths.feature.shop.modeselector.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSelectorRedirectResponse;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeSelectorRedirectResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f7542a;

    public ShoppingModeSelectorRedirectResponse(String str) {
        this.f7542a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingModeSelectorRedirectResponse) && Intrinsics.c(this.f7542a, ((ShoppingModeSelectorRedirectResponse) obj).f7542a);
    }

    public final int hashCode() {
        return this.f7542a.hashCode();
    }

    public final String toString() {
        return a.h("ShoppingModeSelectorRedirectResponse(deepLinkUrl=", this.f7542a, ")");
    }
}
