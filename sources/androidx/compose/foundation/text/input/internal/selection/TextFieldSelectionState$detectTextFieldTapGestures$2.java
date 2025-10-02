package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {489}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$detectTextFieldTapGestures$2 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ PressGestureScope q;
    public /* synthetic */ long r;
    public final /* synthetic */ MutableInteractionSource s;
    public final /* synthetic */ TextFieldSelectionState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTextFieldTapGestures$2(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(3, continuation);
        this.s = mutableInteractionSource;
        this.t = textFieldSelectionState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).f1751a;
        TextFieldSelectionState$detectTextFieldTapGestures$2 textFieldSelectionState$detectTextFieldTapGestures$2 = new TextFieldSelectionState$detectTextFieldTapGestures$2(this.s, this.t, (Continuation) obj3);
        textFieldSelectionState$detectTextFieldTapGestures$2.q = (PressGestureScope) obj;
        textFieldSelectionState$detectTextFieldTapGestures$2.r = j;
        return textFieldSelectionState$detectTextFieldTapGestures$2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            PressGestureScope pressGestureScope = this.q;
            long j = this.r;
            MutableInteractionSource mutableInteractionSource = this.s;
            if (mutableInteractionSource != null) {
                TextFieldSelectionState$detectTextFieldTapGestures$2$1$1 textFieldSelectionState$detectTextFieldTapGestures$2$1$1 = new TextFieldSelectionState$detectTextFieldTapGestures$2$1$1(pressGestureScope, this.t, j, mutableInteractionSource, null);
                this.p = 1;
                if (CoroutineScopeKt.c(textFieldSelectionState$detectTextFieldTapGestures$2$1$1, this) == coroutineSingletons) {
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
