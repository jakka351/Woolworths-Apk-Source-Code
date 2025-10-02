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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "visible", "shown"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager$pendingCoachMarkFlow$1", f = "ProgressiveCoachMarkManager.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ProgressiveCoachMarkManager$pendingCoachMarkFlow$1 extends SuspendLambda implements Function3<ProgressiveCoachMarkContent, ProgressiveCoachMarkContent, Continuation<? super ProgressiveCoachMarkContent>, Object> {
    public /* synthetic */ ProgressiveCoachMarkContent p;
    public /* synthetic */ ProgressiveCoachMarkContent q;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProgressiveCoachMarkManager$pendingCoachMarkFlow$1 progressiveCoachMarkManager$pendingCoachMarkFlow$1 = new ProgressiveCoachMarkManager$pendingCoachMarkFlow$1(3, (Continuation) obj3);
        progressiveCoachMarkManager$pendingCoachMarkFlow$1.p = (ProgressiveCoachMarkContent) obj;
        progressiveCoachMarkManager$pendingCoachMarkFlow$1.q = (ProgressiveCoachMarkContent) obj2;
        return progressiveCoachMarkManager$pendingCoachMarkFlow$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProgressiveCoachMarkContent progressiveCoachMarkContent = this.p;
        ProgressiveCoachMarkContent progressiveCoachMarkContent2 = this.q;
        if (progressiveCoachMarkContent == null || progressiveCoachMarkContent.equals(progressiveCoachMarkContent2)) {
            return null;
        }
        return progressiveCoachMarkContent;
    }
}
