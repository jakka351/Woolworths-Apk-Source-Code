package androidx.media3.exoplayer.util;

import YU.a;
import android.text.TextUtils;
import androidx.camera.core.impl.b;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class EventLogger implements AnalyticsListener {

    /* renamed from: a, reason: collision with root package name */
    public static final NumberFormat f3188a;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f3188a = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String S(AudioSink.AudioTrackConfig audioTrackConfig) {
        return audioTrackConfig.f3049a + "," + audioTrackConfig.c + "," + audioTrackConfig.b + "," + audioTrackConfig.d + "," + audioTrackConfig.e + "," + audioTrackConfig.f;
    }

    public static String T(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th) {
        String str3;
        StringBuilder sbT = a.t(str, " [");
        sbT.append(U(eventTime));
        String string = sbT.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbT2 = a.t(string, ", errorCode=");
            int i = ((PlaybackException) th).d;
            if (i == -100) {
                str3 = "ERROR_CODE_DISCONNECTED";
            } else if (i == -6) {
                str3 = "ERROR_CODE_NOT_SUPPORTED";
            } else if (i == -4) {
                str3 = "ERROR_CODE_PERMISSION_DENIED";
            } else if (i == -3) {
                str3 = "ERROR_CODE_BAD_VALUE";
            } else if (i == -2) {
                str3 = "ERROR_CODE_INVALID_STATE";
            } else if (i == 7000) {
                str3 = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
            } else if (i != 7001) {
                switch (i) {
                    case -110:
                        str3 = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                        break;
                    case -109:
                        str3 = "ERROR_CODE_END_OF_PLAYLIST";
                        break;
                    case -108:
                        str3 = "ERROR_CODE_SETUP_REQUIRED";
                        break;
                    case -107:
                        str3 = "ERROR_CODE_SKIP_LIMIT_REACHED";
                        break;
                    case -106:
                        str3 = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                        break;
                    case -105:
                        str3 = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                        break;
                    case -104:
                        str3 = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                        break;
                    case -103:
                        str3 = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                        break;
                    case -102:
                        str3 = "ERROR_CODE_AUTHENTICATION_EXPIRED";
                        break;
                    default:
                        switch (i) {
                            case 1000:
                                str3 = "ERROR_CODE_UNSPECIFIED";
                                break;
                            case 1001:
                                str3 = "ERROR_CODE_REMOTE_ERROR";
                                break;
                            case 1002:
                                str3 = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                                break;
                            case 1003:
                                str3 = "ERROR_CODE_TIMEOUT";
                                break;
                            case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                                str3 = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                                break;
                            default:
                                switch (i) {
                                    case 2000:
                                        str3 = "ERROR_CODE_IO_UNSPECIFIED";
                                        break;
                                    case 2001:
                                        str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                        break;
                                    case 2002:
                                        str3 = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                        break;
                                    case 2003:
                                        str3 = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                        break;
                                    case 2004:
                                        str3 = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                        break;
                                    case 2005:
                                        str3 = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                        break;
                                    case 2006:
                                        str3 = "ERROR_CODE_IO_NO_PERMISSION";
                                        break;
                                    case 2007:
                                        str3 = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                        break;
                                    case 2008:
                                        str3 = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                        break;
                                    default:
                                        switch (i) {
                                            case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                                                str3 = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                                break;
                                            case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                                                str3 = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                                break;
                                            case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                                                str3 = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                                break;
                                            case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                                                str3 = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 4001:
                                                        str3 = "ERROR_CODE_DECODER_INIT_FAILED";
                                                        break;
                                                    case 4002:
                                                        str3 = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                        break;
                                                    case 4003:
                                                        str3 = "ERROR_CODE_DECODING_FAILED";
                                                        break;
                                                    case 4004:
                                                        str3 = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                        break;
                                                    case 4005:
                                                        str3 = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                        break;
                                                    case 4006:
                                                        str3 = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 5001:
                                                                str3 = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                                break;
                                                            case 5002:
                                                                str3 = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                                break;
                                                            case 5003:
                                                                str3 = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                                break;
                                                            case 5004:
                                                                str3 = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 6000:
                                                                        str3 = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                        break;
                                                                    case 6001:
                                                                        str3 = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                        break;
                                                                    case 6002:
                                                                        str3 = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                        break;
                                                                    case 6003:
                                                                        str3 = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                        break;
                                                                    case 6004:
                                                                        str3 = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                        break;
                                                                    case 6005:
                                                                        str3 = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                        break;
                                                                    case 6006:
                                                                        str3 = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                        break;
                                                                    case 6007:
                                                                        str3 = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                        break;
                                                                    case 6008:
                                                                        str3 = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                        break;
                                                                    default:
                                                                        if (i < 1000000) {
                                                                            str3 = "invalid error code";
                                                                            break;
                                                                        } else {
                                                                            str3 = "custom error code";
                                                                            break;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str3 = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
            }
            sbT2.append(str3);
            string = sbT2.toString();
        }
        if (str2 != null) {
            string = b.o(string, ", ", str2);
        }
        String strE = Log.e(th);
        if (!TextUtils.isEmpty(strE)) {
            StringBuilder sbT3 = a.t(string, "\n  ");
            sbT3.append(strE.replace("\n", "\n  "));
            sbT3.append('\n');
            string = sbT3.toString();
        }
        return a.g(string, "]");
    }

    public static String U(AnalyticsListener.EventTime eventTime) {
        String string = "window=" + eventTime.c;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.d;
        if (mediaPeriodId != null) {
            StringBuilder sbT = a.t(string, ", period=");
            sbT.append(eventTime.b.b(mediaPeriodId.f3130a));
            string = sbT.toString();
            if (mediaPeriodId.b()) {
                StringBuilder sbT2 = a.t(string, ", adGroup=");
                sbT2.append(mediaPeriodId.b);
                StringBuilder sbT3 = a.t(sbT2.toString(), ", ad=");
                sbT3.append(mediaPeriodId.c);
                string = sbT3.toString();
            }
        }
        StringBuilder sb = new StringBuilder("eventTime=");
        long j = eventTime.f3028a;
        NumberFormat numberFormat = f3188a;
        sb.append(j == -9223372036854775807L ? "?" : numberFormat.format(j / 1000.0f));
        sb.append(", mediaPos=");
        return a.p(sb, eventTime.e != -9223372036854775807L ? numberFormat.format(r2 / 1000.0f) : "?", ", ", string);
    }

    public static void V(AnalyticsListener.EventTime eventTime, String str) {
        Log.b(null, T(eventTime, str, null, null));
    }

    public static void W(AnalyticsListener.EventTime eventTime, String str, String str2) {
        Log.b(null, T(eventTime, str, str2, null));
    }

    public static void X(Metadata metadata, String str) {
        for (int i = 0; i < metadata.f2868a.length; i++) {
            StringBuilder sbS = a.s(str);
            sbS.append(metadata.f2868a[i]);
            Log.b(null, sbS.toString());
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void A(AnalyticsListener.EventTime eventTime) {
        V(eventTime, "videoEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void B(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        Log.b(null, "metadata [" + U(eventTime));
        X(metadata, "  ");
        Log.b(null, "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void C(AnalyticsListener.EventTime eventTime, boolean z) {
        W(eventTime, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void D(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        Log.c(null, T(eventTime, "playerFailed", null, playbackException));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void E(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        V(eventTime, "videoDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void F(AnalyticsListener.EventTime eventTime) {
        V(eventTime, "audioDisabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void G(AnalyticsListener.EventTime eventTime, Format format) {
        W(eventTime, "videoInputFormat", Format.c(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
        Log.c(null, T(eventTime, "internalError", "loadError", iOException));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void I(AnalyticsListener.EventTime eventTime, int i) {
        Timeline timeline = eventTime.b;
        int iH = timeline.h();
        int iO = timeline.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(U(eventTime));
        sb.append(", periodCount=");
        sb.append(iH);
        sb.append(", windowCount=");
        sb.append(iO);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        Log.b(null, sb.toString());
        if (Math.min(iH, 3) > 0) {
            timeline.f(0, null, false);
            throw null;
        }
        if (iH > 3) {
            Log.b(null, "  ...");
        }
        if (Math.min(iO, 3) > 0) {
            timeline.n(0, null);
            throw null;
        }
        if (iO > 3) {
            Log.b(null, "  ...");
        }
        Log.b(null, "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void J(AnalyticsListener.EventTime eventTime, float f) {
        W(eventTime, "volume", Float.toString(f));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void K(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        Log.c(null, T(eventTime, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void L(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        W(eventTime, "audioTrackInit", S(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void M(AnalyticsListener.EventTime eventTime, String str) {
        W(eventTime, "audioDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void N(AnalyticsListener.EventTime eventTime, String str) {
        W(eventTime, "videoDecoderReleased", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void O(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z) {
        StringBuilder sbR = a.r(i, "rendererIndex=", ", ");
        sbR.append(Util.z(i2));
        sbR.append(", ");
        sbR.append(z);
        W(eventTime, "rendererReady", sbR.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void P(AnalyticsListener.EventTime eventTime) {
        V(eventTime, "audioEnabled");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void Q(AnalyticsListener.EventTime eventTime, int i) {
        W(eventTime, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void R(AnalyticsListener.EventTime eventTime, String str) {
        W(eventTime, "audioDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void a(AnalyticsListener.EventTime eventTime, boolean z) {
        W(eventTime, "isPlaying", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void b(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        W(eventTime, "playWhenReady", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void c(AnalyticsListener.EventTime eventTime, Format format) {
        W(eventTime, "audioInputFormat", Format.c(format));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void d(AnalyticsListener.EventTime eventTime) {
        V(eventTime, "drmSessionReleased");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void e(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener.EventTime eventTime) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [mediaItem=");
        int i2 = positionInfo.b;
        int i3 = positionInfo.h;
        sb.append(i2);
        sb.append(", period=");
        sb.append(positionInfo.e);
        sb.append(", pos=");
        sb.append(positionInfo.f);
        if (i3 != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo.g);
            sb.append(", adGroup=");
            sb.append(i3);
            sb.append(", ad=");
            sb.append(positionInfo.i);
        }
        sb.append("], PositionInfo:new [mediaItem=");
        int i4 = positionInfo2.b;
        int i5 = positionInfo2.h;
        sb.append(i4);
        sb.append(", period=");
        sb.append(positionInfo2.e);
        sb.append(", pos=");
        sb.append(positionInfo2.f);
        if (i5 != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo2.g);
            sb.append(", adGroup=");
            sb.append(i5);
            sb.append(", ad=");
            sb.append(positionInfo2.i);
        }
        sb.append("]");
        W(eventTime, "positionDiscontinuity", sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void f(AnalyticsListener.EventTime eventTime, Exception exc) {
        Log.c(null, T(eventTime, "internalError", "drmSessionManagerError", exc));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void g(AnalyticsListener.EventTime eventTime, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(U(eventTime));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        Log.b(null, sb.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void h(AnalyticsListener.EventTime eventTime, int i, int i2) {
        W(eventTime, "surfaceSize", i + ", " + i2);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void i(AnalyticsListener.EventTime eventTime, int i) {
        W(eventTime, "drmSessionAcquired", "state=" + i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void j(AnalyticsListener.EventTime eventTime, boolean z) {
        W(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void k(AnalyticsListener.EventTime eventTime, int i) {
        W(eventTime, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void l(AnalyticsListener.EventTime eventTime, int i) {
        W(eventTime, "audioSessionId", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void m(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        W(eventTime, "playbackParameters", playbackParameters.toString());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void n(AnalyticsListener.EventTime eventTime, String str) {
        W(eventTime, "videoDecoderInitialized", str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void o(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
        W(eventTime, "audioTrackReleased", S(audioTrackConfig));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void p(AnalyticsListener.EventTime eventTime, int i) {
        W(eventTime, "playbackSuppressionReason", i != 0 ? i != 1 ? i != 3 ? "?" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void r(AnalyticsListener.EventTime eventTime, int i) {
        W(eventTime, "droppedFrames", Integer.toString(i));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void s(AnalyticsListener.EventTime eventTime) {
        V(eventTime, "drmKeysRestored");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void t(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        Metadata metadata;
        Log.b(null, "tracks [" + U(eventTime));
        ImmutableList immutableList = tracks.f2884a;
        for (int i = 0; i < immutableList.size(); i++) {
            Tracks.Group group = (Tracks.Group) immutableList.get(i);
            Log.b(null, "  group [");
            for (int i2 = 0; i2 < group.f2885a; i2++) {
                String str = group.e[i2] ? "[X]" : "[ ]";
                String strU = Util.u(group.d[i2]);
                StringBuilder sbU = b.u("    ", i2, str, " Track:", ", ");
                sbU.append(Format.c(group.a(i2)));
                sbU.append(", supported=");
                sbU.append(strU);
                Log.b(null, sbU.toString());
            }
            Log.b(null, "  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < immutableList.size(); i3++) {
            Tracks.Group group2 = (Tracks.Group) immutableList.get(i3);
            for (int i4 = 0; !z && i4 < group2.f2885a; i4++) {
                if (group2.e[i4] && (metadata = group2.a(i4).l) != null && metadata.f2868a.length > 0) {
                    Log.b(null, "  Metadata [");
                    X(metadata, "    ");
                    Log.b(null, "  ]");
                    z = true;
                }
            }
        }
        Log.b(null, "]");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void u(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        W(eventTime, "videoSize", videoSize.f2887a + ", " + videoSize.b);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void v(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        W(eventTime, "downstreamFormat", Format.c(mediaLoadData.c));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void x(AnalyticsListener.EventTime eventTime) {
        V(eventTime, "drmKeysLoaded");
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void y(AnalyticsListener.EventTime eventTime, boolean z) {
        W(eventTime, "loading", Boolean.toString(z));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void z(AnalyticsListener.EventTime eventTime, Object obj) {
        W(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }
}
