package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt$elementNames$1$1;
import kotlinx.serialization.descriptors.SerialDescriptorKt$special$$inlined$Iterable$2;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    public final SerialKind.ENUM l;
    public final Lazy m;

    public EnumDescriptor(String str, int i) {
        super(str, null, i);
        this.l = SerialKind.ENUM.f24773a;
        this.m = LazyKt.b(new au.com.woolworths.feature.shop.bundles.ui.b(str, i, 1, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return ((SerialDescriptor[]) this.m.getD())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getB() == SerialKind.ENUM.f24773a && this.f24814a.equals(serialDescriptor.getB()) && Intrinsics.c(Platform_commonKt.a(this), Platform_commonKt.a(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public final SerialKind getB() {
        return this.l;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.f24814a.hashCode();
        Iterator<String> it = new SerialDescriptorKt$special$$inlined$Iterable$2(this).iterator();
        int iHashCode2 = 1;
        while (true) {
            SerialDescriptorKt$elementNames$1$1 serialDescriptorKt$elementNames$1$1 = (SerialDescriptorKt$elementNames$1$1) it;
            if (!serialDescriptorKt$elementNames$1$1.hasNext()) {
                return (iHashCode * 31) + iHashCode2;
            }
            int i = iHashCode2 * 31;
            String str = (String) serialDescriptorKt$elementNames$1$1.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return CollectionsKt.M(new SerialDescriptorKt$special$$inlined$Iterable$2(this), ", ", this.f24814a.concat("("), ")", null, 56);
    }
}
