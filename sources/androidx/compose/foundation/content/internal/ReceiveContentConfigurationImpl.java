package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfigurationImpl;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class ReceiveContentConfigurationImpl extends ReceiveContentConfiguration {
    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public final ReceiveContentListener a() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ReceiveContentConfigurationImpl);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=null)";
    }
}
