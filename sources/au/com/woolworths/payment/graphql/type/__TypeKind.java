package au.com.woolworths.payment.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/payment/graphql/type/__TypeKind;", "", "Companion", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class __TypeKind {
    public static final Companion e;
    public static final __TypeKind f;
    public static final /* synthetic */ __TypeKind[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/__TypeKind$Companion;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        __TypeKind __typekind = new __TypeKind("SCALAR", 0, "SCALAR");
        __TypeKind __typekind2 = new __TypeKind("OBJECT", 1, "OBJECT");
        __TypeKind __typekind3 = new __TypeKind("INTERFACE", 2, "INTERFACE");
        __TypeKind __typekind4 = new __TypeKind("UNION", 3, "UNION");
        __TypeKind __typekind5 = new __TypeKind("ENUM", 4, "ENUM");
        __TypeKind __typekind6 = new __TypeKind("INPUT_OBJECT", 5, "INPUT_OBJECT");
        __TypeKind __typekind7 = new __TypeKind("LIST", 6, "LIST");
        __TypeKind __typekind8 = new __TypeKind("NON_NULL", 7, "NON_NULL");
        __TypeKind __typekind9 = new __TypeKind("UNKNOWN__", 8, "UNKNOWN__");
        f = __typekind9;
        __TypeKind[] __typekindArr = {__typekind, __typekind2, __typekind3, __typekind4, __typekind5, __typekind6, __typekind7, __typekind8, __typekind9};
        g = __typekindArr;
        h = EnumEntriesKt.a(__typekindArr);
        e = new Companion();
        CollectionsKt.R("SCALAR", "OBJECT", "INTERFACE", "UNION", "ENUM", "INPUT_OBJECT", "LIST", "NON_NULL");
    }

    public __TypeKind(String str, int i, String str2) {
        this.d = str2;
    }

    public static __TypeKind valueOf(String str) {
        return (__TypeKind) Enum.valueOf(__TypeKind.class, str);
    }

    public static __TypeKind[] values() {
        return (__TypeKind[]) g.clone();
    }
}
