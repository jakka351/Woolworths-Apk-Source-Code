package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* loaded from: classes7.dex */
final class ServiceProviders {

    public interface PriorityAccessor<T> {
        boolean a(Object obj);

        int b(Object obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public static List a(Class cls, Iterable iterable, ClassLoader classLoader, final PriorityAccessor priorityAccessor) throws ClassNotFoundException {
        ?? Load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (priorityAccessor.a(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new Comparator<Object>() { // from class: io.grpc.ServiceProviders.1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                PriorityAccessor priorityAccessor2 = priorityAccessor;
                int iB = priorityAccessor2.b(obj2) - priorityAccessor2.b(obj3);
                return iB != 0 ? iB : obj2.getClass().getName().compareTo(obj3.getClass().getName());
            }
        }));
        return Collections.unmodifiableList(arrayList);
    }
}
