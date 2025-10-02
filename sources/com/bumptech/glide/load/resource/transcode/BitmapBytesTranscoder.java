package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class BitmapBytesTranscoder implements ResourceTranscoder<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f13945a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public final Resource a(Resource resource, Options options) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) resource.get()).compress(this.f13945a, this.b, byteArrayOutputStream);
        resource.recycle();
        return new BytesResource(byteArrayOutputStream.toByteArray());
    }
}
