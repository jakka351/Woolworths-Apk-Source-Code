package au.com.woolworths.feature.shop.storelocator.legacy.pickup.details;

import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsContract;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsViewModel$setStoreNumber$2", f = "StoreDetailsViewModel.kt", l = {107}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class StoreDetailsViewModel$setStoreNumber$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public StoreDetailsViewModel p;
    public int q;
    public final /* synthetic */ StoreDetailsViewModel r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreDetailsViewModel$setStoreNumber$2(StoreDetailsViewModel storeDetailsViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.r = storeDetailsViewModel;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreDetailsViewModel$setStoreNumber$2(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreDetailsViewModel$setStoreNumber$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StoreDetailsViewModel storeDetailsViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        StoreDetailsViewModel storeDetailsViewModel2 = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl = storeDetailsViewModel2.e;
                String str = this.s;
                this.p = storeDetailsViewModel2;
                this.q = 1;
                obj = legacyStoreLocatorInteractorImpl.d(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                storeDetailsViewModel = storeDetailsViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                storeDetailsViewModel = this.p;
                ResultKt.b(obj);
            }
            storeDetailsViewModel.q6((Store) obj);
        } catch (Exception unused) {
            MutableStateFlow mutableStateFlow = storeDetailsViewModel2.k;
            mutableStateFlow.setValue(StoreDetailsContract.ViewState.a((StoreDetailsContract.ViewState) mutableStateFlow.getValue(), StoreDetailsContract.PageState.f, null, null, null, null, null, null, null, null, 1020));
        }
        return Unit.f24250a;
    }
}
