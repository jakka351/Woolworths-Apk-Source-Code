package au.com.woolworths.shop.digipay.creditcard;

import au.com.woolworths.pay.sdk.web.FormFocusState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-digipay_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CreditCardErrorExtKt {
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final int a(FormFocusState formFocusState) {
        Boolean bool = formFocusState.f;
        Boolean bool2 = Boolean.FALSE;
        ?? C = Intrinsics.c(bool, bool2);
        int i = C;
        if (Intrinsics.c(formFocusState.e, bool2)) {
            i = C + 1;
        }
        int i2 = i;
        if (Intrinsics.c(formFocusState.d, bool2)) {
            i2 = i + 1;
        }
        return Intrinsics.c(formFocusState.c, bool2) ? i2 + 1 : i2;
    }
}
