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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RTypeFull;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
final class RTypeFull {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;

    /* renamed from: a, reason: collision with root package name */
    public final RTypeKind f13596a;
    public final String b;
    public final Optional c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final String i;
    public final Boolean j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/RTypeFull$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/RTypeFull;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RTypeFull> serializer() {
            return RTypeFull$$serializer.f13597a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        k = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new b(17)), null, LazyKt.a(lazyThreadSafetyMode, new b(18)), LazyKt.a(lazyThreadSafetyMode, new b(19)), LazyKt.a(lazyThreadSafetyMode, new b(20)), LazyKt.a(lazyThreadSafetyMode, new b(21)), LazyKt.a(lazyThreadSafetyMode, new b(22)), LazyKt.a(lazyThreadSafetyMode, new b(23)), null, null};
    }

    public /* synthetic */ RTypeFull(int i, RTypeKind rTypeKind, String str, Optional optional, List list, List list2, List list3, List list4, List list5, String str2, Boolean bool) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, RTypeFull$$serializer.f13597a.getDescriptor());
            throw null;
        }
        this.f13596a = rTypeKind;
        this.b = str;
        if ((i & 4) == 0) {
            Optional.INSTANCE.getClass();
            this.c = Optional.Absent.f13579a;
        } else {
            this.c = optional;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
    }

    public final String toString() {
        return this.f13596a + " - " + this.b;
    }
}
