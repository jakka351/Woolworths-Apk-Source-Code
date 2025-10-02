package coil3;

import coil3.request.ImageRequest;
import coil3.request.RequestDelegate;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {116, 128, 132}, m = "execute")
/* loaded from: classes.dex */
final class RealImageLoader$execute$3 extends ContinuationImpl {
    public RealImageLoader p;
    public RequestDelegate q;
    public ImageRequest r;
    public EventListener s;
    public Image t;
    public /* synthetic */ Object u;
    public final /* synthetic */ RealImageLoader v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(RealImageLoader realImageLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        int i = RealImageLoader.f;
        return this.v.c(null, 0, this);
    }
}
