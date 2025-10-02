package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1332, 1334, 1334}, m = "paste")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$paste$1 extends ContinuationImpl {
    public TextFieldSelectionState p;
    public ReceiveContentConfiguration q;
    public /* synthetic */ Object r;
    public final /* synthetic */ TextFieldSelectionState s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$paste$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.p(this);
    }
}
