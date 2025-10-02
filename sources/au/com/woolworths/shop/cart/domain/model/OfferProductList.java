package au.com.woolworths.shop.cart.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/OfferProductList;", "", "Success", "Fail", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Fail;", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Success;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OfferProductList {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Fail;", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Fail implements OfferProductList {

        /* renamed from: a, reason: collision with root package name */
        public final String f10434a;

        public Fail(String str) {
            this.f10434a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fail) && Intrinsics.c(this.f10434a, ((Fail) obj).f10434a);
        }

        public final int hashCode() {
            return this.f10434a.hashCode();
        }

        public final String toString() {
            return a.h("Fail(errorDescription=", this.f10434a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Success;", "Lau/com/woolworths/shop/cart/domain/model/OfferProductList;", "Progress", "OfferType", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements OfferProductList {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10435a;
        public final String b;
        public final String c;
        public final String d;
        public final Progress e;
        public final OfferType f;
        public final List g;
        public final AnalyticsData h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Success$OfferType;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OfferType {
            public static final OfferType d;
            public static final OfferType e;
            public static final OfferType f;
            public static final /* synthetic */ OfferType[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                OfferType offerType = new OfferType("UNKNOWN", 0);
                d = offerType;
                OfferType offerType2 = new OfferType("BMSM", 1);
                e = offerType2;
                OfferType offerType3 = new OfferType("MemberPrice", 2);
                f = offerType3;
                OfferType[] offerTypeArr = {offerType, offerType2, offerType3};
                g = offerTypeArr;
                h = EnumEntriesKt.a(offerTypeArr);
            }

            public static OfferType valueOf(String str) {
                return (OfferType) Enum.valueOf(OfferType.class, str);
            }

            public static OfferType[] values() {
                return (OfferType[]) g.clone();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Success$Progress;", "", "ProgressStepType", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Progress {

            /* renamed from: a, reason: collision with root package name */
            public final String f10436a;
            public final int b;
            public final ProgressStepType c;
            public final int d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/OfferProductList$Success$Progress$ProgressStepType;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ProgressStepType {
                public static final ProgressStepType d;
                public static final ProgressStepType e;
                public static final ProgressStepType f;
                public static final ProgressStepType g;
                public static final ProgressStepType h;
                public static final /* synthetic */ ProgressStepType[] i;
                public static final /* synthetic */ EnumEntries j;

                static {
                    ProgressStepType progressStepType = new ProgressStepType("DONE", 0);
                    d = progressStepType;
                    ProgressStepType progressStepType2 = new ProgressStepType("LOAD", 1);
                    e = progressStepType2;
                    ProgressStepType progressStepType3 = new ProgressStepType("INPROGRESS", 2);
                    f = progressStepType3;
                    ProgressStepType progressStepType4 = new ProgressStepType("WARNING", 3);
                    g = progressStepType4;
                    ProgressStepType progressStepType5 = new ProgressStepType("EMPTY", 4);
                    h = progressStepType5;
                    ProgressStepType[] progressStepTypeArr = {progressStepType, progressStepType2, progressStepType3, progressStepType4, progressStepType5};
                    i = progressStepTypeArr;
                    j = EnumEntriesKt.a(progressStepTypeArr);
                }

                public static ProgressStepType valueOf(String str) {
                    return (ProgressStepType) Enum.valueOf(ProgressStepType.class, str);
                }

                public static ProgressStepType[] values() {
                    return (ProgressStepType[]) i.clone();
                }
            }

            public Progress(String str, int i, ProgressStepType progressStepType, int i2) {
                this.f10436a = str;
                this.b = i;
                this.c = progressStepType;
                this.d = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Progress)) {
                    return false;
                }
                Progress progress = (Progress) obj;
                return Intrinsics.c(this.f10436a, progress.f10436a) && this.b == progress.b && this.c == progress.c && this.d == progress.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + ((this.c.hashCode() + b.a(this.b, this.f10436a.hashCode() * 31, 31)) * 31);
            }

            public final String toString() {
                StringBuilder sbU = b.u("Progress(currentStep=", this.b, this.f10436a, ", currentStepPosition=", ", currentStepType=");
                sbU.append(this.c);
                sbU.append(", totalSteps=");
                sbU.append(this.d);
                sbU.append(")");
                return sbU.toString();
            }
        }

        public Success(boolean z, String str, String str2, String str3, Progress progress, OfferType offerType, List offerProducts, AnalyticsData analyticsData) {
            Intrinsics.h(offerProducts, "offerProducts");
            this.f10435a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = progress;
            this.f = offerType;
            this.g = offerProducts;
            this.h = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.f10435a == success.f10435a && Intrinsics.c(this.b, success.b) && Intrinsics.c(this.c, success.c) && Intrinsics.c(this.d, success.d) && Intrinsics.c(this.e, success.e) && this.f == success.f && Intrinsics.c(this.g, success.g) && Intrinsics.c(this.h, success.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + b.d((this.f.hashCode() + ((this.e.hashCode() + b.c(b.c(b.c(Boolean.hashCode(this.f10435a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("Success(isApplied=", ", badgeImage=", this.b, ", title=", this.f10435a);
            androidx.constraintlayout.core.state.a.B(sbT, this.c, ", subtitle=", this.d, ", progress=");
            sbT.append(this.e);
            sbT.append(", offerType=");
            sbT.append(this.f);
            sbT.append(", offerProducts=");
            sbT.append(this.g);
            sbT.append(", impressionAnalytics=");
            sbT.append(this.h);
            sbT.append(")");
            return sbT.toString();
        }
    }
}
