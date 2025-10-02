package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import androidx.lifecycle.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProcessDataManagerImpl implements ProcessDataManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15808a;
    public final Lazy b;
    public final int c;
    public final Lazy d;
    public final Lazy e;
    public boolean f;

    public ProcessDataManagerImpl(Context appContext, UuidGenerator uuidGenerator) {
        Intrinsics.h(appContext, "appContext");
        Intrinsics.h(uuidGenerator, "uuidGenerator");
        this.f15808a = appContext;
        final int i = 0;
        this.b = LazyKt.b(new Function0(this) { // from class: com.google.firebase.sessions.b
            public final /* synthetic */ ProcessDataManagerImpl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((ProcessDetails) this.e.e.getD()).f15810a;
                    default:
                        return ProcessDetailsProvider.b(this.e.f15808a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = LazyKt.b(new d(uuidGenerator, 10));
        final int i2 = 1;
        this.e = LazyKt.b(new Function0(this) { // from class: com.google.firebase.sessions.b
            public final /* synthetic */ ProcessDataManagerImpl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((ProcessDetails) this.e.e.getD()).f15810a;
                    default:
                        return ProcessDetailsProvider.b(this.e.f15808a);
                }
            }
        });
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final String a() {
        return (String) this.b.getD();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean b(Map processDataMap) {
        Intrinsics.h(processDataMap, "processDataMap");
        ProcessData processData = (ProcessData) processDataMap.get(a());
        return (processData != null && processData.f15806a == this.c && Intrinsics.c(processData.b, (String) this.d.getD())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean c(Map processDataMap) {
        Intrinsics.h(processDataMap, "processDataMap");
        if (this.f) {
            return false;
        }
        ArrayList arrayListA = ProcessDetailsProvider.a(this.f15808a);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ProcessDetails processDetails = (ProcessDetails) it.next();
            ProcessData processData = (ProcessData) processDataMap.get(processDetails.f15810a);
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            ProcessDetails processDetails2 = (ProcessDetails) pair2.d;
            ProcessData processData2 = (ProcessData) pair2.e;
            String strA = a();
            String str = processDetails2.f15810a;
            int i = processDetails2.b;
            if (Intrinsics.c(strA, str)) {
                if (i == processData2.f15806a && Intrinsics.c((String) this.d.getD(), processData2.b)) {
                    return false;
                }
            } else if (i == processData2.f15806a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map d() {
        return e(EmptyMap.d);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map e(Map map) {
        Lazy lazy = this.d;
        if (map == null) {
            return MapsKt.i(new Pair(a(), new ProcessData(Process.myPid(), (String) lazy.getD())));
        }
        LinkedHashMap linkedHashMapS = MapsKt.s(map);
        linkedHashMapS.put(a(), new ProcessData(Process.myPid(), (String) lazy.getD()));
        return MapsKt.q(linkedHashMapS);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final void f() {
        this.f = true;
    }
}
