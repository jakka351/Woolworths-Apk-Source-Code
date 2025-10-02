package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(StorageManager storageManager) {
        super(storageManager);
        if (storageManager != null) {
        } else {
            m(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.m(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            r1 = 0
            if (r0 == 0) goto L73
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = r5.c()
            java.lang.String r2 = "first"
            kotlin.jvm.internal.Intrinsics.h(r0, r2)
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r6.getName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1f
        L1d:
            r6 = r1
            goto L70
        L1f:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r6 = r6.e()
        L27:
            if (r0 == 0) goto L51
            if (r6 == 0) goto L51
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
            if (r2 == 0) goto L32
            boolean r6 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
            goto L70
        L32:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
            if (r2 == 0) goto L37
            goto L1d
        L37:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L53
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r0
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r6
            kotlin.reflect.jvm.internal.impl.name.FqName r6 = r6.d()
            boolean r6 = kotlin.jvm.internal.Intrinsics.c(r0, r6)
            if (r6 == 0) goto L1d
        L51:
            r6 = r3
            goto L70
        L53:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            if (r2 == 0) goto L58
            goto L1d
        L58:
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r4 = r6.getName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r4)
            if (r2 != 0) goto L67
            goto L1d
        L67:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r6 = r6.e()
            goto L27
        L70:
            if (r6 == 0) goto L73
            return r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.e(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final KotlinType g() {
        ClassDescriptor classDescriptorC = c();
        if (classDescriptorC == null) {
            KotlinBuiltIns.a(107);
            throw null;
        }
        Name name = KotlinBuiltIns.f;
        if (KotlinBuiltIns.b(classDescriptorC, StandardNames.FqNames.f24314a) || KotlinBuiltIns.b(classDescriptorC, StandardNames.FqNames.b)) {
            return null;
        }
        return p().e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection h(boolean z) {
        DeclarationDescriptor declarationDescriptorE = c().e();
        if (!(declarationDescriptorE instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            m(3);
            throw null;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorE;
        smartList.add(classDescriptor.t());
        ClassDescriptor classDescriptorR0 = classDescriptor.r0();
        if (z && classDescriptorR0 != null) {
            smartList.add(classDescriptorR0.t());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract ClassDescriptor c();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns p() {
        KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(c());
        if (kotlinBuiltInsE != null) {
            return kotlinBuiltInsE;
        }
        m(1);
        throw null;
    }
}
