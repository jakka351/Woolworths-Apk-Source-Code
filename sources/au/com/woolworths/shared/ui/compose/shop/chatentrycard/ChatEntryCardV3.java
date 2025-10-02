package au.com.woolworths.shared.ui.compose.shop.chatentrycard;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shared/ui/compose/shop/chatentrycard/ChatEntryCardV3;", "", "shared-ui-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatEntryCardV3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10101a;
    public final Boolean b;
    public final List c;
    public final ActionData d;

    public ChatEntryCardV3(String title, Boolean bool, List list, ActionData actionData) {
        Intrinsics.h(title, "title");
        this.f10101a = title;
        this.b = bool;
        this.c = list;
        this.d = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatEntryCardV3)) {
            return false;
        }
        ChatEntryCardV3 chatEntryCardV3 = (ChatEntryCardV3) obj;
        return Intrinsics.c(this.f10101a, chatEntryCardV3.f10101a) && Intrinsics.c(this.b, chatEntryCardV3.b) && Intrinsics.c(this.c, chatEntryCardV3.c) && Intrinsics.c(this.d, chatEntryCardV3.d);
    }

    public final int hashCode() {
        int iHashCode = this.f10101a.hashCode() * 31;
        Boolean bool = this.b;
        return this.d.hashCode() + b.d((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "ChatEntryCardV3(title=" + this.f10101a + ", showBeta=" + this.b + ", textPrompts=" + this.c + ", action=" + this.d + ")";
    }
}
