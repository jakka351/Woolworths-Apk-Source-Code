package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes2.dex */
public final class RemoteActionCompat implements VersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public IconCompat f2410a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public boolean e;
    public boolean f;

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api28Impl {
    }

    @RestrictTo
    public RemoteActionCompat() {
    }
}
