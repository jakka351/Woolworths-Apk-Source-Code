package au.com.woolworths.base.shopapp.modules.collectionmode;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.shopapp.modules.collectionmode.CollectionModeRepository", f = "CollectionModeRepository.kt", l = {85}, m = "fetchShoppingModeVariantData")
/* loaded from: classes3.dex */
final class CollectionModeRepository$fetchShoppingModeVariantData$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CollectionModeRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionModeRepository$fetchShoppingModeVariantData$1(CollectionModeRepository collectionModeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = collectionModeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, this);
    }
}
