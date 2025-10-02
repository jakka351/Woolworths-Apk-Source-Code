package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/InStoreLocationType;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InStoreLocationType {
    public static final Companion e;
    public static final EnumType f;
    public static final InStoreLocationType g;
    public static final /* synthetic */ InStoreLocationType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/InStoreLocationType$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        InStoreLocationType inStoreLocationType = new InStoreLocationType("AVAILABLE", 0, "AVAILABLE");
        InStoreLocationType inStoreLocationType2 = new InStoreLocationType("UNAVAILABLE", 1, "UNAVAILABLE");
        InStoreLocationType inStoreLocationType3 = new InStoreLocationType("UNKNOWN__", 2, "UNKNOWN__");
        g = inStoreLocationType3;
        InStoreLocationType[] inStoreLocationTypeArr = {inStoreLocationType, inStoreLocationType2, inStoreLocationType3};
        h = inStoreLocationTypeArr;
        i = EnumEntriesKt.a(inStoreLocationTypeArr);
        e = new Companion();
        f = new EnumType("InStoreLocationType", CollectionsKt.R("AVAILABLE", "UNAVAILABLE"));
    }

    public InStoreLocationType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static InStoreLocationType valueOf(String str) {
        return (InStoreLocationType) Enum.valueOf(InStoreLocationType.class, str);
    }

    public static InStoreLocationType[] values() {
        return (InStoreLocationType[]) h.clone();
    }
}
