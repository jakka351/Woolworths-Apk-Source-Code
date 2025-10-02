package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "currentRawLine", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectionAdjustmentKt {
    public static final Selection a(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z = selectionLayout.c() == CrossStatus.d;
        return new Selection(c(selectionLayout.g(), z, true, selectionLayout.getC(), boundaryFunction), c(selectionLayout.f(), z, false, selectionLayout.getD(), boundaryFunction), z);
    }

    public static final Selection.AnchorInfo b(final SelectionLayout selectionLayout, final SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        final int i = selectionLayout.getE() ? selectableInfo.c : selectableInfo.d;
        int c = selectionLayout.getE() ? selectionLayout.getC() : selectionLayout.getD();
        int i2 = selectableInfo.b;
        TextLayoutResult textLayoutResult = selectableInfo.f;
        int i3 = selectableInfo.e;
        if (c != i2) {
            return selectableInfo.a(i);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        final Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLayoutResult textLayoutResult2 = selectableInfo.f;
                return Integer.valueOf(textLayoutResult2.b.d(i));
            }
        });
        final int i4 = selectionLayout.getE() ? selectableInfo.d : selectableInfo.c;
        Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new Function0<Selection.AnchorInfo>() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue = ((Number) lazyA.getD()).intValue();
                SelectionLayout selectionLayout2 = selectionLayout;
                boolean e = selectionLayout2.getE();
                boolean z = selectionLayout2.c() == CrossStatus.d;
                SelectableInfo selectableInfo2 = selectableInfo;
                TextLayoutResult textLayoutResult2 = selectableInfo2.f;
                int i5 = i;
                long j = textLayoutResult2.j(i5);
                TextLayoutResult textLayoutResult3 = selectableInfo2.f;
                MultiParagraph multiParagraph = textLayoutResult3.b;
                int i6 = TextRange.c;
                int iG = (int) (j >> 32);
                int iD = multiParagraph.d(iG);
                int i7 = multiParagraph.f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i7 ? textLayoutResult3.g(i7 - 1) : textLayoutResult3.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (multiParagraph.d(iC) != iIntValue) {
                    iC = iIntValue >= i7 ? multiParagraph.c(i7 - 1, false) : multiParagraph.c(iIntValue, false);
                }
                int i8 = i4;
                if (iG == i8) {
                    return selectableInfo2.a(iC);
                }
                if (iC == i8) {
                    return selectableInfo2.a(iG);
                }
                if (!(e ^ z) ? i5 >= iG : i5 > iC) {
                    iG = iC;
                }
                return selectableInfo2.a(iG);
            }
        });
        if (selectableInfo.f1203a != anchorInfo.c) {
            return (Selection.AnchorInfo) lazyA2.getD();
        }
        if (i == i3) {
            return anchorInfo;
        }
        if (((Number) lazyA.getD()).intValue() != textLayoutResult.b.d(i3)) {
            return (Selection.AnchorInfo) lazyA2.getD();
        }
        int i5 = anchorInfo.b;
        long j = textLayoutResult.j(i5);
        boolean e = selectionLayout.getE();
        if (i3 != -1) {
            if (i != i3) {
                if (!(e ^ (selectableInfo.b() == CrossStatus.d))) {
                }
            }
            return selectableInfo.a(i);
        }
        int i6 = TextRange.c;
        return (i5 == ((int) (j >> 32)) || i5 == ((int) (j & 4294967295L))) ? (Selection.AnchorInfo) lazyA2.getD() : selectableInfo.a(i);
    }

    public static final Selection.AnchorInfo c(SelectableInfo selectableInfo, boolean z, boolean z2, int i, BoundaryFunction boundaryFunction) {
        long j;
        int i2 = z2 ? selectableInfo.c : selectableInfo.d;
        if (i != selectableInfo.b) {
            return selectableInfo.a(i2);
        }
        long jA = boundaryFunction.a(selectableInfo, i2);
        if (z ^ z2) {
            int i3 = TextRange.c;
            j = jA >> 32;
        } else {
            int i4 = TextRange.c;
            j = 4294967295L & jA;
        }
        return selectableInfo.a((int) j);
    }

    public static final Selection.AnchorInfo d(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i) {
        return new Selection.AnchorInfo(selectableInfo.f.a(i), i, anchorInfo.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.text.selection.Selection e(androidx.compose.foundation.text.selection.Selection r8, androidx.compose.foundation.text.selection.SelectionLayout r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionAdjustmentKt.e(androidx.compose.foundation.text.selection.Selection, androidx.compose.foundation.text.selection.SelectionLayout):androidx.compose.foundation.text.selection.Selection");
    }
}
