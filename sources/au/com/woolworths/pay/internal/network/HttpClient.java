package au.com.woolworths.pay.internal.network;

import YU.a;
import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.util.Logger;
import au.com.woolworths.pay.sdk.models.errors.NetworkError;
import au.com.woolworths.pay.sdk.models.errors.NetworkTimeoutError;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes4.dex */
public class HttpClient {

    /* renamed from: a, reason: collision with root package name */
    public String f9181a;
    public int b;
    public int c;
    public ExecutorService d;
    public TLSSocketFactory e;
    public Logger f;

    public static HttpURLConnection a(HttpClient httpClient, String str, Map map) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.v(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
        if (httpURLConnection instanceof HttpsURLConnection) {
            TLSSocketFactory tLSSocketFactory = httpClient.e;
            if (tLSSocketFactory == null) {
                throw new SSLException("SSLSocketFactory was not set or failed to initialize");
            }
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(tLSSocketFactory);
        }
        httpURLConnection.setRequestProperty(RequestBuilder.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("User-Agent", "woolworths-pay");
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().getLanguage());
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        if (map != null) {
            for (String str2 : map.keySet()) {
                Iterator it = ((List) map.get(str2)).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty(str2, (String) it.next());
                }
            }
        }
        Map<String, List<String>> requestProperties = httpURLConnection.getRequestProperties();
        for (String str3 : requestProperties.keySet()) {
            for (String str4 : requestProperties.get(str3)) {
                httpClient.f.a("Request " + str3 + ": " + str4);
            }
        }
        httpURLConnection.setConnectTimeout(httpClient.b);
        httpURLConnection.setReadTimeout(httpClient.c);
        return httpURLConnection;
    }

    public static String b(HttpClient httpClient, HttpURLConnection httpURLConnection) {
        int iF = Callback.f(httpURLConnection);
        boolean zEquals = "gzip".equals(httpURLConnection.getContentEncoding());
        return iF >= 400 ? d(httpURLConnection.getErrorStream(), zEquals) : d(Callback.a(httpURLConnection), zEquals);
    }

    public static String d(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        String str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
        return str;
    }

    public final void c(final String str, String str2, final Map map, final String str3, final HttpResponseCallback httpResponseCallback) {
        if (!str2.startsWith("http")) {
            str2 = a.o(new StringBuilder(), this.f9181a, str2);
        }
        final String str4 = str2;
        this.d.submit(new Runnable() { // from class: au.com.woolworths.pay.internal.network.HttpClient.1
            @Override // java.lang.Runnable
            public final void run() {
                HttpResponseCallback httpResponseCallback2 = httpResponseCallback;
                String str5 = str4;
                String str6 = str3;
                String str7 = str;
                HttpClient httpClient = HttpClient.this;
                Logger logger = httpClient.f;
                HttpURLConnection httpURLConnectionA = null;
                try {
                    try {
                        logger.a("Request " + str7 + " " + str5);
                        httpURLConnectionA = HttpClient.a(httpClient, str5, map);
                        httpURLConnectionA.setRequestMethod(str7);
                        logger.a("Request body:\n" + str6);
                        logger.a("");
                        httpURLConnectionA.setDoOutput((str7.equals("GET") || str7.equals("DELETE")) ? false : true);
                        if (str6 != null) {
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Callback.d(httpURLConnectionA), "UTF-8");
                            outputStreamWriter.write(str6, 0, str6.length());
                            outputStreamWriter.flush();
                            outputStreamWriter.close();
                        }
                        int iF = Callback.f(httpURLConnectionA);
                        logger.a("Response HTTP Status " + iF);
                        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                        String strB = HttpClient.b(httpClient, httpURLConnectionA);
                        logger.a("Response body:\n" + strB);
                        ((APICall.AnonymousClass1) httpResponseCallback2).a(strB, headerFields, iF);
                        httpURLConnectionA.disconnect();
                    } catch (Exception e) {
                        logger.a("Response error:\n" + e.getLocalizedMessage());
                        if (e instanceof SocketTimeoutException) {
                            final APICall.AnonymousClass1 anonymousClass1 = (APICall.AnonymousClass1) httpResponseCallback2;
                            APICall.c.post(new Runnable() { // from class: au.com.woolworths.pay.internal.network.APICall.1.4
                                public AnonymousClass4() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass1.this.f9179a.b(new NetworkTimeoutError());
                                }
                            });
                        } else {
                            final String localizedMessage = e.getLocalizedMessage();
                            final APICall.AnonymousClass1 anonymousClass12 = (APICall.AnonymousClass1) httpResponseCallback2;
                            APICall.c.post(new Runnable() { // from class: au.com.woolworths.pay.internal.network.APICall.1.3
                                public final /* synthetic */ String d;

                                public AnonymousClass3(final String localizedMessage2) {
                                    str = localizedMessage2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass1.this.f9179a.b(new NetworkError(str));
                                }
                            });
                        }
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                    }
                } catch (Throwable th) {
                    if (httpURLConnectionA != null) {
                        httpURLConnectionA.disconnect();
                    }
                    throw th;
                }
            }
        });
    }
}
