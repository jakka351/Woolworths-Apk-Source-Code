package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zag extends Drawable.ConstantState {
    int zaa;
    int zab;

    public zag(@Nullable zag zagVar) {
        if (zagVar != null) {
            this.zaa = zagVar.zaa;
            this.zab = zagVar.zab;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zah(this);
    }
}
