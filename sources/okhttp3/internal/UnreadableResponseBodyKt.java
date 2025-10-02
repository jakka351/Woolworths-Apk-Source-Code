package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        Intrinsics.h(response, "<this>");
        Response.Builder builderC = response.c();
        ResponseBody responseBody = response.j;
        builderC.g = new UnreadableResponseBody(responseBody.getG(), responseBody.getH());
        return builderC.a();
    }
}
