package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalRoomApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final MultiInstanceInvalidationService$callbackList$1 f = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            IMultiInstanceInvalidationCallback callback = (IMultiInstanceInvalidationCallback) iInterface;
            Intrinsics.h(callback, "callback");
            Intrinsics.h(cookie, "cookie");
            this.f3717a.e.remove((Integer) cookie);
        }
    };
    public final MultiInstanceInvalidationService$binder$1 g = new MultiInstanceInvalidationService$binder$1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.h(intent, "intent");
        return this.g;
    }
}
