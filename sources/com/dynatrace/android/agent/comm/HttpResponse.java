package com.dynatrace.android.agent.comm;

import java.util.Map;

/* loaded from: classes.dex */
public class HttpResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f14086a;
    public final String b;
    public final String c;
    public final Map d;

    public HttpResponse(int i, String str, String str2, Map map) {
        this.f14086a = i;
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpResponse httpResponse = (HttpResponse) obj;
            String str = httpResponse.c;
            String str2 = httpResponse.b;
            if (this.f14086a != httpResponse.f14086a) {
                return false;
            }
            String str3 = this.b;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.c;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }
}
