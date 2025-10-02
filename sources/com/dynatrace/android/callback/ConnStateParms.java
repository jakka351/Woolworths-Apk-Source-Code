package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.WebRequestUtils;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ConnStateParms extends WebReqStateParms {
    public static final String n;
    public static final HashMap o;
    public static final int p;
    public final HttpURLConnection m;

    static {
        boolean z = Global.f14077a;
        n = "dtxConnStateParms";
        p = 49;
        HashMap map = new HashMap();
        o = map;
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "Java/" + System.getProperty("java.version");
        }
        map.put("User-Agent", Integer.valueOf(property.length() + 12));
        map.put("Connection", 22);
        map.put("Accept-Encoding", 21);
        HashMap map2 = new HashMap();
        String property2 = System.getProperty("http.agent");
        if (property2 == null) {
            property2 = "Java/" + System.getProperty("java.version");
        }
        map2.put("User-Agent", Collections.singletonList(property2));
        map2.put("Connection", Collections.singletonList("keep-alive"));
        map2.put("Accept-Encoding", Collections.singletonList("gzip"));
    }

    public ConnStateParms(HttpURLConnection httpURLConnection, CbConstants.WrMethod wrMethod) {
        this.f = -1L;
        this.g = -1L;
        this.h = true;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.b = wrMethod;
        this.c = CbConstants.WrStates.d;
        this.d = 0;
        this.m = httpURLConnection;
    }

    public static long c(Map map) throws NumberFormatException {
        long length;
        long length2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null) {
                if (((List) entry.getValue()).size() > 0) {
                    length = ((String) ((List) entry.getValue()).get(0)).length() + 2;
                    length2 += length;
                }
            } else if (!((String) entry.getKey()).startsWith("X-Android")) {
                long length3 = ((String) entry.getKey()).length() + 4;
                while (((List) entry.getValue()).iterator().hasNext()) {
                    length2 += ((String) r3.next()).length() + length3;
                }
                if ("Content-Length".equalsIgnoreCase((String) entry.getKey()) && ((List) entry.getValue()).size() > 0) {
                    try {
                        length = Long.parseLong((String) ((List) entry.getValue()).get(0));
                        length2 += length;
                    } catch (NumberFormatException e) {
                        if (Global.f14077a) {
                            Utility.g(e, n, "invalid content length");
                        }
                    }
                }
            }
        }
        return length2;
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public final String a() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection != null ? httpURLConnection.getClass().getSimpleName() : "NA";
    }

    @Override // com.dynatrace.android.callback.WebReqStateParms
    public final String b() {
        String str = this.f14147a;
        if (str != null) {
            return str;
        }
        this.f14147a = "NA";
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            String strSubstring = WebRequestUtils.a(httpURLConnection.getURL().toString()).b;
            String str2 = Utility.f14137a;
            if (strSubstring == null) {
                strSubstring = null;
            } else {
                int iIndexOf = strSubstring.indexOf("?");
                if (iIndexOf < 0 || 250 < iIndexOf) {
                    iIndexOf = 250;
                }
                if (strSubstring.length() > iIndexOf) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
            }
            this.f14147a = strSubstring;
        }
        return this.f14147a;
    }

    public final String d() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection != null ? httpURLConnection.getRequestMethod() : "NA";
    }

    public final URL e() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL();
        }
        return null;
    }
}
