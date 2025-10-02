package au.com.woolworths.feature.shop.inbox.domain;

import au.com.woolworths.foundation.appcomms.inbox.client.model.LastChatbotMessage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LastUnreadChatbotMessageItemMapperKt {
    public static final LastUnreadChatbotMessageItem a(LastChatbotMessage lastChatbotMessage) {
        if (lastChatbotMessage == null) {
            return null;
        }
        String str = lastChatbotMessage.f8443a;
        String str2 = lastChatbotMessage.b;
        String str3 = lastChatbotMessage.c;
        int i = lastChatbotMessage.d;
        return new LastUnreadChatbotMessageItem(str, str2, str3, i, i == 0);
    }
}
