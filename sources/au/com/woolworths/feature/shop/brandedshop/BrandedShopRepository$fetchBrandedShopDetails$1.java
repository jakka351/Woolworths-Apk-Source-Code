package au.com.woolworths.feature.shop.brandedshop;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.BrandedShopRepository", f = "BrandedShopRepository.kt", l = {54}, m = "fetchBrandedShopDetails")
/* loaded from: classes3.dex */
final class BrandedShopRepository$fetchBrandedShopDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BrandedShopRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandedShopRepository$fetchBrandedShopDetails$1(BrandedShopRepository brandedShopRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = brandedShopRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, null, this);
    }
}
