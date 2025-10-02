package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;

/* loaded from: classes7.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24462a;
    public final HashMap b;
    public final HashMap c;

    public AnnotationsContainerWithConstants(HashMap map, HashMap map2, HashMap map3) {
        this.f24462a = map;
        this.b = map2;
        this.c = map3;
    }

    public final Map a() {
        return this.f24462a;
    }
}
