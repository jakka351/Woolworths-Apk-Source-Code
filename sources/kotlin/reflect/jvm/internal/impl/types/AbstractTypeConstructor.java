package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {
    public final NotNullLazyValue b;

    /* loaded from: classes7.dex */
    public final class ModuleViewTypeConstructor implements TypeConstructor {
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final Collection a() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean d() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final KotlinBuiltIns p() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Supertypes {

        /* renamed from: a, reason: collision with root package name */
        public final Collection f24600a;
        public List b;

        public Supertypes(Collection allSupertypes) {
            Intrinsics.h(allSupertypes, "allSupertypes");
            this.f24600a = allSupertypes;
            this.b = CollectionsKt.Q(ErrorUtils.d);
        }

        public final Collection a() {
            return this.f24600a;
        }

        public final List b() {
            return this.b;
        }

        public final void c(List list) {
            Intrinsics.h(list, "<set-?>");
            this.b = list;
        }
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        Intrinsics.h(storageManager, "storageManager");
        this.b = storageManager.a(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$0
            public final AbstractTypeConstructor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AbstractTypeConstructor.Supertypes(this.d.f());
            }
        }, AbstractTypeConstructor$$Lambda$1.d, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$2
            public final AbstractTypeConstructor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AbstractTypeConstructor.Supertypes supertypes = (AbstractTypeConstructor.Supertypes) obj;
                Intrinsics.h(supertypes, "supertypes");
                final AbstractTypeConstructor abstractTypeConstructor = this.d;
                Collection collectionA = abstractTypeConstructor.i().a(abstractTypeConstructor, supertypes.a(), new Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Collection collectionA2;
                        TypeConstructor it = (TypeConstructor) obj2;
                        Intrinsics.h(it, "it");
                        AbstractTypeConstructor abstractTypeConstructor2 = it instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) it : null;
                        if (abstractTypeConstructor2 != null) {
                            collectionA2 = CollectionsKt.c0(abstractTypeConstructor2.h(false), ((AbstractTypeConstructor.Supertypes) abstractTypeConstructor2.b.invoke()).a());
                        } else {
                            collectionA2 = it.a();
                            Intrinsics.g(collectionA2, "getSupertypes(...)");
                        }
                        return collectionA2;
                    }
                }, new Function1(abstractTypeConstructor) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$$Lambda$4
                    public final AbstractTypeConstructor d;

                    {
                        this.d = abstractTypeConstructor;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        KotlinType it = (KotlinType) obj2;
                        Intrinsics.h(it, "it");
                        this.d.l(it);
                        return Unit.f24250a;
                    }
                });
                if (collectionA.isEmpty()) {
                    KotlinType kotlinTypeG = abstractTypeConstructor.g();
                    Collection collectionQ = kotlinTypeG != null ? CollectionsKt.Q(kotlinTypeG) : null;
                    if (collectionQ == null) {
                        collectionQ = EmptyList.d;
                    }
                    collectionA = collectionQ;
                }
                List listG0 = collectionA instanceof List ? (List) collectionA : null;
                if (listG0 == null) {
                    listG0 = CollectionsKt.G0(collectionA);
                }
                supertypes.c(abstractTypeConstructor.k(listG0));
                return Unit.f24250a;
            }
        });
    }

    public abstract Collection f();

    public KotlinType g() {
        return null;
    }

    public Collection h(boolean z) {
        return EmptyList.d;
    }

    public abstract SupertypeLoopChecker i();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final List a() {
        return ((Supertypes) this.b.invoke()).b();
    }

    public List k(List list) {
        return list;
    }

    public void l(KotlinType type) {
        Intrinsics.h(type, "type");
    }
}
