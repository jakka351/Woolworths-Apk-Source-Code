package au.com.woolworths.feature.shop.ask.olive.ui.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/model/ChatWebLink;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatWebLink {

    /* renamed from: a, reason: collision with root package name */
    public final String f6634a;
    public final Map b;

    public ChatWebLink(String url, Map map) {
        Intrinsics.h(url, "url");
        this.f6634a = url;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatWebLink)) {
            return false;
        }
        ChatWebLink chatWebLink = (ChatWebLink) obj;
        return Intrinsics.c(this.f6634a, chatWebLink.f6634a) && Intrinsics.c(this.b, chatWebLink.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6634a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatWebLink(url=" + this.f6634a + ", headers=" + this.b + ")";
    }
}
