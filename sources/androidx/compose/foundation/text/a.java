package androidx.compose.foundation.text;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements TextRangeScopeMeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f1146a;
    public final /* synthetic */ AnnotatedString.Range b;

    public /* synthetic */ a(TextLinkScope textLinkScope, AnnotatedString.Range range) {
        this.f1146a = textLinkScope;
        this.b = range;
    }

    public final TextRangeLayoutMeasureResult a(TextRangeLayoutMeasureScope textRangeLayoutMeasureScope) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) ((SnapshotMutableStateImpl) this.f1146a.f1136a).getD();
        if (textLayoutResult == null) {
            return new TextRangeLayoutMeasureResult(0, 0, TextLinkScope$textRange$1$layoutResult$1.h);
        }
        AnnotatedString.Range rangeC = TextLinkScope.c(this.b, textLayoutResult);
        if (rangeC == null) {
            return new TextRangeLayoutMeasureResult(0, 0, TextLinkScope$textRange$1$updatedRange$1.h);
        }
        final IntRect intRectB = IntRectKt.b(textLayoutResult.i(rangeC.b, rangeC.c).getBounds());
        return new TextRangeLayoutMeasureResult(intRectB.d(), intRectB.b(), new Function0<IntOffset>() { // from class: androidx.compose.foundation.text.TextLinkScope$textRange$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new IntOffset(intRectB.c());
            }
        });
    }
}
