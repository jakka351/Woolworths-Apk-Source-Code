package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PossiblyInnerType {

    /* renamed from: a, reason: collision with root package name */
    public final ClassifierDescriptorWithTypeParameters f24341a;
    public final List b;
    public final PossiblyInnerType c;

    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List arguments, PossiblyInnerType possiblyInnerType) {
        Intrinsics.h(classifierDescriptor, "classifierDescriptor");
        Intrinsics.h(arguments, "arguments");
        this.f24341a = classifierDescriptor;
        this.b = arguments;
        this.c = possiblyInnerType;
    }

    public final List a() {
        return this.b;
    }

    public final ClassifierDescriptorWithTypeParameters b() {
        return this.f24341a;
    }

    public final PossiblyInnerType c() {
        return this.c;
    }
}
