package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ContentInfoCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Compat f2469a;

    @RequiresApi
    public static final class Api31Impl {
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final BuilderCompat f2470a;

        public Builder(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2470a = new BuilderCompat31Impl(clipData, i);
                return;
            }
            BuilderCompatImpl builderCompatImpl = new BuilderCompatImpl();
            builderCompatImpl.f2472a = clipData;
            builderCompatImpl.b = i;
            this.f2470a = builderCompatImpl;
        }

        public final ContentInfoCompat a() {
            return this.f2470a.build();
        }

        public final void b(Bundle bundle) {
            this.f2470a.setExtras(bundle);
        }

        public final void c(int i) {
            this.f2470a.b(i);
        }

        public final void d(Uri uri) {
            this.f2470a.a(uri);
        }
    }

    public interface BuilderCompat {
        void a(Uri uri);

        void b(int i);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);
    }

    @RequiresApi
    public static final class BuilderCompat31Impl implements BuilderCompat {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f2471a;

        public BuilderCompat31Impl(ClipData clipData, int i) {
            this.f2471a = androidx.core.splashscreen.a.h(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.f2471a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void b(int i) {
            this.f2471a.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.f2471a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.f2471a.setExtras(bundle);
        }
    }

    public static final class BuilderCompatImpl implements BuilderCompat {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f2472a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void b(int i) {
            this.c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    public interface Compat {
        ClipData a();

        int g();

        ContentInfo h();

        int t();
    }

    @RequiresApi
    public static final class Compat31Impl implements Compat {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f2473a;

        public Compat31Impl(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f2473a = androidx.core.splashscreen.a.j(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData a() {
            return this.f2473a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int g() {
            return this.f2473a.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo h() {
            return this.f2473a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int t() {
            return this.f2473a.getFlags();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f2473a + "}";
        }
    }

    public static final class CompatImpl implements Compat {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f2474a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            ClipData clipData = builderCompatImpl.f2472a;
            clipData.getClass();
            this.f2474a = clipData;
            int i = builderCompatImpl.b;
            Preconditions.c(i, 0, 5, "source");
            this.b = i;
            int i2 = builderCompatImpl.c;
            if ((i2 & 1) == i2) {
                this.c = i2;
                this.d = builderCompatImpl.d;
                this.e = builderCompatImpl.e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData a() {
            return this.f2474a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int g() {
            return this.b;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo h() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int t() {
            return this.c;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f2474a.getDescription());
            sb.append(", source=");
            int i = this.b;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i2 = this.c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return YU.a.o(sb, this.e != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    public ContentInfoCompat(Compat compat) {
        this.f2469a = compat;
    }

    public final ClipData a() {
        return this.f2469a.a();
    }

    public final int b() {
        return this.f2469a.t();
    }

    public final int c() {
        return this.f2469a.g();
    }

    public final String toString() {
        return this.f2469a.toString();
    }
}
