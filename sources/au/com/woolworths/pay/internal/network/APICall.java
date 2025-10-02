package au.com.woolworths.pay.internal.network;

import android.os.Handler;
import android.os.Looper;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.HTTPNotOkError;
import au.com.woolworths.pay.sdk.models.errors.InvalidJSONError;
import au.com.woolworths.pay.sdk.models.errors.InvalidModelError;
import au.com.woolworths.pay.sdk.models.errors.NetworkError;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class APICall<T> {
    public static final Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final APIRequest f9178a;
    public final Object b;

    /* renamed from: au.com.woolworths.pay.internal.network.APICall$1, reason: invalid class name */
    class AnonymousClass1 implements HttpResponseCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ APICallback f9179a;

        /* renamed from: au.com.woolworths.pay.internal.network.APICall$1$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public AnonymousClass1(APICallback aPICallback, APICall aPICall) {
            this.f9179a = aPICallback;
        }

        public final void a(String str, Map map, int i) {
            final BaseError invalidJSONError;
            APIResponse aPIResponse;
            final Boolean bool = Boolean.FALSE;
            final APIResponse aPIResponse2 = null;
            if (i < 400) {
                try {
                    aPIResponse = new APIResponse(i, map, JSONHelper.c(APICall.this.b.getClass(), new JSONObject(str)), null);
                    invalidJSONError = null;
                    aPIResponse2 = aPIResponse;
                } catch (NoSuchFieldException e) {
                    invalidJSONError = new InvalidModelError(e.getLocalizedMessage());
                } catch (Throwable th) {
                    invalidJSONError = new InvalidJSONError(th.getLocalizedMessage());
                }
            } else if (str == null || str.length() == 0) {
                invalidJSONError = new HTTPNotOkError(Integer.valueOf(i), "HTTP status code > 400 but no error info provided");
            } else {
                try {
                    APIError aPIError = (APIError) JSONHelper.c(APIError.class, new JSONObject(str));
                    if (i == 401 && aPIError.getErrorCode().equals("AP02")) {
                        bool = Boolean.TRUE;
                        aPIResponse = null;
                    } else {
                        aPIResponse = new APIResponse(i, map, null, aPIError);
                    }
                    invalidJSONError = null;
                    aPIResponse2 = aPIResponse;
                } catch (Throwable th2) {
                    invalidJSONError = new InvalidJSONError(th2.getLocalizedMessage());
                }
            }
            APICall.c.post(new Runnable() { // from class: au.com.woolworths.pay.internal.network.APICall.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    APICallback aPICallback = AnonymousClass1.this.f9179a;
                    if (bool.booleanValue()) {
                        aPICallback.a();
                        return;
                    }
                    APIResponse aPIResponse3 = aPIResponse2;
                    if (aPIResponse3 == null) {
                        aPICallback.b(invalidJSONError);
                        return;
                    }
                    int i2 = aPIResponse3.f9180a;
                    if (i2 < 400) {
                        aPICallback.c(aPIResponse3);
                    } else {
                        aPICallback.b(new HTTPNotOkError(Integer.valueOf(i2), aPIResponse3.d.getErrorMessage()));
                    }
                }
            });
        }
    }

    public APICall(APIRequest aPIRequest, Object obj) {
        this.f9178a = aPIRequest;
        this.b = obj;
    }

    public final void a(HttpClient httpClient, APICallback aPICallback) {
        APIRequest aPIRequest = this.f9178a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aPICallback, this);
        try {
            Map<String, List<String>> headers = aPIRequest.getHeaders();
            if (!aPIRequest.getMethod().equals("GET") || aPIRequest.getData() == null) {
                httpClient.c(aPIRequest.getMethod(), aPIRequest.getRelativePath(), headers, aPIRequest.getData(), anonymousClass1);
            } else {
                aPICallback.b(new NetworkError("Invalid HTTP request. The body cannot be present in a GET request."));
            }
        } catch (JSONEncodingException e) {
            aPICallback.b(new InvalidJSONError("Unable to marshall JSON: " + e.getLocalizedMessage()));
        } catch (InvalidKeyException e2) {
            e = e2;
            aPICallback.b(new NetworkError("Unable to create HMAC signature: " + e.getLocalizedMessage()));
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            aPICallback.b(new NetworkError("Unable to create HMAC signature: " + e.getLocalizedMessage()));
        }
    }
}
