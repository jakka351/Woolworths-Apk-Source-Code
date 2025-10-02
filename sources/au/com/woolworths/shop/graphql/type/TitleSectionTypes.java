package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/TitleSectionTypes;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TitleSectionTypes {
    public static final Companion e;
    public static final EnumType f;
    public static final TitleSectionTypes g;
    public static final /* synthetic */ TitleSectionTypes[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/TitleSectionTypes$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        TitleSectionTypes titleSectionTypes = new TitleSectionTypes("PRIMARY", 0, "PRIMARY");
        TitleSectionTypes titleSectionTypes2 = new TitleSectionTypes("SECONDARY", 1, "SECONDARY");
        TitleSectionTypes titleSectionTypes3 = new TitleSectionTypes("TERTIARY", 2, "TERTIARY");
        TitleSectionTypes titleSectionTypes4 = new TitleSectionTypes("NOT_SET", 3, "NOT_SET");
        TitleSectionTypes titleSectionTypes5 = new TitleSectionTypes("UNKNOWN__", 4, "UNKNOWN__");
        g = titleSectionTypes5;
        TitleSectionTypes[] titleSectionTypesArr = {titleSectionTypes, titleSectionTypes2, titleSectionTypes3, titleSectionTypes4, titleSectionTypes5};
        h = titleSectionTypesArr;
        i = EnumEntriesKt.a(titleSectionTypesArr);
        e = new Companion();
        f = new EnumType("TitleSectionTypes", CollectionsKt.R("PRIMARY", "SECONDARY", "TERTIARY", "NOT_SET"));
    }

    public TitleSectionTypes(String str, int i2, String str2) {
        this.d = str2;
    }

    public static TitleSectionTypes valueOf(String str) {
        return (TitleSectionTypes) Enum.valueOf(TitleSectionTypes.class, str);
    }

    public static TitleSectionTypes[] values() {
        return (TitleSectionTypes[]) h.clone();
    }
}
