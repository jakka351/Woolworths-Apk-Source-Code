package au.com.woolworths.foundation.shop.instore.presence.presentation;

import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
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
@DebugMetadata(c = "au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler$onPerformUpdateClick$1", f = "InstorePresencePromptClickHandler.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InstorePresencePromptClickHandler$onPerformUpdateClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstorePresencePromptClickHandler q;
    public final /* synthetic */ InstorePresencePrompt r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresencePromptClickHandler$onPerformUpdateClick$1(InstorePresencePromptClickHandler instorePresencePromptClickHandler, InstorePresencePrompt instorePresencePrompt, Continuation continuation) {
        super(2, continuation);
        this.q = instorePresencePromptClickHandler;
        this.r = instorePresencePrompt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstorePresencePromptClickHandler$onPerformUpdateClick$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstorePresencePromptClickHandler$onPerformUpdateClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        InstorePresencePrompt instorePresencePrompt = this.r;
        InstorePresencePromptClickHandler instorePresencePromptClickHandler = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            LegacyStoreLocatorInteractor legacyStoreLocatorInteractorE3 = instorePresencePromptClickHandler.e3();
            StoreLocatorResult.Store f8750a = instorePresencePrompt.getF8750a();
            this.p = 1;
            if (legacyStoreLocatorInteractorE3.a(f8750a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        instorePresencePromptClickHandler.getI().i(instorePresencePrompt);
        return Unit.f24250a;
    }
}
