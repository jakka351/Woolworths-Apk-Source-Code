package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes7.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {
    public final LazyJavaPackageFragment b;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.b = lazyJavaPackageFragment;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.b;
        sb.append(lazyJavaPackageFragment);
        sb.append(": ");
        sb.append(((Map) StorageKt.a(lazyJavaPackageFragment.m, LazyJavaPackageFragment.r[0])).keySet());
        return sb.toString();
    }
}
