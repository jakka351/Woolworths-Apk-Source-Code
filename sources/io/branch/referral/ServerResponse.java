package io.branch.referral;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class ServerResponse {

    /* renamed from: a, reason: collision with root package name */
    public final int f23865a;
    public Object b;
    public final String c;

    public ServerResponse(int i, String str) {
        this.f23865a = i;
        this.c = str;
    }

    public final JSONObject a() {
        Object obj = this.b;
        return obj instanceof JSONObject ? (JSONObject) obj : new JSONObject();
    }
}
