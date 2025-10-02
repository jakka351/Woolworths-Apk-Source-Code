package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;

@RequiresApi
/* loaded from: classes4.dex */
public final class DefaultOnHeaderDecodedListener implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final HardwareConfigState f13894a = HardwareConfigState.a();
    public final int b;
    public final int c;
    public final DecodeFormat d;
    public final DownsampleStrategy e;
    public final boolean f;
    public final PreferredColorSpace g;

    /* renamed from: com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener$1, reason: invalid class name */
    class AnonymousClass1 implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public DefaultOnHeaderDecodedListener(int i, int i2, Options options) {
        this.b = i;
        this.c = i2;
        this.d = (DecodeFormat) options.b(Downsampler.f);
        this.e = (DownsampleStrategy) options.b(DownsampleStrategy.f);
        Option option = Downsampler.i;
        this.f = options.b(option) != null && ((Boolean) options.b(option)).booleanValue();
        this.g = (PreferredColorSpace) options.b(Downsampler.g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        HardwareConfigState hardwareConfigState = this.f13894a;
        int width = this.b;
        int height = this.c;
        if (hardwareConfigState.c(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.e) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new AnonymousClass1());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.g;
        if (preferredColorSpace != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.d && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
