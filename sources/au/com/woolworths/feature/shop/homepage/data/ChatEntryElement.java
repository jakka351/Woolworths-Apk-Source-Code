package au.com.woolworths.feature.shop.homepage.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/ChatEntryElement;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatEntryElement {
    public static final ChatEntryElement d;
    public static final ChatEntryElement e;
    public static final /* synthetic */ ChatEntryElement[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ChatEntryElement chatEntryElement = new ChatEntryElement("BUTTON", 0);
        d = chatEntryElement;
        ChatEntryElement chatEntryElement2 = new ChatEntryElement("TEXT_FIELD", 1);
        e = chatEntryElement2;
        ChatEntryElement[] chatEntryElementArr = {chatEntryElement, chatEntryElement2};
        f = chatEntryElementArr;
        g = EnumEntriesKt.a(chatEntryElementArr);
    }

    public static ChatEntryElement valueOf(String str) {
        return (ChatEntryElement) Enum.valueOf(ChatEntryElement.class, str);
    }

    public static ChatEntryElement[] values() {
        return (ChatEntryElement[]) f.clone();
    }
}
