package au.com.woolworths.shop.lists.ui.pastshops;

import au.com.woolworths.pagingutils.PageData;
import au.com.woolworths.shop.lists.data.PastShopInteractor;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/PageData;", "", "Lau/com/woolworths/shop/lists/data/model/PurchaseHistoryEvent;", "nextPageKey", "loadSize"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.pastshops.PastShopsViewModel$listResult$1$1", f = "PastShopsViewModel.kt", l = {59}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class PastShopsViewModel$listResult$1$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super PageData<Integer, PurchaseHistoryEvent>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public /* synthetic */ int r;
    public final /* synthetic */ PastShopsViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastShopsViewModel$listResult$1$1(PastShopsViewModel pastShopsViewModel, Continuation continuation) {
        super(3, continuation);
        this.s = pastShopsViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        PastShopsViewModel$listResult$1$1 pastShopsViewModel$listResult$1$1 = new PastShopsViewModel$listResult$1$1(this.s, (Continuation) obj3);
        pastShopsViewModel$listResult$1$1.q = (Integer) obj;
        pastShopsViewModel$listResult$1$1.r = iIntValue;
        return pastShopsViewModel$listResult$1$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        PastShopsViewModel pastShopsViewModel = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            Integer num = this.q;
            int i2 = this.r;
            PastShopInteractor pastShopInteractor = pastShopsViewModel.e;
            Integer num2 = new Integer(i2);
            this.p = 1;
            obj = pastShopInteractor.f12256a.a(num, num2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        PastShopsViewModel.p6(pastShopsViewModel, pastShopsViewModel.h, false, ((PurchaseHistoryList) obj).getD(), null, 5);
        return obj;
    }
}
