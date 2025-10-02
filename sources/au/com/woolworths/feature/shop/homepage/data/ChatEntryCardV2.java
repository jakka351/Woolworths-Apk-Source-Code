package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/ChatEntryCardV2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatEntryCardV2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7184a;
    public final String b;
    public final Boolean c;
    public final List d;
    public final String e;

    public ChatEntryCardV2(Boolean bool, String str, String str2, String str3, ArrayList chatEntryCardCtas) {
        Intrinsics.h(chatEntryCardCtas, "chatEntryCardCtas");
        this.f7184a = str;
        this.b = str2;
        this.c = bool;
        this.d = chatEntryCardCtas;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatEntryCardV2)) {
            return false;
        }
        ChatEntryCardV2 chatEntryCardV2 = (ChatEntryCardV2) obj;
        return Intrinsics.c(this.f7184a, chatEntryCardV2.f7184a) && Intrinsics.c(this.b, chatEntryCardV2.b) && Intrinsics.c(this.c, chatEntryCardV2.c) && Intrinsics.c(this.d, chatEntryCardV2.d) && Intrinsics.c(this.e, chatEntryCardV2.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f7184a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        return this.e.hashCode() + b.d((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ChatEntryCardV2(chatEntryCardTitle=", this.f7184a, ", chatEntryCardSubtitle=", this.b, ", chatEntryCardShowBeta=");
        sbV.append(this.c);
        sbV.append(", chatEntryCardCtas=");
        sbV.append(this.d);
        sbV.append(", chatEntryCardImageUrl=");
        return a.o(sbV, this.e, ")");
    }
}
