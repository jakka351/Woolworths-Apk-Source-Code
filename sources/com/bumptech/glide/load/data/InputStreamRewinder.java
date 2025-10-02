package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class InputStreamRewinder implements DataRewinder<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclableBufferedInputStream f13786a;

    /* loaded from: classes.dex */
    public static final class Factory implements DataRewinder.Factory<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayPool f13787a;

        public Factory(ArrayPool arrayPool) {
            this.f13787a = arrayPool;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public final DataRewinder b(Object obj) {
            return new InputStreamRewinder((InputStream) obj, this.f13787a);
        }
    }

    public InputStreamRewinder(InputStream inputStream, ArrayPool arrayPool) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        this.f13786a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final Object a() {
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.f13786a;
        recyclableBufferedInputStream.reset();
        return recyclableBufferedInputStream;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final void b() {
        this.f13786a.release();
    }
}
