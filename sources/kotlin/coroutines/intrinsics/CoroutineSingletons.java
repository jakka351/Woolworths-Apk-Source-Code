package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public final class CoroutineSingletons {
    public static final CoroutineSingletons d;
    public static final CoroutineSingletons e;
    public static final CoroutineSingletons f;
    public static final /* synthetic */ CoroutineSingletons[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        d = coroutineSingletons;
        CoroutineSingletons coroutineSingletons2 = new CoroutineSingletons("UNDECIDED", 1);
        e = coroutineSingletons2;
        CoroutineSingletons coroutineSingletons3 = new CoroutineSingletons("RESUMED", 2);
        f = coroutineSingletons3;
        CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
        g = coroutineSingletonsArr;
        h = EnumEntriesKt.a(coroutineSingletonsArr);
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) g.clone();
    }
}
