package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;
import okio.RealBufferedSink;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/GzipRequestBody;", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GzipRequestBody extends RequestBody {
    @Override // okhttp3.RequestBody
    public final long a() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getD() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final boolean c() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void d(BufferedSink bufferedSink) {
        RealBufferedSink realBufferedSinkB = Okio.b(new GzipSink(bufferedSink));
        try {
            throw null;
        } finally {
        }
    }
}
