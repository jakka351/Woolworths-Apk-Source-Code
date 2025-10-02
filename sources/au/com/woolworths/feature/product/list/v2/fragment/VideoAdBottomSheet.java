package au.com.woolworths.feature.product.list.v2.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/fragment/VideoAdBottomSheet;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ImpressionAnalytics", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VideoAdBottomSheet implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f5634a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ImpressionAnalytics f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/fragment/VideoAdBottomSheet$ImpressionAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5635a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5635a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f5635a, impressionAnalytics.f5635a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5635a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f5635a, ", analyticsFields=", this.b, ")");
        }
    }

    public VideoAdBottomSheet(String str, String str2, String str3, String str4, String str5, ImpressionAnalytics impressionAnalytics) {
        this.f5634a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = impressionAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdBottomSheet)) {
            return false;
        }
        VideoAdBottomSheet videoAdBottomSheet = (VideoAdBottomSheet) obj;
        return Intrinsics.c(this.f5634a, videoAdBottomSheet.f5634a) && Intrinsics.c(this.b, videoAdBottomSheet.b) && Intrinsics.c(this.c, videoAdBottomSheet.c) && Intrinsics.c(this.d, videoAdBottomSheet.d) && Intrinsics.c(this.e, videoAdBottomSheet.e) && Intrinsics.c(this.f, videoAdBottomSheet.f);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f5634a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        ImpressionAnalytics impressionAnalytics = this.f;
        return iC2 + (impressionAnalytics != null ? impressionAnalytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("VideoAdBottomSheet(__typename=", this.f5634a, ", contentMarkdown=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", buttonText=", this.d, ", accessibilityText=");
        sbV.append(this.e);
        sbV.append(", impressionAnalytics=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
