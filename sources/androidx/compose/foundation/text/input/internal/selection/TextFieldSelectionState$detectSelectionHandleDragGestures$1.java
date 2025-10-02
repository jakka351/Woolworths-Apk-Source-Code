package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {984}, m = "detectSelectionHandleDragGestures")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends ContinuationImpl {
    public TextFieldSelectionState p;
    public Ref.LongRef q;
    public Ref.LongRef r;
    public Handle s;
    public /* synthetic */ Object t;
    public final /* synthetic */ TextFieldSelectionState u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return TextFieldSelectionState.b(this.u, null, false, this);
    }
}
