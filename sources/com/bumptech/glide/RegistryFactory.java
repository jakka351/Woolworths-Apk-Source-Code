package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteArrayLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.bumptech.glide.load.model.DirectResourceLoader;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.model.ResourceUriLoader;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.model.UnitModelLoader;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.load.model.UrlUriLoader;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.bumptech.glide.load.model.stream.UrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.InputStreamBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.ParcelFileDescriptorBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class RegistryFactory {
    public static Registry a(Glide glide, ArrayList arrayList) {
        ResourceDecoder byteBufferBitmapDecoder;
        ResourceDecoder streamBitmapDecoder;
        Class cls;
        BitmapPool bitmapPool = glide.e;
        ArrayPool arrayPool = glide.h;
        GlideContext glideContext = glide.g;
        Context applicationContext = glideContext.getApplicationContext();
        GlideExperiments glideExperiments = glideContext.h;
        Registry registry = new Registry();
        EncoderRegistry encoderRegistry = registry.b;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        ImageHeaderParserRegistry imageHeaderParserRegistry = registry.g;
        synchronized (imageHeaderParserRegistry) {
            imageHeaderParserRegistry.f13963a.add(defaultImageHeaderParser);
        }
        TranscoderRegistry transcoderRegistry = registry.f;
        ResourceEncoderRegistry resourceEncoderRegistry = registry.d;
        ResourceDecoderRegistry resourceDecoderRegistry = registry.c;
        ModelLoaderRegistry modelLoaderRegistry = registry.f13761a;
        int i = Build.VERSION.SDK_INT;
        ExifInterfaceImageHeaderParser exifInterfaceImageHeaderParser = new ExifInterfaceImageHeaderParser();
        ImageHeaderParserRegistry imageHeaderParserRegistry2 = registry.g;
        synchronized (imageHeaderParserRegistry2) {
            imageHeaderParserRegistry2.f13963a.add(exifInterfaceImageHeaderParser);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListB = registry.b();
        ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(applicationContext, arrayListB, bitmapPool, arrayPool);
        VideoDecoder videoDecoderF = VideoDecoder.f(bitmapPool);
        Downsampler downsampler = new Downsampler(registry.b(), resources.getDisplayMetrics(), bitmapPool, arrayPool);
        if (glideExperiments.f13759a.containsKey(GlideBuilder.EnableImageDecoderForBitmaps.class)) {
            streamBitmapDecoder = new InputStreamBitmapImageDecoderResourceDecoder();
            byteBufferBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder();
        } else {
            byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler);
            streamBitmapDecoder = new StreamBitmapDecoder(downsampler, arrayPool);
        }
        registry.a(AnimatedImageDecoder.c(arrayListB, arrayPool), InputStream.class, Drawable.class, "Animation");
        registry.a(AnimatedImageDecoder.a(arrayListB, arrayPool), ByteBuffer.class, Drawable.class, "Animation");
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(applicationContext);
        BitmapEncoder bitmapEncoder = new BitmapEncoder(arrayPool);
        BitmapBytesTranscoder bitmapBytesTranscoder = new BitmapBytesTranscoder();
        GifDrawableBytesTranscoder gifDrawableBytesTranscoder = new GifDrawableBytesTranscoder();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        encoderRegistry.a(ByteBuffer.class, new ByteBufferEncoder());
        encoderRegistry.a(InputStream.class, new StreamEncoder(arrayPool));
        resourceDecoderRegistry.a(byteBufferBitmapDecoder, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.a(streamBitmapDecoder, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            ParcelFileDescriptorBitmapDecoder parcelFileDescriptorBitmapDecoder = new ParcelFileDescriptorBitmapDecoder(downsampler);
            cls = ParcelFileDescriptor.class;
            registry.a(parcelFileDescriptorBitmapDecoder, cls, Bitmap.class, "Bitmap");
        }
        registry.a(VideoDecoder.c(bitmapPool), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        resourceDecoderRegistry.a(videoDecoderF, cls, Bitmap.class, "Bitmap");
        UnitModelLoader.Factory factory = UnitModelLoader.Factory.f13879a;
        modelLoaderRegistry.a(Bitmap.class, Bitmap.class, factory);
        resourceDecoderRegistry.a(new UnitBitmapDecoder(), Bitmap.class, Bitmap.class, "Bitmap");
        resourceEncoderRegistry.a(Bitmap.class, bitmapEncoder);
        resourceDecoderRegistry.a(new BitmapDrawableDecoder(resources, byteBufferBitmapDecoder), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        resourceDecoderRegistry.a(new BitmapDrawableDecoder(resources, streamBitmapDecoder), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        resourceDecoderRegistry.a(new BitmapDrawableDecoder(resources, videoDecoderF), cls, BitmapDrawable.class, "BitmapDrawable");
        resourceEncoderRegistry.a(BitmapDrawable.class, new BitmapDrawableEncoder(bitmapPool, bitmapEncoder));
        resourceDecoderRegistry.a(new StreamGifDecoder(arrayListB, byteBufferGifDecoder, arrayPool), InputStream.class, GifDrawable.class, "Animation");
        resourceDecoderRegistry.a(byteBufferGifDecoder, ByteBuffer.class, GifDrawable.class, "Animation");
        resourceEncoderRegistry.a(GifDrawable.class, new GifDrawableEncoder());
        modelLoaderRegistry.a(GifDecoder.class, GifDecoder.class, factory);
        resourceDecoderRegistry.a(new GifFrameResourceDecoder(bitmapPool), GifDecoder.class, Bitmap.class, "Bitmap");
        registry.a(resourceDrawableDecoder, Uri.class, Drawable.class, "legacy_append");
        registry.a(new ResourceBitmapDecoder(resourceDrawableDecoder, bitmapPool), Uri.class, Bitmap.class, "legacy_append");
        registry.d(new ByteBufferRewinder.Factory());
        modelLoaderRegistry.a(File.class, ByteBuffer.class, new ByteBufferFileLoader.Factory());
        modelLoaderRegistry.a(File.class, InputStream.class, new FileLoader.StreamFactory());
        registry.a(new FileDecoder(), File.class, File.class, "legacy_append");
        modelLoaderRegistry.a(File.class, cls, new FileLoader.FileDescriptorFactory());
        modelLoaderRegistry.a(File.class, File.class, factory);
        registry.d(new InputStreamRewinder.Factory(arrayPool));
        if (!"robolectric".equals(str)) {
            registry.d(new ParcelFileDescriptorRewinder.Factory());
        }
        ModelLoaderFactory modelLoaderFactoryE = DirectResourceLoader.e(applicationContext);
        ModelLoaderFactory modelLoaderFactoryC = DirectResourceLoader.c(applicationContext);
        ModelLoaderFactory modelLoaderFactoryD = DirectResourceLoader.d(applicationContext);
        Class cls2 = Integer.TYPE;
        modelLoaderRegistry.a(cls2, InputStream.class, modelLoaderFactoryE);
        modelLoaderRegistry.a(Integer.class, InputStream.class, modelLoaderFactoryE);
        modelLoaderRegistry.a(cls2, AssetFileDescriptor.class, modelLoaderFactoryC);
        modelLoaderRegistry.a(Integer.class, AssetFileDescriptor.class, modelLoaderFactoryC);
        modelLoaderRegistry.a(cls2, Drawable.class, modelLoaderFactoryD);
        modelLoaderRegistry.a(Integer.class, Drawable.class, modelLoaderFactoryD);
        modelLoaderRegistry.a(Uri.class, InputStream.class, ResourceUriLoader.d(applicationContext));
        registry.f13761a.a(Uri.class, AssetFileDescriptor.class, ResourceUriLoader.c(applicationContext));
        ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
        ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory = new ResourceLoader.AssetFileDescriptorFactory(resources);
        ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
        modelLoaderRegistry.a(Integer.class, Uri.class, uriFactory);
        modelLoaderRegistry.a(cls2, Uri.class, uriFactory);
        modelLoaderRegistry.a(Integer.class, AssetFileDescriptor.class, assetFileDescriptorFactory);
        modelLoaderRegistry.a(cls2, AssetFileDescriptor.class, assetFileDescriptorFactory);
        modelLoaderRegistry.a(Integer.class, InputStream.class, streamFactory);
        registry.f13761a.a(cls2, InputStream.class, streamFactory);
        modelLoaderRegistry.a(String.class, InputStream.class, new DataUrlLoader.StreamFactory());
        modelLoaderRegistry.a(Uri.class, InputStream.class, new DataUrlLoader.StreamFactory());
        modelLoaderRegistry.a(String.class, InputStream.class, new StringLoader.StreamFactory());
        modelLoaderRegistry.a(String.class, cls, new StringLoader.FileDescriptorFactory());
        modelLoaderRegistry.a(String.class, AssetFileDescriptor.class, new StringLoader.AssetFileDescriptorFactory());
        modelLoaderRegistry.a(Uri.class, InputStream.class, new AssetUriLoader.StreamFactory(applicationContext.getAssets()));
        modelLoaderRegistry.a(Uri.class, AssetFileDescriptor.class, new AssetUriLoader.FileDescriptorFactory(applicationContext.getAssets()));
        modelLoaderRegistry.a(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.Factory(applicationContext));
        registry.f13761a.a(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.Factory(applicationContext));
        if (i >= 29) {
            registry.f13761a.a(Uri.class, InputStream.class, new QMediaStoreUriLoader.InputStreamFactory(applicationContext));
            registry.f13761a.a(Uri.class, cls, new QMediaStoreUriLoader.FileDescriptorFactory(applicationContext));
        }
        modelLoaderRegistry.a(Uri.class, InputStream.class, new UriLoader.StreamFactory(contentResolver));
        modelLoaderRegistry.a(Uri.class, cls, new UriLoader.FileDescriptorFactory(contentResolver));
        modelLoaderRegistry.a(Uri.class, AssetFileDescriptor.class, new UriLoader.AssetFileDescriptorFactory(contentResolver));
        modelLoaderRegistry.a(Uri.class, InputStream.class, new UrlUriLoader.StreamFactory());
        modelLoaderRegistry.a(URL.class, InputStream.class, new UrlLoader.StreamFactory());
        modelLoaderRegistry.a(Uri.class, File.class, new MediaStoreFileLoader.Factory(applicationContext));
        modelLoaderRegistry.a(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory());
        modelLoaderRegistry.a(byte[].class, ByteBuffer.class, new ByteArrayLoader.ByteBufferFactory());
        modelLoaderRegistry.a(byte[].class, InputStream.class, new ByteArrayLoader.StreamFactory());
        modelLoaderRegistry.a(Uri.class, Uri.class, factory);
        modelLoaderRegistry.a(Drawable.class, Drawable.class, factory);
        registry.a(new UnitDrawableDecoder(), Drawable.class, Drawable.class, "legacy_append");
        transcoderRegistry.c(Bitmap.class, BitmapDrawable.class, new BitmapDrawableTranscoder(resources));
        transcoderRegistry.c(Bitmap.class, byte[].class, bitmapBytesTranscoder);
        transcoderRegistry.c(Drawable.class, byte[].class, new DrawableBytesTranscoder(bitmapPool, bitmapBytesTranscoder, gifDrawableBytesTranscoder));
        registry.f.c(GifDrawable.class, byte[].class, gifDrawableBytesTranscoder);
        VideoDecoder videoDecoderD = VideoDecoder.d(bitmapPool);
        registry.a(videoDecoderD, ByteBuffer.class, Bitmap.class, "legacy_append");
        registry.a(new BitmapDrawableDecoder(resources, videoDecoderD), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GlideModule glideModule = (GlideModule) it.next();
            try {
                glideModule.a(registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(glideModule.getClass().getName()), e);
            }
        }
        return registry;
    }
}
