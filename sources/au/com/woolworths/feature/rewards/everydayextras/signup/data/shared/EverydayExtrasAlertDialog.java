package au.com.woolworths.feature.rewards.everydayextras.signup.data.shared;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/shared/EverydayExtrasAlertDialog;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasAlertDialog {

    /* renamed from: a, reason: collision with root package name */
    public final String f6164a;
    public final String b;
    public final ContentCta c;
    public final ContentCta d;
    public final AlertDialogAnalytics e;

    public EverydayExtrasAlertDialog(String str, String str2, ContentCta contentCta, ContentCta contentCta2, AlertDialogAnalytics alertDialogAnalytics) {
        this.f6164a = str;
        this.b = str2;
        this.c = contentCta;
        this.d = contentCta2;
        this.e = alertDialogAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasAlertDialog)) {
            return false;
        }
        EverydayExtrasAlertDialog everydayExtrasAlertDialog = (EverydayExtrasAlertDialog) obj;
        return Intrinsics.c(this.f6164a, everydayExtrasAlertDialog.f6164a) && Intrinsics.c(this.b, everydayExtrasAlertDialog.b) && Intrinsics.c(this.c, everydayExtrasAlertDialog.c) && Intrinsics.c(this.d, everydayExtrasAlertDialog.d) && Intrinsics.c(this.e, everydayExtrasAlertDialog.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + b.c(this.f6164a.hashCode() * 31, 31, this.b)) * 31;
        ContentCta contentCta = this.d;
        int iHashCode2 = (iHashCode + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        AlertDialogAnalytics alertDialogAnalytics = this.e;
        return iHashCode2 + (alertDialogAnalytics != null ? alertDialogAnalytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("EverydayExtrasAlertDialog(title=", this.f6164a, ", message=", this.b, ", primaryCta=");
        sbV.append(this.c);
        sbV.append(", secondaryCta=");
        sbV.append(this.d);
        sbV.append(", analytics=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
