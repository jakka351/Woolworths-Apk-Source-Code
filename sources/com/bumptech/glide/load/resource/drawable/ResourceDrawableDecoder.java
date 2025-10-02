package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;

/* loaded from: classes.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    public static final Option b = new Option("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, Option.e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13935a;

    public ResourceDrawableDecoder(Context context) {
        this.f13935a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ Resource b(Object obj, int i, int i2, Options options) {
        return c((Uri) obj, options);
    }

    public final Resource c(Uri uri, Options options) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f13935a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(a.m(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(a.m(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(a.m(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(a.m(uri, "Unrecognized Uri format: "), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) options.b(b) : null;
        return NonOwnedDrawableResource.b(theme == null ? DrawableDecoderCompat.b(context, contextCreatePackageContext, identifier) : DrawableDecoderCompat.a(context, identifier, theme));
    }
}
