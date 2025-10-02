package dagger.android;

import YU.a;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes7.dex */
public final class DispatchingAndroidInjector<T> implements AndroidInjector<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map f23767a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
    }

    public DispatchingAndroidInjector(Map map, Map map2) {
        if (!map.isEmpty()) {
            int size = map2.size() + map.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
            linkedHashMap.putAll(map2);
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(linkedHashMap);
        }
        this.f23767a = map2;
    }

    @Override // dagger.android.AndroidInjector
    public final void a(Object obj) {
        if (b(obj)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (this.f23767a.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? a.h("No injector factory bound for Class<", obj.getClass().getCanonicalName(), ">") : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
    }

    public final boolean b(Object obj) {
        Provider provider = (Provider) this.f23767a.get(obj.getClass().getName());
        if (provider == null) {
            return false;
        }
        AndroidInjector.Factory factory = (AndroidInjector.Factory) provider.get();
        try {
            AndroidInjector androidInjectorCreate = factory.create(obj);
            Preconditions.b(androidInjectorCreate, "%s.create(I) should not return null.", factory.getClass());
            androidInjectorCreate.a(obj);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(androidx.constraintlayout.core.state.a.i(factory.getClass().getCanonicalName(), " does not implement AndroidInjector.Factory<", obj.getClass().getCanonicalName(), ">"), e);
        }
    }
}
