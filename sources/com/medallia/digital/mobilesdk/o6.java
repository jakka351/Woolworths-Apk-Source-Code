package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.f0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* loaded from: classes.dex */
class o6 {
    private static final int d = 10;
    private static final int e = 2;
    private static final int f = 5000;
    private static final long g = 3600000;

    /* renamed from: a, reason: collision with root package name */
    private int f16625a;
    private long b = 3600000;
    private final ExecutorService c = b();

    public interface a {
        void a(i6 i6Var);

        void a(k6 k6Var);
    }

    public enum b {
        String,
        BYTES
    }

    public o6(int i) {
        this.f16625a = i;
    }

    public long a() {
        return this.b;
    }

    public ExecutorService b() {
        return Executors.newFixedThreadPool(Math.min(10, Math.max(2, Runtime.getRuntime().availableProcessors())));
    }

    public int c() {
        return this.f16625a;
    }

    public String a(String str, HashMap<String, String> map) {
        if (str == null) {
            return "";
        }
        StringBuilder sbS = YU.a.s(str);
        if (map != null && !map.isEmpty()) {
            sbS.append("?");
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sbS.append(entry.getKey());
                    sbS.append("=");
                    sbS.append(entry.getValue());
                    if (i < map.size() - 1) {
                        sbS.append("&");
                    }
                }
                i++;
            }
        }
        return sbS.toString();
    }

    public void b(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i, a aVar) {
        a(b.String, f0.d.POST, str, map2, map, jSONObject, i, aVar);
    }

    public void c(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i, a aVar) {
        a(b.String, f0.d.PUT, str, map2, map, jSONObject, i, aVar);
    }

    public void a(int i, long j) {
        if (i > 1000) {
            this.f16625a = i;
        }
        this.b = j;
    }

    private void a(b bVar, f0.d dVar, String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i, a aVar) {
        new j6(this.c, bVar, dVar, a(str, map2), map, jSONObject, i, this.f16625a, aVar, this.b);
    }

    private void a(b bVar, f0.d dVar, String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, String str2, int i, a aVar) {
        new j6(this.c, bVar, dVar, a(str, map2), map, jSONObject, str2, i, this.f16625a, aVar, this.b);
    }

    public void a(String str, String str2, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i, a aVar) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "delete":
                a(str2, map, map2, jSONObject, i, aVar);
                break;
            case "get":
                a(str2, map, map2, i, aVar);
                break;
            case "put":
                c(str2, map, map2, jSONObject, i, aVar);
                break;
            case "post":
                b(str2, map, map2, jSONObject, i, aVar);
                break;
            default:
                a4.c("Request type is undefined: ".concat(str));
                break;
        }
    }

    public void a(String str, HashMap<String, String> map, int i, a aVar) {
        a(b.BYTES, f0.d.GET, str, map, null, null, i, aVar);
    }

    public void a(String str, HashMap<String, String> map, HashMap<String, String> map2, int i, a aVar) {
        a(b.String, f0.d.GET, str, map2, map, null, i, aVar);
    }

    public void a(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, int i, a aVar) {
        a(b.String, f0.d.DELETE, str, map2, map, jSONObject, i, aVar);
    }

    public void a(String str, HashMap<String, String> map, HashMap<String, String> map2, JSONObject jSONObject, String str2, int i, a aVar) {
        a(b.String, f0.d.PUT, str, map2, map, jSONObject, str2, i, aVar);
    }
}
