package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusStateImpl implements FocusState {
    public static final FocusStateImpl d;
    public static final FocusStateImpl e;
    public static final FocusStateImpl f;
    public static final FocusStateImpl g;
    public static final /* synthetic */ FocusStateImpl[] h;
    public static final /* synthetic */ EnumEntries i;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        d = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        e = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        f = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Inactive", 3);
        g = focusStateImpl4;
        FocusStateImpl[] focusStateImplArr = {focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
        h = focusStateImplArr;
        i = EnumEntriesKt.a(focusStateImplArr);
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) h.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
