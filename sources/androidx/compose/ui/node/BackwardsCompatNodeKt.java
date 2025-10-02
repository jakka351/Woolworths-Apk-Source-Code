package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackwardsCompatNodeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 f1903a = new BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1();
    public static final Function1 b = null;
    public static final Function1 c = null;

    public static final boolean a(BackwardsCompatNode backwardsCompatNode) {
        TailModifierNode tailModifierNode = DelegatableNodeKt.g(backwardsCompatNode).K.d;
        Intrinsics.f(tailModifierNode, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return tailModifierNode.r;
    }
}
