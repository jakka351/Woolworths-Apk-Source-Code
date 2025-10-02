package kotlin.reflect.jvm.internal.impl.resolve;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes.dex */
public class DescriptorUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24530a = 0;

    static {
        new FqName("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = lqlqqlq.m006Dm006Dm006Dm;
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(CallableDescriptor callableDescriptor, LinkedHashSet linkedHashSet) {
        if (callableDescriptor == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(callableDescriptor)) {
            return;
        }
        Iterator it = callableDescriptor.a().q().iterator();
        while (it.hasNext()) {
            CallableDescriptor callableDescriptorA = ((CallableDescriptor) it.next()).a();
            b(callableDescriptorA, linkedHashSet);
            linkedHashSet.add(callableDescriptorA);
        }
    }

    public static ClassDescriptor c(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(45);
            throw null;
        }
        TypeConstructor typeConstructorJ0 = kotlinType.J0();
        if (typeConstructorJ0 == null) {
            a(46);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructorJ0.c();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(47);
        throw null;
    }

    public static ModuleDescriptor d(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(21);
            throw null;
        }
        ModuleDescriptor moduleDescriptorE = e(declarationDescriptor);
        if (moduleDescriptorE != null) {
            return moduleDescriptorE;
        }
        a(22);
        throw null;
    }

    public static ModuleDescriptor e(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(23);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).C0();
            }
            declarationDescriptor = declarationDescriptor.e();
        }
        return null;
    }

    public static SourceFile f(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(81);
            throw null;
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).g0();
        }
        boolean z = declarationDescriptor instanceof DeclarationDescriptorWithSource;
        SourceFile sourceFile = SourceFile.f24344a;
        if (z) {
            ((DeclarationDescriptorWithSource) declarationDescriptor).g().getClass();
        }
        return sourceFile;
    }

    public static FqNameUnsafe g(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            FqName fqNameH = h(declarationDescriptor);
            return fqNameH != null ? fqNameH.f24500a : g(declarationDescriptor.e()).a(declarationDescriptor.getName());
        }
        a(2);
        throw null;
    }

    public static FqName h(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(5);
            throw null;
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.f(declarationDescriptor)) {
            return FqName.c;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).d();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).d();
        }
        return null;
    }

    public static DeclarationDescriptor i(DeclarationDescriptor declarationDescriptor, Class cls, boolean z) {
        if (declarationDescriptor == null) {
            return null;
        }
        if (z) {
            declarationDescriptor = declarationDescriptor.e();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return declarationDescriptor;
            }
            declarationDescriptor = declarationDescriptor.e();
        }
        return null;
    }

    public static ClassDescriptor j(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(44);
            throw null;
        }
        Iterator it = classDescriptor.m().a().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorC = c((KotlinType) it.next());
            if (classDescriptorC.f() != ClassKind.e) {
                return classDescriptorC;
            }
        }
        return null;
    }

    public static boolean k(DeclarationDescriptor declarationDescriptor) {
        return n(declarationDescriptor, ClassKind.d) && declarationDescriptor.getName().equals(SpecialNames.f24503a);
    }

    public static boolean l(DeclarationDescriptor declarationDescriptor) {
        return n(declarationDescriptor, ClassKind.i) && ((ClassDescriptor) declarationDescriptor).j0();
    }

    public static boolean m(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return n(declarationDescriptor, ClassKind.g);
        }
        a(36);
        throw null;
    }

    public static boolean n(DeclarationDescriptor declarationDescriptor, ClassKind classKind) {
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).f() == classKind;
    }

    public static boolean o(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(1);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (k(declarationDescriptor) || ((declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.f)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.e();
        }
        return false;
    }

    public static boolean p(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            a(30);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(31);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.J0().c();
        if (classifierDescriptorC == null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorA = classifierDescriptorC.a();
        return (declarationDescriptorA instanceof ClassifierDescriptor) && (declarationDescriptor instanceof ClassifierDescriptor) && ((ClassifierDescriptor) declarationDescriptor).m().equals(((ClassifierDescriptor) declarationDescriptorA).m());
    }

    public static boolean q(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        return (n(classifierDescriptorWithTypeParameters, ClassKind.d) || n(classifierDescriptorWithTypeParameters, ClassKind.e)) && ((ClassDescriptor) classifierDescriptorWithTypeParameters).k() == Modality.f;
    }

    public static boolean r(KotlinType kotlinType, DeclarationDescriptor declarationDescriptor) {
        if (kotlinType == null) {
            a(32);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(33);
            throw null;
        }
        if (p(kotlinType, declarationDescriptor)) {
            return true;
        }
        Iterator it = kotlinType.J0().a().iterator();
        while (it.hasNext()) {
            if (r((KotlinType) it.next(), declarationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.e() instanceof PackageFragmentDescriptor);
    }

    public static CallableMemberDescriptor t(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(58);
            throw null;
        }
        while (callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.e) {
            Collection collectionQ = callableMemberDescriptor.q();
            if (collectionQ.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + callableMemberDescriptor);
            }
            callableMemberDescriptor = (CallableMemberDescriptor) collectionQ.iterator().next();
        }
        return callableMemberDescriptor;
    }
}
