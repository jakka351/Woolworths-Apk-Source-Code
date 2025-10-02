package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StringHelpers_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(int r4, java.lang.String r5) {
        /*
            boolean r0 = androidx.emoji2.text.EmojiCompat.g()
            r1 = 0
            if (r0 == 0) goto L13
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.a()
            int r2 = r0.d()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L23
            int r0 = r0.b(r4, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            if (r1 == 0) goto L2a
            int r4 = r1.intValue()
            return r4
        L2a:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.following(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.a(int, java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(int r4, java.lang.String r5) {
        /*
            boolean r0 = androidx.emoji2.text.EmojiCompat.g()
            r1 = 0
            if (r0 == 0) goto L13
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.a()
            int r2 = r0.d()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2a
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.c(r2, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 == 0) goto L31
            int r4 = r1.intValue()
            return r4
        L31:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.b(int, java.lang.String):int");
    }
}
