package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;

/* loaded from: classes.dex */
public final class ReflectAnnotationSource implements SourceElement {
    public final Annotation b;

    public ReflectAnnotationSource(Annotation annotation) {
        this.b = annotation;
    }
}
