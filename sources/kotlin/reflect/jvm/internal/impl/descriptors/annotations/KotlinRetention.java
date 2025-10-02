package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class KotlinRetention {
    public static final KotlinRetention d;
    public static final KotlinRetention e;
    public static final KotlinRetention f;
    public static final /* synthetic */ KotlinRetention[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        d = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        e = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        f = kotlinRetention3;
        KotlinRetention[] kotlinRetentionArr = {kotlinRetention, kotlinRetention2, kotlinRetention3};
        g = kotlinRetentionArr;
        h = EnumEntriesKt.a(kotlinRetentionArr);
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) g.clone();
    }
}
