package au.com.woolworths.sdui.rewards.broadcastbanner;

import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.sdui.rewards.broadcastbanner.BroadcastBannerKt$BroadcastBanner$1$1", f = "BroadcastBanner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BroadcastBannerKt$BroadcastBanner$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1 p;
    public final /* synthetic */ BasicCoreBroadcastBannerModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastBannerKt$BroadcastBanner$1$1(Function1 function1, BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel, Continuation continuation) {
        super(2, continuation);
        this.p = function1;
        this.q = basicCoreBroadcastBannerModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BroadcastBannerKt$BroadcastBanner$1$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BroadcastBannerKt$BroadcastBanner$1$1 broadcastBannerKt$BroadcastBanner$1$1 = (BroadcastBannerKt$BroadcastBanner$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        broadcastBannerKt$BroadcastBanner$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.q.getClass();
        this.p.invoke(null);
        return Unit.f24250a;
    }
}
