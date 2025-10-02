package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public interface ClassDescriptorFactory {
    boolean a(FqName fqName, Name name);

    ClassDescriptor b(ClassId classId);

    Collection c(FqName fqName);
}
