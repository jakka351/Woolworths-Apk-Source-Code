package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class zzae implements Parcelable.Creator<zzaf> {
    @Override // android.os.Parcelable.Creator
    public final zzaf createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzahv zzahvVar = null;
        String strCreateString = null;
        String strCreateString2 = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString3 = null;
        Boolean booleanObject = null;
        zzah zzahVar = null;
        com.google.firebase.auth.zze zzeVar = null;
        zzbj zzbjVar = null;
        ArrayList arrayListCreateTypedList2 = null;
        boolean z = false;
        zzab zzabVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    zzahvVar = (zzahv) SafeParcelReader.createParcelable(parcel, header, zzahv.CREATOR);
                    break;
                case 2:
                    zzabVar = (zzab) SafeParcelReader.createParcelable(parcel, header, zzab.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzab.CREATOR);
                    break;
                case 6:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 9:
                    zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, header, zzah.CREATOR);
                    break;
                case 10:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    zzeVar = (com.google.firebase.auth.zze) SafeParcelReader.createParcelable(parcel, header, com.google.firebase.auth.zze.CREATOR);
                    break;
                case 12:
                    zzbjVar = (zzbj) SafeParcelReader.createParcelable(parcel, header, zzbj.CREATOR);
                    break;
                case 13:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, com.google.firebase.auth.zzan.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        zzaf zzafVar = new zzaf();
        zzafVar.d = zzahvVar;
        zzafVar.e = zzabVar;
        zzafVar.f = strCreateString;
        zzafVar.g = strCreateString2;
        zzafVar.h = arrayListCreateTypedList;
        zzafVar.i = arrayListCreateStringList;
        zzafVar.j = strCreateString3;
        zzafVar.k = booleanObject;
        zzafVar.l = zzahVar;
        zzafVar.m = z;
        zzafVar.n = zzeVar;
        zzafVar.o = zzbjVar;
        zzafVar.p = arrayListCreateTypedList2;
        return zzafVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf[] newArray(int i) {
        return new zzaf[i];
    }
}
