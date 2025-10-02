package au.com.woolworths.shop.lists.ui.lists.suggested;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.data.SuggestedListsInteractor;
import au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions;
import au.com.woolworths.shop.lists.ui.lists.errors.SuggestedListsFullPageError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel$fetchSuggestedLists$1", f = "SuggestedListsViewModel.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SuggestedListsViewModel$fetchSuggestedLists$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SuggestedListsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedListsViewModel$fetchSuggestedLists$1(SuggestedListsViewModel suggestedListsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = suggestedListsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestedListsViewModel$fetchSuggestedLists$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestedListsViewModel$fetchSuggestedLists$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final SuggestedListsViewModel suggestedListsViewModel = this.q;
        MediatorLiveData mediatorLiveData = suggestedListsViewModel.l;
        AnalyticsManager analyticsManager = suggestedListsViewModel.f;
        final SuggestedListsInteractor suggestedListsInteractor = suggestedListsViewModel.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            if (suggestedListsViewModel.h.c(ShoppingListsFeature.h)) {
                suggestedListsInteractor.getClass();
                Flow flowA = CachedPagingDataKt.a(FlowKt.r(new Pager(new PagingConfig(20, 0, 0, 62, false), new Function0() { // from class: au.com.woolworths.shop.lists.data.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new SuggestedListItemPagingSource(suggestedListsInteractor.f12262a);
                    }
                }).f3571a), ViewModelKt.a(suggestedListsViewModel));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel$fetchSuggestedLists$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        suggestedListsViewModel.k.setValue((PagingData) obj2);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                try {
                    suggestedListsInteractor.a();
                } catch (NoConnectivityException unused) {
                    analyticsManager.c(SuggestedListsActions.e);
                    SuggestedListsViewModel.r6(suggestedListsViewModel, mediatorLiveData, false, SuggestedListsFullPageError.e, 1);
                } catch (ServerErrorException unused2) {
                    analyticsManager.c(SuggestedListsActions.f);
                    SuggestedListsViewModel.r6(suggestedListsViewModel, mediatorLiveData, false, SuggestedListsFullPageError.d, 1);
                }
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
