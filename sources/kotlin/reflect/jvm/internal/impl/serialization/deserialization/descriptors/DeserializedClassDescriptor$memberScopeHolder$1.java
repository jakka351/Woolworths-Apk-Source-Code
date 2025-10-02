package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReferenceImpl implements Function1<KotlinTypeRefiner, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(KotlinTypeRefiner p0) {
        Intrinsics.h(p0, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p0);
    }
}
