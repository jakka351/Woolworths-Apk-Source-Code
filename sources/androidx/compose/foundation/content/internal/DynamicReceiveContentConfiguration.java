package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiveContentNode f851a;
    public final DynamicReceiveContentConfiguration$receiveContentListener$1 b = new DynamicReceiveContentConfiguration$receiveContentListener$1(this);

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.f851a = receiveContentNode;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public final ReceiveContentListener a() {
        return this.b;
    }
}
