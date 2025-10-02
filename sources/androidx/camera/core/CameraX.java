package androidx.camera.core;

import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.UseCaseConfigFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

@OptIn
@MainThread
@RestrictTo
/* loaded from: classes2.dex */
public final class CameraX {
    public static final Object m = new Object();
    public static final SparseArray n = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public final CameraRepository f397a;
    public final Object b;
    public final CameraXConfig c;
    public final Executor d;
    public final Handler e;
    public CameraFactory f;
    public CameraDeviceSurfaceManager g;
    public UseCaseConfigFactory h;
    public final RetryPolicy i;
    public final ListenableFuture j;
    public InternalInitState k;
    public final ListenableFuture l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InternalInitState {
        public static final InternalInitState d;
        public static final InternalInitState e;
        public static final InternalInitState f;
        public static final InternalInitState g;
        public static final /* synthetic */ InternalInitState[] h;

        static {
            InternalInitState internalInitState = new InternalInitState("UNINITIALIZED", 0);
            d = internalInitState;
            InternalInitState internalInitState2 = new InternalInitState("INITIALIZING", 1);
            e = internalInitState2;
            InternalInitState internalInitState3 = new InternalInitState("INITIALIZING_ERROR", 2);
            f = internalInitState3;
            InternalInitState internalInitState4 = new InternalInitState("INITIALIZED", 3);
            g = internalInitState4;
            h = new InternalInitState[]{internalInitState, internalInitState2, internalInitState3, internalInitState4, new InternalInitState("SHUTDOWN", 4)};
        }

        public static InternalInitState valueOf(String str) {
            return (InternalInitState) Enum.valueOf(InternalInitState.class, str);
        }

        public static InternalInitState[] values() {
            return (InternalInitState[]) h.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CameraX(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.<init>(android.content.Context):void");
    }
}
