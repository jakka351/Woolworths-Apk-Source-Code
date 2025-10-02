package au.com.woolworths.feature.shop.ask.olive.ui.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/ui/model/ChatFeed;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f6633a;
    public final String b;

    public ChatFeed(String str, String str2) {
        this.f6633a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatFeed)) {
            return false;
        }
        ChatFeed chatFeed = (ChatFeed) obj;
        return Intrinsics.c(this.f6633a, chatFeed.f6633a) && Intrinsics.c(this.b, chatFeed.b);
    }

    public final int hashCode() {
        String str = this.f6633a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return a.j("ChatFeed(url=", this.f6633a, ", title=", this.b, ", subTitle=null)");
    }
}
