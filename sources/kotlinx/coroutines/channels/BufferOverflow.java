package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BufferOverflow {
    public static final BufferOverflow d;
    public static final BufferOverflow e;
    public static final BufferOverflow f;
    public static final /* synthetic */ BufferOverflow[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        BufferOverflow bufferOverflow = new BufferOverflow("SUSPEND", 0);
        d = bufferOverflow;
        BufferOverflow bufferOverflow2 = new BufferOverflow("DROP_OLDEST", 1);
        e = bufferOverflow2;
        BufferOverflow bufferOverflow3 = new BufferOverflow("DROP_LATEST", 2);
        f = bufferOverflow3;
        BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        g = bufferOverflowArr;
        h = EnumEntriesKt.a(bufferOverflowArr);
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) g.clone();
    }
}
