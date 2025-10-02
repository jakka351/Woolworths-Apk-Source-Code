package au.com.woolworths.android.onesite.modules.search.searchscreen;

import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$observeTrafficDriversState$1", f = "SearchActivity.kt", l = {366}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SearchActivity$observeTrafficDriversState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SearchActivity q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchActivity$observeTrafficDriversState$1(SearchActivity searchActivity, Continuation continuation) {
        super(2, continuation);
        this.q = searchActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchActivity$observeTrafficDriversState$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchActivity$observeTrafficDriversState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final SearchActivity searchActivity = this.q;
            TrafficDriversInteractor trafficDriversInteractor = searchActivity.D;
            if (trafficDriversInteractor == null) {
                Intrinsics.p("trafficDriversInteractor");
                throw null;
            }
            Flow flowR = FlowKt.r(FlowExtKt.a(trafficDriversInteractor.c, searchActivity.getD(), Lifecycle.State.h));
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$observeTrafficDriversState$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SearchActivity searchActivity2 = searchActivity;
                    SearchView searchView = searchActivity2.H;
                    if (searchView != null) {
                        searchActivity2.onQueryTextChange(searchView.getQuery().toString());
                        return Unit.f24250a;
                    }
                    Intrinsics.p("searchView");
                    throw null;
                }
            };
            this.p = 1;
            if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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
