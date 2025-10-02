package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;

@Deprecated
/* loaded from: classes4.dex */
public class VideoBitmapDecoder extends VideoDecoder<ParcelFileDescriptor> {
    public VideoBitmapDecoder(Context context) {
        super(Glide.a(context).e, new VideoDecoder.ParcelFileDescriptorInitializer());
    }
}
