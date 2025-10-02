package com.braintreepayments.api;

import android.util.Base64;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/ClientToken;", "Lcom/braintreepayments/api/Authorization;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class ClientToken extends Authorization {
    public final String b;
    public final String c;
    public final String d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/ClientToken$Companion;", "", "", "AUTHORIZATION_FINGERPRINT_KEY", "Ljava/lang/String;", "BASE_64_MATCHER", "CONFIG_URL_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final void a(String str) {
            for (String str2 : StringsKt.T(str, new String[]{"&"}, 6)) {
                if (StringsKt.o(str2, "customer_id=", false)) {
                    List listT = StringsKt.T(str2, new String[]{"="}, 6);
                    if (listT.size() > 1) {
                        return;
                    }
                }
            }
        }
    }

    public ClientToken(String str) throws JSONException, InvalidArgumentException {
        super(str);
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.g(bArrDecode, "decode(clientTokenString, Base64.DEFAULT)");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, Charsets.f24671a));
            String string = jSONObject.getString("configUrl");
            Intrinsics.g(string, "jsonObject.getString(CONFIG_URL_KEY)");
            this.b = string;
            String string2 = jSONObject.getString("authorizationFingerprint");
            Intrinsics.g(string2, "jsonObject.getString(AUT…RIZATION_FINGERPRINT_KEY)");
            this.d = string2;
            this.c = string2;
            Companion.a(string2);
        } catch (NullPointerException unused) {
            throw new InvalidArgumentException("Client token was invalid");
        } catch (JSONException unused2) {
            throw new InvalidArgumentException("Client token was invalid");
        }
    }

    @Override // com.braintreepayments.api.Authorization
    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // com.braintreepayments.api.Authorization
    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }
}
