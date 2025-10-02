package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityContract;
import au.com.woolworths.foundation.shop.olive.voice.SearchResult;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.Status;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1", f = "ComposeProductListActivityViewModel.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LiveData q;
    public final /* synthetic */ ComposeProductListActivityViewModel r;
    public final /* synthetic */ c s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1(LiveData liveData, ComposeProductListActivityViewModel composeProductListActivityViewModel, c cVar, Continuation continuation) {
        super(2, continuation);
        this.q = liveData;
        this.r = composeProductListActivityViewModel;
        this.s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowA = FlowLiveDataConversions.a(this.q);
            final ComposeProductListActivityViewModel composeProductListActivityViewModel = this.r;
            final c cVar = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.legacy.ComposeProductListActivityViewModel$startSuccessSearchResultCollection$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    NetworkState networkState = (NetworkState) obj2;
                    if (networkState.f9174a == Status.e) {
                        ComposeProductListActivityViewModel composeProductListActivityViewModel2 = composeProductListActivityViewModel;
                        composeProductListActivityViewModel2.n = true;
                        if (((ComposeProductListActivityContract.ViewState) composeProductListActivityViewModel2.j.getValue()).f) {
                            Timber.f27013a.b("SearchResultsCollection SUCCESS networkState: " + networkState.f9174a, new Object[0]);
                            cVar.invoke(SearchResult.Success.f8814a);
                            composeProductListActivityViewModel2.p6(false);
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
