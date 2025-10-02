package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TraversableNode extends DelegatableNode {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion;", "", "TraverseDescendantsAction", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TraverseDescendantsAction {
            public static final TraverseDescendantsAction d;
            public static final TraverseDescendantsAction e;
            public static final TraverseDescendantsAction f;
            public static final /* synthetic */ TraverseDescendantsAction[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                TraverseDescendantsAction traverseDescendantsAction = new TraverseDescendantsAction("ContinueTraversal", 0);
                d = traverseDescendantsAction;
                TraverseDescendantsAction traverseDescendantsAction2 = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
                e = traverseDescendantsAction2;
                TraverseDescendantsAction traverseDescendantsAction3 = new TraverseDescendantsAction("CancelTraversal", 2);
                f = traverseDescendantsAction3;
                TraverseDescendantsAction[] traverseDescendantsActionArr = {traverseDescendantsAction, traverseDescendantsAction2, traverseDescendantsAction3};
                g = traverseDescendantsActionArr;
                h = EnumEntriesKt.a(traverseDescendantsActionArr);
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) g.clone();
            }
        }
    }

    Object W0();
}
