package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class Invocation {

    /* renamed from: a, reason: collision with root package name */
    public final Class f26979a;
    public final Object b;
    public final Method c;
    public final List d;

    public Invocation(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f26979a = cls;
        this.b = obj;
        this.c = method;
        this.d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f26979a.getName(), this.c.getName(), this.d);
    }
}
