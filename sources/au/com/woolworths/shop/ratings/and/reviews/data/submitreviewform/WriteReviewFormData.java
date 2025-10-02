package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/WriteReviewFormData;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WriteReviewFormData {

    /* renamed from: a, reason: collision with root package name */
    public final String f12747a;
    public final List b;
    public final ButtonApiData c;
    public final int d;
    public final boolean e;

    public WriteReviewFormData(String str, List list, ButtonApiData buttonApiData, int i, boolean z) {
        this.f12747a = str;
        this.b = list;
        this.c = buttonApiData;
        this.d = i;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    public static WriteReviewFormData a(WriteReviewFormData writeReviewFormData, ArrayList arrayList, int i, boolean z, int i2) {
        String str = writeReviewFormData.f12747a;
        ArrayList arrayList2 = arrayList;
        if ((i2 & 2) != 0) {
            arrayList2 = writeReviewFormData.b;
        }
        ArrayList arrayList3 = arrayList2;
        ButtonApiData buttonApiData = writeReviewFormData.c;
        if ((i2 & 8) != 0) {
            i = writeReviewFormData.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = writeReviewFormData.e;
        }
        writeReviewFormData.getClass();
        return new WriteReviewFormData(str, arrayList3, buttonApiData, i3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteReviewFormData)) {
            return false;
        }
        WriteReviewFormData writeReviewFormData = (WriteReviewFormData) obj;
        return Intrinsics.c(this.f12747a, writeReviewFormData.f12747a) && Intrinsics.c(this.b, writeReviewFormData.b) && Intrinsics.c(this.c, writeReviewFormData.c) && this.d == writeReviewFormData.d && this.e == writeReviewFormData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.a(this.d, (this.c.hashCode() + b.d(this.f12747a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = a.s("WriteReviewFormData(pageTitle=", this.f12747a, ", sections=", ", submitButton=", this.b);
        sbS.append(this.c);
        sbS.append(", formInputErrorCount=");
        sbS.append(this.d);
        sbS.append(", shouldShowSubmissionError=");
        return YU.a.k(")", sbS, this.e);
    }
}
