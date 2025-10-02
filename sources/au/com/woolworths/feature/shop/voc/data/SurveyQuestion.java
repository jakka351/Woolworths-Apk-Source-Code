package au.com.woolworths.feature.shop.voc.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/data/SurveyQuestion;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SurveyQuestion {

    /* renamed from: a, reason: collision with root package name */
    public final String f8222a;
    public final String b;
    public final SurveyQuestionType c;

    public SurveyQuestion(String str, String str2, SurveyQuestionType surveyQuestionType) {
        this.f8222a = str;
        this.b = str2;
        this.c = surveyQuestionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyQuestion)) {
            return false;
        }
        SurveyQuestion surveyQuestion = (SurveyQuestion) obj;
        return Intrinsics.c(this.f8222a, surveyQuestion.f8222a) && Intrinsics.c(this.b, surveyQuestion.b) && this.c == surveyQuestion.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f8222a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbV = a.v("SurveyQuestion(id=", this.f8222a, ", text=", this.b, ", type=");
        sbV.append(this.c);
        sbV.append(")");
        return sbV.toString();
    }
}
