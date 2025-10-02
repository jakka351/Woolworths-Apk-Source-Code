package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/reactive/Mode;", "", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Mode {
    public static final Mode e;
    public static final Mode f;
    public static final Mode g;
    public static final Mode h;
    public static final /* synthetic */ Mode[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    static {
        Mode mode = new Mode("FIRST", 0, "awaitFirst");
        e = mode;
        Mode mode2 = new Mode("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        f = mode2;
        Mode mode3 = new Mode("LAST", 2, "awaitLast");
        Mode mode4 = new Mode("SINGLE", 3, "awaitSingle");
        g = mode4;
        Mode mode5 = new Mode("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");
        h = mode5;
        Mode[] modeArr = {mode, mode2, mode3, mode4, mode5};
        i = modeArr;
        j = EnumEntriesKt.a(modeArr);
    }

    public Mode(String str, int i2, String str2) {
        this.d = str2;
    }

    public static Mode valueOf(String str) {
        return (Mode) Enum.valueOf(Mode.class, str);
    }

    public static Mode[] values() {
        return (Mode[]) i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
