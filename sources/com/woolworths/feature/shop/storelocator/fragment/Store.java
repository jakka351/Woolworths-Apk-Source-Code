package com.woolworths.feature.shop.storelocator.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.PickupOption;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/Store;", "Lcom/apollographql/apollo/api/Fragment$Data;", "InstoreTradingHour", "PickupType", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Store implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f20342a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;
    public final ArrayList g;
    public final double h;
    public final double i;
    public final Double j;
    public final ArrayList k;
    public final ArrayList l;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/Store$InstoreTradingHour;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstoreTradingHour {

        /* renamed from: a, reason: collision with root package name */
        public final String f20343a;
        public final String b;

        public InstoreTradingHour(String str, String str2) {
            this.f20343a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstoreTradingHour)) {
                return false;
            }
            InstoreTradingHour instoreTradingHour = (InstoreTradingHour) obj;
            return Intrinsics.c(this.f20343a, instoreTradingHour.f20343a) && Intrinsics.c(this.b, instoreTradingHour.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20343a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("InstoreTradingHour(dayLabel=", this.f20343a, ", hoursLabel=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/Store$PickupType;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PickupType {

        /* renamed from: a, reason: collision with root package name */
        public final int f20344a;
        public final String b;
        public final PickupOption c;
        public final String d;
        public final String e;

        public PickupType(int i, String str, PickupOption pickupOption, String str2, String str3) {
            this.f20344a = i;
            this.b = str;
            this.c = pickupOption;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickupType)) {
                return false;
            }
            PickupType pickupType = (PickupType) obj;
            return this.f20344a == pickupType.f20344a && Intrinsics.c(this.b, pickupType.b) && this.c == pickupType.c && Intrinsics.c(this.d, pickupType.d) && Intrinsics.c(this.e, pickupType.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + b.c((this.c.hashCode() + b.c(Integer.hashCode(this.f20344a) * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbP = androidx.constraintlayout.core.state.a.p("PickupType(addressId=", this.f20344a, ", shoppingModeId=", this.b, ", type=");
            sbP.append(this.c);
            sbP.append(", label=");
            sbP.append(this.d);
            sbP.append(", text=");
            return a.o(sbP, this.e, ")");
        }
    }

    public Store(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, ArrayList arrayList2, double d, double d2, Double d3, ArrayList arrayList3, ArrayList arrayList4) {
        this.f20342a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = str5;
        this.g = arrayList2;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = arrayList3;
        this.l = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Store)) {
            return false;
        }
        Store store = (Store) obj;
        return this.f20342a.equals(store.f20342a) && this.b.equals(store.b) && this.c.equals(store.c) && this.d.equals(store.d) && this.e.equals(store.e) && Intrinsics.c(this.f, store.f) && this.g.equals(store.g) && Double.compare(this.h, store.h) == 0 && Double.compare(this.i, store.i) == 0 && Intrinsics.c(this.j, store.j) && this.k.equals(store.k) && this.l.equals(store.l);
    }

    public final int hashCode() {
        int iB = androidx.compose.ui.input.pointer.a.b(b.c(b.c(b.c(this.f20342a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iA = android.support.v4.media.session.a.a(this.i, android.support.v4.media.session.a.a(this.h, androidx.compose.ui.input.pointer.a.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31), 31);
        Double d = this.j;
        return this.l.hashCode() + androidx.compose.ui.input.pointer.a.b((iA + (d != null ? d.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbV = a.v("Store(__typename=", this.f20342a, ", id=", this.b, ", name=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", address=", this.d, ", facilities=");
        sbV.append(this.e);
        sbV.append(", phone=");
        sbV.append(this.f);
        sbV.append(", instoreTradingHours=");
        sbV.append(this.g);
        sbV.append(", latitude=");
        sbV.append(this.h);
        au.com.woolworths.android.onesite.a.z(sbV, ", longitude=", this.i, ", distanceInKm=");
        sbV.append(this.j);
        sbV.append(", supportedShoppingModes=");
        sbV.append(this.k);
        sbV.append(", pickupTypes=");
        return android.support.v4.media.session.a.q(")", sbV, this.l);
    }
}
