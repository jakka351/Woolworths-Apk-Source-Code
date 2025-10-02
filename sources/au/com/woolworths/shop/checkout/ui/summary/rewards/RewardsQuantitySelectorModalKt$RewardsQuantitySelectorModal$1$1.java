package au.com.woolworths.shop.checkout.ui.summary.rewards;

import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1", f = "RewardsQuantitySelectorModal.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ CoroutineScope p;
    public final /* synthetic */ SheetState q;
    public final /* synthetic */ Function0 r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1$1", f = "RewardsQuantitySelectorModal.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ SheetState q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SheetState sheetState, Continuation continuation) {
            super(2, continuation);
            this.q = sheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (this.q.a(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1(CoroutineScope coroutineScope, SheetState sheetState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.p = coroutineScope;
        this.q = sheetState;
        this.r = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1 rewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1 = (RewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rewardsQuantitySelectorModalKt$RewardsQuantitySelectorModal$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((JobSupport) BuildersKt.c(this.p, null, null, new AnonymousClass1(this.q, null), 3)).invokeOnCompletion(new j(15, this.r));
        return Unit.f24250a;
    }
}
