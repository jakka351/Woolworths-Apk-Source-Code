package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.services.ServiceProvider;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
class HttpConnectionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final HttpsURLConnection f13233a;
    public Command b = Command.GET;

    public enum Command {
        GET(false),
        /* JADX INFO: Fake field, exist only in values array */
        POST(true);

        public final boolean d;

        Command(boolean z) {
            this.d = z;
        }
    }

    public HttpConnectionHandler(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.v(uRLConnectionOpenConnection);
        this.f13233a = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
    }

    public final HttpConnecting a() {
        HttpsURLConnection httpsURLConnection = this.f13233a;
        if (httpsURLConnection.getURL() != null) {
            httpsURLConnection.getURL().toString();
        }
        this.b.toString();
        Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        try {
            httpsURLConnection.connect();
        } catch (Error e) {
            e = e;
            String.format("Connection failure (%s)", e);
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (SocketTimeoutException e2) {
            String.format("Connection failure, socket timeout (%s)", e2);
            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (IOException e3) {
            if (e3.getLocalizedMessage() != null) {
                e3.getLocalizedMessage();
            } else {
                e3.getMessage();
            }
            Logging logging4 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (Exception e4) {
            e = e4;
            String.format("Connection failure (%s)", e);
            Logging logging22 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        }
        return new HttpConnection(httpsURLConnection);
    }

    public final boolean b() throws ProtocolException {
        HttpMethod httpMethod = HttpMethod.d;
        HttpsURLConnection httpsURLConnection = this.f13233a;
        try {
            Command commandValueOf = Command.valueOf("GET");
            httpsURLConnection.setRequestMethod(commandValueOf.name());
            httpsURLConnection.setDoOutput(commandValueOf.d);
            httpsURLConnection.setUseCaches(false);
            this.b = commandValueOf;
            return true;
        } catch (Error e) {
            e = e;
            String.format("Failed to set http command (%s)!", e);
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        } catch (IllegalArgumentException e2) {
            String.format("%s command is not supported (%s)!", httpMethod, e2);
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        } catch (IllegalStateException e3) {
            String.format("Cannot set command after connect (%s)!", e3);
            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        } catch (ProtocolException e4) {
            String.format("%s is not a valid HTTP command (%s)!", httpMethod, e4);
            Logging logging4 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        } catch (Exception e5) {
            e = e5;
            String.format("Failed to set http command (%s)!", e);
            Logging logging5 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return false;
        }
    }

    public final void c(int i) {
        try {
            this.f13233a.setConnectTimeout(i);
        } catch (Error e) {
            e = e;
            String.format("Failed to set connection timeout (%s)!", e);
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (IllegalArgumentException e2) {
            String.format(i + " is not valid timeout value (%s)", e2);
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (Exception e3) {
            e = e3;
            String.format("Failed to set connection timeout (%s)!", e);
            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        }
    }

    public final void d(int i) {
        try {
            this.f13233a.setReadTimeout(i);
        } catch (Error e) {
            e = e;
            String.format("Failed to set read timeout (%s)!", e);
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (IllegalArgumentException e2) {
            String.format(i + " is not valid timeout value (%s)", e2);
            Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        } catch (Exception e3) {
            e = e3;
            String.format("Failed to set read timeout (%s)!", e);
            Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
        }
    }

    public final void e(HashMap map) {
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            try {
                this.f13233a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            } catch (Error e) {
                e = e;
                String.format("Failed to set request property (%s)!", e);
                Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            } catch (IllegalStateException e2) {
                String.format("Cannot set header field after connect (%s)!", e2);
                Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                return;
            } catch (Exception e3) {
                e = e3;
                String.format("Failed to set request property (%s)!", e);
                Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            }
        }
    }
}
