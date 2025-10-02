package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextEditType {
    public static final TextEditType d;
    public static final TextEditType e;
    public static final TextEditType f;
    public static final /* synthetic */ TextEditType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        TextEditType textEditType = new TextEditType("Insert", 0);
        d = textEditType;
        TextEditType textEditType2 = new TextEditType("Delete", 1);
        e = textEditType2;
        TextEditType textEditType3 = new TextEditType("Replace", 2);
        f = textEditType3;
        TextEditType[] textEditTypeArr = {textEditType, textEditType2, textEditType3};
        g = textEditTypeArr;
        h = EnumEntriesKt.a(textEditTypeArr);
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) g.clone();
    }
}
