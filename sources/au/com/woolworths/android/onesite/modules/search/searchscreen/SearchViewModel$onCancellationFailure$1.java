package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewModel$onCancellationFailure$1", f = "SearchViewModel.kt", l = {301}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SearchViewModel$onCancellationFailure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SearchViewModel q;
    public final /* synthetic */ Text r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$onCancellationFailure$1(SearchViewModel searchViewModel, Text text, Continuation continuation) {
        super(2, continuation);
        this.q = searchViewModel;
        this.r = text;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchViewModel$onCancellationFailure$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchViewModel$onCancellationFailure$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        SearchViewModel searchViewModel = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            searchViewModel.h.c(new EditOrderActions.CancellationFailure(SearchScreens.d));
            SharedFlowImpl sharedFlowImpl = searchViewModel.u;
            SearchContract.Actions.ShowSnackbarMessage showSnackbarMessage = new SearchContract.Actions.ShowSnackbarMessage(this.r);
            this.p = 1;
            if (sharedFlowImpl.emit(showSnackbarMessage, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        MutableLiveData mutableLiveData = searchViewModel.w;
        SearchContract.ViewState viewState = (SearchContract.ViewState) mutableLiveData.e();
        mutableLiveData.m(viewState != null ? SearchContract.ViewState.a(viewState, false) : null);
        return Unit.f24250a;
    }
}
