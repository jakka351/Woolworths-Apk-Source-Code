package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextToolbarStatus {
    public static final TextToolbarStatus d;
    public static final TextToolbarStatus e;
    public static final /* synthetic */ TextToolbarStatus[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        TextToolbarStatus textToolbarStatus = new TextToolbarStatus("Shown", 0);
        d = textToolbarStatus;
        TextToolbarStatus textToolbarStatus2 = new TextToolbarStatus("Hidden", 1);
        e = textToolbarStatus2;
        TextToolbarStatus[] textToolbarStatusArr = {textToolbarStatus, textToolbarStatus2};
        f = textToolbarStatusArr;
        g = EnumEntriesKt.a(textToolbarStatusArr);
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) f.clone();
    }
}
