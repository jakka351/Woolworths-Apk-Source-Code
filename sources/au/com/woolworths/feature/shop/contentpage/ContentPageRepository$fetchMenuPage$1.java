package au.com.woolworths.feature.shop.contentpage;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.contentpage.ContentPageRepository", f = "ContentPageRepository.kt", l = {147}, m = "fetchMenuPage")
/* loaded from: classes3.dex */
final class ContentPageRepository$fetchMenuPage$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ContentPageRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentPageRepository$fetchMenuPage$1(ContentPageRepository contentPageRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = contentPageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d(null, null, null, this);
    }
}
