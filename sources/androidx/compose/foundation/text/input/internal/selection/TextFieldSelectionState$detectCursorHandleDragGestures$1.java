package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {611}, m = "detectCursorHandleDragGestures")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$detectCursorHandleDragGestures$1 extends ContinuationImpl {
    public TextFieldSelectionState p;
    public Ref.LongRef q;
    public Ref.LongRef r;
    public /* synthetic */ Object s;
    public final /* synthetic */ TextFieldSelectionState t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return TextFieldSelectionState.a(this.t, null, this);
    }
}
