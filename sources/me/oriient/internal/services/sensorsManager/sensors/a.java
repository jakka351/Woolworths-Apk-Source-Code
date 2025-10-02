package me.oriient.internal.services.sensorsManager.sensors;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25591a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SealedClassSerializer("me.oriient.internal.services.sensorsManager.sensors.SensorReading", reflectionFactory.b(SensorReading.class), new KClass[]{reflectionFactory.b(SensorReading.AccelerometerReading.class), reflectionFactory.b(SensorReading.GameRotationVectorReading.class), reflectionFactory.b(SensorReading.GyroscopeReading.class), reflectionFactory.b(SensorReading.GyroscopeUncalibratedReading.class), reflectionFactory.b(SensorReading.LocationReading.class), reflectionFactory.b(SensorReading.MagneticFieldReading.class), reflectionFactory.b(SensorReading.MagneticFieldUncalibratedReading.class), reflectionFactory.b(SensorReading.PressureReading.class)}, new KSerializer[]{SensorReading$AccelerometerReading$$serializer.INSTANCE, SensorReading$GameRotationVectorReading$$serializer.INSTANCE, SensorReading$GyroscopeReading$$serializer.INSTANCE, SensorReading$GyroscopeUncalibratedReading$$serializer.INSTANCE, SensorReading$LocationReading$$serializer.INSTANCE, SensorReading$MagneticFieldReading$$serializer.INSTANCE, SensorReading$MagneticFieldUncalibratedReading$$serializer.INSTANCE, SensorReading$PressureReading$$serializer.INSTANCE}, new Annotation[0]);
    }
}
