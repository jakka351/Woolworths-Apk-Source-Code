package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ParagraphStyleKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2050a;
    public static final /* synthetic */ int b = 0;

    static {
        TextUnitType[] textUnitTypeArr = TextUnit.b;
        f2050a = TextUnit.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.ParagraphStyle a(androidx.compose.ui.text.ParagraphStyle r18, int r19, int r20, long r21, androidx.compose.ui.text.style.TextIndent r23, androidx.compose.ui.text.PlatformParagraphStyle r24, androidx.compose.ui.text.style.LineHeightStyle r25, int r26, int r27, androidx.compose.ui.text.style.TextMotion r28) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r13 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r15) goto L20
            r16 = 0
            goto L26
        L20:
            r16 = 0
            int r11 = r0.f2049a
            if (r1 != r11) goto L76
        L26:
            androidx.compose.ui.unit.TextUnitType[] r11 = androidx.compose.ui.unit.TextUnit.b
            long r11 = r3 & r13
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L2f
            goto L37
        L2f:
            long r11 = r0.c
            boolean r11 = androidx.compose.ui.unit.TextUnit.a(r3, r11)
            if (r11 == 0) goto L76
        L37:
            if (r5 == 0) goto L41
            androidx.compose.ui.text.style.TextIndent r11 = r0.d
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L76
        L41:
            if (r2 != r15) goto L44
            goto L48
        L44:
            int r11 = r0.b
            if (r2 != r11) goto L76
        L48:
            if (r6 == 0) goto L52
            androidx.compose.ui.text.PlatformParagraphStyle r11 = r0.e
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L76
        L52:
            if (r7 == 0) goto L5c
            androidx.compose.ui.text.style.LineHeightStyle r11 = r0.f
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L76
        L5c:
            if (r8 != 0) goto L5f
            goto L63
        L5f:
            int r11 = r0.g
            if (r8 != r11) goto L76
        L63:
            if (r9 != r15) goto L66
            goto L6a
        L66:
            int r11 = r0.h
            if (r9 != r11) goto L76
        L6a:
            if (r10 == 0) goto L75
            androidx.compose.ui.text.style.TextMotion r11 = r0.i
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L75
            goto L76
        L75:
            return r0
        L76:
            androidx.compose.ui.unit.TextUnitType[] r11 = androidx.compose.ui.unit.TextUnit.b
            long r11 = r3 & r13
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L80
            long r3 = r0.c
        L80:
            if (r5 != 0) goto L84
            androidx.compose.ui.text.style.TextIndent r5 = r0.d
        L84:
            if (r1 != r15) goto L88
            int r1 = r0.f2049a
        L88:
            if (r2 != r15) goto L8c
            int r2 = r0.b
        L8c:
            androidx.compose.ui.text.PlatformParagraphStyle r11 = r0.e
            if (r11 != 0) goto L91
            goto L94
        L91:
            if (r6 != 0) goto L94
            r6 = r11
        L94:
            if (r7 != 0) goto L98
            androidx.compose.ui.text.style.LineHeightStyle r7 = r0.f
        L98:
            if (r8 != 0) goto L9c
            int r8 = r0.g
        L9c:
            if (r9 != r15) goto La0
            int r9 = r0.h
        La0:
            if (r10 != 0) goto La5
            androidx.compose.ui.text.style.TextMotion r0 = r0.i
            r10 = r0
        La5:
            androidx.compose.ui.text.ParagraphStyle r0 = new androidx.compose.ui.text.ParagraphStyle
            r18 = r0
            r19 = r1
            r20 = r2
            r21 = r3
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyleKt.a(androidx.compose.ui.text.ParagraphStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }
}
