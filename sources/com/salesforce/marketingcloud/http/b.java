package com.salesforce.marketingcloud.http;

import android.os.Bundle;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.http.d;
import com.salesforce.marketingcloud.internal.m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final C0361b i = new C0361b(null);

    @NotNull
    private static final String j = g.a("Request");

    @NotNull
    public static final String k = "GET";

    @NotNull
    public static final String l = "POST";

    @NotNull
    public static final String m = "PATCH";
    public static final int n = -100;
    private static final int o = 30000;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16911a;

    @Nullable
    private final String b;
    private final int c;

    @NotNull
    private final String d;

    @NotNull
    private final String e;

    @NotNull
    private final List<String> f;

    @NotNull
    private final com.salesforce.marketingcloud.http.a g;

    @Nullable
    private String h;

    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f16912a;

        @Nullable
        private String b;

        @Nullable
        private String d;

        @Nullable
        private String e;

        @Nullable
        private com.salesforce.marketingcloud.http.a f;

        @Nullable
        private List<String> h;
        private int c = b.o;

        @NotNull
        private Map<String, String> g = new LinkedHashMap();

        @NotNull
        public final a a(@NotNull String key, @NotNull String value) {
            Intrinsics.h(key, "key");
            Intrinsics.h(value, "value");
            this.g.put(key, StringsKt.k0(value).toString());
            return this;
        }

        @NotNull
        public final a b(@NotNull String method) {
            Intrinsics.h(method, "method");
            this.f16912a = method;
            return this;
        }

        @NotNull
        public final a c(@NotNull String requestBody) {
            Intrinsics.h(requestBody, "requestBody");
            this.d = requestBody;
            return this;
        }

        @NotNull
        public final a d(@NotNull String url) {
            Intrinsics.h(url, "url");
            this.b = url;
            return this;
        }

        @NotNull
        public final b a() {
            List list;
            List list2 = this.h;
            if (list2 != null) {
                list = list2;
            } else if (this.g.isEmpty()) {
                list2 = EmptyList.d;
                list = list2;
            } else {
                Map<String, String> map = this.g;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    CollectionsKt.h(CollectionsKt.d0(entry.getValue(), CollectionsKt.Q(entry.getKey())), arrayList);
                }
                list = arrayList;
            }
            String str = this.d;
            if (str == null) {
                this.e = "";
            }
            String str2 = this.f16912a;
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String str3 = this.b;
            if (str3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int i = this.c;
            String str4 = this.e;
            if (str4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            com.salesforce.marketingcloud.http.a aVar = this.f;
            if (aVar != null) {
                return new b(str2, str, i, str4, str3, list, aVar);
            }
            throw new IllegalStateException("Required value was null.");
        }

        @NotNull
        public final a a(int i) {
            this.c = i;
            return this;
        }

        @NotNull
        public final a a(@NotNull String contentType) {
            Intrinsics.h(contentType, "contentType");
            this.e = contentType;
            return this;
        }

        public final void a(@NotNull List<String> headers) {
            Intrinsics.h(headers, "headers");
            this.h = headers;
        }

        @NotNull
        public final a a(@NotNull com.salesforce.marketingcloud.http.a requestId) {
            Intrinsics.h(requestId, "requestId");
            this.f = requestId;
            return this;
        }
    }

    @SourceDebugExtension
    /* renamed from: com.salesforce.marketingcloud.http.b$b, reason: collision with other inner class name */
    public static final class C0361b {
        private C0361b() {
        }

        @JvmStatic
        @NotNull
        public final a a() {
            return new a();
        }

        @NotNull
        public final String b() {
            return b.j;
        }

        public /* synthetic */ C0361b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final b a(@NotNull Bundle data) {
            Intrinsics.h(data, "data");
            a aVarA = b.i.a();
            String string = data.getString("method");
            if (string != null) {
                aVarA.b(string);
            }
            String string2 = data.getString("requestBody");
            if (string2 != null) {
                aVarA.c(string2);
            }
            aVarA.a(data.getInt("connectionTimeout"));
            String string3 = data.getString("contentType");
            if (string3 != null) {
                aVarA.a(string3);
            }
            String string4 = data.getString("url");
            if (string4 != null) {
                aVarA.d(string4);
            }
            ArrayList<String> stringArrayList = data.getStringArrayList("headers");
            if (stringArrayList != null) {
                aVarA.a(stringArrayList);
            }
            aVarA.a(com.salesforce.marketingcloud.http.a.values()[data.getInt("mcRequestId", 0)]);
            b bVarA = aVarA.a();
            bVarA.a(data.getString("tag"));
            return bVarA;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface c {
    }

    public static final class d extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16913a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to complete request";
        }
    }

    public b(@NotNull String method, @Nullable String str, int i2, @NotNull String contentType, @NotNull String url, @NotNull List<String> headers, @NotNull com.salesforce.marketingcloud.http.a requestId) {
        Intrinsics.h(method, "method");
        Intrinsics.h(contentType, "contentType");
        Intrinsics.h(url, "url");
        Intrinsics.h(headers, "headers");
        Intrinsics.h(requestId, "requestId");
        this.f16911a = method;
        this.b = str;
        this.c = i2;
        this.d = contentType;
        this.e = url;
        this.f = headers;
        this.g = requestId;
    }

    @JvmStatic
    @NotNull
    public static final a b() {
        return i.a();
    }

    @NotNull
    public final String c() {
        return this.f16911a;
    }

    @Nullable
    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f16911a, bVar.f16911a) && Intrinsics.c(this.b, bVar.b) && this.c == bVar.c && Intrinsics.c(this.d, bVar.d) && Intrinsics.c(this.e, bVar.e) && Intrinsics.c(this.f, bVar.f) && this.g == bVar.g;
    }

    @NotNull
    public final String f() {
        return this.d;
    }

    @NotNull
    public final String g() {
        return this.e;
    }

    @NotNull
    public final List<String> h() {
        return this.f;
    }

    public int hashCode() {
        int iHashCode = this.f16911a.hashCode() * 31;
        String str = this.b;
        return this.g.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    @NotNull
    public final com.salesforce.marketingcloud.http.a i() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final com.salesforce.marketingcloud.http.d j() throws Throwable {
        com.salesforce.marketingcloud.http.d dVarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpsURLConnection httpsURLConnection = null;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(this.e).openConnection();
                Callback.v(uRLConnectionOpenConnection);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
                Intrinsics.f(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection3 = (HttpsURLConnection) uRLConnection;
                try {
                    httpsURLConnection3.setRequestMethod(this.f16911a);
                    httpsURLConnection3.setDoInput(true);
                    httpsURLConnection3.setUseCaches(false);
                    httpsURLConnection3.setAllowUserInteraction(false);
                    httpsURLConnection3.setConnectTimeout(this.c);
                    IntProgression intProgressionN = RangesKt.n(2, RangesKt.o(0, this.f.size()));
                    int i2 = intProgressionN.d;
                    int i3 = intProgressionN.e;
                    int i4 = intProgressionN.f;
                    if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                        while (true) {
                            httpsURLConnection3.setRequestProperty(this.f.get(i2), this.f.get(i2 + 1));
                            if (i2 == i3) {
                                break;
                            }
                            i2 += i4;
                        }
                    }
                    String str = this.b;
                    if (str != null) {
                        httpsURLConnection3.setDoOutput(true);
                        httpsURLConnection3.setRequestProperty(RequestBuilder.CONTENT_TYPE, this.d);
                        OutputStream outputStreamD = Callback.d(httpsURLConnection3);
                        try {
                            byte[] bytes = str.getBytes(m.b());
                            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
                            outputStreamD.write(bytes);
                            outputStreamD.close();
                        } finally {
                        }
                    }
                    d.a aVarA = com.salesforce.marketingcloud.http.d.g.a();
                    aVarA.a(Callback.f(httpsURLConnection3));
                    String responseMessage = httpsURLConnection3.getResponseMessage();
                    Intrinsics.g(responseMessage, "getResponseMessage(...)");
                    aVarA.b(responseMessage);
                    Map<String, List<String>> headerFields = httpsURLConnection3.getHeaderFields();
                    Intrinsics.g(headerFields, "getHeaderFields(...)");
                    aVarA.a(headerFields);
                    try {
                        String strA = a(Callback.b(httpsURLConnection3));
                        if (strA != null) {
                            aVarA.a(strA);
                        }
                    } catch (IOException unused) {
                        String strA2 = a(httpsURLConnection3.getErrorStream());
                        if (strA2 != null) {
                            aVarA.a(strA2);
                        }
                    }
                    aVarA.b(jCurrentTimeMillis);
                    aVarA.a(System.currentTimeMillis());
                    dVarA = aVarA.a();
                    httpsURLConnection3.disconnect();
                    httpsURLConnection = aVarA;
                } catch (Exception e) {
                    e = e;
                    httpsURLConnection2 = httpsURLConnection3;
                    g.f16896a.b(j, e, d.f16913a);
                    dVarA = com.salesforce.marketingcloud.http.d.g.a("ERROR", -100);
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                        httpsURLConnection = httpsURLConnection2;
                    }
                    return dVarA;
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnection3;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            return dVarA;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int k() {
        return this.c;
    }

    @NotNull
    public final String l() {
        return this.d;
    }

    @NotNull
    public final List<String> m() {
        return this.f;
    }

    @NotNull
    public final String n() {
        return this.f16911a;
    }

    @Nullable
    public final String o() {
        return this.b;
    }

    @NotNull
    public final com.salesforce.marketingcloud.http.a p() {
        return this.g;
    }

    @Nullable
    public final String q() {
        return this.h;
    }

    @NotNull
    public final String r() {
        return this.e;
    }

    @NotNull
    public final Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putString("method", this.f16911a);
        bundle.putString("requestBody", this.b);
        bundle.putInt("connectionTimeout", this.c);
        bundle.putString("contentType", this.d);
        bundle.putString("url", this.e);
        List<String> list = this.f;
        bundle.putStringArrayList("headers", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(this.f));
        bundle.putInt("mcRequestId", this.g.ordinal());
        bundle.putString("tag", this.h);
        return bundle;
    }

    @NotNull
    public String toString() {
        String str = this.f16911a;
        String str2 = this.b;
        int i2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        List<String> list = this.f;
        com.salesforce.marketingcloud.http.a aVar = this.g;
        StringBuilder sbV = YU.a.v("Request(method=", str, ", requestBody=", str2, ", connectionTimeout=");
        androidx.compose.ui.input.pointer.a.u(i2, ", contentType=", str3, ", url=", sbV);
        au.com.woolworths.android.onesite.a.B(sbV, str4, ", headers=", list, ", requestId=");
        sbV.append(aVar);
        sbV.append(")");
        return sbV.toString();
    }

    @NotNull
    public final b a(@NotNull String method, @Nullable String str, int i2, @NotNull String contentType, @NotNull String url, @NotNull List<String> headers, @NotNull com.salesforce.marketingcloud.http.a requestId) {
        Intrinsics.h(method, "method");
        Intrinsics.h(contentType, "contentType");
        Intrinsics.h(url, "url");
        Intrinsics.h(headers, "headers");
        Intrinsics.h(requestId, "requestId");
        return new b(method, str, i2, contentType, url, headers, requestId);
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, int i2, String str3, String str4, List list, com.salesforce.marketingcloud.http.a aVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bVar.f16911a;
        }
        if ((i3 & 2) != 0) {
            str2 = bVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = bVar.c;
        }
        if ((i3 & 8) != 0) {
            str3 = bVar.d;
        }
        if ((i3 & 16) != 0) {
            str4 = bVar.e;
        }
        if ((i3 & 32) != 0) {
            list = bVar.f;
        }
        if ((i3 & 64) != 0) {
            aVar = bVar.g;
        }
        List list2 = list;
        com.salesforce.marketingcloud.http.a aVar2 = aVar;
        String str5 = str4;
        int i4 = i2;
        return bVar.a(str, str2, i4, str3, str5, list2, aVar2);
    }

    @JvmStatic
    @NotNull
    public static final b a(@NotNull Bundle bundle) {
        return i.a(bundle);
    }

    private final String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, m.b()));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb.toString();
                    bufferedReader.close();
                    return string;
                }
                sb.append(line);
                sb.append('\n');
            }
        } finally {
        }
    }

    public final void a(@Nullable String str) {
        this.h = str;
    }
}
