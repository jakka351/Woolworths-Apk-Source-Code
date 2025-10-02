package au.com.woolworths.foundation.shop.collectionmode;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractorImpl$clearFulfilmentWindowRxCompat$1", f = "CollectionModeInteractorImpl.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CollectionModeInteractorImpl$clearFulfilmentWindowRxCompat$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CollectionModeInteractorImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionModeInteractorImpl$clearFulfilmentWindowRxCompat$1(CollectionModeInteractorImpl collectionModeInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.q = collectionModeInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionModeInteractorImpl$clearFulfilmentWindowRxCompat$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionModeInteractorImpl$clearFulfilmentWindowRxCompat$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CollectionModeInteractorImpl collectionModeInteractorImpl = this.q;
                this.p = 1;
                if (collectionModeInteractorImpl.o(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (NoConnectivityException unused) {
        } catch (ServerErrorException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.i), e, "ServerError while clearing fulfilment windows", 8);
        }
        return Unit.f24250a;
    }
}
