package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zabj implements BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ zabk zaa;

    public zabj(zabk zabkVar) {
        Objects.requireNonNull(zabkVar);
        this.zaa = zabkVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.zaa.zaa.zaF().post(new zabi(this));
    }
}
