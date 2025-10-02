package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.s;
import com.salesforce.marketingcloud.media.u;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;

@SuppressLint
/* loaded from: classes6.dex */
public class q extends u {
    private static final String b = com.salesforce.marketingcloud.g.a("NetworkRequestHandler");

    /* renamed from: a, reason: collision with root package name */
    private final r f16976a;

    public q(r rVar) {
        this.f16976a = rVar;
    }

    @Override // com.salesforce.marketingcloud.media.u
    public boolean a(s sVar) {
        try {
            String lowerCase = sVar.f16978a.getScheme().toLowerCase(Locale.ENGLISH);
            return "http".equalsIgnoreCase(lowerCase) || "https".equalsIgnoreCase(lowerCase);
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(b, e, "Unable to get scheme from request.", new Object[0]);
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.media.u
    public void a(o oVar, s sVar, u.a aVar) throws Throwable {
        String string = sVar.f16978a.toString();
        Bitmap bitmapA = a(string, sVar);
        if (bitmapA != null) {
            aVar.a(new u.b(bitmapA, o.b.DISK));
            return;
        }
        com.salesforce.marketingcloud.g.a("IMAGE", "Starting network request for image", new Object[0]);
        HttpURLConnection.setFollowRedirects(true);
        HttpsURLConnection httpsURLConnection = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(string).openConnection();
                Callback.v(uRLConnectionOpenConnection);
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
                try {
                    httpsURLConnection2.setUseCaches(false);
                    httpsURLConnection2.setConnectTimeout(30000);
                    httpsURLConnection2.setRequestMethod("GET");
                    InputStream inputStreamB = Callback.b(httpsURLConnection2);
                    if (s.b.c(sVar.d)) {
                        byte[] bArrA = com.salesforce.marketingcloud.util.g.a(inputStreamB);
                        com.salesforce.marketingcloud.util.g.a((Closeable) inputStreamB);
                        this.f16976a.a(string, new ByteArrayInputStream(bArrA));
                        inputStreamB = new ByteArrayInputStream(bArrA);
                    }
                    Bitmap bitmapA2 = u.a(inputStreamB, sVar);
                    com.salesforce.marketingcloud.util.g.a((Closeable) inputStreamB);
                    aVar.a(new u.b(bitmapA2, o.b.NETWORK));
                    httpsURLConnection2.disconnect();
                } catch (Exception e) {
                    e = e;
                    httpsURLConnection = httpsURLConnection2;
                    com.salesforce.marketingcloud.g.b("IMAGE", e, "Image network error for URL: %s", string);
                    aVar.a(e);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    th = th;
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private Bitmap a(String str, s sVar) throws IOException {
        InputStream inputStreamA = this.f16976a.a(str);
        Bitmap bitmapA = null;
        if (inputStreamA != null) {
            try {
                bitmapA = u.a(inputStreamA, sVar);
                com.salesforce.marketingcloud.util.g.a((Closeable) inputStreamA);
                return bitmapA;
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.a(b, e, "Failed to decode cache into Bitmap.", new Object[0]);
            }
        }
        return bitmapA;
    }
}
