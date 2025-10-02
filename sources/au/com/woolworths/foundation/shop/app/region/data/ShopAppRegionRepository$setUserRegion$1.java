package au.com.woolworths.foundation.shop.app.region.data;

import au.com.woolworths.android.onesite.modules.common.Region;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository", f = "ShopAppRegionRepository.kt", l = {33}, m = "setUserRegion")
/* loaded from: classes4.dex */
final class ShopAppRegionRepository$setUserRegion$1 extends ContinuationImpl {
    public Region p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShopAppRegionRepository r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopAppRegionRepository$setUserRegion$1(ShopAppRegionRepository shopAppRegionRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = shopAppRegionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
