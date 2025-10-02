package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.room.IMultiInstanceInvalidationService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationClient$serviceConnection$1", "Landroid/content/ServiceConnection;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient$serviceConnection$1 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.h(name, "name");
        Intrinsics.h(service, "service");
        int i = IMultiInstanceInvalidationService.Stub.d;
        IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface(IMultiInstanceInvalidationService.l3);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) {
        }
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.h(name, "name");
        throw null;
    }
}
