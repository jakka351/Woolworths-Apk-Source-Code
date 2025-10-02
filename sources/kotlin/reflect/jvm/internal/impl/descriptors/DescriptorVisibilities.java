package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;

/* loaded from: classes.dex */
public class DescriptorVisibilities {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorVisibility f24332a;
    public static final DescriptorVisibility b;
    public static final DescriptorVisibility c;
    public static final DescriptorVisibility d;
    public static final DescriptorVisibility e;
    public static final DescriptorVisibility f;
    public static final DescriptorVisibility g;
    public static final DescriptorVisibility h;
    public static final DescriptorVisibility i;
    public static final Set j;
    public static final Map k;
    public static final DescriptorVisibility l;
    public static final ReceiverValue m;
    public static final ReceiverValue n;
    public static final ReceiverValue o;
    public static final ModuleVisibilityHelper p;
    public static final HashMap q;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$1, reason: invalid class name */
    public static class AnonymousClass1 extends DelegatedDescriptorVisibility {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            }
            if (DescriptorUtils.s(declarationDescriptorWithVisibility) && DescriptorUtils.f(declarationDescriptor) != SourceFile.f24344a) {
                return DescriptorVisibilities.d(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ((ConstructorDescriptor) declarationDescriptorWithVisibility).e();
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.e();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.l(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && declarationDescriptorWithVisibility.d().equals(((PackageFragmentDescriptor) declarationDescriptor).d()) && DescriptorUtils.d(declarationDescriptor).equals(DescriptorUtils.d(declarationDescriptorWithVisibility));
                }
                declarationDescriptor = declarationDescriptor.e();
            }
            return false;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$10, reason: invalid class name */
    public static class AnonymousClass10 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$11, reason: invalid class name */
    public static class AnonymousClass11 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$12, reason: invalid class name */
    public static class AnonymousClass12 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$2, reason: invalid class name */
    public static class AnonymousClass2 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            DeclarationDescriptor declarationDescriptorI;
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (!DescriptorVisibilities.f24332a.c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                return false;
            }
            if (receiverValue == DescriptorVisibilities.n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.m || (declarationDescriptorI = DescriptorUtils.i(declarationDescriptorWithVisibility, ClassDescriptor.class, true)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                return false;
            }
            return ((ThisClassReceiver) receiverValue).l().a().equals(declarationDescriptorI.a());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$3, reason: invalid class name */
    public static class AnonymousClass3 extends DelegatedDescriptorVisibility {
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.a(r1) == false) goto L49;
         */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r6, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility r7, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8) {
            /*
                r5 = this;
                r0 = 1
                if (r8 == 0) goto L99
                java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> r1 = kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r7, r1, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
                r3 = 0
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r8, r1, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r8
                if (r8 != 0) goto L15
                goto L49
            L15:
                if (r2 == 0) goto L34
                boolean r4 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.l(r2)
                if (r4 == 0) goto L34
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r2, r1, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
                if (r2 == 0) goto L34
                kotlin.reflect.jvm.internal.impl.types.SimpleType r4 = r8.t()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = r2.a()
                boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.r(r4, r2)
                if (r2 == 0) goto L34
                goto L8f
            L34:
                boolean r2 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r2 == 0) goto L40
                r2 = r7
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.t(r2)
                goto L41
            L40:
                r2 = r7
            L41:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.i(r2, r1, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r1
                if (r1 != 0) goto L4a
            L49:
                return r3
            L4a:
                kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r8.t()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = r1.a()
                boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.r(r3, r1)
                if (r1 == 0) goto L90
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r1 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.o
                if (r6 != r1) goto L5d
                goto L90
            L5d:
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
                if (r1 != 0) goto L62
                goto L8f
            L62:
                boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
                if (r1 == 0) goto L67
                goto L8f
            L67:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r1 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.n
                if (r6 != r1) goto L6c
                goto L8f
            L6c:
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue r1 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.m
                if (r6 == r1) goto L90
                if (r6 != 0) goto L73
                goto L90
            L73:
                boolean r1 = r6 instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue
                if (r1 == 0) goto L7f
                r1 = r6
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) r1
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.b()
                goto L83
            L7f:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r6.getType()
            L83:
                boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.r(r1, r8)
                if (r2 != 0) goto L8f
                boolean r1 = kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.a(r1)
                if (r1 == 0) goto L90
            L8f:
                return r0
            L90:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r8 = r8.e()
                boolean r6 = r5.c(r6, r7, r8)
                return r6
            L99:
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r7 = 0
                r8 = 2
                r0 = 1
                java.lang.String r1 = "from"
                r6[r7] = r1
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3"
                r6[r0] = r7
                java.lang.String r7 = "isVisible"
                r6[r8] = r7
                java.lang.String r7 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r6 = java.lang.String.format(r7, r6)
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r7.<init>(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.AnonymousClass3.c(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor):boolean");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$4, reason: invalid class name */
    public static class AnonymousClass4 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!DescriptorUtils.d(declarationDescriptor).B(DescriptorUtils.d(declarationDescriptorWithVisibility))) {
                return false;
            }
            DescriptorVisibilities.p.a(declarationDescriptorWithVisibility, declarationDescriptor);
            return true;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$5, reason: invalid class name */
    public static class AnonymousClass5 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$6, reason: invalid class name */
    public static class AnonymousClass6 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$7, reason: invalid class name */
    public static class AnonymousClass7 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$8, reason: invalid class name */
    public static class AnonymousClass8 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$9, reason: invalid class name */
    public static class AnonymousClass9 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public final boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(Visibilities.Private.c);
        f24332a = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(Visibilities.PrivateToThis.c);
        b = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(Visibilities.Protected.c);
        c = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(Visibilities.Internal.c);
        d = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(Visibilities.Public.c);
        e = anonymousClass5;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(Visibilities.Local.c);
        f = anonymousClass6;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(Visibilities.Inherited.c);
        g = anonymousClass7;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(Visibilities.InvisibleFake.c);
        h = anonymousClass8;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(Visibilities.Unknown.c);
        i = anonymousClass9;
        j = Collections.unmodifiableSet(ArraysKt.r0(new DescriptorVisibility[]{anonymousClass1, anonymousClass2, anonymousClass4, anonymousClass6}));
        HashMap map = new HashMap(6);
        map.put(anonymousClass2, 0);
        map.put(anonymousClass1, 0);
        map.put(anonymousClass4, 1);
        map.put(anonymousClass3, 1);
        map.put(anonymousClass5, 2);
        k = Collections.unmodifiableMap(map);
        l = anonymousClass5;
        m = new AnonymousClass10();
        n = new AnonymousClass11();
        o = new AnonymousClass12();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        p = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.f24643a;
        q = new HashMap();
        f(anonymousClass1);
        f(anonymousClass2);
        f(anonymousClass3);
        f(anonymousClass4);
        f(anonymousClass5);
        f(anonymousClass6);
        f(anonymousClass7);
        f(anonymousClass8);
        f(anonymousClass9);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.a(int):void");
    }

    public static Integer b(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            a(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            a(13);
            throw null;
        }
        Integer numA = descriptorVisibility.a().a(descriptorVisibility2.a());
        if (numA != null) {
            return numA;
        }
        Integer numA2 = descriptorVisibility2.a().a(descriptorVisibility.a());
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityC;
        if (declarationDescriptorWithVisibility == null) {
            a(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.a(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != f; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.i(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class, true)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().c(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityC = c(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).F(), declarationDescriptor)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityC;
    }

    public static boolean d(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        SourceFile sourceFileF = DescriptorUtils.f(declarationDescriptor);
        if (sourceFileF != SourceFile.f24344a) {
            return sourceFileF.equals(DescriptorUtils.f(declarationDescriptorWithVisibility));
        }
        return false;
    }

    public static boolean e(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == f24332a || descriptorVisibility == b;
        }
        a(14);
        throw null;
    }

    public static void f(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        q.put(delegatedDescriptorVisibility.f24331a, delegatedDescriptorVisibility);
    }

    public static DescriptorVisibility g(Visibility visibility) {
        if (visibility == null) {
            a(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) q.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
