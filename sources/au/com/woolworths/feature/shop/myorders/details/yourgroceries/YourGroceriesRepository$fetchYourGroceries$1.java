package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesRepository", f = "YourGroceriesRepository.kt", l = {34}, m = "fetchYourGroceries")
/* loaded from: classes3.dex */
final class YourGroceriesRepository$fetchYourGroceries$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ YourGroceriesRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesRepository$fetchYourGroceries$1(YourGroceriesRepository yourGroceriesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = yourGroceriesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
