package au.com.woolworths.feature.shop.voc.score;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.voc.data.SurveyData;
import au.com.woolworths.feature.shop.voc.data.SurveyQuestion;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract;", "", "Actions", "ViewState", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface VocContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions;", "", "ShowVocFreeText", "LaunchSurveyUrl", "ShowVocSurvey", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions$LaunchSurveyUrl;", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions$ShowVocFreeText;", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions$ShowVocSurvey;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions$LaunchSurveyUrl;", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSurveyUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8231a;
            public final String b;

            public LaunchSurveyUrl(String surveyUrl, String screenTitle) {
                Intrinsics.h(surveyUrl, "surveyUrl");
                Intrinsics.h(screenTitle, "screenTitle");
                this.f8231a = surveyUrl;
                this.b = screenTitle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchSurveyUrl)) {
                    return false;
                }
                LaunchSurveyUrl launchSurveyUrl = (LaunchSurveyUrl) obj;
                return Intrinsics.c(this.f8231a, launchSurveyUrl.f8231a) && Intrinsics.c(this.b, launchSurveyUrl.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f8231a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("LaunchSurveyUrl(surveyUrl=", this.f8231a, ", screenTitle=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions$ShowVocFreeText;", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowVocFreeText extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final SurveySubmitData f8232a;
            public final int b;

            public ShowVocFreeText(SurveySubmitData surveySubmitData, int i) {
                this.f8232a = surveySubmitData;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowVocFreeText)) {
                    return false;
                }
                ShowVocFreeText showVocFreeText = (ShowVocFreeText) obj;
                return Intrinsics.c(this.f8232a, showVocFreeText.f8232a) && this.b == showVocFreeText.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.f8232a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowVocFreeText(submitData=" + this.f8232a + ", selectedScore=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions$ShowVocSurvey;", "Lau/com/woolworths/feature/shop/voc/score/VocContract$Actions;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowVocSurvey extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowVocSurvey f8233a = new ShowVocSurvey();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowVocSurvey);
            }

            public final int hashCode() {
                return -1988161807;
            }

            public final String toString() {
                return "ShowVocSurvey";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract$ViewState;", "", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState m = new ViewState(false, false, null, null, null, 4094);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8234a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final boolean g;
        public final SurveyData h;
        public final String i;
        public final String j;
        public final SurveyQuestion k;
        public final Integer l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/voc/score/VocContract$ViewState$Companion;", "", "", "INVALID_SCORE", "I", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, SurveyData surveyData, String str, String str2, SurveyQuestion surveyQuestion, Integer num) {
            this.f8234a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = i;
            this.g = z6;
            this.h = surveyData;
            this.i = str;
            this.j = str2;
            this.k = surveyQuestion;
            this.l = num;
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, SurveyData surveyData, String str, String str2, SurveyQuestion surveyQuestion, Integer num, int i2) {
            if ((i2 & 1) != 0) {
                z = viewState.f8234a;
            }
            boolean z6 = z;
            if ((i2 & 2) != 0) {
                z2 = viewState.b;
            }
            boolean z7 = z2;
            boolean z8 = (i2 & 4) != 0 ? viewState.c : z3;
            boolean z9 = (i2 & 8) != 0 ? viewState.d : z4;
            boolean z10 = (i2 & 16) != 0 ? viewState.e : z5;
            int i3 = (i2 & 32) != 0 ? viewState.f : i;
            boolean z11 = (i2 & 64) != 0 ? viewState.g : true;
            SurveyData surveyData2 = (i2 & 128) != 0 ? viewState.h : surveyData;
            String str3 = (i2 & 256) != 0 ? viewState.i : str;
            String str4 = (i2 & 512) != 0 ? viewState.j : str2;
            SurveyQuestion surveyQuestion2 = (i2 & 1024) != 0 ? viewState.k : surveyQuestion;
            Integer num2 = (i2 & 2048) != 0 ? viewState.l : num;
            viewState.getClass();
            return new ViewState(z6, z7, z8, z9, z10, i3, z11, surveyData2, str3, str4, surveyQuestion2, num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8234a == viewState.f8234a && this.b == viewState.b && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e && this.f == viewState.f && this.g == viewState.g && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && Intrinsics.c(this.j, viewState.j) && Intrinsics.c(this.k, viewState.k) && Intrinsics.c(this.l, viewState.l);
        }

        public final int hashCode() {
            int iE = b.e(b.a(this.f, b.e(b.e(b.e(b.e(Boolean.hashCode(this.f8234a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
            SurveyData surveyData = this.h;
            int iHashCode = (iE + (surveyData == null ? 0 : surveyData.hashCode())) * 31;
            String str = this.i;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.j;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SurveyQuestion surveyQuestion = this.k;
            int iHashCode4 = (iHashCode3 + (surveyQuestion == null ? 0 : surveyQuestion.hashCode())) * 31;
            Integer num = this.l;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = b.v("ViewState(shouldShowComponent=", ", shouldShowNpsButtons=", ", shouldShowStarButtons=", this.f8234a, this.b);
            au.com.woolworths.android.onesite.a.D(sbV, this.c, ", shouldShowCommentButton=", this.d, ", shouldShowFeedbackButton=");
            sbV.append(this.e);
            sbV.append(", selectedScore=");
            sbV.append(this.f);
            sbV.append(", isScoreSubmitted=");
            sbV.append(this.g);
            sbV.append(", surveyData=");
            sbV.append(this.h);
            sbV.append(", title=");
            androidx.constraintlayout.core.state.a.B(sbV, this.i, ", subTitle=", this.j, ", activeQuestion=");
            sbV.append(this.k);
            sbV.append(", measuredHeight=");
            sbV.append(this.l);
            sbV.append(")");
            return sbV.toString();
        }

        public /* synthetic */ ViewState(boolean z, boolean z2, SurveyData surveyData, String str, String str2, int i) {
            this(false, (i & 2) != 0 ? false : z, false, (i & 8) != 0 ? false : z2, (i & 16) == 0, -1, false, (i & 128) != 0 ? null : surveyData, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : str2, null, 0);
        }
    }
}
