package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class RtlBoundsComparator implements Comparator<SemanticsNode> {
    public static final RtlBoundsComparator d = new RtlBoundsComparator();

    @Override // java.util.Comparator
    public final int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        Rect rectF = semanticsNode.f();
        Rect rectF2 = semanticsNode2.f();
        int iCompare = Float.compare(rectF2.c, rectF.c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(rectF.b, rectF2.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(rectF.d, rectF2.d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(rectF2.f1752a, rectF.f1752a);
    }
}
