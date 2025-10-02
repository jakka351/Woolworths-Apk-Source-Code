package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyThreadSafetyMode {
    public static final LazyThreadSafetyMode d;
    public static final LazyThreadSafetyMode e;
    public static final /* synthetic */ LazyThreadSafetyMode[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        d = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        e = lazyThreadSafetyMode3;
        LazyThreadSafetyMode[] lazyThreadSafetyModeArr = {lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
        f = lazyThreadSafetyModeArr;
        g = EnumEntriesKt.a(lazyThreadSafetyModeArr);
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f.clone();
    }
}
