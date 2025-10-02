package androidx.camera.core.streamsharing;

import androidx.camera.core.UseCase;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.Threads;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements SessionConfig.ErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StreamSharing f571a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ UseCaseConfig d;
    public final /* synthetic */ StreamSpec e;
    public final /* synthetic */ StreamSpec f;

    public /* synthetic */ a(StreamSharing streamSharing, String str, String str2, UseCaseConfig useCaseConfig, StreamSpec streamSpec, StreamSpec streamSpec2) {
        this.f571a = streamSharing;
        this.b = str;
        this.c = str2;
        this.d = useCaseConfig;
        this.e = streamSpec;
        this.f = streamSpec2;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void a(SessionConfig sessionConfig) {
        StreamSharing streamSharing = this.f571a;
        if (streamSharing.b() == null) {
            return;
        }
        streamSharing.E();
        streamSharing.D(streamSharing.F(this.b, this.c, this.d, this.e, this.f));
        streamSharing.p();
        VirtualCameraAdapter virtualCameraAdapter = streamSharing.q;
        virtualCameraAdapter.getClass();
        Threads.a();
        Iterator it = virtualCameraAdapter.d.iterator();
        while (it.hasNext()) {
            virtualCameraAdapter.n((UseCase) it.next());
        }
    }
}
