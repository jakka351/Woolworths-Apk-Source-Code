package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class ResourceUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13873a;
    public final ModelLoader b;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13874a;

        public AssetFileDescriptorFactory(Context context) {
            this.f13874a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f13874a, multiModelLoaderFactory.b(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13875a;

        public InputStreamFactory(Context context) {
            this.f13875a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f13875a, multiModelLoaderFactory.b(Integer.class, InputStream.class));
        }
    }

    public ResourceUriLoader(Context context, ModelLoader modelLoader) {
        this.f13873a = context.getApplicationContext();
        this.b = modelLoader;
    }

    public static ModelLoaderFactory c(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public static ModelLoaderFactory d(Context context) {
        return new InputStreamFactory(context);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) throws NumberFormatException {
        Uri uri = (Uri) obj;
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        ModelLoader modelLoader = this.b;
        if (size == 1) {
            try {
                int i3 = Integer.parseInt(uri.getPathSegments().get(0));
                if (i3 != 0) {
                    return modelLoader.a(Integer.valueOf(i3), i, i2, options);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                    return null;
                }
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.f13873a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return modelLoader.a(Integer.valueOf(identifier), i, i2, options);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "android.resource".equals(uri.getScheme()) && this.f13873a.getPackageName().equals(uri.getAuthority());
    }
}
