package au.com.woolworths.foundation.advertising.data.google;

import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdConsumer;
import java.util.concurrent.CopyOnWriteArrayList;
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
@DebugMetadata(c = "au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor$resolve$2$1$job$1", f = "GoogleAdManagerInteractor.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GoogleAdManagerInteractor$resolve$2$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ GoogleAdManagerInteractor q;
    public final /* synthetic */ GoogleAdBannerCard r;
    public final /* synthetic */ CopyOnWriteArrayList s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ GoogleAdConsumer u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleAdManagerInteractor$resolve$2$1$job$1(GoogleAdManagerInteractor googleAdManagerInteractor, GoogleAdBannerCard googleAdBannerCard, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, GoogleAdConsumer googleAdConsumer, Continuation continuation) {
        super(2, continuation);
        this.q = googleAdManagerInteractor;
        this.r = googleAdBannerCard;
        this.s = copyOnWriteArrayList;
        this.t = z;
        this.u = googleAdConsumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleAdManagerInteractor$resolve$2$1$job$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleAdManagerInteractor$resolve$2$1$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            if (GoogleAdManagerInteractor.a(this.q, this.r, this.s, this.t, this.u, this) == coroutineSingletons) {
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
