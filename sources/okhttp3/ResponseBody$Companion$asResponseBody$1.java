package okhttp3;

import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSource;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    public final /* synthetic */ MediaType g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Buffer i;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, Buffer buffer) {
        this.g = mediaType;
        this.h = j;
        this.i = buffer;
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource U0() {
        return this.i;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: b, reason: from getter */
    public final long getH() {
        return this.h;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: c, reason: from getter */
    public final MediaType getG() {
        return this.g;
    }
}
