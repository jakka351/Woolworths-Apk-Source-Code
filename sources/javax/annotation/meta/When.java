package javax.annotation.meta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class When {
    public static final When d;
    public static final /* synthetic */ When[] e;

    static {
        When when = new When("ALWAYS", 0);
        d = when;
        e = new When[]{when, new When("UNKNOWN", 1), new When("MAYBE", 2), new When("NEVER", 3)};
    }

    public static When valueOf(String str) {
        return (When) Enum.valueOf(When.class, str);
    }

    public static When[] values() {
        return (When[]) e.clone();
    }
}
