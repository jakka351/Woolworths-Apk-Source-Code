package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.sequences.Sequence;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final Set z = ArraysKt.r0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    public final LazyJavaResolverContext j;
    public final JavaClass k;
    public final ClassDescriptor l;
    public final LazyJavaResolverContext m;
    public final Lazy n;
    public final ClassKind o;
    public final Modality p;
    public final Visibility q;
    public final boolean r;
    public final LazyJavaClassTypeConstructor s;
    public final LazyJavaClassMemberScope t;
    public final ScopesHolderForClass u;
    public final InnerClassesScopeWrapper v;
    public final LazyJavaStaticClassScope w;
    public final LazyJavaAnnotations x;
    public final NotNullLazyValue y;

    public static final class Companion {
    }

    @SourceDebugExtension
    public final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {
        public final NotNullLazyValue c;

        /* JADX WARN: Illegal instructions before constructor call */
        public LazyJavaClassTypeConstructor() {
            LazyJavaResolverContext lazyJavaResolverContext = LazyJavaClassDescriptor.this.m;
            super(lazyJavaResolverContext.f24425a.f24422a);
            this.c = lazyJavaResolverContext.f24425a.f24422a.d(new Function0(LazyJavaClassDescriptor.this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$$Lambda$0
                public final LazyJavaClassDescriptor d;

                {
                    this.d = lazyJavaClassDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TypeParameterUtilsKt.c(this.d);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean d() {
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection f() {
            /*
                Method dump skipped, instructions count: 510
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.f():java.util.Collection");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return (List) this.c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker i() {
            return LazyJavaClassDescriptor.this.m.f24425a.m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* renamed from: n */
        public final ClassDescriptor c() {
            return LazyJavaClassDescriptor.this;
        }

        public final String toString() {
            String strB = LazyJavaClassDescriptor.this.getName().b();
            Intrinsics.g(strB, "asString(...)");
            return strB;
        }
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope G() {
        return this.v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean G0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope H() {
        return (LazyJavaClassMemberScope) super.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final List n() {
        return (List) this.t.q.invoke();
    }

    public final List J0() {
        return (List) this.n.getD();
    }

    public final LazyJavaClassMemberScope K0() {
        return (LazyJavaClassMemberScope) super.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind f() {
        return this.o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f24332a;
        Visibility visibility = this.q;
        if (!Intrinsics.c(visibility, descriptorVisibility) || this.k.u() != null) {
            return UtilsKt.d(visibility);
        }
        DescriptorVisibility descriptorVisibility2 = JavaDescriptorVisibilities.f24401a;
        Intrinsics.e(descriptorVisibility2);
        return descriptorVisibility2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean i() {
        return this.r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean l0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        return this.s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection o() {
        if (this.p != Modality.f) {
            return EmptyList.d;
        }
        JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.e, false, null, 7);
        Sequence sequenceO = this.k.o();
        ArrayList arrayList = new ArrayList();
        Iterator f24664a = sequenceO.getF24664a();
        while (f24664a.hasNext()) {
            ClassifierDescriptor classifierDescriptorC = this.m.d.d((JavaClassifierType) f24664a.next(), javaTypeAttributesA).J0().c();
            ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return CollectionsKt.u0(new LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1(), arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.u.a(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope q0() {
        return this.w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor r0() {
        return null;
    }

    public final String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List u() {
        return (List) this.y.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean w() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyJavaClassDescriptor(LazyJavaResolverContext outerContext, DeclarationDescriptor containingDeclaration, JavaClass jClass, ClassDescriptor classDescriptor) {
        Modality modality;
        Intrinsics.h(outerContext, "outerContext");
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(jClass, "jClass");
        JavaResolverComponents javaResolverComponents = outerContext.f24425a;
        super(javaResolverComponents.f24422a, containingDeclaration, jClass.getName(), javaResolverComponents.j.a(jClass));
        this.j = outerContext;
        this.k = jClass;
        this.l = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextA = ContextKt.a(outerContext, this, jClass, 4);
        this.m = lazyJavaResolverContextA;
        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContextA.f24425a;
        StorageManager storageManager = javaResolverComponents2.f24422a;
        javaResolverComponents2.g.getClass();
        this.n = LazyKt.b(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$$Lambda$0
            public final LazyJavaClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Set set = LazyJavaClassDescriptor.z;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.d;
                ClassId classIdF = DescriptorUtilsKt.f(lazyJavaClassDescriptor);
                if (classIdF != null) {
                    lazyJavaClassDescriptor.j.f24425a.w.a(classIdF);
                }
                return null;
            }
        });
        this.o = jClass.i() ? ClassKind.h : jClass.E() ? ClassKind.e : jClass.y() ? ClassKind.f : ClassKind.d;
        if (jClass.i() || jClass.y()) {
            modality = Modality.e;
        } else {
            Modality.Companion companion = Modality.d;
            boolean zP = jClass.p();
            boolean z2 = jClass.p() || jClass.isAbstract() || jClass.E();
            boolean zIsFinal = jClass.isFinal();
            companion.getClass();
            modality = zP ? Modality.f : z2 ? Modality.h : !zIsFinal ? Modality.g : Modality.e;
        }
        this.p = modality;
        this.q = jClass.getVisibility();
        this.r = (jClass.u() == null || jClass.f()) ? false : true;
        this.s = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextA, this, jClass, classDescriptor != null, null);
        this.t = lazyJavaClassMemberScope;
        ScopesHolderForClass.Companion companion2 = ScopesHolderForClass.e;
        KotlinTypeRefiner kotlinTypeRefinerForOwnerModule = javaResolverComponents2.u.c();
        Function1 function1 = new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$$Lambda$1
            public final LazyJavaClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner it = (KotlinTypeRefiner) obj;
                Set set = LazyJavaClassDescriptor.z;
                Intrinsics.h(it, "it");
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.d;
                return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.m, lazyJavaClassDescriptor, lazyJavaClassDescriptor.k, lazyJavaClassDescriptor.l != null, lazyJavaClassDescriptor.t);
            }
        };
        companion2.getClass();
        Intrinsics.h(storageManager, "storageManager");
        Intrinsics.h(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        this.u = new ScopesHolderForClass(this, storageManager, function1, kotlinTypeRefinerForOwnerModule);
        this.v = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.w = new LazyJavaStaticClassScope(lazyJavaResolverContextA, jClass, this);
        this.x = LazyJavaAnnotationsKt.a(lazyJavaResolverContextA, jClass);
        this.y = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$$Lambda$2
            public final LazyJavaClassDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.d;
                JavaClass javaClass = lazyJavaClassDescriptor.k;
                ArrayList<JavaTypeParameter> typeParameters = javaClass.getTypeParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.s(typeParameters, 10));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor typeParameterDescriptorA = lazyJavaClassDescriptor.m.b.a(javaTypeParameter);
                    if (typeParameterDescriptorA == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + javaClass + ", so it must be resolved");
                    }
                    arrayList.add(typeParameterDescriptorA);
                }
                return arrayList;
            }
        });
    }
}
