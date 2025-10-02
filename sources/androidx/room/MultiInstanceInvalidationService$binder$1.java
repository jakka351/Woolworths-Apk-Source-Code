package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationService$binder$1", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService$binder$1 extends IMultiInstanceInvalidationService.Stub {
    public final /* synthetic */ MultiInstanceInvalidationService e;

    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.e = multiInstanceInvalidationService;
        attachInterface(this, IMultiInstanceInvalidationService.l3);
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void E0(int i, String[] tables) {
        Intrinsics.h(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
        synchronized (multiInstanceInvalidationService.f) {
            String str = (String) multiInstanceInvalidationService.e.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f.getBroadcastCookie(i2);
                    Intrinsics.f(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.e.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            multiInstanceInvalidationService.f.getBroadcastItem(i2).f(tables);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f.finishBroadcast();
                }
            }
        }
    }
}
