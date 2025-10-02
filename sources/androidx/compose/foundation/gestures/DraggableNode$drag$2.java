package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1;
import androidx.compose.ui.geometry.Offset;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {nlnlnnn.xxx00780078x0078}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DraggableNode$drag$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ DraggableNode s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$drag$2(Function2 function2, DraggableNode draggableNode, Continuation continuation) {
        super(2, continuation);
        this.r = function2;
        this.s = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.r, this.s, continuation);
        draggableNode$drag$2.q = obj;
        return draggableNode$drag$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DraggableNode$drag$2) create((DragScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final DragScope dragScope = (DragScope) this.q;
            final DraggableNode draggableNode = this.s;
            Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.DraggableNode$drag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((DragEvent.DragDelta) obj2).f886a;
                    DraggableNode draggableNode2 = draggableNode;
                    long jI = Offset.i(j, draggableNode2.G ? -1.0f : 1.0f);
                    Orientation orientation = draggableNode2.C;
                    Function3 function3 = DraggableKt.f890a;
                    dragScope.a(Float.intBitsToFloat((int) (orientation == Orientation.d ? jI & 4294967295L : jI >> 32)));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((DragGestureNode$startListeningForEvents$1.AnonymousClass1) this.r).invoke(function1, this) == coroutineSingletons) {
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
