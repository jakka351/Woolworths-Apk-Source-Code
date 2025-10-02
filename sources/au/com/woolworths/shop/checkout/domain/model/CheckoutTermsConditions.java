package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/CheckoutTermsConditions;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CheckoutTermsConditions {

    /* renamed from: a, reason: collision with root package name */
    public final String f10590a;

    public CheckoutTermsConditions(String str) {
        this.f10590a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutTermsConditions) && Intrinsics.c(this.f10590a, ((CheckoutTermsConditions) obj).f10590a);
    }

    public final int hashCode() {
        return this.f10590a.hashCode();
    }

    public final String toString() {
        return a.h("CheckoutTermsConditions(markdownText=", this.f10590a, ")");
    }
}
