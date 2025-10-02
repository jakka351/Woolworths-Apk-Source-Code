package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.room.Entity;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Entity
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageEntity;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InboxMessageEntity {

    /* renamed from: a, reason: collision with root package name */
    public final String f8416a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final CtaEntity g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;

    public InboxMessageEntity(String str, String str2, String str3, String str4, String str5, String str6, CtaEntity ctaEntity, String str7, String str8, boolean z, boolean z2) {
        this.f8416a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = ctaEntity;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxMessageEntity)) {
            return false;
        }
        InboxMessageEntity inboxMessageEntity = (InboxMessageEntity) obj;
        return Intrinsics.c(this.f8416a, inboxMessageEntity.f8416a) && Intrinsics.c(this.b, inboxMessageEntity.b) && Intrinsics.c(this.c, inboxMessageEntity.c) && Intrinsics.c(this.d, inboxMessageEntity.d) && Intrinsics.c(this.e, inboxMessageEntity.e) && Intrinsics.c(this.f, inboxMessageEntity.f) && Intrinsics.c(this.g, inboxMessageEntity.g) && Intrinsics.c(this.h, inboxMessageEntity.h) && Intrinsics.c(this.i, inboxMessageEntity.i) && this.j == inboxMessageEntity.j && this.k == inboxMessageEntity.k;
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f8416a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CtaEntity ctaEntity = this.g;
        return Boolean.hashCode(this.k) + b.e(b.c(b.c((iHashCode3 + (ctaEntity != null ? ctaEntity.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbV = a.v("InboxMessageEntity(id=", this.f8416a, ", userId=", this.b, ", campaignCode=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", campaignVariant=", this.d, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", body=", this.f, ", cta=");
        sbV.append(this.g);
        sbV.append(", createdOn=");
        sbV.append(this.h);
        sbV.append(", ttl=");
        d.A(this.i, ", seen=", ", deleted=", sbV, this.j);
        return a.k(")", sbV, this.k);
    }
}
