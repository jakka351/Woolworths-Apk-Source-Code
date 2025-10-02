package au.com.woolworths.shop.lists.data;

import au.com.woolworths.pagingutils.NumericPageData;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.data.repository.SuggestedListsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/pagingutils/NumericPageData;", "Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;", "nextPageKey", "", "<unused var>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.SuggestedListsInteractor$fetchSuggestedListsOld$1", f = "SuggestedListsInteractor.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SuggestedListsInteractor$fetchSuggestedListsOld$1 extends SuspendLambda implements Function3<Integer, Integer, Continuation<? super NumericPageData<SuggestedListItem>>, Object> {
    public int p;
    public /* synthetic */ Integer q;
    public final /* synthetic */ SuggestedListsInteractor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedListsInteractor$fetchSuggestedListsOld$1(SuggestedListsInteractor suggestedListsInteractor, Continuation continuation) {
        super(3, continuation);
        this.r = suggestedListsInteractor;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).intValue();
        SuggestedListsInteractor$fetchSuggestedListsOld$1 suggestedListsInteractor$fetchSuggestedListsOld$1 = new SuggestedListsInteractor$fetchSuggestedListsOld$1(this.r, (Continuation) obj3);
        suggestedListsInteractor$fetchSuggestedListsOld$1.q = (Integer) obj;
        return suggestedListsInteractor$fetchSuggestedListsOld$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Integer num = this.q;
        SuggestedListsRepository suggestedListsRepository = this.r.f12262a;
        Integer num2 = new Integer(20);
        this.p = 1;
        Object objA = suggestedListsRepository.a(num, num2, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
