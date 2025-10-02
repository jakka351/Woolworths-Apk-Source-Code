package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DescriptorUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24544a = 0;

    static {
        Name.e("value");
    }

    public static final boolean a(ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.h(valueParameterDescriptor, "<this>");
        Boolean boolC = DFS.c(CollectionsKt.Q(valueParameterDescriptor), DescriptorUtilsKt$$Lambda$0.f24545a, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.d);
        Intrinsics.g(boolC, "ifAny(...)");
        return boolC.booleanValue();
    }

    public static CallableMemberDescriptor b(CallableMemberDescriptor callableMemberDescriptor, final Function1 function1) {
        Intrinsics.h(callableMemberDescriptor, "<this>");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return (CallableMemberDescriptor) DFS.a(CollectionsKt.Q(callableMemberDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public final Iterable a(Object obj) {
                Collection collectionQ;
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                int i = DescriptorUtilsKt.f24544a;
                return (callableMemberDescriptor2 == null || (collectionQ = callableMemberDescriptor2.q()) == null) ? EmptyList.d : collectionQ;
            }
        }, new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final Object a() {
                return (CallableMemberDescriptor) objectRef.d;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final boolean b(Object obj) {
                CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
                Intrinsics.h(current, "current");
                return objectRef.d == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final void c(Object obj) {
                CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
                Intrinsics.h(current, "current");
                Ref.ObjectRef objectRef2 = objectRef;
                if (objectRef2.d == null && ((Boolean) function1.invoke(current)).booleanValue()) {
                    objectRef2.d = current;
                }
            }
        });
    }

    public static final FqName c(DeclarationDescriptorNonRoot declarationDescriptorNonRoot) {
        Intrinsics.h(declarationDescriptorNonRoot, "<this>");
        FqNameUnsafe fqNameUnsafeH = h(declarationDescriptorNonRoot);
        if (!fqNameUnsafeH.d()) {
            fqNameUnsafeH = null;
        }
        if (fqNameUnsafeH != null) {
            return fqNameUnsafeH.g();
        }
        return null;
    }

    public static final ClassDescriptor d(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.h(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorC = annotationDescriptor.getType().J0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }

    public static final KotlinBuiltIns e(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        return j(declarationDescriptor).p();
    }

    public static final ClassId f(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor declarationDescriptorE;
        ClassId classIdF;
        if (classifierDescriptor == null || (declarationDescriptorE = classifierDescriptor.e()) == null) {
            return null;
        }
        if (declarationDescriptorE instanceof PackageFragmentDescriptor) {
            FqName fqNameD = ((PackageFragmentDescriptor) declarationDescriptorE).d();
            Name name = classifierDescriptor.getName();
            Intrinsics.g(name, "getName(...)");
            return new ClassId(fqNameD, name);
        }
        if (!(declarationDescriptorE instanceof ClassifierDescriptorWithTypeParameters) || (classIdF = f((ClassifierDescriptor) declarationDescriptorE)) == null) {
            return null;
        }
        Name name2 = classifierDescriptor.getName();
        Intrinsics.g(name2, "getName(...)");
        return classIdF.d(name2);
    }

    public static final FqName g(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        FqName fqNameH = DescriptorUtils.h(declarationDescriptor);
        return fqNameH != null ? fqNameH : DescriptorUtils.g(declarationDescriptor.e()).a(declarationDescriptor.getName()).g();
    }

    public static final FqNameUnsafe h(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(declarationDescriptor);
        Intrinsics.g(fqNameUnsafeG, "getFqName(...)");
        return fqNameUnsafeG;
    }

    public static final void i(ModuleDescriptor moduleDescriptor) {
        Intrinsics.h(moduleDescriptor, "<this>");
    }

    public static final ModuleDescriptor j(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.h(declarationDescriptor, "<this>");
        ModuleDescriptor moduleDescriptorD = DescriptorUtils.d(declarationDescriptor);
        Intrinsics.g(moduleDescriptorD, "getContainingModule(...)");
        return moduleDescriptorD;
    }

    public static final Sequence k(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        return SequencesKt.e(SequencesKt.m(classifierDescriptorWithTypeParameters, DescriptorUtilsKt$$Lambda$1.d), 1);
    }

    public static final CallableMemberDescriptor l(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.h(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor propertyDescriptorG0 = ((PropertyAccessorDescriptor) callableMemberDescriptor).g0();
        Intrinsics.g(propertyDescriptorG0, "getCorrespondingProperty(...)");
        return propertyDescriptorG0;
    }

    public static final FlatteningSequence m(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.h(callableMemberDescriptor, "<this>");
        Sequence sequenceG = ArraysKt.g(new CallableMemberDescriptor[]{callableMemberDescriptor});
        Collection collectionQ = callableMemberDescriptor.q();
        Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
        return SequencesKt.v(sequenceG, SequencesKt.j(CollectionsKt.n(collectionQ), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                int i = DescriptorUtilsKt.f24544a;
                Intrinsics.e(callableMemberDescriptor2);
                return DescriptorUtilsKt.m(callableMemberDescriptor2);
            }
        }));
    }
}
