package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
/* loaded from: classes.dex */
final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {
    public Object p;
    public Object q;
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ NetworkFetcher t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(NetworkFetcher networkFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return NetworkFetcher.c(this.t, null, null, null, null, this);
    }
}
