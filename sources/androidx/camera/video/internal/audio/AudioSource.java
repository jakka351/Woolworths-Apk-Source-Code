package androidx.camera.video.internal.audio;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.encoder.InputBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class AudioSource {

    /* renamed from: a, reason: collision with root package name */
    public BufferProvider.State f609a;
    public boolean b;
    public boolean c;
    public long d;

    /* renamed from: androidx.camera.video.internal.audio.AudioSource$1, reason: invalid class name */
    class AnonymousClass1 implements Observable.Observer<BufferProvider.State> {
        @Override // androidx.camera.core.impl.Observable.Observer
        public final void a(Object obj) {
            Objects.requireNonNull((BufferProvider.State) obj);
            throw null;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
        }
    }

    /* renamed from: androidx.camera.video.internal.audio.AudioSource$2, reason: invalid class name */
    class AnonymousClass2 implements FutureCallback<InputBuffer> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Logger.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    public interface AudioSourceCallback {
    }

    public class AudioStreamCallback implements AudioStream.AudioStreamCallback {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InternalState {
        public static final InternalState d;
        public static final /* synthetic */ InternalState[] e;

        /* JADX INFO: Fake field, exist only in values array */
        InternalState EF0;

        static {
            InternalState internalState = new InternalState("CONFIGURED", 0);
            InternalState internalState2 = new InternalState("STARTED", 1);
            d = internalState2;
            e = new InternalState[]{internalState, internalState2, new InternalState("RELEASED", 2)};
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) e.clone();
        }
    }

    public final void a() {
        if (this.b) {
            this.b = false;
            Logger.a("AudioSource", "stopSendingAudio");
            throw null;
        }
    }
}
