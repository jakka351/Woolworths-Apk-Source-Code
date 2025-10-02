package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/UnreadableResponseBody;", "Lokhttp3/ResponseBody;", "Lokio/Source;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnreadableResponseBody extends ResponseBody implements Source {
    public final MediaType g;
    public final long h;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.g = mediaType;
        this.h = j;
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource U0() {
        return Okio.c(this);
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

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Source
    /* renamed from: n */
    public final Timeout getE() {
        return Timeout.e;
    }

    @Override // okio.Source
    public final long q2(Buffer sink, long j) {
        Intrinsics.h(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }
}
