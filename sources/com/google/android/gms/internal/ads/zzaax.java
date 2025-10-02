package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaax implements DisplayManager.DisplayListener {
    final /* synthetic */ zzaaz zza;
    private final DisplayManager zzb;

    public zzaax(zzaaz zzaazVar, DisplayManager displayManager) {
        Objects.requireNonNull(zzaazVar);
        this.zza = zzaazVar;
        this.zzb = displayManager;
    }

    private final Display zzc() {
        return this.zzb.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.zza.zzj(zzc());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zzb.registerDisplayListener(this, zzeo.zzc(null));
        this.zza.zzj(zzc());
    }

    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
    }
}
