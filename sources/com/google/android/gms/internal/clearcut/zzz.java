package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes5.dex */
final class zzz extends ContentObserver {
    public zzz(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzy.zzct.set(true);
    }
}
