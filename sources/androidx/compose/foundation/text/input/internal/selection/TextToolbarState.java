package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextToolbarState {
    public static final TextToolbarState d;
    public static final TextToolbarState e;
    public static final TextToolbarState f;
    public static final /* synthetic */ TextToolbarState[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        TextToolbarState textToolbarState = new TextToolbarState("None", 0);
        d = textToolbarState;
        TextToolbarState textToolbarState2 = new TextToolbarState("Cursor", 1);
        e = textToolbarState2;
        TextToolbarState textToolbarState3 = new TextToolbarState("Selection", 2);
        f = textToolbarState3;
        TextToolbarState[] textToolbarStateArr = {textToolbarState, textToolbarState2, textToolbarState3};
        g = textToolbarStateArr;
        h = EnumEntriesKt.a(textToolbarStateArr);
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) g.clone();
    }
}
