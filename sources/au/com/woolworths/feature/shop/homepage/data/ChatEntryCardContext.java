package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/ChatEntryCardContext;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatEntryCardContext {

    /* renamed from: a, reason: collision with root package name */
    public final String f7181a;
    public final Object b;

    public ChatEntryCardContext(String str, List list) {
        this.f7181a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatEntryCardContext)) {
            return false;
        }
        ChatEntryCardContext chatEntryCardContext = (ChatEntryCardContext) obj;
        return this.f7181a.equals(chatEntryCardContext.f7181a) && this.b.equals(chatEntryCardContext.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7181a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatEntryCardContext(source=" + this.f7181a + ", data=" + this.b + ")";
    }
}
