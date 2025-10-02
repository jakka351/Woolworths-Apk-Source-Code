package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReflectionObjectRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorRendererImpl f24292a = DescriptorRenderer.f24521a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KParameter.Kind kind = KParameter.Kind.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KParameter.Kind kind2 = KParameter.Kind.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(StringBuilder sb, CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorG = UtilKt.g(callableMemberDescriptor);
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = callableMemberDescriptor.e0();
        if (receiverParameterDescriptorG != null) {
            KotlinType type = receiverParameterDescriptorG.getType();
            Intrinsics.g(type, "getType(...)");
            sb.append(e(type));
            sb.append(".");
        }
        boolean z = (receiverParameterDescriptorG == null || receiverParameterDescriptorE0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (receiverParameterDescriptorE0 != null) {
            KotlinType type2 = receiverParameterDescriptorE0.getType();
            Intrinsics.g(type2, "getType(...)");
            sb.append(e(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    public static String b(FunctionDescriptor functionDescriptor) {
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(sb, functionDescriptor);
        Name name = functionDescriptor.getName();
        Intrinsics.g(name, "getName(...)");
        sb.append(f24292a.Q(name, true));
        List listH = functionDescriptor.h();
        Intrinsics.g(listH, "getValueParameters(...)");
        CollectionsKt.L(listH, sb, ", ", "(", ")", ReflectionObjectRenderer$$Lambda$0.d, 48);
        sb.append(": ");
        KotlinType returnType = functionDescriptor.getReturnType();
        Intrinsics.e(returnType);
        sb.append(e(returnType));
        return sb.toString();
    }

    public static String c(FunctionDescriptor functionDescriptor) {
        StringBuilder sb = new StringBuilder();
        a(sb, functionDescriptor);
        List listH = functionDescriptor.h();
        Intrinsics.g(listH, "getValueParameters(...)");
        CollectionsKt.L(listH, sb, ", ", "(", ")", ReflectionObjectRenderer$$Lambda$1.d, 48);
        sb.append(" -> ");
        KotlinType returnType = functionDescriptor.getReturnType();
        Intrinsics.e(returnType);
        sb.append(e(returnType));
        return sb.toString();
    }

    public static String d(PropertyDescriptor propertyDescriptor) {
        StringBuilder sb = new StringBuilder();
        sb.append(propertyDescriptor.C() ? "var " : "val ");
        a(sb, propertyDescriptor);
        Name name = propertyDescriptor.getName();
        Intrinsics.g(name, "getName(...)");
        sb.append(f24292a.Q(name, true));
        sb.append(": ");
        KotlinType type = propertyDescriptor.getType();
        Intrinsics.g(type, "getType(...)");
        sb.append(e(type));
        return sb.toString();
    }

    public static String e(KotlinType type) {
        Intrinsics.h(type, "type");
        return f24292a.Z(type);
    }
}
