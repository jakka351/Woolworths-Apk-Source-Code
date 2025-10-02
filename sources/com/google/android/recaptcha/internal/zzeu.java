package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzeu implements zzet {

    @NotNull
    private final String zza;

    public zzeu(@NotNull String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        for (zzrc zzrcVar : zzrf.zzk(bArr).zzl()) {
            String str = "INIT_TOTAL";
            List listR = CollectionsKt.R("INIT_TOTAL", "EXECUTE_TOTAL");
            switch (zzrcVar.zzY()) {
                case 2:
                    str = "UNKNOWN";
                    break;
                case 3:
                    str = "INIT_NATIVE";
                    break;
                case 4:
                    str = "INIT_NETWORK";
                    break;
                case 5:
                    str = "INIT_JS";
                    break;
                case 6:
                    break;
                case 7:
                    str = "EXECUTE_NATIVE";
                    break;
                case 8:
                    str = "EXECUTE_JS";
                    break;
                case 9:
                    str = "EXECUTE_TOTAL";
                    break;
                case 10:
                    str = "CHALLENGE_ACCOUNT_NATIVE";
                    break;
                case 11:
                    str = "CHALLENGE_ACCOUNT_JS";
                    break;
                case 12:
                    str = "CHALLENGE_ACCOUNT_TOTAL";
                    break;
                case 13:
                    str = "VERIFY_PIN_NATIVE";
                    break;
                case 14:
                    str = "VERIFY_PIN_JS";
                    break;
                case 15:
                    str = "VERIFY_PIN_TOTAL";
                    break;
                case 16:
                    str = "RUN_PROGRAM";
                    break;
                case 17:
                    str = "FETCH_ALLOWLIST";
                    break;
                case 18:
                    str = "JS_LOAD";
                    break;
                case 19:
                    str = "WEB_VIEW_RELOAD_JS";
                    break;
                case 20:
                    str = "INIT_NETWORK_MRI_ACTION";
                    break;
                case 21:
                    str = "INIT_DOWNLOAD_JS";
                    break;
                case 22:
                    str = "VALIDATE_INPUT";
                    break;
                case 23:
                    str = "DOWNLOAD_JS";
                    break;
                case 24:
                    str = "SAVE_CACHE_JS";
                    break;
                case 25:
                    str = "LOAD_CACHE_JS";
                    break;
                case 26:
                    str = "LOAD_WEBVIEW";
                    break;
                case 27:
                    str = "COLLECT_SIGNALS";
                    break;
                case 28:
                    str = "FETCH_TOKEN";
                    break;
                case 29:
                    str = "POST_EXECUTE";
                    break;
                case 30:
                    str = "SIGNAL_MANAGER_INITIALIZATION";
                    break;
                case 31:
                    str = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                    break;
                case 32:
                    str = "WEBVIEW_ENGINE_INITIALIATION";
                    break;
                case 33:
                    str = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 34:
                    str = "NATIVE_ENGINE_INITIALIZATION";
                    break;
                case 35:
                    str = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 36:
                    str = "NATIVE_SIGNAL_INITIALIZATION";
                    break;
                case 37:
                    str = "NATIVE_SIGNAL_COLLECTION";
                    break;
                case 38:
                    str = "PIA_WARMUP";
                    break;
                case 39:
                    str = "GMSCORE_ENGINE_INITIALIZATION";
                    break;
                case 40:
                    str = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 41:
                    str = "INIT_ATTEMPT";
                    break;
                case 42:
                    str = "WEBVIEW_INITIALIZATION";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            if (listR.contains(str) && zzrcVar.zzX()) {
                zzrcVar.zzM();
                zzrcVar.zzN();
                zzrcVar.zzY();
                zzrcVar.zzg().zzk();
                zzrcVar.zzg().zzf();
                zzrcVar.zzZ();
            } else {
                zzrcVar.zzM();
                zzrcVar.zzN();
                zzrcVar.zzY();
                zzrcVar.zzZ();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzet
    public final boolean zza(@NotNull byte[] bArr) throws IOException {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection uRLConnectionOpenConnection = new URL(this.zza).openConnection();
                Callback.v(uRLConnectionOpenConnection);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
                Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnection;
            } else {
                if (!URLUtil.isHttpsUrl(this.zza)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection uRLConnectionOpenConnection2 = new URL(this.zza).openConnection();
                Callback.v(uRLConnectionOpenConnection2);
                URLConnection uRLConnection2 = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection2);
                Intrinsics.f(uRLConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) uRLConnection2;
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(RequestBuilder.CONTENT_TYPE, "application/x-protobuffer");
            httpURLConnection.connect();
            Callback.d(httpURLConnection).write(bArr);
            return Callback.f(httpURLConnection) == 200;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
