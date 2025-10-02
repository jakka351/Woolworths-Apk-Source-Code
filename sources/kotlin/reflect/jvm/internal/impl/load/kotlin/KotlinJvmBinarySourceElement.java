package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.camera.core.impl.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* loaded from: classes.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {
    public final KotlinJvmBinaryClass b;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass kotlinJvmBinaryClass, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this.b = kotlinJvmBinaryClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public final String a() {
        return b.r(new StringBuilder("Class '"), this.b.c().a().f24500a.f24501a, '\'');
    }

    public final String toString() {
        return "KotlinJvmBinarySourceElement: " + this.b;
    }
}
