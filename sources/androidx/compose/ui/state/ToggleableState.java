package androidx.compose.ui.state;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToggleableState {
    public static final ToggleableState d;
    public static final ToggleableState e;
    public static final ToggleableState f;
    public static final /* synthetic */ ToggleableState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ToggleableState toggleableState = new ToggleableState("On", 0);
        d = toggleableState;
        ToggleableState toggleableState2 = new ToggleableState("Off", 1);
        e = toggleableState2;
        ToggleableState toggleableState3 = new ToggleableState("Indeterminate", 2);
        f = toggleableState3;
        ToggleableState[] toggleableStateArr = {toggleableState, toggleableState2, toggleableState3};
        g = toggleableStateArr;
        h = EnumEntriesKt.a(toggleableStateArr);
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) g.clone();
    }
}
