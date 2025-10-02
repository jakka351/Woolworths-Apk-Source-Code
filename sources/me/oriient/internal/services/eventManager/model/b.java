package me.oriient.internal.services.eventManager.model;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25462a = new b();

    public b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SealedClassSerializer("me.oriient.internal.services.eventManager.model.IncomingMessage", reflectionFactory.b(IncomingMessage.class), new KClass[]{reflectionFactory.b(AcknowledgmentMessage.class), reflectionFactory.b(ErrorMessage.class), reflectionFactory.b(EventMessage.class)}, new KSerializer[]{AcknowledgmentMessage$$serializer.INSTANCE, ErrorMessage$$serializer.INSTANCE, EventMessage$$serializer.INSTANCE}, new Annotation[0]);
    }
}
