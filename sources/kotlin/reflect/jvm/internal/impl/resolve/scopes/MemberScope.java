package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public interface MemberScope extends ResolutionScope {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f24557a = Companion.f24558a;

    /* loaded from: classes7.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f24558a = new Companion();
        public static final Function1 b = null;

        public static Function1 a() {
            return MemberScope$Companion$$Lambda$0.d;
        }
    }

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    public static final class Empty extends MemberScopeImpl {
        public static final Empty b = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set a() {
            return EmptySet.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set c() {
            return EmptySet.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public final Set d() {
            return EmptySet.d;
        }
    }

    Set a();

    Collection b(Name name, NoLookupLocation noLookupLocation);

    Set c();

    Set d();

    Collection e(Name name, LookupLocation lookupLocation);
}
