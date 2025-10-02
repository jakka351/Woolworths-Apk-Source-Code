package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class CycleDetector {

    public static class ComponentNode {

        /* renamed from: a, reason: collision with root package name */
        public final Component f15228a;
        public final HashSet b = new HashSet();
        public final HashSet c = new HashSet();

        public ComponentNode(Component component) {
            this.f15228a = component;
        }
    }

    public static class Dep {

        /* renamed from: a, reason: collision with root package name */
        public final Qualified f15229a;
        public final boolean b;

        public Dep(Qualified qualified, boolean z) {
            this.f15229a = qualified;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                if (dep.f15229a.equals(this.f15229a) && dep.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f15229a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (ComponentNode componentNode : (Set) it2.next()) {
                        for (Dependency dependency : componentNode.f15228a.c) {
                            if (dependency.c == 0) {
                                Set<ComponentNode> set = (Set) map.get(new Dep(dependency.f15230a, dependency.b == 2));
                                if (set != null) {
                                    for (ComponentNode componentNode2 : set) {
                                        componentNode.b.add(componentNode2);
                                        componentNode2.c.add(componentNode);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    ComponentNode componentNode3 = (ComponentNode) it4.next();
                    if (componentNode3.c.isEmpty()) {
                        hashSet2.add(componentNode3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    ComponentNode componentNode4 = (ComponentNode) hashSet2.iterator().next();
                    hashSet2.remove(componentNode4);
                    i++;
                    Iterator it5 = componentNode4.b.iterator();
                    while (it5.hasNext()) {
                        ComponentNode componentNode5 = (ComponentNode) it5.next();
                        componentNode5.c.remove(componentNode4);
                        if (componentNode5.c.isEmpty()) {
                            hashSet2.add(componentNode5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    ComponentNode componentNode6 = (ComponentNode) it6.next();
                    if (!componentNode6.c.isEmpty() && !componentNode6.b.isEmpty()) {
                        arrayList2.add(componentNode6.f15228a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            Component component = (Component) it.next();
            ComponentNode componentNode7 = new ComponentNode(component);
            for (Qualified qualified : component.b) {
                boolean z = component.e == 0;
                Dep dep = new Dep(qualified, !z);
                if (!map.containsKey(dep)) {
                    map.put(dep, new HashSet());
                }
                Set set2 = (Set) map.get(dep);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + qualified + ".");
                }
                set2.add(componentNode7);
            }
        }
    }
}
