package lib.android.paypal.com.magnessdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MagnesSource {
    public static final /* synthetic */ MagnesSource[] d = {new MagnesSource("DEFAULT", 0), new MagnesSource("PAYPAL", 1), new MagnesSource("EBAY", 2), new MagnesSource("BRAINTREE", 3), new MagnesSource("SIMILITY", 4), new MagnesSource("VENMO", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    MagnesSource EF5;

    public static MagnesSource valueOf(String str) {
        return (MagnesSource) Enum.valueOf(MagnesSource.class, str);
    }

    public static MagnesSource[] values() {
        return (MagnesSource[]) d.clone();
    }
}
