package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidationResult {
    public static final InvalidationResult d;
    public static final InvalidationResult e;
    public static final InvalidationResult f;
    public static final InvalidationResult g;
    public static final /* synthetic */ InvalidationResult[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        d = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        e = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        f = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        g = invalidationResult4;
        InvalidationResult[] invalidationResultArr = {invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
        h = invalidationResultArr;
        i = EnumEntriesKt.a(invalidationResultArr);
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) h.clone();
    }
}
