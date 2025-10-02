package com.braintreepayments.api;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/Authorization;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes4.dex */
public abstract class Authorization {

    /* renamed from: a, reason: collision with root package name */
    public final String f13698a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/Authorization$Companion;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static Authorization a(String str) {
            String string;
            if (str != null) {
                int length = str.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.j(str.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                string = str.subSequence(i, length + 1).toString();
            } else {
                string = null;
            }
            if (string == null || TextUtils.isEmpty(str)) {
                String strA = YU.a.A("Authorization provided is invalid: ", string);
                if (string == null) {
                    string = "null";
                }
                return new InvalidAuthorization(string, strA);
            }
            try {
                if (new Regex("^[a-zA-Z0-9]+_[a-zA-Z0-9]+_[a-zA-Z0-9_]+$").f(string)) {
                    return new TokenizationKey(string);
                }
                if (new Regex("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)").f(string)) {
                    return new ClientToken(string);
                }
                return new InvalidAuthorization(string, "Authorization provided is invalid: " + string);
            } catch (InvalidArgumentException e) {
                String message = e.getMessage();
                Intrinsics.e(message);
                return new InvalidAuthorization(string, message);
            }
        }
    }

    public Authorization(String str) {
        this.f13698a = str;
    }

    /* renamed from: a */
    public abstract String getC();

    /* renamed from: b */
    public abstract String getB();

    /* renamed from: toString, reason: from getter */
    public final String getF13698a() {
        return this.f13698a;
    }
}
