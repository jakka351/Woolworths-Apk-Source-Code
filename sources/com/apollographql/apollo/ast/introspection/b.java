package com.apollographql.apollo.ast.introspection;

import com.apollographql.apollo.ast.introspection.RDirective;
import com.apollographql.apollo.ast.introspection.REnumValue;
import com.apollographql.apollo.ast.introspection.RField;
import com.apollographql.apollo.ast.introspection.RInputValue;
import com.apollographql.apollo.ast.introspection.RSchema;
import com.apollographql.apollo.ast.introspection.RTypeFull;
import com.apollographql.apollo.ast.introspection.RTypeRef;
import com.apollographql.apollo.ast.introspection.WDirective;
import com.apollographql.apollo.ast.introspection.WField;
import com.apollographql.apollo.ast.introspection.WSchema;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                RDirective.Companion companion = RDirective.INSTANCE;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 1:
                RDirective.Companion companion2 = RDirective.INSTANCE;
                return Optional.INSTANCE.serializer(new ArrayListSerializer(StringSerializer.f24821a));
            case 2:
                RDirective.Companion companion3 = RDirective.INSTANCE;
                return Optional.INSTANCE.serializer(new ArrayListSerializer(RInputValue$$serializer.f13593a));
            case 3:
                REnumValue.Companion companion4 = REnumValue.Companion;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 4:
                REnumValue.Companion companion5 = REnumValue.Companion;
                return Optional.INSTANCE.serializer(BooleanSerializer.f24779a);
            case 5:
                REnumValue.Companion companion6 = REnumValue.Companion;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 6:
                RField.Companion companion7 = RField.Companion;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 7:
                RField.Companion companion8 = RField.Companion;
                return Optional.INSTANCE.serializer(new ArrayListSerializer(RInputValue$$serializer.f13593a));
            case 8:
                RField.Companion companion9 = RField.Companion;
                return Optional.INSTANCE.serializer(BooleanSerializer.f24779a);
            case 9:
                RField.Companion companion10 = RField.Companion;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 10:
                RInputValue.Companion companion11 = RInputValue.Companion;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 11:
                RInputValue.Companion companion12 = RInputValue.Companion;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 12:
                RSchema.Companion companion13 = RSchema.INSTANCE;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 13:
                RSchema.Companion companion14 = RSchema.INSTANCE;
                return new ArrayListSerializer(RTypeFull$$serializer.f13597a);
            case 14:
                RSchema.Companion companion15 = RSchema.INSTANCE;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(RTypeRoot$$serializer.f13601a));
            case 15:
                RSchema.Companion companion16 = RSchema.INSTANCE;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(RTypeRoot$$serializer.f13601a));
            case 16:
                RSchema.Companion companion17 = RSchema.INSTANCE;
                return Optional.INSTANCE.serializer(new ArrayListSerializer(RDirective$$serializer.f13585a));
            case 17:
                RTypeFull.Companion companion18 = RTypeFull.INSTANCE;
                return EnumsKt.b(RTypeKind.values(), "com.apollographql.apollo.ast.introspection.RTypeKind");
            case 18:
                RTypeFull.Companion companion19 = RTypeFull.INSTANCE;
                return Optional.INSTANCE.serializer(BuiltinSerializersKt.d(StringSerializer.f24821a));
            case 19:
                RTypeFull.Companion companion20 = RTypeFull.INSTANCE;
                return new ArrayListSerializer(RField$$serializer.f13591a);
            case 20:
                RTypeFull.Companion companion21 = RTypeFull.INSTANCE;
                return new ArrayListSerializer(RTypeRef$$serializer.f13599a);
            case 21:
                RTypeFull.Companion companion22 = RTypeFull.INSTANCE;
                return new ArrayListSerializer(RTypeRef$$serializer.f13599a);
            case 22:
                RTypeFull.Companion companion23 = RTypeFull.INSTANCE;
                return new ArrayListSerializer(REnumValue$$serializer.f13587a);
            case 23:
                RTypeFull.Companion companion24 = RTypeFull.INSTANCE;
                return new ArrayListSerializer(RInputValue$$serializer.f13593a);
            case 24:
                RTypeRef.Companion companion25 = RTypeRef.Companion;
                return EnumsKt.b(RTypeKind.values(), "com.apollographql.apollo.ast.introspection.RTypeKind");
            case 25:
                WDirective.Companion companion26 = WDirective.Companion;
                return new ArrayListSerializer(StringSerializer.f24821a);
            case 26:
                WDirective.Companion companion27 = WDirective.Companion;
                return new ArrayListSerializer(WInputValue$$serializer.f13611a);
            case 27:
                WField.Companion companion28 = WField.Companion;
                return new ArrayListSerializer(WInputValue$$serializer.f13611a);
            case 28:
                WSchema.Companion companion29 = WSchema.INSTANCE;
                return new ArrayListSerializer(WTypeFull$$serializer.f13615a);
            default:
                WSchema.Companion companion30 = WSchema.INSTANCE;
                return new ArrayListSerializer(WDirective$$serializer.f13605a);
        }
    }
}
