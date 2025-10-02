package com.apollographql.apollo.ast.introspection;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WTypeFull;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class WTypeFull {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;

    /* renamed from: a, reason: collision with root package name */
    public final WTypeKind f13614a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final String i;
    public final Boolean j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WTypeFull$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/WTypeFull;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<WTypeFull> serializer() {
            return WTypeFull$$serializer.f13615a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        k = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new c(0)), null, null, LazyKt.a(lazyThreadSafetyMode, new c(1)), LazyKt.a(lazyThreadSafetyMode, new c(2)), LazyKt.a(lazyThreadSafetyMode, new c(3)), LazyKt.a(lazyThreadSafetyMode, new c(4)), LazyKt.a(lazyThreadSafetyMode, new c(5)), null, null};
    }

    public /* synthetic */ WTypeFull(int i, WTypeKind wTypeKind, String str, String str2, List list, List list2, List list3, List list4, List list5, String str3, Boolean bool) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.a(i, 1023, WTypeFull$$serializer.f13615a.getB());
            throw null;
        }
        this.f13614a = wTypeKind;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
        this.h = list5;
        this.i = str3;
        this.j = bool;
    }
}
