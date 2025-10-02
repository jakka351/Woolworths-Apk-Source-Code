package com.salesforce.marketingcloud.sfmcsdk.components.http;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Response;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutorsKt;
import com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt;
import com.salesforce.marketingcloud.sfmcsdk.util.NetworkUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 02\u00020\u0001:\u00010B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0016\"\u00020\r¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0002\b\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0015\u0010$\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b'J\u001f\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020\u0019H\u0001¢\u0006\u0002\b*J\u001d\u0010+\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020#H\u0001¢\u0006\u0002\b-J\u0015\u0010.\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0002\b/R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u00061"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/NetworkManager;", "", "context", "Landroid/content/Context;", "executors", "Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;", "networkPreferences", "Landroid/content/SharedPreferences;", "authenticator", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Authenticator;", "(Landroid/content/Context;Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;Landroid/content/SharedPreferences;Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Authenticator;)V", "requestsInFlight", "", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getRequestsInFlight$sfmcsdk_release$annotations", "()V", "getRequestsInFlight$sfmcsdk_release", "()Ljava/util/Map;", "canMakeRequest", "", "requestNames", "", "([Ljava/lang/String;)Z", "deviceRetryAfterTime", "", "requestName", "deviceRetryAfterTime$sfmcsdk_release", "executeAsync", "", "request", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Request;", "callback", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Callback;", "executeSync", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response;", "isBlockedByRetryAfter", "isBlockedByRetryAfter$sfmcsdk_release", "makeRequest", "makeRequest$sfmcsdk_release", "recordDeviceRetryAfter", "timestamp", "recordDeviceRetryAfter$sfmcsdk_release", "recordRetryAfter", "response", "recordRetryAfter$sfmcsdk_release", "serverRetryAfterTime", "serverRetryAfterTime$sfmcsdk_release", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_SERVER_RETRY = 86400000;

    @NotNull
    public static final String TAG = "~$NetworkManager";

    @Nullable
    private final Authenticator authenticator;

    @NotNull
    private final Context context;

    @NotNull
    private final SdkExecutors executors;

    @NotNull
    private final SharedPreferences networkPreferences;

    @NotNull
    private final Map<String, AtomicBoolean> requestsInFlight;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/NetworkManager$Companion;", "", "()V", "MAX_SERVER_RETRY", "", "TAG", "", "getDeviceRetryKey", "requestName", "getDeviceRetryKey$sfmcsdk_release", "getServerRetryKey", "getServerRetryKey$sfmcsdk_release", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getDeviceRetryKey$sfmcsdk_release(@NotNull String requestName) {
            Intrinsics.h(requestName, "requestName");
            return "retry_device_".concat(requestName);
        }

        @NotNull
        public final String getServerRetryKey$sfmcsdk_release(@NotNull String requestName) {
            Intrinsics.h(requestName, "requestName");
            return "retry_server_".concat(requestName);
        }

        private Companion() {
        }
    }

    public NetworkManager(@NotNull Context context, @NotNull SdkExecutors executors, @NotNull SharedPreferences networkPreferences, @Nullable Authenticator authenticator) {
        Intrinsics.h(context, "context");
        Intrinsics.h(executors, "executors");
        Intrinsics.h(networkPreferences, "networkPreferences");
        this.context = context;
        this.executors = executors;
        this.networkPreferences = networkPreferences;
        this.authenticator = authenticator;
        this.requestsInFlight = new LinkedHashMap();
    }

    @VisibleForTesting
    public static /* synthetic */ void getRequestsInFlight$sfmcsdk_release$annotations() {
    }

    public static /* synthetic */ void recordDeviceRetryAfter$sfmcsdk_release$default(NetworkManager networkManager, Request request, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        networkManager.recordDeviceRetryAfter$sfmcsdk_release(request, j);
    }

    public final boolean canMakeRequest(@NotNull String... requestNames) {
        Intrinsics.h(requestNames, "requestNames");
        if (!NetworkUtils.hasConnectivity(this.context)) {
            return false;
        }
        for (String str : requestNames) {
            if (isBlockedByRetryAfter$sfmcsdk_release(str)) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public final long deviceRetryAfterTime$sfmcsdk_release(@NotNull String requestName) {
        Intrinsics.h(requestName, "requestName");
        return this.networkPreferences.getLong(INSTANCE.getDeviceRetryKey$sfmcsdk_release(requestName), 0L);
    }

    public final void executeAsync(@NotNull final Request request, @NotNull final Callback callback) {
        Intrinsics.h(request, "request");
        Intrinsics.h(callback, "callback");
        SdkExecutorsKt.namedRunnable(this.executors.getNetworkIO(), "network_manager_execute", new Function0<Unit>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager.executeAsync.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m266invoke();
                return Unit.f24250a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m266invoke() {
                Callback callback2 = callback;
                Request request2 = request;
                callback2.onResponse(request2, this.executeSync(request2));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[Catch: Exception -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x004f, blocks: (B:6:0x0022, B:9:0x0029, B:11:0x002f, B:18:0x0078, B:21:0x0083, B:23:0x0095, B:24:0x0098, B:28:0x00b1, B:30:0x00c3, B:31:0x00c6), top: B:70:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[Catch: Exception -> 0x004f, TRY_ENTER, TryCatch #1 {Exception -> 0x004f, blocks: (B:6:0x0022, B:9:0x0029, B:11:0x002f, B:18:0x0078, B:21:0x0083, B:23:0x0095, B:24:0x0098, B:28:0x00b1, B:30:0x00c3, B:31:0x00c6), top: B:70:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: Exception -> 0x01cc, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x01cc, blocks: (B:3:0x0011, B:16:0x0066, B:19:0x007b, B:26:0x00a3, B:33:0x00e6, B:15:0x0054), top: B:71:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.salesforce.marketingcloud.sfmcsdk.components.http.Response executeSync(@org.jetbrains.annotations.NotNull com.salesforce.marketingcloud.sfmcsdk.components.http.Request r13) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager.executeSync(com.salesforce.marketingcloud.sfmcsdk.components.http.Request):com.salesforce.marketingcloud.sfmcsdk.components.http.Response");
    }

    @NotNull
    public final Map<String, AtomicBoolean> getRequestsInFlight$sfmcsdk_release() {
        return this.requestsInFlight;
    }

    public final boolean isBlockedByRetryAfter$sfmcsdk_release(@NotNull final String requestName) {
        Intrinsics.h(requestName, "requestName");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jServerRetryAfterTime$sfmcsdk_release = serverRetryAfterTime$sfmcsdk_release(requestName);
        long jDeviceRetryAfterTime$sfmcsdk_release = deviceRetryAfterTime$sfmcsdk_release(requestName);
        if (jCurrentTimeMillis > jServerRetryAfterTime$sfmcsdk_release && jCurrentTimeMillis > jDeviceRetryAfterTime$sfmcsdk_release) {
            return false;
        }
        SFMCSdkLogger.INSTANCE.w(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$isBlockedByRetryAfter$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return a.o(new StringBuilder("Route "), requestName, " _blocked_ by Retry-After.");
            }
        });
        return true;
    }

    @VisibleForTesting
    @WorkerThread
    @NotNull
    public final Response makeRequest$sfmcsdk_release(@NotNull final Request request) {
        final Response responseError$sfmcsdk_release;
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnection;
        Intrinsics.h(request, "request");
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(request.getUrl()).openConnection();
                com.dynatrace.android.callback.Callback.v(uRLConnectionOpenConnection);
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
            } catch (Exception e) {
                SFMCSdkLogger.INSTANCE.e(TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$4
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Unable to complete request";
                    }
                });
                responseError$sfmcsdk_release = Response.INSTANCE.error$sfmcsdk_release("ERROR", -100);
                AtomicBoolean atomicBoolean = this.requestsInFlight.get(request.getName());
                if (atomicBoolean != null) {
                    atomicBoolean.set(false);
                }
                httpURLConnection = (HttpURLConnection) objectRef.d;
                if (httpURLConnection != null) {
                }
            }
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnection;
            objectRef.d = httpURLConnection2;
            httpURLConnection2.setRequestMethod(request.getMethod());
            ((HttpURLConnection) objectRef.d).setDoInput(true);
            ((HttpURLConnection) objectRef.d).setUseCaches(false);
            ((HttpURLConnection) objectRef.d).setAllowUserInteraction(false);
            ((HttpURLConnection) objectRef.d).setConnectTimeout(request.getConnectionTimeout());
            int iA = ProgressionUtilKt.a(0, request.getHeaders().size() - 1, 2);
            if (iA >= 0) {
                int i = 0;
                while (true) {
                    ((HttpURLConnection) objectRef.d).setRequestProperty(request.getHeaders().get(i), request.getHeaders().get(i + 1));
                    if (i == iA) {
                        break;
                    }
                    i += 2;
                }
            }
            String requestBody = request.getRequestBody();
            if (requestBody != null) {
                ((HttpURLConnection) objectRef.d).setDoOutput(true);
                SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return request.getName() + ' ' + ((HttpURLConnection) objectRef.d).getRequestMethod() + " initiated\nwith request properties " + ((HttpURLConnection) objectRef.d).getRequestProperties() + "\nand body " + request.getRequestBody();
                    }
                });
                OutputStream outputStreamD = com.dynatrace.android.callback.Callback.d((HttpURLConnection) objectRef.d);
                try {
                    byte[] bytes = requestBody.getBytes(RequestKt.getUTF_8());
                    Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
                    outputStreamD.write(bytes);
                    outputStreamD.close();
                } finally {
                }
            }
            Response.Builder builder = new Response.Builder();
            builder.code(com.dynatrace.android.callback.Callback.f((HttpURLConnection) objectRef.d));
            String responseMessage = ((HttpURLConnection) objectRef.d).getResponseMessage();
            Intrinsics.g(responseMessage, "connection.responseMessage");
            builder.message(responseMessage);
            Map<String, List<String>> headerFields = ((HttpURLConnection) objectRef.d).getHeaderFields();
            Intrinsics.g(headerFields, "connection.headerFields");
            builder.headers(headerFields);
            try {
                String all = FileUtilsKt.readAll(com.dynatrace.android.callback.Callback.a((HttpURLConnection) objectRef.d));
                if (all != null) {
                    builder.body(all);
                }
            } catch (IOException unused) {
                String all2 = FileUtilsKt.readAll(((HttpURLConnection) objectRef.d).getErrorStream());
                if (all2 != null) {
                    builder.body(all2);
                }
            }
            builder.startTimeMillis(jCurrentTimeMillis);
            builder.endTimeMillis(System.currentTimeMillis());
            responseError$sfmcsdk_release = builder.build();
            SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$makeRequest$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "HTTP response " + responseError$sfmcsdk_release.getCode() + " for " + request.getName() + " request. Request took " + responseError$sfmcsdk_release.timeToExecute() + "ms.";
                }
            });
            AtomicBoolean atomicBoolean2 = this.requestsInFlight.get(request.getName());
            if (atomicBoolean2 != null) {
                atomicBoolean2.set(false);
            }
            httpURLConnection = (HttpURLConnection) objectRef.d;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return responseError$sfmcsdk_release;
        } catch (Throwable th) {
            AtomicBoolean atomicBoolean3 = this.requestsInFlight.get(request.getName());
            if (atomicBoolean3 != null) {
                atomicBoolean3.set(false);
            }
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) objectRef.d;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            throw th;
        }
    }

    @VisibleForTesting
    public final void recordDeviceRetryAfter$sfmcsdk_release(@NotNull Request request, long timestamp) {
        Intrinsics.h(request, "request");
        if (request.getRateLimit() > 0) {
            SharedPreferences.Editor editorEdit = this.networkPreferences.edit();
            editorEdit.putLong(INSTANCE.getDeviceRetryKey$sfmcsdk_release(request.getName()), request.getRateLimit() + timestamp);
            editorEdit.apply();
        }
    }

    @VisibleForTesting
    public final void recordRetryAfter$sfmcsdk_release(@NotNull Request request, @NotNull Response response) {
        Intrinsics.h(request, "request");
        Intrinsics.h(response, "response");
        SharedPreferences.Editor editorEdit = this.networkPreferences.edit();
        recordDeviceRetryAfter$sfmcsdk_release(request, response.getEndTimeMillis());
        List<String> list = response.getHeaders().get("Retry-After");
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            long j = Long.parseLong(list.get(0)) * 1000;
            String serverRetryKey$sfmcsdk_release = INSTANCE.getServerRetryKey$sfmcsdk_release(request.getName());
            long endTimeMillis = response.getEndTimeMillis();
            if (j > 86400000) {
                j = 86400000;
            }
            editorEdit.putLong(serverRetryKey$sfmcsdk_release, endTimeMillis + j);
            editorEdit.apply();
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.d(TAG, e, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager$recordRetryAfter$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Unable to parse Retry-After value.";
                }
            });
        }
    }

    @VisibleForTesting
    public final long serverRetryAfterTime$sfmcsdk_release(@NotNull String requestName) {
        Intrinsics.h(requestName, "requestName");
        return this.networkPreferences.getLong(INSTANCE.getServerRetryKey$sfmcsdk_release(requestName), 0L);
    }

    public /* synthetic */ NetworkManager(Context context, SdkExecutors sdkExecutors, SharedPreferences sharedPreferences, Authenticator authenticator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, sdkExecutors, sharedPreferences, (i & 8) != 0 ? null : authenticator);
    }
}
