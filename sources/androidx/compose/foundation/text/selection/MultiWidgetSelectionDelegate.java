package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {

    /* renamed from: a, reason: collision with root package name */
    public final long f1202a;
    public final Function0 b;
    public final Function0 c;
    public TextLayoutResult e;
    public final MultiWidgetSelectionDelegate d = this;
    public int f = -1;

    public MultiWidgetSelectionDelegate(long j, Function0 function0, Function0 function02) {
        this.f1202a = j;
        this.b = function0;
        this.c = function02;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final LayoutCoordinates a() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.b.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.q()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float b(int i) {
        MultiParagraph multiParagraph;
        int iD;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult != null && (iD = (multiParagraph = textLayoutResult.b).d(i)) < multiParagraph.f) {
            return textLayoutResult.e(iD);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float c(int i) {
        MultiParagraph multiParagraph;
        int iD;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult != null && (iD = (multiParagraph = textLayoutResult.b).d(i)) < multiParagraph.f) {
            return textLayoutResult.f(iD);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long d(Selection selection, boolean z) {
        TextLayoutResult textLayoutResult;
        Selection.AnchorInfo anchorInfo = selection.b;
        Selection.AnchorInfo anchorInfo2 = selection.f1204a;
        long j = this.f1202a;
        if (z && anchorInfo2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && anchorInfo.c != j) || a() == null || (textLayoutResult = (TextLayoutResult) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return TextSelectionDelegateKt.a(textLayoutResult, RangesKt.c(z ? anchorInfo2.b : anchorInfo.b, 0, k(textLayoutResult)), z, selection.c);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final int e() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return k(textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float f(int i) {
        MultiParagraph multiParagraph;
        int iD;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null || (iD = (multiParagraph = textLayoutResult.b).d(i)) >= multiParagraph.f) {
            return -1.0f;
        }
        float f = multiParagraph.f(iD);
        return ((multiParagraph.b(iD) - f) / 2) + f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: g, reason: from getter */
    public final long getF1202a() {
        return this.f1202a;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        return textLayoutResult == null ? new AnnotatedString("") : textLayoutResult.f2064a.f2063a;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Selection h() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        int length = textLayoutResult.f2064a.f2063a.e.length();
        ResolvedTextDirection resolvedTextDirectionA = textLayoutResult.a(0);
        long j = this.f1202a;
        return new Selection(new Selection.AnchorInfo(resolvedTextDirectionA, 0, j), new Selection.AnchorInfo(textLayoutResult.a(Math.max(length - 1, 0)), length, j), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x029e, code lost:
    
        r9 = java.lang.Long.hashCode(r29[r4]) * r17;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r24 = r0.c(r10);
        r10 = r10 & r8;
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02bf, code lost:
    
        if ((((r24 - r10) & r8) / 8) != (((r4 - r10) & r8) / 8)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c1, code lost:
    
        r6[r5] = ((~(255 << r23)) & r6[r5]) | ((r9 & 127) << r23);
        r6[r6.length - 1] = (r6[0] & r34) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
    
        r11 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e3, code lost:
    
        r33 = r4;
        r4 = r24 >> 3;
        r10 = r6[r4];
        r5 = (r24 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02f5, code lost:
    
        if (((r10 >> r5) & 255) != 128) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f7, code lost:
    
        r6[r4] = ((~(255 << r5)) & r10) | ((r9 & 127) << r5);
        r6[r5] = (r6[r5] & (~(255 << r23))) | (128 << r23);
        r29[r24] = r29[r33];
        r29[r33] = 0;
        r30[r24] = r30[r33];
        r30[r33] = 0;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0322, code lost:
    
        r6[r4] = ((~(255 << r5)) & r10) | ((r9 & 127) << r5);
        r4 = r29[r24];
        r29[r24] = r29[r33];
        r29[r33] = r4;
        r4 = r30[r24];
        r30[r24] = r30[r33];
        r30[r33] = r4;
        r4 = r33 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0345, code lost:
    
        r6[r6.length - 1] = (r6[0] & r34) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0353, code lost:
    
        r0.f = androidx.collection.ScatterMapKt.a(r0.d) - r0.e;
        r20 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0360, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0364, code lost:
    
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0369, code lost:
    
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x036c, code lost:
    
        r4 = androidx.collection.ScatterMapKt.c(r0.d);
        r5 = r0.f682a;
        r6 = r0.b;
        r8 = r0.c;
        r9 = r0.d;
        r0.d(r4);
        r4 = r0.f682a;
        r10 = r0.b;
        r11 = r0.c;
        r12 = r0.d;
        r20 = 255;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0389, code lost:
    
        if (r15 >= r9) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0399, code lost:
    
        if (((r5[r15 >> 3] >> ((r15 & 7) << 3)) & 255) >= r25) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x039b, code lost:
    
        r22 = r6[r15];
        r16 = java.lang.Long.hashCode(r22) * r17;
        r16 = r16 ^ (r16 << 16);
        r24 = r2;
        r2 = r0.c(r16 >>> 7);
        r2 = r16 & 127;
        r28 = r4;
        r16 = r5;
        r4 = r2;
        r2 = r2 >> 3;
        r29 = (r2 & 7) << 3;
        r4 = (r28[r2] & (~(255 << r29))) | (r4 << r29);
        r28[r2] = r4;
        r28[(((r2 - 7) & r12) + (r12 & 7)) >> 3] = r4;
        r10[r2] = r22;
        r11[r2] = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03df, code lost:
    
        r24 = r2;
        r28 = r4;
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03e5, code lost:
    
        r15 = r15 + 1;
        r5 = r16;
        r2 = r24;
        r4 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03ee, code lost:
    
        r6 = r0.c(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03f2, code lost:
    
        r0.e++;
        r2 = r0.f;
        r4 = r0.f682a;
        r5 = r6 >> 3;
        r7 = r4[r5];
        r9 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x040a, code lost:
    
        if (((r7 >> r9) & r20) != r25) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x040c, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x040f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0411, code lost:
    
        r0.f = r2 - r11;
        r2 = r0.d;
        r7 = (r7 & (~(r20 << r9))) | (r13 << r9);
        r4[r5] = r7;
        r4[(((r6 - 7) & r2) + (r2 & 7)) >> 3] = r7;
        r2 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        r23 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ec, code lost:
    
        if (((((~r11) << 6) & r11) & r23) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ee, code lost:
    
        r6 = r0.c(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f8, code lost:
    
        if (r0.f != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020c, code lost:
    
        if (((r0.f682a[r6 >> 3] >> ((r6 & 7) << 3)) & 255) != 254) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020e, code lost:
    
        r24 = r2;
        r31 = r4;
        r20 = 255;
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021a, code lost:
    
        r6 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021c, code lost:
    
        if (r6 <= 8) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021e, code lost:
    
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0232, code lost:
    
        if (java.lang.Long.compareUnsigned(r0.e * 32, r6 * 25) > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0234, code lost:
    
        r6 = r0.f682a;
        r8 = r0.d;
        r9 = r0.b;
        r10 = r0.c;
        r11 = (r8 + 7) >> 3;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0244, code lost:
    
        if (r12 >= r11) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0246, code lost:
    
        r31 = r4;
        r4 = r6[r12] & r23;
        r6[r12] = (-72340172838076674L) & ((~r4) + (r4 >>> 7));
        r12 = r12 + 1;
        r9 = r9;
        r10 = r10;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0265, code lost:
    
        r31 = r4;
        r29 = r9;
        r30 = r10;
        r4 = kotlin.collections.ArraysKt.J(r6);
        r5 = r4 - 1;
        r11 = 72057594037927935L;
        r6[r5] = (r6[r5] & 72057594037927935L) | (-72057594037927936L);
        r6[r4] = r6[0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0285, code lost:
    
        if (r4 == r8) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0287, code lost:
    
        r5 = r4 >> 3;
        r23 = (r4 & 7) << 3;
        r9 = (r6[r5] >> r23) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0294, code lost:
    
        if (r9 != 128) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0296, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029b, code lost:
    
        if (r9 == 254) goto L136;
     */
    @Override // androidx.compose.foundation.text.selection.Selectable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.compose.foundation.text.selection.SelectionLayoutBuilder r44) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate.i(androidx.compose.foundation.text.selection.SelectionLayoutBuilder):void");
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long j(int i) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.c.invoke();
        if (textLayoutResult == null) {
            int i2 = TextRange.c;
            return TextRange.b;
        }
        MultiParagraph multiParagraph = textLayoutResult.b;
        int iK = k(textLayoutResult);
        if (iK < 1) {
            int i3 = TextRange.c;
            return TextRange.b;
        }
        int iD = multiParagraph.d(RangesKt.c(i, 0, iK - 1));
        return TextRangeKt.a(textLayoutResult.g(iD), multiParagraph.c(iD, true));
    }

    public final int k(TextLayoutResult textLayoutResult) {
        int i;
        int iE;
        synchronized (this.d) {
            try {
                if (this.e != textLayoutResult) {
                    if (textLayoutResult.d()) {
                        MultiParagraph multiParagraph = textLayoutResult.b;
                        if (multiParagraph.c) {
                            iE = textLayoutResult.b.f - 1;
                            this.f = textLayoutResult.b.c(iE, true);
                            this.e = textLayoutResult;
                        } else {
                            iE = multiParagraph.e((int) (textLayoutResult.c & 4294967295L));
                            int i2 = textLayoutResult.b.f - 1;
                            if (iE > i2) {
                                iE = i2;
                            }
                            while (iE >= 0 && textLayoutResult.b.f(iE) >= ((int) (textLayoutResult.c & 4294967295L))) {
                                iE--;
                            }
                            if (iE < 0) {
                                iE = 0;
                            }
                            this.f = textLayoutResult.b.c(iE, true);
                            this.e = textLayoutResult;
                        }
                    } else {
                        iE = textLayoutResult.b.f - 1;
                        this.f = textLayoutResult.b.c(iE, true);
                        this.e = textLayoutResult;
                    }
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
