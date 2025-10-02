package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BD\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0014\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bHÆ\u0003JN\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001f\u0010\b\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lau/com/woolworths/product/details/models/CppProductsHorizontalList;", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "Landroid/os/Parcelable;", "title", "", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "items", "", "", "Lkotlinx/parcelize/RawValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getActionTitle", "getDeepLink", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CppProductsHorizontalList implements HorizontalListDataInterface, Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CppProductsHorizontalList> CREATOR = new Creator();

    @Nullable
    private final String actionTitle;

    @Nullable
    private final String deepLink;

    @NotNull
    private final List<Object> items;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CppProductsHorizontalList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CppProductsHorizontalList createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readValue(CppProductsHorizontalList.class.getClassLoader()));
            }
            return new CppProductsHorizontalList(string, string2, string3, string4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CppProductsHorizontalList[] newArray(int i) {
            return new CppProductsHorizontalList[i];
        }
    }

    public CppProductsHorizontalList(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<? extends Object> items) {
        Intrinsics.h(items, "items");
        this.title = str;
        this.subtitle = str2;
        this.actionTitle = str3;
        this.deepLink = str4;
        this.items = items;
    }

    public static /* synthetic */ CppProductsHorizontalList copy$default(CppProductsHorizontalList cppProductsHorizontalList, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cppProductsHorizontalList.title;
        }
        if ((i & 2) != 0) {
            str2 = cppProductsHorizontalList.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = cppProductsHorizontalList.actionTitle;
        }
        if ((i & 8) != 0) {
            str4 = cppProductsHorizontalList.deepLink;
        }
        if ((i & 16) != 0) {
            list = cppProductsHorizontalList.items;
        }
        List list2 = list;
        String str5 = str3;
        return cppProductsHorizontalList.copy(str, str2, str5, str4, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    @NotNull
    public final List<Object> component5() {
        return this.items;
    }

    @NotNull
    public final CppProductsHorizontalList copy(@Nullable String title, @Nullable String subtitle, @Nullable String actionTitle, @Nullable String deepLink, @NotNull List<? extends Object> items) {
        Intrinsics.h(items, "items");
        return new CppProductsHorizontalList(title, subtitle, actionTitle, deepLink, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CppProductsHorizontalList)) {
            return false;
        }
        CppProductsHorizontalList cppProductsHorizontalList = (CppProductsHorizontalList) other;
        return Intrinsics.c(this.title, cppProductsHorizontalList.title) && Intrinsics.c(this.subtitle, cppProductsHorizontalList.subtitle) && Intrinsics.c(this.actionTitle, cppProductsHorizontalList.actionTitle) && Intrinsics.c(this.deepLink, cppProductsHorizontalList.deepLink) && Intrinsics.c(this.items, cppProductsHorizontalList.items);
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    /* renamed from: getActionTitle */
    public String getF() {
        return this.actionTitle;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    /* renamed from: getDeepLink */
    public String getG() {
        return this.deepLink;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @NotNull
    /* renamed from: getItems */
    public List<Object> getH() {
        return this.items;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    /* renamed from: getSubtitle */
    public String getE() {
        return this.subtitle;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    @Nullable
    /* renamed from: getTitle */
    public String getD() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deepLink;
        return this.items.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.actionTitle;
        String str4 = this.deepLink;
        List<Object> list = this.items;
        StringBuilder sbV = a.v("CppProductsHorizontalList(title=", str, ", subtitle=", str2, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", deepLink=", str4, ", items=");
        return android.support.v4.media.session.a.t(sbV, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.actionTitle);
        dest.writeString(this.deepLink);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.items, dest);
        while (itU.hasNext()) {
            dest.writeValue(itU.next());
        }
    }

    public /* synthetic */ CppProductsHorizontalList(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, list);
    }
}
