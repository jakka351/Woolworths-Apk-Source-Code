package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ EncoderImpl e;
    public final /* synthetic */ long f;

    public /* synthetic */ b(EncoderImpl encoderImpl, long j, int i) {
        this.d = i;
        this.e = encoderImpl;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                EncoderImpl encoderImpl = this.e;
                long j = this.f;
                switch (encoderImpl.t.ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        Logger.a(encoderImpl.f625a, "Pause on ".concat(DebugUtils.a(j)));
                        encoderImpl.o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        encoderImpl.m(EncoderImpl.InternalState.f);
                        return;
                    case 4:
                        encoderImpl.m(EncoderImpl.InternalState.i);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.t);
                }
            default:
                EncoderImpl encoderImpl2 = this.e;
                long j2 = this.f;
                EncoderImpl.InternalState internalState = EncoderImpl.InternalState.e;
                switch (encoderImpl2.t.ordinal()) {
                    case 0:
                        encoderImpl2.x = null;
                        Logger.a(encoderImpl2.f625a, "Start on ".concat(DebugUtils.a(j2)));
                        try {
                            if (encoderImpl2.A) {
                                encoderImpl2.l();
                            }
                            encoderImpl2.u = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            encoderImpl2.e.start();
                            Encoder.EncoderInput encoderInput = encoderImpl2.f;
                            if (encoderInput instanceof EncoderImpl.ByteBufferInput) {
                                ((EncoderImpl.ByteBufferInput) encoderInput).e(true);
                            }
                            encoderImpl2.m(internalState);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            encoderImpl2.g(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        encoderImpl2.x = null;
                        Range range = (Range) encoderImpl2.o.removeLast();
                        Preconditions.f("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        encoderImpl2.o.addLast(Range.create(l, Long.valueOf(j2)));
                        Logger.a(encoderImpl2.f625a, "Resume on " + DebugUtils.a(j2) + "\nPaused duration = " + DebugUtils.a(j2 - jLongValue));
                        if ((encoderImpl2.c || DeviceQuirks.f614a.b(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!encoderImpl2.c || DeviceQuirks.f614a.b(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            encoderImpl2.e.setParameters(bundle);
                            Encoder.EncoderInput encoderInput2 = encoderImpl2.f;
                            if (encoderInput2 instanceof EncoderImpl.ByteBufferInput) {
                                ((EncoderImpl.ByteBufferInput) encoderInput2).e(true);
                            }
                        }
                        if (encoderImpl2.c) {
                            encoderImpl2.k();
                        }
                        encoderImpl2.m(internalState);
                        return;
                    case 3:
                    case 5:
                        encoderImpl2.m(EncoderImpl.InternalState.h);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl2.t);
                }
        }
    }
}
