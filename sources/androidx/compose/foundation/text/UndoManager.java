package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "Entry", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UndoManager {

    /* renamed from: a, reason: collision with root package name */
    public Entry f1142a;
    public Entry b;
    public int c;
    public Long d;
    public boolean e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Entry {

        /* renamed from: a, reason: collision with root package name */
        public Entry f1143a;
        public TextFieldValue b;

        public Entry(Entry entry, TextFieldValue textFieldValue) {
            this.f1143a = entry;
            this.b = textFieldValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.text.input.TextFieldValue r4) {
        /*
            r3 = this;
            r0 = 0
            r3.e = r0
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f1142a
            r1 = 0
            if (r0 == 0) goto Lb
            androidx.compose.ui.text.input.TextFieldValue r0 = r0.b
            goto Lc
        Lb:
            r0 = r1
        Lc:
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r4, r0)
            if (r0 == 0) goto L13
            goto L6f
        L13:
            androidx.compose.ui.text.AnnotatedString r0 = r4.f2127a
            java.lang.String r0 = r0.e
            androidx.compose.foundation.text.UndoManager$Entry r2 = r3.f1142a
            if (r2 == 0) goto L24
            androidx.compose.ui.text.input.TextFieldValue r2 = r2.b
            if (r2 == 0) goto L24
            androidx.compose.ui.text.AnnotatedString r2 = r2.f2127a
            java.lang.String r2 = r2.e
            goto L25
        L24:
            r2 = r1
        L25:
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r2)
            if (r0 == 0) goto L33
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f1142a
            if (r0 != 0) goto L30
            goto L6f
        L30:
            r0.b = r4
            return
        L33:
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.f1142a
            androidx.compose.foundation.text.UndoManager$Entry r2 = new androidx.compose.foundation.text.UndoManager$Entry
            r2.<init>(r0, r4)
            r3.f1142a = r2
            r3.b = r1
            int r0 = r3.c
            androidx.compose.ui.text.AnnotatedString r4 = r4.f2127a
            java.lang.String r4 = r4.e
            int r4 = r4.length()
            int r4 = r4 + r0
            r3.c = r4
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r4 <= r0) goto L6f
            androidx.compose.foundation.text.UndoManager$Entry r4 = r3.f1142a
            if (r4 == 0) goto L57
            androidx.compose.foundation.text.UndoManager$Entry r0 = r4.f1143a
            goto L58
        L57:
            r0 = r1
        L58:
            if (r0 != 0) goto L5b
            goto L6f
        L5b:
            if (r4 == 0) goto L64
            androidx.compose.foundation.text.UndoManager$Entry r0 = r4.f1143a
            if (r0 == 0) goto L64
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.f1143a
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 == 0) goto L6a
            androidx.compose.foundation.text.UndoManager$Entry r4 = r4.f1143a
            goto L5b
        L6a:
            if (r4 != 0) goto L6d
            goto L6f
        L6d:
            r4.f1143a = r1
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.a(androidx.compose.ui.text.input.TextFieldValue):void");
    }
}
