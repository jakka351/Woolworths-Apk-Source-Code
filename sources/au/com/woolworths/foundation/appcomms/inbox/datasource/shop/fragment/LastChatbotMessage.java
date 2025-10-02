package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/LastChatbotMessage;", "Lcom/apollographql/apollo/api/Fragment$Data;", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LastChatbotMessage implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f8464a;
    public final String b;
    public final String c;
    public final int d;

    public LastChatbotMessage(int i, String str, String str2, String str3) {
        this.f8464a = str;
        this.b = str2;
        this.c = str3;
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
        return Intrinsics.c(this.f8464a, lastChatbotMessage.f8464a) && Intrinsics.c(this.b, lastChatbotMessage.b) && Intrinsics.c(this.c, lastChatbotMessage.c) && this.d == lastChatbotMessage.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + b.c(b.c(this.f8464a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbV = a.v("LastChatbotMessage(title=", this.f8464a, ", body=", this.b, ", source=");
        sbV.append(this.c);
        sbV.append(", unreadChatbotMsgCount=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
