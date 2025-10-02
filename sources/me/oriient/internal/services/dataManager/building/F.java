package me.oriient.internal.services.dataManager.building;

import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.PolymorphicSerializer;

/* loaded from: classes7.dex */
public final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final F f25094a = new F();

    public F() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PolymorphicSerializer polymorphicSerializer = new PolymorphicSerializer(Reflection.f24268a.b(ExternalRegionPlacement.class));
        polymorphicSerializer.b = ArraysKt.f(new Annotation[0]);
        return polymorphicSerializer;
    }
}
