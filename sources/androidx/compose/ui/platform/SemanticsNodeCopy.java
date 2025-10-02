package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeCopy;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsNodeCopy {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsConfiguration f1981a;
    public final MutableIntSet b;

    public SemanticsNodeCopy(SemanticsNode semanticsNode, IntObjectMap intObjectMap) {
        this.f1981a = semanticsNode.d;
        this.b = new MutableIntSet(SemanticsNode.h(4, semanticsNode).size());
        List listH = SemanticsNode.h(4, semanticsNode);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) listH.get(i);
            if (intObjectMap.a(semanticsNode2.g)) {
                this.b.b(semanticsNode2.g);
            }
        }
    }
}
