package coil.intercept;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.fetch.Fetcher;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
/* loaded from: classes4.dex */
final class EngineInterceptor$fetch$1 extends ContinuationImpl {
    public EngineInterceptor p;
    public ComponentRegistry q;
    public ImageRequest r;
    public Object s;
    public Options t;
    public EventListener u;
    public Fetcher v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ EngineInterceptor y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.y = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.d(null, null, null, null, null, this);
    }
}
