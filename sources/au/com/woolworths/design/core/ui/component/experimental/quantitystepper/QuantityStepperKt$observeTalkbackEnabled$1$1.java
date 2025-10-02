package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import android.view.accessibility.AccessibilityManager;
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
@DebugMetadata(c = "au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperKt$observeTalkbackEnabled$1$1", f = "QuantityStepper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QuantityStepperKt$observeTalkbackEnabled$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ AccessibilityManager p;
    public final /* synthetic */ AccessibilityManager.AccessibilityStateChangeListener q;
    public final /* synthetic */ AccessibilityManager.TouchExplorationStateChangeListener r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuantityStepperKt$observeTalkbackEnabled$1$1(AccessibilityManager accessibilityManager, AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener, Continuation continuation) {
        super(2, continuation);
        this.p = accessibilityManager;
        this.q = accessibilityStateChangeListener;
        this.r = touchExplorationStateChangeListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuantityStepperKt$observeTalkbackEnabled$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        QuantityStepperKt$observeTalkbackEnabled$1$1 quantityStepperKt$observeTalkbackEnabled$1$1 = (QuantityStepperKt$observeTalkbackEnabled$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        quantityStepperKt$observeTalkbackEnabled$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.q;
        AccessibilityManager accessibilityManager = this.p;
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        accessibilityManager.addTouchExplorationStateChangeListener(this.r);
        return Unit.f24250a;
    }
}
