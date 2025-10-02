package au.com.woolworths.base.wallet.ocr.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/ocr/utils/CardDetailsUtils;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CardDetailsUtils {
    public static CardDetails a(PaymentCardRecognitionResult paymentCardRecognitionResult) {
        String pan = paymentCardRecognitionResult.getPan();
        Intrinsics.g(pan, "getPan(...)");
        CreditCardExpirationDate creditCardExpirationDate = paymentCardRecognitionResult.getCreditCardExpirationDate();
        Integer numValueOf = creditCardExpirationDate != null ? Integer.valueOf(creditCardExpirationDate.getMonth()) : null;
        CreditCardExpirationDate creditCardExpirationDate2 = paymentCardRecognitionResult.getCreditCardExpirationDate();
        return b(pan, numValueOf, creditCardExpirationDate2 != null ? Integer.valueOf(creditCardExpirationDate2.getYear()) : null, null);
    }

    public static CardDetails b(String cardNumber, Integer num, Integer num2, String str) {
        String str2;
        Intrinsics.h(cardNumber, "cardNumber");
        if (num == null || num.intValue() <= 0 || num2 == null || num2.intValue() <= 0) {
            str2 = null;
        } else {
            str2 = String.format("%02d/%s", Arrays.copyOf(new Object[]{num, num2.toString().length() > 2 ? StringsKt.g0(2, num2.toString()) : num2.toString()}, 2));
        }
        return new CardDetails(cardNumber, str2, str);
    }
}
