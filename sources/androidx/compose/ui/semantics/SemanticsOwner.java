package androidx.compose.ui.semantics;

import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SemanticsOwner {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f2019a;
    public final EmptySemanticsModifier b;
    public final IntObjectMap c;
    public final MutableObjectList d = new MutableObjectList(2);

    public SemanticsOwner(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, MutableIntObjectMap mutableIntObjectMap) {
        this.f2019a = layoutNode;
        this.b = emptySemanticsModifier;
        this.c = mutableIntObjectMap;
    }

    public final SemanticsNode a() {
        return new SemanticsNode(this.b, false, this.f2019a, new SemanticsConfiguration());
    }
}
