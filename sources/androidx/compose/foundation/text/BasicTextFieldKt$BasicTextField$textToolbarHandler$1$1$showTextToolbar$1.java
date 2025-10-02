package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1", f = "BasicTextField.kt", l = {321}, m = "showTextToolbar")
/* loaded from: classes2.dex */
final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, Continuation continuation) {
        super(continuation);
        this.q = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.b(null, null, this);
        throw null;
    }
}
