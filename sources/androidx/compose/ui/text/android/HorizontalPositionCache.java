package androidx.compose.ui.text.android;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HorizontalPositionCache {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayout f2071a;
    public int b = -1;
    public float c;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.f2071a = textLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            androidx.compose.ui.text.android.TextLayout r2 = r5.f2071a
            if (r7 == 0) goto L1b
            android.text.Layout r3 = r2.f
            int r3 = androidx.compose.ui.text.android.LayoutCompat_androidKt.a(r3, r6, r7)
            android.text.Layout r4 = r2.f
            int r4 = r4.getLineStart(r3)
            int r3 = r2.g(r3)
            if (r6 == r4) goto L1d
            if (r6 != r3) goto L1b
            goto L1d
        L1b:
            r3 = r1
            goto L1e
        L1d:
            r3 = r0
        L1e:
            int r4 = r6 * 4
            if (r9 == 0) goto L26
            if (r3 == 0) goto L2b
            r0 = r1
            goto L2b
        L26:
            if (r3 == 0) goto L2a
            r0 = 2
            goto L2b
        L2a:
            r0 = 3
        L2b:
            int r4 = r4 + r0
            int r0 = r5.b
            if (r0 != r4) goto L33
            float r6 = r5.c
            return r6
        L33:
            if (r9 == 0) goto L3a
            float r6 = r2.i(r6, r7)
            goto L3e
        L3a:
            float r6 = r2.j(r6, r7)
        L3e:
            if (r8 == 0) goto L44
            r5.b = r4
            r5.c = r6
        L44:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.HorizontalPositionCache.a(int, boolean, boolean, boolean):float");
    }

    public final float b(int i) {
        return a(i, false, false, true);
    }

    public final float c(int i) {
        return a(i, true, true, true);
    }

    public final float d(int i) {
        return a(i, false, false, false);
    }

    public final float e(int i) {
        return a(i, true, true, false);
    }
}
