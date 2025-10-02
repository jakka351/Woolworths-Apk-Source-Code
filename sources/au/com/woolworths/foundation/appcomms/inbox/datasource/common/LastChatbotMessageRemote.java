package au.com.woolworths.foundation.appcomms.inbox.datasource.common;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/common/LastChatbotMessageRemote;", "", "inbox-datasource-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LastChatbotMessageRemote {

    /* renamed from: a, reason: collision with root package name */
    public final String f8444a;
    public final String b;
    public final String c;
    public final int d;

    public LastChatbotMessageRemote(int i, String str, String str2, String str3) {
        this.f8444a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastChatbotMessageRemote)) {
            return false;
        }
        LastChatbotMessageRemote lastChatbotMessageRemote = (LastChatbotMessageRemote) obj;
        return Intrinsics.c(this.f8444a, lastChatbotMessageRemote.f8444a) && Intrinsics.c(this.b, lastChatbotMessageRemote.b) && Intrinsics.c(this.c, lastChatbotMessageRemote.c) && this.d == lastChatbotMessageRemote.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.c(b.c(this.f8444a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LastChatbotMessageRemote(title=", this.f8444a, ", body=", this.b, ", source=");
        sbV.append(this.c);
        sbV.append(", unreadMessagesCount=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
