package com.adobe.marketing.mobile;

import androidx.camera.core.impl.b;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.StringUtils;

/* loaded from: classes.dex */
public class VisitorID {

    /* renamed from: a, reason: collision with root package name */
    public final AuthenticationState f13164a;
    public final String b;
    public final String c;
    public final String d;

    public enum AuthenticationState {
        UNKNOWN(0),
        AUTHENTICATED(1),
        LOGGED_OUT(2);

        public final int d;

        AuthenticationState(int i) {
            this.d = i;
        }

        public static AuthenticationState a(int i) {
            for (AuthenticationState authenticationState : values()) {
                if (authenticationState.d == i) {
                    return authenticationState;
                }
            }
            return UNKNOWN;
        }
    }

    public VisitorID(String str, String str2, String str3, AuthenticationState authenticationState) {
        if (StringUtils.a(str2)) {
            throw new IllegalStateException("idType parameter cannot be null or empty");
        }
        if (StringUtils.a(str3)) {
            Log.a();
        }
        this.c = str;
        this.d = str2;
        this.b = str3;
        this.f13164a = authenticationState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorID)) {
            return false;
        }
        VisitorID visitorID = (VisitorID) obj;
        String str = visitorID.b;
        if (!this.d.equals(visitorID.d)) {
            return false;
        }
        String str2 = this.b;
        return str2 == null ? str == null : str != null && str2.compareTo(str) == 0;
    }

    public final int hashCode() {
        return this.d.hashCode() + b.c(527, 31, this.b);
    }
}
