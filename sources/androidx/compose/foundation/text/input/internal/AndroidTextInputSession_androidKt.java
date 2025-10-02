package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidTextInputSession_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.platform.PlatformTextInputSession r17, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r18, androidx.compose.foundation.text.input.internal.TextLayoutState r19, androidx.compose.ui.text.input.ImeOptions r20, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r21, kotlin.jvm.functions.Function1 r22, kotlin.jvm.functions.Function0 r23, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r24, kotlinx.coroutines.flow.MutableSharedFlow r25, androidx.compose.ui.platform.ViewConfiguration r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) r1
            int r2 = r1.q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.q = r2
            goto L1a
        L15:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.q
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 == r4) goto L2d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            kotlin.ResultKt.b(r0)
            goto L58
        L31:
            kotlin.ResultKt.b(r0)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r16 = 0
            r10 = r17
            r7 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r9 = r24
            r6 = r25
            r15 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.q = r4
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.c(r5, r1)
            if (r0 != r2) goto L58
            return
        L58:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.a(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, kotlinx.coroutines.flow.MutableSharedFlow, androidx.compose.ui.platform.ViewConfiguration, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.platform.PlatformTextInputSession r13, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r14, androidx.compose.foundation.text.input.internal.TextLayoutState r15, androidx.compose.ui.text.input.ImeOptions r16, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function0 r19, kotlinx.coroutines.flow.MutableSharedFlow r20, androidx.compose.ui.platform.ViewConfiguration r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) r1
            int r2 = r1.q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.q = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.q
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2f
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            kotlin.KotlinNothingValueException r13 = android.support.v4.media.session.a.v(r0)
            throw r13
        L34:
            kotlin.ResultKt.b(r0)
            android.view.View r0 = r13.getD()
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r9 = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.a(r0)
            r12.q = r2
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.b(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlinx.coroutines.flow.MutableSharedFlow, androidx.compose.ui.platform.ViewConfiguration, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
