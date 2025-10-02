package au.com.woolworths.rewards.base.coachmark.legacy;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/rewards/base/coachmark/legacy/CoachMarkContent;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2", f = "HomepageCoachMarkInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CoachMarkContent>, Object> {
    public final /* synthetic */ HomepageCoachMarkInteractor p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2(HomepageCoachMarkInteractor homepageCoachMarkInteractor, String str, Continuation continuation) {
        super(2, continuation);
        this.p = homepageCoachMarkInteractor;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.p.b.d(CoachMarkContent.class, this.q);
    }
}
