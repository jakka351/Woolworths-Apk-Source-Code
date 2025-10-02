package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {
    public final boolean l;

    public InlineClassDescriptor(String str, InlineClassDescriptorKt$InlinePrimitiveDescriptor$1 inlineClassDescriptorKt$InlinePrimitiveDescriptor$1) {
        super(str, inlineClassDescriptorKt$InlinePrimitiveDescriptor$1, 1);
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f24814a.equals(serialDescriptor.getF24814a())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.l && Arrays.equals((SerialDescriptor[]) this.j.getD(), (SerialDescriptor[]) inlineClassDescriptor.j.getD())) {
                    int c = serialDescriptor.getC();
                    int i = this.c;
                    if (i == c) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Intrinsics.c(d(i2).getF24814a(), serialDescriptor.d(i2).getF24814a()) && Intrinsics.c(d(i2).f(), serialDescriptor.d(i2).f())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline, reason: from getter */
    public final boolean getL() {
        return this.l;
    }
}
