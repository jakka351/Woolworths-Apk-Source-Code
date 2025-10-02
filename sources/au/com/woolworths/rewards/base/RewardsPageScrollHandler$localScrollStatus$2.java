package au.com.woolworths.rewards.base;

import au.com.woolworths.rewards.base.RewardsPageScrollManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.rewards.base.RewardsPageScrollHandler$localScrollStatus$2", f = "RewardsPageScrollHandler.kt", l = {62, 65}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsPageScrollHandler$localScrollStatus$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LocalScrollStatus q;
    public final /* synthetic */ LocalScrollStatus r;
    public final /* synthetic */ RewardsPageScrollHandler s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPageScrollHandler$localScrollStatus$2(LocalScrollStatus localScrollStatus, LocalScrollStatus localScrollStatus2, RewardsPageScrollHandler rewardsPageScrollHandler, Continuation continuation) {
        super(2, continuation);
        this.q = localScrollStatus;
        this.r = localScrollStatus2;
        this.s = rewardsPageScrollHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPageScrollHandler$localScrollStatus$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPageScrollHandler$localScrollStatus$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RewardsPageScrollHandler rewardsPageScrollHandler = this.s;
        LocalScrollStatus localScrollStatus = this.r;
        Unit unit = Unit.f24250a;
        LocalScrollStatus localScrollStatus2 = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if (!Intrinsics.c(localScrollStatus2.b, localScrollStatus.b)) {
                RewardsPageScrollManager rewardsPageScrollManagerN3 = rewardsPageScrollHandler.n3();
                RewardsPageScrollManager.Status status = localScrollStatus2.b;
                this.p = 1;
                Object objEmit = rewardsPageScrollManagerN3.f9350a.emit(status, this);
                if (objEmit != coroutineSingletons) {
                    objEmit = unit;
                }
                if (objEmit != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        if (!Intrinsics.c(localScrollStatus2.c, localScrollStatus.c)) {
            RewardsPageScrollManager rewardsPageScrollManagerN32 = rewardsPageScrollHandler.n3();
            RewardsPageScrollManager.StickyFilter stickyFilter = localScrollStatus2.c;
            this.p = 2;
            Object objEmit2 = rewardsPageScrollManagerN32.b.emit(stickyFilter, this);
            if (objEmit2 != coroutineSingletons) {
                objEmit2 = unit;
            }
            if (objEmit2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
