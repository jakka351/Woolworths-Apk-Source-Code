package au.com.woolworths.feature.shop.inbox.domain;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/inbox/domain/LastUnreadChatbotMessageItem;", "", "inbox_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LastUnreadChatbotMessageItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f7287a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public LastUnreadChatbotMessageItem(String title, String body, String source, int i, boolean z) {
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        Intrinsics.h(source, "source");
        this.f7287a = title;
        this.b = body;
        this.c = source;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastUnreadChatbotMessageItem)) {
            return false;
        }
        LastUnreadChatbotMessageItem lastUnreadChatbotMessageItem = (LastUnreadChatbotMessageItem) obj;
        return Intrinsics.c(this.f7287a, lastUnreadChatbotMessageItem.f7287a) && Intrinsics.c(this.b, lastUnreadChatbotMessageItem.b) && Intrinsics.c(this.c, lastUnreadChatbotMessageItem.c) && this.d == lastUnreadChatbotMessageItem.d && this.e == lastUnreadChatbotMessageItem.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.a(this.d, b.c(b.c(this.f7287a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LastUnreadChatbotMessageItem(title=", this.f7287a, ", body=", this.b, ", source=");
        a.x(this.d, this.c, ", unreadMessagesCount=", ", hasSeen=", sbV);
        return a.k(")", sbV, this.e);
    }
}
