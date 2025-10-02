package com.medallia.digital.mobilesdk;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.medallia.digital.mobilesdk.o6;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class f0<T> implements Runnable {
    private static final int i = 1048576;
    private static final String j = "Content-Type";
    private static final int k = 600;
    private static final String l = "application/json";
    static final int m = -44;
    private static final String n = "BaseRequest: Error parsing server response ";
    static final int o = -45;
    private static final String p = "BaseRequest: Error no Connection Available";
    static final int q = -46;
    private static final String r = "BaseRequest: Error timeout";
    private static final String s = "https";

    /* renamed from: a, reason: collision with root package name */
    private final d f16454a;
    private final String b;
    private final o6.a c;
    private final Map<String, String> d;
    private final JSONObject e;
    private int f;
    private final int g;
    private String h;

    /* loaded from: classes6.dex */
    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16455a;

        public a(String str) {
            this.f16455a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            StringBuilder sb = new StringBuilder("Message: ");
            String str = this.f16455a;
            if (str == null) {
                str = "Unknown network error";
            }
            sb.append(str);
            sb.append(" StatusCode ");
            String str2 = this.f16455a;
            int i = f0.k;
            sb.append(str2 != null ? f0.this.f : f0.k);
            a4.c(sb.toString());
            if (f0.this.c != null) {
                o6.a aVar = f0.this.c;
                if (this.f16455a != null) {
                    i = f0.this.f;
                }
                aVar.a(new i6(i));
            }
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16456a;

        static {
            int[] iArr = new int[c.values().length];
            f16456a = iArr;
            try {
                iArr[c.ContentType.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16456a[c.Accept.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum c {
        ContentType,
        Accept;

        @Override // java.lang.Enum
        public String toString() {
            int i = b.f16456a[ordinal()];
            return i != 1 ? i != 2 ? "" : RequestBuilder.ACCEPT : "Content-Type";
        }
    }

    public enum d {
        DEPRECATED_GET_OR_POST,
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        PATCH
    }

    public f0(d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, int i2, o6.a aVar) {
        this.f16454a = dVar;
        this.b = str;
        this.c = aVar;
        this.e = jSONObject;
        this.d = a(map);
        this.g = i2;
    }

    private String c() {
        return l;
    }

    private Map<String, String> d() {
        Map<String, String> map = this.d;
        return map != null ? map : new HashMap();
    }

    private d f() {
        return this.f16454a;
    }

    public abstract void a(T t);

    public abstract T b(InputStream inputStream);

    public String e() {
        return this.h;
    }

    public o6.a g() {
        return this.c;
    }

    public int h() {
        return this.f;
    }

    public String i() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "BaseRequest: Error parsing server response "
            boolean r1 = com.medallia.digital.mobilesdk.x8.b()
            if (r1 == 0) goto La4
            r1 = 0
            java.net.HttpURLConnection r2 = r6.a()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57 java.net.SocketTimeoutException -> L71
            int r3 = com.dynatrace.android.callback.Callback.f(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            r6.f = r3     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            r4 = 400(0x190, float:5.6E-43)
            if (r3 >= r4) goto L3a
            java.io.InputStream r1 = com.dynatrace.android.callback.Callback.a(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            java.lang.Object r3 = r6.b(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            int r4 = r6.f     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            r5 = -44
            if (r4 != r5) goto L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            r4.append(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            goto L42
        L32:
            r0 = move-exception
            goto L90
        L34:
            r0 = move-exception
            goto L59
        L36:
            r6.a(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            goto L45
        L3a:
            java.io.InputStream r0 = r2.getErrorStream()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
            java.lang.String r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
        L42:
            r6.a(r0)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34 java.net.SocketTimeoutException -> L72
        L45:
            if (r1 == 0) goto L8c
            r1.close()     // Catch: java.io.IOException -> L4b
            goto L8c
        L4b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r6.a(r0)
            goto L8c
        L54:
            r0 = move-exception
            r2 = r1
            goto L90
        L57:
            r0 = move-exception
            r2 = r1
        L59:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L32
            r6.a(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6e
        L66:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r6.a(r0)
        L6e:
            if (r2 == 0) goto L8f
            goto L8c
        L71:
            r2 = r1
        L72:
            r0 = -46
            r6.a(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "BaseRequest: Error timeout"
            r6.a(r0)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L8a
            r1.close()     // Catch: java.io.IOException -> L82
            goto L8a
        L82:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r6.a(r0)
        L8a:
            if (r2 == 0) goto L8f
        L8c:
            r2.disconnect()
        L8f:
            return
        L90:
            if (r1 == 0) goto L9e
            r1.close()     // Catch: java.io.IOException -> L96
            goto L9e
        L96:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            r6.a(r1)
        L9e:
            if (r2 == 0) goto La3
            r2.disconnect()
        La3:
            throw r0
        La4:
            r0 = -45
            r6.a(r0)
            java.lang.String r0 = "BaseRequest: Error no Connection Available"
            r6.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.f0.j():void");
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        j();
    }

    public f0(d dVar, String str, HashMap<String, String> map, JSONObject jSONObject, String str2, int i2, o6.a aVar) {
        this.f16454a = dVar;
        this.b = str;
        this.c = aVar;
        this.e = jSONObject;
        this.d = a(map);
        this.g = i2;
        this.h = str2;
    }

    private String a(InputStream inputStream) {
        try {
            return x8.a(inputStream).toString("UTF-8");
        } catch (Exception unused) {
            a(m);
            return null;
        }
    }

    private byte[] b() {
        try {
            JSONObject jSONObject = this.e;
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.toString().getBytes();
        } catch (Exception unused) {
            return null;
        }
    }

    public HttpURLConnection a() throws NoSuchAlgorithmException, IOException, KeyManagementException {
        URLConnection uRLConnectionOpenConnection = new URL(i()).openConnection();
        Callback.v(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(this.g);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setRequestMethod(f().name());
        if (d() != null && !d().isEmpty()) {
            for (String str : d().keySet()) {
                httpURLConnection.setRequestProperty(str, d().get(str));
            }
        }
        if (e() != null || (b() != null && b().length > 0)) {
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", (!f().name().equals(d.PUT.toString()) || e() == null) ? c() : " ");
            if (e() != null) {
                FileInputStream fileInputStreamE = null;
                try {
                    try {
                        fileInputStreamE = g2.e(e());
                        httpURLConnection.setFixedLengthStreamingMode(fileInputStreamE.available());
                        DataOutputStream dataOutputStream = new DataOutputStream(Callback.d(httpURLConnection));
                        byte[] bArr = new byte[i];
                        int iAvailable = fileInputStreamE.available();
                        while (true) {
                            int iMin = Math.min(iAvailable, i);
                            if (fileInputStreamE.read(bArr, 0, iMin) <= 0) {
                                break;
                            }
                            dataOutputStream.write(bArr, 0, iMin);
                            iAvailable = fileInputStreamE.available();
                        }
                        a4.b("LivingLens Done writing file to server - continue processing");
                    } catch (IOException e) {
                        a4.c(e.getMessage());
                        if (fileInputStreamE != null) {
                        }
                    }
                    try {
                        fileInputStreamE.close();
                    } catch (IOException e2) {
                        a4.c(e2.getMessage());
                    }
                } catch (Throwable th) {
                    if (fileInputStreamE != null) {
                        try {
                            fileInputStreamE.close();
                        } catch (IOException e3) {
                            a4.c(e3.getMessage());
                        }
                    }
                    throw th;
                }
            } else {
                OutputStream outputStreamD = Callback.d(httpURLConnection);
                outputStreamD.write(b());
                outputStreamD.close();
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private Map<String, String> a(HashMap<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(c.Accept.toString(), l);
        return map;
    }

    public void a(int i2) {
        this.f = i2;
    }

    public void a(String str) {
        w7.b().a().execute(new a(str));
    }
}
