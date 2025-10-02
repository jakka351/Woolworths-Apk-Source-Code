package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode e;

    public /* synthetic */ o(Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode, int i) {
        this.d = i;
        this.e = scheduleNode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode = this.e;
                if (!scheduleNode.b.getAndSet(true)) {
                    scheduleNode.c.b.f.execute(new o(scheduleNode, 1));
                    break;
                }
                break;
            default:
                Camera2CameraImpl.ErrorTimeoutReopenScheduler.ScheduleNode scheduleNode2 = this.e;
                if (scheduleNode2.c.b.h == Camera2CameraImpl.InternalState.k) {
                    scheduleNode2.c.b.v("Camera onError timeout, reopen it.", null);
                    scheduleNode2.c.b.G(Camera2CameraImpl.InternalState.j);
                    scheduleNode2.c.b.l.b();
                    break;
                } else {
                    scheduleNode2.c.b.v("Camera skip reopen at state: " + scheduleNode2.c.b.h, null);
                    break;
                }
        }
    }
}
