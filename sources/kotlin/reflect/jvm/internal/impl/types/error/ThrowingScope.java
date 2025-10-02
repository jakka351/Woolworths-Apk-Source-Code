package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.camera.core.impl.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* loaded from: classes7.dex */
public final class ThrowingScope extends ErrorScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowingScope(ErrorScopeKind errorScopeKind, String... formatParams) {
        super(errorScopeKind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.h(formatParams, "formatParams");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ Collection b(Name name, NoLookupLocation noLookupLocation) {
        b(name, noLookupLocation);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final /* bridge */ /* synthetic */ Collection e(Name name, LookupLocation lookupLocation) {
        e(name, (NoLookupLocation) lookupLocation);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.h(name, "name");
        Intrinsics.h(location, "location");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.h(kindFilter, "kindFilter");
        throw new IllegalStateException(this.b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    /* renamed from: h */
    public final Set e(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    /* renamed from: i */
    public final Set b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.h(name, "name");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public final String toString() {
        return b.r(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
