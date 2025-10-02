package au.com.woolworths.android.onesite.network;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/NetworkExceptions;", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkExceptions {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f4572a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/network/NetworkExceptions$Companion;", "", "", "HTTP_I_AM_A_TEAPOT", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public NetworkExceptions(Gson gson) {
        Intrinsics.h(gson, "gson");
        this.f4572a = gson;
    }

    public static HttpException a(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        if (throwable instanceof HttpException) {
            return (HttpException) throwable;
        }
        if (throwable.getCause() instanceof HttpException) {
            return (HttpException) throwable.getCause();
        }
        return null;
    }

    public static boolean c(Throwable throwable) {
        Intrinsics.h(throwable, "throwable");
        HttpException httpExceptionA = a(throwable);
        return httpExceptionA != null && httpExceptionA.d == 400;
    }

    public final Object b(Throwable throwable, Class cls) {
        ResponseBody responseBody;
        Intrinsics.h(throwable, "throwable");
        HttpException httpExceptionA = a(throwable);
        if (httpExceptionA != null) {
            try {
                Response response = httpExceptionA.e;
                if (((response == null || (responseBody = response.c) == null) ? null : responseBody.U0()) != null) {
                    Intrinsics.e(response);
                    ResponseBody responseBody2 = response.c;
                    Intrinsics.e(responseBody2);
                    return this.f4572a.d(cls, responseBody2.d());
                }
            } catch (JsonSyntaxException e) {
                Timber.f27013a.f(e);
            } catch (IOException e2) {
                Timber.f27013a.f(e2);
            }
        }
        return null;
    }
}
