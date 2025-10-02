package au.com.woolworths.promotion.banner.ui;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionContract;", "", "ViewState", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PromotionContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/promotion/banner/ui/PromotionContract$ViewState;", "", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f9342a;
        public final String b;

        public ViewState(String title, String markdownContent) {
            Intrinsics.h(title, "title");
            Intrinsics.h(markdownContent, "markdownContent");
            this.f9342a = title;
            this.b = markdownContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f9342a, viewState.f9342a) && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9342a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("ViewState(title=", this.f9342a, ", markdownContent=", this.b, ")");
        }
    }
}
