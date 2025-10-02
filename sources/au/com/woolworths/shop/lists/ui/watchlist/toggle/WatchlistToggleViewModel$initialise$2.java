package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferencesData;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$initialise$2", f = "WatchlistToggleViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WatchlistToggleViewModel$initialise$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WatchlistToggleViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistToggleViewModel$initialise$2(WatchlistToggleViewModel watchlistToggleViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = watchlistToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WatchlistToggleViewModel$initialise$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((WatchlistToggleViewModel$initialise$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final WatchlistToggleViewModel watchlistToggleViewModel = this.q;
            SharedFlow sharedFlow = watchlistToggleViewModel.f.c;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$initialise$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    WatchlistToggleViewModel watchlistToggleViewModel2 = watchlistToggleViewModel;
                    watchlistToggleViewModel2.n = (PreferencesData) obj2;
                    CompletableDeferred completableDeferred = watchlistToggleViewModel2.o;
                    Unit unit = Unit.f24250a;
                    completableDeferred.h(unit);
                    BuildersKt.c(ViewModelKt.a(watchlistToggleViewModel2), null, null, new WatchlistToggleViewModel$checkForPermissionsAndToggles$1(watchlistToggleViewModel2, null), 3);
                    return unit;
                }
            };
            this.p = 1;
            if (sharedFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
