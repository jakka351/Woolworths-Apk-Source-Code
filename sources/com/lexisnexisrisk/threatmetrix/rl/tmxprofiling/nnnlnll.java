package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nnnlnll implements jjjxxjj.jjjjxxj {
    private static final String ee006500650065e0065 = lqlqqll.u00750075u00750075u(nnnlnll.class);

    @Nonnull
    private final CountDownLatch e0065006500650065e0065;

    @Nonnull
    private final nlnlnll eeeee00650065;

    public static class nlnlnll implements ServiceConnection {

        @Nullable
        private volatile IBinder e0065eee00650065 = null;
        private final CountDownLatch ee0065ee00650065;

        public nlnlnll(CountDownLatch countDownLatch) {
            this.ee0065ee00650065 = countDownLatch;
        }

        @Nullable
        private static String d0064dd0064d0064(@Nonnull IBinder iBinder) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception e) {
                    lqlqqll.llqqqll.u0075uuuuu(nnnlnll.ee006500650065e0065, "Failed to obtain Advertising ID {}", e.toString());
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return null;
                }
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Nullable
        public String dddd0064d0064() {
            IBinder iBinder = this.e0065eee00650065;
            if (iBinder != null) {
                return d0064dd0064d0064(iBinder);
            }
            return null;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, @Nullable IBinder iBinder) {
            if (iBinder != null) {
                this.e0065eee00650065 = iBinder;
                this.ee0065ee00650065.countDown();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.e0065eee00650065 = null;
        }
    }

    public nnnlnll() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.e0065006500650065e0065 = countDownLatch;
        this.eeeee00650065 = new nlnlnll(countDownLatch);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.jjjjxxj
    public boolean bindToGooglePlayService(@Nonnull nlllnnl nlllnnlVar) {
        if (nlllnnlVar == null || nlllnnlVar.ww0077w007700770077 == null) {
            lqlqqll.u0075u0075uu0075(ee006500650065e0065, "Null context");
            return false;
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return nlllnnlVar.ww0077w007700770077.bindService(intent, this.eeeee00650065, 1);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.jjjjxxj
    @Nullable
    public String getAdvertisingId(int i) {
        try {
            if (this.e0065006500650065e0065.await(i, TimeUnit.MILLISECONDS)) {
                return this.eeeee00650065.dddd0064d0064();
            }
            lqlqqll.llqqqll.yy00790079007900790079(ee006500650065e0065, "Failed to get Google Advertising ID, Time out");
            return null;
        } catch (InterruptedException e) {
            lqlqqll.llqqqll.u0075uuuuu(ee006500650065e0065, "Failed to get Google Advertising ID {}", e.toString());
            return null;
        } catch (Exception e2) {
            lqlqqll.uuu007500750075u(ee006500650065e0065, e2.toString());
            return null;
        }
    }
}
