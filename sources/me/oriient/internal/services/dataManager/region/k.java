package me.oriient.internal.services.dataManager.region;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import me.oriient.internal.services.dataManager.region.RegionShape;

/* loaded from: classes7.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f25400a = new k();

    public k() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SealedClassSerializer("me.oriient.internal.services.dataManager.region.RegionShape", reflectionFactory.b(RegionShape.class), new KClass[]{reflectionFactory.b(RegionShape.Circle.class), reflectionFactory.b(RegionShape.Polygon.class), reflectionFactory.b(RegionShape.Rectangle.class)}, new KSerializer[]{RegionShape$Circle$$serializer.INSTANCE, RegionShape$Polygon$$serializer.INSTANCE, RegionShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]);
    }
}
