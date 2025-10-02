package au.com.woolworths.shop.graphql.type;

import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/Purpose;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Purpose {
    public static final Companion e;
    public static final Purpose f;
    public static final /* synthetic */ Purpose[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/Purpose$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        Purpose purpose = new Purpose("EXECUTION", 0, "EXECUTION");
        Purpose purpose2 = new Purpose(CodePackage.SECURITY, 1, CodePackage.SECURITY);
        Purpose purpose3 = new Purpose("UNKNOWN__", 2, "UNKNOWN__");
        f = purpose3;
        Purpose[] purposeArr = {purpose, purpose2, purpose3};
        g = purposeArr;
        h = EnumEntriesKt.a(purposeArr);
        e = new Companion();
        CollectionsKt.R("EXECUTION", CodePackage.SECURITY);
    }

    public Purpose(String str, int i, String str2) {
        this.d = str2;
    }

    public static Purpose valueOf(String str) {
        return (Purpose) Enum.valueOf(Purpose.class, str);
    }

    public static Purpose[] values() {
        return (Purpose[]) g.clone();
    }
}
