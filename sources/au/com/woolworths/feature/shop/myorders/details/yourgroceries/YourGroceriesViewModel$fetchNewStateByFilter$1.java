package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel", f = "YourGroceriesViewModel.kt", l = {238, 251}, m = "fetchNewStateByFilter")
/* loaded from: classes3.dex */
final class YourGroceriesViewModel$fetchNewStateByFilter$1 extends ContinuationImpl {
    public Object p;
    public YourGroceriesContract.PaymentSummaryInfo q;
    public ArrayList r;
    public /* synthetic */ Object s;
    public final /* synthetic */ YourGroceriesViewModel t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourGroceriesViewModel$fetchNewStateByFilter$1(YourGroceriesViewModel yourGroceriesViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = yourGroceriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.q6(null, this);
    }
}
