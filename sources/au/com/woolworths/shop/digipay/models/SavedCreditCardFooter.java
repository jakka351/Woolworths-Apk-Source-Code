package au.com.woolworths.shop.digipay.models;

import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/models/SavedCreditCardFooter;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SavedCreditCardFooter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10923a;

    public SavedCreditCardFooter(boolean z) {
        this.f10923a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedCreditCardFooter) && this.f10923a == ((SavedCreditCardFooter) obj).f10923a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10923a);
    }

    public final String toString() {
        return a.n("SavedCreditCardFooter(showAddNewCardButton=", ")", this.f10923a);
    }
}
