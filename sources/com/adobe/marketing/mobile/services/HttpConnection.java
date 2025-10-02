package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.services.ServiceProvider;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.UnknownServiceException;

/* loaded from: classes.dex */
class HttpConnection implements HttpConnecting {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f13232a;

    public HttpConnection(HttpURLConnection httpURLConnection) {
        this.f13232a = httpURLConnection;
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public final String a(String str) {
        return this.f13232a.getHeaderField(str);
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public final int b() {
        try {
            return Callback.f(this.f13232a);
        } catch (Error | Exception e) {
            String.format("Could not get response code. (%s)", e);
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return -1;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public final InputStream c() {
        try {
            return Callback.a(this.f13232a);
        } catch (Error e) {
            e = e;
            String.format("Could not get the input stream. (%s)", e);
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return null;
        } catch (UnknownServiceException e2) {
            String.format("Could not get the input stream, protocol does not support input. (%s)", e2);
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return null;
        } catch (Exception e3) {
            e = e3;
            String.format("Could not get the input stream. (%s)", e);
            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public final void close() throws IOException {
        InputStream errorStream;
        HttpURLConnection httpURLConnection = this.f13232a;
        InputStream inputStreamC = c();
        try {
            errorStream = httpURLConnection.getErrorStream();
        } catch (Error | Exception e) {
            String.format("Could not get the input stream. (%s)", e);
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            errorStream = null;
        }
        if (inputStreamC != null) {
            try {
                inputStreamC.close();
            } catch (Error | Exception e2) {
                String.format("Could not close the input stream. (%s)", e2);
                Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            }
        }
        if (errorStream != null) {
            try {
                errorStream.close();
            } catch (Error | Exception e3) {
                String.format("Could not close the error stream. (%s)", e3);
                Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            }
        }
        httpURLConnection.disconnect();
    }
}
