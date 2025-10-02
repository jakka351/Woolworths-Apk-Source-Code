package lib.android.paypal.com.magnessdk.network.base;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
class a implements MagnesNetworking {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24903a;
    public String b;
    public Uri c;
    public Map d;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(byte[] r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r8 = -1
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            android.net.Uri r2 = r7.c     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            com.dynatrace.android.callback.Callback.v(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            r2 = 60000(0xea60, float:8.4078E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.util.Map r2 = r7.d     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
        L34:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r1.setRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            goto L34
        L54:
            r8 = move-exception
            r3 = r0
            r0 = r1
            goto Lc2
        L59:
            r2 = move-exception
            goto Lab
        L5b:
            int r2 = com.dynatrace.android.callback.Callback.f(r1)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.lang.String r3 = "correlation-id"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r7.b = r3     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r2 != r3) goto L97
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            java.io.InputStream r5 = com.dynatrace.android.callback.Callback.b(r1)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r5.<init>()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
        L7e:
            int r6 = r3.read(r0)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            if (r6 == r8) goto L8c
            r5.write(r0, r4, r6)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            goto L7e
        L88:
            r8 = move-exception
            goto Lc3
        L8a:
            r0 = move-exception
            goto L94
        L8c:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r7.f24903a = r0     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r0 = r3
            goto L9b
        L94:
            r2 = r0
        L95:
            r0 = r1
            goto Lad
        L97:
            byte[] r3 = new byte[r4]     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
            r7.f24903a = r3     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L59
        L9b:
            java.lang.Class r8 = r7.getClass()
            lib.android.paypal.com.magnessdk.f.f(r8, r0)
            r1.disconnect()
            return r2
        La6:
            r8 = move-exception
            r3 = r0
            goto Lc2
        La9:
            r2 = move-exception
            r1 = r0
        Lab:
            r3 = r0
            goto L95
        Lad:
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> Lc1
            lib.android.paypal.com.magnessdk.log.a.b(r2, r1)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class r1 = r7.getClass()
            lib.android.paypal.com.magnessdk.f.f(r1, r3)
            if (r0 == 0) goto Lc0
            r0.disconnect()
        Lc0:
            return r8
        Lc1:
            r8 = move-exception
        Lc2:
            r1 = r0
        Lc3:
            java.lang.Class r0 = r7.getClass()
            lib.android.paypal.com.magnessdk.f.f(r0, r3)
            if (r1 == 0) goto Lcf
            r1.disconnect()
        Lcf:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.base.a.a(byte[]):int");
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final byte[] b() {
        return this.f24903a;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final String c() {
        return this.b;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final void d(HashMap map) {
        this.d = map;
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworking
    public final void e(Uri uri) {
        this.c = uri;
    }
}
