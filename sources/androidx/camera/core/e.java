package androidx.camera.core;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ CameraX e;
    public final /* synthetic */ Executor f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ CallbackToFutureAdapter.Completer j;

    public /* synthetic */ e(CameraX cameraX, Context context, Executor executor, int i, CallbackToFutureAdapter.Completer completer, long j) {
        this.e = cameraX;
        this.i = context;
        this.f = executor;
        this.h = i;
        this.j = completer;
        this.g = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0114 A[Catch: all -> 0x009c, TryCatch #7 {all -> 0x009c, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0065, B:13:0x006f, B:15:0x0089, B:17:0x0093, B:26:0x00a5, B:28:0x00b3, B:30:0x00b9, B:31:0x00bf, B:32:0x00c1, B:35:0x00c7, B:39:0x00d1, B:40:0x00d2, B:41:0x00de, B:42:0x00df, B:43:0x00eb, B:52:0x0103, B:54:0x0114, B:55:0x011b, B:59:0x0124, B:60:0x0151, B:61:0x0153, B:64:0x0159, B:66:0x015d, B:67:0x015f, B:70:0x0165, B:74:0x016c, B:75:0x016d, B:77:0x0171, B:78:0x0196, B:80:0x019a, B:81:0x019f, B:86:0x01ac, B:50:0x00f4, B:51:0x0102, B:68:0x0160, B:69:0x0164, B:62:0x0154, B:63:0x0158), top: B:93:0x0041, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151 A[Catch: all -> 0x009c, TryCatch #7 {all -> 0x009c, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0065, B:13:0x006f, B:15:0x0089, B:17:0x0093, B:26:0x00a5, B:28:0x00b3, B:30:0x00b9, B:31:0x00bf, B:32:0x00c1, B:35:0x00c7, B:39:0x00d1, B:40:0x00d2, B:41:0x00de, B:42:0x00df, B:43:0x00eb, B:52:0x0103, B:54:0x0114, B:55:0x011b, B:59:0x0124, B:60:0x0151, B:61:0x0153, B:64:0x0159, B:66:0x015d, B:67:0x015f, B:70:0x0165, B:74:0x016c, B:75:0x016d, B:77:0x0171, B:78:0x0196, B:80:0x019a, B:81:0x019f, B:86:0x01ac, B:50:0x00f4, B:51:0x0102, B:68:0x0160, B:69:0x0164, B:62:0x0154, B:63:0x0158), top: B:93:0x0041, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.e.run():void");
    }

    public /* synthetic */ e(CameraX cameraX, Executor executor, long j, int i, Context context, CallbackToFutureAdapter.Completer completer) {
        this.e = cameraX;
        this.f = executor;
        this.g = j;
        this.h = i;
        this.i = context;
        this.j = completer;
    }
}
