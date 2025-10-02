package okhttp3.sse.internal;

import au.com.woolworths.graphql.subscriptions.sse.channel.DefaultMainChannel$createListener$1;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal.connection.RealCall$timeout$1;
import okhttp3.sse.EventSource;
import okhttp3.sse.internal.ServerSentEventReader;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/sse/internal/RealEventSource;", "Lokhttp3/sse/EventSource;", "Lokhttp3/sse/internal/ServerSentEventReader$Callback;", "Lokhttp3/Callback;", "okhttp-sse"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {
    public final Request d;
    public final DefaultMainChannel$createListener$1 e;
    public Call f;
    public volatile boolean g;

    public RealEventSource(Request request, DefaultMainChannel$createListener$1 defaultMainChannel$createListener$1) {
        this.d = request;
        this.e = defaultMainChannel$createListener$1;
    }

    @Override // okhttp3.sse.EventSource
    public final void cancel() {
        this.g = true;
        Call call = this.f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.e.a(this, iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        RealCall$timeout$1 i;
        try {
            if (!response.s) {
                this.e.a(this, null);
                response.close();
                return;
            }
            ResponseBody responseBody = response.j;
            MediaType g = responseBody.getG();
            if (g != null && g.b.equals(TextBundle.TEXT_ENTRY) && g.c.equals("event-stream")) {
                Call call2 = this.f;
                if (call2 != null && (i = call2.getI()) != null) {
                    i.a();
                }
                UnreadableResponseBodyKt.a(response);
                ServerSentEventReader serverSentEventReader = new ServerSentEventReader(responseBody.U0(), this);
                try {
                    if (!this.g) {
                        while (!this.g && serverSentEventReader.a()) {
                        }
                    }
                    if (this.g) {
                        this.e.a(this, new IOException("canceled"));
                    } else {
                        this.e.f9040a.y(null);
                    }
                    response.close();
                    return;
                } catch (Exception e) {
                    e = e;
                    if (this.g) {
                        e = new IOException("canceled", e);
                    }
                    this.e.a(this, e);
                    response.close();
                    return;
                }
            }
            this.e.a(this, new IllegalStateException("Invalid content-type: " + responseBody.getG()));
            response.close();
        } finally {
        }
    }
}
