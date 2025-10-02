package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingStarsSurvey;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRatingStarsSurvey {

    /* renamed from: a, reason: collision with root package name */
    public final String f7756a;
    public final String b;
    public final String c;
    public final CoreInsetAlertModel d;
    public final CoreButtonModel e;

    public DriverRatingStarsSurvey(String str, String str2, String str3, CoreInsetAlertModel coreInsetAlertModel, CoreButtonModel coreButtonModel) {
        this.f7756a = str;
        this.b = str2;
        this.c = str3;
        this.d = coreInsetAlertModel;
        this.e = coreButtonModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRatingStarsSurvey)) {
            return false;
        }
        DriverRatingStarsSurvey driverRatingStarsSurvey = (DriverRatingStarsSurvey) obj;
        return Intrinsics.c(this.f7756a, driverRatingStarsSurvey.f7756a) && Intrinsics.c(this.b, driverRatingStarsSurvey.b) && Intrinsics.c(this.c, driverRatingStarsSurvey.c) && Intrinsics.c(this.d, driverRatingStarsSurvey.d) && Intrinsics.c(this.e, driverRatingStarsSurvey.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + b.c(b.c(this.f7756a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DriverRatingStarsSurvey(title=", this.f7756a, ", subTitle=", this.b, ", starsRatingQuestion=");
        sbV.append(this.c);
        sbV.append(", insetAlert=");
        sbV.append(this.d);
        sbV.append(", submitButton=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
