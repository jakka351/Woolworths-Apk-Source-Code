package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldEditUndoBehavior {
    public static final /* synthetic */ TextFieldEditUndoBehavior[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = {new TextFieldEditUndoBehavior("MergeIfPossible", 0), new TextFieldEditUndoBehavior("ClearHistory", 1), new TextFieldEditUndoBehavior("NeverMerge", 2)};
        d = textFieldEditUndoBehaviorArr;
        e = EnumEntriesKt.a(textFieldEditUndoBehaviorArr);
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) d.clone();
    }
}
