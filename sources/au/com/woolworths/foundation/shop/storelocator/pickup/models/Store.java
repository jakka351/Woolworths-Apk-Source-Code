package au.com.woolworths.foundation.shop.storelocator.pickup.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.foundation.shop.storelocator.models.LocationDivision;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/pickup/models/Store;", "Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsData;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Store implements Activities.StoreDetails.ExtraLocationDetailsData {

    @NotNull
    public static final Parcelable.Creator<Store> CREATOR = new Creator();
    public final String d;
    public final LocationDivision e;
    public final String f;
    public final String g;
    public final double h;
    public final double i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;
    public final String o;
    public final StoreLocatorResult.Store p;
    public final List q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Store> {
        @Override // android.os.Parcelable.Creator
        public final Store createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            LocationDivision locationDivisionValueOf = LocationDivision.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(TradingHours.CREATOR, parcel, arrayList, iE, 1);
                i = i;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = a.e(PickUpType.CREATOR, parcel, arrayList2, iE2, 1);
                i2 = i2;
                string = string;
            }
            return new Store(string, locationDivisionValueOf, string2, string3, d, d2, string4, string5, arrayListCreateStringArrayList, arrayList, arrayList2, parcel.readString(), (StoreLocatorResult.Store) parcel.readSerializable(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Store[] newArray(int i) {
            return new Store[i];
        }
    }

    public Store(String storeNumber, LocationDivision locationDivision, String displayableName, String displayableAddress, double d, double d2, String str, String phone, List facilities, List list, List pickUpTypes, String str2, StoreLocatorResult.Store store, List list2) {
        Intrinsics.h(storeNumber, "storeNumber");
        Intrinsics.h(locationDivision, "locationDivision");
        Intrinsics.h(displayableName, "displayableName");
        Intrinsics.h(displayableAddress, "displayableAddress");
        Intrinsics.h(phone, "phone");
        Intrinsics.h(facilities, "facilities");
        Intrinsics.h(pickUpTypes, "pickUpTypes");
        this.d = storeNumber;
        this.e = locationDivision;
        this.f = displayableName;
        this.g = displayableAddress;
        this.h = d;
        this.i = d2;
        this.j = str;
        this.k = phone;
        this.l = facilities;
        this.m = list;
        this.n = pickUpTypes;
        this.o = str2;
        this.p = store;
        this.q = list2;
    }

    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Store)) {
            return false;
        }
        Store store = (Store) obj;
        return Intrinsics.c(this.d, store.d) && this.e == store.e && Intrinsics.c(this.f, store.f) && Intrinsics.c(this.g, store.g) && Double.compare(this.h, store.h) == 0 && Double.compare(this.i, store.i) == 0 && Intrinsics.c(this.j, store.j) && Intrinsics.c(this.k, store.k) && Intrinsics.c(this.l, store.l) && Intrinsics.c(this.m, store.m) && Intrinsics.c(this.n, store.n) && Intrinsics.c(this.o, store.o) && Intrinsics.c(this.p, store.p) && Intrinsics.c(this.q, store.q);
    }

    public final int hashCode() {
        int iA = android.support.v4.media.session.a.a(this.i, android.support.v4.media.session.a.a(this.h, b.c(b.c((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f), 31, this.g), 31), 31);
        String str = this.j;
        int iD = b.d(b.d(b.d(b.c((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoreLocatorResult.Store store = this.p;
        int iHashCode2 = (iHashCode + (store == null ? 0 : store.hashCode())) * 31;
        List list = this.q;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Store(storeNumber=");
        sb.append(this.d);
        sb.append(", locationDivision=");
        sb.append(this.e);
        sb.append(", displayableName=");
        androidx.constraintlayout.core.state.a.B(sb, this.f, ", displayableAddress=", this.g, ", latitude=");
        sb.append(this.h);
        au.com.woolworths.android.onesite.a.z(sb, ", longitude=", this.i, ", distanceKm=");
        androidx.constraintlayout.core.state.a.B(sb, this.j, ", phone=", this.k, ", facilities=");
        au.com.woolworths.android.onesite.a.C(sb, this.l, ", tradingHours=", this.m, ", pickUpTypes=");
        sb.append(this.n);
        sb.append(", selectedAddressId=");
        sb.append(this.o);
        sb.append(", legacyStore=");
        sb.append(this.p);
        sb.append(", supportedPickupTypes=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeDouble(this.h);
        dest.writeDouble(this.i);
        dest.writeString(this.j);
        dest.writeString(this.k);
        dest.writeStringList(this.l);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.m, dest);
        while (itU.hasNext()) {
            ((TradingHours) itU.next()).writeToParcel(dest, i);
        }
        Iterator itU2 = au.com.woolworths.android.onesite.a.u(this.n, dest);
        while (itU2.hasNext()) {
            ((PickUpType) itU2.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.o);
        dest.writeSerializable(this.p);
        dest.writeStringList(this.q);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ Store(java.lang.String r20, au.com.woolworths.foundation.shop.storelocator.models.LocationDivision r21, java.lang.String r22, java.lang.String r23, double r24, double r26, java.lang.String r28, java.lang.String r29, java.util.List r30, java.util.List r31, java.util.List r32, java.lang.String r33, au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult.Store r34, java.util.List r35, int r36) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto La
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.d
            r15 = r1
            goto Lc
        La:
            r15 = r32
        Lc:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L14
            r16 = r2
            goto L16
        L14:
            r16 = r33
        L16:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L1d
            r17 = r2
            goto L1f
        L1d:
            r17 = r34
        L1f:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L3c
            r18 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r9 = r26
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r2 = r19
            goto L54
        L3c:
            r18 = r35
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r9 = r26
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
        L54:
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.storelocator.pickup.models.Store.<init>(java.lang.String, au.com.woolworths.foundation.shop.storelocator.models.LocationDivision, java.lang.String, java.lang.String, double, double, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult$Store, java.util.List, int):void");
    }
}
