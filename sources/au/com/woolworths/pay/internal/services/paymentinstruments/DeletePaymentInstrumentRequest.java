package au.com.woolworths.pay.internal.services.paymentinstruments;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.APIRequest;
import au.com.woolworths.pay.internal.network.JSONEncodingException;
import au.com.woolworths.pay.sdk.models.config.Configuration;

@Keep
/* loaded from: classes4.dex */
class DeletePaymentInstrumentRequest extends APIRequest {

    @NonNull
    private String instrumentId;

    public DeletePaymentInstrumentRequest(@NonNull String str, @NonNull Configuration configuration, @NonNull String str2) {
        super(str, configuration);
        this.instrumentId = str2;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @Nullable
    public String getData() throws JSONEncodingException {
        return null;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getMethod() {
        return "DELETE";
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @NonNull
    public String getRelativePath() {
        return "/instruments/" + this.instrumentId;
    }
}
