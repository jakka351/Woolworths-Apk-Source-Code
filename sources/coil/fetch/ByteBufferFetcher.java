package coil.fetch;

import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/fetch/ByteBufferFetcher;", "Lcoil/fetch/Fetcher;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ByteBufferFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f12987a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/fetch/ByteBufferFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/nio/ByteBuffer;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<ByteBuffer> {
        @Override // coil.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options) {
            return new ByteBufferFetcher((ByteBuffer) obj, options);
        }
    }

    public ByteBufferFetcher(ByteBuffer byteBuffer, Options options) {
        this.f12987a = byteBuffer;
        this.b = options;
    }

    @Override // coil.fetch.Fetcher
    public final Object a(Continuation continuation) {
        ByteBuffer byteBuffer = this.f12987a;
        try {
            Buffer buffer = new Buffer();
            buffer.write(byteBuffer);
            byteBuffer.position(0);
            return new SourceResult(ImageSources.a(buffer, this.b.f13021a), null, DataSource.e);
        } catch (Throwable th) {
            byteBuffer.position(0);
            throw th;
        }
    }
}
