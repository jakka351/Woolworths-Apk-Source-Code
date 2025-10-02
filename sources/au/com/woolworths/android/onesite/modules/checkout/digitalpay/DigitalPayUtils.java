package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.android.onesite.utils.Strings;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import au.com.woolworths.pay.sdk.web.FormFocusState;

/* loaded from: classes3.dex */
public class DigitalPayUtils {
    public static String a(String str) {
        return Strings.b(str) ? "" : YU.a.A("X-", str);
    }

    public static boolean b(BaseError baseError) {
        if (PayErrorCode.FORM_ERROR == baseError.getPayErrorCode()) {
            return "Error loading iFrame.".equals(baseError.getErrorMessage()) || "Unable to process request".equals(baseError.getErrorMessage());
        }
        return false;
    }

    public static boolean c(FormFocusState formFocusState) {
        if (formFocusState == null || formFocusState.b.booleanValue()) {
            return false;
        }
        return formFocusState.g == null || formFocusState.e == null || formFocusState.f == null || formFocusState.d == null;
    }
}
