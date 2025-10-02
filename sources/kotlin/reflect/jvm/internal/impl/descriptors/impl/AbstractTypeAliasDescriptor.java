package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {
    public static final /* synthetic */ KProperty[] m = {Reflection.f24268a.h(new PropertyReference1Impl(AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};
    public final StorageManager h;
    public final DescriptorVisibility i;
    public final NotNullLazyValue j;
    public List k;
    public final AbstractTypeAliasDescriptor$typeConstructor$1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DescriptorVisibility visibilityImpl) {
        super(containingDeclaration, annotations, name, SourceElement.f24343a);
        Intrinsics.h(storageManager, "storageManager");
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(visibilityImpl, "visibilityImpl");
        this.h = storageManager;
        this.i = visibilityImpl;
        this.j = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$0
            public final AbstractTypeAliasDescriptor d;

            {
                this.d = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 371
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$0.invoke():java.lang.Object");
            }
        });
        this.l = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final Collection a() {
                Collection collectionA = ((DeserializedTypeAliasDescriptor) this.f24356a).x0().J0().a();
                Intrinsics.g(collectionA, "getSupertypes(...)");
                return collectionA;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final ClassifierDescriptor c() {
                return this.f24356a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final boolean d() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final List getParameters() {
                return this.f24356a.I0();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public final KotlinBuiltIns p() {
                return DescriptorUtilsKt.e(this.f24356a);
            }

            public final String toString() {
                return "[typealias " + this.f24356a.getName().b() + ']';
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* renamed from: E0 */
    public final DeclarationDescriptorWithSource H0() {
        return this;
    }

    public final SimpleType H0() {
        MemberScope memberScopeH;
        final DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = (DeserializedTypeAliasDescriptor) this;
        ClassDescriptor classDescriptorL = deserializedTypeAliasDescriptor.l();
        if (classDescriptorL == null || (memberScopeH = classDescriptorL.H()) == null) {
            memberScopeH = MemberScope.Empty.b;
        }
        Function1 function1 = new Function1(deserializedTypeAliasDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$2
            public final DeserializedTypeAliasDescriptor d;

            {
                this.d = deserializedTypeAliasDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KProperty[] kPropertyArr = AbstractTypeAliasDescriptor.m;
                ((KotlinTypeRefiner) obj).d(this.d);
                return null;
            }
        };
        ErrorType errorType = TypeUtils.f24621a;
        return ErrorUtils.f(this) ? ErrorUtils.c(ErrorTypeKind.n, toString()) : TypeUtils.m(m(), memberScopeH, function1);
    }

    public abstract List I0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.f(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final ClassifierDescriptor H0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean i() {
        return TypeUtils.c(((DeserializedTypeAliasDescriptor) this).x0(), new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$1
            public final AbstractTypeAliasDescriptor d;

            {
                this.d = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r2) {
                /*
                    r1 = this;
                    kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2 = (kotlin.reflect.jvm.internal.impl.types.UnwrappedType) r2
                    kotlin.reflect.KProperty[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.m
                    kotlin.jvm.internal.Intrinsics.e(r2)
                    boolean r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.a(r2)
                    if (r0 != 0) goto L29
                    kotlin.reflect.jvm.internal.impl.types.TypeConstructor r2 = r2.J0()
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r2 = r2.c()
                    boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
                    if (r0 == 0) goto L29
                    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r2.e()
                    kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor r0 = r1.d
                    boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r0)
                    if (r2 != 0) goto L29
                    r2 = 1
                    goto L2a
                L29:
                    r2 = 0
                L2a:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$$Lambda$1.invoke(java.lang.Object):java.lang.Object");
            }
        }, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List u() {
        List list = this.k;
        if (list != null) {
            return list;
        }
        Intrinsics.p("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final DeclarationDescriptor H0() {
        return this;
    }
}
