package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MultiWidgetSelectionDelegateKt {
    public static final Direction a(Direction direction, Direction direction2, SelectionLayoutBuilder selectionLayoutBuilder, long j, Selection.AnchorInfo anchorInfo) {
        if (anchorInfo == null) {
            return SelectionLayoutKt.b(direction, direction2);
        }
        int iCompare = selectionLayoutBuilder.f.compare(Long.valueOf(anchorInfo.c), Long.valueOf(j));
        return iCompare < 0 ? Direction.d : iCompare > 0 ? Direction.f : Direction.e;
    }

    public static final int b(long j, TextLayoutResult textLayoutResult) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        MultiParagraph multiParagraph = textLayoutResult.b;
        return fIntBitsToFloat >= multiParagraph.e ? textLayoutResult.f2064a.f2063a.e.length() : multiParagraph.g(j);
    }
}
