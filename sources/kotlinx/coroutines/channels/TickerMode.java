package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ObsoleteCoroutinesApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TickerMode {
    public static final /* synthetic */ TickerMode[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        TickerMode[] tickerModeArr = {new TickerMode("FIXED_PERIOD", 0), new TickerMode("FIXED_DELAY", 1)};
        d = tickerModeArr;
        e = EnumEntriesKt.a(tickerModeArr);
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) d.clone();
    }
}
