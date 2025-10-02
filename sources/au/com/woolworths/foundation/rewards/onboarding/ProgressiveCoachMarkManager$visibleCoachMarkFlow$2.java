package au.com.woolworths.foundation.rewards.onboarding;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "coachMark", "visible", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$visibleCoachMarkFlow$2", f = "ProgressiveCoachMarkManager.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProgressiveCoachMarkManager$visibleCoachMarkFlow$2 extends SuspendLambda implements Function3<ProgressiveCoachMarkContent, Boolean, Continuation<? super ProgressiveCoachMarkContent>, Object> {
    public /* synthetic */ ProgressiveCoachMarkContent p;
    public /* synthetic */ boolean q;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ProgressiveCoachMarkManager$visibleCoachMarkFlow$2 progressiveCoachMarkManager$visibleCoachMarkFlow$2 = new ProgressiveCoachMarkManager$visibleCoachMarkFlow$2(3, (Continuation) obj3);
        progressiveCoachMarkManager$visibleCoachMarkFlow$2.p = (ProgressiveCoachMarkContent) obj;
        progressiveCoachMarkManager$visibleCoachMarkFlow$2.q = zBooleanValue;
        return progressiveCoachMarkManager$visibleCoachMarkFlow$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProgressiveCoachMarkContent progressiveCoachMarkContent = this.p;
        boolean z = this.q;
        if (progressiveCoachMarkContent == null || !z) {
            return null;
        }
        return progressiveCoachMarkContent;
    }
}
