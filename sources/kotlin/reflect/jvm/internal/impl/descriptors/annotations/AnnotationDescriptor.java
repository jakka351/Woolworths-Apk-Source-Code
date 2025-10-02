package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public interface AnnotationDescriptor {

    @SourceDebugExtension
    public static final class DefaultImpls {
    }

    Map b();

    FqName d();

    SourceElement g();

    KotlinType getType();
}
