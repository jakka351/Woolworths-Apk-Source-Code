package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessage;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Cta", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationMessage implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f8466a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Cta f;
    public final String g;
    public final String h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/NotificationMessage$Cta;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f8467a;
        public final String b;

        public Cta(String str, String str2) {
            this.f8467a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f8467a, cta.f8467a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8467a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Cta(label=", this.f8467a, ", url=", this.b, ")");
        }
    }

    public NotificationMessage(String str, String str2, String str3, String str4, String str5, Cta cta, String str6, String str7) {
        this.f8466a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = cta;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationMessage)) {
            return false;
        }
        NotificationMessage notificationMessage = (NotificationMessage) obj;
        return Intrinsics.c(this.f8466a, notificationMessage.f8466a) && Intrinsics.c(this.b, notificationMessage.b) && Intrinsics.c(this.c, notificationMessage.c) && Intrinsics.c(this.d, notificationMessage.d) && Intrinsics.c(this.e, notificationMessage.e) && Intrinsics.c(this.f, notificationMessage.f) && Intrinsics.c(this.g, notificationMessage.g) && Intrinsics.c(this.h, notificationMessage.h);
    }

    public final int hashCode() {
        int iC = b.c(this.f8466a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Cta cta = this.f;
        return this.h.hashCode() + b.c((iHashCode3 + (cta != null ? cta.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbV = a.v("NotificationMessage(id=", this.f8466a, ", campaignCode=", this.b, ", campaignVariant=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", title=", this.d, ", body=");
        sbV.append(this.e);
        sbV.append(", cta=");
        sbV.append(this.f);
        sbV.append(", createdOn=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.g, ", ttl=", this.h, ")");
    }
}
