package me.oriient.internal.infra.networkManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import me.oriient.internal.infra.utils.core.Logger;

/* loaded from: classes7.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NetworkManagerAndroid f24966a;

    public b(NetworkManagerAndroid networkManagerAndroid) {
        this.f24966a = networkManagerAndroid;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("noConnectivity", false) : false;
        if (((Boolean) this.f24966a.isConnected().getValue()).booleanValue() && booleanExtra) {
            this.f24966a.isConnected().setValue(Boolean.FALSE);
            Logger logger = this.f24966a.getLogger();
            if (logger != null) {
                logger.d("NetworkManagerAndroid", "onReceive: isConnected false");
            }
        } else if (!((Boolean) this.f24966a.isConnected().getValue()).booleanValue() && !booleanExtra) {
            this.f24966a.isConnected().setValue(Boolean.TRUE);
            Logger logger2 = this.f24966a.getLogger();
            if (logger2 != null) {
                logger2.d("NetworkManagerAndroid", "onReceive: isConnected true");
            }
        }
        this.f24966a.sentConnectionMeteredIfChanged();
    }
}
