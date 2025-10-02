package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class SelectionMode {
    public static final /* synthetic */ SelectionMode[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        SelectionMode[] selectionModeArr = {new SelectionMode() { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        }, new SelectionMode() { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        }};
        d = selectionModeArr;
        e = EnumEntriesKt.a(selectionModeArr);
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) d.clone();
    }
}
