package au.com.woolworths.feature.shop.storelocator.legacy;

import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel$saveInStoreLocation$1", f = "StoreLocatorViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoreLocatorViewModel$saveInStoreLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ StoreLocatorViewModel q;
    public final /* synthetic */ StoreLocatorResult.Store r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreLocatorViewModel$saveInStoreLocation$1(StoreLocatorViewModel storeLocatorViewModel, StoreLocatorResult.Store store, Continuation continuation) {
        super(2, continuation);
        this.q = storeLocatorViewModel;
        this.r = store;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreLocatorViewModel$saveInStoreLocation$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreLocatorViewModel$saveInStoreLocation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StoreLocatorViewModel storeLocatorViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = storeLocatorViewModel.k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl = storeLocatorViewModel.e;
                StoreLocatorResult.Store store = this.r;
                this.p = 1;
                if (legacyStoreLocatorInteractorImpl.a(store, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            sharedFlowImpl.f(StoreLocatorContract.Actions.CompleteSetStoreLocation.f8156a);
        } catch (NoConnectivityException unused) {
            sharedFlowImpl.f(new StoreLocatorContract.Actions.ShowSnackbarMessage(com.woolworths.R.string.error_no_network));
        } catch (RuntimeException unused2) {
            sharedFlowImpl.f(new StoreLocatorContract.Actions.ShowSnackbarMessage(com.woolworths.R.string.set_store_fail_message));
        }
        return Unit.f24250a;
    }
}
