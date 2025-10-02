package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements Function1<KeyEvent, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        return m(((KeyEvent) obj).f1844a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean m(android.view.KeyEvent r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.receiver
            androidx.compose.foundation.text.TextFieldKeyInput r0 = (androidx.compose.foundation.text.TextFieldKeyInput) r0
            androidx.compose.foundation.text.selection.TextPreparedSelectionState r1 = r0.f
            boolean r2 = r0.d
            boolean r3 = androidx.compose.foundation.text.TextFieldKeyInput_androidKt.a(r11)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L12
        L10:
            r6 = r5
            goto L30
        L12:
            androidx.compose.foundation.text.DeadKeyCombiner r3 = r0.i
            java.lang.Integer r3 = r3.a(r11)
            if (r3 == 0) goto L10
            int r3 = r3.intValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r3 = r6.appendCodePoint(r3)
            java.lang.String r3 = r3.toString()
            androidx.compose.ui.text.input.CommitTextCommand r6 = new androidx.compose.ui.text.input.CommitTextCommand
            r6.<init>(r3, r4)
        L30:
            r3 = 0
            if (r6 == 0) goto L41
            if (r2 == 0) goto L3f
            java.util.List r11 = kotlin.collections.CollectionsKt.Q(r6)
            r0.a(r11)
            r1.f1226a = r5
            goto L9f
        L3f:
            r4 = r3
            goto L9f
        L41:
            int r5 = androidx.compose.ui.input.key.KeyEvent_androidKt.b(r11)
            r6 = 2
            if (r5 != r6) goto L3f
            androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1 r5 = r0.j
            androidx.compose.foundation.text.KeyCommand r11 = r5.a(r11)
            if (r11 == 0) goto L3f
            boolean r5 = r11.d
            if (r5 == 0) goto L57
            if (r2 != 0) goto L57
            goto L3f
        L57:
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef
            r2.<init>()
            r2.d = r4
            androidx.compose.foundation.text.TextFieldKeyInput$process$2 r3 = new androidx.compose.foundation.text.TextFieldKeyInput$process$2
            r3.<init>()
            androidx.compose.foundation.text.selection.TextFieldPreparedSelection r11 = new androidx.compose.foundation.text.selection.TextFieldPreparedSelection
            androidx.compose.ui.text.input.TextFieldValue r5 = r0.c
            androidx.compose.ui.text.input.OffsetMapping r6 = r0.g
            androidx.compose.foundation.text.LegacyTextFieldState r7 = r0.f1130a
            androidx.compose.foundation.text.TextLayoutResultProxy r7 = r7.d()
            r11.<init>(r5, r6, r7, r1)
            r3.invoke(r11)
            long r6 = r11.f
            long r8 = r5.b
            boolean r1 = androidx.compose.ui.text.TextRange.b(r6, r8)
            if (r1 == 0) goto L89
            androidx.compose.ui.text.AnnotatedString r1 = r11.g
            androidx.compose.ui.text.AnnotatedString r3 = r5.f2127a
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r3)
            if (r1 != 0) goto L97
        L89:
            kotlin.jvm.functions.Function1 r1 = r0.k
            long r6 = r11.f
            r3 = 4
            androidx.compose.ui.text.AnnotatedString r11 = r11.g
            androidx.compose.ui.text.input.TextFieldValue r11 = androidx.compose.ui.text.input.TextFieldValue.a(r5, r11, r6, r3)
            r1.invoke(r11)
        L97:
            androidx.compose.foundation.text.UndoManager r11 = r0.h
            if (r11 == 0) goto L9d
            r11.e = r4
        L9d:
            boolean r4 = r2.d
        L9f:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1$1.m(android.view.KeyEvent):java.lang.Boolean");
    }
}
