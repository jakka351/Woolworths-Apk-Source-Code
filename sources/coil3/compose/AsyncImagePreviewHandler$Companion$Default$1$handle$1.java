package coil3.compose;

import coil3.request.ImageRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", l = {37}, m = "handle")
/* loaded from: classes4.dex */
final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends ContinuationImpl {
    public ImageRequest p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AsyncImagePreviewHandler$Companion$Default$1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePreviewHandler$Companion$Default$1$handle$1(AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = asyncImagePreviewHandler$Companion$Default$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
