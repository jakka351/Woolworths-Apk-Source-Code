package kotlinx.coroutines.flow;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {107}, m = DevicePublicKeyStringDef.NONE)
/* loaded from: classes7.dex */
final class FlowKt__LogicKt$none$1<T> extends ContinuationImpl {
    public /* synthetic */ Object p;
    public int q;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__LogicKt$none$1<T> flowKt__LogicKt$none$1;
        this.p = obj;
        int i = this.q | Integer.MIN_VALUE;
        this.q = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.q = i - Integer.MIN_VALUE;
            flowKt__LogicKt$none$1 = this;
        } else {
            flowKt__LogicKt$none$1 = new FlowKt__LogicKt$none$1<>(this);
        }
        Object objA = flowKt__LogicKt$none$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = flowKt__LogicKt$none$1.q;
        if (i2 == 0) {
            ResultKt.b(objA);
            flowKt__LogicKt$none$1.q = 1;
            objA = FlowKt__LogicKt.a(flowKt__LogicKt$none$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(!((Boolean) objA).booleanValue());
    }
}
