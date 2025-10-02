package au.com.woolworths.shop.lists.ui.lists.mylists;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor;
import au.com.woolworths.shop.lists.data.sync.SyncResult;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel$refreshLists$1", f = "MyListsViewModel.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MyListsViewModel$refreshLists$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MyListsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListsViewModel$refreshLists$1(MyListsViewModel myListsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = myListsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyListsViewModel$refreshLists$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyListsViewModel$refreshLists$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MyListsViewModel myListsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = myListsViewModel.o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    ShoppingListSyncInteractor shoppingListSyncInteractor = myListsViewModel.e;
                    this.p = 1;
                    obj = shoppingListSyncInteractor.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                if (((SyncResult) obj) instanceof SyncResult.Failure) {
                    sharedFlowImpl.f(new MyListsContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_unable_to_refresh_error_message)));
                }
            } catch (NoConnectivityException e) {
                Timber.f27013a.p(e);
                sharedFlowImpl.f(new MyListsContract.Actions.ShowSnackbar(new ResText(R.string.shop_lists_network_error_message)));
            }
            MyListsViewModel.s6(myListsViewModel, myListsViewModel.q, false, null, null, false, 29);
            return Unit.f24250a;
        } catch (Throwable th) {
            MyListsViewModel.s6(myListsViewModel, myListsViewModel.q, false, null, null, false, 29);
            throw th;
        }
    }
}
