package au.com.woolworths.base.rewards.account;

import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onSettingChanged$2", f = "RedemptionStateInteractor.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RedemptionStateInteractor$onSettingChanged$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $action;
    int label;
    final /* synthetic */ RedemptionStateInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedemptionStateInteractor$onSettingChanged$2(RedemptionStateInteractor redemptionStateInteractor, Function0<Unit> function0, Continuation<? super RedemptionStateInteractor$onSettingChanged$2> continuation) {
        super(2, continuation);
        this.this$0 = redemptionStateInteractor;
        this.$action = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedemptionStateInteractor$onSettingChanged$2(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.this$0.settingRepository.getSelectedSetting());
            final Function0<Unit> function0 = this.$action;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.base.rewards.account.RedemptionStateInteractor$onSettingChanged$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((RewardsRedemptionSettingsItem) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, Continuation<? super Unit> continuation) {
                    function0.invoke();
                    return Unit.f24250a;
                }
            };
            this.label = 1;
            if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedemptionStateInteractor$onSettingChanged$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f24250a);
    }
}
