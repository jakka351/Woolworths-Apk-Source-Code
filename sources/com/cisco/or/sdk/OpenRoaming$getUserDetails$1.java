package com.cisco.or.sdk;

import com.cisco.or.sdk.models.UserDetail;
import com.cisco.or.sdk.services.HTTPResponse;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.jsonwebtoken.Header;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/cisco/or/sdk/services/HTTPResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OpenRoaming$getUserDetails$1 extends Lambda implements Function1<HTTPResponse, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws JSONException {
        String name;
        String phone;
        String email;
        String age;
        HTTPResponse hTTPResponse = (HTTPResponse) obj;
        if ((hTTPResponse != null ? hTTPResponse.d : null) == null) {
            new UserDetail("Unknown name", "", "", "0", "");
            throw null;
        }
        JSONObject jSONObject = hTTPResponse.d;
        Intrinsics.e(jSONObject);
        String string = "";
        try {
            name = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        } catch (Exception unused) {
            name = "";
        }
        try {
            phone = jSONObject.getString("phone");
        } catch (Exception unused2) {
            phone = "";
        }
        try {
            email = jSONObject.getString(Scopes.EMAIL);
        } catch (Exception unused3) {
            email = "";
        }
        try {
            age = jSONObject.getString("age");
        } catch (Exception unused4) {
            age = "";
        }
        try {
            string = jSONObject.getString(Header.COMPRESSION_ALGORITHM);
        } catch (Exception unused5) {
        }
        String zip = string;
        Intrinsics.g(name, "name");
        Intrinsics.g(phone, "phone");
        Intrinsics.g(email, "email");
        Intrinsics.g(age, "age");
        Intrinsics.g(zip, "zip");
        new UserDetail(name, phone, email, age, zip);
        throw null;
    }
}
