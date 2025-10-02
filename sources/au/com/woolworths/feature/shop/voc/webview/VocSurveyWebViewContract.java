package au.com.woolworths.feature.shop.voc.webview;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract;", "", "ViewState", "Actions", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface VocSurveyWebViewContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions;", "", "DismissScreen", "RetryLoad", "Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions$DismissScreen;", "Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions$RetryLoad;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions$DismissScreen;", "Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissScreen f8246a = new DismissScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissScreen);
            }

            public final int hashCode() {
                return -1279951126;
            }

            public final String toString() {
                return "DismissScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions$RetryLoad;", "Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Actions;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RetryLoad extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RetryLoad f8247a = new RetryLoad();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RetryLoad);
            }

            public final int hashCode() {
                return 1182155010;
            }

            public final String toString() {
                return "RetryLoad";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$Companion;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final ViewState f8248a = new ViewState(false, null);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/webview/VocSurveyWebViewContract$ViewState;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8249a;
        public final VocSurveyWebViewFullPageError b;

        public ViewState(boolean z, VocSurveyWebViewFullPageError vocSurveyWebViewFullPageError) {
            this.f8249a = z;
            this.b = vocSurveyWebViewFullPageError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8249a == viewState.f8249a && this.b == viewState.b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f8249a) * 31;
            VocSurveyWebViewFullPageError vocSurveyWebViewFullPageError = this.b;
            return iHashCode + (vocSurveyWebViewFullPageError == null ? 0 : vocSurveyWebViewFullPageError.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f8249a + ", errorState=" + this.b + ")";
        }
    }
}
