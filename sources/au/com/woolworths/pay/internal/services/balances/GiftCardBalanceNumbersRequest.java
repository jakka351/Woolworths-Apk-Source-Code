package au.com.woolworths.pay.internal.services.balances;

import android.util.Pair;
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
class GiftCardBalanceNumbersRequest extends GiftCardBalanceRequest {

    @NonNull
    private Pair<String, String>[] cardNumbersAndPINCodes;

    public GiftCardBalanceNumbersRequest(@NonNull String str, @NonNull Configuration configuration, @NonNull Pair<String, String>[] pairArr) {
        super(str, configuration);
        this.cardNumbersAndPINCodes = pairArr;
    }

    @Override // au.com.woolworths.pay.internal.network.APIRequest
    @Nullable
    public String getData() throws JSONException, JSONEncodingException {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Pair<String, String> pair : this.cardNumbersAndPINCodes) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cardNumber", pair.first);
                jSONObject2.put("pinCode", pair.second);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("giftCards", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            throw new JSONEncodingException(e.getLocalizedMessage());
        }
    }
}
