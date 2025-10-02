package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    public final String g;
    public final long h;
    public final RealBufferedSource i;

    public RealResponseBody(String str, long j, RealBufferedSource realBufferedSource) {
        this.g = str;
        this.h = j;
        this.i = realBufferedSource;
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
    /* renamed from: c */
    public final MediaType getG() {
        String str = this.g;
        if (str == null) {
            return null;
        }
        MediaType.e.getClass();
        try {
            return MediaType.Companion.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
