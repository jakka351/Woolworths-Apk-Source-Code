package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class StaticTextSelectionParams {
    public static final StaticTextSelectionParams c = new StaticTextSelectionParams(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final LayoutCoordinates f1194a;
    public final TextLayoutResult b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.f1194a = layoutCoordinates;
        this.b = textLayoutResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.layout.LayoutCoordinates] */
    public static StaticTextSelectionParams a(StaticTextSelectionParams staticTextSelectionParams, NodeCoordinator nodeCoordinator, TextLayoutResult textLayoutResult, int i) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        if ((i & 1) != 0) {
            nodeCoordinator2 = staticTextSelectionParams.f1194a;
        }
        if ((i & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.b;
        }
        return new StaticTextSelectionParams(nodeCoordinator2, textLayoutResult);
    }

    public final AndroidPath b(int i, int i2) {
        TextLayoutResult textLayoutResult = this.b;
        if (textLayoutResult != null) {
            return textLayoutResult.i(i, i2);
        }
        return null;
    }

    public final boolean c() {
        TextLayoutResult textLayoutResult = this.b;
        if (textLayoutResult == null || textLayoutResult.f2064a.f == 3) {
            return false;
        }
        return ((float) ((int) (textLayoutResult.c >> 32))) < textLayoutResult.b.d || textLayoutResult.d();
    }

    /* renamed from: d, reason: from getter */
    public final TextLayoutResult getB() {
        return this.b;
    }
}
