package com.apollographql.apollo.ast.introspection;

import com.apollographql.apollo.ast.introspection.Optional;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RSchema;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
final class RSchema {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* renamed from: a, reason: collision with root package name */
    public final Optional f13594a;
    public final List b;
    public final RTypeRoot c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RSchema$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/RSchema;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RSchema> serializer() {
            return RSchema$$serializer.f13595a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new b(12)), LazyKt.a(lazyThreadSafetyMode, new b(13)), null, LazyKt.a(lazyThreadSafetyMode, new b(14)), LazyKt.a(lazyThreadSafetyMode, new b(15)), LazyKt.a(lazyThreadSafetyMode, new b(16))};
    }

    public /* synthetic */ RSchema(int i, Optional optional, List list, RTypeRoot rTypeRoot, Optional optional2, Optional optional3, Optional optional4) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.a(i, 6, RSchema$$serializer.f13595a.getDescriptor());
            throw null;
        }
        int i2 = i & 1;
        Optional.Absent absent = Optional.Absent.f13579a;
        if (i2 == 0) {
            Optional.INSTANCE.getClass();
            this.f13594a = absent;
        } else {
            this.f13594a = optional;
        }
        this.b = list;
        this.c = rTypeRoot;
        if ((i & 8) == 0) {
            Optional.INSTANCE.getClass();
            this.d = absent;
        } else {
            this.d = optional2;
        }
        if ((i & 16) == 0) {
            Optional.INSTANCE.getClass();
            this.e = absent;
        } else {
            this.e = optional3;
        }
        if ((i & 32) != 0) {
            this.f = optional4;
        } else {
            Optional.INSTANCE.getClass();
            this.f = absent;
        }
    }
}
