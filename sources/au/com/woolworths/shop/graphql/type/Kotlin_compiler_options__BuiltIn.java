package au.com.woolworths.shop.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/Kotlin_compiler_options__BuiltIn;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Kotlin_compiler_options__BuiltIn {
    public static final Companion e;
    public static final Kotlin_compiler_options__BuiltIn f;
    public static final /* synthetic */ Kotlin_compiler_options__BuiltIn[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/Kotlin_compiler_options__BuiltIn$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn = new Kotlin_compiler_options__BuiltIn("String", 0, "String");
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn2 = new Kotlin_compiler_options__BuiltIn("Boolean", 1, "Boolean");
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn3 = new Kotlin_compiler_options__BuiltIn("Int", 2, "Int");
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn4 = new Kotlin_compiler_options__BuiltIn("Long", 3, "Long");
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn5 = new Kotlin_compiler_options__BuiltIn("Float", 4, "Float");
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn6 = new Kotlin_compiler_options__BuiltIn("Double", 5, "Double");
        Kotlin_compiler_options__BuiltIn kotlin_compiler_options__BuiltIn7 = new Kotlin_compiler_options__BuiltIn("UNKNOWN__", 6, "UNKNOWN__");
        f = kotlin_compiler_options__BuiltIn7;
        Kotlin_compiler_options__BuiltIn[] kotlin_compiler_options__BuiltInArr = {kotlin_compiler_options__BuiltIn, kotlin_compiler_options__BuiltIn2, kotlin_compiler_options__BuiltIn3, kotlin_compiler_options__BuiltIn4, kotlin_compiler_options__BuiltIn5, kotlin_compiler_options__BuiltIn6, kotlin_compiler_options__BuiltIn7};
        g = kotlin_compiler_options__BuiltInArr;
        h = EnumEntriesKt.a(kotlin_compiler_options__BuiltInArr);
        e = new Companion();
        CollectionsKt.R("String", "Boolean", "Int", "Long", "Float", "Double");
    }

    public Kotlin_compiler_options__BuiltIn(String str, int i, String str2) {
        this.d = str2;
    }

    public static Kotlin_compiler_options__BuiltIn valueOf(String str) {
        return (Kotlin_compiler_options__BuiltIn) Enum.valueOf(Kotlin_compiler_options__BuiltIn.class, str);
    }

    public static Kotlin_compiler_options__BuiltIn[] values() {
        return (Kotlin_compiler_options__BuiltIn[]) g.clone();
    }
}
