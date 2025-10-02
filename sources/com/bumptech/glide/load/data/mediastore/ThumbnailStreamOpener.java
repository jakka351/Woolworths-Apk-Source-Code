package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class ThumbnailStreamOpener {
    public static final FileService e = new FileService();

    /* renamed from: a, reason: collision with root package name */
    public final ThumbnailQuery f13792a;
    public final ArrayPool b;
    public final ContentResolver c;
    public final ArrayList d;

    public ThumbnailStreamOpener(ArrayList arrayList, ThumbnailQuery thumbnailQuery, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f13792a = thumbnailQuery;
        this.b = arrayPool;
        this.c = contentResolver;
        this.d = arrayList;
    }
}
