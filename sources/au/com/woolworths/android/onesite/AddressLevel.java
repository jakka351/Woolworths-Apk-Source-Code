package au.com.woolworths.android.onesite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AddressLevel {
    public static final AddressLevel d;
    public static final AddressLevel e;
    public static final /* synthetic */ AddressLevel[] f;

    static {
        AddressLevel addressLevel = new AddressLevel("NO_ADDRESS", 0);
        d = addressLevel;
        AddressLevel addressLevel2 = new AddressLevel("FULL_ADDRESS", 1);
        e = addressLevel2;
        f = new AddressLevel[]{addressLevel, addressLevel2};
    }

    public static AddressLevel valueOf(String str) {
        return (AddressLevel) Enum.valueOf(AddressLevel.class, str);
    }

    public static AddressLevel[] values() {
        return (AddressLevel[]) f.clone();
    }
}
