package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class zzbhp extends zzaya implements zzbhq {
    public zzbhp() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbhn zzbhlVar;
        switch (i) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbfw zzbfwVarZzh = zzh();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbfwVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzn = zzn();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzedVarZzn);
                return true;
            case 12:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbfp zzbfpVarZzq = zzq();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbfpVarZzq);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzt(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzu = zzu();
                parcel2.writeNoException();
                zzayb.zze(parcel2, iObjectWrapperZzu);
                return true;
            case 19:
                IObjectWrapper iObjectWrapperZzv = zzv();
                parcel2.writeNoException();
                zzayb.zze(parcel2, iObjectWrapperZzv);
                return true;
            case 20:
                Bundle bundleZzw = zzw();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, bundleZzw);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbhlVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbhlVar = iInterfaceQueryLocalInterface instanceof zzbhn ? (zzbhn) iInterfaceQueryLocalInterface : new zzbhl(strongBinder);
                }
                zzayb.zzh(parcel);
                zzx(zzbhlVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(listZzz);
                return true;
            case 24:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i3 = zzayb.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdj zzdjVarZzb = com.google.android.gms.ads.internal.client.zzdi.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzB(zzdjVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdf zzdfVarZzb = com.google.android.gms.ads.internal.client.zzde.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzC(zzdfVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbft zzbftVarZzF = zzF();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzbftVarZzF);
                return true;
            case 30:
                boolean zZzG = zzG();
                parcel2.writeNoException();
                int i4 = zzayb.zza;
                parcel2.writeInt(zZzG ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzH = zzH();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzeaVarZzH);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzI(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzJ(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long jZzK = zzK();
                parcel2.writeNoException();
                parcel2.writeLong(jZzK);
                return true;
            case 35:
                long j = parcel.readLong();
                zzayb.zzh(parcel);
                zzL(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
