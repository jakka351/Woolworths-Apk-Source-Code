package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesInteractor", f = "YourGroceriesInteractor.kt", l = {12}, m = "fetchYourGroceries")
/* loaded from: classes3.dex */
final class YourGroceriesInteractor$fetchYourGroceries$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ YourGroceriesInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesInteractor$fetchYourGroceries$1(YourGroceriesInteractor yourGroceriesInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = yourGroceriesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, this);
    }
}
