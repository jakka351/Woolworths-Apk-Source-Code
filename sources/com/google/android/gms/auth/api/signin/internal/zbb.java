package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import me.oriient.internal.infra.rest.RequestBuilder;

/* loaded from: classes5.dex */
public final class zbb implements Runnable {
    private static final Logger zba = new Logger("RevokeAccessOperation", new String[0]);
    private final String zbb;
    private final StatusPendingResult zbc = new StatusPendingResult((GoogleApiClient) null);

    public zbb(String str) {
        this.zbb = Preconditions.checkNotEmpty(str);
    }

    public static PendingResult zba(@Nullable String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zbb zbbVar = new zbb(str);
        new Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String str = this.zbb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            URLConnection uRLConnectionOpenConnection = new URL(sb.toString()).openConnection();
            Callback.v(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestProperty(RequestBuilder.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int iF = Callback.f(httpURLConnection);
            if (iF == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zba.e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = zba;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iF).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(iF);
            logger.d(sb2.toString(), new Object[0]);
        } catch (IOException e) {
            zba.e("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            zba.e("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.zbc.setResult(status);
    }
}
