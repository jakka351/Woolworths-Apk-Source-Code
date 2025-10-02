package com.tealium.core.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/network/a;", "Lcom/tealium/core/network/Connectivity;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class a implements Connectivity {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // com.tealium.core.network.Connectivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r7 = this;
            android.net.ConnectivityManager r0 = r7.c()
            r1 = 1
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r1)
            if (r0 == 0) goto L10
            boolean r0 = r0.isConnected()
            return r0
        L10:
            android.net.ConnectivityManager r0 = r7.c()
            android.net.Network[] r0 = r0.getAllNetworks()
            java.lang.String r2 = "connectivityManager.allNetworks"
            kotlin.jvm.internal.Intrinsics.g(r0, r2)
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L21:
            if (r4 >= r2) goto L40
            r6 = r0[r4]
            if (r5 != 0) goto L3c
            android.net.ConnectivityManager r5 = r7.c()
            android.net.NetworkInfo r5 = r5.getNetworkInfo(r6)
            if (r5 == 0) goto L36
            boolean r5 = r5.isConnected()
            goto L37
        L36:
            r5 = r3
        L37:
            if (r5 == 0) goto L3a
            goto L3c
        L3a:
            r5 = r3
            goto L3d
        L3c:
            r5 = r1
        L3d:
            int r4 = r4 + 1
            goto L21
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.core.network.a.a():boolean");
    }

    @Override // com.tealium.core.network.Connectivity
    public final String b() {
        return a() ? "wifi" : isConnected() ? "cellular" : DevicePublicKeyStringDef.NONE;
    }

    public final ConnectivityManager c() {
        throw null;
    }

    @Override // com.tealium.core.network.Connectivity
    public final boolean isConnected() {
        NetworkInfo activeNetworkInfo = c().getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }
}
