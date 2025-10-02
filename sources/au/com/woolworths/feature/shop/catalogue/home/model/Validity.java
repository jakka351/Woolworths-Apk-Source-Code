package au.com.woolworths.feature.shop.catalogue.home.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/model/Validity;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Validity {
    public static final Validity d;
    public static final Validity e;
    public static final /* synthetic */ Validity[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        Validity validity = new Validity("CURRENT", 0);
        d = validity;
        Validity validity2 = new Validity("FUTURE", 1);
        e = validity2;
        Validity[] validityArr = {validity, validity2};
        f = validityArr;
        g = EnumEntriesKt.a(validityArr);
    }

    public static Validity valueOf(String str) {
        return (Validity) Enum.valueOf(Validity.class, str);
    }

    public static Validity[] values() {
        return (Validity[]) f.clone();
    }
}
