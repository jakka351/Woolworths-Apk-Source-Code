package com.apollographql.apollo.ast.introspection;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WInputValue;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class WInputValue {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f13610a;
    public final String b;
    public final WTypeRef c;
    public final String d;
    public final boolean e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WInputValue$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/WInputValue;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<WInputValue> serializer() {
            return WInputValue$$serializer.f13611a;
        }
    }

    public /* synthetic */ WInputValue(int i, String str, String str2, WTypeRef wTypeRef, String str3, boolean z, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, WInputValue$$serializer.f13611a.getDescriptor());
            throw null;
        }
        this.f13610a = str;
        this.b = str2;
        this.c = wTypeRef;
        this.d = str3;
        this.e = z;
        this.f = str4;
    }
}
