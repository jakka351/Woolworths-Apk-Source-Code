package com.google.android.recaptcha.internal;

import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzew {

    @NotNull
    private final HttpURLConnection zza;

    public zzew(@NotNull HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() throws zzbd {
        try {
            return Callback.a(this.zza);
        } catch (UnknownServiceException e) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e3.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbd {
        try {
            return Callback.d(this.zza);
        } catch (UnknownServiceException e) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e3.getMessage());
        }
    }

    @NotNull
    public final zzoi zza(@NotNull zzoi zzoiVar) throws IOException, zzbd {
        try {
            int iF = Callback.f(this.zza);
            if (iF != 200) {
                if (iF == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (iF != 503 && iF != 403) {
                    if (iF != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            byte[] bArrB = ByteStreamsKt.b(zzf());
            if (bArrB.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object objZzb = zzoiVar.zzD().zzb(bArrB);
                Intrinsics.f(objZzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) objZzb;
            } catch (Exception e) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e.getMessage());
            }
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e2.getMessage());
        }
    }

    @NotNull
    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() throws IOException, zzbd {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e.getMessage());
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e3.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(@NotNull byte[] bArr) throws IOException, zzbd {
        try {
            zzg().write(bArr);
        } catch (zzbd e) {
            throw e;
        } catch (IOException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e3.getMessage());
        }
    }
}
