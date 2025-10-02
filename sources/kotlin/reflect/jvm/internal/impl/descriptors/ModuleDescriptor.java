package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    public static final class DefaultImpls {
    }

    boolean B(ModuleDescriptor moduleDescriptor);

    PackageViewDescriptor L(FqName fqName);

    List O();

    Object T(ModuleCapability moduleCapability);

    KotlinBuiltIns p();

    Collection r(FqName fqName, Function1 function1);
}
