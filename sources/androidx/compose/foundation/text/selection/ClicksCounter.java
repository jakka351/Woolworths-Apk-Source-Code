package androidx.compose.foundation.text.selection;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/ClicksCounter;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ClicksCounter {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f1198a;
    public int b;
    public PointerInputChange c;

    public ClicksCounter(ViewConfiguration viewConfiguration) {
        this.f1198a = viewConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.input.pointer.PointerEvent r8) {
        /*
            r7 = this;
            androidx.compose.ui.input.pointer.PointerInputChange r0 = r7.c
            java.lang.Object r8 = r8.f1851a
            r1 = 0
            java.lang.Object r8 = r8.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r1 = 1
            if (r0 == 0) goto L29
            long r2 = r8.b
            long r4 = r0.b
            long r2 = r2 - r4
            androidx.compose.ui.platform.ViewConfiguration r4 = r7.f1198a
            long r5 = r4.d()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L29
            boolean r0 = androidx.compose.foundation.text.selection.SelectionGesturesKt.g(r4, r0, r8)
            if (r0 == 0) goto L29
            int r0 = r7.b
            int r0 = r0 + r1
            r7.b = r0
            goto L2b
        L29:
            r7.b = r1
        L2b:
            r7.c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.ClicksCounter.a(androidx.compose.ui.input.pointer.PointerEvent):void");
    }
}
