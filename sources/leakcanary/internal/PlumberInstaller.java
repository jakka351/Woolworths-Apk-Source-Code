package leakcanary.internal;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import java.util.EnumSet;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import leakcanary.AndroidLeakFixes;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/internal/PlumberInstaller;", "Landroid/content/ContentProvider;", "<init>", "()V", "plumber-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class PlumberInstaller extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.i(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Intrinsics.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Intrinsics.n();
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
        Application application = (Application) applicationContext;
        AndroidLeakFixes[] androidLeakFixesArr = AndroidLeakFixes.e;
        EnumSet<AndroidLeakFixes> enumSetAllOf = EnumSet.allOf(AndroidLeakFixes.class);
        Intrinsics.d(enumSetAllOf, "EnumSet.allOf(AndroidLeakFixes::class.java)");
        Lazy lazy = HandlersKt.f24885a;
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.d(mainLooper, "Looper.getMainLooper()");
        if (mainLooper.getThread() != Thread.currentThread()) {
            throw new IllegalStateException(("Should be called from the main thread, not " + Thread.currentThread()).toString());
        }
        for (AndroidLeakFixes androidLeakFixes : enumSetAllOf) {
            if (!androidLeakFixes.d) {
                androidLeakFixes.a(application);
                androidLeakFixes.d = true;
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.i(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.i(uri, "uri");
        return 0;
    }
}
