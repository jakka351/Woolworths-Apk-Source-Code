package au.com.woolworths.shop.aem.components.model.chatentrycard;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/chatentrycard/ChatEntryCard;", "Lau/com/woolworths/shop/aem/components/model/GenericPageFeedItem;", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatEntryCard implements GenericPageFeedItem {

    /* renamed from: a, reason: collision with root package name */
    public final String f10147a;
    public final String b;
    public final Boolean c;
    public final List d;
    public final String e;
    public final ActionData f;

    public ChatEntryCard(String str, String str2, Boolean bool, List list, String str3, ActionData actionData) {
        this.f10147a = str;
        this.b = str2;
        this.c = bool;
        this.d = list;
        this.e = str3;
        this.f = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatEntryCard)) {
            return false;
        }
        ChatEntryCard chatEntryCard = (ChatEntryCard) obj;
        return Intrinsics.c(this.f10147a, chatEntryCard.f10147a) && Intrinsics.c(this.b, chatEntryCard.b) && Intrinsics.c(this.c, chatEntryCard.c) && Intrinsics.c(this.d, chatEntryCard.d) && Intrinsics.c(this.e, chatEntryCard.e) && Intrinsics.c(this.f, chatEntryCard.f);
    }

    public final int hashCode() {
        int iC = b.c(this.f10147a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        int iD = b.d((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ChatEntryCard(title=", this.f10147a, ", subtitle=", this.b, ", showBeta=");
        sbV.append(this.c);
        sbV.append(", textPrompts=");
        sbV.append(this.d);
        sbV.append(", imageUrl=");
        sbV.append(this.e);
        sbV.append(", action=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
