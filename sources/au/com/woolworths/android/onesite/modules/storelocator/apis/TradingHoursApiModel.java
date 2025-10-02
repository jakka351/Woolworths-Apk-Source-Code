package au.com.woolworths.android.onesite.modules.storelocator.apis;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/android/onesite/modules/storelocator/apis/TradingHoursApiModel;", "", "", "day", "openHour", "tradingHourForDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "getTradingHourForDisplay", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TradingHoursApiModel {

    @SerializedName("Day")
    @NotNull
    private final String day;

    @SerializedName("OpenHour")
    @NotNull
    private final String openHour;

    @SerializedName("TradingHourForDisplay")
    @NotNull
    private final String tradingHourForDisplay;

    public TradingHoursApiModel(@NotNull String day, @NotNull String openHour, @NotNull String tradingHourForDisplay) {
        Intrinsics.h(day, "day");
        Intrinsics.h(openHour, "openHour");
        Intrinsics.h(tradingHourForDisplay, "tradingHourForDisplay");
        this.day = day;
        this.openHour = openHour;
        this.tradingHourForDisplay = tradingHourForDisplay;
    }

    /* renamed from: a, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    /* renamed from: b, reason: from getter */
    public final String getOpenHour() {
        return this.openHour;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradingHoursApiModel)) {
            return false;
        }
        TradingHoursApiModel tradingHoursApiModel = (TradingHoursApiModel) obj;
        return Intrinsics.c(this.day, tradingHoursApiModel.day) && Intrinsics.c(this.openHour, tradingHoursApiModel.openHour) && Intrinsics.c(this.tradingHourForDisplay, tradingHoursApiModel.tradingHourForDisplay);
    }

    public final int hashCode() {
        return this.tradingHourForDisplay.hashCode() + b.c(this.day.hashCode() * 31, 31, this.openHour);
    }

    public final String toString() {
        String str = this.day;
        String str2 = this.openHour;
        return a.o(a.v("TradingHoursApiModel(day=", str, ", openHour=", str2, ", tradingHourForDisplay="), this.tradingHourForDisplay, ")");
    }
}
