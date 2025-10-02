package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/DownResolution;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {283}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super DownResolution>, Object> {
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Ref.LongRef t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, Ref.LongRef longRef, Continuation continuation) {
        super(2, continuation);
        this.s = j;
        this.t = longRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.s, this.t, continuation);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.r = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create((AwaitPointerEventScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        final Ref.LongRef longRef = this.t;
        if (i == 0) {
            ResultKt.b(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.r;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    long j = ((Offset) obj3).f1751a;
                    ((PointerInputChange) obj2).a();
                    longRef.d = j;
                    return Unit.f24250a;
                }
            };
            this.r = awaitPointerEventScope2;
            this.q = 1;
            Object objD = DragGestureDetectorKt.d(awaitPointerEventScope2, this.s, function2, this);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.r;
            ResultKt.b(obj);
        }
        if (((PointerInputChange) obj) != null && (longRef.d & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.e;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.D(awaitPointerEventScope.y1().f1851a);
        if (!PointerEventKt.c(pointerInputChange)) {
            return DownResolution.g;
        }
        pointerInputChange.a();
        return DownResolution.d;
    }
}
