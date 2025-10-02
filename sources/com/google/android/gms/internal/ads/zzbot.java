package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class zzbot extends zzbow {
    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbpa zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbot.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbpy((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbpy((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                com.google.android.gms.ads.internal.util.client.zzo.zzj(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new zzbpy(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new zzbpy(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzc(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbot.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbot.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbqw zze(String str) throws RemoteException {
        return new zzbrj((RtbAdapter) Class.forName(str, false, zzbra.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
