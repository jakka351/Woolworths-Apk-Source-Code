package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
/* loaded from: classes6.dex */
public final class zzaf extends FirebaseUser {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();
    public zzahv d;
    public zzab e;
    public String f;
    public String g;
    public ArrayList h;
    public ArrayList i;
    public String j;
    public Boolean k;
    public zzah l;
    public boolean m;
    public com.google.firebase.auth.zze n;
    public zzbj o;
    public List p;

    public zzaf(FirebaseApp firebaseApp, ArrayList arrayList) {
        Preconditions.checkNotNull(firebaseApp);
        firebaseApp.a();
        this.f = firebaseApp.b;
        this.g = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.j = "2";
        B2(arrayList);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String A() {
        Map map;
        zzahv zzahvVar = this.d;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) zzbi.a(this.d.zzc()).b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized zzaf B2(List list) {
        try {
            Preconditions.checkNotNull(list);
            this.h = new ArrayList(list.size());
            this.i = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                UserInfo userInfo = (UserInfo) list.get(i);
                if (userInfo.b().equals("firebase")) {
                    this.e = (zzab) userInfo;
                } else {
                    this.i.add(userInfo.b());
                }
                this.h.add((zzab) userInfo);
            }
            if (this.e == null) {
                this.e = (zzab) this.h.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void C2(zzahv zzahvVar) {
        this.d = (zzahv) Preconditions.checkNotNull(zzahvVar);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ zzaf D2() {
        this.k = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void E2(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.p = list;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzahv F2() {
        return this.d;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void G2(List list) {
        zzbj zzbjVar;
        if (list == null || list.isEmpty()) {
            zzbjVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList2.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbjVar = new zzbj(arrayList, arrayList2);
        }
        this.o = zzbjVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List H2() {
        return this.p;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final String b() {
        return this.e.e;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ zzaj d() {
        return new zzaj(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean d2() {
        String str;
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.d;
            if (zzahvVar != null) {
                Map map = (Map) zzbi.a(zzahvVar.zzc()).b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = true;
            if (this.h.size() > 1 || (str != null && str.equals(i.a.m))) {
                z = false;
            }
            this.k = Boolean.valueOf(z);
        }
        return this.k.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String k0() {
        return this.e.d;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List v() {
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.e, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f, false);
        SafeParcelWriter.writeString(parcel, 4, this.g, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.h, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.i, false);
        SafeParcelWriter.writeString(parcel, 7, this.j, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(d2()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.l, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.m);
        SafeParcelWriter.writeParcelable(parcel, 11, this.n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.o, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.p, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return this.d.zzc();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.d.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzg() {
        return this.i;
    }
}
