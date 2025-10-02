package coil.util;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import coil.decode.DataSource;
import coil.request.ViewTargetRequestManager;
import coil.size.Dimension;
import coil.size.Scale;
import com.woolworths.R;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: coil.util.-Utils, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Utils {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f13033a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    public static final Headers c = new Headers.Builder().e();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.util.-Utils$WhenMappings */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13034a;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DataSource dataSource = DataSource.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DataSource dataSource2 = DataSource.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DataSource dataSource3 = DataSource.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f13034a = iArr2;
            int[] iArr3 = new int[Scale.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Scale scale = Scale.d;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.D(str)) {
            return null;
        }
        String strE0 = StringsKt.e0(StringsKt.e0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.a0(JwtParser.SEPARATOR_CHAR, StringsKt.a0('/', strE0, strE0), ""));
    }

    public static final ViewTargetRequestManager c(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(R.id.coil_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(R.id.coil_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }

    public static final boolean d(Uri uri) {
        return Intrinsics.c(uri.getScheme(), "file") && Intrinsics.c((String) CollectionsKt.F(uri.getPathSegments()), "android_asset");
    }

    public static final int e(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f13026a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
