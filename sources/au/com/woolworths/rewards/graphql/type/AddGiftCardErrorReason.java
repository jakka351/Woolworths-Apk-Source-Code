package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AddGiftCardErrorReason;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddGiftCardErrorReason {
    public static final Companion e;
    public static final AddGiftCardErrorReason f;
    public static final /* synthetic */ AddGiftCardErrorReason[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AddGiftCardErrorReason$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        AddGiftCardErrorReason addGiftCardErrorReason = new AddGiftCardErrorReason("NO_BALANCE", 0, "NO_BALANCE");
        AddGiftCardErrorReason addGiftCardErrorReason2 = new AddGiftCardErrorReason("EXPIRED_GIFT_CARD", 1, "EXPIRED_GIFT_CARD");
        AddGiftCardErrorReason addGiftCardErrorReason3 = new AddGiftCardErrorReason("INVALID_GIFT_CARD_PROGRAM", 2, "INVALID_GIFT_CARD_PROGRAM");
        AddGiftCardErrorReason addGiftCardErrorReason4 = new AddGiftCardErrorReason("NO_SCHEME_CARD", 3, "NO_SCHEME_CARD");
        AddGiftCardErrorReason addGiftCardErrorReason5 = new AddGiftCardErrorReason("INTERNAL_SERVER_ERROR", 4, "INTERNAL_SERVER_ERROR");
        AddGiftCardErrorReason addGiftCardErrorReason6 = new AddGiftCardErrorReason("LIMIT_GIFT_CARD", 5, "LIMIT_GIFT_CARD");
        AddGiftCardErrorReason addGiftCardErrorReason7 = new AddGiftCardErrorReason("UNKNOWN__", 6, "UNKNOWN__");
        f = addGiftCardErrorReason7;
        AddGiftCardErrorReason[] addGiftCardErrorReasonArr = {addGiftCardErrorReason, addGiftCardErrorReason2, addGiftCardErrorReason3, addGiftCardErrorReason4, addGiftCardErrorReason5, addGiftCardErrorReason6, addGiftCardErrorReason7};
        g = addGiftCardErrorReasonArr;
        h = EnumEntriesKt.a(addGiftCardErrorReasonArr);
        e = new Companion();
        CollectionsKt.R("NO_BALANCE", "EXPIRED_GIFT_CARD", "INVALID_GIFT_CARD_PROGRAM", "NO_SCHEME_CARD", "INTERNAL_SERVER_ERROR", "LIMIT_GIFT_CARD");
    }

    public AddGiftCardErrorReason(String str, int i, String str2) {
        this.d = str2;
    }

    public static AddGiftCardErrorReason valueOf(String str) {
        return (AddGiftCardErrorReason) Enum.valueOf(AddGiftCardErrorReason.class, str);
    }

    public static AddGiftCardErrorReason[] values() {
        return (AddGiftCardErrorReason[]) g.clone();
    }
}
