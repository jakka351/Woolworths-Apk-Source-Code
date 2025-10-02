package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public interface ResolutionScope {

    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Collection a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, int i) {
            if ((i & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.m;
            }
            MemberScope.f24557a.getClass();
            return resolutionScope.g(descriptorKindFilter, MemberScope$Companion$$Lambda$0.d);
        }
    }

    ClassifierDescriptor f(Name name, LookupLocation lookupLocation);

    Collection g(DescriptorKindFilter descriptorKindFilter, Function1 function1);
}
