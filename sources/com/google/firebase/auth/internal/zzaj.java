package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzaj extends MultiFactor {

    /* renamed from: a, reason: collision with root package name */
    public final zzaf f15195a;

    public zzaj(zzaf zzafVar) {
        Preconditions.checkNotNull(zzafVar);
        this.f15195a = zzafVar;
    }

    public final ArrayList a() {
        zzbj zzbjVar = this.f15195a.o;
        if (zzbjVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zzbjVar.d.iterator();
        while (it.hasNext()) {
            arrayList.add((PhoneMultiFactorInfo) it.next());
        }
        Iterator it2 = zzbjVar.e.iterator();
        while (it2.hasNext()) {
            arrayList.add((TotpMultiFactorInfo) it2.next());
        }
        return arrayList;
    }
}
