package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public interface JavaAnnotationOwner extends JavaElement {
    JavaAnnotation H(FqName fqName);

    Collection getAnnotations();
}
