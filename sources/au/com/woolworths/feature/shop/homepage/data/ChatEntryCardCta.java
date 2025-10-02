package au.com.woolworths.feature.shop.homepage.data;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.model.action.ActionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/ChatEntryCardCta;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatEntryCardCta {

    /* renamed from: a, reason: collision with root package name */
    public final String f7183a;
    public final Object b;
    public final ChatEntryElement c;
    public final ChatEntryCardContext d;
    public final ActionData e;

    public ChatEntryCardCta(String str, List list, ChatEntryElement chatEntryElement, ChatEntryCardContext chatEntryCardContext, ActionData actionData) {
        this.f7183a = str;
        this.b = list;
        this.c = chatEntryElement;
        this.d = chatEntryCardContext;
        this.e = actionData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatEntryCardCta)) {
            return false;
        }
        ChatEntryCardCta chatEntryCardCta = (ChatEntryCardCta) obj;
        return Intrinsics.c(this.f7183a, chatEntryCardCta.f7183a) && this.b.equals(chatEntryCardCta.b) && this.c == chatEntryCardCta.c && this.d.equals(chatEntryCardCta.d) && this.e.equals(chatEntryCardCta.e);
    }

    public final int hashCode() {
        String str = this.f7183a;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + a.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatEntryCardCta(chatEntryCardCtaIconUrl=" + this.f7183a + ", chatEntryCardPrompts=" + this.b + ", chatEntryCardElement=" + this.c + ", chatEntryCardContext=" + this.d + ", chatEntryCardAction=" + this.e + ")";
    }
}
