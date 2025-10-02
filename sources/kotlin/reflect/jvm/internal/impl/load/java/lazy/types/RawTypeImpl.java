package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.h(lowerBound, "lowerBound");
        Intrinsics.h(upperBound, "upperBound");
        KotlinTypeChecker.f24623a.d(lowerBound, upperBound);
    }

    public static final ArrayList V0(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        List listH0 = kotlinType.H0();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRendererImpl.f0((TypeProjection) it.next()));
        }
        return arrayList;
    }

    public static final String W0(String str, String str2) {
        if (!StringsKt.p(str, '<')) {
            return str;
        }
        return StringsKt.c0(str, '<') + '<' + str2 + '>' + StringsKt.a0('>', str, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(boolean z) {
        return new RawTypeImpl(this.e.N0(z), this.f.N0(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new RawTypeImpl(this.e.P0(newAttributes), this.f.P0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType Q0() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String T0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        SimpleType simpleType = this.e;
        String strZ = descriptorRendererImpl.Z(simpleType);
        SimpleType simpleType2 = this.f;
        String strZ2 = descriptorRendererImpl.Z(simpleType2);
        if (descriptorRendererImpl2.d.q()) {
            return "raw (" + strZ + ".." + strZ2 + ')';
        }
        if (simpleType2.H0().isEmpty()) {
            return descriptorRendererImpl.G(strZ, strZ2, TypeUtilsKt.h(this));
        }
        ArrayList arrayListV0 = V0(descriptorRendererImpl, simpleType);
        ArrayList arrayListV02 = V0(descriptorRendererImpl, simpleType2);
        String strM = CollectionsKt.M(arrayListV0, ", ", null, null, RawTypeImpl$$Lambda$0.d, 30);
        ArrayList arrayListQ0 = CollectionsKt.Q0(arrayListV0, arrayListV02);
        if (arrayListQ0.isEmpty()) {
            strZ2 = W0(strZ2, strM);
        } else {
            Iterator it = arrayListQ0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.d;
                String str2 = (String) pair.e;
                if (!Intrinsics.c(str, StringsKt.L("out ", str2)) && !str2.equals("*")) {
                    break;
                }
            }
            strZ2 = W0(strZ2, strM);
        }
        String strW0 = W0(strZ, strM);
        return Intrinsics.c(strW0, strZ2) ? strW0 : descriptorRendererImpl.G(strW0, strZ2, TypeUtilsKt.h(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final FlexibleType L0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new RawTypeImpl((SimpleType) kotlinTypeRefiner.a(this.e), (SimpleType) kotlinTypeRefiner.a(this.f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        ClassifierDescriptor classifierDescriptorC = J0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            MemberScope memberScopeU0 = classDescriptor.u0(new RawSubstitution());
            Intrinsics.g(memberScopeU0, "getMemberScope(...)");
            return memberScopeU0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + J0().c()).toString());
    }
}
