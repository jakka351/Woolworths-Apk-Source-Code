package au.com.woolworths.foundation.shop.collectionmode;

import au.com.woolworths.base.shopapp.modules.collectionmode.data.ShoppingModeVariantStateData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl", f = "CollectionModeInteractorImpl.kt", l = {212}, m = "fetchShoppingModeVariantData")
/* loaded from: classes4.dex */
final class CollectionModeInteractorImpl$fetchShoppingModeVariantData$1 extends ContinuationImpl {
    public ShoppingModeVariantStateData p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CollectionModeInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionModeInteractorImpl$fetchShoppingModeVariantData$1(CollectionModeInteractorImpl collectionModeInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = collectionModeInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.L(this);
    }
}
