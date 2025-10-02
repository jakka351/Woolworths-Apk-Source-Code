package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.maps.zzaz;

/* loaded from: classes5.dex */
final class zzah implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzaz zzb;

    public zzah(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @Nullable
    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzb.zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
