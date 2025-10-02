package com.adobe.mobile;

import com.salesforce.marketingcloud.messages.iam.j;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public class VisitorID {

    /* renamed from: a, reason: collision with root package name */
    public final String f13283a;
    public String b;
    public VisitorIDAuthenticationState c;

    public enum VisitorIDAuthenticationState {
        VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN(0, j.h),
        /* JADX INFO: Fake field, exist only in values array */
        VISITOR_ID_AUTHENTICATION_STATE_AUTHENTICATED(1, "authenticated"),
        /* JADX INFO: Fake field, exist only in values array */
        VISITOR_ID_AUTHENTICATION_STATE_LOGGED_OUT(2, "logged_out");

        public final int d;
        public final String e;

        VisitorIDAuthenticationState(int i, String str) {
            this.d = i;
            this.e = str;
        }
    }

    public VisitorID(String str, String str2, VisitorIDAuthenticationState visitorIDAuthenticationState) throws UnsupportedEncodingException {
        this.c = VisitorIDAuthenticationState.VISITOR_ID_AUTHENTICATION_STATE_UNKNOWN;
        String strE = StaticMethods.e(str);
        if (strE == null || strE.length() == 0) {
            throw new IllegalStateException("idType must not be null/empty");
        }
        this.f13283a = strE;
        this.b = str2;
        this.c = visitorIDAuthenticationState;
    }
}
