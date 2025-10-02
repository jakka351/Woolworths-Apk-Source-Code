package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1;
import androidx.compose.ui.geometry.Offset;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {408}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AnchoredDraggableNode$drag$2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ AnchoredDragScope q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ AnchoredDraggableNode s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$drag$2(Function2 function2, AnchoredDraggableNode anchoredDraggableNode, Continuation continuation) {
        super(3, continuation);
        this.r = function2;
        this.s = anchoredDraggableNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.r, this.s, (Continuation) obj3);
        anchoredDraggableNode$drag$2.q = (AnchoredDragScope) obj;
        return anchoredDraggableNode$drag$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final AnchoredDragScope anchoredDragScope = this.q;
            final AnchoredDraggableNode anchoredDraggableNode = this.s;
            Function1<DragEvent.DragDelta, Unit> function1 = new Function1<DragEvent.DragDelta, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "deltaForDrag", "invoke-MK-Hz9U", "(J)J"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2$1$1, reason: invalid class name and collision with other inner class name */
                final class C00131 extends Lambda implements Function1<Offset, Offset> {
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j = ((Offset) obj).f1751a;
                        Orientation orientation = Orientation.d;
                        Float.intBitsToFloat((int) (j >> 32));
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((DragEvent.DragDelta) obj2).f886a;
                    anchoredDraggableNode.F2();
                    long jI = Offset.i(j, 1.0f);
                    Orientation orientation = Orientation.d;
                    Float.intBitsToFloat((int) (jI >> 32));
                    Object obj3 = null;
                    obj3.getClass();
                    Orientation orientation2 = Orientation.d;
                    Orientation orientation3 = Orientation.d;
                    Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                    Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
                    throw null;
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
