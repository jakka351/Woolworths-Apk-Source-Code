package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {61, 74, 102}, m = "fetch")
/* loaded from: classes.dex */
final class NetworkFetcher$fetch$1 extends ContinuationImpl {
    public Object p;
    public Ref.ObjectRef q;
    public Ref.ObjectRef r;
    public /* synthetic */ Object s;
    public final /* synthetic */ NetworkFetcher t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(NetworkFetcher networkFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(this);
    }
}
