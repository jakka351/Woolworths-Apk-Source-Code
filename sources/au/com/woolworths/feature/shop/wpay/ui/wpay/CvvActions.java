package au.com.woolworths.feature.shop.wpay.ui.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/wpay/ui/wpay/CvvActions;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CvvActions {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f8361a;
    public final Function0 b;
    public final Function2 c;
    public final Function0 d;
    public final Function2 e;

    public CvvActions(Function1 onCreated, Function0 success, Function2 error, Function0 retry, Function2 postMessage) {
        Intrinsics.h(onCreated, "onCreated");
        Intrinsics.h(success, "success");
        Intrinsics.h(error, "error");
        Intrinsics.h(retry, "retry");
        Intrinsics.h(postMessage, "postMessage");
        this.f8361a = onCreated;
        this.b = success;
        this.c = error;
        this.d = retry;
        this.e = postMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvvActions)) {
            return false;
        }
        CvvActions cvvActions = (CvvActions) obj;
        return Intrinsics.c(this.f8361a, cvvActions.f8361a) && Intrinsics.c(this.b, cvvActions.b) && Intrinsics.c(this.c, cvvActions.c) && Intrinsics.c(this.d, cvvActions.d) && Intrinsics.c(this.e, cvvActions.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8361a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CvvActions(onCreated=" + this.f8361a + ", success=" + this.b + ", error=" + this.c + ", retry=" + this.d + ", postMessage=" + this.e + ")";
    }
}
