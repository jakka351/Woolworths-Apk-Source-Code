package com.google.firebase.auth;

import android.net.Uri;
import androidx.constraintlayout.core.state.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes6.dex */
public class ActionCodeUrl {

    /* renamed from: a, reason: collision with root package name */
    public final String f15190a;
    public final String b;

    static {
        HashMap map = new HashMap();
        a.u(2, map, "recoverEmail", 0, "resetPassword");
        a.u(4, map, "signIn", 1, "verifyEmail");
        a.u(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        com.google.android.gms.internal.p002firebaseauthapi.zzal.zza(map);
    }

    public ActionCodeUrl(String str) {
        String strC = c(str, "apiKey");
        String strC2 = c(str, "oobCode");
        String strC3 = c(str, "mode");
        if (strC == null || strC2 == null || strC3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        Preconditions.checkNotEmpty(strC);
        this.f15190a = Preconditions.checkNotEmpty(strC2);
        Preconditions.checkNotEmpty(strC3);
        c(str, "continueUrl");
        c(str, "lang");
        this.b = c(str, "tenantId");
    }

    public static ActionCodeUrl a(String str) {
        Preconditions.checkNotEmpty(str);
        try {
            return new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String c(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public final String b() {
        return this.b;
    }
}
