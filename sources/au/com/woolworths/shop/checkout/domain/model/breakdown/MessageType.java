package au.com.woolworths.shop.checkout.domain.model.breakdown;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/breakdown/MessageType;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageType {
    public static final MessageType d;
    public static final MessageType e;
    public static final MessageType f;
    public static final /* synthetic */ MessageType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        MessageType messageType = new MessageType("UNDEFINED", 0);
        d = messageType;
        MessageType messageType2 = new MessageType("INFO", 1);
        e = messageType2;
        MessageType messageType3 = new MessageType("HELP", 2);
        f = messageType3;
        MessageType[] messageTypeArr = {messageType, messageType2, messageType3};
        g = messageTypeArr;
        h = EnumEntriesKt.a(messageTypeArr);
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) g.clone();
    }
}
