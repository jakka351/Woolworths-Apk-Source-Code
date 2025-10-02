package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new AnonymousClass1();
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Bitmap h;
    public final Uri i;
    public final Bundle j;
    public final Uri k;
    public Object l;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            Uri uri;
            Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
            Bundle bundle = null;
            if (objCreateFromParcel == null) {
                return null;
            }
            Builder builder = new Builder();
            MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
            builder.f47a = mediaDescription.getMediaId();
            builder.b = mediaDescription.getTitle();
            builder.c = mediaDescription.getSubtitle();
            builder.d = mediaDescription.getDescription();
            builder.e = mediaDescription.getIconBitmap();
            builder.f = mediaDescription.getIconUri();
            Bundle extras = mediaDescription.getExtras();
            if (extras != null) {
                MediaSessionCompat.a(extras);
                uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            } else {
                uri = null;
            }
            if (uri == null) {
                bundle = extras;
            } else if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                extras.remove("android.support.v4.media.description.MEDIA_URI");
                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                bundle = extras;
            }
            builder.g = bundle;
            if (uri != null) {
                builder.h = uri;
            } else {
                builder.h = mediaDescription.getMediaUri();
            }
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(builder.f47a, builder.b, builder.c, builder.d, builder.e, builder.f, builder.g, builder.h);
            mediaDescriptionCompat.l = objCreateFromParcel;
            return mediaDescriptionCompat;
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f47a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public Bitmap e;
        public Uri f;
        public Bundle g;
        public Uri h;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence3;
        this.h = bitmap;
        this.i = uri;
        this.j = bundle;
        this.k = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.e) + ", " + ((Object) this.f) + ", " + ((Object) this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.l;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.d);
            builder.setTitle(this.e);
            builder.setSubtitle(this.f);
            builder.setDescription(this.g);
            builder.setIconBitmap(this.h);
            builder.setIconUri(this.i);
            builder.setExtras(this.j);
            builder.setMediaUri(this.k);
            objBuild = builder.build();
            this.l = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
