package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends ObservableProperty<Object> {
    public final /* synthetic */ DescriptorRendererOptionsImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.b = descriptorRendererOptionsImpl;
    }

    @Override // kotlin.properties.ObservableProperty
    public final boolean beforeChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.h(property, "property");
        if (this.b.f24524a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
