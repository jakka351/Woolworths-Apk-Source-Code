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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RField;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
final class RField {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* renamed from: a, reason: collision with root package name */
    public final String f13590a;
    public final Optional b;
    public final Optional c;
    public final RTypeRef d;
    public final Optional e;
    public final Optional f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RField$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/RField;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RField> serializer() {
            return RField$$serializer.f13591a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        g = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new b(6)), LazyKt.a(lazyThreadSafetyMode, new b(7)), null, LazyKt.a(lazyThreadSafetyMode, new b(8)), LazyKt.a(lazyThreadSafetyMode, new b(9))};
    }

    public /* synthetic */ RField(int i, String str, Optional optional, Optional optional2, RTypeRef rTypeRef, Optional optional3, Optional optional4) {
        if (9 != (i & 9)) {
            PluginExceptionsKt.a(i, 9, RField$$serializer.f13591a.getB());
            throw null;
        }
        this.f13590a = str;
        int i2 = i & 2;
        Optional.Absent absent = Optional.Absent.f13579a;
        if (i2 == 0) {
            Optional.INSTANCE.getClass();
            this.b = absent;
        } else {
            this.b = optional;
        }
        if ((i & 4) == 0) {
            Optional.INSTANCE.getClass();
            this.c = absent;
        } else {
            this.c = optional2;
        }
        this.d = rTypeRef;
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
