package au.com.woolworths.shop.lists.ui.magicmatch.ui;

import androidx.compose.material3.SheetValue;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
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
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt$OnboardingBottomSheet$1$1", f = "OnboardingBottomSheet.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OnboardingBottomSheetKt$OnboardingBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SheetState q;
    public final /* synthetic */ MutableState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBottomSheetKt$OnboardingBottomSheet$1$1(SheetState sheetState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = sheetState;
        this.r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingBottomSheetKt$OnboardingBottomSheet$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingBottomSheetKt$OnboardingBottomSheet$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            this.p = 1;
            androidx.compose.material3.SheetState sheetState = this.q.f4725a;
            DraggableAnchors draggableAnchorsE = sheetState.c.e();
            SheetValue sheetValue = SheetValue.f;
            if (!draggableAnchorsE.d(sheetValue)) {
                sheetValue = SheetValue.e;
            }
            Object objA = androidx.compose.material3.SheetState.a(sheetState, sheetValue, this);
            if (objA != coroutineSingletons) {
                objA = unit;
            }
            if (objA != coroutineSingletons) {
                objA = unit;
            }
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.r.setValue(Boolean.TRUE);
        return unit;
    }
}
