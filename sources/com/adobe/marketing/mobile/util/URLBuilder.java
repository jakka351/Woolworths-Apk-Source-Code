package com.adobe.marketing.mobile.util;

import YU.a;
import com.adobe.marketing.mobile.internal.util.UrlEncoder;
import com.adobe.marketing.mobile.services.Log;
import com.medallia.digital.mobilesdk.q2;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class URLBuilder {

    /* renamed from: a, reason: collision with root package name */
    public String f13257a = "";
    public String c = "";
    public String b = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EncodeType {
        public static final /* synthetic */ EncodeType[] d = {new EncodeType("NONE", 0), new EncodeType("ENCODE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        EncodeType EF5;

        public static EncodeType valueOf(String str) {
            return (EncodeType) Enum.valueOf(EncodeType.class, str);
        }

        public static EncodeType[] values() {
            return (EncodeType[]) d.clone();
        }
    }

    public final void a(String str) {
        if (str.length() == 0) {
            return;
        }
        this.f13257a += q2.c + UrlEncoder.a(str);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = this.c;
        if (str2 == null || str2.length() == 0) {
            this.c = str;
        } else {
            this.c = a.p(new StringBuilder(), this.c, "&", str);
        }
    }

    public final void c(HashMap map) {
        if (map.size() == 0) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!StringUtils.a(str) && !StringUtils.a(str2)) {
                b(UrlEncoder.a(str) + "=" + UrlEncoder.a(str2));
            }
        }
    }

    public final String d() throws URISyntaxException {
        if (StringUtils.a(this.b)) {
            Log.b("URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s)", this.b, this.f13257a, this.c);
            return null;
        }
        String str = this.c;
        String strJ = a.j("https://", this.b, this.f13257a, str != null && str.length() > 0 ? "?" : "", this.c);
        try {
            new URL(strJ).toURI();
            return strJ;
        } catch (Exception e) {
            Log.b("MobileCore", "URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s) (%s)", this.b, this.f13257a, this.c, e);
            return null;
        }
    }
}
