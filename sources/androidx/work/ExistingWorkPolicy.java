package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/ExistingWorkPolicy;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExistingWorkPolicy {
    public static final ExistingWorkPolicy d;
    public static final ExistingWorkPolicy e;
    public static final ExistingWorkPolicy f;
    public static final ExistingWorkPolicy g;
    public static final /* synthetic */ ExistingWorkPolicy[] h;

    static {
        ExistingWorkPolicy existingWorkPolicy = new ExistingWorkPolicy("REPLACE", 0);
        d = existingWorkPolicy;
        ExistingWorkPolicy existingWorkPolicy2 = new ExistingWorkPolicy("KEEP", 1);
        e = existingWorkPolicy2;
        ExistingWorkPolicy existingWorkPolicy3 = new ExistingWorkPolicy("APPEND", 2);
        f = existingWorkPolicy3;
        ExistingWorkPolicy existingWorkPolicy4 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        g = existingWorkPolicy4;
        h = new ExistingWorkPolicy[]{existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) h.clone();
    }
}
