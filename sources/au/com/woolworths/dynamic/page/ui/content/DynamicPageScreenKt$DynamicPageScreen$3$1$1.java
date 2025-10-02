package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.material.ModalBottomSheetState;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.dynamic.page.ui.content.DynamicPageScreenKt$DynamicPageScreen$3$1$1", f = "DynamicPageScreen.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DynamicPageScreenKt$DynamicPageScreen$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ModalBottomSheetState q;
    public final /* synthetic */ Function0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPageScreenKt$DynamicPageScreen$3$1$1(ModalBottomSheetState modalBottomSheetState, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.q = modalBottomSheetState;
        this.r = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicPageScreenKt$DynamicPageScreen$3$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicPageScreenKt$DynamicPageScreen$3$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ModalBottomSheetState modalBottomSheetState = this.q;
            if (modalBottomSheetState.d()) {
                this.p = 1;
                if (modalBottomSheetState.c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                this.r.invoke();
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
