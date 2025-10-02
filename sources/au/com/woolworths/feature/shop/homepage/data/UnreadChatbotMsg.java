package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/UnreadChatbotMsg;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnreadChatbotMsg {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7206a;

    public UnreadChatbotMsg(Integer num) {
        this.f7206a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnreadChatbotMsg) && Intrinsics.c(this.f7206a, ((UnreadChatbotMsg) obj).f7206a);
    }

    public final int hashCode() {
        Integer num = this.f7206a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "UnreadChatbotMsg(count=" + this.f7206a + ")";
    }
}
