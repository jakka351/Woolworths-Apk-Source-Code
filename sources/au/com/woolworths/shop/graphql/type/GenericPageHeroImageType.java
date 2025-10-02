package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/GenericPageHeroImageType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GenericPageHeroImageType {
    public static final Companion e;
    public static final EnumType f;
    public static final GenericPageHeroImageType g;
    public static final /* synthetic */ GenericPageHeroImageType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/GenericPageHeroImageType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static EnumType a() {
            return GenericPageHeroImageType.f;
        }
    }

    static {
        GenericPageHeroImageType genericPageHeroImageType = new GenericPageHeroImageType("ASPECT_FILL", 0, "ASPECT_FILL");
        GenericPageHeroImageType genericPageHeroImageType2 = new GenericPageHeroImageType("ASPECT_FIT", 1, "ASPECT_FIT");
        GenericPageHeroImageType genericPageHeroImageType3 = new GenericPageHeroImageType("UNKNOWN__", 2, "UNKNOWN__");
        g = genericPageHeroImageType3;
        GenericPageHeroImageType[] genericPageHeroImageTypeArr = {genericPageHeroImageType, genericPageHeroImageType2, genericPageHeroImageType3};
        h = genericPageHeroImageTypeArr;
        i = EnumEntriesKt.a(genericPageHeroImageTypeArr);
        e = new Companion();
        f = new EnumType("GenericPageHeroImageType", CollectionsKt.R("ASPECT_FILL", "ASPECT_FIT"));
    }

    public GenericPageHeroImageType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static GenericPageHeroImageType valueOf(String str) {
        return (GenericPageHeroImageType) Enum.valueOf(GenericPageHeroImageType.class, str);
    }

    public static GenericPageHeroImageType[] values() {
        return (GenericPageHeroImageType[]) h.clone();
    }
}
