package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbi {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f15201a = new Logger("GetTokenResultFactory", new String[0]);

    public static GetTokenResult a(String str) {
        Map map;
        try {
            map = zzbh.c(str);
        } catch (zzaao e) {
            f15201a.e("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        GetTokenResult getTokenResult = new GetTokenResult();
        getTokenResult.f15194a = str;
        getTokenResult.b = map;
        return getTokenResult;
    }
}
