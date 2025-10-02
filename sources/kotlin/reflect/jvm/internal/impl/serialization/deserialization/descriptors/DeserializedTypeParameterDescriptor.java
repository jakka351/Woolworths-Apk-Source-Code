package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final DeserializationContext n;
    public final ProtoBuf.TypeParameter o;
    public final DeserializedAnnotations p;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(DeserializationContext deserializationContext, ProtoBuf.TypeParameter typeParameter, int i) {
        Variance variance;
        DeserializationComponents deserializationComponents = deserializationContext.f24572a;
        LockBasedStorageManager lockBasedStorageManager = deserializationComponents.f24570a;
        DeclarationDescriptor declarationDescriptor = deserializationContext.c;
        Name nameB = NameResolverUtilKt.b(deserializationContext.b, typeParameter.h);
        ProtoBuf.TypeParameter.Variance variance2 = typeParameter.j;
        Intrinsics.g(variance2, "getVariance(...)");
        int iOrdinal = variance2.ordinal();
        if (iOrdinal == 0) {
            variance = Variance.g;
        } else if (iOrdinal == 1) {
            variance = Variance.h;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            variance = Variance.f;
        }
        Variance variance3 = variance;
        super(lockBasedStorageManager, declarationDescriptor, Annotations.Companion.f24350a, nameB, variance3, typeParameter.i, i, SupertypeLoopChecker.EMPTY.f24345a);
        this.n = deserializationContext;
        this.o = typeParameter;
        this.p = new DeserializedAnnotations(deserializationComponents.f24570a, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$$Lambda$0
            public final DeserializedTypeParameterDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor = this.d;
                DeserializationContext deserializationContext2 = deserializedTypeParameterDescriptor.n;
                return CollectionsKt.G0(deserializationContext2.f24572a.e.d(deserializedTypeParameterDescriptor.o, deserializationContext2.b));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void I0(KotlinType type) {
        Intrinsics.h(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List J0() {
        DeserializationContext deserializationContext = this.n;
        TypeTable typeTable = deserializationContext.d;
        ProtoBuf.TypeParameter typeParameter = this.o;
        Intrinsics.h(typeParameter, "<this>");
        List list = typeParameter.k;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List list2 = typeParameter.l;
            Intrinsics.g(list2, "getUpperBoundIdList(...)");
            List<Integer> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (Integer num : list3) {
                Intrinsics.e(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return CollectionsKt.Q(DescriptorUtilsKt.e(this).n());
        }
        List list4 = list;
        TypeDeserializer typeDeserializer = deserializationContext.h;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.g((ProtoBuf.Type) it.next()));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.p;
    }
}
