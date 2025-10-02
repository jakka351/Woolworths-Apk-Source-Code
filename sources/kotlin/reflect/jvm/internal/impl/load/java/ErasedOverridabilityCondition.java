package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24395a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24395a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.h(superDescriptor, "superDescriptor");
        Intrinsics.h(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            if (javaMethodDescriptor.getTypeParameters().isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoI = OverridingUtil.i(superDescriptor, subDescriptor);
                if ((overrideCompatibilityInfoI != null ? overrideCompatibilityInfoI.c() : null) == null) {
                    List listH = javaMethodDescriptor.h();
                    Intrinsics.g(listH, "getValueParameters(...)");
                    TransformingSequence transformingSequenceR = SequencesKt.r(CollectionsKt.n(listH), ErasedOverridabilityCondition$$Lambda$0.d);
                    KotlinType kotlinType = javaMethodDescriptor.j;
                    Intrinsics.e(kotlinType);
                    FlatteningSequence flatteningSequenceU = SequencesKt.u(transformingSequenceR, kotlinType);
                    ReceiverParameterDescriptor receiverParameterDescriptor = javaMethodDescriptor.l;
                    Iterator f24664a = SequencesKt.t(flatteningSequenceU, CollectionsKt.S(receiverParameterDescriptor != null ? receiverParameterDescriptor.getType() : null)).getF24664a();
                    while (true) {
                        FlatteningSequence.AnonymousClass1 anonymousClass1 = (FlatteningSequence.AnonymousClass1) f24664a;
                        if (anonymousClass1.hasNext()) {
                            KotlinType kotlinType2 = (KotlinType) anonymousClass1.next();
                            if (!kotlinType2.H0().isEmpty() && !(kotlinType2.M0() instanceof RawTypeImpl)) {
                                break;
                            }
                        } else {
                            CallableDescriptor callableDescriptorBuild = (CallableDescriptor) superDescriptor.b(new RawSubstitution().c());
                            if (callableDescriptorBuild != null) {
                                if (callableDescriptorBuild instanceof SimpleFunctionDescriptor) {
                                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorBuild;
                                    List typeParameters = simpleFunctionDescriptor.getTypeParameters();
                                    Intrinsics.g(typeParameters, "getTypeParameters(...)");
                                    if (!typeParameters.isEmpty()) {
                                        callableDescriptorBuild = simpleFunctionDescriptor.S().n().build();
                                        Intrinsics.e(callableDescriptorBuild);
                                    }
                                }
                                OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.c.n(callableDescriptorBuild, subDescriptor, false).c();
                                Intrinsics.g(resultC, "getResult(...)");
                                if (WhenMappings.f24395a[resultC.ordinal()] == 1) {
                                    return ExternalOverridabilityCondition.Result.d;
                                }
                            }
                        }
                    }
                }
            }
        }
        return ExternalOverridabilityCondition.Result.f;
    }
}
