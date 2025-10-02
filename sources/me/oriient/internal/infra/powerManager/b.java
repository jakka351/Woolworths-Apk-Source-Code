package me.oriient.internal.infra.powerManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes7.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PowerManagerAndroid f24976a;

    public b(PowerManagerAndroid powerManagerAndroid) {
        this.f24976a = powerManagerAndroid;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            PowerManagerAndroid powerManagerAndroid = this.f24976a;
            powerManagerAndroid.getLogger().d("PowerManager", "new intent " + intent);
            powerManagerAndroid.updateStatus(intent);
        }
    }
}
