package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingFeedbackAndComments;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRatingFeedbackAndComments {

    /* renamed from: a, reason: collision with root package name */
    public final String f7755a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final CoreButtonModel f;

    public DriverRatingFeedbackAndComments(String str, String str2, String str3, List list, String str4, CoreButtonModel coreButtonModel) {
        this.f7755a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = coreButtonModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRatingFeedbackAndComments)) {
            return false;
        }
        DriverRatingFeedbackAndComments driverRatingFeedbackAndComments = (DriverRatingFeedbackAndComments) obj;
        return Intrinsics.c(this.f7755a, driverRatingFeedbackAndComments.f7755a) && Intrinsics.c(this.b, driverRatingFeedbackAndComments.b) && Intrinsics.c(this.c, driverRatingFeedbackAndComments.c) && Intrinsics.c(this.d, driverRatingFeedbackAndComments.d) && Intrinsics.c(this.e, driverRatingFeedbackAndComments.e) && Intrinsics.c(this.f, driverRatingFeedbackAndComments.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(b.d(b.c(b.c(this.f7755a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DriverRatingFeedbackAndComments(title=", this.f7755a, ", subTitle=", this.b, ", feedbackChipsQuestion=");
        au.com.woolworths.android.onesite.a.B(sbV, this.c, ", feedbackChips=", this.d, ", additionalCommentText=");
        sbV.append(this.e);
        sbV.append(", doneButton=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
