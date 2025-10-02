package android.support.v4.media.session;

import android.app.PendingIntent;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompatApi21;
import android.support.v4.media.session.MediaSessionCompatApi23;
import android.support.v4.media.session.MediaSessionCompatApi24;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes2.dex */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$1, reason: invalid class name */
    class AnonymousClass1 extends Callback {
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$2, reason: invalid class name */
    class AnonymousClass2 extends Callback {
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$3, reason: invalid class name */
    class AnonymousClass3 extends Callback {
    }

    public static abstract class Callback {

        public class CallbackHandler extends Handler {
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                throw null;
            }
        }

        @RequiresApi
        public class StubApi21 implements MediaSessionCompatApi21.Callback {
        }

        @RequiresApi
        public class StubApi23 extends StubApi21 implements MediaSessionCompatApi23.Callback {
        }

        @RequiresApi
        public class StubApi24 extends StubApi23 implements MediaSessionCompatApi24.Callback {
        }
    }

    public interface MediaSessionImpl {
    }

    @RequiresApi
    public static class MediaSessionImplApi18 extends MediaSessionImplBase {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi18$1, reason: invalid class name */
        class AnonymousClass1 implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public final void onPlaybackPositionUpdate(long j) {
                throw null;
            }
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi19 extends MediaSessionImplApi18 {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi19$1, reason: invalid class name */
        class AnonymousClass1 implements RemoteControlClient.OnMetadataUpdateListener {
            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public final void onMetadataUpdate(int i, Object obj) {
                RatingCompat ratingCompat;
                float f;
                if (i == 268435457 && (obj instanceof Rating)) {
                    Rating rating = (Rating) obj;
                    int ratingStyle = rating.getRatingStyle();
                    if (!rating.isRated()) {
                        switch (ratingStyle) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                ratingCompat = new RatingCompat(ratingStyle, -1.0f);
                                break;
                            default:
                                ratingCompat = null;
                                break;
                        }
                    } else {
                        switch (ratingStyle) {
                            case 1:
                                ratingCompat = new RatingCompat(1, rating.hasHeart() ? 1.0f : 0.0f);
                                break;
                            case 2:
                                ratingCompat = new RatingCompat(2, rating.isThumbUp() ? 1.0f : 0.0f);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                float starRating = rating.getStarRating();
                                if (ratingStyle == 3) {
                                    f = 3.0f;
                                } else if (ratingStyle == 4) {
                                    f = 4.0f;
                                } else if (ratingStyle != 5) {
                                    Log.e("Rating", "Invalid rating style (" + ratingStyle + ") for a star rating");
                                    break;
                                } else {
                                    f = 5.0f;
                                }
                                if (starRating >= BitmapDescriptorFactory.HUE_RED && starRating <= f) {
                                    ratingCompat = new RatingCompat(ratingStyle, starRating);
                                    break;
                                } else {
                                    Log.e("Rating", "Trying to set out of range star-based rating");
                                    break;
                                }
                            case 6:
                                float percentRating = rating.getPercentRating();
                                if (percentRating >= BitmapDescriptorFactory.HUE_RED && percentRating <= 100.0f) {
                                    ratingCompat = new RatingCompat(6, percentRating);
                                    break;
                                } else {
                                    Log.e("Rating", "Invalid percentage-based rating value");
                                    break;
                                }
                            default:
                                throw null;
                        }
                        ratingCompat = null;
                    }
                    ratingCompat.getClass();
                    throw null;
                }
            }
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi21 implements MediaSessionImpl {

        public class ExtraSession extends IMediaSession.Stub {
            @Override // android.support.v4.media.session.IMediaSession
            public final boolean A() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void B0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void C() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void D0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String F() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void H(IMediaControllerCallback iMediaControllerCallback) {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean I() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void I0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final CharSequence J() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void K() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void M() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void N0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void O0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void P0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final ParcelableVolumeInfo X() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean X0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final List Y0() {
                return null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String b() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void d1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int e0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void f0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void h0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void k0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void n0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void o() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void o0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void p0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void q() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int r() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PlaybackStateCompat s() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void s0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final long t() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void u() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void v() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PendingIntent w() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int w0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void x() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void y(ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void z() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void z0() {
                throw new AssertionError();
            }
        }
    }

    @RequiresApi
    public static class MediaSessionImplApi28 extends MediaSessionImplApi21 {
    }

    public static class MediaSessionImplBase implements MediaSessionImpl {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplBase$1, reason: invalid class name */
        public class AnonymousClass1 extends VolumeProviderCompat.Callback {
        }

        public static final class Command {
        }

        public class MediaSessionStub extends IMediaSession.Stub {
            @Override // android.support.v4.media.session.IMediaSession
            public final boolean A() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void B0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void C() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void D0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String F() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void H(IMediaControllerCallback iMediaControllerCallback) {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean I() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void I0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final CharSequence J() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void K() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void M() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void N0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void O0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void P0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final ParcelableVolumeInfo X() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean X0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final List Y0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final String b() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void d1() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int e0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void f0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final Bundle getExtras() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final MediaMetadataCompat getMetadata() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void h0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void k0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void n0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void next() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void o() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void o0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void p() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void p0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void pause() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void previous() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void q() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int r() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PlaybackStateCompat s() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void s0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void stop() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final long t() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void u() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void v() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final PendingIntent w() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final int w0() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void x() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void y(ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver = resultReceiverWrapper.d;
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void z() {
                throw null;
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final void z0() {
                throw null;
            }
        }

        public class MessageHandler extends Handler {
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                throw null;
            }
        }
    }

    public interface OnActiveChangeListener {
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new AnonymousClass1();
        public final MediaDescriptionCompat d;
        public final long e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.e = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.d);
            sb.append(", Id=");
            return a.l(this.e, " }", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.d.writeToParcel(parcel, i);
            parcel.writeLong(this.e);
        }
    }

    @RestrictTo
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new AnonymousClass1();
        public ResultReceiver d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                ResultReceiverWrapper resultReceiverWrapper = new ResultReceiverWrapper();
                resultReceiverWrapper.d = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return resultReceiverWrapper;
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.d.writeToParcel(parcel, i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface SessionFlags {
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new AnonymousClass1();
        public final Object d;
        public IMediaSession e;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, IMediaSession iMediaSession) {
            this.d = obj;
            this.e = iMediaSession;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = ((Token) obj).d;
            Object obj3 = this.d;
            if (obj3 == null) {
                return obj2 == null;
            }
            if (obj2 == null) {
                return false;
            }
            return obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.d;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.d, i);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
