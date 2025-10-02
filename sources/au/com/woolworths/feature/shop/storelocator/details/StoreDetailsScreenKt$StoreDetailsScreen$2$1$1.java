package au.com.woolworths.feature.shop.storelocator.details;

import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.shop.storelocator.details.StoreDetailsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.details.StoreDetailsScreenKt$StoreDetailsScreen$2$1$1", f = "StoreDetailsScreen.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class StoreDetailsScreenKt$StoreDetailsScreen$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ StoreDetailsContract.ViewState r;
    public final /* synthetic */ ScaffoldState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreDetailsScreenKt$StoreDetailsScreen$2$1$1(String str, StoreDetailsContract.ViewState viewState, ScaffoldState scaffoldState, Continuation continuation) {
        super(2, continuation);
        this.q = str;
        this.r = viewState;
        this.s = scaffoldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoreDetailsScreenKt$StoreDetailsScreen$2$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreDetailsScreenKt$StoreDetailsScreen$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StoreDetailsScreenKt$StoreDetailsScreen$2$1$1 storeDetailsScreenKt$StoreDetailsScreen$2$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            String str = this.q;
            if (str == null) {
                storeDetailsScreenKt$StoreDetailsScreen$2$1$1 = this;
                storeDetailsScreenKt$StoreDetailsScreen$2$1$1.r.h.invoke(StoreDetailsContract.ViewModelAction.MessageShown.f8140a);
                return Unit.f24250a;
            }
            SnackbarHostState snackbarHostState = this.s.f1319a;
            this.p = 1;
            storeDetailsScreenKt$StoreDetailsScreen$2$1$1 = this;
            obj = SnackbarHostState.b(snackbarHostState, str, null, null, storeDetailsScreenKt$StoreDetailsScreen$2$1$1, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            storeDetailsScreenKt$StoreDetailsScreen$2$1$1 = this;
        }
        storeDetailsScreenKt$StoreDetailsScreen$2$1$1.r.h.invoke(StoreDetailsContract.ViewModelAction.MessageShown.f8140a);
        return Unit.f24250a;
    }
}
