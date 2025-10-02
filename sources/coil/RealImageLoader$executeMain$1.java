package coil;

import android.graphics.Bitmap;
import coil.request.ImageRequest;
import coil.request.RequestDelegate;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {166, 178, 182}, m = "executeMain")
/* loaded from: classes4.dex */
final class RealImageLoader$executeMain$1 extends ContinuationImpl {
    public RealImageLoader p;
    public RequestDelegate q;
    public ImageRequest r;
    public EventListener s;
    public Bitmap t;
    public /* synthetic */ Object u;
    public final /* synthetic */ RealImageLoader v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$1(RealImageLoader realImageLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.v = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return RealImageLoader.c(this.v, null, 0, this);
    }
}
