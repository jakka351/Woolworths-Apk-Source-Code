package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", l = {747}, m = "collectImeNotifications")
/* loaded from: classes2.dex */
final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    public TextFieldState.NotifyImeListener p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TransformedTextFieldState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        this.r.a(null, this);
        throw null;
    }
}
