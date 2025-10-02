package au.com.woolworths.shop.lists.ui.shoppinglist.utils;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.rxutils.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/utils/TrolleyResultWithMessage;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TrolleyResultWithMessage {

    /* renamed from: a, reason: collision with root package name */
    public final Result f12453a;
    public final Text b;
    public final String c;
    public final kotlin.Result d;

    public TrolleyResultWithMessage(Result result, Text text, String eventDescription, kotlin.Result result2) {
        Intrinsics.h(eventDescription, "eventDescription");
        this.f12453a = result;
        this.b = text;
        this.c = eventDescription;
        this.d = result2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrolleyResultWithMessage)) {
            return false;
        }
        TrolleyResultWithMessage trolleyResultWithMessage = (TrolleyResultWithMessage) obj;
        return Intrinsics.c(this.f12453a, trolleyResultWithMessage.f12453a) && Intrinsics.c(this.b, trolleyResultWithMessage.b) && Intrinsics.c(this.c, trolleyResultWithMessage.c) && Intrinsics.c(this.d, trolleyResultWithMessage.d);
    }

    public final int hashCode() {
        Object obj;
        int iHashCode = 0;
        Result result = this.f12453a;
        int iC = b.c((this.b.hashCode() + ((result == null ? 0 : result.hashCode()) * 31)) * 31, 31, this.c);
        kotlin.Result result2 = this.d;
        if (result2 != null && (obj = result2.d) != null) {
            iHashCode = obj.hashCode();
        }
        return iC + iHashCode;
    }

    public final String toString() {
        return "TrolleyResultWithMessage(trolleyResult=" + this.f12453a + ", message=" + this.b + ", eventDescription=" + this.c + ", boostResult=" + this.d + ")";
    }
}
