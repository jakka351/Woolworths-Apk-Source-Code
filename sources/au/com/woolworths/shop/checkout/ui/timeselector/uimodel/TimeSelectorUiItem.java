package au.com.woolworths.shop.checkout.ui.timeselector.uimodel;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem;", "", "DateSelectorUiItem", "TimeOfDaySelectorUiItem", "SuggestedTimeSlotUiItem", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$DateSelectorUiItem;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$SuggestedTimeSlotUiItem;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$TimeOfDaySelectorUiItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TimeSelectorUiItem {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$DateSelectorUiItem;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DateSelectorUiItem implements TimeSelectorUiItem {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f10844a;

        public DateSelectorUiItem(ArrayList arrayList) {
            this.f10844a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateSelectorUiItem) && this.f10844a.equals(((DateSelectorUiItem) obj).f10844a);
        }

        public final int hashCode() {
            return this.f10844a.hashCode();
        }

        public final String toString() {
            return a.k("DateSelectorUiItem(dates=", ")", this.f10844a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$SuggestedTimeSlotUiItem;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedTimeSlotUiItem implements TimeSelectorUiItem {

        /* renamed from: a, reason: collision with root package name */
        public final List f10845a;
        public final String b;
        public final FulfilmentBottomSheet c;

        public SuggestedTimeSlotUiItem(List list, String str, FulfilmentBottomSheet fulfilmentBottomSheet) {
            this.f10845a = list;
            this.b = str;
            this.c = fulfilmentBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuggestedTimeSlotUiItem)) {
                return false;
            }
            SuggestedTimeSlotUiItem suggestedTimeSlotUiItem = (SuggestedTimeSlotUiItem) obj;
            return Intrinsics.c(this.f10845a, suggestedTimeSlotUiItem.f10845a) && Intrinsics.c(this.b, suggestedTimeSlotUiItem.b) && Intrinsics.c(this.c, suggestedTimeSlotUiItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f10845a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            FulfilmentBottomSheet fulfilmentBottomSheet = this.c;
            return iHashCode2 + (fulfilmentBottomSheet != null ? fulfilmentBottomSheet.hashCode() : 0);
        }

        public final String toString() {
            return "SuggestedTimeSlotUiItem(slots=" + this.f10845a + ", title=" + this.b + ", tooltip=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem$TimeOfDaySelectorUiItem;", "Lau/com/woolworths/shop/checkout/ui/timeselector/uimodel/TimeSelectorUiItem;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TimeOfDaySelectorUiItem implements TimeSelectorUiItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f10846a;
        public final List b;

        public TimeOfDaySelectorUiItem(String str, List list) {
            this.f10846a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeOfDaySelectorUiItem)) {
                return false;
            }
            TimeOfDaySelectorUiItem timeOfDaySelectorUiItem = (TimeOfDaySelectorUiItem) obj;
            return Intrinsics.c(this.f10846a, timeOfDaySelectorUiItem.f10846a) && Intrinsics.c(this.b, timeOfDaySelectorUiItem.b);
        }

        public final int hashCode() {
            String str = this.f10846a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return a.i("TimeOfDaySelectorUiItem(title=", this.f10846a, ", timesOfDay=", ")", this.b);
        }
    }
}
