package com.google.mlkit.common.model;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class RemoteModelManager {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15976a = new HashMap();

    @KeepForSdk
    public static class RemoteModelManagerRegistration {

        /* renamed from: a, reason: collision with root package name */
        public final Provider f15977a;

        public RemoteModelManagerRegistration(Provider provider) {
            this.f15977a = provider;
        }
    }

    public RemoteModelManager(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            RemoteModelManagerRegistration remoteModelManagerRegistration = (RemoteModelManagerRegistration) it.next();
            HashMap map = this.f15976a;
            remoteModelManagerRegistration.getClass();
            map.put(CustomRemoteModel.class, remoteModelManagerRegistration.f15977a);
        }
    }
}
