package au.com.woolworths.feature.shop.myorders.details.models;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingSurveyInput;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRatingSurveyInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f7757a;
    public final int b;
    public final String c;
    public final String d;
    public final Set e;

    public DriverRatingSurveyInput(String str, int i, String str2, String str3, Set set) {
        this.f7757a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRatingSurveyInput)) {
            return false;
        }
        DriverRatingSurveyInput driverRatingSurveyInput = (DriverRatingSurveyInput) obj;
        return this.f7757a.equals(driverRatingSurveyInput.f7757a) && this.b == driverRatingSurveyInput.b && this.c.equals(driverRatingSurveyInput.c) && Intrinsics.c(this.d, driverRatingSurveyInput.d) && Intrinsics.c(this.e, driverRatingSurveyInput.e);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.b, this.f7757a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Set set = this.e;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbU = b.u("DriverRatingSurveyInput(surveyId=", this.b, this.f7757a, ", starRating=", ", orderNumber=");
        a.B(sbU, this.c, ", comment=", this.d, ", selectedChips=");
        sbU.append(this.e);
        sbU.append(")");
        return sbU.toString();
    }
}
