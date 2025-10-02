package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes.dex */
public class OverridingUtil {
    public static final List b = CollectionsKt.G0(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    public static final OverridingUtil c;
    public static final KotlinTypeChecker.TypeConstructorEquality d;

    /* renamed from: a, reason: collision with root package name */
    public final KotlinTypeChecker.TypeConstructorEquality f24531a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$1, reason: invalid class name */
    public static class AnonymousClass1 implements KotlinTypeChecker.TypeConstructorEquality {
        public static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public final boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                b(0);
                throw null;
            }
            if (typeConstructor2 != null) {
                return typeConstructor.equals(typeConstructor2);
            }
            b(1);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$8, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24532a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Modality.values().length];
            c = iArr;
            try {
                Modality.Companion companion = Modality.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = c;
                Modality.Companion companion2 = Modality.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = c;
                Modality.Companion companion3 = Modality.d;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = c;
                Modality.Companion companion4 = Modality.d;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr5 = new int[OverrideCompatibilityInfo.Result.values().length];
            b = iArr5;
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr6 = new int[ExternalOverridabilityCondition.Result.values().length];
            f24532a = iArr6;
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24532a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24532a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class OverrideCompatibilityInfo {
        public static final OverrideCompatibilityInfo c = new OverrideCompatibilityInfo(Result.d, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        public final Result f24533a;
        public final String b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {
            public static final Result d;
            public static final Result e;
            public static final Result f;
            public static final /* synthetic */ Result[] g;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                d = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                e = result2;
                Result result3 = new Result("CONFLICT", 2);
                f = result3;
                g = new Result[]{result, result2, result3};
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) g.clone();
            }
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            this.f24533a = result;
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(int):void");
        }

        public static OverrideCompatibilityInfo b(String str) {
            return new OverrideCompatibilityInfo(Result.f, str);
        }

        public static OverrideCompatibilityInfo d(String str) {
            return new OverrideCompatibilityInfo(Result.e, str);
        }

        public static OverrideCompatibilityInfo e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = c;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            a(0);
            throw null;
        }

        public final Result c() {
            Result result = this.f24533a;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }

        public final String toString() {
            return this.f24533a + ": " + this.b;
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        d = anonymousClass1;
        c = new OverridingUtil(anonymousClass1);
    }

    public OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (typeConstructorEquality != null) {
            this.f24531a = typeConstructorEquality;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.a(int):void");
    }

    public static boolean b(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            a(44);
            throw null;
        }
        if (kotlinType2 == null) {
            a(45);
            throw null;
        }
        if (KotlinTypeKt.a(kotlinType) && KotlinTypeKt.a(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.e(typeCheckerState, kotlinType.M0(), kotlinType2.M0());
    }

    public static void c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            a(17);
            throw null;
        }
        CallableMemberDescriptor.Kind kindF = callableMemberDescriptor.f();
        kindF.getClass();
        if (kindF != CallableMemberDescriptor.Kind.e) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.q().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator it = callableMemberDescriptor.q().iterator();
        while (it.hasNext()) {
            c((CallableMemberDescriptor) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = callableDescriptor.e0();
        ArrayList arrayList = new ArrayList();
        if (receiverParameterDescriptorE0 != null) {
            arrayList.add(receiverParameterDescriptorE0.getType());
        }
        Iterator it = callableDescriptor.h().iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
    
        if (r2 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:
    
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0161, code lost:
    
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
    
        r12 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) s(r11, new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass4())).F0(r12, r0, (kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility) r1);
        r13.b(r12, r11);
        r13.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.util.Collection r11, final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r12, kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy r13) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e(java.util.Collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, Function1 function1, Function1 function12) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultJ = j(callableDescriptor, callableDescriptor2);
                if (resultJ == OverrideCompatibilityInfo.Result.d) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultJ == OverrideCompatibilityInfo.Result.f) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static OverrideCompatibilityInfo i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            a(38);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = callableDescriptor instanceof FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.d("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoD = (callableDescriptor.e0() == null) != (callableDescriptor2.e0() == null) ? OverrideCompatibilityInfo.d("Receiver presence mismatch") : callableDescriptor.h().size() != callableDescriptor2.h().size() ? OverrideCompatibilityInfo.d("Value parameter number mismatch") : null;
        if (overrideCompatibilityInfoD != null) {
            return overrideCompatibilityInfoD;
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result j(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = c;
        OverrideCompatibilityInfo.Result resultC = overridingUtil.l(callableDescriptor2, callableDescriptor, null).c();
        OverrideCompatibilityInfo.Result resultC2 = overridingUtil.m(callableDescriptor, callableDescriptor2, null, false).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.d;
        if (resultC == result && resultC2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.f;
        return (resultC == result2 || resultC2 == result2) ? result2 : OverrideCompatibilityInfo.Result.e;
    }

    public static boolean k(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(65);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(66);
            throw null;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!p(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateF = c.f(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return o(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        PropertySetterDescriptor propertySetterDescriptorC = propertyDescriptor.c();
        PropertySetterDescriptor propertySetterDescriptorC2 = propertyDescriptor2.c();
        if ((propertySetterDescriptorC == null || propertySetterDescriptorC2 == null) ? true : p(propertySetterDescriptorC, propertySetterDescriptorC2)) {
            return (propertyDescriptor.C() && propertyDescriptor2.C()) ? AbstractTypeChecker.e(typeCheckerStateF, returnType.M0(), returnType2.M0()) : (propertyDescriptor.C() || !propertyDescriptor2.C()) && o(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
        }
        return false;
    }

    public static boolean o(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            a(71);
            throw null;
        }
        if (kotlinType == null) {
            a(72);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(73);
            throw null;
        }
        if (kotlinType2 == null) {
            a(74);
            throw null;
        }
        return AbstractTypeChecker.f24599a.i(typeCheckerState, kotlinType.M0(), kotlinType2.M0());
    }

    public static boolean p(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(67);
            throw null;
        }
        if (callableDescriptor2 != null) {
            Integer numB = DescriptorVisibilities.b(callableDescriptor.getVisibility(), callableDescriptor2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(13);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = callableDescriptor.equals(callableDescriptor2);
        DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides = DescriptorEquivalenceForOverrides.f24528a;
        if (!zEquals && descriptorEquivalenceForOverrides.a(callableDescriptor.H0(), callableDescriptor2.H0(), false)) {
            return true;
        }
        CallableDescriptor callableDescriptorA = callableDescriptor2.H0();
        int i = DescriptorUtils.f24530a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtils.b(callableDescriptor.H0(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (descriptorEquivalenceForOverrides.a(callableDescriptorA, (CallableDescriptor) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(CallableMemberDescriptor callableMemberDescriptor, Function1 function1) {
        DescriptorVisibility descriptorVisibility;
        DescriptorVisibility descriptorVisibilityD;
        DescriptorVisibility descriptorVisibility2;
        if (callableMemberDescriptor == null) {
            a(105);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.q()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.g) {
                r(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.g) {
            return;
        }
        Collection<CallableMemberDescriptor> collectionQ = callableMemberDescriptor.q();
        if (collectionQ == null) {
            a(107);
            throw null;
        }
        if (collectionQ.isEmpty()) {
            descriptorVisibilityD = DescriptorVisibilities.l;
        } else {
            Iterator it = collectionQ.iterator();
            loop3: while (true) {
                descriptorVisibility = null;
                while (it.hasNext()) {
                    DescriptorVisibility visibility = ((CallableMemberDescriptor) it.next()).getVisibility();
                    if (descriptorVisibility != null) {
                        Integer numB = DescriptorVisibilities.b(visibility, descriptorVisibility);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    descriptorVisibility = visibility;
                }
            }
            if (descriptorVisibility == null) {
                descriptorVisibilityD = null;
                break;
            }
            Iterator it2 = collectionQ.iterator();
            while (it2.hasNext()) {
                Integer numB2 = DescriptorVisibilities.b(descriptorVisibility, ((CallableMemberDescriptor) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    descriptorVisibilityD = null;
                    break;
                }
            }
            descriptorVisibilityD = descriptorVisibility;
        }
        if (descriptorVisibilityD == null) {
            descriptorVisibilityD = null;
            break;
        }
        if (callableMemberDescriptor.f() == CallableMemberDescriptor.Kind.e) {
            for (CallableMemberDescriptor callableMemberDescriptor3 : collectionQ) {
                if (callableMemberDescriptor3.k() != Modality.h && !callableMemberDescriptor3.getVisibility().equals(descriptorVisibilityD)) {
                    descriptorVisibilityD = null;
                    break;
                }
            }
        } else {
            descriptorVisibilityD = descriptorVisibilityD.d();
        }
        if (descriptorVisibilityD == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility2 = DescriptorVisibilities.e;
        } else {
            descriptorVisibility2 = descriptorVisibilityD;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) callableMemberDescriptor;
            if (descriptorVisibility2 == null) {
                PropertyDescriptorImpl.n0(20);
                throw null;
            }
            propertyDescriptorImpl.m = descriptorVisibility2;
            Iterator it3 = ((PropertyDescriptor) callableMemberDescriptor).v().iterator();
            while (it3.hasNext()) {
                r((PropertyAccessorDescriptor) it3.next(), descriptorVisibilityD == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            FunctionDescriptorImpl functionDescriptorImpl = (FunctionDescriptorImpl) callableMemberDescriptor;
            if (descriptorVisibility2 != null) {
                functionDescriptorImpl.o = descriptorVisibility2;
                return;
            } else {
                FunctionDescriptorImpl.n0(10);
                throw null;
            }
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.K0(descriptorVisibility2);
        if (descriptorVisibility2 != propertyAccessorDescriptorImpl.g0().getVisibility()) {
            propertyAccessorDescriptorImpl.J0();
        }
    }

    public static Object s(Collection collection, Function1 function1) {
        Object next;
        if (collection.size() == 1) {
            Object objC = CollectionsKt.C(collection);
            if (objC != null) {
                return objC;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object objC2 = CollectionsKt.C(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(objC2);
        for (Object obj : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(obj);
            if (callableDescriptor2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!k(callableDescriptor2, (CallableDescriptor) it2.next())) {
                    break;
                }
            }
            if (k(callableDescriptor2, callableDescriptor) && !k(callableDescriptor, callableDescriptor2)) {
                objC2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objC2 != null) {
                return objC2;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objC3 = CollectionsKt.C(arrayList);
            if (objC3 != null) {
                return objC3;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!FlexibleTypesKt.b(((CallableDescriptor) function1.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objC4 = CollectionsKt.C(arrayList);
        if (objC4 != null) {
            return objC4;
        }
        a(82);
        throw null;
    }

    public final TypeCheckerState f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality = this.f24531a;
        if (zIsEmpty) {
            return new OverridingUtilTypeSystemContext(null, typeConstructorEquality).t0();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((TypeParameterDescriptor) list.get(i)).m(), ((TypeParameterDescriptor) list2.get(i)).m());
        }
        return new OverridingUtilTypeSystemContext(map, typeConstructorEquality).t0();
    }

    public final void h(Name name, Collection collection, Collection collection2, ClassDescriptor classDescriptor, final NonReportingOverrideStrategy nonReportingOverrideStrategy) {
        if (name == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (classDescriptor == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptor == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            SmartSet smartSetD = SmartSet.d();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it2.next();
                OverrideCompatibilityInfo.Result resultC = l(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).c();
                boolean z = !DescriptorVisibilities.e(callableMemberDescriptor2.getVisibility()) && DescriptorVisibilities.c(DescriptorVisibilities.n, callableMemberDescriptor2, callableMemberDescriptor) == null;
                int iOrdinal = resultC.ordinal();
                if (iOrdinal == 0) {
                    if (z) {
                        smartSetD.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (iOrdinal == 2) {
                    if (z) {
                        nonReportingOverrideStrategy.d(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            nonReportingOverrideStrategy.b(callableMemberDescriptor, smartSetD);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            final DeclarationDescriptor declarationDescriptorE = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).e();
            Function1<CallableMemberDescriptor, Boolean> function1 = new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((CallableMemberDescriptor) obj).e() == declarationDescriptorE);
                }
            };
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) function1.invoke(it3.next())).booleanValue()) {
                        LinkedList linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            final CallableMemberDescriptor callableMemberDescriptorA = VisibilityUtilKt.a(linkedList);
                            e(g(callableMemberDescriptorA, linkedList, new Function1<CallableMemberDescriptor, CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return (CallableMemberDescriptor) obj;
                                }
                            }, new Function1<CallableMemberDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    CallableMemberDescriptor second = (CallableMemberDescriptor) obj;
                                    Intrinsics.h(second, "second");
                                    nonReportingOverrideStrategy.c(callableMemberDescriptorA, second);
                                    return Unit.f24250a;
                                }
                            }), classDescriptor, nonReportingOverrideStrategy);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((CallableMemberDescriptor) it4.next()), classDescriptor, nonReportingOverrideStrategy);
        }
    }

    public final OverrideCompatibilityInfo l(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            a(19);
            throw null;
        }
        if (callableDescriptor2 != null) {
            return m(callableDescriptor, callableDescriptor2, classDescriptor, false);
        }
        a(20);
        throw null;
    }

    public final OverrideCompatibilityInfo m(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            a(22);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(23);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoN = n(callableDescriptor, callableDescriptor2, z);
        boolean z2 = overrideCompatibilityInfoN.c() == OverrideCompatibilityInfo.Result.d;
        List<ExternalOverridabilityCondition> list = b;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ExternalOverridabilityCondition.Contract contract = ExternalOverridabilityCondition.Contract.d;
            if (!zHasNext) {
                if (!z2) {
                    return overrideCompatibilityInfoN;
                }
                for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                    if (externalOverridabilityCondition.a() == contract) {
                        int iOrdinal = externalOverridabilityCondition.b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (iOrdinal == 1) {
                            return OverrideCompatibilityInfo.d("External condition");
                        }
                    }
                }
                OverrideCompatibilityInfo overrideCompatibilityInfoE = OverrideCompatibilityInfo.e();
                if (overrideCompatibilityInfoE != null) {
                    return overrideCompatibilityInfoE;
                }
                a(27);
                throw null;
            }
            ExternalOverridabilityCondition externalOverridabilityCondition2 = (ExternalOverridabilityCondition) it.next();
            if (externalOverridabilityCondition2.a() != contract && (!z2 || externalOverridabilityCondition2.a() != ExternalOverridabilityCondition.Contract.e)) {
                int iOrdinal2 = externalOverridabilityCondition2.b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal();
                if (iOrdinal2 == 0) {
                    z2 = true;
                } else if (iOrdinal2 == 1) {
                    return OverrideCompatibilityInfo.d("External condition");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r14.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo n(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r17, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.n(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, boolean):kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo");
    }
}
