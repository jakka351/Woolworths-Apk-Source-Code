package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoroutineStart {
    public static final CoroutineStart d;
    public static final CoroutineStart e;
    public static final CoroutineStart f;
    public static final CoroutineStart g;
    public static final /* synthetic */ CoroutineStart[] h;
    public static final /* synthetic */ EnumEntries i;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CoroutineStart coroutineStart = CoroutineStart.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CoroutineStart coroutineStart2 = CoroutineStart.d;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CoroutineStart coroutineStart3 = CoroutineStart.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        CoroutineStart coroutineStart = new CoroutineStart("DEFAULT", 0);
        d = coroutineStart;
        CoroutineStart coroutineStart2 = new CoroutineStart("LAZY", 1);
        e = coroutineStart2;
        CoroutineStart coroutineStart3 = new CoroutineStart("ATOMIC", 2);
        f = coroutineStart3;
        CoroutineStart coroutineStart4 = new CoroutineStart("UNDISPATCHED", 3);
        g = coroutineStart4;
        CoroutineStart[] coroutineStartArr = {coroutineStart, coroutineStart2, coroutineStart3, coroutineStart4};
        h = coroutineStartArr;
        i = EnumEntriesKt.a(coroutineStartArr);
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) h.clone();
    }
}
