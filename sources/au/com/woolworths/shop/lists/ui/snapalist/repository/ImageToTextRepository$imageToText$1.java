package au.com.woolworths.shop.lists.ui.snapalist.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.snapalist.repository.ImageToTextRepository", f = "ImageToTextRepository.kt", l = {18}, m = "imageToText")
/* loaded from: classes4.dex */
final class ImageToTextRepository$imageToText$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ImageToTextRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageToTextRepository$imageToText$1(ImageToTextRepository imageToTextRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = imageToTextRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
