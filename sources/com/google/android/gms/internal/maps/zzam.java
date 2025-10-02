package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzam extends zza implements zzao {
    public zzam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzA(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzB(zzao zzaoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzaoVar);
        Parcel parcelZzJ = zzJ(19, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzC() throws RemoteException {
        Parcel parcelZzJ = zzJ(22, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzD() throws RemoteException {
        Parcel parcelZzJ = zzJ(18, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzE() throws RemoteException {
        Parcel parcelZzJ = zzJ(16, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final float zzd() throws RemoteException {
        Parcel parcelZzJ = zzJ(8, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final float zze() throws RemoteException {
        Parcel parcelZzJ = zzJ(14, zza());
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzf() throws RemoteException {
        Parcel parcelZzJ = zzJ(12, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzg() throws RemoteException {
        Parcel parcelZzJ = zzJ(10, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzh() throws RemoteException {
        Parcel parcelZzJ = zzJ(24, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzi() throws RemoteException {
        Parcel parcelZzJ = zzJ(20, zza());
        int i = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final IObjectWrapper zzj() throws RemoteException {
        return a.i(zzJ(28, zza()));
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final String zzk() throws RemoteException {
        Parcel parcelZzJ = zzJ(2, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final List zzl() throws RemoteException {
        Parcel parcelZzJ = zzJ(6, zza());
        ArrayList arrayListZzb = zzc.zzb(parcelZzJ);
        parcelZzJ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final List zzm() throws RemoteException {
        Parcel parcelZzJ = zzJ(4, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(LatLng.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final List zzn() throws RemoteException {
        Parcel parcelZzJ = zzJ(26, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzJ.createTypedArrayList(PatternItem.CREATOR);
        parcelZzJ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzo() throws RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzq(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzr(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzs(List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeList(list);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzt(List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzu(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzv(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzw(List list) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzx(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, iObjectWrapper);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzz(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(15, parcelZza);
    }
}
