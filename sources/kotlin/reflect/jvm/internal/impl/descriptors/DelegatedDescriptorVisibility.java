package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* renamed from: a, reason: collision with root package name */
    public final Visibility f24331a;

    public DelegatedDescriptorVisibility(Visibility delegate) {
        Intrinsics.h(delegate, "delegate");
        this.f24331a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final Visibility a() {
        return this.f24331a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final String b() {
        return this.f24331a.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final DescriptorVisibility d() {
        return DescriptorVisibilities.g(this.f24331a.c());
    }
}
