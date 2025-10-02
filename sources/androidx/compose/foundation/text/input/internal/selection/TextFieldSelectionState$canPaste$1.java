package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1325, 1327}, m = "canPaste")
/* loaded from: classes2.dex */
final class TextFieldSelectionState$canPaste$1 extends ContinuationImpl {
    public TextFieldSelectionState p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TextFieldSelectionState r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$canPaste$1(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = textFieldSelectionState;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r7.q = r8
            int r8 = r7.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.s = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r7.r
            r8.getClass()
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            if (r0 == 0) goto L1f
            int r0 = r7.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1f
            int r0 = r0 - r1
            r7.s = r0
            r0 = r7
            goto L24
        L1f:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1
            r0.<init>(r8, r7)
        L24:
            java.lang.Object r1 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r0.s
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L46
            if (r3 == r6) goto L40
            if (r3 != r4) goto L38
            kotlin.ResultKt.b(r1)
            goto L98
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L40:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r0.p
            kotlin.ResultKt.b(r1)
            goto L60
        L46:
            kotlin.ResultKt.b(r1)
            boolean r1 = r8.b
            if (r1 == 0) goto La3
            boolean r1 = r8.c
            if (r1 != 0) goto La3
            androidx.compose.ui.platform.Clipboard r1 = r8.g
            if (r1 == 0) goto L74
            r0.p = r8
            r0.s = r6
            androidx.compose.ui.platform.ClipEntry r1 = r1.a()
            if (r1 != r2) goto L60
            goto La5
        L60:
            androidx.compose.ui.platform.ClipEntry r1 = (androidx.compose.ui.platform.ClipEntry) r1
            if (r1 == 0) goto L74
            android.content.ClipData r1 = r1.f1962a
            android.content.ClipDescription r1 = r1.getDescription()
            java.lang.String r3 = "text/*"
            boolean r1 = r1.hasMimeType(r3)
            if (r1 != r6) goto L74
            r1 = r6
            goto L75
        L74:
            r1 = r5
        L75:
            if (r1 == 0) goto L7a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto La5
        L7a:
            kotlin.jvm.functions.Function0 r1 = r8.i
            r3 = 0
            if (r1 == 0) goto L86
            java.lang.Object r1 = r1.invoke()
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r1 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r1
            goto L87
        L86:
            r1 = r3
        L87:
            if (r1 == 0) goto L9e
            androidx.compose.ui.platform.Clipboard r8 = r8.g
            if (r8 == 0) goto L9b
            r0.p = r3
            r0.s = r4
            androidx.compose.ui.platform.ClipEntry r1 = r8.a()
            if (r1 != r2) goto L98
            goto La5
        L98:
            r3 = r1
            androidx.compose.ui.platform.ClipEntry r3 = (androidx.compose.ui.platform.ClipEntry) r3
        L9b:
            if (r3 == 0) goto L9e
            r5 = r6
        L9e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            goto La5
        La3:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$canPaste$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
