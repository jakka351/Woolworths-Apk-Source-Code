package coil.fetch;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.CacheControl;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {BERTags.FLAGS}, m = "executeNetworkRequest")
/* loaded from: classes4.dex */
final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ HttpUriFetcher q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$executeNetworkRequest$1(HttpUriFetcher httpUriFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        CacheControl cacheControl = HttpUriFetcher.f;
        return this.q.b(null, this);
    }
}
