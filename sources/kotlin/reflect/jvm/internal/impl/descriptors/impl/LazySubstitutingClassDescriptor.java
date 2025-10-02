package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* loaded from: classes7.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {
    public final ModuleAwareClassDescriptor d;
    public final TypeSubstitutor e;
    public TypeSubstitutor f;
    public ArrayList g;
    public ArrayList h;
    public ClassTypeConstructorImpl i;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor$1, reason: invalid class name */
    class AnonymousClass1 implements Function1<TypeParameterDescriptor, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(!((TypeParameterDescriptor) obj).E());
        }
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.d = moduleAwareClassDescriptor;
        this.e = typeSubstitutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void E0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.E0(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope G() {
        MemberScope memberScopeG = this.d.G();
        if (memberScopeG != null) {
            return memberScopeG;
        }
        E0(28);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean G0() {
        return this.d.G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope H() {
        DescriptorUtilsKt.i(DescriptorUtils.d(this.d));
        return o0(KotlinTypeRefiner.Default.f24625a);
    }

    public final TypeSubstitutor H0() {
        if (this.f == null) {
            TypeSubstitutor typeSubstitutor = this.e;
            if (typeSubstitutor.f24619a.f()) {
                this.f = typeSubstitutor;
            } else {
                List parameters = this.d.m().getParameters();
                this.g = new ArrayList(parameters.size());
                this.f = DescriptorSubstitutor.b(parameters, typeSubstitutor.g(), this, this.g);
                this.h = CollectionsKt.z(this.g, new AnonymousClass1());
            }
        }
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ReceiverParameterDescriptor U() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object V(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.a(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.f24619a.f() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.f(typeSubstitutor.g(), H0().g()));
        }
        E0(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        DeclarationDescriptor declarationDescriptorE = this.d.e();
        if (declarationDescriptorE != null) {
            return declarationDescriptorE;
        }
        E0(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind f() {
        ClassKind classKindF = this.d.f();
        if (classKindF != null) {
            return classKindF;
        }
        E0(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation f0() {
        ValueClassRepresentation valueClassRepresentationF0 = this.d.f0();
        if (valueClassRepresentationF0 == null) {
            return null;
        }
        Function1<SimpleType, SimpleType> function1 = new Function1<SimpleType, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SimpleType simpleType = (SimpleType) obj;
                LazySubstitutingClassDescriptor lazySubstitutingClassDescriptor = LazySubstitutingClassDescriptor.this;
                if (simpleType != null) {
                    return lazySubstitutingClassDescriptor.e.f24619a.f() ? simpleType : (SimpleType) lazySubstitutingClassDescriptor.H0().k(simpleType, Variance.f);
                }
                lazySubstitutingClassDescriptor.getClass();
                return simpleType;
            }
        };
        if (valueClassRepresentationF0 instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) valueClassRepresentationF0;
            return new InlineClassRepresentation(inlineClassRepresentation.f24334a, (RigidTypeMarker) function1.invoke(inlineClassRepresentation.b));
        }
        if (!(valueClassRepresentationF0 instanceof MultiFieldValueClassRepresentation)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<Pair> arrayList = ((MultiFieldValueClassRepresentation) valueClassRepresentationF0).f24337a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(new Pair((Name) pair.d, function1.invoke((RigidTypeMarker) pair.e)));
        }
        return new MultiFieldValueClassRepresentation(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        return SourceElement.f24343a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        Annotations annotations = this.d.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        E0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.d.getName();
        if (name != null) {
            return name;
        }
        E0(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.d.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        E0(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean h0() {
        return this.d.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean i() {
        return this.d.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final List i0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        E0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return this.d.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return this.d.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean j0() {
        return this.d.j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality k() {
        Modality modalityK = this.d.k();
        if (modalityK != null) {
            return modalityK;
        }
        E0(26);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean l0() {
        return this.d.l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor m() {
        TypeConstructor typeConstructorM = this.d.m();
        if (this.e.f24619a.f()) {
            if (typeConstructorM != null) {
                return typeConstructorM;
            }
            E0(0);
            throw null;
        }
        if (this.i == null) {
            TypeSubstitutor typeSubstitutorH0 = H0();
            Collection collectionA = typeConstructorM.a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            Iterator it = collectionA.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorH0.k((KotlinType) it.next(), Variance.f));
            }
            this.i = new ClassTypeConstructorImpl(this, this.g, arrayList, LockBasedStorageManager.e);
        }
        ClassTypeConstructorImpl classTypeConstructorImpl = this.i;
        if (classTypeConstructorImpl != null) {
            return classTypeConstructorImpl;
        }
        E0(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection n() {
        Collection<ClassConstructorDescriptor> collectionN = this.d.n();
        ArrayList arrayList = new ArrayList(collectionN.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : collectionN) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.S().e(classConstructorDescriptor.H0()).o(classConstructorDescriptor.k()).m(classConstructorDescriptor.getVisibility()).q(classConstructorDescriptor.f()).l().build()).b(H0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope n0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope memberScopeN0 = this.d.n0(typeSubstitution, kotlinTypeRefiner);
        if (!this.e.f24619a.f()) {
            return new SubstitutingScope(memberScopeN0, H0());
        }
        if (memberScopeN0 != null) {
            return memberScopeN0;
        }
        E0(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection o() {
        Collection collectionO = this.d.o();
        if (collectionO != null) {
            return collectionO;
        }
        E0(31);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            E0(13);
            throw null;
        }
        MemberScope memberScopeO0 = this.d.o0(kotlinTypeRefiner);
        if (!this.e.f24619a.f()) {
            return new SubstitutingScope(memberScopeO0, H0());
        }
        if (memberScopeO0 != null) {
            return memberScopeO0;
        }
        E0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean p0() {
        return this.d.p0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope q0() {
        MemberScope memberScopeQ0 = this.d.q0();
        if (memberScopeQ0 != null) {
            return memberScopeQ0;
        }
        E0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor r0() {
        return this.d.r0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType t() {
        return KotlinTypeFactory.e(TypeUtils.d(m().getParameters()), H(), DefaultTypeAttributeTranslator.f24604a.a(getAnnotations()), m(), false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List u() {
        H0();
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            return arrayList;
        }
        E0(30);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope u0(TypeSubstitution typeSubstitution) {
        DescriptorUtilsKt.i(DescriptorUtils.d(this));
        return n0(typeSubstitution, KotlinTypeRefiner.Default.f24625a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean w() {
        return this.d.w();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return this.d.z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public final ClassDescriptor H0() {
        ClassDescriptor classDescriptorA = this.d.H0();
        if (classDescriptorA != null) {
            return classDescriptorA;
        }
        E0(21);
        throw null;
    }
}
