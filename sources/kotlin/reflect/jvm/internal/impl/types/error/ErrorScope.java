package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.camera.core.impl.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes.dex */
public class ErrorScope implements MemberScope {
    public final String b;

    public ErrorScope(ErrorScopeKind errorScopeKind, String... formatParams) {
        Intrinsics.h(formatParams, "formatParams");
        String str = errorScopeKind.d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set a() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set c() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set d() {
        return EmptySet.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        ErrorEntity[] errorEntityArr = ErrorEntity.d;
        return new ErrorClassDescriptor(Name.l(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set e(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return SetsKt.i(new ErrorFunctionDescriptor(ErrorUtils.c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        return ErrorUtils.f;
    }

    public String toString() {
        return b.r(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
