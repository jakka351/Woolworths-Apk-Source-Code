package au.com.woolworths.foundation.shop.bottomsheet;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract;", "", "Actions", "ViewState", "CtaClickListener", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BaseBottomSheetContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions;", "", "Dismiss", "OpenAppLink", "OpenCustomTab", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions$Dismiss;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions$OpenAppLink;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions$OpenCustomTab;", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions$Dismiss;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions;", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Dismiss extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Dismiss f8662a = new Dismiss();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions$OpenAppLink;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions;", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAppLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8663a;

            public OpenAppLink(String str) {
                this.f8663a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAppLink) && Intrinsics.c(this.f8663a, ((OpenAppLink) obj).f8663a);
            }

            public final int hashCode() {
                return this.f8663a.hashCode();
            }

            public final String toString() {
                return a.h("OpenAppLink(url=", this.f8663a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions$OpenCustomTab;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$Actions;", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenCustomTab extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f8664a;

            public OpenCustomTab(String url) {
                Intrinsics.h(url, "url");
                this.f8664a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenCustomTab) && Intrinsics.c(this.f8664a, ((OpenCustomTab) obj).f8664a);
            }

            public final int hashCode() {
                return this.f8664a.hashCode();
            }

            public final String toString() {
                return a.h("OpenCustomTab(url=", this.f8664a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$CtaClickListener;", "", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CtaClickListener {
        void B4(ContentCta contentCta);

        void c4(ContentCta contentCta);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetContract$ViewState;", "", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final BottomSheetContent f8665a;
        public final BottomSheetContent.FinchInfo b;
        public final boolean c;
        public final boolean d;

        public ViewState(BottomSheetContent bottomSheetContent, BottomSheetContent.FinchInfo finchInfo, boolean z, boolean z2) {
            this.f8665a = bottomSheetContent;
            this.b = finchInfo;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f8665a, viewState.f8665a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = this.f8665a.hashCode() * 31;
            BottomSheetContent.FinchInfo finchInfo = this.b;
            return Boolean.hashCode(this.d) + b.e((iHashCode + (finchInfo == null ? 0 : finchInfo.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(content=");
            sb.append(this.f8665a);
            sb.append(", finchInfo=");
            sb.append(this.b);
            sb.append(", shouldHandleOverlap=");
            return au.com.woolworths.android.onesite.a.q(sb, this.c, ", shouldPresentAsPopup=", this.d, ")");
        }
    }
}
