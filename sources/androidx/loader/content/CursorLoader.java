package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* renamed from: a, reason: collision with root package name */
    public final Loader.ForceLoadContentObserver f2820a;
    public Cursor b;
    public CancellationSignal c;

    public CursorLoader(@NonNull Context context) {
        super(context);
        this.f2820a = new Loader.ForceLoadContentObserver(this);
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void deliverResult(Cursor cursor) {
        if (isReset()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.b;
        this.b = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.c;
                if (cancellationSignal != null) {
                    cancellationSignal.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.b);
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final Object loadInBackground() {
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            this.c = new CancellationSignal();
        }
        try {
            Cursor cursorA = ContentResolverCompat.a(getContext().getContentResolver(), this.c);
            if (cursorA != null) {
                try {
                    cursorA.getCount();
                    cursorA.registerContentObserver(this.f2820a);
                } catch (RuntimeException e) {
                    cursorA.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.c = null;
            }
            return cursorA;
        } catch (Throwable th) {
            synchronized (this) {
                this.c = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final void onCanceled(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.Loader
    public final void onReset() {
        super.onReset();
        cancelLoad();
        Cursor cursor = this.b;
        if (cursor != null && !cursor.isClosed()) {
            this.b.close();
        }
        this.b = null;
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        Cursor cursor = this.b;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.b == null) {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public final void onStopLoading() {
        cancelLoad();
    }
}
