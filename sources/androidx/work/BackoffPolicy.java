package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/BackoffPolicy;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackoffPolicy {
    public static final BackoffPolicy d;
    public static final BackoffPolicy e;
    public static final /* synthetic */ BackoffPolicy[] f;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        d = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        e = backoffPolicy2;
        f = new BackoffPolicy[]{backoffPolicy, backoffPolicy2};
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) f.clone();
    }
}
