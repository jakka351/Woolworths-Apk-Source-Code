package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class WeakClassLoaderBox {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f24296a;
    public final int b;

    public WeakClassLoaderBox(ClassLoader classLoader) {
        this.f24296a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WeakClassLoaderBox) && this.f24296a.get() == ((WeakClassLoaderBox) obj).f24296a.get();
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f24296a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
