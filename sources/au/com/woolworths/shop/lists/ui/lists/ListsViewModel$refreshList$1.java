package au.com.woolworths.shop.lists.ui.lists;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.ListsViewModel$refreshList$1", f = "ListsViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ListsViewModel$refreshList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ListsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsViewModel$refreshList$1(ListsViewModel listsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = listsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ListsViewModel$refreshList$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ListsViewModel$refreshList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ShoppingListSyncInteractor shoppingListSyncInteractor = this.q.f;
                this.p = 1;
                if (shoppingListSyncInteractor.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (NoConnectivityException e) {
            Timber.f27013a.p(e);
        }
        return Unit.f24250a;
    }
}
