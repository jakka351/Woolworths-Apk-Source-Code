package coil3.fetch;

import coil3.RealImageLoader;
import coil3.decode.ByteBufferMetadata;
import coil3.decode.DataSource;
import coil3.decode.SourceImageSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Buffer;
import okio.Okio;
import okio.Source;
import okio.Timeout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ByteBufferFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ByteBufferFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f13093a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ByteBufferFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Ljava/nio/ByteBuffer;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<ByteBuffer> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            return new ByteBufferFetcher((ByteBuffer) obj, options);
        }
    }

    public ByteBufferFetcher(ByteBuffer byteBuffer, Options options) {
        this.f13093a = byteBuffer;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        final ByteBuffer byteBuffer = this.f13093a;
        return new SourceFetchResult(new SourceImageSource(Okio.c(new Source(byteBuffer) { // from class: coil3.fetch.ByteBufferFetcherKt$asSource$1
            public final ByteBuffer d;
            public final int e;

            {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                this.d = byteBufferSlice;
                this.e = byteBufferSlice.capacity();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // okio.Source
            /* renamed from: n */
            public final Timeout getE() {
                return Timeout.e;
            }

            @Override // okio.Source
            public final long q2(Buffer buffer, long j) {
                ByteBuffer byteBuffer2 = this.d;
                int iPosition = byteBuffer2.position();
                int i = this.e;
                if (iPosition == i) {
                    return -1L;
                }
                int iPosition2 = (int) (byteBuffer2.position() + j);
                if (iPosition2 <= i) {
                    i = iPosition2;
                }
                byteBuffer2.limit(i);
                return buffer.write(byteBuffer2);
            }
        }), this.b.f, new ByteBufferMetadata(byteBuffer)), null, DataSource.e);
    }
}
