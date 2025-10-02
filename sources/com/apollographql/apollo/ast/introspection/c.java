package com.apollographql.apollo.ast.introspection;

import com.apollographql.apollo.ast.introspection.WTypeFull;
import com.apollographql.apollo.ast.introspection.WTypeRef;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                WTypeFull.Companion companion = WTypeFull.Companion;
                return EnumsKt.b(WTypeKind.values(), "com.apollographql.apollo.ast.introspection.WTypeKind");
            case 1:
                WTypeFull.Companion companion2 = WTypeFull.Companion;
                return new ArrayListSerializer(WField$$serializer.f13609a);
            case 2:
                WTypeFull.Companion companion3 = WTypeFull.Companion;
                return new ArrayListSerializer(WTypeRef$$serializer.f13617a);
            case 3:
                WTypeFull.Companion companion4 = WTypeFull.Companion;
                return new ArrayListSerializer(WTypeRef$$serializer.f13617a);
            case 4:
                WTypeFull.Companion companion5 = WTypeFull.Companion;
                return new ArrayListSerializer(WEnumValue$$serializer.f13607a);
            case 5:
                WTypeFull.Companion companion6 = WTypeFull.Companion;
                return new ArrayListSerializer(WInputValue$$serializer.f13611a);
            default:
                WTypeRef.Companion companion7 = WTypeRef.INSTANCE;
                return EnumsKt.b(WTypeKind.values(), "com.apollographql.apollo.ast.introspection.WTypeKind");
        }
    }
}
