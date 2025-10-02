package kotlin.io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnErrorAction {
    public static final /* synthetic */ OnErrorAction[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        OnErrorAction[] onErrorActionArr = {new OnErrorAction("SKIP", 0), new OnErrorAction("TERMINATE", 1)};
        d = onErrorActionArr;
        e = EnumEntriesKt.a(onErrorActionArr);
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) d.clone();
    }
}
