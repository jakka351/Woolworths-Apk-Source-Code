package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnterExitState {
    public static final EnterExitState d;
    public static final EnterExitState e;
    public static final EnterExitState f;
    public static final /* synthetic */ EnterExitState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        d = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        e = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        f = enterExitState3;
        EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        g = enterExitStateArr;
        h = EnumEntriesKt.a(enterExitStateArr);
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) g.clone();
    }
}
