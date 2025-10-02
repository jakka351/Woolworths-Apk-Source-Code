package com.dynatrace.android.agent.mixed;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AutoWebRequestEventGenerator {
    public static final String i;

    /* renamed from: a, reason: collision with root package name */
    public BaseRequestData f14135a;
    public String b;
    public String c;
    public String e;
    public Throwable f;
    public int d = -1;
    public Map g = null;
    public Map h = null;

    static {
        boolean z = Global.f14077a;
        i = "dtxAutoWebRequestEventGenerator";
    }

    public final JSONObject a() throws JSONException {
        String str;
        if (this.f14135a == null || (str = this.b) == null || str.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObjectA = this.f14135a.a(this.d);
            if (jSONObjectA == null) {
                return null;
            }
            jSONObjectA.put("http.request.method", this.c);
            String str2 = this.b;
            if (str2 == null || !str2.startsWith("http")) {
                jSONObjectA.put("network.protocol.name", this.b);
            } else {
                jSONObjectA.put("network.protocol.name", "http");
            }
            String str3 = this.e;
            if (str3 != null && !str3.isEmpty()) {
                jSONObjectA.put("http.response.reason_phrase", this.e);
            }
            if (this.f != null) {
                jSONObjectA.put("has_exception", true);
                StringWriter stringWriter = new StringWriter();
                this.f.printStackTrace(new PrintWriter(stringWriter));
                jSONObjectA.put("exception.stack_trace", stringWriter.toString());
                jSONObjectA.put("exception.type", this.f.getClass().getName());
                jSONObjectA.put("exception.message", this.f.getMessage());
                jSONObjectA.put("has_error", true);
                jSONObjectA.put("has_failed_request", true);
            }
            Map map = this.h;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (str4 != null) {
                        jSONObjectA.put("http.response.header." + str4.toLowerCase(), String.join(", ", (List) entry.getValue()));
                    }
                }
            }
            Map map2 = this.g;
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str5 = (String) entry2.getKey();
                    if (str5 != null) {
                        jSONObjectA.put("http.request.header." + str5.toLowerCase(), String.join(", ", (List) entry2.getValue()));
                    }
                }
            }
            return jSONObjectA;
        } catch (JSONException e) {
            if (!Global.f14077a) {
                return null;
            }
            Utility.h(i, e.getMessage());
            return null;
        }
    }

    public final void b(BaseRequestData baseRequestData) {
        this.f14135a = baseRequestData;
    }

    public final void c(Exception exc) {
        this.f = exc;
    }

    public final void d(HashMap map) {
        this.g = map;
    }

    public final void e(String str) {
        this.c = str;
    }

    public final void f(HashMap map) {
        this.h = map;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final void h(String str) {
        this.e = str;
    }

    public final void i(int i2) {
        this.d = i2;
    }
}
