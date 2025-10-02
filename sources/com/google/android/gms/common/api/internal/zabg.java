package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zabg implements Runnable {
    final /* synthetic */ zabk zaa;

    public zabg(zabk zabkVar) {
        Objects.requireNonNull(zabkVar);
        this.zaa = zabkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zat();
    }
}
