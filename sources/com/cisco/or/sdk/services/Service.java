package com.cisco.or.sdk.services;

import android.content.Context;
import android.os.AsyncTask;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.exceptions.TokenEmptyException;
import com.cisco.or.sdk.utils.SharedPrefs;
import com.cisco.or.sdk.utils.Utils;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b \u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/cisco/or/sdk/services/Service;", "", "HTTP_METHOD", "HeaderParam", "RESPONSE_FORMATTER", "RequestData", "RestCallWorker", "RestParams", "Worker", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Service {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/Service$HTTP_METHOD;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HTTP_METHOD {
        public static final HTTP_METHOD d;
        public static final HTTP_METHOD e;
        public static final HTTP_METHOD f;
        public static final HTTP_METHOD g;
        public static final /* synthetic */ HTTP_METHOD[] h;

        static {
            HTTP_METHOD http_method = new HTTP_METHOD("GET", 0);
            d = http_method;
            HTTP_METHOD http_method2 = new HTTP_METHOD(Request.PUT, 1);
            e = http_method2;
            HTTP_METHOD http_method3 = new HTTP_METHOD("POST", 2);
            f = http_method3;
            HTTP_METHOD http_method4 = new HTTP_METHOD("DELETE", 3);
            g = http_method4;
            h = new HTTP_METHOD[]{http_method, http_method2, http_method3, http_method4, new HTTP_METHOD("OPTIONS", 4)};
        }

        public static HTTP_METHOD valueOf(String str) {
            return (HTTP_METHOD) Enum.valueOf(HTTP_METHOD.class, str);
        }

        public static HTTP_METHOD[] values() {
            return (HTTP_METHOD[]) h.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/Service$HeaderParam;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HeaderParam {

        /* renamed from: a, reason: collision with root package name */
        public final String f14050a;
        public final String b;

        public HeaderParam(String str, String str2) {
            this.f14050a = str;
            this.b = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/Service$RESPONSE_FORMATTER;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RESPONSE_FORMATTER {
        public static final RESPONSE_FORMATTER d;
        public static final RESPONSE_FORMATTER e;
        public static final RESPONSE_FORMATTER f;
        public static final RESPONSE_FORMATTER g;
        public static final /* synthetic */ RESPONSE_FORMATTER[] h;

        static {
            RESPONSE_FORMATTER response_formatter = new RESPONSE_FORMATTER("TEXT", 0);
            d = response_formatter;
            RESPONSE_FORMATTER response_formatter2 = new RESPONSE_FORMATTER("JSON", 1);
            e = response_formatter2;
            RESPONSE_FORMATTER response_formatter3 = new RESPONSE_FORMATTER("BINARY", 2);
            f = response_formatter3;
            RESPONSE_FORMATTER response_formatter4 = new RESPONSE_FORMATTER("JSONArray", 3);
            g = response_formatter4;
            h = new RESPONSE_FORMATTER[]{response_formatter, response_formatter2, response_formatter3, response_formatter4};
        }

        public static RESPONSE_FORMATTER valueOf(String str) {
            return (RESPONSE_FORMATTER) Enum.valueOf(RESPONSE_FORMATTER.class, str);
        }

        public static RESPONSE_FORMATTER[] values() {
            return (RESPONSE_FORMATTER[]) h.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/Service$RequestData;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestData {

        /* renamed from: a, reason: collision with root package name */
        public final String f14051a;
        public final ArrayList b;
        public final HTTP_METHOD c;
        public final String d;

        public RequestData(String url, ArrayList arrayList, HTTP_METHOD http_method, String str) {
            Intrinsics.h(url, "url");
            this.f14051a = url;
            this.b = arrayList;
            this.c = http_method;
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/cisco/or/sdk/services/Service$RestCallWorker;", "Landroid/os/AsyncTask;", "Lcom/cisco/or/sdk/services/Service$RestParams;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RestCallWorker extends AsyncTask<RestParams, Object, Object> {
        @Override // android.os.AsyncTask
        public final Object doInBackground(RestParams[] restParamsArr) {
            RestParams[] params = restParamsArr;
            Intrinsics.h(params, "params");
            RestParams restParams = params[0];
            try {
                HTTPResponse hTTPResponseA = Worker.a(restParams.b, restParams.c);
                ((Service$call$1) restParams.d).invoke(restParams.f14052a, hTTPResponseA, null);
                return null;
            } catch (IOException e) {
                ((Service$call$1) restParams.d).invoke(restParams.f14052a, null, e);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/Service$RestParams;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RestParams {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14052a;
        public final RequestData b;
        public final RESPONSE_FORMATTER c;
        public final Function3 d;

        public RestParams(Context context, RequestData requestData, RESPONSE_FORMATTER response_formatter, Function3 function3) {
            Intrinsics.h(context, "context");
            this.f14052a = context;
            this.b = requestData;
            this.c = response_formatter;
            this.d = function3;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/services/Service$Worker;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Worker {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[RESPONSE_FORMATTER.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public static HTTPResponse a(RequestData requestData, RESPONSE_FORMATTER response_formatter) throws IOException {
            HTTPResponse hTTPResponse = new HTTPResponse();
            hTTPResponse.c = -1;
            URLConnection uRLConnectionOpenConnection = new URL(requestData.f14051a).openConnection();
            Callback.v(uRLConnectionOpenConnection);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection);
            Intrinsics.f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(requestData.c.name());
            ArrayList<HeaderParam> arrayList = requestData.b;
            if (arrayList != null) {
                for (HeaderParam headerParam : arrayList) {
                    httpURLConnection.setRequestProperty(headerParam.f14050a, headerParam.b);
                }
            }
            String str = requestData.d;
            if (str != null) {
                byte[] bytes = str.getBytes(Charsets.f24671a);
                Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
                OutputStream outputStreamD = Callback.d(httpURLConnection);
                Intrinsics.g(outputStreamD, "connection.outputStream");
                outputStreamD.write(bytes);
                outputStreamD.close();
            }
            hTTPResponse.c = Callback.f(httpURLConnection);
            Object content = httpURLConnection.getContent();
            Intrinsics.f(content, "null cannot be cast to non-null type java.io.InputStream");
            InputStream inputStream = (InputStream) content;
            if (response_formatter == RESPONSE_FORMATTER.f) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                inputStream.close();
                hTTPResponse.b = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } else {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                hTTPResponse.f14046a = (String) bufferedReader.lines().collect(Collectors.joining());
                bufferedReader.close();
            }
            int iOrdinal = response_formatter.ordinal();
            try {
                if (iOrdinal == 1) {
                    String str2 = hTTPResponse.f14046a;
                    Intrinsics.e(str2);
                    hTTPResponse.d = new JSONObject(str2);
                } else if (iOrdinal == 3) {
                    hTTPResponse.e = new JSONArray(hTTPResponse.f14046a);
                    return hTTPResponse;
                }
            } catch (JSONException unused) {
            }
            return hTTPResponse;
        }
    }

    public static ArrayList a(Context context) {
        Intrinsics.h(context, "context");
        SharedPrefs sharedPrefs = new SharedPrefs(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HeaderParam(RequestBuilder.CONTENT_TYPE, "application/json"));
        String string = sharedPrefs.f14054a.getString("PREF_SDK_TOKEN", null);
        Intrinsics.e(string);
        arrayList.add(new HeaderParam("Authorization", string));
        return arrayList;
    }

    public static void b(Context context, RequestData requestData, RESPONSE_FORMATTER response_formatter, DNASpacesBackgroundExceptionHandler exceptionHandler, Function1 serviceHandler) {
        Intrinsics.h(context, "context");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        Intrinsics.h(serviceHandler, "serviceHandler");
        new RestCallWorker().execute(new RestParams(context, requestData, response_formatter, new Service$call$1(exceptionHandler, serviceHandler)));
    }

    public abstract void c(Context context, ArrayList arrayList, DNASpacesBackgroundExceptionHandler dNASpacesBackgroundExceptionHandler, Function1 function1);

    public void d(final Context context, final DNASpacesBackgroundExceptionHandler exceptionHandler, final Function1 function1) throws TokenEmptyException {
        Intrinsics.h(context, "context");
        Intrinsics.h(exceptionHandler, "exceptionHandler");
        Utils.e(context, exceptionHandler, new Function0<Unit>(context, exceptionHandler, function1) { // from class: com.cisco.or.sdk.services.Service$start$1
            public final /* synthetic */ Context i;
            public final /* synthetic */ DNASpacesBackgroundExceptionHandler j;
            public final /* synthetic */ Lambda k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.k = (Lambda) function1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Context context2 = this.i;
                this.h.c(context2, Service.a(context2), this.j, this.k);
                return Unit.f24250a;
            }
        });
    }
}
