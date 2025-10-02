package au.com.woolworths.shop.ratingsandreviews.ui.reviewitem;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/ui/reviewitem/ReviewCardData;", "", "ratingsandreviews-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewCardData {

    /* renamed from: a, reason: collision with root package name */
    public final int f12788a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public ReviewCardData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f12788a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewCardData)) {
            return false;
        }
        ReviewCardData reviewCardData = (ReviewCardData) obj;
        return this.f12788a == reviewCardData.f12788a && this.b.equals(reviewCardData.b) && this.c.equals(reviewCardData.c) && this.d.equals(reviewCardData.d) && this.e.equals(reviewCardData.e) && this.f.equals(reviewCardData.f) && this.g.equals(reviewCardData.g) && this.h.equals(reviewCardData.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + b.c(b.c(b.e(b.c(b.c(b.c(b.c(Integer.hashCode(this.f12788a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, true), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbP = androidx.constraintlayout.core.state.a.p("ReviewCardData(rating=", this.f12788a, ", ratingText=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbP, this.c, ", recommendedIconUrl=", this.d, ", recommendedText=");
        androidx.constraintlayout.core.state.a.B(sbP, this.e, ", isRecommended=true, nickname=", this.f, ", createdAt=");
        return androidx.constraintlayout.core.state.a.l(sbP, this.g, ", content=", this.h, ")");
    }
}
