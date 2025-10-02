package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Handle {
    public static final Handle d;
    public static final Handle e;
    public static final Handle f;
    public static final /* synthetic */ Handle[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        Handle handle = new Handle("Cursor", 0);
        d = handle;
        Handle handle2 = new Handle("SelectionStart", 1);
        e = handle2;
        Handle handle3 = new Handle("SelectionEnd", 2);
        f = handle3;
        Handle[] handleArr = {handle, handle2, handle3};
        g = handleArr;
        h = EnumEntriesKt.a(handleArr);
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) g.clone();
    }
}
