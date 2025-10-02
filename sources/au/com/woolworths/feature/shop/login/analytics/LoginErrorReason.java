package au.com.woolworths.feature.shop.login.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/analytics/LoginErrorReason;", "", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginErrorReason {
    public static final /* synthetic */ LoginErrorReason[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String d;

    static {
        LoginErrorReason[] loginErrorReasonArr = {new LoginErrorReason("SERVER_ERROR", 0, "Server Error"), new LoginErrorReason("NETWORK_ERROR", 1, "Network Error"), new LoginErrorReason("LOADING_FORM_FAILURE", 2, "Loading Form Failure"), new LoginErrorReason("LOADING_URL_FAILURE", 3, "Loading URL Failure"), new LoginErrorReason("TOKEN_EXCHANGE_FAILURE", 4, "Token Exchange Failure")};
        e = loginErrorReasonArr;
        f = EnumEntriesKt.a(loginErrorReasonArr);
    }

    public LoginErrorReason(String str, int i, String str2) {
        this.d = str2;
    }

    public static LoginErrorReason valueOf(String str) {
        return (LoginErrorReason) Enum.valueOf(LoginErrorReason.class, str);
    }

    public static LoginErrorReason[] values() {
        return (LoginErrorReason[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
