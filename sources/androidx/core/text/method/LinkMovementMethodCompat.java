package androidx.core.text.method;

import android.text.method.LinkMovementMethod;

/* loaded from: classes2.dex */
public class LinkMovementMethodCompat extends LinkMovementMethod {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r2 <= r1.getLineRight(r0)) goto L18;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.widget.TextView r5, android.text.Spannable r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L57
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == r1) goto Lf
            if (r0 != 0) goto L57
        Lf:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r5.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r5.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getScrollX()
            int r2 = r2 + r0
            int r0 = r5.getScrollY()
            int r0 = r0 + r1
            android.text.Layout r1 = r5.getLayout()
            if (r0 < 0) goto L4f
            int r3 = r1.getHeight()
            if (r0 <= r3) goto L3a
            goto L4f
        L3a:
            int r0 = r1.getLineForVertical(r0)
            float r2 = (float) r2
            float r3 = r1.getLineLeft(r0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L4f
            float r0 = r1.getLineRight(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
        L4f:
            android.text.Selection.removeSelection(r6)
            boolean r5 = android.text.method.Touch.onTouchEvent(r5, r6, r7)
            return r5
        L57:
            boolean r5 = super.onTouchEvent(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.method.LinkMovementMethodCompat.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
