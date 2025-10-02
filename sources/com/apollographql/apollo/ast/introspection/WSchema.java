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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WSchema;", "", "Companion", "$serializer", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class WSchema {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* renamed from: a, reason: collision with root package name */
    public final String f13612a;
    public final List b;
    public final WTypeRoot c;
    public final WTypeRoot d;
    public final WTypeRoot e;
    public final List f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/ast/introspection/WSchema$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/apollographql/apollo/ast/introspection/WSchema;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apollo-ast"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<WSchema> serializer() {
            return WSchema$$serializer.f13613a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        g = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new b(28)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new b(29))};
    }

    public /* synthetic */ WSchema(int i, String str, List list, WTypeRoot wTypeRoot, WTypeRoot wTypeRoot2, WTypeRoot wTypeRoot3, List list2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.a(i, 63, WSchema$$serializer.f13613a.getDescriptor());
            throw null;
        }
        this.f13612a = str;
        this.b = list;
        this.c = wTypeRoot;
        this.d = wTypeRoot2;
        this.e = wTypeRoot3;
        this.f = list2;
    }
}
