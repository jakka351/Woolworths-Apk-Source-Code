package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zan extends zabr {
    final /* synthetic */ Dialog zaa;
    final /* synthetic */ zao zab;

    public zan(zao zaoVar, Dialog dialog) {
        this.zaa = dialog;
        Objects.requireNonNull(zaoVar);
        this.zab = zaoVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zaa() {
        this.zab.zaa.zag();
        Dialog dialog = this.zaa;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
