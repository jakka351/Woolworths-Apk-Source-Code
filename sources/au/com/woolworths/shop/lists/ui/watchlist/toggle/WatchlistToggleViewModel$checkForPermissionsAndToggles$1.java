package au.com.woolworths.shop.lists.ui.watchlist.toggle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleViewModel$checkForPermissionsAndToggles$1", f = "WatchlistToggleViewModel.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WatchlistToggleViewModel$checkForPermissionsAndToggles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public WatchlistToggleViewModel p;
    public Object q;
    public int r;
    public final /* synthetic */ WatchlistToggleViewModel s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistToggleViewModel$checkForPermissionsAndToggles$1(WatchlistToggleViewModel watchlistToggleViewModel, Continuation continuation) {
        super(2, continuation);
        this.s = watchlistToggleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WatchlistToggleViewModel$checkForPermissionsAndToggles$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WatchlistToggleViewModel$checkForPermissionsAndToggles$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WatchlistToggleViewModel watchlistToggleViewModel;
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            WatchlistToggleViewModel watchlistToggleViewModel2 = this.s;
            MutableStateFlow mutableStateFlow2 = watchlistToggleViewModel2.k;
            this.p = watchlistToggleViewModel2;
            this.q = mutableStateFlow2;
            this.r = 1;
            Object objQ6 = watchlistToggleViewModel2.q6(this);
            if (objQ6 == coroutineSingletons) {
                return coroutineSingletons;
            }
            watchlistToggleViewModel = watchlistToggleViewModel2;
            mutableStateFlow = mutableStateFlow2;
            obj = objQ6;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableStateFlow mutableStateFlow3 = (MutableStateFlow) this.q;
            WatchlistToggleViewModel watchlistToggleViewModel3 = this.p;
            ResultKt.b(obj);
            mutableStateFlow = mutableStateFlow3;
            watchlistToggleViewModel = watchlistToggleViewModel3;
        }
        WatchlistToggleViewModel.r6(watchlistToggleViewModel, mutableStateFlow, null, ((Boolean) obj).booleanValue(), false, 5);
        return Unit.f24250a;
    }
}
