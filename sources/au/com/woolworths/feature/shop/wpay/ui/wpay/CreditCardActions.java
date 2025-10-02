package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/CreditCardActions;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditCardActions {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f8357a;
    public final Function2 b;
    public final Function2 c;

    public CreditCardActions(Function1 add, Function2 delete, Function2 toggle) {
        Intrinsics.h(add, "add");
        Intrinsics.h(delete, "delete");
        Intrinsics.h(toggle, "toggle");
        this.f8357a = add;
        this.b = delete;
        this.c = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardActions)) {
            return false;
        }
        CreditCardActions creditCardActions = (CreditCardActions) obj;
        return Intrinsics.c(this.f8357a, creditCardActions.f8357a) && Intrinsics.c(this.b, creditCardActions.b) && Intrinsics.c(this.c, creditCardActions.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f8357a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreditCardActions(add=" + this.f8357a + ", delete=" + this.b + ", toggle=" + this.c + ")";
    }
}
