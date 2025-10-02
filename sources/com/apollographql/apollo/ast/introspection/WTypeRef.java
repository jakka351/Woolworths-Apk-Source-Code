package com.apollographql.apollo.ast.introspection;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WTypeRef;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class WTypeRef {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.d, new c(6)), null, null};

    /* renamed from: a, reason: collision with root package name */
    public final WTypeKind f13616a;
    public final String b;
    public final WTypeRef c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WTypeRef$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/WTypeRef;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<WTypeRef> serializer() {
            return WTypeRef$$serializer.f13617a;
        }
    }

    public /* synthetic */ WTypeRef(int i, WTypeKind wTypeKind, String str, WTypeRef wTypeRef) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, WTypeRef$$serializer.f13617a.getDescriptor());
            throw null;
        }
        this.f13616a = wTypeKind;
        this.b = str;
        this.c = wTypeRef;
    }
}
