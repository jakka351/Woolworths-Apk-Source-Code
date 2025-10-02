package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.io.InterruptedIOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class CacheWriter {

    /* renamed from: a, reason: collision with root package name */
    public long f2977a;
    public long b;
    public long c;
    public volatile boolean d;

    public interface ProgressListener {
    }

    public final void a() throws InterruptedIOException {
        if (!this.d) {
            throw null;
        }
        throw new InterruptedIOException();
    }
}
