package au.com.woolworths.compose.utils.effect;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.compose.utils.effect.ActionEffectKt$ActionEffect$1$1", f = "ActionEffect.kt", l = {22}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ActionEffectKt$ActionEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Function3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionEffectKt$ActionEffect$1$1(Object obj, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.r = obj;
        this.s = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActionEffectKt$ActionEffect$1$1 actionEffectKt$ActionEffect$1$1 = new ActionEffectKt$ActionEffect$1$1(this.r, this.s, continuation);
        actionEffectKt$ActionEffect$1$1.q = obj;
        return actionEffectKt$ActionEffect$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionEffectKt$ActionEffect$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            Object obj2 = this.r;
            if (obj2 != null) {
                this.q = obj2;
                this.p = 1;
                if (this.s.invoke(coroutineScope, obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
