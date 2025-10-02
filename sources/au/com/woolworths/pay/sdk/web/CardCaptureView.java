package au.com.woolworths.pay.sdk.web;

import android.content.Context;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.sdk.models.SaveOptions;
import au.com.woolworths.pay.sdk.models.errors.FatalError;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CardCaptureView extends FormView {
    public CardCaptureView(@NonNull Context context) {
        super(context);
    }

    public final void e(SaveOptions saveOptions, Boolean bool) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("save", saveOptions.shouldSave());
            jSONObject.put("primary", saveOptions.makePrimary());
            jSONObject.put("verify", bool);
            d(jSONObject);
        } catch (JSONException e) {
            this.d.d(new FatalError(e.getLocalizedMessage()));
        }
    }
}
