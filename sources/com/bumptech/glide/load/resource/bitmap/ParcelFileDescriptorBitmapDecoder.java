package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.ImageReader;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

@RequiresApi
/* loaded from: classes.dex */
public final class ParcelFileDescriptorBitmapDecoder implements ResourceDecoder<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final Downsampler f13920a;

    public ParcelFileDescriptorBitmapDecoder(Downsampler downsampler) {
        this.f13920a = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= llqqqql.cc00630063006300630063) && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) {
        Downsampler downsampler = this.f13920a;
        return downsampler.a(new ImageReader.ParcelFileDescriptorImageReader((ParcelFileDescriptor) obj, downsampler.d, downsampler.c), i, i2, options, Downsampler.k);
    }
}
