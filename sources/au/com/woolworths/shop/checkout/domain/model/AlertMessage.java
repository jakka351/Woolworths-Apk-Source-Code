package au.com.woolworths.shop.checkout.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/AlertMessage;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlertMessage {

    /* renamed from: a, reason: collision with root package name */
    public final Text f10554a;
    public final ResText b;

    public AlertMessage(ResText resText, ResText resText2) {
        this.f10554a = resText;
        this.b = resText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertMessage)) {
            return false;
        }
        AlertMessage alertMessage = (AlertMessage) obj;
        return Intrinsics.c(this.f10554a, alertMessage.f10554a) && this.b.equals(alertMessage.b);
    }

    public final int hashCode() {
        Text text = this.f10554a;
        return this.b.hashCode() + ((text == null ? 0 : text.hashCode()) * 31);
    }

    public final String toString() {
        return "AlertMessage(title=" + this.f10554a + ", message=" + this.b + ")";
    }
}
