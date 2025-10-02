package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphKt;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.TextLayoutResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextSelectionDelegateKt {
    public static final long a(TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        MultiParagraph multiParagraph = textLayoutResult.b;
        long j = textLayoutResult.c;
        if (multiParagraph.d(i) >= multiParagraph.f) {
            return 9205357640488583168L;
        }
        boolean z3 = textLayoutResult.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == textLayoutResult.h(i);
        ArrayList arrayList = multiParagraph.h;
        multiParagraph.k(i);
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == multiParagraph.f2045a.f2046a.e.length() ? CollectionsKt.I(arrayList) : MultiParagraphKt.a(i, arrayList));
        return (Float.floatToRawIntBits(RangesKt.b(paragraphInfo.f2047a.e(paragraphInfo.d(i), z3), BitmapDescriptorFactory.HUE_RED, (int) (j >> 32))) << 32) | (Float.floatToRawIntBits(RangesKt.b(multiParagraph.b(r3), BitmapDescriptorFactory.HUE_RED, (int) (j & 4294967295L))) & 4294967295L);
    }
}
