package coil3.compose;

import coil3.request.ImageRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1", f = "LocalAsyncImagePreviewHandler.kt", l = {52}, m = "handle")
/* loaded from: classes4.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 extends ContinuationImpl {
    public ImageRequest p;
    public /* synthetic */ Object q;
    public final /* synthetic */ LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1(LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, null, this);
    }
}
