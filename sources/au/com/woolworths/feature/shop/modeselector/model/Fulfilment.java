package au.com.woolworths.feature.shop.modeselector.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.base.shopapp.modules.button.Analytics;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment;", "", "DividerCard", "ButtonData", "Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment$ButtonData;", "Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment$DividerCard;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Fulfilment {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment$ButtonData;", "Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonData implements Fulfilment {

        /* renamed from: a, reason: collision with root package name */
        public final String f7525a;
        public final ButtonActionApiData b;
        public final ButtonStyleApiData c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;
        public final Analytics h;

        public ButtonData(String str, ButtonActionApiData buttonActionApiData, ButtonStyleApiData buttonStyleApiData, boolean z, String str2, String str3, String str4, Analytics analytics) {
            this.f7525a = str;
            this.b = buttonActionApiData;
            this.c = buttonStyleApiData;
            this.d = z;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonData)) {
                return false;
            }
            ButtonData buttonData = (ButtonData) obj;
            return Intrinsics.c(this.f7525a, buttonData.f7525a) && this.b == buttonData.b && this.c == buttonData.c && this.d == buttonData.d && Intrinsics.c(this.e, buttonData.e) && Intrinsics.c(this.f, buttonData.f) && Intrinsics.c(this.g, buttonData.g) && Intrinsics.c(this.h, buttonData.h);
        }

        public final int hashCode() {
            int iHashCode = this.f7525a.hashCode() * 31;
            ButtonActionApiData buttonActionApiData = this.b;
            int iHashCode2 = (iHashCode + (buttonActionApiData == null ? 0 : buttonActionApiData.hashCode())) * 31;
            ButtonStyleApiData buttonStyleApiData = this.c;
            int iE = b.e((iHashCode2 + (buttonStyleApiData == null ? 0 : buttonStyleApiData.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iHashCode3 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Analytics analytics = this.h;
            return iHashCode5 + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonData(label=");
            sb.append(this.f7525a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", style=");
            sb.append(this.c);
            sb.append(", enabled=");
            sb.append(this.d);
            sb.append(", url=");
            a.B(sb, this.e, ", iconUrl=", this.f, ", altText=");
            sb.append(this.g);
            sb.append(", analytics=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment$DividerCard;", "Lau/com/woolworths/feature/shop/modeselector/model/Fulfilment;", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DividerCard implements Fulfilment {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f7526a;

        public DividerCard(Boolean bool) {
            this.f7526a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DividerCard) && Intrinsics.c(this.f7526a, ((DividerCard) obj).f7526a);
        }

        public final int hashCode() {
            Boolean bool = this.f7526a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f7526a, "DividerCard(value=", ")");
        }
    }
}
