package au.com.woolworths.feature.shop.voc.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/data/VocSurveyData;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VocSurveyData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8223a;
    public final String b;
    public final String c;
    public final ButtonApiData d;
    public final String e;

    public VocSurveyData(String str, String str2, String str3, ButtonApiData buttonApiData, String str4) {
        this.f8223a = str;
        this.b = str2;
        this.c = str3;
        this.d = buttonApiData;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VocSurveyData)) {
            return false;
        }
        VocSurveyData vocSurveyData = (VocSurveyData) obj;
        return Intrinsics.c(this.f8223a, vocSurveyData.f8223a) && Intrinsics.c(this.b, vocSurveyData.b) && Intrinsics.c(this.c, vocSurveyData.c) && Intrinsics.c(this.d, vocSurveyData.d) && Intrinsics.c(this.e, vocSurveyData.e);
    }

    public final int hashCode() {
        String str = this.f8223a;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (this.d.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("VocSurveyData(surveyUrl=", this.f8223a, ", promptTitle=", this.b, ", promptSubTitle=");
        sbV.append(this.c);
        sbV.append(", cta=");
        sbV.append(this.d);
        sbV.append(", screenTitle=");
        return a.o(sbV, this.e, ")");
    }
}
