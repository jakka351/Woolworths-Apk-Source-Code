package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes.dex */
public final class ProtoEnumFlagsUtilsKt {

    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24584a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f24584a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr3;
        }
    }

    public static final DelegatedDescriptorVisibility a(ProtoBuf.Visibility visibility) {
        DescriptorVisibility INTERNAL;
        switch (visibility == null ? -1 : WhenMappings.b[visibility.ordinal()]) {
            case 1:
                INTERNAL = DescriptorVisibilities.d;
                Intrinsics.g(INTERNAL, "INTERNAL");
                break;
            case 2:
                INTERNAL = DescriptorVisibilities.f24332a;
                Intrinsics.g(INTERNAL, "PRIVATE");
                break;
            case 3:
                INTERNAL = DescriptorVisibilities.b;
                Intrinsics.g(INTERNAL, "PRIVATE_TO_THIS");
                break;
            case 4:
                INTERNAL = DescriptorVisibilities.c;
                Intrinsics.g(INTERNAL, "PROTECTED");
                break;
            case 5:
                INTERNAL = DescriptorVisibilities.e;
                Intrinsics.g(INTERNAL, "PUBLIC");
                break;
            case 6:
                INTERNAL = DescriptorVisibilities.f;
                Intrinsics.g(INTERNAL, "LOCAL");
                break;
            default:
                INTERNAL = DescriptorVisibilities.f24332a;
                Intrinsics.g(INTERNAL, "PRIVATE");
                break;
        }
        return (DelegatedDescriptorVisibility) INTERNAL;
    }

    public static final CallableMemberDescriptor.Kind b(ProtoBuf.MemberKind memberKind) {
        int i = memberKind == null ? -1 : WhenMappings.f24584a[memberKind.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return CallableMemberDescriptor.Kind.e;
            }
            if (i == 3) {
                return CallableMemberDescriptor.Kind.f;
            }
            if (i == 4) {
                return CallableMemberDescriptor.Kind.g;
            }
        }
        return CallableMemberDescriptor.Kind.d;
    }
}
