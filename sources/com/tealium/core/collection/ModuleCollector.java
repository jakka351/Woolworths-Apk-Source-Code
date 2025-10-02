package com.tealium.core.collection;

import com.tealium.core.Collector;
import com.tealium.core.Module;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/collection/ModuleCollector;", "Lcom/tealium/core/Collector;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ModuleCollector implements Collector {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19136a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();
    public boolean c;

    public ModuleCollector(List list) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        String str;
        Object obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Module module = (Module) it.next();
            Class<?> cls = module.getClass();
            try {
                Field declaredField = cls.getDeclaredField("MODULE_VERSION");
                try {
                    obj = declaredField.get(cls);
                } catch (Exception unused) {
                    Object obj2 = declaredField.get(module);
                    str = obj2 instanceof String ? (String) obj2 : str;
                }
                str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    this.f19136a.add(module);
                    this.b.put(module.getF(), str);
                }
            } catch (Exception unused2) {
            }
        }
        this.c = true;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getF() {
        return "ModuleCollector";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f19136a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Module) next).getC()) {
                arrayList.add(next);
            }
        }
        List listU0 = CollectionsKt.u0(new ModuleCollector$collect$$inlined$sortedBy$1(), arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listU0, 10));
        Iterator it2 = listU0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Module) it2.next()).getF());
        }
        Pair pair = new Pair("enabled_modules", arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listU0, 10));
        Iterator it3 = listU0.iterator();
        while (it3.hasNext()) {
            arrayList3.add((String) this.b.get(((Module) it3.next()).getF()));
        }
        return MapsKt.j(pair, new Pair("enabled_modules_versions", arrayList3));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.c = z;
    }
}
