package au.com.woolworths.design.core.ui.component.stable;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/stable/CheckBoxState;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckBoxState {
    public static final CheckBoxState d;
    public static final CheckBoxState e;
    public static final CheckBoxState f;
    public static final /* synthetic */ CheckBoxState[] g;
    public static final /* synthetic */ EnumEntries h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CheckBoxState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckBoxState checkBoxState = CheckBoxState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckBoxState checkBoxState2 = CheckBoxState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        CheckBoxState checkBoxState = new CheckBoxState("Checked", 0);
        d = checkBoxState;
        CheckBoxState checkBoxState2 = new CheckBoxState("Unchecked", 1);
        e = checkBoxState2;
        CheckBoxState checkBoxState3 = new CheckBoxState("Mixed", 2);
        f = checkBoxState3;
        CheckBoxState[] checkBoxStateArr = {checkBoxState, checkBoxState2, checkBoxState3};
        g = checkBoxStateArr;
        h = EnumEntriesKt.a(checkBoxStateArr);
    }

    public static CheckBoxState valueOf(String str) {
        return (CheckBoxState) Enum.valueOf(CheckBoxState.class, str);
    }

    public static CheckBoxState[] values() {
        return (CheckBoxState[]) g.clone();
    }
}
