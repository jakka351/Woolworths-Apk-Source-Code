package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {
    public final Uri d;
    public final ThumbnailStreamOpener e;
    public InputStream f;

    public static class ImageThumbnailQuery implements ThumbnailQuery {
        public static final String[] b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f13790a;

        public ImageThumbnailQuery(ContentResolver contentResolver) {
            this.f13790a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f13790a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public static class VideoThumbnailQuery implements ThumbnailQuery {
        public static final String[] b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f13791a;

        public VideoThumbnailQuery(ContentResolver contentResolver) {
            this.f13791a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.ThumbnailQuery
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f13791a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public ThumbFetcher(Uri uri, ThumbnailStreamOpener thumbnailStreamOpener) {
        this.d = uri;
        this.e = thumbnailStreamOpener;
    }

    public static ThumbFetcher e(Context context, Uri uri, ThumbnailQuery thumbnailQuery) {
        return new ThumbFetcher(uri, new ThumbnailStreamOpener(Glide.a(context).g.a().b(), thumbnailQuery, Glide.a(context).h, context.getContentResolver()));
    }

    public static ThumbFetcher f(Context context, Uri uri) {
        return e(context, uri, new ImageThumbnailQuery(context.getContentResolver()));
    }

    public static ThumbFetcher g(Context context, Uri uri) {
        return e(context, uri, new VideoThumbnailQuery(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() throws IOException {
        InputStream inputStream = this.f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final DataSource c() {
        return DataSource.d;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void d(Priority priority, DataFetcher.DataCallback dataCallback) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f = inputStreamH;
            dataCallback.e(inputStreamH);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            dataCallback.f(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0024: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x0024 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[PHI: r7
  0x002b: PHI (r7v6 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:23:0x004a, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream h() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.ThumbFetcher.h():java.io.InputStream");
    }
}
