package au.com.woolworths.shop.digipay.models;

import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.pay.sdk.models.CardCaptureInfo;
import au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/digipay/models/AddNewCreditCard;", "", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddNewCreditCard {

    /* renamed from: a, reason: collision with root package name */
    public final CardCaptureInfo f10921a;
    public final List b;
    public final CreditCardCaptureInlineErrorState c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public AddNewCreditCard(CardCaptureInfo cardCaptureInfo, List list, CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState, boolean z, boolean z2, boolean z3) {
        this.f10921a = cardCaptureInfo;
        this.b = list;
        this.c = creditCardCaptureInlineErrorState;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static AddNewCreditCard a(AddNewCreditCard addNewCreditCard, CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState, boolean z, int i) {
        CardCaptureInfo cardCaptureInfo = addNewCreditCard.f10921a;
        List list = addNewCreditCard.b;
        if ((i & 4) != 0) {
            creditCardCaptureInlineErrorState = addNewCreditCard.c;
        }
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState2 = creditCardCaptureInlineErrorState;
        boolean z2 = (i & 8) != 0 ? addNewCreditCard.d : true;
        boolean z3 = addNewCreditCard.e;
        if ((i & 32) != 0) {
            z = addNewCreditCard.f;
        }
        addNewCreditCard.getClass();
        return new AddNewCreditCard(cardCaptureInfo, list, creditCardCaptureInlineErrorState2, z2, z3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddNewCreditCard)) {
            return false;
        }
        AddNewCreditCard addNewCreditCard = (AddNewCreditCard) obj;
        return Intrinsics.c(this.f10921a, addNewCreditCard.f10921a) && this.b.equals(addNewCreditCard.b) && this.c == addNewCreditCard.c && this.d == addNewCreditCard.d && this.e == addNewCreditCard.e && this.f == addNewCreditCard.f;
    }

    public final int hashCode() {
        CardCaptureInfo cardCaptureInfo = this.f10921a;
        int iD = b.d((cardCaptureInfo == null ? 0 : cardCaptureInfo.hashCode()) * 31, 31, this.b);
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState = this.c;
        return Boolean.hashCode(this.f) + b.e(b.e((iD + (creditCardCaptureInlineErrorState != null ? creditCardCaptureInlineErrorState.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddNewCreditCard(cardCaptureInfo=");
        sb.append(this.f10921a);
        sb.append(", acceptedCreditCardTypes=");
        sb.append(this.b);
        sb.append(", cardCaptureInlineErrorState=");
        sb.append(this.c);
        sb.append(", isCardCaptureViewLoaded=");
        sb.append(this.d);
        sb.append(", isCardCaptureViewLoadFailed=");
        return a.q(sb, this.e, ", saveForLater=", this.f, ")");
    }
}
