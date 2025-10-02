package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    ModuleDescriptorImpl C0();

    List K();

    FqName d();

    boolean isEmpty();

    MemberScope s();
}
