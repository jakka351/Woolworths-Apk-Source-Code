package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* loaded from: classes7.dex */
public class JavaDescriptorVisibilities {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorVisibility f24401a;
    public static final DescriptorVisibility b;
    public static final DescriptorVisibility c;
    public static final HashMap d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$1, reason: invalid class name */
    public static class AnonymousClass1 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return JavaDescriptorVisibilities.c(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$2, reason: invalid class name */
    public static class AnonymousClass2 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return JavaDescriptorVisibilities.b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities$3, reason: invalid class name */
    public static class AnonymousClass3 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return JavaDescriptorVisibilities.b(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        JavaVisibilities.PackageVisibility packageVisibility = JavaVisibilities.PackageVisibility.c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(packageVisibility);
        f24401a = anonymousClass1;
        JavaVisibilities.ProtectedStaticVisibility protectedStaticVisibility = JavaVisibilities.ProtectedStaticVisibility.c;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(protectedStaticVisibility);
        b = anonymousClass2;
        JavaVisibilities.ProtectedAndPackage protectedAndPackage = JavaVisibilities.ProtectedAndPackage.c;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(protectedAndPackage);
        c = anonymousClass3;
        HashMap map = new HashMap();
        d = map;
        map.put(packageVisibility, anonymousClass1);
        map.put(protectedStaticVisibility, anonymousClass2);
        map.put(protectedAndPackage, anonymousClass3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityT;
        if (declarationDescriptor == null) {
            a(1);
            throw null;
        }
        if (declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) {
            declarationDescriptorWithVisibilityT = DescriptorUtils.t((CallableMemberDescriptor) declarationDescriptorWithVisibility);
        } else {
            int i = DescriptorUtils.f24530a;
            declarationDescriptorWithVisibilityT = declarationDescriptorWithVisibility;
        }
        if (c(declarationDescriptorWithVisibilityT, declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.c.c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
    }

    public static boolean c(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            a(2);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(3);
            throw null;
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.i(declarationDescriptorWithVisibility, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.i(declarationDescriptor, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.d().equals(packageFragmentDescriptor2.d())) ? false : true;
    }
}
