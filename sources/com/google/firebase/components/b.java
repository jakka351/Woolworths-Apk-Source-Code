package com.google.firebase.components;

import com.google.android.gms.common.util.Clock;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Collections;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15239a;

    public /* synthetic */ b(int i) {
        this.f15239a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f15239a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return Executors.newSingleThreadScheduledExecutor();
            case 3:
                return GaugeManager.lambda$new$0();
            case 4:
                return GaugeManager.lambda$new$1();
            default:
                Clock clock = RemoteConfigComponent.j;
                return null;
        }
    }
}
