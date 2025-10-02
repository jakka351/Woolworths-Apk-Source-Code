package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1365}, m = "pasteAsPlainText")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$pasteAsPlainText$1 extends ContinuationImpl {
    public TextFieldSelectionState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TextFieldSelectionState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$pasteAsPlainText$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.q(this);
    }
}
