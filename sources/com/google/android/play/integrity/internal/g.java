package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class g extends a implements i {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void N(Bundle bundle, k kVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.e);
        int i = c.f14773a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(kVar);
        h1(2, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void T(Bundle bundle, k kVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.e);
        int i = c.f14773a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(kVar);
        h1(3, parcelObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void a(Bundle bundle, r rVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.e);
        int i = c.f14773a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(rVar);
        h1(6, parcelObtain);
    }
}
