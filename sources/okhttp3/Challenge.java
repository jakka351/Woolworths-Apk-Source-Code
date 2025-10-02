package okhttp3;

import androidx.camera.core.impl.b;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class Challenge {

    /* renamed from: a, reason: collision with root package name */
    public final String f26668a;
    public final Map b;

    public Challenge(String str, Map map) {
        String strM;
        this.f26668a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                strM = androidx.constraintlayout.core.state.a.m(locale, "US", str2, locale, "toLowerCase(...)");
            } else {
                strM = null;
            }
            linkedHashMap.put(strM, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.g(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                Intrinsics.g(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return Charsets.d;
    }

    public final String b() {
        return (String) this.b.get("realm");
    }

    /* renamed from: c, reason: from getter */
    public final String getF26668a() {
        return this.f26668a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return Intrinsics.c(challenge.f26668a, this.f26668a) && Intrinsics.c(challenge.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + b.c(899, 31, this.f26668a);
    }

    public final String toString() {
        return this.f26668a + " authParams=" + this.b;
    }
}
