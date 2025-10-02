package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import com.dynatrace.android.callback.Callback;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes.dex */
final class CctTransportBackend implements TransportBackend {

    /* renamed from: a, reason: collision with root package name */
    public final DataEncoder f14390a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final Clock e;
    public final Clock f;
    public final int g;

    public static final class HttpRequest {

        /* renamed from: a, reason: collision with root package name */
        public final URL f14391a;
        public final BatchedLogRequest b;
        public final String c;

        public HttpRequest(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f14391a = url;
            this.b = batchedLogRequest;
            this.c = str;
        }
    }

    public static final class HttpResponse {

        /* renamed from: a, reason: collision with root package name */
        public final int f14392a;
        public final URL b;
        public final long c;

        public HttpResponse(int i, URL url, long j) {
            this.f14392a = i;
            this.b = url;
            this.c = j;
        }
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoBatchedLogRequestEncoder.f14394a.configure(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.d = true;
        this.f14390a = jsonDataEncoderBuilder.a();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(CCTDestination.c);
        this.e = clock2;
        this.f = clock;
        this.g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(YU.a.A("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:4)(1:5)|6|(1:8)(9:10|(1:12)(2:13|(0))|15|(1:18)|19|26|20|24|25)|9|15|(0)|19|26|20|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        com.google.android.datatransport.runtime.logging.Logging.c(r0, "CctTransportBackend", "Unable to find version code for package");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.runtime.EventInternal a(com.google.android.datatransport.runtime.EventInternal r6) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.cct.CctTransportBackend.a(com.google.android.datatransport.runtime.EventInternal):com.google.android.datatransport.runtime.EventInternal");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.datatransport.cct.a] */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final BackendResponse b(BackendRequest backendRequest) {
        int i;
        String str;
        Object objA;
        LogEvent.Builder builderK;
        HashMap map = new HashMap();
        for (EventInternal eventInternal : backendRequest.b()) {
            String strL = eventInternal.l();
            if (map.containsKey(strL)) {
                ((List) map.get(strL)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                map.put(strL, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            i = 5;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder builderA = LogRequest.a();
            QosTier qosTier = QosTier.d;
            builderA.f();
            builderA.g(this.f.a());
            builderA.h(this.e.a());
            ClientInfo.Builder builderA2 = ClientInfo.a();
            builderA2.c();
            AndroidClientInfo.Builder builderA3 = AndroidClientInfo.a();
            builderA3.m(Integer.valueOf(eventInternal2.i("sdk-version")));
            builderA3.j(eventInternal2.b("model"));
            builderA3.f(eventInternal2.b("hardware"));
            builderA3.d(eventInternal2.b("device"));
            builderA3.l(eventInternal2.b("product"));
            builderA3.k(eventInternal2.b("os-uild"));
            builderA3.h(eventInternal2.b("manufacturer"));
            builderA3.e(eventInternal2.b("fingerprint"));
            builderA3.c(eventInternal2.b("country"));
            builderA3.g(eventInternal2.b(k.a.n));
            builderA3.i(eventInternal2.b("mcc_mnc"));
            builderA3.b(eventInternal2.b("application_build"));
            builderA2.b(builderA3.a());
            builderA.b(builderA2.a());
            try {
                builderA.d(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                builderA.e((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayloadE = eventInternal3.e();
                Encoding encoding = encodedPayloadE.f14439a;
                byte[] bArr = encodedPayloadE.b;
                if (encoding.equals(new Encoding("proto"))) {
                    builderK = LogEvent.k(bArr);
                } else if (encoding.equals(new Encoding("json"))) {
                    builderK = LogEvent.j(new String(bArr, Charset.forName("UTF-8")));
                } else {
                    String strConcat = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat, 5)) {
                        Log.w(strConcat, "Received event of unsupported encoding " + encoding + ". Skipping...");
                    }
                }
                builderK.d(eventInternal3.f());
                builderK.e(eventInternal3.m());
                String str2 = (String) eventInternal3.c().get("tz-offset");
                builderK.h(str2 == null ? 0L : Long.valueOf(str2).longValue());
                NetworkConnectionInfo.Builder builderA4 = NetworkConnectionInfo.a();
                builderA4.c((NetworkConnectionInfo.NetworkType) NetworkConnectionInfo.NetworkType.d.get(eventInternal3.i("net-type")));
                builderA4.b((NetworkConnectionInfo.MobileSubtype) NetworkConnectionInfo.MobileSubtype.d.get(eventInternal3.i("mobile-subtype")));
                builderK.g(builderA4.a());
                if (eventInternal3.d() != null) {
                    builderK.c(eventInternal3.d());
                }
                if (eventInternal3.j() != null) {
                    ComplianceData.Builder builderA5 = ComplianceData.a();
                    ExternalPrivacyContext.Builder builderA6 = ExternalPrivacyContext.a();
                    ExternalPRequestContext.Builder builderA7 = ExternalPRequestContext.a();
                    builderA7.b(eventInternal3.j());
                    builderA6.b(builderA7.a());
                    builderA5.b(builderA6.a());
                    ComplianceData.ProductIdOrigin productIdOrigin = ComplianceData.ProductIdOrigin.d;
                    builderA5.c();
                    builderK.b(builderA5.a());
                }
                if (eventInternal3.g() != null || eventInternal3.h() != null) {
                    ExperimentIds.Builder builderA8 = ExperimentIds.a();
                    if (eventInternal3.g() != null) {
                        builderA8.b(eventInternal3.g());
                    }
                    if (eventInternal3.h() != null) {
                        builderA8.c(eventInternal3.h());
                    }
                    builderK.f(builderA8.a());
                }
                arrayList3.add(builderK.a());
            }
            builderA.c(arrayList3);
            arrayList2.add(builderA.a());
        }
        BatchedLogRequest batchedLogRequestA = BatchedLogRequest.a(arrayList2);
        byte[] bArrC = backendRequest.c();
        URL urlC = this.d;
        if (bArrC != null) {
            try {
                CCTDestination cCTDestinationB = CCTDestination.b(backendRequest.c());
                str = cCTDestinationB.b;
                if (str == null) {
                    str = null;
                }
                String str3 = cCTDestinationB.f14389a;
                if (str3 != null) {
                    urlC = c(str3);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        } else {
            str = null;
        }
        try {
            HttpRequest httpRequest = new HttpRequest(urlC, batchedLogRequestA, str);
            ?? r0 = new Function() { // from class: com.google.android.datatransport.cct.a
                public final Object a(Object obj) {
                    CctTransportBackend.HttpRequest httpRequest2 = (CctTransportBackend.HttpRequest) obj;
                    URL url = httpRequest2.f14391a;
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Making request to: %s", url));
                    }
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    Callback.v(uRLConnectionOpenConnection);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(30000);
                    CctTransportBackend cctTransportBackend = this.f14393a;
                    httpURLConnection.setReadTimeout(cctTransportBackend.g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
                    httpURLConnection.setRequestProperty(RequestBuilder.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setRequestProperty(RequestBuilder.CONTENT_TYPE, "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    String str4 = httpRequest2.c;
                    if (str4 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str4);
                    }
                    try {
                        OutputStream outputStreamD = Callback.d(httpURLConnection);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStreamD);
                            try {
                                cctTransportBackend.f14390a.a(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), httpRequest2.b);
                                gZIPOutputStream.close();
                                if (outputStreamD != null) {
                                    outputStreamD.close();
                                }
                                int iF = Callback.f(httpURLConnection);
                                Integer numValueOf = Integer.valueOf(iF);
                                String strConcat3 = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat3, 4)) {
                                    Log.i(strConcat3, String.format("Status Code: %d", numValueOf));
                                }
                                Logging.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(RequestBuilder.CONTENT_TYPE));
                                Logging.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(RequestBuilder.CONTENT_ENCODING));
                                if (iF == 302 || iF == 301 || iF == 307) {
                                    return new CctTransportBackend.HttpResponse(iF, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
                                if (iF != 200) {
                                    return new CctTransportBackend.HttpResponse(iF, null, 0L);
                                }
                                InputStream inputStreamA = Callback.a(httpURLConnection);
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(RequestBuilder.CONTENT_ENCODING)) ? new GZIPInputStream(inputStreamA) : inputStreamA;
                                    try {
                                        CctTransportBackend.HttpResponse httpResponse = new CctTransportBackend.HttpResponse(iF, null, LogResponse.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).b());
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStreamA != null) {
                                            inputStreamA.close();
                                        }
                                        return httpResponse;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (EncodingException e) {
                        e = e;
                        Logging.c(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    } catch (ConnectException e2) {
                        e = e2;
                        Logging.c(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    } catch (UnknownHostException e3) {
                        e = e3;
                        Logging.c(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    } catch (IOException e4) {
                        e = e4;
                        Logging.c(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    }
                }
            };
            do {
                objA = r0.a(httpRequest);
                URL url = ((HttpResponse) objA).b;
                if (url != null) {
                    Logging.a("CctTransportBackend", "Following redirect to: %s", url);
                    httpRequest = new HttpRequest(url, httpRequest.b, httpRequest.c);
                } else {
                    httpRequest = null;
                }
                if (httpRequest == null) {
                    break;
                }
                i--;
            } while (i >= 1);
            HttpResponse httpResponse = (HttpResponse) objA;
            int i2 = httpResponse.f14392a;
            if (i2 == 200) {
                return BackendResponse.e(httpResponse.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException e) {
            Logging.c(e, "CctTransportBackend", "Could not make request to the backend");
            return BackendResponse.f();
        }
    }
}
