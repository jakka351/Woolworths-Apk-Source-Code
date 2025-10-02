package okhttp3;

import kotlin.Metadata;
import okio.BufferedSink;
import okio.ByteString;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ ByteString c;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, ByteString byteString) {
        this.b = mediaType;
        this.c = byteString;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.c.c();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b, reason: from getter */
    public final MediaType getB() {
        return this.b;
    }

    @Override // okhttp3.RequestBody
    public final void d(BufferedSink bufferedSink) {
        bufferedSink.S0(this.c);
    }
}
