package com.tealium.core.persistence;

import com.tealium.core.JsonUtils;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.dispatcher.Dispatch;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/persistence/l;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "Lcom/tealium/core/persistence/QueueingDao;", "", "Lcom/tealium/dispatcher/Dispatch;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l implements LibrarySettingsUpdatedListener, QueueingDao<String, Dispatch> {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f19175a;
    public final m b;

    public l(h dbHelper) {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        m mVar = new m(dbHelper);
        Intrinsics.h(dbHelper, "dbHelper");
        this.f19175a = concurrentLinkedQueue;
        this.b = mVar;
    }

    public static e0 r(com.tealium.dispatcher.a aVar) {
        return new e0(aVar.f19188a, h0.b().getF19167a().serialize(JsonUtils.Companion.a(MapsKt.q(aVar.c))), null, aVar.b, Serialization.JSON_OBJECT);
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        m mVar = this.b;
        int i = mVar.d;
        int i2 = settings.c.b;
        if (i != i2) {
            if (i2 >= -1) {
                mVar.d = i2;
            }
            int iCount = mVar.d == -1 ? 0 : mVar.c.count() - mVar.d;
            if (iCount > 0) {
                mVar.d(iCount);
            }
        }
        int i3 = mVar.e;
        int i4 = settings.c.c;
        if (i3 == i4 || i4 < -1) {
            return;
        }
        mVar.e = i4;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final List F() {
        return this.b.c.F();
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final Object b(String key) {
        Intrinsics.h(key, "key");
        e0 e0VarB = this.b.b(key);
        if (e0VarB != null) {
            return new com.tealium.dispatcher.b(e0VarB);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tealium.core.persistence.KeyValueDao
    public final void c(e0 e0Var) {
        e0 e0VarR = r((com.tealium.dispatcher.a) ((Dispatch) e0Var));
        m mVar = this.b;
        mVar.getClass();
        mVar.a(e0VarR);
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void clear() {
        this.b.clear();
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final int count() {
        return this.b.c.count();
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final Map getAll() {
        Map all = this.b.c.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(all.size()));
        for (Map.Entry entry : all.entrySet()) {
            linkedHashMap.put(entry.getKey(), new com.tealium.dispatcher.b((e0) entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void h(Object obj) {
        String key = (String) obj;
        Intrinsics.h(key, "key");
        this.b.h(key);
    }

    @Override // com.tealium.core.persistence.KeyValueDao
    public final void i() {
        this.b.i();
    }
}
