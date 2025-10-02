package lib.android.paypal.com.magnessdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Environment {
    public static final Environment d;
    public static final Environment e;
    public static final /* synthetic */ Environment[] f;

    static {
        Environment environment = new Environment("LIVE", 0);
        d = environment;
        Environment environment2 = new Environment("SANDBOX", 1);
        e = environment2;
        f = new Environment[]{environment, environment2};
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) f.clone();
    }
}
