package androidx.compose.foundation.text;

import android.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextContextMenuItems {
    public static final TextContextMenuItems e;
    public static final TextContextMenuItems f;
    public static final TextContextMenuItems g;
    public static final TextContextMenuItems h;
    public static final TextContextMenuItems i;
    public static final /* synthetic */ TextContextMenuItems[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int d;

    static {
        TextContextMenuItems textContextMenuItems = new TextContextMenuItems("Cut", 0, R.string.cut);
        e = textContextMenuItems;
        TextContextMenuItems textContextMenuItems2 = new TextContextMenuItems("Copy", 1, R.string.copy);
        f = textContextMenuItems2;
        TextContextMenuItems textContextMenuItems3 = new TextContextMenuItems("Paste", 2, R.string.paste);
        g = textContextMenuItems3;
        TextContextMenuItems textContextMenuItems4 = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);
        h = textContextMenuItems4;
        TextContextMenuItems textContextMenuItems5 = new TextContextMenuItems("Autofill", 4, R.string.autofill);
        i = textContextMenuItems5;
        TextContextMenuItems[] textContextMenuItemsArr = {textContextMenuItems, textContextMenuItems2, textContextMenuItems3, textContextMenuItems4, textContextMenuItems5};
        j = textContextMenuItemsArr;
        k = EnumEntriesKt.a(textContextMenuItemsArr);
    }

    public TextContextMenuItems(String str, int i2, int i3) {
        this.d = i3;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) j.clone();
    }
}
