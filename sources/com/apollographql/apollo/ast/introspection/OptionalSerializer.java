package com.apollographql.apollo.ast.introspection;

import com.apollographql.apollo.ast.introspection.Optional;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/OptionalSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/Optional;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OptionalSerializer<T> implements KSerializer<Optional<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f13581a;
    public final SerialDescriptor b;

    public OptionalSerializer(KSerializer kSerializer) {
        this.f13581a = kSerializer;
        this.b = kSerializer.getB();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Optional.Companion companion = Optional.INSTANCE;
        Object objDeserialize = this.f13581a.deserialize(decoder);
        companion.getClass();
        return new Optional.Present(objDeserialize);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor, reason: from getter */
    public final SerialDescriptor getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) throws Exception {
        Optional value = (Optional) obj;
        Intrinsics.h(value, "value");
        if (!(value instanceof Optional.Present)) {
            throw new Exception("Optional has no value");
        }
        this.f13581a.serialize(encoder, ((Optional.Present) value).f13580a);
    }
}
