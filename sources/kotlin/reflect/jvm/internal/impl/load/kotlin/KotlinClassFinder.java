package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* loaded from: classes.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    public static abstract class Result {

        /* loaded from: classes7.dex */
        public static final class ClassFileContent extends Result {
        }

        public static final class KotlinClass extends Result {

            /* renamed from: a, reason: collision with root package name */
            public final ReflectKotlinClass f24473a;

            public KotlinClass(ReflectKotlinClass reflectKotlinClass) {
                this.f24473a = reflectKotlinClass;
            }
        }
    }

    Result.KotlinClass a(ClassId classId, MetadataVersion metadataVersion);

    Result.KotlinClass b(JavaClass javaClass, MetadataVersion metadataVersion);
}
