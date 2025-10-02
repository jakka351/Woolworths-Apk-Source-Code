package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/OutOfQuotaPolicy;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutOfQuotaPolicy {
    public static final OutOfQuotaPolicy d;
    public static final OutOfQuotaPolicy e;
    public static final /* synthetic */ OutOfQuotaPolicy[] f;

    static {
        OutOfQuotaPolicy outOfQuotaPolicy = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        d = outOfQuotaPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        e = outOfQuotaPolicy2;
        f = new OutOfQuotaPolicy[]{outOfQuotaPolicy, outOfQuotaPolicy2};
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) f.clone();
    }
}
