package au.com.woolworths.feature.shop.modeselector.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection;", "", "ShoppingModeSelectorOptionsSection", "ShoppingModeSelectorAddressInfoSection", "ShoppingModeSelectorStoreDetailsSectionData", "ShoppingModeSelectorStoreFeaturesData", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorAddressInfoSection;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorOptionsSection;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorStoreDetailsSectionData;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorStoreFeaturesData;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ShoppingModeSection {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorAddressInfoSection;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeSelectorAddressInfoSection implements ShoppingModeSection {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingModeSelectorAddressDetails f7533a;
        public final String b;

        public ShoppingModeSelectorAddressInfoSection(ShoppingModeSelectorAddressDetails shoppingModeSelectorAddressDetails, String str) {
            this.f7533a = shoppingModeSelectorAddressDetails;
            this.b = str;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingModeSelectorAddressDetails getF7533a() {
            return this.f7533a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeSelectorAddressInfoSection)) {
                return false;
            }
            ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection = (ShoppingModeSelectorAddressInfoSection) obj;
            return Intrinsics.c(this.f7533a, shoppingModeSelectorAddressInfoSection.f7533a) && Intrinsics.c(this.b, shoppingModeSelectorAddressInfoSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7533a.hashCode() * 31);
        }

        public final String toString() {
            return "ShoppingModeSelectorAddressInfoSection(details=" + this.f7533a + ", addressTitle=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorOptionsSection;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeSelectorOptionsSection implements ShoppingModeSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f7534a;
        public final List b;
        public final String c;
        public final String d;

        public ShoppingModeSelectorOptionsSection(String str, String str2, String str3, List list) {
            this.f7534a = str;
            this.b = list;
            this.c = str2;
            this.d = str3;
        }

        public static ShoppingModeSelectorOptionsSection a(ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection, ArrayList arrayList) {
            String str = shoppingModeSelectorOptionsSection.f7534a;
            String str2 = shoppingModeSelectorOptionsSection.c;
            String str3 = shoppingModeSelectorOptionsSection.d;
            shoppingModeSelectorOptionsSection.getClass();
            return new ShoppingModeSelectorOptionsSection(str, str2, str3, arrayList);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeSelectorOptionsSection)) {
                return false;
            }
            ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection = (ShoppingModeSelectorOptionsSection) obj;
            return Intrinsics.c(this.f7534a, shoppingModeSelectorOptionsSection.f7534a) && Intrinsics.c(this.b, shoppingModeSelectorOptionsSection.b) && Intrinsics.c(this.c, shoppingModeSelectorOptionsSection.c) && Intrinsics.c(this.d, shoppingModeSelectorOptionsSection.d);
        }

        public final int hashCode() {
            String str = this.f7534a;
            int iD = b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return a.l(au.com.woolworths.android.onesite.a.s("ShoppingModeSelectorOptionsSection(optionTitle=", this.f7534a, ", items=", ", footnote=", this.b), this.c, ", disclaimer=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorStoreDetailsSectionData;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeSelectorStoreDetailsSectionData implements ShoppingModeSection {

        /* renamed from: a, reason: collision with root package name */
        public final List f7535a;

        public ShoppingModeSelectorStoreDetailsSectionData(List list) {
            this.f7535a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShoppingModeSelectorStoreDetailsSectionData) && Intrinsics.c(this.f7535a, ((ShoppingModeSelectorStoreDetailsSectionData) obj).f7535a);
        }

        public final int hashCode() {
            return this.f7535a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("ShoppingModeSelectorStoreDetailsSectionData(storeDetails=", ")", this.f7535a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection$ShoppingModeSelectorStoreFeaturesData;", "Lau/com/woolworths/feature/shop/modeselector/model/ShoppingModeSection;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeSelectorStoreFeaturesData implements ShoppingModeSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f7536a;
        public final List b;

        public ShoppingModeSelectorStoreFeaturesData(String title, List list) {
            Intrinsics.h(title, "title");
            this.f7536a = title;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeSelectorStoreFeaturesData)) {
                return false;
            }
            ShoppingModeSelectorStoreFeaturesData shoppingModeSelectorStoreFeaturesData = (ShoppingModeSelectorStoreFeaturesData) obj;
            return Intrinsics.c(this.f7536a, shoppingModeSelectorStoreFeaturesData.f7536a) && Intrinsics.c(this.b, shoppingModeSelectorStoreFeaturesData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7536a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("ShoppingModeSelectorStoreFeaturesData(title=", this.f7536a, ", features=", ")", this.b);
        }
    }
}
