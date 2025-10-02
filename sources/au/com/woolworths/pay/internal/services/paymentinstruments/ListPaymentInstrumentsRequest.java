package au.com.woolworths.pay.internal.services.paymentinstruments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.APIRequest;
import au.com.woolworths.pay.internal.network.JSONEncodingException;
import au.com.woolworths.pay.sdk.models.config.Configuration;

/* loaded from: classes4.dex */
class ListPaymentInstrumentsRequest extends APIRequest {
    public ListPaymentInstrumentsRequest(@NonNull String str, @NonNull Configuration configuration) {
        super(str, configuration);
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @Nullable
    public String getData() throws JSONEncodingException {
        return null;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getMethod() {
        return "GET";
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getRelativePath() {
        return "/instruments";
    }
}
