package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@RestrictTo
/* loaded from: classes4.dex */
public class DefaultLottieNetworkFetcher implements LottieNetworkFetcher {
    public final DefaultLottieFetchResult a(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        Callback.v(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new DefaultLottieFetchResult(httpURLConnection);
    }
}
