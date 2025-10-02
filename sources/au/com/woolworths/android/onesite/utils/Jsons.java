package au.com.woolworths.android.onesite.utils;

import au.com.woolworths.android.onesite.models.checkout.ZeroBalancePaymentError;
import au.com.woolworths.foundation.shop.model.checkout.PaymentErrors;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import timber.log.Timber;

/* loaded from: classes3.dex */
public class Jsons {
    public static PaymentErrors a(Gson gson, String str) {
        try {
            if (str.contains("ResponseStatus") && str.contains("Message")) {
                return (PaymentErrors) gson.d(PaymentErrors.class, str);
            }
            return null;
        } catch (JsonParseException e) {
            Timber.b(e);
            return null;
        }
    }

    public static ZeroBalancePaymentError b(Gson gson, String str) {
        try {
            if (str.contains("canProceedToPayment") && str.contains("message")) {
                return (ZeroBalancePaymentError) gson.d(ZeroBalancePaymentError.class, str);
            }
            return null;
        } catch (JsonParseException e) {
            Timber.b(e);
            return null;
        }
    }

    public static boolean c(JsonObject jsonObject) {
        return (jsonObject == null || jsonObject.i("orderId") == null || jsonObject.i("placed") == null) ? false : true;
    }
}
