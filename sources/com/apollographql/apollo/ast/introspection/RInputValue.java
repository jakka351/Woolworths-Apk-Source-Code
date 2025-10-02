package com.apollographql.apollo.ast.introspection;

import com.apollographql.apollo.ast.introspection.Optional;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RInputValue;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
final class RInputValue {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* renamed from: a, reason: collision with root package name */
    public final String f13592a;
    public final Optional b;
    public final RTypeRef c;
    public final Optional d;
    public final boolean e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RInputValue$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/RInputValue;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RInputValue> serializer() {
            return RInputValue$$serializer.f13593a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        g = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new b(10)), null, LazyKt.a(lazyThreadSafetyMode, new b(11)), null, null};
    }

    public /* synthetic */ RInputValue(int i, String str, Optional optional, RTypeRef rTypeRef, Optional optional2, boolean z, String str2) {
        if (5 != (i & 5)) {
            PluginExceptionsKt.a(i, 5, RInputValue$$serializer.f13593a.getB());
            throw null;
        }
        this.f13592a = str;
        int i2 = i & 2;
        Optional.Absent absent = Optional.Absent.f13579a;
        if (i2 == 0) {
            Optional.INSTANCE.getClass();
            this.b = absent;
        } else {
            this.b = optional;
        }
        this.c = rTypeRef;
        if ((i & 8) == 0) {
            Optional.INSTANCE.getClass();
            this.d = absent;
        } else {
            this.d = optional2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }
}
