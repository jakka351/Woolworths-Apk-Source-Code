package au.com.woolworths.feature.shop.voc.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/data/SurveySubmitData;", "Landroid/os/Parcelable;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SurveySubmitData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SurveySubmitData> CREATOR = new Creator();
    public final String d;
    public final long e;
    public final String f;
    public final String g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SurveySubmitData> {
        @Override // android.os.Parcelable.Creator
        public final SurveySubmitData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new SurveySubmitData(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SurveySubmitData[] newArray(int i) {
            return new SurveySubmitData[i];
        }
    }

    public SurveySubmitData(String surveyId, long j, String responseId, String questionId) {
        Intrinsics.h(surveyId, "surveyId");
        Intrinsics.h(responseId, "responseId");
        Intrinsics.h(questionId, "questionId");
        this.d = surveyId;
        this.e = j;
        this.f = responseId;
        this.g = questionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveySubmitData)) {
            return false;
        }
        SurveySubmitData surveySubmitData = (SurveySubmitData) obj;
        return Intrinsics.c(this.d, surveySubmitData.d) && this.e == surveySubmitData.e && Intrinsics.c(this.f, surveySubmitData.f) && Intrinsics.c(this.g, surveySubmitData.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.c(b.b(this.d.hashCode() * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurveySubmitData(surveyId=");
        sb.append(this.d);
        sb.append(", orderId=");
        sb.append(this.e);
        a.B(sb, ", responseId=", this.f, ", questionId=", this.g);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeLong(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
    }
}
