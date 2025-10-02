package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class l extends a implements n {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void a(Bundle bundle, r rVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.e);
        int i = c.f14773a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(rVar);
        h1(3, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void b0(Bundle bundle, p pVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.e);
        int i = c.f14773a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(pVar);
        h1(2, parcelObtain);
    }
}
