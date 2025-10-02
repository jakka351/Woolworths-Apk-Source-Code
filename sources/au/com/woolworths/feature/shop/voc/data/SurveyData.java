package au.com.woolworths.feature.shop.voc.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/data/SurveyData;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SurveyData {

    /* renamed from: a, reason: collision with root package name */
    public final String f8221a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final VocSurveyData f;

    public SurveyData(String str, String str2, String str3, String str4, List list, VocSurveyData vocSurveyData) {
        this.f8221a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = vocSurveyData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) obj;
        return Intrinsics.c(this.f8221a, surveyData.f8221a) && Intrinsics.c(this.b, surveyData.b) && Intrinsics.c(this.c, surveyData.c) && Intrinsics.c(this.d, surveyData.d) && Intrinsics.c(this.e, surveyData.e) && Intrinsics.c(this.f, surveyData.f);
    }

    public final int hashCode() {
        int iC = b.c(this.f8221a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD = b.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        VocSurveyData vocSurveyData = this.f;
        return iD + (vocSurveyData != null ? vocSurveyData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("SurveyData(surveyId=", this.f8221a, ", responseId=", this.b, ", commentButtonText=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", commentTitleText=", this.d, ", questions=");
        sbV.append(this.e);
        sbV.append(", vocSurvey=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
