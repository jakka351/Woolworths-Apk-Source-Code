package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionHandleAnchor {
    public static final SelectionHandleAnchor d;
    public static final SelectionHandleAnchor e;
    public static final SelectionHandleAnchor f;
    public static final /* synthetic */ SelectionHandleAnchor[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        SelectionHandleAnchor selectionHandleAnchor = new SelectionHandleAnchor("Left", 0);
        d = selectionHandleAnchor;
        SelectionHandleAnchor selectionHandleAnchor2 = new SelectionHandleAnchor("Middle", 1);
        e = selectionHandleAnchor2;
        SelectionHandleAnchor selectionHandleAnchor3 = new SelectionHandleAnchor("Right", 2);
        f = selectionHandleAnchor3;
        SelectionHandleAnchor[] selectionHandleAnchorArr = {selectionHandleAnchor, selectionHandleAnchor2, selectionHandleAnchor3};
        g = selectionHandleAnchorArr;
        h = EnumEntriesKt.a(selectionHandleAnchorArr);
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) g.clone();
    }
}
