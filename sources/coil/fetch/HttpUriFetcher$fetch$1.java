package coil.fetch;

import coil.disk.DiskCache;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
/* loaded from: classes4.dex */
final class HttpUriFetcher$fetch$1 extends ContinuationImpl {
    public HttpUriFetcher p;
    public DiskCache.Snapshot q;
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ HttpUriFetcher t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$fetch$1(HttpUriFetcher httpUriFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(this);
    }
}
