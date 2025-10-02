package au.com.woolworths.feature.shop.myorders.details.help;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract;", "", "Actions", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HelpAndSupportContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions;", "", "OpenFAQs", "OpenMessageUs", "OpenCallUs", "Back", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$Back;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$OpenCallUs;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$OpenFAQs;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$OpenMessageUs;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SuppressLint
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$Back;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Back extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Back f7711a = new Back();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Back);
            }

            public final int hashCode() {
                return -1707258300;
            }

            public final String toString() {
                return "Back";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$OpenCallUs;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenCallUs extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7712a;
            public final String b;

            public OpenCallUs(String title, String externalLink) {
                Intrinsics.h(title, "title");
                Intrinsics.h(externalLink, "externalLink");
                this.f7712a = title;
                this.b = externalLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenCallUs)) {
                    return false;
                }
                OpenCallUs openCallUs = (OpenCallUs) obj;
                return Intrinsics.c(this.f7712a, openCallUs.f7712a) && Intrinsics.c(this.b, openCallUs.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7712a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenCallUs(title=", this.f7712a, ", externalLink=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$OpenFAQs;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenFAQs extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7713a;

            public OpenFAQs(String externalLink) {
                Intrinsics.h(externalLink, "externalLink");
                this.f7713a = externalLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenFAQs) && Intrinsics.c(this.f7713a, ((OpenFAQs) obj).f7713a);
            }

            public final int hashCode() {
                return this.f7713a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenFAQs(externalLink=", this.f7713a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions$OpenMessageUs;", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpAndSupportContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMessageUs extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7714a;
            public final String b;

            public OpenMessageUs(String title, String oliveUrl) {
                Intrinsics.h(title, "title");
                Intrinsics.h(oliveUrl, "oliveUrl");
                this.f7714a = title;
                this.b = oliveUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenMessageUs)) {
                    return false;
                }
                OpenMessageUs openMessageUs = (OpenMessageUs) obj;
                return Intrinsics.c(this.f7714a, openMessageUs.f7714a) && Intrinsics.c(this.b, openMessageUs.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7714a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenMessageUs(title=", this.f7714a, ", oliveUrl=", this.b, ")");
            }
        }
    }
}
