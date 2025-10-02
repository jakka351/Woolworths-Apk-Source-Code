package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.LruCache;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

@SuppressLint
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, b> f16958a;

    public class a extends LruCache<String, b> {
        public a(int i) {
            super(i);
        }

        @Override // androidx.collection.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.b;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f16960a;
        final int b;

        public b(Bitmap bitmap, int i) {
            this.f16960a = bitmap;
            this.b = i;
        }
    }

    public c(Context context) {
        this.f16958a = new a(a(context));
    }

    private static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * llqqqql.c0063c0063c00630063) / 10);
    }

    public void a() {
        this.f16958a.evictAll();
    }

    public Bitmap a(String str) {
        b bVar = this.f16958a.get(str);
        if (bVar != null) {
            return bVar.f16960a;
        }
        return null;
    }

    public void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return;
        }
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount > this.f16958a.maxSize()) {
            this.f16958a.remove(str);
        } else {
            this.f16958a.put(str, new b(bitmap, allocationByteCount));
        }
    }
}
