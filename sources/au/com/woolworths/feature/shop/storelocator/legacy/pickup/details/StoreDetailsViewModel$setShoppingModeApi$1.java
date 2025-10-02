package au.com.woolworths.feature.shop.storelocator.legacy.pickup.details;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel", f = "StoreDetailsViewModel.kt", l = {166}, m = "setShoppingModeApi")
/* loaded from: classes3.dex */
final class StoreDetailsViewModel$setShoppingModeApi$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ StoreDetailsViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreDetailsViewModel$setShoppingModeApi$1(StoreDetailsViewModel storeDetailsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = storeDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return StoreDetailsViewModel.p6(this.q, null, null, this);
    }
}
