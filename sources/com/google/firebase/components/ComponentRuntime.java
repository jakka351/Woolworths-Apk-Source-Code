package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {
    public static final b h = new b(0);
    public final EventBus e;
    public final ComponentRegistrarProcessor g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15226a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f15227a;
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public ComponentRegistrarProcessor d = ComponentRegistrarProcessor.v3;

        public Builder(Executor executor) {
            this.f15227a = executor;
        }

        public final void a(Component component) {
            this.c.add(component);
        }
    }

    public ComponentRuntime(Executor executor, ArrayList arrayList, ArrayList arrayList2, ComponentRegistrarProcessor componentRegistrarProcessor) {
        EventBus eventBus = new EventBus(executor);
        this.e = eventBus;
        this.g = componentRegistrarProcessor;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Component.c(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList3.add(Component.c(this, ComponentLoader.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList3.add(component);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.e(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((Component) it4.next()).b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.d.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f15226a.isEmpty()) {
                CycleDetector.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f15226a.keySet());
                arrayList6.addAll(arrayList3);
                CycleDetector.a(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                final Component component2 = (Component) it5.next();
                this.f15226a.put(component2, new Lazy(new Provider() { // from class: com.google.firebase.components.c
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        Component component3 = component2;
                        return component3.f.b(new RestrictedComponentContainer(component3, this.f15240a));
                    }
                }));
            }
            arrayList5.addAll(m(arrayList3));
            arrayList5.addAll(n());
            l();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            j(this.f15226a, bool.booleanValue());
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred d(Qualified qualified) {
        Provider providerE = e(qualified);
        return providerE == null ? new OptionalProvider(OptionalProvider.c, OptionalProvider.d) : providerE instanceof OptionalProvider ? (OptionalProvider) providerE : new OptionalProvider(null, providerE);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider e(Qualified qualified) {
        Preconditions.a(qualified, "Null interface requested.");
        return (Provider) this.b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider g(Qualified qualified) {
        LazySet lazySet = (LazySet) this.c.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return h;
    }

    public final void j(HashMap map, boolean z) {
        ArrayDeque<Event> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            int i = component.d;
            if (i == 1 || (i == 2 && z)) {
                provider.get();
            }
        }
        EventBus eventBus = this.e;
        synchronized (eventBus) {
            try {
                arrayDeque = eventBus.b;
                if (arrayDeque != null) {
                    eventBus.b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
            }
        }
        if (arrayDeque != null) {
            for (Event event : arrayDeque) {
                event.getClass();
                synchronized (eventBus) {
                    try {
                        ArrayDeque arrayDeque2 = eventBus.b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(event);
                        } else {
                            synchronized (eventBus) {
                                try {
                                    Map map2 = (Map) eventBus.f15231a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } finally {
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new com.auth0.android.request.internal.a(1, entry2, event));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void k(boolean z) {
        HashMap map;
        AtomicReference atomicReference = this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f15226a);
        }
        j(map, z);
    }

    public final void l() {
        HashMap map = this.b;
        HashMap map2 = this.c;
        for (Component component : this.f15226a.keySet()) {
            for (Dependency dependency : component.c) {
                boolean z = dependency.b == 2;
                Qualified qualified = dependency.f15230a;
                if (z && !map2.containsKey(qualified)) {
                    Set set = Collections.EMPTY_SET;
                    LazySet lazySet = new LazySet();
                    lazySet.b = null;
                    lazySet.f15233a = Collections.newSetFromMap(new ConcurrentHashMap());
                    lazySet.f15233a.addAll(set);
                    map2.put(qualified, lazySet);
                } else if (map.containsKey(qualified)) {
                    continue;
                } else {
                    int i = dependency.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + component + ": " + qualified);
                    }
                    if (i != 2) {
                        map.put(qualified, new OptionalProvider(OptionalProvider.c, OptionalProvider.d));
                    }
                }
            }
        }
    }

    public final ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.e == 0) {
                Provider provider = (Provider) this.f15226a.get(component);
                for (Qualified qualified : component.b) {
                    HashMap map = this.b;
                    if (map.containsKey(qualified)) {
                        arrayList2.add(new d((OptionalProvider) ((Provider) map.get(qualified)), provider, 0));
                    } else {
                        map.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList n() {
        HashMap map = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f15226a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (component.e != 0) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.b) {
                    if (!map2.containsKey(qualified)) {
                        map2.put(qualified, new HashSet());
                    }
                    ((Set) map2.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                LazySet lazySet = (LazySet) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new d(lazySet, (Provider) it.next(), 1));
                }
            } else {
                Qualified qualified2 = (Qualified) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                LazySet lazySet2 = new LazySet();
                lazySet2.b = null;
                lazySet2.f15233a = Collections.newSetFromMap(new ConcurrentHashMap());
                lazySet2.f15233a.addAll(set);
                map.put(qualified2, lazySet2);
            }
        }
        return arrayList;
    }
}
