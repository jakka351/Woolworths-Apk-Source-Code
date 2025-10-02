package coil.intercept;

import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {122, 126, 144}, m = "execute")
/* loaded from: classes4.dex */
final class EngineInterceptor$execute$1 extends ContinuationImpl {
    public EngineInterceptor p;
    public ImageRequest q;
    public Object r;
    public Object s;
    public Ref.ObjectRef t;
    public Ref.ObjectRef u;
    public Ref.ObjectRef v;
    public Ref.ObjectRef w;
    public /* synthetic */ Object x;
    public final /* synthetic */ EngineInterceptor y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.y = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return EngineInterceptor.c(this.y, null, null, null, null, this);
    }
}
