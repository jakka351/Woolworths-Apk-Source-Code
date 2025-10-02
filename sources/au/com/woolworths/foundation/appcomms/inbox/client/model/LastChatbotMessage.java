package au.com.woolworths.foundation.appcomms.inbox.client.model;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/model/LastChatbotMessage;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LastChatbotMessage {

    /* renamed from: a, reason: collision with root package name */
    public final String f8443a;
    public final String b;
    public final String c;
    public final int d;

    public LastChatbotMessage(int i, String title, String body, String source) {
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        Intrinsics.h(source, "source");
        this.f8443a = title;
        this.b = body;
        this.c = source;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastChatbotMessage)) {
            return false;
        }
        LastChatbotMessage lastChatbotMessage = (LastChatbotMessage) obj;
        return Intrinsics.c(this.f8443a, lastChatbotMessage.f8443a) && Intrinsics.c(this.b, lastChatbotMessage.b) && Intrinsics.c(this.c, lastChatbotMessage.c) && this.d == lastChatbotMessage.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.c(b.c(this.f8443a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LastChatbotMessage(title=", this.f8443a, ", body=", this.b, ", source=");
        sbV.append(this.c);
        sbV.append(", unreadMessagesCount=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
