package com.braintreepayments.api;

import com.braintreepayments.api.BraintreeError;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLResponseParser;", "Lcom/braintreepayments/api/HttpResponseParser;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class BraintreeGraphQLResponseParser implements HttpResponseParser {

    /* renamed from: a, reason: collision with root package name */
    public final BaseHttpResponseParser f13703a = new BaseHttpResponseParser();

    @Override // com.braintreepayments.api.HttpResponseParser
    public final String a(HttpURLConnection httpURLConnection, int i) throws JSONException, ErrorWithResponse, AuthenticationException, UnprocessableEntityException, UnexpectedException, RateLimitException, IOException, ServiceUnavailableException, AuthorizationException, UpgradeRequiredException, ServerException {
        JSONArray jSONArray;
        JSONObject jSONObject;
        String response = this.f13703a.a(httpURLConnection, i);
        JSONArray jSONArrayOptJSONArray = new JSONObject(response).optJSONArray("errors");
        if (jSONArrayOptJSONArray == null) {
            Intrinsics.g(response, "response");
            return response;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("extensions");
            String strA = Json.a(jSONObject2, "message", "An Unexpected Exception Occurred");
            if (jSONObjectOptJSONObject == null) {
                throw new UnexpectedException(strA);
            }
            String strA2 = Json.a(jSONObjectOptJSONObject, "legacyCode", "");
            String strA3 = Json.a(jSONObjectOptJSONObject, "errorType", "");
            if (Intrinsics.c(strA2, "50000")) {
                throw new AuthorizationException(jSONObject2.getString("message"));
            }
            if (!Intrinsics.c(strA3, "user_error")) {
                throw new UnexpectedException(strA);
            }
        }
        ErrorWithResponse errorWithResponse = new ErrorWithResponse();
        errorWithResponse.f = response;
        errorWithResponse.d = 422;
        String string = null;
        if (response != null) {
            try {
                jSONArray = new JSONObject(response).getJSONArray("errors");
            } catch (JSONException unused) {
                errorWithResponse.e = "Parsing error response failed";
                errorWithResponse.g = new ArrayList();
                throw errorWithResponse;
            }
        } else {
            jSONArray = null;
        }
        ArrayList arrayListB = BraintreeError.Companion.b(jSONArray);
        errorWithResponse.g = arrayListB;
        if (!arrayListB.isEmpty()) {
            errorWithResponse.e = "Input is invalid.";
            throw errorWithResponse;
        }
        if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(0)) != null) {
            string = jSONObject.getString("message");
        }
        errorWithResponse.e = string;
        throw errorWithResponse;
    }
}
