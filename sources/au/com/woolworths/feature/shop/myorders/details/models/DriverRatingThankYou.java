package au.com.woolworths.feature.shop.myorders.details.models;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/models/DriverRatingThankYou;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DriverRatingThankYou {

    /* renamed from: a, reason: collision with root package name */
    public final String f7758a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final CoreButtonModel f;
    public final String g;
    public final String h;

    public DriverRatingThankYou(String str, String str2, String str3, String str4, String str5, CoreButtonModel coreButtonModel, String str6, String str7) {
        this.f7758a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = coreButtonModel;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriverRatingThankYou)) {
            return false;
        }
        DriverRatingThankYou driverRatingThankYou = (DriverRatingThankYou) obj;
        return Intrinsics.c(this.f7758a, driverRatingThankYou.f7758a) && Intrinsics.c(this.b, driverRatingThankYou.b) && Intrinsics.c(this.c, driverRatingThankYou.c) && Intrinsics.c(this.d, driverRatingThankYou.d) && Intrinsics.c(this.e, driverRatingThankYou.e) && Intrinsics.c(this.f, driverRatingThankYou.f) && Intrinsics.c(this.g, driverRatingThankYou.g) && Intrinsics.c(this.h, driverRatingThankYou.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + b.c((this.f.hashCode() + b.c(b.c(b.c(b.c(this.f7758a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbV = a.v("DriverRatingThankYou(title=", this.f7758a, ", subTitle=", this.b, ", imageUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", badFeedbackMessage=", this.d, ", badFeedbackQuestion=");
        sbV.append(this.e);
        sbV.append(", badFeedbackButton=");
        sbV.append(this.f);
        sbV.append(", neutralFeedbackMessage=");
        return androidx.constraintlayout.core.state.a.l(sbV, this.g, ", goodFeedbackMessage=", this.h, ")");
    }
}
