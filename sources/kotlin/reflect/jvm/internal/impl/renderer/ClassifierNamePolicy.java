package kotlin.reflect.jvm.internal.impl.renderer;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes.dex */
public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final FULLY_QUALIFIED f24518a = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.g(name, "getName(...)");
                return descriptorRendererImpl.Q(name, false);
            }
            FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(classifierDescriptor);
            Intrinsics.g(fqNameUnsafeG, "getFqName(...)");
            return descriptorRendererImpl.I(fqNameUnsafeG);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final SHORT f24519a = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.g(name, "getName(...)");
                return descriptorRendererImpl.Q(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.e();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.b(CollectionsKt.m(arrayList));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final SOURCE_CODE_QUALIFIED f24520a = new SOURCE_CODE_QUALIFIED();

        public static String b(ClassifierDescriptor classifierDescriptor) {
            String strB;
            Name name = classifierDescriptor.getName();
            Intrinsics.g(name, "getName(...)");
            String strA = RenderingUtilsKt.a(name);
            if (!(classifierDescriptor instanceof TypeParameterDescriptor)) {
                DeclarationDescriptor declarationDescriptorE = classifierDescriptor.e();
                Intrinsics.g(declarationDescriptorE, "getContainingDeclaration(...)");
                if (declarationDescriptorE instanceof ClassDescriptor) {
                    strB = b((ClassifierDescriptor) declarationDescriptorE);
                } else if (declarationDescriptorE instanceof PackageFragmentDescriptor) {
                    FqNameUnsafe fqNameUnsafe = ((PackageFragmentDescriptor) declarationDescriptorE).d().f24500a;
                    Intrinsics.h(fqNameUnsafe, "<this>");
                    strB = RenderingUtilsKt.b(FqNameUnsafe.e(fqNameUnsafe));
                } else {
                    strB = null;
                }
                if (strB != null && !strB.equals("")) {
                    return strB + JwtParser.SEPARATOR_CHAR + strA;
                }
            }
            return strA;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public final String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            return b(classifierDescriptor);
        }
    }

    String a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl);
}
