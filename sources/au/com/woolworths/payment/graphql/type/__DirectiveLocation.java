package au.com.woolworths.payment.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/payment/graphql/type/__DirectiveLocation;", "", "Companion", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class __DirectiveLocation {
    public static final Companion e;
    public static final __DirectiveLocation f;
    public static final /* synthetic */ __DirectiveLocation[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/payment/graphql/type/__DirectiveLocation$Companion;", "", "schema-payment"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        __DirectiveLocation __directivelocation = new __DirectiveLocation("QUERY", 0, "QUERY");
        __DirectiveLocation __directivelocation2 = new __DirectiveLocation("MUTATION", 1, "MUTATION");
        __DirectiveLocation __directivelocation3 = new __DirectiveLocation("SUBSCRIPTION", 2, "SUBSCRIPTION");
        __DirectiveLocation __directivelocation4 = new __DirectiveLocation("FIELD", 3, "FIELD");
        __DirectiveLocation __directivelocation5 = new __DirectiveLocation("FRAGMENT_DEFINITION", 4, "FRAGMENT_DEFINITION");
        __DirectiveLocation __directivelocation6 = new __DirectiveLocation("FRAGMENT_SPREAD", 5, "FRAGMENT_SPREAD");
        __DirectiveLocation __directivelocation7 = new __DirectiveLocation("INLINE_FRAGMENT", 6, "INLINE_FRAGMENT");
        __DirectiveLocation __directivelocation8 = new __DirectiveLocation("VARIABLE_DEFINITION", 7, "VARIABLE_DEFINITION");
        __DirectiveLocation __directivelocation9 = new __DirectiveLocation("SCHEMA", 8, "SCHEMA");
        __DirectiveLocation __directivelocation10 = new __DirectiveLocation("SCALAR", 9, "SCALAR");
        __DirectiveLocation __directivelocation11 = new __DirectiveLocation("OBJECT", 10, "OBJECT");
        __DirectiveLocation __directivelocation12 = new __DirectiveLocation("FIELD_DEFINITION", 11, "FIELD_DEFINITION");
        __DirectiveLocation __directivelocation13 = new __DirectiveLocation("ARGUMENT_DEFINITION", 12, "ARGUMENT_DEFINITION");
        __DirectiveLocation __directivelocation14 = new __DirectiveLocation("INTERFACE", 13, "INTERFACE");
        __DirectiveLocation __directivelocation15 = new __DirectiveLocation("UNION", 14, "UNION");
        __DirectiveLocation __directivelocation16 = new __DirectiveLocation("ENUM", 15, "ENUM");
        __DirectiveLocation __directivelocation17 = new __DirectiveLocation("ENUM_VALUE", 16, "ENUM_VALUE");
        __DirectiveLocation __directivelocation18 = new __DirectiveLocation("INPUT_OBJECT", 17, "INPUT_OBJECT");
        __DirectiveLocation __directivelocation19 = new __DirectiveLocation("INPUT_FIELD_DEFINITION", 18, "INPUT_FIELD_DEFINITION");
        __DirectiveLocation __directivelocation20 = new __DirectiveLocation("UNKNOWN__", 19, "UNKNOWN__");
        f = __directivelocation20;
        __DirectiveLocation[] __directivelocationArr = {__directivelocation, __directivelocation2, __directivelocation3, __directivelocation4, __directivelocation5, __directivelocation6, __directivelocation7, __directivelocation8, __directivelocation9, __directivelocation10, __directivelocation11, __directivelocation12, __directivelocation13, __directivelocation14, __directivelocation15, __directivelocation16, __directivelocation17, __directivelocation18, __directivelocation19, __directivelocation20};
        g = __directivelocationArr;
        h = EnumEntriesKt.a(__directivelocationArr);
        e = new Companion();
        CollectionsKt.R("QUERY", "MUTATION", "SUBSCRIPTION", "FIELD", "FRAGMENT_DEFINITION", "FRAGMENT_SPREAD", "INLINE_FRAGMENT", "VARIABLE_DEFINITION", "SCHEMA", "SCALAR", "OBJECT", "FIELD_DEFINITION", "ARGUMENT_DEFINITION", "INTERFACE", "UNION", "ENUM", "ENUM_VALUE", "INPUT_OBJECT", "INPUT_FIELD_DEFINITION");
    }

    public __DirectiveLocation(String str, int i, String str2) {
        this.d = str2;
    }

    public static __DirectiveLocation valueOf(String str) {
        return (__DirectiveLocation) Enum.valueOf(__DirectiveLocation.class, str);
    }

    public static __DirectiveLocation[] values() {
        return (__DirectiveLocation[]) g.clone();
    }
}
