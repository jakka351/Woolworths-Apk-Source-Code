package com.google.firebase.installations.remote;

import YU.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.AutoValue_InstallationResponse;
import com.google.firebase.installations.remote.AutoValue_TokenResult;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FirebaseInstallationServiceClient {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15627a;
    public final Provider b;
    public final RequestLimiter c = new RequestLimiter();

    public FirebaseInstallationServiceClient(Context context, Provider provider) {
        this.f15627a = context;
        this.b = provider;
    }

    public static URL c(String str) throws FirebaseInstallationsException {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage());
        }
    }

    public static void d(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(Callback.f(httpURLConnection)), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", a.j("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : a.A(", ", str)));
    }

    public static long f(String str) {
        Preconditions.checkArgument(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static InstallationResponse g(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStreamA = Callback.a(httpURLConnection);
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStreamA, e));
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.d(0L);
        AutoValue_InstallationResponse.Builder builder2 = new AutoValue_InstallationResponse.Builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                builder2.f15624a = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                builder2.b = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                builder2.c = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.d(f(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.d = builder.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStreamA.close();
        return new AutoValue_InstallationResponse(builder2.f15624a, builder2.b, builder2.c, builder2.d, InstallationResponse.ResponseCode.d);
    }

    public static TokenResult h(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStreamA = Callback.a(httpURLConnection);
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStreamA, e));
        AutoValue_TokenResult.Builder builder = new AutoValue_TokenResult.Builder();
        builder.d(0L);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.d(f(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStreamA.close();
        builder.b(TokenResult.ResponseCode.d);
        return builder.a();
    }

    public static void i(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put(lllqqql.cc006300630063cc, "a:19.0.0");
            k(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void j(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(lllqqql.cc006300630063cc, "a:19.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            k(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStreamD = Callback.d(httpURLConnection);
        if (outputStreamD == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStreamD);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStreamD.close();
            } catch (IOException unused) {
            }
        }
    }

    public final InstallationResponse a(String str, String str2, String str3, String str4, String str5) {
        int iF;
        RequestLimiter requestLimiter = this.c;
        if (!requestLimiter.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlC = c("projects/" + str3 + "/installations");
        int i = 0;
        while (true) {
            boolean z = true;
            if (i > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionE = e(urlC, str);
            try {
                try {
                    httpURLConnectionE.setRequestMethod("POST");
                    httpURLConnectionE.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionE.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    try {
                        i(httpURLConnectionE, str2, str4);
                        iF = Callback.f(httpURLConnectionE);
                        requestLimiter.b(iF);
                        if (iF < 200 || iF >= 300) {
                            z = false;
                        }
                    } catch (IOException | AssertionError unused) {
                    }
                } finally {
                    httpURLConnectionE.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (z) {
                return g(httpURLConnectionE);
            }
            d(httpURLConnectionE, str4, str, str3);
            if (iF == 429) {
                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
            }
            if (iF < 500 || iF >= 600) {
                break;
            }
            i++;
        }
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
        AutoValue_InstallationResponse.Builder builder = new AutoValue_InstallationResponse.Builder();
        return new AutoValue_InstallationResponse(builder.f15624a, builder.b, builder.c, builder.d, InstallationResponse.ResponseCode.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        r4 = new com.google.firebase.installations.remote.AutoValue_TokenResult.Builder();
        r4.d(0);
        r4.b(com.google.firebase.installations.remote.TokenResult.ResponseCode.f);
        r10 = r4.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.installations.remote.TokenResult b(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            com.google.firebase.installations.remote.RequestLimiter r0 = r9.c
            boolean r1 = r0.a()
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            if (r1 == 0) goto Ldf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "projects/"
            r1.<init>(r3)
            r1.append(r12)
            java.lang.String r3 = "/installations/"
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = "/authTokens:generate"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.net.URL r11 = c(r11)
            r1 = 0
            r3 = r1
        L2b:
            r4 = 1
            if (r3 > r4) goto Ld9
            r5 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r5)
            java.net.HttpURLConnection r5 = r9.e(r11, r10)
            java.lang.String r6 = "POST"
            r5.setRequestMethod(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            java.lang.String r6 = "Authorization"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            r7.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            java.lang.String r8 = "FIS_v2 "
            r7.append(r8)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            r7.append(r13)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            r5.addRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            r5.setDoOutput(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            j(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            int r6 = com.dynatrace.android.callback.Callback.f(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            r0.b(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 < r7) goto L69
            r7 = 300(0x12c, float:4.2E-43)
            if (r6 >= r7) goto L69
            goto L6a
        L69:
            r4 = r1
        L6a:
            if (r4 == 0) goto L79
            com.google.firebase.installations.remote.TokenResult r10 = h(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94
        L70:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r10
        L77:
            r10 = move-exception
            goto Lce
        L79:
            r4 = 0
            d(r5, r4, r10, r12)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4 = 401(0x191, float:5.62E-43)
            r7 = 0
            if (r6 == r4) goto Lbc
            r4 = 404(0x194, float:5.66E-43)
            if (r6 != r4) goto L88
            goto Lbc
        L88:
            r4 = 429(0x1ad, float:6.01E-43)
            if (r6 == r4) goto Lb4
            r4 = 500(0x1f4, float:7.0E-43)
            if (r6 < r4) goto L9b
            r4 = 600(0x258, float:8.41E-43)
            if (r6 >= r4) goto L9b
        L94:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto Ld5
        L9b:
            java.lang.String r4 = "Firebase-Installations"
            java.lang.String r6 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r4, r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            com.google.firebase.installations.remote.AutoValue_TokenResult$Builder r4 = new com.google.firebase.installations.remote.AutoValue_TokenResult$Builder     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4.d(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            com.google.firebase.installations.remote.TokenResult$ResponseCode r6 = com.google.firebase.installations.remote.TokenResult.ResponseCode.e     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4.b(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            com.google.firebase.installations.remote.TokenResult r10 = r4.a()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            goto L70
        Lb4:
            com.google.firebase.installations.FirebaseInstallationsException r4 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            java.lang.String r6 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            throw r4     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
        Lbc:
            com.google.firebase.installations.remote.AutoValue_TokenResult$Builder r4 = new com.google.firebase.installations.remote.AutoValue_TokenResult$Builder     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4.d(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            com.google.firebase.installations.remote.TokenResult$ResponseCode r6 = com.google.firebase.installations.remote.TokenResult.ResponseCode.f     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r4.b(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            com.google.firebase.installations.remote.TokenResult r10 = r4.a()     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            goto L70
        Lce:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r10
        Ld5:
            int r3 = r3 + 1
            goto L2b
        Ld9:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            r10.<init>(r2)
            throw r10
        Ldf:
            com.google.firebase.installations.FirebaseInstallationsException r10 = new com.google.firebase.installations.FirebaseInstallationsException
            r10.<init>(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.google.firebase.installations.remote.TokenResult");
    }

    public final HttpURLConnection e(URL url, String str) throws IOException, FirebaseInstallationsException {
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.v(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(ModuleDescriptor.MODULE_VERSION);
            httpURLConnection.addRequestProperty(RequestBuilder.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty(RequestBuilder.ACCEPT, "application/json");
            httpURLConnection.addRequestProperty(RequestBuilder.CONTENT_ENCODING, "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f15627a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            HeartBeatController heartBeatController = (HeartBeatController) this.b.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(heartBeatController.a()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            String strBytesToStringUppercase = null;
            try {
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e4);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
