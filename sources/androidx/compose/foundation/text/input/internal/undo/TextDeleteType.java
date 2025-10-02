package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextDeleteType {
    public static final /* synthetic */ TextDeleteType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        TextDeleteType[] textDeleteTypeArr = {new TextDeleteType("Start", 0), new TextDeleteType("End", 1), new TextDeleteType("Inner", 2), new TextDeleteType("NotByUser", 3)};
        d = textDeleteTypeArr;
        e = EnumEntriesKt.a(textDeleteTypeArr);
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) d.clone();
    }
}
