package au.com.woolworths.graphql.subscriptions.sse.channel;

import YU.a;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.rest.RequestBuilder;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/channel/DefaultSideChannel;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$SideChannel;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class DefaultSideChannel implements ChannelFactory.SideChannel {

    /* renamed from: a, reason: collision with root package name */
    public final String f9041a;
    public final OkHttpClient b;
    public final Gson c;

    public DefaultSideChannel(String sideChannelUrl, OkHttpClient okHttpClient, Gson gson) {
        Intrinsics.h(sideChannelUrl, "sideChannelUrl");
        Intrinsics.h(okHttpClient, "okHttpClient");
        Intrinsics.h(gson, "gson");
        this.f9041a = sideChannelUrl;
        this.b = okHttpClient;
        this.c = gson;
    }

    @Override // au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.SideChannel
    public final SseTransportMessage.Response a(SseTransportMessage.Request request) throws IOException {
        RequestBody.Companion companion = RequestBody.f26692a;
        Gson gson = this.c;
        String strJ = gson.j(request);
        Intrinsics.g(strJ, "toJson(...)");
        MediaType.e.getClass();
        MediaType mediaTypeA = MediaType.Companion.a("application/json");
        companion.getClass();
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3B = RequestBody.Companion.b(strJ, mediaTypeA);
        Request.Builder builder = new Request.Builder();
        builder.c(RequestBuilder.CONTENT_TYPE, "application/json");
        builder.h(this.f9041a);
        builder.f(requestBody$Companion$toRequestBody$3B);
        Response responseExecute = FirebasePerfOkHttpClient.execute(this.b.a(new Request(builder)));
        if (!responseExecute.s) {
            throw new DefaultApolloException("Side channel status code is " + responseExecute.g + " (type=" + request.getType() + ")", null);
        }
        String type = request.getType();
        ResponseBody responseBody = responseExecute.j;
        String strD = responseBody != null ? responseBody.d() : null;
        String strB = Response.b(RequestBuilder.CONTENT_TYPE, responseExecute);
        String strH = (strD == null || strD.length() == 0) ? a.h("Expected Content type json for side channel response, got empty data (type=", type, ")") : (strB == null || StringsKt.W(strB, "application/json", true)) ? null : "Expected Content type json for side channel response, got '%s' / data = '%s'";
        if (strH != null) {
            throw new DefaultApolloException(strH, null);
        }
        Object objD = gson.d(SseTransportMessage.Response.class, strD);
        Intrinsics.g(objD, "fromJson(...)");
        return (SseTransportMessage.Response) objD;
    }
}
