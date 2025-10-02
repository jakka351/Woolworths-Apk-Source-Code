package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HandleState {
    public static final HandleState d;
    public static final HandleState e;
    public static final HandleState f;
    public static final /* synthetic */ HandleState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        HandleState handleState = new HandleState("None", 0);
        d = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        e = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        f = handleState3;
        HandleState[] handleStateArr = {handleState, handleState2, handleState3};
        g = handleStateArr;
        h = EnumEntriesKt.a(handleStateArr);
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) g.clone();
    }
}
