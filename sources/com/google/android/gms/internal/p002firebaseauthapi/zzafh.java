package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzau;
import java.util.Objects;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzafh implements zzaem {
    final /* synthetic */ zzaff zza;

    public zzafh(zzaff zzaffVar) {
        Objects.requireNonNull(zzaffVar);
        this.zza = zzaffVar;
    }

    private final void zza(zzafm zzafmVar) {
        this.zza.zzi.execute(new zzafn(this, zzafmVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb(String str) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 8, "Unexpected response type " + i);
        zza(new zzafj(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc(String str) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 7, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    private final void zza(Status status, AuthCredential authCredential, @Nullable String str, @Nullable String str2) {
        zzaff.zza(this.zza, status);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzn = authCredential;
        zzaffVar.zzo = str;
        zzaffVar.zzp = str2;
        zzau zzauVar = zzaffVar.zzf;
        if (zzauVar != null) {
            zzauVar.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb() throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 6, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzc() throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 9, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 8, "Unexpected response type " + i);
        this.zza.zzu = true;
        zza(new zzafl(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 3, "Unexpected response type " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzl = zzagvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza() throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 5, "Unexpected response type " + i);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        zza(zzaapVar.zza(), zzaapVar.zzb(), zzaapVar.zzc(), zzaapVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzq = zzaasVar;
        zzaffVar.zza(zzao.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 2, "Unexpected response type " + i);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zza == 8) {
            zzaffVar.zzu = true;
            zza(new zzafk(this, status));
        } else {
            zzaff.zza(zzaffVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) throws RemoteException {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzs = zzahrVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) throws RemoteException {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzr = zzahsVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 2, "Unexpected response type: " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaffVar.zzk = zzahkVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(@Nullable zzaif zzaifVar) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 4, "Unexpected response type " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzm = zzaifVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) throws RemoteException {
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) throws RemoteException {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzt = zzairVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 1, "Unexpected response type: " + i);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i = this.zza.zza;
        Preconditions.checkState(i == 8, "Unexpected response type " + i);
        this.zza.zzu = true;
        zza(new zzafi(this, phoneAuthCredential));
    }
}
