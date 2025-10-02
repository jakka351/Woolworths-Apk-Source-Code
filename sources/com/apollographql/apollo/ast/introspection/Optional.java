package com.apollographql.apollo.ast.introspection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u0000 \u0003*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/Optional;", "V", "", "Companion", "Present", "Absent", "Lcom/apollographql/apollo/ast/introspection/Optional$Absent;", "Lcom/apollographql/apollo/ast/introspection/Optional$Present;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = OptionalSerializer.class)
/* loaded from: classes4.dex */
abstract class Optional<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/Optional$Absent;", "Lcom/apollographql/apollo/ast/introspection/Optional;", "", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Absent extends Optional {

        /* renamed from: a, reason: collision with root package name */
        public static final Absent f13579a = new Absent();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/Optional$Companion;", "", "V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lcom/apollographql/apollo/ast/introspection/Optional;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final <V> KSerializer<Optional<V>> serializer(@NotNull KSerializer<V> typeSerial0) {
            Intrinsics.h(typeSerial0, "typeSerial0");
            return new OptionalSerializer(typeSerial0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/Optional$Present;", "V", "Lcom/apollographql/apollo/ast/introspection/Optional;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Present<V> extends Optional<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13580a;

        public Present(Object obj) {
            this.f13580a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Present) && Intrinsics.c(this.f13580a, ((Present) obj).f13580a);
        }

        public final int hashCode() {
            Object obj = this.f13580a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return android.support.v4.media.session.a.s(new StringBuilder("Present(value="), this.f13580a, ')');
        }
    }
}
