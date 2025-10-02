package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final ClassId o = new ClassId(StandardNames.l, Name.e("Function"));
    public static final ClassId p = new ClassId(StandardNames.i, Name.e("KFunction"));
    public final LockBasedStorageManager h;
    public final PackageFragmentDescriptor i;
    public final FunctionTypeKind j;
    public final int k;
    public final FunctionTypeConstructor l;
    public final FunctionClassScope m;
    public final List n;

    public static final class Companion {
    }

    @SourceDebugExtension
    public final class FunctionTypeConstructor extends AbstractClassTypeConstructor {
        public FunctionTypeConstructor() {
            super(FunctionClassDescriptor.this.h);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean d() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection f() {
            List listR;
            FunctionClassDescriptor functionClassDescriptor = FunctionClassDescriptor.this;
            int i = functionClassDescriptor.k;
            FunctionTypeKind functionTypeKind = functionClassDescriptor.j;
            FunctionTypeKind.Function function = FunctionTypeKind.Function.c;
            if (Intrinsics.c(functionTypeKind, function)) {
                listR = CollectionsKt.Q(FunctionClassDescriptor.o);
            } else if (Intrinsics.c(functionTypeKind, FunctionTypeKind.KFunction.c)) {
                listR = CollectionsKt.R(FunctionClassDescriptor.p, new ClassId(StandardNames.l, function.a(i)));
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.c;
                if (Intrinsics.c(functionTypeKind, suspendFunction)) {
                    listR = CollectionsKt.Q(FunctionClassDescriptor.o);
                } else {
                    if (!Intrinsics.c(functionTypeKind, FunctionTypeKind.KSuspendFunction.c)) {
                        int i2 = AddToStdlibKt.f24655a;
                        throw new IllegalStateException("should not be called");
                    }
                    listR = CollectionsKt.R(FunctionClassDescriptor.p, new ClassId(StandardNames.f, suspendFunction.a(i)));
                }
            }
            ModuleDescriptor moduleDescriptorE = functionClassDescriptor.i.e();
            List<ClassId> list = listR;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor classDescriptorA = FindClassInModuleKt.a(moduleDescriptorE, classId);
                if (classDescriptorA == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listX0 = CollectionsKt.x0(classDescriptorA.m().getParameters().size(), functionClassDescriptor.n);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listX0, 10));
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).t()));
                }
                TypeAttributes.e.getClass();
                arrayList.add(KotlinTypeFactory.c(TypeAttributes.f, classDescriptorA, arrayList2));
            }
            return CollectionsKt.G0(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return FunctionClassDescriptor.this.n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker i() {
            return SupertypeLoopChecker.EMPTY.f24345a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* renamed from: n */
        public final ClassDescriptor c() {
            return FunctionClassDescriptor.this;
        }

        public final String toString() {
            return FunctionClassDescriptor.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(LockBasedStorageManager lockBasedStorageManager, BuiltInsPackageFragment containingDeclaration, FunctionTypeKind functionTypeKind, int i) {
        super(lockBasedStorageManager, functionTypeKind.a(i));
        Intrinsics.h(containingDeclaration, "containingDeclaration");
        Intrinsics.h(functionTypeKind, "functionTypeKind");
        this.h = lockBasedStorageManager;
        this.i = containingDeclaration;
        this.j = functionTypeKind;
        this.k = i;
        this.l = new FunctionTypeConstructor();
        this.m = new FunctionClassScope(lockBasedStorageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(intRange, 10));
        IntProgressionIterator it = intRange.iterator();
        while (it.f) {
            int iNextInt = it.nextInt();
            arrayList.add(TypeParameterDescriptorImpl.L0(this, Variance.g, Name.e("P" + iNextInt), arrayList.size(), this.h));
            arrayList2.add(Unit.f24250a);
        }
        arrayList.add(TypeParameterDescriptorImpl.L0(this, Variance.h, Name.e("R"), arrayList.size(), this.h));
        this.n = CollectionsKt.G0(arrayList);
        FunctionClassKind.Companion companion = FunctionClassKind.d;
        FunctionTypeKind functionTypeKind2 = this.j;
        companion.getClass();
        Intrinsics.h(functionTypeKind2, "functionTypeKind");
        if (functionTypeKind2.equals(FunctionTypeKind.Function.c) || functionTypeKind2.equals(FunctionTypeKind.SuspendFunction.c) || functionTypeKind2.equals(FunctionTypeKind.KFunction.c)) {
            return;
        }
        functionTypeKind2.equals(FunctionTypeKind.KSuspendFunction.c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean G0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor e() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind f() {
        return ClassKind.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        return SourceElement.f24343a;
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
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
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
        return Modality.h;
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
    public final /* bridge */ /* synthetic */ Collection n() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final /* bridge */ /* synthetic */ Collection o() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope o0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.m;
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
    public final /* bridge */ /* synthetic */ ClassDescriptor r0() {
        return null;
    }

    public final String toString() {
        String strB = getName().b();
        Intrinsics.g(strB, "asString(...)");
        return strB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List u() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean w() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final /* bridge */ /* synthetic */ ClassConstructorDescriptor z() {
        return null;
    }
}
