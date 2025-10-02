package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PointerEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1851a;
    public final InternalPointerEvent b;
    public final int c;
    public final int d;
    public int e;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PointerEvent(java.util.List r7, androidx.compose.ui.input.pointer.InternalPointerEvent r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f1851a = r7
            r6.b = r8
            android.view.MotionEvent r8 = r6.a()
            r0 = 0
            if (r8 == 0) goto L13
            int r8 = r8.getButtonState()
            goto L14
        L13:
            r8 = r0
        L14:
            r6.c = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L21
            int r8 = r8.getMetaState()
            goto L22
        L21:
            r8 = r0
        L22:
            r6.d = r8
            android.view.MotionEvent r8 = r6.a()
            r1 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L47
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L45
            if (r7 == r3) goto L43
            if (r7 == r2) goto L41
            switch(r7) {
                case 5: goto L45;
                case 6: goto L43;
                case 7: goto L41;
                case 8: goto L3f;
                case 9: goto L3d;
                case 10: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L67
        L3b:
            r0 = 5
            goto L67
        L3d:
            r0 = 4
            goto L67
        L3f:
            r0 = 6
            goto L67
        L41:
            r0 = r1
            goto L67
        L43:
            r0 = r2
            goto L67
        L45:
            r0 = r3
            goto L67
        L47:
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
        L4e:
            if (r0 >= r8) goto L41
            java.lang.Object r4 = r7.get(r0)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.c(r4)
            if (r5 == 0) goto L5d
            goto L43
        L5d:
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.a(r4)
            if (r4 == 0) goto L64
            goto L45
        L64:
            int r0 = r0 + 1
            goto L4e
        L67:
            r6.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerEvent.<init>(java.util.List, androidx.compose.ui.input.pointer.InternalPointerEvent):void");
    }

    public final MotionEvent a() {
        InternalPointerEvent internalPointerEvent = this.b;
        if (internalPointerEvent != null) {
            return internalPointerEvent.b.b;
        }
        return null;
    }
}
