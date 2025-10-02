package au.com.woolworths.base.shopapp.data.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/data/models/InfoSectionAnalytics;", "Lau/com/woolworths/android/onesite/analytics/Action;", "Landroid/os/Parcelable;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoSectionAnalytics implements Action, Parcelable {

    @NotNull
    public static final Parcelable.Creator<InfoSectionAnalytics> CREATOR = new Creator();
    public final Screens d;
    public final Category e;
    public final String f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoSectionAnalytics> {
        @Override // android.os.Parcelable.Creator
        public final InfoSectionAnalytics createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InfoSectionAnalytics(Screens.valueOf(parcel.readString()), Category.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoSectionAnalytics[] newArray(int i) {
            return new InfoSectionAnalytics[i];
        }
    }

    public InfoSectionAnalytics(Screens screen, Category category, String label) {
        Intrinsics.h(screen, "screen");
        Intrinsics.h(category, "category");
        Intrinsics.h(label, "label");
        this.d = screen;
        this.e = category;
        this.f = label;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoSectionAnalytics)) {
            return false;
        }
        InfoSectionAnalytics infoSectionAnalytics = (InfoSectionAnalytics) obj;
        return this.d == infoSectionAnalytics.d && this.e == infoSectionAnalytics.e && Intrinsics.c(this.f, infoSectionAnalytics.f);
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoSectionAnalytics(screen=");
        sb.append(this.d);
        sb.append(", category=");
        sb.append(this.e);
        sb.append(", label=");
        return a.o(sb, this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        dest.writeString(this.f);
    }
}
