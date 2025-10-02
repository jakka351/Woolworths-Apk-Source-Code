package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", l = {781}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextFieldSelectionManager$showSelectionToolbar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public Object q;
    public int r;
    public final /* synthetic */ TextFieldSelectionManager s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbar$1(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
        super(2, continuation);
        this.s = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$showSelectionToolbar$1(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$showSelectionToolbar$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[PHI: r2 r8
  0x00b9: PHI (r2v15 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r2v6 kotlin.jvm.functions.Function0<kotlin.Unit>), (r2v38 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:28:0x0080, B:42:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r8v7 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r8v4 kotlin.jvm.functions.Function0<kotlin.Unit>), (r8v16 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:28:0x0080, B:42:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
