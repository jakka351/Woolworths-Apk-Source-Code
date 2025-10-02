package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* loaded from: classes7.dex */
public final class DescriptorEquivalenceForOverrides {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorEquivalenceForOverrides f24528a = new DescriptorEquivalenceForOverrides();

    public static SourceElement e(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.e) {
                break;
            }
            Collection collectionQ = callableMemberDescriptor.q();
            Intrinsics.g(collectionQ, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.o0(collectionQ);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.g();
    }

    public final boolean a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, final boolean z) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return Intrinsics.c(((ClassDescriptor) declarationDescriptor).m(), ((ClassDescriptor) declarationDescriptor2).m());
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return b((TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z, DescriptorEquivalenceForOverrides$$Lambda$0.d);
        }
        if (!(declarationDescriptor instanceof CallableDescriptor) || !(declarationDescriptor2 instanceof CallableDescriptor)) {
            return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.c(((PackageFragmentDescriptor) declarationDescriptor).d(), ((PackageFragmentDescriptor) declarationDescriptor2).d()) : Intrinsics.c(declarationDescriptor, declarationDescriptor2);
        }
        final CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
        final CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
        if (!callableDescriptor.equals(callableDescriptor2)) {
            if (!Intrinsics.c(callableDescriptor.getName(), callableDescriptor2.getName())) {
                return false;
            }
            if ((callableDescriptor instanceof MemberDescriptor) && (callableDescriptor2 instanceof MemberDescriptor) && ((MemberDescriptor) callableDescriptor).p0() != ((MemberDescriptor) callableDescriptor2).p0()) {
                return false;
            }
            if ((Intrinsics.c(callableDescriptor.e(), callableDescriptor2.e()) && (!z || !Intrinsics.c(e(callableDescriptor), e(callableDescriptor2)))) || DescriptorUtils.o(callableDescriptor) || DescriptorUtils.o(callableDescriptor2) || !d(callableDescriptor, callableDescriptor2, DescriptorEquivalenceForOverrides$$Lambda$1.d, z)) {
                return false;
            }
            OverridingUtil overridingUtil = new OverridingUtil(new KotlinTypeChecker.TypeConstructorEquality(callableDescriptor, callableDescriptor2, z) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$2

                /* renamed from: a, reason: collision with root package name */
                public final boolean f24529a;
                public final CallableDescriptor b;
                public final CallableDescriptor c;

                {
                    this.f24529a = z;
                    this.b = callableDescriptor;
                    this.c = callableDescriptor2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
                public final boolean a(TypeConstructor c1, TypeConstructor c2) {
                    Intrinsics.h(c1, "c1");
                    Intrinsics.h(c2, "c2");
                    if (c1.equals(c2)) {
                        return true;
                    }
                    ClassifierDescriptor classifierDescriptorC = c1.c();
                    ClassifierDescriptor classifierDescriptorC2 = c2.c();
                    if (!(classifierDescriptorC instanceof TypeParameterDescriptor) || !(classifierDescriptorC2 instanceof TypeParameterDescriptor)) {
                        return false;
                    }
                    final CallableDescriptor callableDescriptor3 = this.b;
                    final CallableDescriptor callableDescriptor4 = this.c;
                    Function2 function2 = new Function2(callableDescriptor3, callableDescriptor4) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$3
                        public final CallableDescriptor d;
                        public final CallableDescriptor e;

                        {
                            this.d = callableDescriptor3;
                            this.e = callableDescriptor4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Boolean.valueOf(Intrinsics.c((DeclarationDescriptor) obj, this.d) && Intrinsics.c((DeclarationDescriptor) obj2, this.e));
                        }
                    };
                    return DescriptorEquivalenceForOverrides.f24528a.b((TypeParameterDescriptor) classifierDescriptorC, (TypeParameterDescriptor) classifierDescriptorC2, this.f24529a, function2);
                }
            });
            OverridingUtil.OverrideCompatibilityInfo.Result resultC = overridingUtil.m(callableDescriptor, callableDescriptor2, null, true).c();
            OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.d;
            if (resultC != result || overridingUtil.m(callableDescriptor2, callableDescriptor, null, true).c() != result) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(TypeParameterDescriptor a2, TypeParameterDescriptor b, boolean z, Function2 function2) {
        Intrinsics.h(a2, "a");
        Intrinsics.h(b, "b");
        if (a2.equals(b)) {
            return true;
        }
        return !Intrinsics.c(a2.e(), b.e()) && d(a2, b, function2, z) && a2.getIndex() == b.getIndex();
    }

    public final boolean d(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2 function2, boolean z) {
        DeclarationDescriptor declarationDescriptorE = declarationDescriptor.e();
        DeclarationDescriptor declarationDescriptorE2 = declarationDescriptor2.e();
        return ((declarationDescriptorE instanceof CallableMemberDescriptor) || (declarationDescriptorE2 instanceof CallableMemberDescriptor)) ? ((Boolean) function2.invoke(declarationDescriptorE, declarationDescriptorE2)).booleanValue() : a(declarationDescriptorE, declarationDescriptorE2, z);
    }
}
