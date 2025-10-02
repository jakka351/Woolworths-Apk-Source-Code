package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.paging.compose.LazyPagingItems;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.compose.SuggestedListScreenKt$SuggestedListScreen$1$5$1", f = "SuggestedListScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SuggestedListScreenKt$SuggestedListScreen$1$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SuggestedListsViewModel p;
    public final /* synthetic */ LazyPagingItems q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedListScreenKt$SuggestedListScreen$1$5$1(LazyPagingItems lazyPagingItems, SuggestedListsViewModel suggestedListsViewModel, Continuation continuation) {
        super(2, continuation);
        this.p = suggestedListsViewModel;
        this.q = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestedListScreenKt$SuggestedListScreen$1$5$1(this.q, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SuggestedListScreenKt$SuggestedListScreen$1$5$1 suggestedListScreenKt$SuggestedListScreen$1$5$1 = (SuggestedListScreenKt$SuggestedListScreen$1$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        suggestedListScreenKt$SuggestedListScreen$1$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.p.p6(SuggestedListScreenKt.b(this.q));
        return Unit.f24250a;
    }
}
