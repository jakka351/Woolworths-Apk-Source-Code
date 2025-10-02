package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaFlexibleTypeDeserializer f24470a = new JavaFlexibleTypeDeserializer();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    public final KotlinType a(ProtoBuf.Type proto, String flexibleId, SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(flexibleId, "flexibleId");
        Intrinsics.h(lowerBound, "lowerBound");
        Intrinsics.h(upperBound, "upperBound");
        return !flexibleId.equals("kotlin.jvm.PlatformType") ? ErrorUtils.c(ErrorTypeKind.p, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.i(JvmProtoBuf.g) ? new RawTypeImpl(lowerBound, upperBound) : KotlinTypeFactory.a(lowerBound, upperBound);
    }
}
