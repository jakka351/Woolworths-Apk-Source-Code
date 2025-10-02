package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WriteMode {
    public static final WriteMode f;
    public static final WriteMode g;
    public static final WriteMode h;
    public static final WriteMode i;
    public static final /* synthetic */ WriteMode[] j;
    public static final /* synthetic */ EnumEntries k;
    public final char d;
    public final char e;

    static {
        WriteMode writeMode = new WriteMode("OBJ", 0, '{', '}');
        f = writeMode;
        WriteMode writeMode2 = new WriteMode("LIST", 1, '[', ']');
        g = writeMode2;
        WriteMode writeMode3 = new WriteMode("MAP", 2, '{', '}');
        h = writeMode3;
        WriteMode writeMode4 = new WriteMode("POLY_OBJ", 3, '[', ']');
        i = writeMode4;
        WriteMode[] writeModeArr = {writeMode, writeMode2, writeMode3, writeMode4};
        j = writeModeArr;
        k = EnumEntriesKt.a(writeModeArr);
    }

    public WriteMode(String str, int i2, char c, char c2) {
        this.d = c;
        this.e = c2;
    }

    public static WriteMode valueOf(String str) {
        return (WriteMode) Enum.valueOf(WriteMode.class, str);
    }

    public static WriteMode[] values() {
        return (WriteMode[]) j.clone();
    }
}
