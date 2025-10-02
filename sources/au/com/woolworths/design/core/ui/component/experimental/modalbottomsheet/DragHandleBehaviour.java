package au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/modalbottomsheet/DragHandleBehaviour;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DragHandleBehaviour {
    public static final DragHandleBehaviour d;
    public static final DragHandleBehaviour e;
    public static final DragHandleBehaviour f;
    public static final /* synthetic */ DragHandleBehaviour[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        DragHandleBehaviour dragHandleBehaviour = new DragHandleBehaviour("Visible", 0);
        d = dragHandleBehaviour;
        DragHandleBehaviour dragHandleBehaviour2 = new DragHandleBehaviour("Hidden", 1);
        e = dragHandleBehaviour2;
        DragHandleBehaviour dragHandleBehaviour3 = new DragHandleBehaviour("None", 2);
        f = dragHandleBehaviour3;
        DragHandleBehaviour[] dragHandleBehaviourArr = {dragHandleBehaviour, dragHandleBehaviour2, dragHandleBehaviour3};
        g = dragHandleBehaviourArr;
        h = EnumEntriesKt.a(dragHandleBehaviourArr);
    }

    public static DragHandleBehaviour valueOf(String str) {
        return (DragHandleBehaviour) Enum.valueOf(DragHandleBehaviour.class, str);
    }

    public static DragHandleBehaviour[] values() {
        return (DragHandleBehaviour[]) g.clone();
    }
}
