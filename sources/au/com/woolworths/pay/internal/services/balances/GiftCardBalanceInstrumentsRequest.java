package au.com.woolworths.pay.internal.services.balances;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONEncodingException;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes4.dex */
class GiftCardBalanceInstrumentsRequest extends GiftCardBalanceRequest {

    @NonNull
    private String[] paymentInstrumentIds;

    public GiftCardBalanceInstrumentsRequest(@NonNull String str, @NonNull Configuration configuration, @NonNull String[] strArr) {
        super(str, configuration);
        this.paymentInstrumentIds = strArr;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @Nullable
    public String getData() throws JSONException, JSONEncodingException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : this.paymentInstrumentIds) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("paymentInstrumentId", str);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("giftCardInstruments", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            throw new JSONEncodingException(e.getLocalizedMessage());
        }
    }
}
