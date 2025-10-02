package au.com.woolworths.feature.shop.login.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/login/analytics/LoginEventLabel;", "", "login_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginEventLabel {
    public static final /* synthetic */ LoginEventLabel[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String d;

    static {
        LoginEventLabel[] loginEventLabelArr = {new LoginEventLabel("TRY_AGAIN_SERVER_ERROR", 0, "Server Error - Try Again"), new LoginEventLabel("TRY_AGAIN_NETWORK_ERROR", 1, "Network Error - Try Again"), new LoginEventLabel("ACCOUNT_LOCK_LINK_CLICK", 2, "Phone Number for Customer Service Team"), new LoginEventLabel("FORGOT_PASSWORD_LINK_CLICK", 3, "Forgot Password"), new LoginEventLabel("SIGN_UP_LINK_CLICK", 4, "Sign Up")};
        e = loginEventLabelArr;
        f = EnumEntriesKt.a(loginEventLabelArr);
    }

    public LoginEventLabel(String str, int i, String str2) {
        this.d = str2;
    }

    public static LoginEventLabel valueOf(String str) {
        return (LoginEventLabel) Enum.valueOf(LoginEventLabel.class, str);
    }

    public static LoginEventLabel[] values() {
        return (LoginEventLabel[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
