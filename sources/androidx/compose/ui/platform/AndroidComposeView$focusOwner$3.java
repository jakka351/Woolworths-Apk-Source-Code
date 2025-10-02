package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$focusOwner$3 extends FunctionReferenceImpl implements Function1<FocusDirection, Boolean> {
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            androidx.compose.ui.focus.FocusDirection r5 = (androidx.compose.ui.focus.FocusDirection) r5
            int r5 = r5.getF1744a()
            java.lang.Object r0 = r4.receiver
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            java.lang.Class r1 = androidx.compose.ui.platform.AndroidComposeView.J0
            r0.getClass()
            r1 = 7
            boolean r1 = androidx.compose.ui.focus.FocusDirection.b(r5, r1)
            if (r1 != 0) goto L5b
            r1 = 8
            boolean r1 = androidx.compose.ui.focus.FocusDirection.b(r5, r1)
            if (r1 == 0) goto L1f
            goto L5b
        L1f:
            java.lang.Integer r5 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.c(r5)
            if (r5 == 0) goto L53
            int r5 = r5.intValue()
            androidx.compose.ui.geometry.Rect r1 = r0.U()
            if (r1 == 0) goto L34
            android.graphics.Rect r1 = androidx.compose.ui.graphics.RectHelper_androidKt.a(r1)
            goto L35
        L34:
            r1 = 0
        L35:
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            if (r1 != 0) goto L44
            android.view.View r3 = r0.findFocus()
            android.view.View r0 = r2.findNextFocus(r0, r3, r5)
            goto L48
        L44:
            android.view.View r0 = r2.findNextFocusFromRect(r0, r1, r5)
        L48:
            if (r0 == 0) goto L5b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.b(r0, r5, r1)
            goto L5c
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid focus direction"
            r5.<init>(r0)
            throw r5
        L5b:
            r5 = 0
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$focusOwner$3.invoke(java.lang.Object):java.lang.Object");
    }
}
