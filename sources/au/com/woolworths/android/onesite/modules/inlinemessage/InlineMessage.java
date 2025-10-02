package au.com.woolworths.android.onesite.modules.inlinemessage;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/inlinemessage/InlineMessage;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InlineMessage {

    /* renamed from: a, reason: collision with root package name */
    public final InlineErrorType f4338a;
    public final Text b;
    public final AnalyticsData c;

    public InlineMessage(InlineErrorType errorType, Text text, AnalyticsData analyticsData) {
        Intrinsics.h(errorType, "errorType");
        this.f4338a = errorType;
        this.b = text;
        this.c = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineMessage)) {
            return false;
        }
        InlineMessage inlineMessage = (InlineMessage) obj;
        return this.f4338a == inlineMessage.f4338a && Intrinsics.c(this.b, inlineMessage.b) && Intrinsics.c(this.c, inlineMessage.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f4338a.hashCode() * 31)) * 31;
        AnalyticsData analyticsData = this.c;
        return iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InlineMessage(errorType=");
        sb.append(this.f4338a);
        sb.append(", messageText=");
        sb.append(this.b);
        sb.append(", analytics=");
        return a.n(sb, this.c, ")");
    }
}
