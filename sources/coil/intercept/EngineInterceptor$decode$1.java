package coil.intercept;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.decode.Decoder;
import coil.fetch.SourceResult;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {199}, m = "decode")
/* loaded from: classes4.dex */
final class EngineInterceptor$decode$1 extends ContinuationImpl {
    public int A;
    public EngineInterceptor p;
    public SourceResult q;
    public ComponentRegistry r;
    public ImageRequest s;
    public Object t;
    public Options u;
    public EventListener v;
    public Decoder w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ EngineInterceptor z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.z = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return EngineInterceptor.b(this.z, null, null, null, null, null, null, this);
    }
}
