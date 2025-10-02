package com.braintreepayments.api;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/TokenizationKey;", "Lcom/braintreepayments/api/Authorization;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public final class TokenizationKey extends Authorization {
    public final String b;
    public final String c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/TokenizationKey$Companion;", "", "", "CONFIG_V1", "Ljava/lang/String;", "DEVELOPMENT_URL", "MATCHER", "PRODUCTION_URL", "SANDBOX_URL", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public TokenizationKey(String str) throws InvalidArgumentException {
        String str2;
        super(str);
        this.c = str;
        List listT = StringsKt.T(str, new String[]{"_"}, 2);
        String str3 = (String) listT.get(0);
        String str4 = (String) listT.get(2);
        StringBuilder sb = new StringBuilder();
        int iHashCode = str3.hashCode();
        if (iHashCode == -224813765) {
            if (str3.equals("development")) {
                str2 = "http://10.0.2.2:3000/";
                this.b = YU.a.g(androidx.constraintlayout.core.state.a.l(sb, str2, "merchants/", str4, "/client_api/"), "v1/configuration");
                return;
            }
            throw new InvalidArgumentException("Tokenization Key contained invalid environment");
        }
        if (iHashCode == 1753018553) {
            if (str3.equals("production")) {
                str2 = "https://api.braintreegateway.com/";
                this.b = YU.a.g(androidx.constraintlayout.core.state.a.l(sb, str2, "merchants/", str4, "/client_api/"), "v1/configuration");
                return;
            }
            throw new InvalidArgumentException("Tokenization Key contained invalid environment");
        }
        if (iHashCode == 1865400007 && str3.equals("sandbox")) {
            str2 = "https://api.sandbox.braintreegateway.com/";
            this.b = YU.a.g(androidx.constraintlayout.core.state.a.l(sb, str2, "merchants/", str4, "/client_api/"), "v1/configuration");
            return;
        }
        throw new InvalidArgumentException("Tokenization Key contained invalid environment");
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
