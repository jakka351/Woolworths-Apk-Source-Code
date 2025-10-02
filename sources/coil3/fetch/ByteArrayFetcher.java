package coil3.fetch;

import coil3.RealImageLoader;
import coil3.decode.DataSource;
import coil3.decode.SourceImageSource;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ByteArrayFetcher;", "Lcoil3/fetch/Fetcher;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ByteArrayFetcher implements Fetcher {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13092a;
    public final Options b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/fetch/ByteArrayFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<byte[]> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher a(Object obj, Options options, RealImageLoader realImageLoader) {
            return new ByteArrayFetcher((byte[]) obj, options);
        }
    }

    public ByteArrayFetcher(byte[] bArr, Options options) {
        this.f13092a = bArr;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object a(Continuation continuation) {
        Buffer buffer = new Buffer();
        buffer.m599write(this.f13092a);
        return new SourceFetchResult(new SourceImageSource(buffer, this.b.f, null), null, DataSource.e);
    }
}
