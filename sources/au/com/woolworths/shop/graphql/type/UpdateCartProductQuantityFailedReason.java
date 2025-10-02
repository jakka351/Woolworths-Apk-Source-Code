package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateCartProductQuantityFailedReason;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateCartProductQuantityFailedReason {
    public static final Companion e;
    public static final EnumType f;
    public static final UpdateCartProductQuantityFailedReason g;
    public static final /* synthetic */ UpdateCartProductQuantityFailedReason[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/UpdateCartProductQuantityFailedReason$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason = new UpdateCartProductQuantityFailedReason("LOG_IN_REQUIRED", 0, "LOG_IN_REQUIRED");
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason2 = new UpdateCartProductQuantityFailedReason("AGE_RESTRICTION", 1, "AGE_RESTRICTION");
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason3 = new UpdateCartProductQuantityFailedReason("UNSPECIFIED", 2, "UNSPECIFIED");
        UpdateCartProductQuantityFailedReason updateCartProductQuantityFailedReason4 = new UpdateCartProductQuantityFailedReason("UNKNOWN__", 3, "UNKNOWN__");
        g = updateCartProductQuantityFailedReason4;
        UpdateCartProductQuantityFailedReason[] updateCartProductQuantityFailedReasonArr = {updateCartProductQuantityFailedReason, updateCartProductQuantityFailedReason2, updateCartProductQuantityFailedReason3, updateCartProductQuantityFailedReason4};
        h = updateCartProductQuantityFailedReasonArr;
        i = EnumEntriesKt.a(updateCartProductQuantityFailedReasonArr);
        e = new Companion();
        f = new EnumType("UpdateCartProductQuantityFailedReason", CollectionsKt.R("LOG_IN_REQUIRED", "AGE_RESTRICTION", "UNSPECIFIED"));
    }

    public UpdateCartProductQuantityFailedReason(String str, int i2, String str2) {
        this.d = str2;
    }

    public static UpdateCartProductQuantityFailedReason valueOf(String str) {
        return (UpdateCartProductQuantityFailedReason) Enum.valueOf(UpdateCartProductQuantityFailedReason.class, str);
    }

    public static UpdateCartProductQuantityFailedReason[] values() {
        return (UpdateCartProductQuantityFailedReason[]) h.clone();
    }
}
