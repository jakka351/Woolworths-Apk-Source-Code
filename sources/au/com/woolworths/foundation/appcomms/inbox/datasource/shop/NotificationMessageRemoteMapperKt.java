package au.com.woolworths.foundation.appcomms.inbox.datasource.shop;

import au.com.woolworths.foundation.appcomms.inbox.datasource.common.NotificationMessageRemote;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.NotificationMessage;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox-datasource-shop"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessageRemoteMapperKt {
    public static final NotificationMessageRemote a(NotificationMessage notificationMessage) {
        String str = notificationMessage.f8466a;
        String str2 = notificationMessage.b;
        String str3 = notificationMessage.c;
        String str4 = notificationMessage.d;
        String str5 = notificationMessage.e;
        NotificationMessage.Cta cta = notificationMessage.f;
        return new NotificationMessageRemote(str, str2, str3, str4, str5, cta != null ? new NotificationMessageRemote.Cta(cta.f8467a, cta.b) : null, notificationMessage.g, notificationMessage.h);
    }
}
