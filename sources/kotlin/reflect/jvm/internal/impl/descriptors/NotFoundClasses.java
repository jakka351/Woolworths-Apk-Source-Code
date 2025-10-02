package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public final class NotFoundClasses {

    /* renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f24338a;
    public final ModuleDescriptor b;
    public final MemoizedFunctionToNotNull c;
    public final MemoizedFunctionToNotNull d;

    /* loaded from: classes7.dex */
    public static final class ClassRequest {

        /* renamed from: a, reason: collision with root package name */
        public final ClassId f24339a;
        public final List b;

        public ClassRequest(ClassId classId, List list) {
            Intrinsics.h(classId, "classId");
            this.f24339a = classId;
            this.b = list;
        }

        public final ClassId a() {
            return this.f24339a;
        }

        public final List b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.c(this.f24339a, classRequest.f24339a) && Intrinsics.c(this.b, classRequest.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f24339a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClassRequest(classId=");
            sb.append(this.f24339a);
            sb.append(", typeParametersCount=");
            return a.o(sb, this.b, ')');
        }
    }

    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class MockClassDescriptor extends ClassDescriptorBase {
        public final boolean j;
        public final ArrayList k;
        public final ClassTypeConstructorImpl l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(LockBasedStorageManager lockBasedStorageManager, ClassOrPackageFragmentDescriptor container, Name name, boolean z, int i) {
            super(lockBasedStorageManager, container, name, SourceElement.f24343a);
            Intrinsics.h(container, "container");
            this.j = z;
            IntRange intRangeO = RangesKt.o(0, i);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
            IntProgressionIterator it = intRangeO.iterator();
            while (it.f) {
                int iNextInt = it.nextInt();
                arrayList.add(TypeParameterDescriptorImpl.L0(this, Variance.f, Name.e(RequestConfiguration.MAX_AD_CONTENT_RATING_T + iNextInt), iNextInt, lockBasedStorageManager));
            }
            this.k = arrayList;
            this.l = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.c(this), SetsKt.i(DescriptorUtilsKt.j(this).p().e()), lockBasedStorageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean G0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ClassKind f() {
            return ClassKind.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ValueClassRepresentation f0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public final Annotations getAnnotations() {
            return Annotations.Companion.f24350a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
        public final DescriptorVisibility getVisibility() {
            DescriptorVisibility PUBLIC = DescriptorVisibilities.e;
            Intrinsics.g(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean h0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public final boolean i() {
            return this.j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean isExternal() {
            return false;
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
            return Modality.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean l0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public final TypeConstructor m() {
            return this.l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final Collection n() {
            return EmptySet.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final Collection o() {
            return EmptyList.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public final MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean p0() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final /* bridge */ /* synthetic */ MemberScope q0() {
            return MemberScope.Empty.b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ClassDescriptor r0() {
            return null;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public final List u() {
            return this.k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean w() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final ClassConstructorDescriptor z() {
            return null;
        }
    }

    public NotFoundClasses(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module) {
        Intrinsics.h(module, "module");
        this.f24338a = lockBasedStorageManager;
        this.b = module;
        this.c = lockBasedStorageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$0
            public final NotFoundClasses d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName fqName = (FqName) obj;
                Intrinsics.h(fqName, "fqName");
                return new EmptyPackageFragmentDescriptor(this.d.b, fqName);
            }
        });
        this.d = lockBasedStorageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$1
            public final NotFoundClasses d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptorA;
                NotFoundClasses.ClassRequest classRequest = (NotFoundClasses.ClassRequest) obj;
                Intrinsics.h(classRequest, "<destruct>");
                ClassId classIdA = classRequest.a();
                List listB = classRequest.b();
                if (classIdA.c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + classIdA);
                }
                ClassId classIdE = classIdA.e();
                NotFoundClasses notFoundClasses = this.d;
                if (classIdE == null || (classOrPackageFragmentDescriptorA = notFoundClasses.a(classIdE, CollectionsKt.x(listB, 1))) == null) {
                    classOrPackageFragmentDescriptorA = (ClassOrPackageFragmentDescriptor) notFoundClasses.c.invoke(classIdA.f24499a);
                }
                ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor = classOrPackageFragmentDescriptorA;
                boolean zG = classIdA.g();
                LockBasedStorageManager lockBasedStorageManager2 = notFoundClasses.f24338a;
                Name nameF = classIdA.f();
                Integer num = (Integer) CollectionsKt.F(listB);
                return new NotFoundClasses.MockClassDescriptor(lockBasedStorageManager2, classOrPackageFragmentDescriptor, nameF, zG, num != null ? num.intValue() : 0);
            }
        });
    }

    public final ClassDescriptor a(ClassId classId, List list) {
        Intrinsics.h(classId, "classId");
        return (ClassDescriptor) this.d.invoke(new ClassRequest(classId, list));
    }
}
