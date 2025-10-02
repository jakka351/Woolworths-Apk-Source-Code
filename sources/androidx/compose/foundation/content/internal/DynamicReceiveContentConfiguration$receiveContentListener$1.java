package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration$receiveContentListener$1", "Landroidx/compose/foundation/content/ReceiveContentListener;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DynamicReceiveContentConfiguration$receiveContentListener$1 implements ReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public int f852a;
    public final /* synthetic */ DynamicReceiveContentConfiguration b;

    public DynamicReceiveContentConfiguration$receiveContentListener$1(DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration) {
        this.b = dynamicReceiveContentConfiguration;
    }

    public final void a() {
        int i = this.f852a + 1;
        this.f852a = i;
        if (i == 1) {
            throw null;
        }
        ReceiveContentConfiguration receiveContentConfigurationA = ReceiveContentConfigurationKt.a(this.b.f851a);
        ReceiveContentListener receiveContentListenerA = receiveContentConfigurationA != null ? receiveContentConfigurationA.a() : null;
        if (receiveContentListenerA != null) {
            ((DynamicReceiveContentConfiguration$receiveContentListener$1) receiveContentListenerA).a();
        }
    }

    public final void b() {
        int i = this.f852a;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f852a = i2;
        if (i2 == 0 && i > 0) {
            throw null;
        }
        ReceiveContentConfiguration receiveContentConfigurationA = ReceiveContentConfigurationKt.a(this.b.f851a);
        ReceiveContentListener receiveContentListenerA = receiveContentConfigurationA != null ? receiveContentConfigurationA.a() : null;
        if (receiveContentListenerA != null) {
            ((DynamicReceiveContentConfiguration$receiveContentListener$1) receiveContentListenerA).b();
        }
    }
}
